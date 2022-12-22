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
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetBucketVersioningResponse extends S3Response implements
        ToCopyableBuilder<GetBucketVersioningResponse.Builder, GetBucketVersioningResponse> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(GetBucketVersioningResponse::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<String> MFA_DELETE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("MFADelete")
            .getter(getter(GetBucketVersioningResponse::mfaDeleteAsString))
            .setter(setter(Builder::mfaDelete))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MfaDelete")
                    .unmarshallLocationName("MfaDelete").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays
            .asList(STATUS_FIELD, MFA_DELETE_FIELD));

    private final String status;

    private final String mfaDelete;

    private GetBucketVersioningResponse(BuilderImpl builder) {
        super(builder);
        this.status = builder.status;
        this.mfaDelete = builder.mfaDelete;
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link BucketVersioningStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return The versioning state of the bucket.
     * @see BucketVersioningStatus
     */
    public final BucketVersioningStatus status() {
        return BucketVersioningStatus.fromValue(status);
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link BucketVersioningStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return The versioning state of the bucket.
     * @see BucketVersioningStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if
     * the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not
     * returned.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mfaDelete} will
     * return {@link MFADeleteStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #mfaDeleteAsString}.
     * </p>
     * 
     * @return Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only
     *         returned if the bucket has been configured with MFA delete. If the bucket has never been so configured,
     *         this element is not returned.
     * @see MFADeleteStatus
     */
    public final MFADeleteStatus mfaDelete() {
        return MFADeleteStatus.fromValue(mfaDelete);
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if
     * the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not
     * returned.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mfaDelete} will
     * return {@link MFADeleteStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #mfaDeleteAsString}.
     * </p>
     * 
     * @return Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only
     *         returned if the bucket has been configured with MFA delete. If the bucket has never been so configured,
     *         this element is not returned.
     * @see MFADeleteStatus
     */
    public final String mfaDeleteAsString() {
        return mfaDelete;
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(mfaDeleteAsString());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof GetBucketVersioningResponse)) {
            return false;
        }
        GetBucketVersioningResponse other = (GetBucketVersioningResponse) obj;
        return Objects.equals(statusAsString(), other.statusAsString())
                && Objects.equals(mfaDeleteAsString(), other.mfaDeleteAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketVersioningResponse").add("Status", statusAsString())
                .add("MFADelete", mfaDeleteAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "MFADelete":
            return Optional.ofNullable(clazz.cast(mfaDeleteAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketVersioningResponse, T> g) {
        return obj -> g.apply((GetBucketVersioningResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketVersioningResponse> {
        /**
         * <p>
         * The versioning state of the bucket.
         * </p>
         * 
         * @param status
         *        The versioning state of the bucket.
         * @see BucketVersioningStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketVersioningStatus
         */
        Builder status(String status);

        /**
         * <p>
         * The versioning state of the bucket.
         * </p>
         * 
         * @param status
         *        The versioning state of the bucket.
         * @see BucketVersioningStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketVersioningStatus
         */
        Builder status(BucketVersioningStatus status);

        /**
         * <p>
         * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned
         * if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element
         * is not returned.
         * </p>
         * 
         * @param mfaDelete
         *        Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only
         *        returned if the bucket has been configured with MFA delete. If the bucket has never been so
         *        configured, this element is not returned.
         * @see MFADeleteStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see MFADeleteStatus
         */
        Builder mfaDelete(String mfaDelete);

        /**
         * <p>
         * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned
         * if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element
         * is not returned.
         * </p>
         * 
         * @param mfaDelete
         *        Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only
         *        returned if the bucket has been configured with MFA delete. If the bucket has never been so
         *        configured, this element is not returned.
         * @see MFADeleteStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see MFADeleteStatus
         */
        Builder mfaDelete(MFADeleteStatus mfaDelete);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String status;

        private String mfaDelete;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketVersioningResponse model) {
            super(model);
            status(model.status);
            mfaDelete(model.mfaDelete);
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
        public final Builder status(BucketVersioningStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final String getMfaDelete() {
            return mfaDelete;
        }

        public final void setMfaDelete(String mfaDelete) {
            this.mfaDelete = mfaDelete;
        }

        @Override
        public final Builder mfaDelete(String mfaDelete) {
            this.mfaDelete = mfaDelete;
            return this;
        }

        @Override
        public final Builder mfaDelete(MFADeleteStatus mfaDelete) {
            this.mfaDelete(mfaDelete == null ? null : mfaDelete.toString());
            return this;
        }

        @Override
        public GetBucketVersioningResponse build() {
            return new GetBucketVersioningResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
