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

import java.time.Instant;
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
public final class CreateMultipartUploadResponse extends S3Response implements
        ToCopyableBuilder<CreateMultipartUploadResponse.Builder, CreateMultipartUploadResponse> {
    private static final SdkField<Instant> ABORT_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("AbortDate")
            .getter(getter(CreateMultipartUploadResponse::abortDate))
            .setter(setter(Builder::abortDate))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-abort-date")
                    .unmarshallLocationName("x-amz-abort-date").build()).build();

    private static final SdkField<String> ABORT_RULE_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AbortRuleId")
            .getter(getter(CreateMultipartUploadResponse::abortRuleId))
            .setter(setter(Builder::abortRuleId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-abort-rule-id")
                    .unmarshallLocationName("x-amz-abort-rule-id").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(CreateMultipartUploadResponse::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(CreateMultipartUploadResponse::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<String> UPLOAD_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadId")
            .getter(getter(CreateMultipartUploadResponse::uploadId))
            .setter(setter(Builder::uploadId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("UploadId")
                    .unmarshallLocationName("UploadId").build()).build();

    private static final SdkField<String> SERVER_SIDE_ENCRYPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ServerSideEncryption")
            .getter(getter(CreateMultipartUploadResponse::serverSideEncryptionAsString))
            .setter(setter(Builder::serverSideEncryption))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-server-side-encryption")
                    .unmarshallLocationName("x-amz-server-side-encryption").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(CreateMultipartUploadResponse::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(CreateMultipartUploadResponse::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> SSEKMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSKeyId")
            .getter(getter(CreateMultipartUploadResponse::ssekmsKeyId))
            .setter(setter(Builder::ssekmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-aws-kms-key-id")
                    .unmarshallLocationName("x-amz-server-side-encryption-aws-kms-key-id").build()).build();

    private static final SdkField<String> SSEKMS_ENCRYPTION_CONTEXT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSEncryptionContext")
            .getter(getter(CreateMultipartUploadResponse::ssekmsEncryptionContext))
            .setter(setter(Builder::ssekmsEncryptionContext))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-context")
                    .unmarshallLocationName("x-amz-server-side-encryption-context").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(CreateMultipartUploadResponse::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-bucket-key-enabled")
                    .unmarshallLocationName("x-amz-server-side-encryption-bucket-key-enabled").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(CreateMultipartUploadResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(CreateMultipartUploadResponse::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-algorithm")
                    .unmarshallLocationName("x-amz-checksum-algorithm").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ABORT_DATE_FIELD,
            ABORT_RULE_ID_FIELD, BUCKET_FIELD, KEY_FIELD, UPLOAD_ID_FIELD, SERVER_SIDE_ENCRYPTION_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD, SSEKMS_KEY_ID_FIELD, SSEKMS_ENCRYPTION_CONTEXT_FIELD,
            BUCKET_KEY_ENABLED_FIELD, REQUEST_CHARGED_FIELD, CHECKSUM_ALGORITHM_FIELD));

    private final Instant abortDate;

    private final String abortRuleId;

    private final String bucket;

    private final String key;

    private final String uploadId;

    private final String serverSideEncryption;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKeyMD5;

    private final String ssekmsKeyId;

    private final String ssekmsEncryptionContext;

    private final Boolean bucketKeyEnabled;

    private final String requestCharged;

    private final String checksumAlgorithm;

    private CreateMultipartUploadResponse(BuilderImpl builder) {
        super(builder);
        this.abortDate = builder.abortDate;
        this.abortRuleId = builder.abortRuleId;
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.ssekmsKeyId = builder.ssekmsKeyId;
        this.ssekmsEncryptionContext = builder.ssekmsEncryptionContext;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
        this.requestCharged = builder.requestCharged;
        this.checksumAlgorithm = builder.checksumAlgorithm;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix
     * in the lifecycle rule matches the object name in the request, the response includes this header. The header
     * indicates when the initiated multipart upload becomes eligible for an abort operation. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
     * </p>
     * <p>
     * The response also includes the <code>x-amz-abort-rule-id</code> header that provides the ID of the lifecycle
     * configuration rule that defines this action.
     * </p>
     * 
     * @return If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and
     *         the prefix in the lifecycle rule matches the object name in the request, the response includes this
     *         header. The header indicates when the initiated multipart upload becomes eligible for an abort operation.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.</p>
     *         <p>
     *         The response also includes the <code>x-amz-abort-rule-id</code> header that provides the ID of the
     *         lifecycle configuration rule that defines this action.
     */
    public final Instant abortDate() {
        return abortDate;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code> header. It identifies the applicable
     * lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
     * </p>
     * 
     * @return This header is returned along with the <code>x-amz-abort-date</code> header. It identifies the applicable
     *         lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
     */
    public final String abortRuleId() {
        return abortRuleId;
    }

    /**
     * <p>
     * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
     * access point alias if used.
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
     * @return The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN
     *         or access point alias if used.</p>
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
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final ServerSideEncryption serverSideEncryption() {
        return ServerSideEncryption.fromValue(serverSideEncryption);
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final String serverSideEncryptionAsString() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this
     * header confirming the encryption algorithm used.
     * </p>
     * 
     * @return If server-side encryption with a customer-provided encryption key was requested, the response will
     *         include this header confirming the encryption algorithm used.
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this
     * header to provide round-trip message integrity verification of the customer-provided encryption key.
     * </p>
     * 
     * @return If server-side encryption with a customer-provided encryption key was requested, the response will
     *         include this header to provide round-trip message integrity verification of the customer-provided
     *         encryption key.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * <p>
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * symmetric customer managed key that was used for the object.
     * </p>
     * 
     * @return If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *         symmetric customer managed key that was used for the object.
     */
    public final String ssekmsKeyId() {
        return ssekmsKeyId;
    }

    /**
     * <p>
     * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of
     * this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
     * </p>
     * 
     * @return If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
     *         value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
     *         pairs.
     */
    public final String ssekmsEncryptionContext() {
        return ssekmsEncryptionContext;
    }

    /**
     * <p>
     * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services
     * KMS (SSE-KMS).
     * </p>
     * 
     * @return Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web
     *         Services KMS (SSE-KMS).
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final RequestCharged requestCharged() {
        return RequestCharged.fromValue(requestCharged);
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final String requestChargedAsString() {
        return requestCharged;
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
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
        hashCode = 31 * hashCode + Objects.hashCode(abortDate());
        hashCode = 31 * hashCode + Objects.hashCode(abortRuleId());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(uploadId());
        hashCode = 31 * hashCode + Objects.hashCode(serverSideEncryptionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsEncryptionContext());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
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
        if (!(obj instanceof CreateMultipartUploadResponse)) {
            return false;
        }
        CreateMultipartUploadResponse other = (CreateMultipartUploadResponse) obj;
        return Objects.equals(abortDate(), other.abortDate()) && Objects.equals(abortRuleId(), other.abortRuleId())
                && Objects.equals(bucket(), other.bucket()) && Objects.equals(key(), other.key())
                && Objects.equals(uploadId(), other.uploadId())
                && Objects.equals(serverSideEncryptionAsString(), other.serverSideEncryptionAsString())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(ssekmsKeyId(), other.ssekmsKeyId())
                && Objects.equals(ssekmsEncryptionContext(), other.ssekmsEncryptionContext())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CreateMultipartUploadResponse").add("AbortDate", abortDate()).add("AbortRuleId", abortRuleId())
                .add("Bucket", bucket()).add("Key", key()).add("UploadId", uploadId())
                .add("ServerSideEncryption", serverSideEncryptionAsString()).add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5())
                .add("SSEKMSKeyId", ssekmsKeyId() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSEKMSEncryptionContext", ssekmsEncryptionContext() == null ? null : "*** Sensitive Data Redacted ***")
                .add("BucketKeyEnabled", bucketKeyEnabled()).add("RequestCharged", requestChargedAsString())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "AbortDate":
            return Optional.ofNullable(clazz.cast(abortDate()));
        case "AbortRuleId":
            return Optional.ofNullable(clazz.cast(abortRuleId()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "UploadId":
            return Optional.ofNullable(clazz.cast(uploadId()));
        case "ServerSideEncryption":
            return Optional.ofNullable(clazz.cast(serverSideEncryptionAsString()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "SSEKMSKeyId":
            return Optional.ofNullable(clazz.cast(ssekmsKeyId()));
        case "SSEKMSEncryptionContext":
            return Optional.ofNullable(clazz.cast(ssekmsEncryptionContext()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
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

    private static <T> Function<Object, T> getter(Function<CreateMultipartUploadResponse, T> g) {
        return obj -> g.apply((CreateMultipartUploadResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, CreateMultipartUploadResponse> {
        /**
         * <p>
         * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the
         * prefix in the lifecycle rule matches the object name in the request, the response includes this header. The
         * header indicates when the initiated multipart upload becomes eligible for an abort operation. For more
         * information, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
         * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
         * </p>
         * <p>
         * The response also includes the <code>x-amz-abort-rule-id</code> header that provides the ID of the lifecycle
         * configuration rule that defines this action.
         * </p>
         * 
         * @param abortDate
         *        If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and
         *        the prefix in the lifecycle rule matches the object name in the request, the response includes this
         *        header. The header indicates when the initiated multipart upload becomes eligible for an abort
         *        operation. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
         *        > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.</p>
         *        <p>
         *        The response also includes the <code>x-amz-abort-rule-id</code> header that provides the ID of the
         *        lifecycle configuration rule that defines this action.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder abortDate(Instant abortDate);

        /**
         * <p>
         * This header is returned along with the <code>x-amz-abort-date</code> header. It identifies the applicable
         * lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
         * </p>
         * 
         * @param abortRuleId
         *        This header is returned along with the <code>x-amz-abort-date</code> header. It identifies the
         *        applicable lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder abortRuleId(String abortRuleId);

        /**
         * <p>
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
         * access point alias if used.
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
         *        The name of the bucket to which the multipart upload was initiated. Does not return the access point
         *        ARN or access point alias if used.</p>
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
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(String serverSideEncryption);

        /**
         * <p>
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(ServerSideEncryption serverSideEncryption);

        /**
         * <p>
         * If server-side encryption with a customer-provided encryption key was requested, the response will include
         * this header confirming the encryption algorithm used.
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        If server-side encryption with a customer-provided encryption key was requested, the response will
         *        include this header confirming the encryption algorithm used.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * If server-side encryption with a customer-provided encryption key was requested, the response will include
         * this header to provide round-trip message integrity verification of the customer-provided encryption key.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        If server-side encryption with a customer-provided encryption key was requested, the response will
         *        include this header to provide round-trip message integrity verification of the customer-provided
         *        encryption key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        /**
         * <p>
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
         * symmetric customer managed key that was used for the object.
         * </p>
         * 
         * @param ssekmsKeyId
         *        If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services
         *        KMS) symmetric customer managed key that was used for the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsKeyId(String ssekmsKeyId);

        /**
         * <p>
         * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value
         * of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
         * </p>
         * 
         * @param ssekmsEncryptionContext
         *        If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
         *        value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context
         *        key-value pairs.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsEncryptionContext(String ssekmsEncryptionContext);

        /**
         * <p>
         * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web
         * Services KMS (SSE-KMS).
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon
         *        Web Services KMS (SSE-KMS).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(String requestCharged);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(RequestCharged requestCharged);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Instant abortDate;

        private String abortRuleId;

        private String bucket;

        private String key;

        private String uploadId;

        private String serverSideEncryption;

        private String sseCustomerAlgorithm;

        private String sseCustomerKeyMD5;

        private String ssekmsKeyId;

        private String ssekmsEncryptionContext;

        private Boolean bucketKeyEnabled;

        private String requestCharged;

        private String checksumAlgorithm;

        private BuilderImpl() {
        }

        private BuilderImpl(CreateMultipartUploadResponse model) {
            super(model);
            abortDate(model.abortDate);
            abortRuleId(model.abortRuleId);
            bucket(model.bucket);
            key(model.key);
            uploadId(model.uploadId);
            serverSideEncryption(model.serverSideEncryption);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            ssekmsKeyId(model.ssekmsKeyId);
            ssekmsEncryptionContext(model.ssekmsEncryptionContext);
            bucketKeyEnabled(model.bucketKeyEnabled);
            requestCharged(model.requestCharged);
            checksumAlgorithm(model.checksumAlgorithm);
        }

        public final Instant getAbortDate() {
            return abortDate;
        }

        public final void setAbortDate(Instant abortDate) {
            this.abortDate = abortDate;
        }

        @Override
        public final Builder abortDate(Instant abortDate) {
            this.abortDate = abortDate;
            return this;
        }

        public final String getAbortRuleId() {
            return abortRuleId;
        }

        public final void setAbortRuleId(String abortRuleId) {
            this.abortRuleId = abortRuleId;
        }

        @Override
        public final Builder abortRuleId(String abortRuleId) {
            this.abortRuleId = abortRuleId;
            return this;
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

        public final String getServerSideEncryption() {
            return serverSideEncryption;
        }

        public final void setServerSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
        }

        @Override
        public final Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        @Override
        public final Builder serverSideEncryption(ServerSideEncryption serverSideEncryption) {
            this.serverSideEncryption(serverSideEncryption == null ? null : serverSideEncryption.toString());
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

        public final String getSsekmsKeyId() {
            return ssekmsKeyId;
        }

        public final void setSsekmsKeyId(String ssekmsKeyId) {
            this.ssekmsKeyId = ssekmsKeyId;
        }

        @Override
        public final Builder ssekmsKeyId(String ssekmsKeyId) {
            this.ssekmsKeyId = ssekmsKeyId;
            return this;
        }

        public final String getSsekmsEncryptionContext() {
            return ssekmsEncryptionContext;
        }

        public final void setSsekmsEncryptionContext(String ssekmsEncryptionContext) {
            this.ssekmsEncryptionContext = ssekmsEncryptionContext;
        }

        @Override
        public final Builder ssekmsEncryptionContext(String ssekmsEncryptionContext) {
            this.ssekmsEncryptionContext = ssekmsEncryptionContext;
            return this;
        }

        public final Boolean getBucketKeyEnabled() {
            return bucketKeyEnabled;
        }

        public final void setBucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
        }

        @Override
        public final Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        public final String getRequestCharged() {
            return requestCharged;
        }

        public final void setRequestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
        }

        @Override
        public final Builder requestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
            return this;
        }

        @Override
        public final Builder requestCharged(RequestCharged requestCharged) {
            this.requestCharged(requestCharged == null ? null : requestCharged.toString());
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
        public CreateMultipartUploadResponse build() {
            return new CreateMultipartUploadResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
