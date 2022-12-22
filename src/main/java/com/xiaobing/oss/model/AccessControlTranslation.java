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
 * A container for information about access control for replicas.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AccessControlTranslation implements SdkPojo, Serializable,
        ToCopyableBuilder<AccessControlTranslation.Builder, AccessControlTranslation> {
    private static final SdkField<String> OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Owner")
            .getter(getter(AccessControlTranslation::ownerAsString))
            .setter(setter(Builder::owner))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OWNER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String owner;

    private AccessControlTranslation(BuilderImpl builder) {
        this.owner = builder.owner;
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket replication</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #owner} will return
     * {@link OwnerOverride#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #ownerAsString}.
     * </p>
     * 
     * @return Specifies the replica ownership. For default and valid values, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
     *         replication</a> in the <i>Amazon S3 API Reference</i>.
     * @see OwnerOverride
     */
    public final OwnerOverride owner() {
        return OwnerOverride.fromValue(owner);
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket replication</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #owner} will return
     * {@link OwnerOverride#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #ownerAsString}.
     * </p>
     * 
     * @return Specifies the replica ownership. For default and valid values, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
     *         replication</a> in the <i>Amazon S3 API Reference</i>.
     * @see OwnerOverride
     */
    public final String ownerAsString() {
        return owner;
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
        hashCode = 31 * hashCode + Objects.hashCode(ownerAsString());
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
        if (!(obj instanceof AccessControlTranslation)) {
            return false;
        }
        AccessControlTranslation other = (AccessControlTranslation) obj;
        return Objects.equals(ownerAsString(), other.ownerAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AccessControlTranslation").add("Owner", ownerAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Owner":
            return Optional.ofNullable(clazz.cast(ownerAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AccessControlTranslation, T> g) {
        return obj -> g.apply((AccessControlTranslation) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AccessControlTranslation> {
        /**
         * <p>
         * Specifies the replica ownership. For default and valid values, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
         * replication</a> in the <i>Amazon S3 API Reference</i>.
         * </p>
         * 
         * @param owner
         *        Specifies the replica ownership. For default and valid values, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
         *        replication</a> in the <i>Amazon S3 API Reference</i>.
         * @see OwnerOverride
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see OwnerOverride
         */
        Builder owner(String owner);

        /**
         * <p>
         * Specifies the replica ownership. For default and valid values, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
         * replication</a> in the <i>Amazon S3 API Reference</i>.
         * </p>
         * 
         * @param owner
         *        Specifies the replica ownership. For default and valid values, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT bucket
         *        replication</a> in the <i>Amazon S3 API Reference</i>.
         * @see OwnerOverride
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see OwnerOverride
         */
        Builder owner(OwnerOverride owner);
    }

    static final class BuilderImpl implements Builder {
        private String owner;

        private BuilderImpl() {
        }

        private BuilderImpl(AccessControlTranslation model) {
            owner(model.owner);
        }

        public final String getOwner() {
            return owner;
        }

        public final void setOwner(String owner) {
            this.owner = owner;
        }

        @Override
        public final Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        @Override
        public final Builder owner(OwnerOverride owner) {
            this.owner(owner == null ? null : owner.toString());
            return this;
        }

        @Override
        public AccessControlTranslation build() {
            return new AccessControlTranslation(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
