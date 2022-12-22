/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.xiaobing.oss.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * A container that describes additional filters for identifying the source objects that you want to replicate. You can
 * choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you
 * can specify for objects created with server-side encryption using a customer managed key stored in Amazon Web
 * Services Key Management Service (SSE-KMS).
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class SourceSelectionCriteria implements SdkPojo, Serializable,
        ToCopyableBuilder<SourceSelectionCriteria.Builder, SourceSelectionCriteria> {
    private static final SdkField<SseKmsEncryptedObjects> SSE_KMS_ENCRYPTED_OBJECTS_FIELD = SdkField
            .<SseKmsEncryptedObjects> builder(MarshallingType.SDK_POJO)
            .memberName("SseKmsEncryptedObjects")
            .getter(getter(SourceSelectionCriteria::sseKmsEncryptedObjects))
            .setter(setter(Builder::sseKmsEncryptedObjects))
            .constructor(SseKmsEncryptedObjects::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SseKmsEncryptedObjects")
                    .unmarshallLocationName("SseKmsEncryptedObjects").build()).build();

    private static final SdkField<ReplicaModifications> REPLICA_MODIFICATIONS_FIELD = SdkField
            .<ReplicaModifications> builder(MarshallingType.SDK_POJO)
            .memberName("ReplicaModifications")
            .getter(getter(SourceSelectionCriteria::replicaModifications))
            .setter(setter(Builder::replicaModifications))
            .constructor(ReplicaModifications::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplicaModifications")
                    .unmarshallLocationName("ReplicaModifications").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(
            SSE_KMS_ENCRYPTED_OBJECTS_FIELD, REPLICA_MODIFICATIONS_FIELD));

    private static final long serialVersionUID = 1L;

    private final SseKmsEncryptedObjects sseKmsEncryptedObjects;

    private final ReplicaModifications replicaModifications;

    private SourceSelectionCriteria(BuilderImpl builder) {
        this.sseKmsEncryptedObjects = builder.sseKmsEncryptedObjects;
        this.replicaModifications = builder.replicaModifications;
    }

    /**
     * <p>
     * A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services KMS.
     * If you include <code>SourceSelectionCriteria</code> in the replication configuration, this element is required.
     * </p>
     * 
     * @return A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web
     *         Services KMS. If you include <code>SourceSelectionCriteria</code> in the replication configuration, this
     *         element is required.
     */
    public final SseKmsEncryptedObjects sseKmsEncryptedObjects() {
        return sseKmsEncryptedObjects;
    }

    /**
     * <p>
     * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica
     * modifications by default. In the latest version of replication configuration (when <code>Filter</code> is
     * specified), you can specify this element and set the status to <code>Enabled</code> to replicate modifications on
     * replicas.
     * </p>
     * <note>
     * <p>
     * If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication configuration is the
     * earlier version, V1. In the earlier version, this element is not allowed
     * </p>
     * </note>
     * 
     * @return A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate
     *         replica modifications by default. In the latest version of replication configuration (when
     *         <code>Filter</code> is specified), you can specify this element and set the status to
     *         <code>Enabled</code> to replicate modifications on replicas. </p> <note>
     *         <p>
     *         If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication
     *         configuration is the earlier version, V1. In the earlier version, this element is not allowed
     *         </p>
     */
    public final ReplicaModifications replicaModifications() {
        return replicaModifications;
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public static Class<? extends Builder> serializableBuilderClass() {
        return BuilderImpl.class;
    }

    @Override
    public final int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + Objects.hashCode(sseKmsEncryptedObjects());
        hashCode = 31 * hashCode + Objects.hashCode(replicaModifications());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SourceSelectionCriteria)) {
            return false;
        }
        SourceSelectionCriteria other = (SourceSelectionCriteria) obj;
        return Objects.equals(sseKmsEncryptedObjects(), other.sseKmsEncryptedObjects())
                && Objects.equals(replicaModifications(), other.replicaModifications());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("SourceSelectionCriteria").add("SseKmsEncryptedObjects", sseKmsEncryptedObjects())
                .add("ReplicaModifications", replicaModifications()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "SseKmsEncryptedObjects":
            return Optional.ofNullable(clazz.cast(sseKmsEncryptedObjects()));
        case "ReplicaModifications":
            return Optional.ofNullable(clazz.cast(replicaModifications()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<SourceSelectionCriteria, T> g) {
        return obj -> g.apply((SourceSelectionCriteria) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, SourceSelectionCriteria> {
        /**
         * <p>
         * A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services
         * KMS. If you include <code>SourceSelectionCriteria</code> in the replication configuration, this element is
         * required.
         * </p>
         * 
         * @param sseKmsEncryptedObjects
         *        A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web
         *        Services KMS. If you include <code>SourceSelectionCriteria</code> in the replication configuration,
         *        this element is required.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects);

        /**
         * <p>
         * A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services
         * KMS. If you include <code>SourceSelectionCriteria</code> in the replication configuration, this element is
         * required.
         * </p>
         * This is a convenience method that creates an instance of the {@link SseKmsEncryptedObjects.Builder} avoiding
         * the need to create one manually via {@link SseKmsEncryptedObjects#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link SseKmsEncryptedObjects.Builder#build()} is called immediately and
         * its result is passed to {@link #sseKmsEncryptedObjects(SseKmsEncryptedObjects)}.
         * 
         * @param sseKmsEncryptedObjects
         *        a consumer that will call methods on {@link SseKmsEncryptedObjects.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #sseKmsEncryptedObjects(SseKmsEncryptedObjects)
         */
        default Builder sseKmsEncryptedObjects(Consumer<SseKmsEncryptedObjects.Builder> sseKmsEncryptedObjects) {
            return sseKmsEncryptedObjects(SseKmsEncryptedObjects.builder().applyMutation(sseKmsEncryptedObjects).build());
        }

        /**
         * <p>
         * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate
         * replica modifications by default. In the latest version of replication configuration (when
         * <code>Filter</code> is specified), you can specify this element and set the status to <code>Enabled</code> to
         * replicate modifications on replicas.
         * </p>
         * <note>
         * <p>
         * If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication configuration is
         * the earlier version, V1. In the earlier version, this element is not allowed
         * </p>
         * </note>
         * 
         * @param replicaModifications
         *        A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't
         *        replicate replica modifications by default. In the latest version of replication configuration (when
         *        <code>Filter</code> is specified), you can specify this element and set the status to
         *        <code>Enabled</code> to replicate modifications on replicas. </p> <note>
         *        <p>
         *        If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication
         *        configuration is the earlier version, V1. In the earlier version, this element is not allowed
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replicaModifications(ReplicaModifications replicaModifications);

        /**
         * <p>
         * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate
         * replica modifications by default. In the latest version of replication configuration (when
         * <code>Filter</code> is specified), you can specify this element and set the status to <code>Enabled</code> to
         * replicate modifications on replicas.
         * </p>
         * <note>
         * <p>
         * If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication configuration is
         * the earlier version, V1. In the earlier version, this element is not allowed
         * </p>
         * </note> This is a convenience method that creates an instance of the {@link ReplicaModifications.Builder}
         * avoiding the need to create one manually via {@link ReplicaModifications#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicaModifications.Builder#build()} is called immediately and
         * its result is passed to {@link #replicaModifications(ReplicaModifications)}.
         * 
         * @param replicaModifications
         *        a consumer that will call methods on {@link ReplicaModifications.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #replicaModifications(ReplicaModifications)
         */
        default Builder replicaModifications(Consumer<ReplicaModifications.Builder> replicaModifications) {
            return replicaModifications(ReplicaModifications.builder().applyMutation(replicaModifications).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private SseKmsEncryptedObjects sseKmsEncryptedObjects;

        private ReplicaModifications replicaModifications;

        private BuilderImpl() {
        }

        private BuilderImpl(SourceSelectionCriteria model) {
            sseKmsEncryptedObjects(model.sseKmsEncryptedObjects);
            replicaModifications(model.replicaModifications);
        }

        public final SseKmsEncryptedObjects.Builder getSseKmsEncryptedObjects() {
            return sseKmsEncryptedObjects != null ? sseKmsEncryptedObjects.toBuilder() : null;
        }

        public final void setSseKmsEncryptedObjects(SseKmsEncryptedObjects.BuilderImpl sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects != null ? sseKmsEncryptedObjects.build() : null;
        }

        @Override
        public final Builder sseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        public final ReplicaModifications.Builder getReplicaModifications() {
            return replicaModifications != null ? replicaModifications.toBuilder() : null;
        }

        public final void setReplicaModifications(ReplicaModifications.BuilderImpl replicaModifications) {
            this.replicaModifications = replicaModifications != null ? replicaModifications.build() : null;
        }

        @Override
        public final Builder replicaModifications(ReplicaModifications replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }

        @Override
        public SourceSelectionCriteria build() {
            return new SourceSelectionCriteria(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
