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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.exception.AwsErrorDetails;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Object is archived and inaccessible until restored.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InvalidObjectStateException extends S3Exception implements
        ToCopyableBuilder<InvalidObjectStateException.Builder, InvalidObjectStateException> {
    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(InvalidObjectStateException::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<String> ACCESS_TIER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AccessTier")
            .getter(getter(InvalidObjectStateException::accessTierAsString))
            .setter(setter(Builder::accessTier))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessTier")
                    .unmarshallLocationName("AccessTier").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STORAGE_CLASS_FIELD,
            ACCESS_TIER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String storageClass;

    private final String accessTier;

    private InvalidObjectStateException(BuilderImpl builder) {
        super(builder);
        this.storageClass = builder.storageClass;
        this.accessTier = builder.accessTier;
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

    /**
     * Returns the value of the StorageClass property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The value of the StorageClass property for this object.
     * @see StorageClass
     */
    public StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * Returns the value of the StorageClass property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The value of the StorageClass property for this object.
     * @see StorageClass
     */
    public String storageClassAsString() {
        return storageClass;
    }

    /**
     * Returns the value of the AccessTier property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #accessTier} will
     * return {@link IntelligentTieringAccessTier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #accessTierAsString}.
     * </p>
     * 
     * @return The value of the AccessTier property for this object.
     * @see IntelligentTieringAccessTier
     */
    public IntelligentTieringAccessTier accessTier() {
        return IntelligentTieringAccessTier.fromValue(accessTier);
    }

    /**
     * Returns the value of the AccessTier property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #accessTier} will
     * return {@link IntelligentTieringAccessTier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #accessTierAsString}.
     * </p>
     * 
     * @return The value of the AccessTier property for this object.
     * @see IntelligentTieringAccessTier
     */
    public String accessTierAsString() {
        return accessTier;
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InvalidObjectStateException, T> g) {
        return obj -> g.apply((InvalidObjectStateException) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InvalidObjectStateException>, S3Exception.Builder {
        /**
         * Sets the value of the StorageClass property for this object.
         *
         * @param storageClass
         *        The new value for the StorageClass property for this object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * Sets the value of the StorageClass property for this object.
         *
         * @param storageClass
         *        The new value for the StorageClass property for this object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

        /**
         * Sets the value of the AccessTier property for this object.
         *
         * @param accessTier
         *        The new value for the AccessTier property for this object.
         * @see IntelligentTieringAccessTier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringAccessTier
         */
        Builder accessTier(String accessTier);

        /**
         * Sets the value of the AccessTier property for this object.
         *
         * @param accessTier
         *        The new value for the AccessTier property for this object.
         * @see IntelligentTieringAccessTier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringAccessTier
         */
        Builder accessTier(IntelligentTieringAccessTier accessTier);

        @Override
        Builder awsErrorDetails(AwsErrorDetails awsErrorDetails);

        @Override
        Builder message(String message);

        @Override
        Builder requestId(String requestId);

        @Override
        Builder statusCode(int statusCode);

        @Override
        Builder cause(Throwable cause);
    }

    static final class BuilderImpl extends S3Exception.BuilderImpl implements Builder {
        private String storageClass;

        private String accessTier;

        private BuilderImpl() {
        }

        private BuilderImpl(InvalidObjectStateException model) {
            super(model);
            storageClass(model.storageClass);
            accessTier(model.accessTier);
        }

        public final String getStorageClass() {
            return storageClass;
        }

        public final void setStorageClass(String storageClass) {
            this.storageClass = storageClass;
        }

        @Override
        public final Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public final Builder storageClass(StorageClass storageClass) {
            this.storageClass(storageClass == null ? null : storageClass.toString());
            return this;
        }

        public final String getAccessTier() {
            return accessTier;
        }

        public final void setAccessTier(String accessTier) {
            this.accessTier = accessTier;
        }

        @Override
        public final Builder accessTier(String accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        @Override
        public final Builder accessTier(IntelligentTieringAccessTier accessTier) {
            this.accessTier(accessTier == null ? null : accessTier.toString());
            return this;
        }

        @Override
        public BuilderImpl awsErrorDetails(AwsErrorDetails awsErrorDetails) {
            this.awsErrorDetails = awsErrorDetails;
            return this;
        }

        @Override
        public BuilderImpl message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public BuilderImpl requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        @Override
        public BuilderImpl statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        @Override
        public BuilderImpl cause(Throwable cause) {
            this.cause = cause;
            return this;
        }

        @Override
        public InvalidObjectStateException build() {
            return new InvalidObjectStateException(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
