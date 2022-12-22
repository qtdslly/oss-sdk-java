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
public final class CompleteMultipartUploadRequest extends S3Request implements
        ToCopyableBuilder<CompleteMultipartUploadRequest.Builder, CompleteMultipartUploadRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(CompleteMultipartUploadRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(CompleteMultipartUploadRequest::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<CompletedMultipartUpload> MULTIPART_UPLOAD_FIELD = SdkField
            .<CompletedMultipartUpload> builder(MarshallingType.SDK_POJO)
            .memberName("MultipartUpload")
            .getter(getter(CompleteMultipartUploadRequest::multipartUpload))
            .setter(setter(Builder::multipartUpload))
            .constructor(CompletedMultipartUpload::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CompleteMultipartUpload")
                    .unmarshallLocationName("CompleteMultipartUpload").build(), PayloadTrait.create()).build();

    private static final SdkField<String> UPLOAD_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadId")
            .getter(getter(CompleteMultipartUploadRequest::uploadId))
            .setter(setter(Builder::uploadId))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("uploadId")
                    .unmarshallLocationName("uploadId").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32")
            .getter(getter(CompleteMultipartUploadRequest::checksumCRC32))
            .setter(setter(Builder::checksumCRC32))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-crc32")
                    .unmarshallLocationName("x-amz-checksum-crc32").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_C_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32C")
            .getter(getter(CompleteMultipartUploadRequest::checksumCRC32C))
            .setter(setter(Builder::checksumCRC32C))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-crc32c")
                    .unmarshallLocationName("x-amz-checksum-crc32c").build()).build();

    private static final SdkField<String> CHECKSUM_SHA1_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA1")
            .getter(getter(CompleteMultipartUploadRequest::checksumSHA1))
            .setter(setter(Builder::checksumSHA1))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-sha1")
                    .unmarshallLocationName("x-amz-checksum-sha1").build()).build();

    private static final SdkField<String> CHECKSUM_SHA256_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA256")
            .getter(getter(CompleteMultipartUploadRequest::checksumSHA256))
            .setter(setter(Builder::checksumSHA256))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-sha256")
                    .unmarshallLocationName("x-amz-checksum-sha256").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(CompleteMultipartUploadRequest::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(CompleteMultipartUploadRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(CompleteMultipartUploadRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKey")
            .getter(getter(CompleteMultipartUploadRequest::sseCustomerKey))
            .setter(setter(Builder::sseCustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(CompleteMultipartUploadRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, KEY_FIELD,
            MULTIPART_UPLOAD_FIELD, UPLOAD_ID_FIELD, CHECKSUM_CRC32_FIELD, CHECKSUM_CRC32_C_FIELD, CHECKSUM_SHA1_FIELD,
            CHECKSUM_SHA256_FIELD, REQUEST_PAYER_FIELD, EXPECTED_BUCKET_OWNER_FIELD, SSE_CUSTOMER_ALGORITHM_FIELD,
            SSE_CUSTOMER_KEY_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD));

    private final String bucket;

    private final String key;

    private final CompletedMultipartUpload multipartUpload;

    private final String uploadId;

    private final String checksumCRC32;

    private final String checksumCRC32C;

    private final String checksumSHA1;

    private final String checksumSHA256;

    private final String requestPayer;

    private final String expectedBucketOwner;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKey;

    private final String sseCustomerKeyMD5;

    private CompleteMultipartUploadRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.multipartUpload = builder.multipartUpload;
        this.uploadId = builder.uploadId;
        this.checksumCRC32 = builder.checksumCRC32;
        this.checksumCRC32C = builder.checksumCRC32C;
        this.checksumSHA1 = builder.checksumSHA1;
        this.checksumSHA256 = builder.checksumSHA256;
        this.requestPayer = builder.requestPayer;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKey = builder.sseCustomerKey;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
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
     * @return Name of the bucket to which the multipart upload was initiated.</p>
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
     * Object key for which the multipart upload was initiated.
     * </p>
     * 
     * @return Object key for which the multipart upload was initiated.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * The container for the multipart upload request information.
     * </p>
     * 
     * @return The container for the multipart upload request information.
     */
    public final CompletedMultipartUpload multipartUpload() {
        return multipartUpload;
    }

    /**
     * <p>
     * ID for the initiated multipart upload.
     * </p>
     * 
     * @return ID for the initiated multipart upload.
     */
    public final String uploadId() {
        return uploadId;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32() {
        return checksumCRC32;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32C() {
        return checksumCRC32C;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA1() {
        return checksumSHA1;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA256() {
        return checksumSHA256;
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
     * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the
     * object was created using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when
     *         the object was created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created
     * using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
     *         created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerKey() {
        return sseCustomerKey;
    }

    /**
     * <p>
     * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
     * created using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object
     *         was created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
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
        hashCode = 31 * hashCode + Objects.hashCode(multipartUpload());
        hashCode = 31 * hashCode + Objects.hashCode(uploadId());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32C());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA1());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA256());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
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
        if (!(obj instanceof CompleteMultipartUploadRequest)) {
            return false;
        }
        CompleteMultipartUploadRequest other = (CompleteMultipartUploadRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(key(), other.key())
                && Objects.equals(multipartUpload(), other.multipartUpload()) && Objects.equals(uploadId(), other.uploadId())
                && Objects.equals(checksumCRC32(), other.checksumCRC32())
                && Objects.equals(checksumCRC32C(), other.checksumCRC32C())
                && Objects.equals(checksumSHA1(), other.checksumSHA1())
                && Objects.equals(checksumSHA256(), other.checksumSHA256())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKey(), other.sseCustomerKey())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CompleteMultipartUploadRequest").add("Bucket", bucket()).add("Key", key())
                .add("MultipartUpload", multipartUpload()).add("UploadId", uploadId()).add("ChecksumCRC32", checksumCRC32())
                .add("ChecksumCRC32C", checksumCRC32C()).add("ChecksumSHA1", checksumSHA1())
                .add("ChecksumSHA256", checksumSHA256()).add("RequestPayer", requestPayerAsString())
                .add("ExpectedBucketOwner", expectedBucketOwner()).add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKey", sseCustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "MultipartUpload":
            return Optional.ofNullable(clazz.cast(multipartUpload()));
        case "UploadId":
            return Optional.ofNullable(clazz.cast(uploadId()));
        case "ChecksumCRC32":
            return Optional.ofNullable(clazz.cast(checksumCRC32()));
        case "ChecksumCRC32C":
            return Optional.ofNullable(clazz.cast(checksumCRC32C()));
        case "ChecksumSHA1":
            return Optional.ofNullable(clazz.cast(checksumSHA1()));
        case "ChecksumSHA256":
            return Optional.ofNullable(clazz.cast(checksumSHA256()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKey":
            return Optional.ofNullable(clazz.cast(sseCustomerKey()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CompleteMultipartUploadRequest, T> g) {
        return obj -> g.apply((CompleteMultipartUploadRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, CompleteMultipartUploadRequest> {
        /**
         * <p>
         * Name of the bucket to which the multipart upload was initiated.
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
         *        Name of the bucket to which the multipart upload was initiated.</p>
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
         * Object key for which the multipart upload was initiated.
         * </p>
         * 
         * @param key
         *        Object key for which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * The container for the multipart upload request information.
         * </p>
         * 
         * @param multipartUpload
         *        The container for the multipart upload request information.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder multipartUpload(CompletedMultipartUpload multipartUpload);

        /**
         * <p>
         * The container for the multipart upload request information.
         * </p>
         * This is a convenience method that creates an instance of the {@link CompletedMultipartUpload.Builder}
         * avoiding the need to create one manually via {@link CompletedMultipartUpload#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link CompletedMultipartUpload.Builder#build()} is called immediately
         * and its result is passed to {@link #multipartUpload(CompletedMultipartUpload)}.
         * 
         * @param multipartUpload
         *        a consumer that will call methods on {@link CompletedMultipartUpload.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #multipartUpload(CompletedMultipartUpload)
         */
        default Builder multipartUpload(Consumer<CompletedMultipartUpload.Builder> multipartUpload) {
            return multipartUpload(CompletedMultipartUpload.builder().applyMutation(multipartUpload).build());
        }

        /**
         * <p>
         * ID for the initiated multipart upload.
         * </p>
         * 
         * @param uploadId
         *        ID for the initiated multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploadId(String uploadId);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32(String checksumCRC32);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32C
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32C(String checksumCRC32C);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA1
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA1(String checksumSHA1);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA256
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA256(String checksumSHA256);

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
         * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the
         * object was created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only
         *        when the object was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
         * created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerKey
         *        The server-side encryption (SSE) customer managed key. This parameter is needed only when the object
         *        was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKey(String sseCustomerKey);

        /**
         * <p>
         * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
         * created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the
         *        object was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String key;

        private CompletedMultipartUpload multipartUpload;

        private String uploadId;

        private String checksumCRC32;

        private String checksumCRC32C;

        private String checksumSHA1;

        private String checksumSHA256;

        private String requestPayer;

        private String expectedBucketOwner;

        private String sseCustomerAlgorithm;

        private String sseCustomerKey;

        private String sseCustomerKeyMD5;

        private BuilderImpl() {
        }

        private BuilderImpl(CompleteMultipartUploadRequest model) {
            super(model);
            bucket(model.bucket);
            key(model.key);
            multipartUpload(model.multipartUpload);
            uploadId(model.uploadId);
            checksumCRC32(model.checksumCRC32);
            checksumCRC32C(model.checksumCRC32C);
            checksumSHA1(model.checksumSHA1);
            checksumSHA256(model.checksumSHA256);
            requestPayer(model.requestPayer);
            expectedBucketOwner(model.expectedBucketOwner);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKey(model.sseCustomerKey);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
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

        public final CompletedMultipartUpload.Builder getMultipartUpload() {
            return multipartUpload != null ? multipartUpload.toBuilder() : null;
        }

        public final void setMultipartUpload(CompletedMultipartUpload.BuilderImpl multipartUpload) {
            this.multipartUpload = multipartUpload != null ? multipartUpload.build() : null;
        }

        @Override
        public final Builder multipartUpload(CompletedMultipartUpload multipartUpload) {
            this.multipartUpload = multipartUpload;
            return this;
        }

        public final String getUploadId() {
            return uploadId;
        }

        public final void setUploadId(String uploadId) {
            this.uploadId = uploadId;
        }

        @Override
        public final Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public final String getChecksumCRC32() {
            return checksumCRC32;
        }

        public final void setChecksumCRC32(String checksumCRC32) {
            this.checksumCRC32 = checksumCRC32;
        }

        @Override
        public final Builder checksumCRC32(String checksumCRC32) {
            this.checksumCRC32 = checksumCRC32;
            return this;
        }

        public final String getChecksumCRC32C() {
            return checksumCRC32C;
        }

        public final void setChecksumCRC32C(String checksumCRC32C) {
            this.checksumCRC32C = checksumCRC32C;
        }

        @Override
        public final Builder checksumCRC32C(String checksumCRC32C) {
            this.checksumCRC32C = checksumCRC32C;
            return this;
        }

        public final String getChecksumSHA1() {
            return checksumSHA1;
        }

        public final void setChecksumSHA1(String checksumSHA1) {
            this.checksumSHA1 = checksumSHA1;
        }

        @Override
        public final Builder checksumSHA1(String checksumSHA1) {
            this.checksumSHA1 = checksumSHA1;
            return this;
        }

        public final String getChecksumSHA256() {
            return checksumSHA256;
        }

        public final void setChecksumSHA256(String checksumSHA256) {
            this.checksumSHA256 = checksumSHA256;
        }

        @Override
        public final Builder checksumSHA256(String checksumSHA256) {
            this.checksumSHA256 = checksumSHA256;
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

        public final String getSseCustomerAlgorithm() {
            return sseCustomerAlgorithm;
        }

        public final void setSseCustomerAlgorithm(String sseCustomerAlgorithm) {
            this.sseCustomerAlgorithm = sseCustomerAlgorithm;
        }

        @Override
        public final Builder sseCustomerAlgorithm(String sseCustomerAlgorithm) {
            this.sseCustomerAlgorithm = sseCustomerAlgorithm;
            return this;
        }

        public final String getSseCustomerKey() {
            return sseCustomerKey;
        }

        public final void setSseCustomerKey(String sseCustomerKey) {
            this.sseCustomerKey = sseCustomerKey;
        }

        @Override
        public final Builder sseCustomerKey(String sseCustomerKey) {
            this.sseCustomerKey = sseCustomerKey;
            return this;
        }

        public final String getSseCustomerKeyMD5() {
            return sseCustomerKeyMD5;
        }

        public final void setSseCustomerKeyMD5(String sseCustomerKeyMD5) {
            this.sseCustomerKeyMD5 = sseCustomerKeyMD5;
        }

        @Override
        public final Builder sseCustomerKeyMD5(String sseCustomerKeyMD5) {
            this.sseCustomerKeyMD5 = sseCustomerKeyMD5;
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
        public CompleteMultipartUploadRequest build() {
            return new CompleteMultipartUploadRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
