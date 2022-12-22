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
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class PutBucketOwnershipControlsRequest extends S3Request implements
        ToCopyableBuilder<PutBucketOwnershipControlsRequest.Builder, PutBucketOwnershipControlsRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketOwnershipControlsRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> CONTENT_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentMD5")
            .getter(getter(PutBucketOwnershipControlsRequest::contentMD5))
            .setter(setter(Builder::contentMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-MD5")
                    .unmarshallLocationName("Content-MD5").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketOwnershipControlsRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<OwnershipControls> OWNERSHIP_CONTROLS_FIELD = SdkField
            .<OwnershipControls> builder(MarshallingType.SDK_POJO)
            .memberName("OwnershipControls")
            .getter(getter(PutBucketOwnershipControlsRequest::ownershipControls))
            .setter(setter(Builder::ownershipControls))
            .constructor(OwnershipControls::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OwnershipControls")
                    .unmarshallLocationName("OwnershipControls").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD,
            CONTENT_MD5_FIELD, EXPECTED_BUCKET_OWNER_FIELD, OWNERSHIP_CONTROLS_FIELD));

    private final String bucket;

    private final String contentMD5;

    private final String expectedBucketOwner;

    private final OwnershipControls ownershipControls;

    private PutBucketOwnershipControlsRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.contentMD5 = builder.contentMD5;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.ownershipControls = builder.ownershipControls;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose <code>OwnershipControls</code> you want to set.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket whose <code>OwnershipControls</code> you want to set.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The MD5 hash of the <code>OwnershipControls</code> request body.
     * </p>
     * <p>
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this
     * field is calculated automatically.
     * </p>
     * 
     * @return The MD5 hash of the <code>OwnershipControls</code> request body. </p>
     *         <p>
     *         For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
     *         this field is calculated automatically.
     */
    public final String contentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
     * with the HTTP status code <code>403 Forbidden</code> (access denied).
     * </p>
     * 
     * @return The account ID of the expected bucket owner. If the bucket is owned by a different account, the request
     *         fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     */
    public final String expectedBucketOwner() {
        return expectedBucketOwner;
    }

    /**
     * <p>
     * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you want to
     * apply to this Amazon S3 bucket.
     * </p>
     * 
     * @return The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you
     *         want to apply to this Amazon S3 bucket.
     */
    public final OwnershipControls ownershipControls() {
        return ownershipControls;
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
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(contentMD5());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(ownershipControls());
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
        if (!(obj instanceof PutBucketOwnershipControlsRequest)) {
            return false;
        }
        PutBucketOwnershipControlsRequest other = (PutBucketOwnershipControlsRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(contentMD5(), other.contentMD5())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(ownershipControls(), other.ownershipControls());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketOwnershipControlsRequest").add("Bucket", bucket()).add("ContentMD5", contentMD5())
                .add("ExpectedBucketOwner", expectedBucketOwner()).add("OwnershipControls", ownershipControls()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "ContentMD5":
            return Optional.ofNullable(clazz.cast(contentMD5()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "OwnershipControls":
            return Optional.ofNullable(clazz.cast(ownershipControls()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketOwnershipControlsRequest, T> g) {
        return obj -> g.apply((PutBucketOwnershipControlsRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, PutBucketOwnershipControlsRequest> {
        /**
         * <p>
         * The name of the Amazon S3 bucket whose <code>OwnershipControls</code> you want to set.
         * </p>
         * 
         * @param bucket
         *        The name of the Amazon S3 bucket whose <code>OwnershipControls</code> you want to set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The MD5 hash of the <code>OwnershipControls</code> request body.
         * </p>
         * <p>
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
         * this field is calculated automatically.
         * </p>
         * 
         * @param contentMD5
         *        The MD5 hash of the <code>OwnershipControls</code> request body. </p>
         *        <p>
         *        For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services
         *        SDKs, this field is calculated automatically.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentMD5(String contentMD5);

        /**
         * <p>
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
         * with the HTTP status code <code>403 Forbidden</code> (access denied).
         * </p>
         * 
         * @param expectedBucketOwner
         *        The account ID of the expected bucket owner. If the bucket is owned by a different account, the
         *        request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expectedBucketOwner(String expectedBucketOwner);

        /**
         * <p>
         * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you want
         * to apply to this Amazon S3 bucket.
         * </p>
         * 
         * @param ownershipControls
         *        The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that
         *        you want to apply to this Amazon S3 bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ownershipControls(OwnershipControls ownershipControls);

        /**
         * <p>
         * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you want
         * to apply to this Amazon S3 bucket.
         * </p>
         * This is a convenience method that creates an instance of the {@link OwnershipControls.Builder} avoiding the
         * need to create one manually via {@link OwnershipControls#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link OwnershipControls.Builder#build()} is called immediately and its
         * result is passed to {@link #ownershipControls(OwnershipControls)}.
         * 
         * @param ownershipControls
         *        a consumer that will call methods on {@link OwnershipControls.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #ownershipControls(OwnershipControls)
         */
        default Builder ownershipControls(Consumer<OwnershipControls.Builder> ownershipControls) {
            return ownershipControls(OwnershipControls.builder().applyMutation(ownershipControls).build());
        }

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String contentMD5;

        private String expectedBucketOwner;

        private OwnershipControls ownershipControls;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketOwnershipControlsRequest model) {
            super(model);
            bucket(model.bucket);
            contentMD5(model.contentMD5);
            expectedBucketOwner(model.expectedBucketOwner);
            ownershipControls(model.ownershipControls);
        }

        public final String getBucket() {
            return bucket;
        }

        public final void setBucket(String bucket) {
            this.bucket = bucket;
        }

        @Override
        public final Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public final String getContentMD5() {
            return contentMD5;
        }

        public final void setContentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
        }

        @Override
        public final Builder contentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
            return this;
        }

        public final String getExpectedBucketOwner() {
            return expectedBucketOwner;
        }

        public final void setExpectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
        }

        @Override
        public final Builder expectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        public final OwnershipControls.Builder getOwnershipControls() {
            return ownershipControls != null ? ownershipControls.toBuilder() : null;
        }

        public final void setOwnershipControls(OwnershipControls.BuilderImpl ownershipControls) {
            this.ownershipControls = ownershipControls != null ? ownershipControls.build() : null;
        }

        @Override
        public final Builder ownershipControls(OwnershipControls ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }

        @Override
        public Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration) {
            super.overrideConfiguration(overrideConfiguration);
            return this;
        }

        @Override
        public Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer) {
            super.overrideConfiguration(builderConsumer);
            return this;
        }

        @Override
        public PutBucketOwnershipControlsRequest build() {
            return new PutBucketOwnershipControlsRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
