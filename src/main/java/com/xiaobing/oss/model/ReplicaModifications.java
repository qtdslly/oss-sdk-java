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
 * A filter that you can specify for selection for modifications on replicas. Amazon S3 doesn't replicate replica
 * modifications by default. In the latest version of replication configuration (when <code>Filter</code> is specified),
 * you can specify this element and set the status to <code>Enabled</code> to replicate modifications on replicas.
 * </p>
 * <note>
 * <p>
 * If you don't specify the <code>Filter</code> element, Amazon S3 assumes that the replication configuration is the
 * earlier version, V1. In the earlier version, this element is not allowed.
 * </p>
 * </note>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicaModifications implements SdkPojo, Serializable,
        ToCopyableBuilder<ReplicaModifications.Builder, ReplicaModifications> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(ReplicaModifications::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STATUS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String status;

    private ReplicaModifications(BuilderImpl builder) {
        this.status = builder.status;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates modifications on replicas.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicaModificationsStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether Amazon S3 replicates modifications on replicas.
     * @see ReplicaModificationsStatus
     */
    public final ReplicaModificationsStatus status() {
        return ReplicaModificationsStatus.fromValue(status);
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates modifications on replicas.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicaModificationsStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether Amazon S3 replicates modifications on replicas.
     * @see ReplicaModificationsStatus
     */
    public final String statusAsString() {
        return status;
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
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
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
        if (!(obj instanceof ReplicaModifications)) {
            return false;
        }
        ReplicaModifications other = (ReplicaModifications) obj;
        return Objects.equals(statusAsString(), other.statusAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicaModifications").add("Status", statusAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ReplicaModifications, T> g) {
        return obj -> g.apply((ReplicaModifications) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicaModifications> {
        /**
         * <p>
         * Specifies whether Amazon S3 replicates modifications on replicas.
         * </p>
         * 
         * @param status
         *        Specifies whether Amazon S3 replicates modifications on replicas.
         * @see ReplicaModificationsStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicaModificationsStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Specifies whether Amazon S3 replicates modifications on replicas.
         * </p>
         * 
         * @param status
         *        Specifies whether Amazon S3 replicates modifications on replicas.
         * @see ReplicaModificationsStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicaModificationsStatus
         */
        Builder status(ReplicaModificationsStatus status);
    }

    static final class BuilderImpl implements Builder {
        private String status;

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicaModifications model) {
            status(model.status);
        }

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        @Override
        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public final Builder status(ReplicaModificationsStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        @Override
        public ReplicaModifications build() {
            return new ReplicaModifications(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
