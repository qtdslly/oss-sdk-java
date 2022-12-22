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
public final class PutBucketAccelerateConfigurationRequest extends S3Request implements
        ToCopyableBuilder<PutBucketAccelerateConfigurationRequest.Builder, PutBucketAccelerateConfigurationRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketAccelerateConfigurationRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<AccelerateConfiguration> ACCELERATE_CONFIGURATION_FIELD = SdkField
            .<AccelerateConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("AccelerateConfiguration")
            .getter(getter(PutBucketAccelerateConfigurationRequest::accelerateConfiguration))
            .setter(setter(Builder::accelerateConfiguration))
            .constructor(AccelerateConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccelerateConfiguration")
                    .unmarshallLocationName("AccelerateConfiguration").build(), PayloadTrait.create()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketAccelerateConfigurationRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(PutBucketAccelerateConfigurationRequest::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-sdk-checksum-algorithm")
                    .unmarshallLocationName("x-amz-sdk-checksum-algorithm").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD,
            ACCELERATE_CONFIGURATION_FIELD, EXPECTED_BUCKET_OWNER_FIELD, CHECKSUM_ALGORITHM_FIELD));

    private final String bucket;

    private final AccelerateConfiguration accelerateConfiguration;

    private final String expectedBucketOwner;

    private final String checksumAlgorithm;

    private PutBucketAccelerateConfigurationRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.accelerateConfiguration = builder.accelerateConfiguration;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.checksumAlgorithm = builder.checksumAlgorithm;
    }

    /**
     * <p>
     * The name of the bucket for which the accelerate configuration is set.
     * </p>
     * 
     * @return The name of the bucket for which the accelerate configuration is set.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * Container for setting the transfer acceleration state.
     * </p>
     * 
     * @return Container for setting the transfer acceleration state.
     */
    public final AccelerateConfiguration accelerateConfiguration() {
        return accelerateConfiguration;
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
     * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
     * provide any additional functionality if not using the SDK. When sending this header, there must be a
     * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3 fails
     * the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code> parameter.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm used to create the checksum for the object when using the SDK. This header will
     *         not provide any additional functionality if not using the SDK. When sending this header, there must be a
     *         corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
     *         fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
     *         parameter.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
     * provide any additional functionality if not using the SDK. When sending this header, there must be a
     * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3 fails
     * the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code> parameter.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm used to create the checksum for the object when using the SDK. This header will
     *         not provide any additional functionality if not using the SDK. When sending this header, there must be a
     *         corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
     *         fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
     *         parameter.
     * @see ChecksumAlgorithm
     */
    public final String checksumAlgorithmAsString() {
        return checksumAlgorithm;
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
        hashCode = 31 * hashCode + Objects.hashCode(accelerateConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
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
        if (!(obj instanceof PutBucketAccelerateConfigurationRequest)) {
            return false;
        }
        PutBucketAccelerateConfigurationRequest other = (PutBucketAccelerateConfigurationRequest) obj;
        return Objects.equals(bucket(), other.bucket())
                && Objects.equals(accelerateConfiguration(), other.accelerateConfiguration())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketAccelerateConfigurationRequest").add("Bucket", bucket())
                .add("AccelerateConfiguration", accelerateConfiguration()).add("ExpectedBucketOwner", expectedBucketOwner())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "AccelerateConfiguration":
            return Optional.ofNullable(clazz.cast(accelerateConfiguration()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketAccelerateConfigurationRequest, T> g) {
        return obj -> g.apply((PutBucketAccelerateConfigurationRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo,
            CopyableBuilder<Builder, PutBucketAccelerateConfigurationRequest> {
        /**
         * <p>
         * The name of the bucket for which the accelerate configuration is set.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket for which the accelerate configuration is set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * Container for setting the transfer acceleration state.
         * </p>
         * 
         * @param accelerateConfiguration
         *        Container for setting the transfer acceleration state.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accelerateConfiguration(AccelerateConfiguration accelerateConfiguration);

        /**
         * <p>
         * Container for setting the transfer acceleration state.
         * </p>
         * This is a convenience method that creates an instance of the {@link AccelerateConfiguration.Builder} avoiding
         * the need to create one manually via {@link AccelerateConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AccelerateConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #accelerateConfiguration(AccelerateConfiguration)}.
         * 
         * @param accelerateConfiguration
         *        a consumer that will call methods on {@link AccelerateConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #accelerateConfiguration(AccelerateConfiguration)
         */
        default Builder accelerateConfiguration(Consumer<AccelerateConfiguration.Builder> accelerateConfiguration) {
            return accelerateConfiguration(AccelerateConfiguration.builder().applyMutation(accelerateConfiguration).build());
        }

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
         * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
         * provide any additional functionality if not using the SDK. When sending this header, there must be a
         * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
         * fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         * parameter.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm used to create the checksum for the object when using the SDK. This header
         *        will not provide any additional functionality if not using the SDK. When sending this header, there
         *        must be a corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent.
         *        Otherwise, Amazon S3 fails the request with the HTTP status code <code>400 Bad Request</code>. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         *        parameter.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
         * provide any additional functionality if not using the SDK. When sending this header, there must be a
         * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
         * fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         * parameter.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm used to create the checksum for the object when using the SDK. This header
         *        will not provide any additional functionality if not using the SDK. When sending this header, there
         *        must be a corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent.
         *        Otherwise, Amazon S3 fails the request with the HTTP status code <code>400 Bad Request</code>. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         *        parameter.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private AccelerateConfiguration accelerateConfiguration;

        private String expectedBucketOwner;

        private String checksumAlgorithm;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketAccelerateConfigurationRequest model) {
            super(model);
            bucket(model.bucket);
            accelerateConfiguration(model.accelerateConfiguration);
            expectedBucketOwner(model.expectedBucketOwner);
            checksumAlgorithm(model.checksumAlgorithm);
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

        public final AccelerateConfiguration.Builder getAccelerateConfiguration() {
            return accelerateConfiguration != null ? accelerateConfiguration.toBuilder() : null;
        }

        public final void setAccelerateConfiguration(AccelerateConfiguration.BuilderImpl accelerateConfiguration) {
            this.accelerateConfiguration = accelerateConfiguration != null ? accelerateConfiguration.build() : null;
        }

        @Override
        public final Builder accelerateConfiguration(AccelerateConfiguration accelerateConfiguration) {
            this.accelerateConfiguration = accelerateConfiguration;
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

        public final String getChecksumAlgorithm() {
            return checksumAlgorithm;
        }

        public final void setChecksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
        }

        @Override
        public final Builder checksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
            return this;
        }

        @Override
        public final Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
            this.checksumAlgorithm(checksumAlgorithm == null ? null : checksumAlgorithm.toString());
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
        public PutBucketAccelerateConfigurationRequest build() {
            return new PutBucketAccelerateConfigurationRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
