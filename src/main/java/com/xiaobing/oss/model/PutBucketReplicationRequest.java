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
public final class PutBucketReplicationRequest extends S3Request implements
        ToCopyableBuilder<PutBucketReplicationRequest.Builder, PutBucketReplicationRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketReplicationRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> CONTENT_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentMD5")
            .getter(getter(PutBucketReplicationRequest::contentMD5))
            .setter(setter(Builder::contentMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-MD5")
                    .unmarshallLocationName("Content-MD5").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(PutBucketReplicationRequest::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-sdk-checksum-algorithm")
                    .unmarshallLocationName("x-amz-sdk-checksum-algorithm").build()).build();

    private static final SdkField<ReplicationConfiguration> REPLICATION_CONFIGURATION_FIELD = SdkField
            .<ReplicationConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("ReplicationConfiguration")
            .getter(getter(PutBucketReplicationRequest::replicationConfiguration))
            .setter(setter(Builder::replicationConfiguration))
            .constructor(ReplicationConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplicationConfiguration")
                    .unmarshallLocationName("ReplicationConfiguration").build(), PayloadTrait.create()).build();

    private static final SdkField<String> TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Token")
            .getter(getter(PutBucketReplicationRequest::token))
            .setter(setter(Builder::token))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-bucket-object-lock-token")
                    .unmarshallLocationName("x-amz-bucket-object-lock-token").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketReplicationRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD,
            CONTENT_MD5_FIELD, CHECKSUM_ALGORITHM_FIELD, REPLICATION_CONFIGURATION_FIELD, TOKEN_FIELD,
            EXPECTED_BUCKET_OWNER_FIELD));

    private final String bucket;

    private final String contentMD5;

    private final String checksumAlgorithm;

    private final ReplicationConfiguration replicationConfiguration;

    private final String token;

    private final String expectedBucketOwner;

    private PutBucketReplicationRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.contentMD5 = builder.contentMD5;
        this.checksumAlgorithm = builder.checksumAlgorithm;
        this.replicationConfiguration = builder.replicationConfiguration;
        this.token = builder.token;
        this.expectedBucketOwner = builder.expectedBucketOwner;
    }

    /**
     * <p>
     * The name of the bucket
     * </p>
     * 
     * @return The name of the bucket
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to
     * verify that the request body was not corrupted in transit. For more information, see <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
     * </p>
     * <p>
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this
     * field is calculated automatically.
     * </p>
     * 
     * @return The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check
     *         to verify that the request body was not corrupted in transit. For more information, see <a
     *         href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.</p>
     *         <p>
     *         For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
     *         this field is calculated automatically.
     */
    public final String contentMD5() {
        return contentMD5;
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

    /**
     * Returns the value of the ReplicationConfiguration property for this object.
     * 
     * @return The value of the ReplicationConfiguration property for this object.
     */
    public final ReplicationConfiguration replicationConfiguration() {
        return replicationConfiguration;
    }

    /**
     * <p>
     * A token to allow Object Lock to be enabled for an existing bucket.
     * </p>
     * 
     * @return A token to allow Object Lock to be enabled for an existing bucket.
     */
    public final String token() {
        return token;
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
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
        hashCode = 31 * hashCode + Objects.hashCode(replicationConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(token());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
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
        if (!(obj instanceof PutBucketReplicationRequest)) {
            return false;
        }
        PutBucketReplicationRequest other = (PutBucketReplicationRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(contentMD5(), other.contentMD5())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString())
                && Objects.equals(replicationConfiguration(), other.replicationConfiguration())
                && Objects.equals(token(), other.token()) && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketReplicationRequest").add("Bucket", bucket()).add("ContentMD5", contentMD5())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString())
                .add("ReplicationConfiguration", replicationConfiguration()).add("Token", token())
                .add("ExpectedBucketOwner", expectedBucketOwner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "ContentMD5":
            return Optional.ofNullable(clazz.cast(contentMD5()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
        case "ReplicationConfiguration":
            return Optional.ofNullable(clazz.cast(replicationConfiguration()));
        case "Token":
            return Optional.ofNullable(clazz.cast(token()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketReplicationRequest, T> g) {
        return obj -> g.apply((PutBucketReplicationRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, PutBucketReplicationRequest> {
        /**
         * <p>
         * The name of the bucket
         * </p>
         * 
         * @param bucket
         *        The name of the bucket
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to
         * verify that the request body was not corrupted in transit. For more information, see <a
         * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.
         * </p>
         * <p>
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
         * this field is calculated automatically.
         * </p>
         * 
         * @param contentMD5
         *        The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity
         *        check to verify that the request body was not corrupted in transit. For more information, see <a
         *        href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864</a>.</p>
         *        <p>
         *        For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services
         *        SDKs, this field is calculated automatically.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentMD5(String contentMD5);

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

        /**
         * Sets the value of the ReplicationConfiguration property for this object.
         *
         * @param replicationConfiguration
         *        The new value for the ReplicationConfiguration property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration);

        /**
         * Sets the value of the ReplicationConfiguration property for this object.
         *
         * This is a convenience method that creates an instance of the {@link ReplicationConfiguration.Builder}
         * avoiding the need to create one manually via {@link ReplicationConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #replicationConfiguration(ReplicationConfiguration)}.
         * 
         * @param replicationConfiguration
         *        a consumer that will call methods on {@link ReplicationConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #replicationConfiguration(ReplicationConfiguration)
         */
        default Builder replicationConfiguration(Consumer<ReplicationConfiguration.Builder> replicationConfiguration) {
            return replicationConfiguration(ReplicationConfiguration.builder().applyMutation(replicationConfiguration).build());
        }

        /**
         * <p>
         * A token to allow Object Lock to be enabled for an existing bucket.
         * </p>
         * 
         * @param token
         *        A token to allow Object Lock to be enabled for an existing bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder token(String token);

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

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String contentMD5;

        private String checksumAlgorithm;

        private ReplicationConfiguration replicationConfiguration;

        private String token;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketReplicationRequest model) {
            super(model);
            bucket(model.bucket);
            contentMD5(model.contentMD5);
            checksumAlgorithm(model.checksumAlgorithm);
            replicationConfiguration(model.replicationConfiguration);
            token(model.token);
            expectedBucketOwner(model.expectedBucketOwner);
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

        public final ReplicationConfiguration.Builder getReplicationConfiguration() {
            return replicationConfiguration != null ? replicationConfiguration.toBuilder() : null;
        }

        public final void setReplicationConfiguration(ReplicationConfiguration.BuilderImpl replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration != null ? replicationConfiguration.build() : null;
        }

        @Override
        public final Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public final String getToken() {
            return token;
        }

        public final void setToken(String token) {
            this.token = token;
        }

        @Override
        public final Builder token(String token) {
            this.token = token;
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
        public PutBucketReplicationRequest build() {
            return new PutBucketReplicationRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
