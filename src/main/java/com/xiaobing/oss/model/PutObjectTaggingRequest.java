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
public final class PutObjectTaggingRequest extends S3Request implements
        ToCopyableBuilder<PutObjectTaggingRequest.Builder, PutObjectTaggingRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutObjectTaggingRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(PutObjectTaggingRequest::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(PutObjectTaggingRequest::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("versionId")
                    .unmarshallLocationName("versionId").build()).build();

    private static final SdkField<String> CONTENT_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentMD5")
            .getter(getter(PutObjectTaggingRequest::contentMD5))
            .setter(setter(Builder::contentMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-MD5")
                    .unmarshallLocationName("Content-MD5").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(PutObjectTaggingRequest::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-sdk-checksum-algorithm")
                    .unmarshallLocationName("x-amz-sdk-checksum-algorithm").build()).build();

    private static final SdkField<Tagging> TAGGING_FIELD = SdkField
            .<Tagging> builder(MarshallingType.SDK_POJO)
            .memberName("Tagging")
            .getter(getter(PutObjectTaggingRequest::tagging))
            .setter(setter(Builder::tagging))
            .constructor(Tagging::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tagging")
                    .unmarshallLocationName("Tagging").build(), PayloadTrait.create()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutObjectTaggingRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(PutObjectTaggingRequest::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, KEY_FIELD,
            VERSION_ID_FIELD, CONTENT_MD5_FIELD, CHECKSUM_ALGORITHM_FIELD, TAGGING_FIELD, EXPECTED_BUCKET_OWNER_FIELD,
            REQUEST_PAYER_FIELD));

    private final String bucket;

    private final String key;

    private final String versionId;

    private final String contentMD5;

    private final String checksumAlgorithm;

    private final Tagging tagging;

    private final String expectedBucketOwner;

    private final String requestPayer;

    private PutObjectTaggingRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.contentMD5 = builder.contentMD5;
        this.checksumAlgorithm = builder.checksumAlgorithm;
        this.tagging = builder.tagging;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.requestPayer = builder.requestPayer;
    }

    /**
     * <p>
     * The bucket name containing the object.
     * </p>
     * <p>
     * When using this action with an access point, you must direct requests to the access point hostname. The access
     * point hostname takes the form <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * When using this action with an access point through the Amazon Web Services SDKs, you provide the access point
     * ARN in place of the bucket name. For more information about access point ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The
     * S3 on Outposts hostname takes the form
     * <code> <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com</code>.
     * When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket
     * ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The bucket name containing the object. </p>
     *         <p>
     *         When using this action with an access point, you must direct requests to the access point hostname. The
     *         access point hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *         action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
     *         place of the bucket name. For more information about access point ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
     *         points</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     *         <p>
     *         When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
     *         hostname. The S3 on Outposts hostname takes the form
     *         <code> <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com</code>
     *         . When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the
     *         Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on
     *         Outposts</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the object key.
     * </p>
     * 
     * @return Name of the object key.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * The versionId of the object that the tag-set will be added to.
     * </p>
     * 
     * @return The versionId of the object that the tag-set will be added to.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * The MD5 hash for the request body.
     * </p>
     * <p>
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this
     * field is calculated automatically.
     * </p>
     * 
     * @return The MD5 hash for the request body.</p>
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
     * <p>
     * Container for the <code>TagSet</code> and <code>Tag</code> elements
     * </p>
     * 
     * @return Container for the <code>TagSet</code> and <code>Tag</code> elements
     */
    public final Tagging tagging() {
        return tagging;
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
     * Returns the value of the RequestPayer property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestPayer} will
     * return {@link RequestPayer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #requestPayerAsString}.
     * </p>
     * 
     * @return The value of the RequestPayer property for this object.
     * @see RequestPayer
     */
    public final RequestPayer requestPayer() {
        return RequestPayer.fromValue(requestPayer);
    }

    /**
     * Returns the value of the RequestPayer property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestPayer} will
     * return {@link RequestPayer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #requestPayerAsString}.
     * </p>
     * 
     * @return The value of the RequestPayer property for this object.
     * @see RequestPayer
     */
    public final String requestPayerAsString() {
        return requestPayer;
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
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(contentMD5());
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
        hashCode = 31 * hashCode + Objects.hashCode(tagging());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
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
        if (!(obj instanceof PutObjectTaggingRequest)) {
            return false;
        }
        PutObjectTaggingRequest other = (PutObjectTaggingRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(key(), other.key())
                && Objects.equals(versionId(), other.versionId()) && Objects.equals(contentMD5(), other.contentMD5())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString())
                && Objects.equals(tagging(), other.tagging())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutObjectTaggingRequest").add("Bucket", bucket()).add("Key", key())
                .add("VersionId", versionId()).add("ContentMD5", contentMD5())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString()).add("Tagging", tagging())
                .add("ExpectedBucketOwner", expectedBucketOwner()).add("RequestPayer", requestPayerAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "ContentMD5":
            return Optional.ofNullable(clazz.cast(contentMD5()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
        case "Tagging":
            return Optional.ofNullable(clazz.cast(tagging()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutObjectTaggingRequest, T> g) {
        return obj -> g.apply((PutObjectTaggingRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, PutObjectTaggingRequest> {
        /**
         * <p>
         * The bucket name containing the object.
         * </p>
         * <p>
         * When using this action with an access point, you must direct requests to the access point hostname. The
         * access point hostname takes the form
         * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this action
         * with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the
         * bucket name. For more information about access point ARNs, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>
         * in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname.
         * The S3 on Outposts hostname takes the form
         * <code> <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com</code>
         * . When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts
         * bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on
         * Outposts</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param bucket
         *        The bucket name containing the object. </p>
         *        <p>
         *        When using this action with an access point, you must direct requests to the access point hostname.
         *        The access point hostname takes the form
         *        <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
         *        action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in
         *        place of the bucket name. For more information about access point ARNs, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access
         *        points</a> in the <i>Amazon S3 User Guide</i>.
         *        </p>
         *        <p>
         *        When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts
         *        hostname. The S3 on Outposts hostname takes the form
         *        <code> <i>AccessPointName</i>-<i>AccountId</i>.<i>outpostID</i>.s3-outposts.<i>Region</i>.amazonaws.com</code>
         *        . When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the
         *        Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see
         *        <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on
         *        Outposts</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * Name of the object key.
         * </p>
         * 
         * @param key
         *        Name of the object key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * The versionId of the object that the tag-set will be added to.
         * </p>
         * 
         * @param versionId
         *        The versionId of the object that the tag-set will be added to.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * The MD5 hash for the request body.
         * </p>
         * <p>
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
         * this field is calculated automatically.
         * </p>
         * 
         * @param contentMD5
         *        The MD5 hash for the request body.</p>
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
         * <p>
         * Container for the <code>TagSet</code> and <code>Tag</code> elements
         * </p>
         * 
         * @param tagging
         *        Container for the <code>TagSet</code> and <code>Tag</code> elements
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagging(Tagging tagging);

        /**
         * <p>
         * Container for the <code>TagSet</code> and <code>Tag</code> elements
         * </p>
         * This is a convenience method that creates an instance of the {@link Tagging.Builder} avoiding the need to
         * create one manually via {@link Tagging#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tagging.Builder#build()} is called immediately and its result is
         * passed to {@link #tagging(Tagging)}.
         * 
         * @param tagging
         *        a consumer that will call methods on {@link Tagging.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tagging(Tagging)
         */
        default Builder tagging(Consumer<Tagging.Builder> tagging) {
            return tagging(Tagging.builder().applyMutation(tagging).build());
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
         * Sets the value of the RequestPayer property for this object.
         *
         * @param requestPayer
         *        The new value for the RequestPayer property for this object.
         * @see RequestPayer
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestPayer
         */
        Builder requestPayer(String requestPayer);

        /**
         * Sets the value of the RequestPayer property for this object.
         *
         * @param requestPayer
         *        The new value for the RequestPayer property for this object.
         * @see RequestPayer
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestPayer
         */
        Builder requestPayer(RequestPayer requestPayer);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String key;

        private String versionId;

        private String contentMD5;

        private String checksumAlgorithm;

        private Tagging tagging;

        private String expectedBucketOwner;

        private String requestPayer;

        private BuilderImpl() {
        }

        private BuilderImpl(PutObjectTaggingRequest model) {
            super(model);
            bucket(model.bucket);
            key(model.key);
            versionId(model.versionId);
            contentMD5(model.contentMD5);
            checksumAlgorithm(model.checksumAlgorithm);
            tagging(model.tagging);
            expectedBucketOwner(model.expectedBucketOwner);
            requestPayer(model.requestPayer);
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

        public final String getKey() {
            return key;
        }

        public final void setKey(String key) {
            this.key = key;
        }

        @Override
        public final Builder key(String key) {
            this.key = key;
            return this;
        }

        public final String getVersionId() {
            return versionId;
        }

        public final void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        @Override
        public final Builder versionId(String versionId) {
            this.versionId = versionId;
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

        public final Tagging.Builder getTagging() {
            return tagging != null ? tagging.toBuilder() : null;
        }

        public final void setTagging(Tagging.BuilderImpl tagging) {
            this.tagging = tagging != null ? tagging.build() : null;
        }

        @Override
        public final Builder tagging(Tagging tagging) {
            this.tagging = tagging;
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

        public final String getRequestPayer() {
            return requestPayer;
        }

        public final void setRequestPayer(String requestPayer) {
            this.requestPayer = requestPayer;
        }

        @Override
        public final Builder requestPayer(String requestPayer) {
            this.requestPayer = requestPayer;
            return this;
        }

        @Override
        public final Builder requestPayer(RequestPayer requestPayer) {
            this.requestPayer(requestPayer == null ? null : requestPayer.toString());
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
        public PutObjectTaggingRequest build() {
            return new PutObjectTaggingRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
