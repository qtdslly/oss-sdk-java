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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import com.xiaobing.oss.internal.TaggingAdapter;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.MapTrait;
import software.amazon.awssdk.core.traits.TimestampFormatTrait;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructMap;
import software.amazon.awssdk.core.util.SdkAutoConstructMap;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class CreateMultipartUploadRequest extends S3Request implements
        ToCopyableBuilder<CreateMultipartUploadRequest.Builder, CreateMultipartUploadRequest> {
    private static final SdkField<String> ACL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ACL")
            .getter(getter(CreateMultipartUploadRequest::aclAsString))
            .setter(setter(Builder::acl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-acl")
                    .unmarshallLocationName("x-amz-acl").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(CreateMultipartUploadRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> CACHE_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CacheControl")
            .getter(getter(CreateMultipartUploadRequest::cacheControl))
            .setter(setter(Builder::cacheControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Cache-Control")
                    .unmarshallLocationName("Cache-Control").build()).build();

    private static final SdkField<String> CONTENT_DISPOSITION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentDisposition")
            .getter(getter(CreateMultipartUploadRequest::contentDisposition))
            .setter(setter(Builder::contentDisposition))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Disposition")
                    .unmarshallLocationName("Content-Disposition").build()).build();

    private static final SdkField<String> CONTENT_ENCODING_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentEncoding")
            .getter(getter(CreateMultipartUploadRequest::contentEncoding))
            .setter(setter(Builder::contentEncoding))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Encoding")
                    .unmarshallLocationName("Content-Encoding").build()).build();

    private static final SdkField<String> CONTENT_LANGUAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentLanguage")
            .getter(getter(CreateMultipartUploadRequest::contentLanguage))
            .setter(setter(Builder::contentLanguage))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Language")
                    .unmarshallLocationName("Content-Language").build()).build();

    private static final SdkField<String> CONTENT_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentType")
            .getter(getter(CreateMultipartUploadRequest::contentType))
            .setter(setter(Builder::contentType))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Type")
                    .unmarshallLocationName("Content-Type").build()).build();

    private static final SdkField<Instant> EXPIRES_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Expires")
            .getter(getter(CreateMultipartUploadRequest::expires))
            .setter(setter(Builder::expires))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Expires")
                    .unmarshallLocationName("Expires").build()).build();

    private static final SdkField<String> GRANT_FULL_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantFullControl")
            .getter(getter(CreateMultipartUploadRequest::grantFullControl))
            .setter(setter(Builder::grantFullControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-full-control")
                    .unmarshallLocationName("x-amz-grant-full-control").build()).build();

    private static final SdkField<String> GRANT_READ_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantRead")
            .getter(getter(CreateMultipartUploadRequest::grantRead))
            .setter(setter(Builder::grantRead))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read")
                    .unmarshallLocationName("x-amz-grant-read").build()).build();

    private static final SdkField<String> GRANT_READ_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantReadACP")
            .getter(getter(CreateMultipartUploadRequest::grantReadACP))
            .setter(setter(Builder::grantReadACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read-acp")
                    .unmarshallLocationName("x-amz-grant-read-acp").build()).build();

    private static final SdkField<String> GRANT_WRITE_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantWriteACP")
            .getter(getter(CreateMultipartUploadRequest::grantWriteACP))
            .setter(setter(Builder::grantWriteACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-write-acp")
                    .unmarshallLocationName("x-amz-grant-write-acp").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(CreateMultipartUploadRequest::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<Map<String, String>> METADATA_FIELD = SdkField
            .<Map<String, String>> builder(MarshallingType.MAP)
            .memberName("Metadata")
            .getter(getter(CreateMultipartUploadRequest::metadata))
            .setter(setter(Builder::metadata))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-meta-")
                    .unmarshallLocationName("x-amz-meta-").build(),
                    MapTrait.builder()
                            .keyLocationName("key")
                            .valueLocationName("value")
                            .valueFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("value").unmarshallLocationName("value").build()).build())
                            .build()).build();

    private static final SdkField<String> SERVER_SIDE_ENCRYPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ServerSideEncryption")
            .getter(getter(CreateMultipartUploadRequest::serverSideEncryptionAsString))
            .setter(setter(Builder::serverSideEncryption))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-server-side-encryption")
                    .unmarshallLocationName("x-amz-server-side-encryption").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(CreateMultipartUploadRequest::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-storage-class")
                    .unmarshallLocationName("x-amz-storage-class").build()).build();

    private static final SdkField<String> WEBSITE_REDIRECT_LOCATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("WebsiteRedirectLocation")
            .getter(getter(CreateMultipartUploadRequest::websiteRedirectLocation))
            .setter(setter(Builder::websiteRedirectLocation))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-website-redirect-location")
                    .unmarshallLocationName("x-amz-website-redirect-location").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(CreateMultipartUploadRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKey")
            .getter(getter(CreateMultipartUploadRequest::sseCustomerKey))
            .setter(setter(Builder::sseCustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(CreateMultipartUploadRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> SSEKMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSKeyId")
            .getter(getter(CreateMultipartUploadRequest::ssekmsKeyId))
            .setter(setter(Builder::ssekmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-aws-kms-key-id")
                    .unmarshallLocationName("x-amz-server-side-encryption-aws-kms-key-id").build()).build();

    private static final SdkField<String> SSEKMS_ENCRYPTION_CONTEXT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSEncryptionContext")
            .getter(getter(CreateMultipartUploadRequest::ssekmsEncryptionContext))
            .setter(setter(Builder::ssekmsEncryptionContext))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-context")
                    .unmarshallLocationName("x-amz-server-side-encryption-context").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(CreateMultipartUploadRequest::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-bucket-key-enabled")
                    .unmarshallLocationName("x-amz-server-side-encryption-bucket-key-enabled").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(CreateMultipartUploadRequest::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final SdkField<String> TAGGING_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Tagging")
            .getter(getter(CreateMultipartUploadRequest::tagging))
            .setter(setter(Builder::tagging))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-tagging")
                    .unmarshallLocationName("x-amz-tagging").build()).build();

    private static final SdkField<String> OBJECT_LOCK_MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockMode")
            .getter(getter(CreateMultipartUploadRequest::objectLockModeAsString))
            .setter(setter(Builder::objectLockMode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-mode")
                    .unmarshallLocationName("x-amz-object-lock-mode").build()).build();

    private static final SdkField<Instant> OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("ObjectLockRetainUntilDate")
            .getter(getter(CreateMultipartUploadRequest::objectLockRetainUntilDate))
            .setter(setter(Builder::objectLockRetainUntilDate))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-retain-until-date")
                    .unmarshallLocationName("x-amz-object-lock-retain-until-date").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final SdkField<String> OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockLegalHoldStatus")
            .getter(getter(CreateMultipartUploadRequest::objectLockLegalHoldStatusAsString))
            .setter(setter(Builder::objectLockLegalHoldStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-legal-hold")
                    .unmarshallLocationName("x-amz-object-lock-legal-hold").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(CreateMultipartUploadRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(CreateMultipartUploadRequest::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-algorithm")
                    .unmarshallLocationName("x-amz-checksum-algorithm").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ACL_FIELD, BUCKET_FIELD,
            CACHE_CONTROL_FIELD, CONTENT_DISPOSITION_FIELD, CONTENT_ENCODING_FIELD, CONTENT_LANGUAGE_FIELD, CONTENT_TYPE_FIELD,
            EXPIRES_FIELD, GRANT_FULL_CONTROL_FIELD, GRANT_READ_FIELD, GRANT_READ_ACP_FIELD, GRANT_WRITE_ACP_FIELD, KEY_FIELD,
            METADATA_FIELD, SERVER_SIDE_ENCRYPTION_FIELD, STORAGE_CLASS_FIELD, WEBSITE_REDIRECT_LOCATION_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD, SSEKMS_KEY_ID_FIELD,
            SSEKMS_ENCRYPTION_CONTEXT_FIELD, BUCKET_KEY_ENABLED_FIELD, REQUEST_PAYER_FIELD, TAGGING_FIELD,
            OBJECT_LOCK_MODE_FIELD, OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD, OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD,
            EXPECTED_BUCKET_OWNER_FIELD, CHECKSUM_ALGORITHM_FIELD));

    private final String acl;

    private final String bucket;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    private final Instant expires;

    private final String grantFullControl;

    private final String grantRead;

    private final String grantReadACP;

    private final String grantWriteACP;

    private final String key;

    private final Map<String, String> metadata;

    private final String serverSideEncryption;

    private final String storageClass;

    private final String websiteRedirectLocation;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKey;

    private final String sseCustomerKeyMD5;

    private final String ssekmsKeyId;

    private final String ssekmsEncryptionContext;

    private final Boolean bucketKeyEnabled;

    private final String requestPayer;

    private final String tagging;

    private final String objectLockMode;

    private final Instant objectLockRetainUntilDate;

    private final String objectLockLegalHoldStatus;

    private final String expectedBucketOwner;

    private final String checksumAlgorithm;

    private CreateMultipartUploadRequest(BuilderImpl builder) {
        super(builder);
        this.acl = builder.acl;
        this.bucket = builder.bucket;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentLanguage = builder.contentLanguage;
        this.contentType = builder.contentType;
        this.expires = builder.expires;
        this.grantFullControl = builder.grantFullControl;
        this.grantRead = builder.grantRead;
        this.grantReadACP = builder.grantReadACP;
        this.grantWriteACP = builder.grantWriteACP;
        this.key = builder.key;
        this.metadata = builder.metadata;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.storageClass = builder.storageClass;
        this.websiteRedirectLocation = builder.websiteRedirectLocation;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKey = builder.sseCustomerKey;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.ssekmsKeyId = builder.ssekmsKeyId;
        this.ssekmsEncryptionContext = builder.ssekmsEncryptionContext;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
        this.requestPayer = builder.requestPayer;
        this.tagging = builder.tagging;
        this.objectLockMode = builder.objectLockMode;
        this.objectLockRetainUntilDate = builder.objectLockRetainUntilDate;
        this.objectLockLegalHoldStatus = builder.objectLockLegalHoldStatus;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.checksumAlgorithm = builder.checksumAlgorithm;
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #acl} will return
     * {@link ObjectCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #aclAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the object.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     * @see ObjectCannedACL
     */
    public final ObjectCannedACL acl() {
        return ObjectCannedACL.fromValue(acl);
    }

    /**
     * <p>
     * The canned ACL to apply to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #acl} will return
     * {@link ObjectCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #aclAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the object.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     * @see ObjectCannedACL
     */
    public final String aclAsString() {
        return acl;
    }

    /**
     * <p>
     * The name of the bucket to which to initiate the upload
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
     * @return The name of the bucket to which to initiate the upload</p>
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
     * Specifies caching behavior along the request/reply chain.
     * </p>
     * 
     * @return Specifies caching behavior along the request/reply chain.
     */
    public final String cacheControl() {
        return cacheControl;
    }

    /**
     * <p>
     * Specifies presentational information for the object.
     * </p>
     * 
     * @return Specifies presentational information for the object.
     */
    public final String contentDisposition() {
        return contentDisposition;
    }

    /**
     * <p>
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be
     * applied to obtain the media-type referenced by the Content-Type header field.
     * </p>
     * 
     * @return Specifies what content encodings have been applied to the object and thus what decoding mechanisms must
     *         be applied to obtain the media-type referenced by the Content-Type header field.
     */
    public final String contentEncoding() {
        return contentEncoding;
    }

    /**
     * <p>
     * The language the content is in.
     * </p>
     * 
     * @return The language the content is in.
     */
    public final String contentLanguage() {
        return contentLanguage;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the object data.
     * </p>
     * 
     * @return A standard MIME type describing the format of the object data.
     */
    public final String contentType() {
        return contentType;
    }

    /**
     * <p>
     * The date and time at which the object is no longer cacheable.
     * </p>
     * 
     * @return The date and time at which the object is no longer cacheable.
     */
    public final Instant expires() {
        return expires;
    }

    /**
     * <p>
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * 
     * @return Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     */
    public final String grantFullControl() {
        return grantFullControl;
    }

    /**
     * <p>
     * Allows grantee to read the object data and its metadata.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * 
     * @return Allows grantee to read the object data and its metadata.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     */
    public final String grantRead() {
        return grantRead;
    }

    /**
     * <p>
     * Allows grantee to read the object ACL.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * 
     * @return Allows grantee to read the object ACL.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     */
    public final String grantReadACP() {
        return grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * 
     * @return Allows grantee to write the ACL for the applicable object.</p>
     *         <p>
     *         This action is not supported by Amazon S3 on Outposts.
     */
    public final String grantWriteACP() {
        return grantWriteACP;
    }

    /**
     * <p>
     * Object key for which the multipart upload is to be initiated.
     * </p>
     * 
     * @return Object key for which the multipart upload is to be initiated.
     */
    public final String key() {
        return key;
    }

    /**
     * For responses, this returns true if the service returned a value for the Metadata property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasMetadata() {
        return metadata != null && !(metadata instanceof SdkAutoConstructMap);
    }

    /**
     * <p>
     * A map of metadata to store with the object in S3.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasMetadata} method.
     * </p>
     * 
     * @return A map of metadata to store with the object in S3.
     */
    public final Map<String, String> metadata() {
        return metadata;
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
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD
     *         storage class provides high durability and high availability. Depending on performance needs, you can
     *         specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
     *         the <i>Amazon S3 User Guide</i>.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD
     *         storage class provides high durability and high availability. Depending on performance needs, you can
     *         specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
     *         the <i>Amazon S3 User Guide</i>.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
    }

    /**
     * <p>
     * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket
     * or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     * </p>
     * 
     * @return If the bucket is configured as a website, redirects requests for this object to another object in the
     *         same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     */
    public final String websiteRedirectLocation() {
        return websiteRedirectLocation;
    }

    /**
     * <p>
     * Specifies the algorithm to use to when encrypting the object (for example, AES256).
     * </p>
     * 
     * @return Specifies the algorithm to use to when encrypting the object (for example, AES256).
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to
     * store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side-encryption-customer-algorithm</code> header.
     * </p>
     * 
     * @return Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is
     *         used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key
     *         must be appropriate for use with the algorithm specified in the
     *         <code>x-amz-server-side-encryption-customer-algorithm</code> header.
     */
    public final String sseCustomerKey() {
        return sseCustomerKey;
    }

    /**
     * <p>
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a
     * message integrity check to ensure that the encryption key was transmitted without error.
     * </p>
     * 
     * @return Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header
     *         for a message integrity check to ensure that the encryption key was transmitted without error.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * <p>
     * Specifies the ID of the symmetric customer managed key to use for object encryption. All GET and PUT requests for
     * an object protected by Amazon Web Services KMS will fail if not made via SSL or using SigV4. For information
     * about configuring using any of the officially supported Amazon Web Services SDKs and Amazon Web Services CLI, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version">Specifying
     * the Signature Version in Request Authentication</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the ID of the symmetric customer managed key to use for object encryption. All GET and PUT
     *         requests for an object protected by Amazon Web Services KMS will fail if not made via SSL or using SigV4.
     *         For information about configuring using any of the officially supported Amazon Web Services SDKs and
     *         Amazon Web Services CLI, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
     *         >Specifying the Signature Version in Request Authentication</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String ssekmsKeyId() {
        return ssekmsKeyId;
    }

    /**
     * <p>
     * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this header
     * is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
     * </p>
     * 
     * @return Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
     *         header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
     */
    public final String ssekmsEncryptionContext() {
        return ssekmsEncryptionContext;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using
     * AWS KMS (SSE-KMS). Setting this header to <code>true</code> causes Amazon S3 to use an S3 Bucket Key for object
     * encryption with SSE-KMS.
     * </p>
     * <p>
     * Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption
     *         using AWS KMS (SSE-KMS). Setting this header to <code>true</code> causes Amazon S3 to use an S3 Bucket
     *         Key for object encryption with SSE-KMS.</p>
     *         <p>
     *         Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
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
     * The tag-set for the object. The tag-set must be encoded as URL Query parameters.
     * </p>
     * 
     * @return The tag-set for the object. The tag-set must be encoded as URL Query parameters.
     */
    public final String tagging() {
        return tagging;
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return Specifies the Object Lock mode that you want to apply to the uploaded object.
     * @see ObjectLockMode
     */
    public final ObjectLockMode objectLockMode() {
        return ObjectLockMode.fromValue(objectLockMode);
    }

    /**
     * <p>
     * Specifies the Object Lock mode that you want to apply to the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return Specifies the Object Lock mode that you want to apply to the uploaded object.
     * @see ObjectLockMode
     */
    public final String objectLockModeAsString() {
        return objectLockMode;
    }

    /**
     * <p>
     * Specifies the date and time when you want the Object Lock to expire.
     * </p>
     * 
     * @return Specifies the date and time when you want the Object Lock to expire.
     */
    public final Instant objectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * Specifies whether you want to apply a legal hold to the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Specifies whether you want to apply a legal hold to the uploaded object.
     * @see ObjectLockLegalHoldStatus
     */
    public final ObjectLockLegalHoldStatus objectLockLegalHoldStatus() {
        return ObjectLockLegalHoldStatus.fromValue(objectLockLegalHoldStatus);
    }

    /**
     * <p>
     * Specifies whether you want to apply a legal hold to the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Specifies whether you want to apply a legal hold to the uploaded object.
     * @see ObjectLockLegalHoldStatus
     */
    public final String objectLockLegalHoldStatusAsString() {
        return objectLockLegalHoldStatus;
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
     * Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     * object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     * object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
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
        hashCode = 31 * hashCode + Objects.hashCode(aclAsString());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(cacheControl());
        hashCode = 31 * hashCode + Objects.hashCode(contentDisposition());
        hashCode = 31 * hashCode + Objects.hashCode(contentEncoding());
        hashCode = 31 * hashCode + Objects.hashCode(contentLanguage());
        hashCode = 31 * hashCode + Objects.hashCode(contentType());
        hashCode = 31 * hashCode + Objects.hashCode(expires());
        hashCode = 31 * hashCode + Objects.hashCode(grantFullControl());
        hashCode = 31 * hashCode + Objects.hashCode(grantRead());
        hashCode = 31 * hashCode + Objects.hashCode(grantReadACP());
        hashCode = 31 * hashCode + Objects.hashCode(grantWriteACP());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(hasMetadata() ? metadata() : null);
        hashCode = 31 * hashCode + Objects.hashCode(serverSideEncryptionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(websiteRedirectLocation());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsEncryptionContext());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
        hashCode = 31 * hashCode + Objects.hashCode(tagging());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockModeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockRetainUntilDate());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockLegalHoldStatusAsString());
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
        if (!(obj instanceof CreateMultipartUploadRequest)) {
            return false;
        }
        CreateMultipartUploadRequest other = (CreateMultipartUploadRequest) obj;
        return Objects.equals(aclAsString(), other.aclAsString()) && Objects.equals(bucket(), other.bucket())
                && Objects.equals(cacheControl(), other.cacheControl())
                && Objects.equals(contentDisposition(), other.contentDisposition())
                && Objects.equals(contentEncoding(), other.contentEncoding())
                && Objects.equals(contentLanguage(), other.contentLanguage())
                && Objects.equals(contentType(), other.contentType()) && Objects.equals(expires(), other.expires())
                && Objects.equals(grantFullControl(), other.grantFullControl()) && Objects.equals(grantRead(), other.grantRead())
                && Objects.equals(grantReadACP(), other.grantReadACP()) && Objects.equals(grantWriteACP(), other.grantWriteACP())
                && Objects.equals(key(), other.key()) && hasMetadata() == other.hasMetadata()
                && Objects.equals(metadata(), other.metadata())
                && Objects.equals(serverSideEncryptionAsString(), other.serverSideEncryptionAsString())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(websiteRedirectLocation(), other.websiteRedirectLocation())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKey(), other.sseCustomerKey())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(ssekmsKeyId(), other.ssekmsKeyId())
                && Objects.equals(ssekmsEncryptionContext(), other.ssekmsEncryptionContext())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString())
                && Objects.equals(tagging(), other.tagging())
                && Objects.equals(objectLockModeAsString(), other.objectLockModeAsString())
                && Objects.equals(objectLockRetainUntilDate(), other.objectLockRetainUntilDate())
                && Objects.equals(objectLockLegalHoldStatusAsString(), other.objectLockLegalHoldStatusAsString())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CreateMultipartUploadRequest").add("ACL", aclAsString()).add("Bucket", bucket())
                .add("CacheControl", cacheControl()).add("ContentDisposition", contentDisposition())
                .add("ContentEncoding", contentEncoding()).add("ContentLanguage", contentLanguage())
                .add("ContentType", contentType()).add("Expires", expires()).add("GrantFullControl", grantFullControl())
                .add("GrantRead", grantRead()).add("GrantReadACP", grantReadACP()).add("GrantWriteACP", grantWriteACP())
                .add("Key", key()).add("Metadata", hasMetadata() ? metadata() : null)
                .add("ServerSideEncryption", serverSideEncryptionAsString()).add("StorageClass", storageClassAsString())
                .add("WebsiteRedirectLocation", websiteRedirectLocation()).add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKey", sseCustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5())
                .add("SSEKMSKeyId", ssekmsKeyId() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSEKMSEncryptionContext", ssekmsEncryptionContext() == null ? null : "*** Sensitive Data Redacted ***")
                .add("BucketKeyEnabled", bucketKeyEnabled()).add("RequestPayer", requestPayerAsString())
                .add("Tagging", tagging()).add("ObjectLockMode", objectLockModeAsString())
                .add("ObjectLockRetainUntilDate", objectLockRetainUntilDate())
                .add("ObjectLockLegalHoldStatus", objectLockLegalHoldStatusAsString())
                .add("ExpectedBucketOwner", expectedBucketOwner()).add("ChecksumAlgorithm", checksumAlgorithmAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ACL":
            return Optional.ofNullable(clazz.cast(aclAsString()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "CacheControl":
            return Optional.ofNullable(clazz.cast(cacheControl()));
        case "ContentDisposition":
            return Optional.ofNullable(clazz.cast(contentDisposition()));
        case "ContentEncoding":
            return Optional.ofNullable(clazz.cast(contentEncoding()));
        case "ContentLanguage":
            return Optional.ofNullable(clazz.cast(contentLanguage()));
        case "ContentType":
            return Optional.ofNullable(clazz.cast(contentType()));
        case "Expires":
            return Optional.ofNullable(clazz.cast(expires()));
        case "GrantFullControl":
            return Optional.ofNullable(clazz.cast(grantFullControl()));
        case "GrantRead":
            return Optional.ofNullable(clazz.cast(grantRead()));
        case "GrantReadACP":
            return Optional.ofNullable(clazz.cast(grantReadACP()));
        case "GrantWriteACP":
            return Optional.ofNullable(clazz.cast(grantWriteACP()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "Metadata":
            return Optional.ofNullable(clazz.cast(metadata()));
        case "ServerSideEncryption":
            return Optional.ofNullable(clazz.cast(serverSideEncryptionAsString()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "WebsiteRedirectLocation":
            return Optional.ofNullable(clazz.cast(websiteRedirectLocation()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKey":
            return Optional.ofNullable(clazz.cast(sseCustomerKey()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "SSEKMSKeyId":
            return Optional.ofNullable(clazz.cast(ssekmsKeyId()));
        case "SSEKMSEncryptionContext":
            return Optional.ofNullable(clazz.cast(ssekmsEncryptionContext()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
        case "Tagging":
            return Optional.ofNullable(clazz.cast(tagging()));
        case "ObjectLockMode":
            return Optional.ofNullable(clazz.cast(objectLockModeAsString()));
        case "ObjectLockRetainUntilDate":
            return Optional.ofNullable(clazz.cast(objectLockRetainUntilDate()));
        case "ObjectLockLegalHoldStatus":
            return Optional.ofNullable(clazz.cast(objectLockLegalHoldStatusAsString()));
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

    private static <T> Function<Object, T> getter(Function<CreateMultipartUploadRequest, T> g) {
        return obj -> g.apply((CreateMultipartUploadRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, CreateMultipartUploadRequest> {
        /**
         * <p>
         * The canned ACL to apply to the object.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param acl
         *        The canned ACL to apply to the object.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @see ObjectCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectCannedACL
         */
        Builder acl(String acl);

        /**
         * <p>
         * The canned ACL to apply to the object.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param acl
         *        The canned ACL to apply to the object.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @see ObjectCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectCannedACL
         */
        Builder acl(ObjectCannedACL acl);

        /**
         * <p>
         * The name of the bucket to which to initiate the upload
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
         *        The name of the bucket to which to initiate the upload</p>
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
         * Specifies caching behavior along the request/reply chain.
         * </p>
         * 
         * @param cacheControl
         *        Specifies caching behavior along the request/reply chain.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder cacheControl(String cacheControl);

        /**
         * <p>
         * Specifies presentational information for the object.
         * </p>
         * 
         * @param contentDisposition
         *        Specifies presentational information for the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentDisposition(String contentDisposition);

        /**
         * <p>
         * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be
         * applied to obtain the media-type referenced by the Content-Type header field.
         * </p>
         * 
         * @param contentEncoding
         *        Specifies what content encodings have been applied to the object and thus what decoding mechanisms
         *        must be applied to obtain the media-type referenced by the Content-Type header field.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentEncoding(String contentEncoding);

        /**
         * <p>
         * The language the content is in.
         * </p>
         * 
         * @param contentLanguage
         *        The language the content is in.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentLanguage(String contentLanguage);

        /**
         * <p>
         * A standard MIME type describing the format of the object data.
         * </p>
         * 
         * @param contentType
         *        A standard MIME type describing the format of the object data.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentType(String contentType);

        /**
         * <p>
         * The date and time at which the object is no longer cacheable.
         * </p>
         * 
         * @param expires
         *        The date and time at which the object is no longer cacheable.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expires(Instant expires);

        /**
         * <p>
         * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param grantFullControl
         *        Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantFullControl(String grantFullControl);

        /**
         * <p>
         * Allows grantee to read the object data and its metadata.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param grantRead
         *        Allows grantee to read the object data and its metadata.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantRead(String grantRead);

        /**
         * <p>
         * Allows grantee to read the object ACL.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param grantReadACP
         *        Allows grantee to read the object ACL.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantReadACP(String grantReadACP);

        /**
         * <p>
         * Allows grantee to write the ACL for the applicable object.
         * </p>
         * <p>
         * This action is not supported by Amazon S3 on Outposts.
         * </p>
         * 
         * @param grantWriteACP
         *        Allows grantee to write the ACL for the applicable object.</p>
         *        <p>
         *        This action is not supported by Amazon S3 on Outposts.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantWriteACP(String grantWriteACP);

        /**
         * <p>
         * Object key for which the multipart upload is to be initiated.
         * </p>
         * 
         * @param key
         *        Object key for which the multipart upload is to be initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * A map of metadata to store with the object in S3.
         * </p>
         * 
         * @param metadata
         *        A map of metadata to store with the object in S3.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder metadata(Map<String, String> metadata);

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
         * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage
         * class provides high durability and high availability. Depending on performance needs, you can specify a
         * different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information,
         * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
         * the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param storageClass
         *        By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD
         *        storage class provides high durability and high availability. Depending on performance needs, you can
         *        specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
         *        the <i>Amazon S3 User Guide</i>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage
         * class provides high durability and high availability. Depending on performance needs, you can specify a
         * different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information,
         * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
         * the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param storageClass
         *        By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD
         *        storage class provides high durability and high availability. Depending on performance needs, you can
         *        specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in
         *        the <i>Amazon S3 User Guide</i>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

        /**
         * <p>
         * If the bucket is configured as a website, redirects requests for this object to another object in the same
         * bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
         * </p>
         * 
         * @param websiteRedirectLocation
         *        If the bucket is configured as a website, redirects requests for this object to another object in the
         *        same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder websiteRedirectLocation(String websiteRedirectLocation);

        /**
         * <p>
         * Specifies the algorithm to use to when encrypting the object (for example, AES256).
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        Specifies the algorithm to use to when encrypting the object (for example, AES256).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to
         * store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be
         * appropriate for use with the algorithm specified in the
         * <code>x-amz-server-side-encryption-customer-algorithm</code> header.
         * </p>
         * 
         * @param sseCustomerKey
         *        Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is
         *        used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The
         *        key must be appropriate for use with the algorithm specified in the
         *        <code>x-amz-server-side-encryption-customer-algorithm</code> header.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKey(String sseCustomerKey);

        /**
         * <p>
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for
         * a message integrity check to ensure that the encryption key was transmitted without error.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this
         *        header for a message integrity check to ensure that the encryption key was transmitted without error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        /**
         * <p>
         * Specifies the ID of the symmetric customer managed key to use for object encryption. All GET and PUT requests
         * for an object protected by Amazon Web Services KMS will fail if not made via SSL or using SigV4. For
         * information about configuring using any of the officially supported Amazon Web Services SDKs and Amazon Web
         * Services CLI, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version">Specifying
         * the Signature Version in Request Authentication</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param ssekmsKeyId
         *        Specifies the ID of the symmetric customer managed key to use for object encryption. All GET and PUT
         *        requests for an object protected by Amazon Web Services KMS will fail if not made via SSL or using
         *        SigV4. For information about configuring using any of the officially supported Amazon Web Services
         *        SDKs and Amazon Web Services CLI, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version"
         *        >Specifying the Signature Version in Request Authentication</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsKeyId(String ssekmsKeyId);

        /**
         * <p>
         * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
         * header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
         * </p>
         * 
         * @param ssekmsEncryptionContext
         *        Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of
         *        this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsEncryptionContext(String ssekmsEncryptionContext);

        /**
         * <p>
         * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption
         * using AWS KMS (SSE-KMS). Setting this header to <code>true</code> causes Amazon S3 to use an S3 Bucket Key
         * for object encryption with SSE-KMS.
         * </p>
         * <p>
         * Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side
         *        encryption using AWS KMS (SSE-KMS). Setting this header to <code>true</code> causes Amazon S3 to use
         *        an S3 Bucket Key for object encryption with SSE-KMS.</p>
         *        <p>
         *        Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);

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
         * The tag-set for the object. The tag-set must be encoded as URL Query parameters.
         * </p>
         * 
         * @param tagging
         *        The tag-set for the object. The tag-set must be encoded as URL Query parameters.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagging(String tagging);

        Builder tagging(Tagging tagging);

        /**
         * <p>
         * Specifies the Object Lock mode that you want to apply to the uploaded object.
         * </p>
         * 
         * @param objectLockMode
         *        Specifies the Object Lock mode that you want to apply to the uploaded object.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(String objectLockMode);

        /**
         * <p>
         * Specifies the Object Lock mode that you want to apply to the uploaded object.
         * </p>
         * 
         * @param objectLockMode
         *        Specifies the Object Lock mode that you want to apply to the uploaded object.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(ObjectLockMode objectLockMode);

        /**
         * <p>
         * Specifies the date and time when you want the Object Lock to expire.
         * </p>
         * 
         * @param objectLockRetainUntilDate
         *        Specifies the date and time when you want the Object Lock to expire.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectLockRetainUntilDate(Instant objectLockRetainUntilDate);

        /**
         * <p>
         * Specifies whether you want to apply a legal hold to the uploaded object.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Specifies whether you want to apply a legal hold to the uploaded object.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus);

        /**
         * <p>
         * Specifies whether you want to apply a legal hold to the uploaded object.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Specifies whether you want to apply a legal hold to the uploaded object.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus);

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
         * Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
         *        information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm you want Amazon S3 to use to create the checksum for the object. For more
         *        information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
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
        private String acl;

        private String bucket;

        private String cacheControl;

        private String contentDisposition;

        private String contentEncoding;

        private String contentLanguage;

        private String contentType;

        private Instant expires;

        private String grantFullControl;

        private String grantRead;

        private String grantReadACP;

        private String grantWriteACP;

        private String key;

        private Map<String, String> metadata = DefaultSdkAutoConstructMap.getInstance();

        private String serverSideEncryption;

        private String storageClass;

        private String websiteRedirectLocation;

        private String sseCustomerAlgorithm;

        private String sseCustomerKey;

        private String sseCustomerKeyMD5;

        private String ssekmsKeyId;

        private String ssekmsEncryptionContext;

        private Boolean bucketKeyEnabled;

        private String requestPayer;

        private String tagging;

        private String objectLockMode;

        private Instant objectLockRetainUntilDate;

        private String objectLockLegalHoldStatus;

        private String expectedBucketOwner;

        private String checksumAlgorithm;

        private BuilderImpl() {
        }

        private BuilderImpl(CreateMultipartUploadRequest model) {
            super(model);
            acl(model.acl);
            bucket(model.bucket);
            cacheControl(model.cacheControl);
            contentDisposition(model.contentDisposition);
            contentEncoding(model.contentEncoding);
            contentLanguage(model.contentLanguage);
            contentType(model.contentType);
            expires(model.expires);
            grantFullControl(model.grantFullControl);
            grantRead(model.grantRead);
            grantReadACP(model.grantReadACP);
            grantWriteACP(model.grantWriteACP);
            key(model.key);
            metadata(model.metadata);
            serverSideEncryption(model.serverSideEncryption);
            storageClass(model.storageClass);
            websiteRedirectLocation(model.websiteRedirectLocation);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKey(model.sseCustomerKey);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            ssekmsKeyId(model.ssekmsKeyId);
            ssekmsEncryptionContext(model.ssekmsEncryptionContext);
            bucketKeyEnabled(model.bucketKeyEnabled);
            requestPayer(model.requestPayer);
            tagging(model.tagging);
            objectLockMode(model.objectLockMode);
            objectLockRetainUntilDate(model.objectLockRetainUntilDate);
            objectLockLegalHoldStatus(model.objectLockLegalHoldStatus);
            expectedBucketOwner(model.expectedBucketOwner);
            checksumAlgorithm(model.checksumAlgorithm);
        }

        public final String getAcl() {
            return acl;
        }

        public final void setAcl(String acl) {
            this.acl = acl;
        }

        @Override
        public final Builder acl(String acl) {
            this.acl = acl;
            return this;
        }

        @Override
        public final Builder acl(ObjectCannedACL acl) {
            this.acl(acl == null ? null : acl.toString());
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

        public final String getCacheControl() {
            return cacheControl;
        }

        public final void setCacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
        }

        @Override
        public final Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        public final String getContentDisposition() {
            return contentDisposition;
        }

        public final void setContentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
        }

        @Override
        public final Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        public final String getContentEncoding() {
            return contentEncoding;
        }

        public final void setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
        }

        @Override
        public final Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        public final String getContentLanguage() {
            return contentLanguage;
        }

        public final void setContentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
        }

        @Override
        public final Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        public final String getContentType() {
            return contentType;
        }

        public final void setContentType(String contentType) {
            this.contentType = contentType;
        }

        @Override
        public final Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public final Instant getExpires() {
            return expires;
        }

        public final void setExpires(Instant expires) {
            this.expires = expires;
        }

        @Override
        public final Builder expires(Instant expires) {
            this.expires = expires;
            return this;
        }

        public final String getGrantFullControl() {
            return grantFullControl;
        }

        public final void setGrantFullControl(String grantFullControl) {
            this.grantFullControl = grantFullControl;
        }

        @Override
        public final Builder grantFullControl(String grantFullControl) {
            this.grantFullControl = grantFullControl;
            return this;
        }

        public final String getGrantRead() {
            return grantRead;
        }

        public final void setGrantRead(String grantRead) {
            this.grantRead = grantRead;
        }

        @Override
        public final Builder grantRead(String grantRead) {
            this.grantRead = grantRead;
            return this;
        }

        public final String getGrantReadACP() {
            return grantReadACP;
        }

        public final void setGrantReadACP(String grantReadACP) {
            this.grantReadACP = grantReadACP;
        }

        @Override
        public final Builder grantReadACP(String grantReadACP) {
            this.grantReadACP = grantReadACP;
            return this;
        }

        public final String getGrantWriteACP() {
            return grantWriteACP;
        }

        public final void setGrantWriteACP(String grantWriteACP) {
            this.grantWriteACP = grantWriteACP;
        }

        @Override
        public final Builder grantWriteACP(String grantWriteACP) {
            this.grantWriteACP = grantWriteACP;
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

        public final Map<String, String> getMetadata() {
            if (metadata instanceof SdkAutoConstructMap) {
                return null;
            }
            return metadata;
        }

        public final void setMetadata(Map<String, String> metadata) {
            this.metadata = MetadataCopier.copy(metadata);
        }

        @Override
        public final Builder metadata(Map<String, String> metadata) {
            this.metadata = MetadataCopier.copy(metadata);
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

        public final String getWebsiteRedirectLocation() {
            return websiteRedirectLocation;
        }

        public final void setWebsiteRedirectLocation(String websiteRedirectLocation) {
            this.websiteRedirectLocation = websiteRedirectLocation;
        }

        @Override
        public final Builder websiteRedirectLocation(String websiteRedirectLocation) {
            this.websiteRedirectLocation = websiteRedirectLocation;
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

        public final String getTagging() {
            return tagging;
        }

        public final void setTagging(String tagging) {
            this.tagging = tagging;
        }

        @Override
        public final Builder tagging(String tagging) {
            this.tagging = tagging;
            return this;
        }

        public Builder tagging(Tagging tagging) {
            tagging(TaggingAdapter.instance().adapt(tagging));
            return this;
        }

        public final String getObjectLockMode() {
            return objectLockMode;
        }

        public final void setObjectLockMode(String objectLockMode) {
            this.objectLockMode = objectLockMode;
        }

        @Override
        public final Builder objectLockMode(String objectLockMode) {
            this.objectLockMode = objectLockMode;
            return this;
        }

        @Override
        public final Builder objectLockMode(ObjectLockMode objectLockMode) {
            this.objectLockMode(objectLockMode == null ? null : objectLockMode.toString());
            return this;
        }

        public final Instant getObjectLockRetainUntilDate() {
            return objectLockRetainUntilDate;
        }

        public final void setObjectLockRetainUntilDate(Instant objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        }

        @Override
        public final Builder objectLockRetainUntilDate(Instant objectLockRetainUntilDate) {
            this.objectLockRetainUntilDate = objectLockRetainUntilDate;
            return this;
        }

        public final String getObjectLockLegalHoldStatus() {
            return objectLockLegalHoldStatus;
        }

        public final void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        }

        @Override
        public final Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
            return this;
        }

        @Override
        public final Builder objectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
            this.objectLockLegalHoldStatus(objectLockLegalHoldStatus == null ? null : objectLockLegalHoldStatus.toString());
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
        public CreateMultipartUploadRequest build() {
            return new CreateMultipartUploadRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
