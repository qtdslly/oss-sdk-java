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
public final class WriteGetObjectResponseRequest extends S3Request implements
        ToCopyableBuilder<WriteGetObjectResponseRequest.Builder, WriteGetObjectResponseRequest> {
    private static final SdkField<String> REQUEST_ROUTE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestRoute")
            .getter(getter(WriteGetObjectResponseRequest::requestRoute))
            .setter(setter(Builder::requestRoute))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-route")
                    .unmarshallLocationName("x-amz-request-route").build()).build();

    private static final SdkField<String> REQUEST_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestToken")
            .getter(getter(WriteGetObjectResponseRequest::requestToken))
            .setter(setter(Builder::requestToken))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-token")
                    .unmarshallLocationName("x-amz-request-token").build()).build();

    private static final SdkField<Integer> STATUS_CODE_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("StatusCode")
            .getter(getter(WriteGetObjectResponseRequest::statusCode))
            .setter(setter(Builder::statusCode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-status")
                    .unmarshallLocationName("x-amz-fwd-status").build()).build();

    private static final SdkField<String> ERROR_CODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ErrorCode")
            .getter(getter(WriteGetObjectResponseRequest::errorCode))
            .setter(setter(Builder::errorCode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-error-code")
                    .unmarshallLocationName("x-amz-fwd-error-code").build()).build();

    private static final SdkField<String> ERROR_MESSAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ErrorMessage")
            .getter(getter(WriteGetObjectResponseRequest::errorMessage))
            .setter(setter(Builder::errorMessage))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-error-message")
                    .unmarshallLocationName("x-amz-fwd-error-message").build()).build();

    private static final SdkField<String> ACCEPT_RANGES_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AcceptRanges")
            .getter(getter(WriteGetObjectResponseRequest::acceptRanges))
            .setter(setter(Builder::acceptRanges))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-accept-ranges")
                    .unmarshallLocationName("x-amz-fwd-header-accept-ranges").build()).build();

    private static final SdkField<String> CACHE_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CacheControl")
            .getter(getter(WriteGetObjectResponseRequest::cacheControl))
            .setter(setter(Builder::cacheControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Cache-Control")
                    .unmarshallLocationName("x-amz-fwd-header-Cache-Control").build()).build();

    private static final SdkField<String> CONTENT_DISPOSITION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentDisposition")
            .getter(getter(WriteGetObjectResponseRequest::contentDisposition))
            .setter(setter(Builder::contentDisposition))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-Content-Disposition")
                    .unmarshallLocationName("x-amz-fwd-header-Content-Disposition").build()).build();

    private static final SdkField<String> CONTENT_ENCODING_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentEncoding")
            .getter(getter(WriteGetObjectResponseRequest::contentEncoding))
            .setter(setter(Builder::contentEncoding))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Content-Encoding")
                    .unmarshallLocationName("x-amz-fwd-header-Content-Encoding").build()).build();

    private static final SdkField<String> CONTENT_LANGUAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentLanguage")
            .getter(getter(WriteGetObjectResponseRequest::contentLanguage))
            .setter(setter(Builder::contentLanguage))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Content-Language")
                    .unmarshallLocationName("x-amz-fwd-header-Content-Language").build()).build();

    private static final SdkField<Long> CONTENT_LENGTH_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ContentLength")
            .getter(getter(WriteGetObjectResponseRequest::contentLength))
            .setter(setter(Builder::contentLength))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Length")
                    .unmarshallLocationName("Content-Length").build()).build();

    private static final SdkField<String> CONTENT_RANGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentRange")
            .getter(getter(WriteGetObjectResponseRequest::contentRange))
            .setter(setter(Builder::contentRange))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Content-Range")
                    .unmarshallLocationName("x-amz-fwd-header-Content-Range").build()).build();

    private static final SdkField<String> CONTENT_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentType")
            .getter(getter(WriteGetObjectResponseRequest::contentType))
            .setter(setter(Builder::contentType))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Content-Type")
                    .unmarshallLocationName("x-amz-fwd-header-Content-Type").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32")
            .getter(getter(WriteGetObjectResponseRequest::checksumCRC32))
            .setter(setter(Builder::checksumCRC32))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-checksum-crc32")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-checksum-crc32").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_C_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32C")
            .getter(getter(WriteGetObjectResponseRequest::checksumCRC32C))
            .setter(setter(Builder::checksumCRC32C))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-checksum-crc32c")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-checksum-crc32c").build()).build();

    private static final SdkField<String> CHECKSUM_SHA1_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA1")
            .getter(getter(WriteGetObjectResponseRequest::checksumSHA1))
            .setter(setter(Builder::checksumSHA1))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-checksum-sha1")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-checksum-sha1").build()).build();

    private static final SdkField<String> CHECKSUM_SHA256_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA256")
            .getter(getter(WriteGetObjectResponseRequest::checksumSHA256))
            .setter(setter(Builder::checksumSHA256))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-checksum-sha256")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-checksum-sha256").build()).build();

    private static final SdkField<Boolean> DELETE_MARKER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("DeleteMarker")
            .getter(getter(WriteGetObjectResponseRequest::deleteMarker))
            .setter(setter(Builder::deleteMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-delete-marker")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-delete-marker").build()).build();

    private static final SdkField<String> E_TAG_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ETag")
            .getter(getter(WriteGetObjectResponseRequest::eTag))
            .setter(setter(Builder::eTag))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-ETag")
                    .unmarshallLocationName("x-amz-fwd-header-ETag").build()).build();

    private static final SdkField<Instant> EXPIRES_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Expires")
            .getter(getter(WriteGetObjectResponseRequest::expires))
            .setter(setter(Builder::expires))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Expires")
                    .unmarshallLocationName("x-amz-fwd-header-Expires").build()).build();

    private static final SdkField<String> EXPIRATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Expiration")
            .getter(getter(WriteGetObjectResponseRequest::expiration))
            .setter(setter(Builder::expiration))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-x-amz-expiration")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-expiration").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(WriteGetObjectResponseRequest::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-Last-Modified")
                    .unmarshallLocationName("x-amz-fwd-header-Last-Modified").build()).build();

    private static final SdkField<Integer> MISSING_META_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MissingMeta")
            .getter(getter(WriteGetObjectResponseRequest::missingMeta))
            .setter(setter(Builder::missingMeta))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-x-amz-missing-meta")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-missing-meta").build()).build();

    private static final SdkField<Map<String, String>> METADATA_FIELD = SdkField
            .<Map<String, String>> builder(MarshallingType.MAP)
            .memberName("Metadata")
            .getter(getter(WriteGetObjectResponseRequest::metadata))
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

    private static final SdkField<String> OBJECT_LOCK_MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockMode")
            .getter(getter(WriteGetObjectResponseRequest::objectLockModeAsString))
            .setter(setter(Builder::objectLockMode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-object-lock-mode")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-object-lock-mode").build()).build();

    private static final SdkField<String> OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockLegalHoldStatus")
            .getter(getter(WriteGetObjectResponseRequest::objectLockLegalHoldStatusAsString))
            .setter(setter(Builder::objectLockLegalHoldStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-object-lock-legal-hold")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-object-lock-legal-hold").build()).build();

    private static final SdkField<Instant> OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("ObjectLockRetainUntilDate")
            .getter(getter(WriteGetObjectResponseRequest::objectLockRetainUntilDate))
            .setter(setter(Builder::objectLockRetainUntilDate))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-object-lock-retain-until-date")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-object-lock-retain-until-date").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final SdkField<Integer> PARTS_COUNT_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartsCount")
            .getter(getter(WriteGetObjectResponseRequest::partsCount))
            .setter(setter(Builder::partsCount))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-mp-parts-count")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-mp-parts-count").build()).build();

    private static final SdkField<String> REPLICATION_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ReplicationStatus")
            .getter(getter(WriteGetObjectResponseRequest::replicationStatusAsString))
            .setter(setter(Builder::replicationStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-replication-status")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-replication-status").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(WriteGetObjectResponseRequest::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-request-charged")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-request-charged").build()).build();

    private static final SdkField<String> RESTORE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Restore")
            .getter(getter(WriteGetObjectResponseRequest::restore))
            .setter(setter(Builder::restore))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-x-amz-restore")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-restore").build()).build();

    private static final SdkField<String> SERVER_SIDE_ENCRYPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ServerSideEncryption")
            .getter(getter(WriteGetObjectResponseRequest::serverSideEncryptionAsString))
            .setter(setter(Builder::serverSideEncryption))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-server-side-encryption")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-server-side-encryption").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(WriteGetObjectResponseRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSEKMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSKeyId")
            .getter(getter(WriteGetObjectResponseRequest::ssekmsKeyId))
            .setter(setter(Builder::ssekmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-server-side-encryption-aws-kms-key-id")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-server-side-encryption-aws-kms-key-id").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(WriteGetObjectResponseRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(WriteGetObjectResponseRequest::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-storage-class")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-storage-class").build()).build();

    private static final SdkField<Integer> TAG_COUNT_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("TagCount")
            .getter(getter(WriteGetObjectResponseRequest::tagCount))
            .setter(setter(Builder::tagCount))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-tagging-count")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-tagging-count").build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(WriteGetObjectResponseRequest::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-fwd-header-x-amz-version-id")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-version-id").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(WriteGetObjectResponseRequest::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-fwd-header-x-amz-server-side-encryption-bucket-key-enabled")
                    .unmarshallLocationName("x-amz-fwd-header-x-amz-server-side-encryption-bucket-key-enabled").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(REQUEST_ROUTE_FIELD,
            REQUEST_TOKEN_FIELD, STATUS_CODE_FIELD, ERROR_CODE_FIELD, ERROR_MESSAGE_FIELD, ACCEPT_RANGES_FIELD,
            CACHE_CONTROL_FIELD, CONTENT_DISPOSITION_FIELD, CONTENT_ENCODING_FIELD, CONTENT_LANGUAGE_FIELD, CONTENT_LENGTH_FIELD,
            CONTENT_RANGE_FIELD, CONTENT_TYPE_FIELD, CHECKSUM_CRC32_FIELD, CHECKSUM_CRC32_C_FIELD, CHECKSUM_SHA1_FIELD,
            CHECKSUM_SHA256_FIELD, DELETE_MARKER_FIELD, E_TAG_FIELD, EXPIRES_FIELD, EXPIRATION_FIELD, LAST_MODIFIED_FIELD,
            MISSING_META_FIELD, METADATA_FIELD, OBJECT_LOCK_MODE_FIELD, OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD,
            OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD, PARTS_COUNT_FIELD, REPLICATION_STATUS_FIELD, REQUEST_CHARGED_FIELD,
            RESTORE_FIELD, SERVER_SIDE_ENCRYPTION_FIELD, SSE_CUSTOMER_ALGORITHM_FIELD, SSEKMS_KEY_ID_FIELD,
            SSE_CUSTOMER_KEY_MD5_FIELD, STORAGE_CLASS_FIELD, TAG_COUNT_FIELD, VERSION_ID_FIELD, BUCKET_KEY_ENABLED_FIELD));

    private final String requestRoute;

    private final String requestToken;

    private final Integer statusCode;

    private final String errorCode;

    private final String errorMessage;

    private final String acceptRanges;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final Long contentLength;

    private final String contentRange;

    private final String contentType;

    private final String checksumCRC32;

    private final String checksumCRC32C;

    private final String checksumSHA1;

    private final String checksumSHA256;

    private final Boolean deleteMarker;

    private final String eTag;

    private final Instant expires;

    private final String expiration;

    private final Instant lastModified;

    private final Integer missingMeta;

    private final Map<String, String> metadata;

    private final String objectLockMode;

    private final String objectLockLegalHoldStatus;

    private final Instant objectLockRetainUntilDate;

    private final Integer partsCount;

    private final String replicationStatus;

    private final String requestCharged;

    private final String restore;

    private final String serverSideEncryption;

    private final String sseCustomerAlgorithm;

    private final String ssekmsKeyId;

    private final String sseCustomerKeyMD5;

    private final String storageClass;

    private final Integer tagCount;

    private final String versionId;

    private final Boolean bucketKeyEnabled;

    private WriteGetObjectResponseRequest(BuilderImpl builder) {
        super(builder);
        this.requestRoute = builder.requestRoute;
        this.requestToken = builder.requestToken;
        this.statusCode = builder.statusCode;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.acceptRanges = builder.acceptRanges;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentLanguage = builder.contentLanguage;
        this.contentLength = builder.contentLength;
        this.contentRange = builder.contentRange;
        this.contentType = builder.contentType;
        this.checksumCRC32 = builder.checksumCRC32;
        this.checksumCRC32C = builder.checksumCRC32C;
        this.checksumSHA1 = builder.checksumSHA1;
        this.checksumSHA256 = builder.checksumSHA256;
        this.deleteMarker = builder.deleteMarker;
        this.eTag = builder.eTag;
        this.expires = builder.expires;
        this.expiration = builder.expiration;
        this.lastModified = builder.lastModified;
        this.missingMeta = builder.missingMeta;
        this.metadata = builder.metadata;
        this.objectLockMode = builder.objectLockMode;
        this.objectLockLegalHoldStatus = builder.objectLockLegalHoldStatus;
        this.objectLockRetainUntilDate = builder.objectLockRetainUntilDate;
        this.partsCount = builder.partsCount;
        this.replicationStatus = builder.replicationStatus;
        this.requestCharged = builder.requestCharged;
        this.restore = builder.restore;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.ssekmsKeyId = builder.ssekmsKeyId;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.storageClass = builder.storageClass;
        this.tagCount = builder.tagCount;
        this.versionId = builder.versionId;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
    }

    /**
     * <p>
     * Route prefix to the HTTP URL generated.
     * </p>
     * 
     * @return Route prefix to the HTTP URL generated.
     */
    public final String requestRoute() {
        return requestRoute;
    }

    /**
     * <p>
     * A single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user <code>GetObject</code>
     * request.
     * </p>
     * 
     * @return A single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user
     *         <code>GetObject</code> request.
     */
    public final String requestToken() {
        return requestToken;
    }

    /**
     * <p>
     * The integer status code for an HTTP response of a corresponding <code>GetObject</code> request.
     * </p>
     * <p class="title">
     * <b>Status Codes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>200 - OK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>206 - Partial Content</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>304 - Not Modified</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>400 - Bad Request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>401 - Unauthorized</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>403 - Forbidden</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>404 - Not Found</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>405 - Method Not Allowed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>409 - Conflict</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>411 - Length Required</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>412 - Precondition Failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>416 - Range Not Satisfiable</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>500 - Internal Server Error</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>503 - Service Unavailable</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The integer status code for an HTTP response of a corresponding <code>GetObject</code> request.</p>
     *         <p class="title">
     *         <b>Status Codes</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>200 - OK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>206 - Partial Content</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>304 - Not Modified</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>400 - Bad Request</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>401 - Unauthorized</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>403 - Forbidden</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>404 - Not Found</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>405 - Method Not Allowed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>409 - Conflict</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>411 - Length Required</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>412 - Precondition Failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>416 - Range Not Satisfiable</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>500 - Internal Server Error</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>503 - Service Unavailable</code>
     *         </p>
     *         </li>
     */
    public final Integer statusCode() {
        return statusCode;
    }

    /**
     * <p>
     * A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML response
     * for a corresponding <code>GetObject</code> call. Cannot be used with a successful <code>StatusCode</code> header
     * or when the transformed object is provided in the body. All error codes from S3 are sentence-cased. The regular
     * expression (regex) value is <code>"^[A-Z][a-zA-Z]+$"</code>.
     * </p>
     * 
     * @return A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML
     *         response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     *         <code>StatusCode</code> header or when the transformed object is provided in the body. All error codes
     *         from S3 are sentence-cased. The regular expression (regex) value is <code>"^[A-Z][a-zA-Z]+$"</code>.
     */
    public final String errorCode() {
        return errorCode;
    }

    /**
     * <p>
     * Contains a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML
     * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     * <code>StatusCode</code> header or when the transformed object is provided in body.
     * </p>
     * 
     * @return Contains a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error
     *         XML response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
     *         <code>StatusCode</code> header or when the transformed object is provided in body.
     */
    public final String errorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Indicates that a range of bytes was specified.
     * </p>
     * 
     * @return Indicates that a range of bytes was specified.
     */
    public final String acceptRanges() {
        return acceptRanges;
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
     * The size of the content body in bytes.
     * </p>
     * 
     * @return The size of the content body in bytes.
     */
    public final Long contentLength() {
        return contentLength;
    }

    /**
     * <p>
     * The portion of the object returned in the response.
     * </p>
     * 
     * @return The portion of the object returned in the response.
     */
    public final String contentRange() {
        return contentRange;
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
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This specifies the base64-encoded, 32-bit CRC32 checksum of the object returned by the Object
     * Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform
     * validation of the checksum values only when the original <code>GetObject</code> request required checksum
     * validation. For more information about checksums, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will
     * fail.
     * </p>
     * <p/>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This specifies the base64-encoded, 32-bit CRC32 checksum of the object returned by
     *         the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3
     *         will perform validation of the checksum values only when the original <code>GetObject</code> request
     *         required checksum validation. For more information about checksums, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     *         <p>
     *         Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
     *         request will fail.
     *         </p>
     */
    public final String checksumCRC32() {
        return checksumCRC32;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This specifies the base64-encoded, 32-bit CRC32C checksum of the object returned by the Object
     * Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform
     * validation of the checksum values only when the original <code>GetObject</code> request required checksum
     * validation. For more information about checksums, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will
     * fail.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This specifies the base64-encoded, 32-bit CRC32C checksum of the object returned by
     *         the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3
     *         will perform validation of the checksum values only when the original <code>GetObject</code> request
     *         required checksum validation. For more information about checksums, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
     *         request will fail.
     */
    public final String checksumCRC32C() {
        return checksumCRC32C;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This specifies the base64-encoded, 160-bit SHA-1 digest of the object returned by the Object
     * Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform
     * validation of the checksum values only when the original <code>GetObject</code> request required checksum
     * validation. For more information about checksums, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will
     * fail.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This specifies the base64-encoded, 160-bit SHA-1 digest of the object returned by
     *         the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3
     *         will perform validation of the checksum values only when the original <code>GetObject</code> request
     *         required checksum validation. For more information about checksums, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
     *         request will fail.
     */
    public final String checksumSHA1() {
        return checksumSHA1;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This specifies the base64-encoded, 256-bit SHA-256 digest of the object returned by the Object
     * Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform
     * validation of the checksum values only when the original <code>GetObject</code> request required checksum
     * validation. For more information about checksums, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will
     * fail.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This specifies the base64-encoded, 256-bit SHA-256 digest of the object returned by
     *         the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3
     *         will perform validation of the checksum values only when the original <code>GetObject</code> request
     *         required checksum validation. For more information about checksums, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
     *         request will fail.
     */
    public final String checksumSHA256() {
        return checksumSHA256;
    }

    /**
     * <p>
     * Specifies whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a delete
     * marker.
     * </p>
     * 
     * @return Specifies whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a
     *         delete marker.
     */
    public final Boolean deleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * An opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     * 
     * @return An opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     */
    public final String eTag() {
        return eTag;
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
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes
     * the <code>expiry-date</code> and <code>rule-id</code> key-value pairs that provide the object expiration
     * information. The value of the <code>rule-id</code> is URL-encoded.
     * </p>
     * 
     * @return If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
     *         includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs that provide the object
     *         expiration information. The value of the <code>rule-id</code> is URL-encoded.
     */
    public final String expiration() {
        return expiration;
    }

    /**
     * <p>
     * The date and time that the object was last modified.
     * </p>
     * 
     * @return The date and time that the object was last modified.
     */
    public final Instant lastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if you
     * create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using
     * SOAP, you can create metadata whose values are not legal HTTP headers.
     * </p>
     * 
     * @return Set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if
     *         you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For
     *         example, using SOAP, you can create metadata whose values are not legal HTTP headers.
     */
    public final Integer missingMeta() {
        return missingMeta;
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
     * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3
     *         Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object
     *         Lock</a>.
     * @see ObjectLockMode
     */
    public final ObjectLockMode objectLockMode() {
        return ObjectLockMode.fromValue(objectLockMode);
    }

    /**
     * <p>
     * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
     * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3
     *         Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object
     *         Lock</a>.
     * @see ObjectLockMode
     */
    public final String objectLockModeAsString() {
        return objectLockMode;
    }

    /**
     * <p>
     * Indicates whether an object stored in Amazon S3 has an active legal hold.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Indicates whether an object stored in Amazon S3 has an active legal hold.
     * @see ObjectLockLegalHoldStatus
     */
    public final ObjectLockLegalHoldStatus objectLockLegalHoldStatus() {
        return ObjectLockLegalHoldStatus.fromValue(objectLockLegalHoldStatus);
    }

    /**
     * <p>
     * Indicates whether an object stored in Amazon S3 has an active legal hold.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Indicates whether an object stored in Amazon S3 has an active legal hold.
     * @see ObjectLockLegalHoldStatus
     */
    public final String objectLockLegalHoldStatusAsString() {
        return objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * The date and time when Object Lock is configured to expire.
     * </p>
     * 
     * @return The date and time when Object Lock is configured to expire.
     */
    public final Instant objectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * The count of parts this object has.
     * </p>
     * 
     * @return The count of parts this object has.
     */
    public final Integer partsCount() {
        return partsCount;
    }

    /**
     * <p>
     * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #replicationStatus}
     * will return {@link ReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #replicationStatusAsString}.
     * </p>
     * 
     * @return Indicates if request involves bucket that is either a source or destination in a Replication rule. For
     *         more information about S3 Replication, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     * @see ReplicationStatus
     */
    public final ReplicationStatus replicationStatus() {
        return ReplicationStatus.fromValue(replicationStatus);
    }

    /**
     * <p>
     * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #replicationStatus}
     * will return {@link ReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #replicationStatusAsString}.
     * </p>
     * 
     * @return Indicates if request involves bucket that is either a source or destination in a Replication rule. For
     *         more information about S3 Replication, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
     * @see ReplicationStatus
     */
    public final String replicationStatusAsString() {
        return replicationStatus;
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
     * Provides information about object restoration operation and expiration time of the restored object copy.
     * </p>
     * 
     * @return Provides information about object restoration operation and expiration time of the restored object copy.
     */
    public final String restore() {
        return restore;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
     * aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing requested object in Amazon S3 (for example,
     *         AES256, aws:kms).
     * @see ServerSideEncryption
     */
    public final ServerSideEncryption serverSideEncryption() {
        return ServerSideEncryption.fromValue(serverSideEncryption);
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
     * aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing requested object in Amazon S3 (for example,
     *         AES256, aws:kms).
     * @see ServerSideEncryption
     */
    public final String serverSideEncryptionAsString() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified for
     * object stored in Amazon S3.
     * </p>
     * 
     * @return Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified
     *         for object stored in Amazon S3.
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * symmetric customer managed key that was used for stored in Amazon S3 object.
     * </p>
     * 
     * @return If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *         symmetric customer managed key that was used for stored in Amazon S3 object.
     */
    public final String ssekmsKeyId() {
        return ssekmsKeyId;
    }

    /**
     * <p>
     * 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting
     * data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
     * </p>
     * 
     * @return 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html"
     *         >Protecting data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3
     * Standard storage class objects.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return Provides storage class information of the object. Amazon S3 returns this header for all objects except
     *         for S3 Standard storage class objects.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3
     * Standard storage class objects.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return Provides storage class information of the object. Amazon S3 returns this header for all objects except
     *         for S3 Standard storage class objects.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
    }

    /**
     * <p>
     * The number of tags, if any, on the object.
     * </p>
     * 
     * @return The number of tags, if any, on the object.
     */
    public final Integer tagCount() {
        return tagCount;
    }

    /**
     * <p>
     * An ID used to reference a specific version of the object.
     * </p>
     * 
     * @return An ID used to reference a specific version of the object.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon Web
     * Services KMS (SSE-KMS).
     * </p>
     * 
     * @return Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with
     *         Amazon Web Services KMS (SSE-KMS).
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
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
        hashCode = 31 * hashCode + Objects.hashCode(requestRoute());
        hashCode = 31 * hashCode + Objects.hashCode(requestToken());
        hashCode = 31 * hashCode + Objects.hashCode(statusCode());
        hashCode = 31 * hashCode + Objects.hashCode(errorCode());
        hashCode = 31 * hashCode + Objects.hashCode(errorMessage());
        hashCode = 31 * hashCode + Objects.hashCode(acceptRanges());
        hashCode = 31 * hashCode + Objects.hashCode(cacheControl());
        hashCode = 31 * hashCode + Objects.hashCode(contentDisposition());
        hashCode = 31 * hashCode + Objects.hashCode(contentEncoding());
        hashCode = 31 * hashCode + Objects.hashCode(contentLanguage());
        hashCode = 31 * hashCode + Objects.hashCode(contentLength());
        hashCode = 31 * hashCode + Objects.hashCode(contentRange());
        hashCode = 31 * hashCode + Objects.hashCode(contentType());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32C());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA1());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA256());
        hashCode = 31 * hashCode + Objects.hashCode(deleteMarker());
        hashCode = 31 * hashCode + Objects.hashCode(eTag());
        hashCode = 31 * hashCode + Objects.hashCode(expires());
        hashCode = 31 * hashCode + Objects.hashCode(expiration());
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
        hashCode = 31 * hashCode + Objects.hashCode(missingMeta());
        hashCode = 31 * hashCode + Objects.hashCode(hasMetadata() ? metadata() : null);
        hashCode = 31 * hashCode + Objects.hashCode(objectLockModeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockLegalHoldStatusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockRetainUntilDate());
        hashCode = 31 * hashCode + Objects.hashCode(partsCount());
        hashCode = 31 * hashCode + Objects.hashCode(replicationStatusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(restore());
        hashCode = 31 * hashCode + Objects.hashCode(serverSideEncryptionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(tagCount());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
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
        if (!(obj instanceof WriteGetObjectResponseRequest)) {
            return false;
        }
        WriteGetObjectResponseRequest other = (WriteGetObjectResponseRequest) obj;
        return Objects.equals(requestRoute(), other.requestRoute()) && Objects.equals(requestToken(), other.requestToken())
                && Objects.equals(statusCode(), other.statusCode()) && Objects.equals(errorCode(), other.errorCode())
                && Objects.equals(errorMessage(), other.errorMessage()) && Objects.equals(acceptRanges(), other.acceptRanges())
                && Objects.equals(cacheControl(), other.cacheControl())
                && Objects.equals(contentDisposition(), other.contentDisposition())
                && Objects.equals(contentEncoding(), other.contentEncoding())
                && Objects.equals(contentLanguage(), other.contentLanguage())
                && Objects.equals(contentLength(), other.contentLength()) && Objects.equals(contentRange(), other.contentRange())
                && Objects.equals(contentType(), other.contentType()) && Objects.equals(checksumCRC32(), other.checksumCRC32())
                && Objects.equals(checksumCRC32C(), other.checksumCRC32C())
                && Objects.equals(checksumSHA1(), other.checksumSHA1())
                && Objects.equals(checksumSHA256(), other.checksumSHA256())
                && Objects.equals(deleteMarker(), other.deleteMarker()) && Objects.equals(eTag(), other.eTag())
                && Objects.equals(expires(), other.expires()) && Objects.equals(expiration(), other.expiration())
                && Objects.equals(lastModified(), other.lastModified()) && Objects.equals(missingMeta(), other.missingMeta())
                && hasMetadata() == other.hasMetadata() && Objects.equals(metadata(), other.metadata())
                && Objects.equals(objectLockModeAsString(), other.objectLockModeAsString())
                && Objects.equals(objectLockLegalHoldStatusAsString(), other.objectLockLegalHoldStatusAsString())
                && Objects.equals(objectLockRetainUntilDate(), other.objectLockRetainUntilDate())
                && Objects.equals(partsCount(), other.partsCount())
                && Objects.equals(replicationStatusAsString(), other.replicationStatusAsString())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(restore(), other.restore())
                && Objects.equals(serverSideEncryptionAsString(), other.serverSideEncryptionAsString())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(ssekmsKeyId(), other.ssekmsKeyId())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(tagCount(), other.tagCount()) && Objects.equals(versionId(), other.versionId())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("WriteGetObjectResponseRequest").add("RequestRoute", requestRoute())
                .add("RequestToken", requestToken()).add("StatusCode", statusCode()).add("ErrorCode", errorCode())
                .add("ErrorMessage", errorMessage()).add("AcceptRanges", acceptRanges()).add("CacheControl", cacheControl())
                .add("ContentDisposition", contentDisposition()).add("ContentEncoding", contentEncoding())
                .add("ContentLanguage", contentLanguage()).add("ContentLength", contentLength())
                .add("ContentRange", contentRange()).add("ContentType", contentType()).add("ChecksumCRC32", checksumCRC32())
                .add("ChecksumCRC32C", checksumCRC32C()).add("ChecksumSHA1", checksumSHA1())
                .add("ChecksumSHA256", checksumSHA256()).add("DeleteMarker", deleteMarker()).add("ETag", eTag())
                .add("Expires", expires()).add("Expiration", expiration()).add("LastModified", lastModified())
                .add("MissingMeta", missingMeta()).add("Metadata", hasMetadata() ? metadata() : null)
                .add("ObjectLockMode", objectLockModeAsString())
                .add("ObjectLockLegalHoldStatus", objectLockLegalHoldStatusAsString())
                .add("ObjectLockRetainUntilDate", objectLockRetainUntilDate()).add("PartsCount", partsCount())
                .add("ReplicationStatus", replicationStatusAsString()).add("RequestCharged", requestChargedAsString())
                .add("Restore", restore()).add("ServerSideEncryption", serverSideEncryptionAsString())
                .add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSEKMSKeyId", ssekmsKeyId() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5()).add("StorageClass", storageClassAsString())
                .add("TagCount", tagCount()).add("VersionId", versionId()).add("BucketKeyEnabled", bucketKeyEnabled()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "RequestRoute":
            return Optional.ofNullable(clazz.cast(requestRoute()));
        case "RequestToken":
            return Optional.ofNullable(clazz.cast(requestToken()));
        case "StatusCode":
            return Optional.ofNullable(clazz.cast(statusCode()));
        case "ErrorCode":
            return Optional.ofNullable(clazz.cast(errorCode()));
        case "ErrorMessage":
            return Optional.ofNullable(clazz.cast(errorMessage()));
        case "AcceptRanges":
            return Optional.ofNullable(clazz.cast(acceptRanges()));
        case "CacheControl":
            return Optional.ofNullable(clazz.cast(cacheControl()));
        case "ContentDisposition":
            return Optional.ofNullable(clazz.cast(contentDisposition()));
        case "ContentEncoding":
            return Optional.ofNullable(clazz.cast(contentEncoding()));
        case "ContentLanguage":
            return Optional.ofNullable(clazz.cast(contentLanguage()));
        case "ContentLength":
            return Optional.ofNullable(clazz.cast(contentLength()));
        case "ContentRange":
            return Optional.ofNullable(clazz.cast(contentRange()));
        case "ContentType":
            return Optional.ofNullable(clazz.cast(contentType()));
        case "ChecksumCRC32":
            return Optional.ofNullable(clazz.cast(checksumCRC32()));
        case "ChecksumCRC32C":
            return Optional.ofNullable(clazz.cast(checksumCRC32C()));
        case "ChecksumSHA1":
            return Optional.ofNullable(clazz.cast(checksumSHA1()));
        case "ChecksumSHA256":
            return Optional.ofNullable(clazz.cast(checksumSHA256()));
        case "DeleteMarker":
            return Optional.ofNullable(clazz.cast(deleteMarker()));
        case "ETag":
            return Optional.ofNullable(clazz.cast(eTag()));
        case "Expires":
            return Optional.ofNullable(clazz.cast(expires()));
        case "Expiration":
            return Optional.ofNullable(clazz.cast(expiration()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        case "MissingMeta":
            return Optional.ofNullable(clazz.cast(missingMeta()));
        case "Metadata":
            return Optional.ofNullable(clazz.cast(metadata()));
        case "ObjectLockMode":
            return Optional.ofNullable(clazz.cast(objectLockModeAsString()));
        case "ObjectLockLegalHoldStatus":
            return Optional.ofNullable(clazz.cast(objectLockLegalHoldStatusAsString()));
        case "ObjectLockRetainUntilDate":
            return Optional.ofNullable(clazz.cast(objectLockRetainUntilDate()));
        case "PartsCount":
            return Optional.ofNullable(clazz.cast(partsCount()));
        case "ReplicationStatus":
            return Optional.ofNullable(clazz.cast(replicationStatusAsString()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "Restore":
            return Optional.ofNullable(clazz.cast(restore()));
        case "ServerSideEncryption":
            return Optional.ofNullable(clazz.cast(serverSideEncryptionAsString()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSEKMSKeyId":
            return Optional.ofNullable(clazz.cast(ssekmsKeyId()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "TagCount":
            return Optional.ofNullable(clazz.cast(tagCount()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<WriteGetObjectResponseRequest, T> g) {
        return obj -> g.apply((WriteGetObjectResponseRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, WriteGetObjectResponseRequest> {
        /**
         * <p>
         * Route prefix to the HTTP URL generated.
         * </p>
         * 
         * @param requestRoute
         *        Route prefix to the HTTP URL generated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder requestRoute(String requestRoute);

        /**
         * <p>
         * A single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user
         * <code>GetObject</code> request.
         * </p>
         * 
         * @param requestToken
         *        A single use encrypted token that maps <code>WriteGetObjectResponse</code> to the end user
         *        <code>GetObject</code> request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder requestToken(String requestToken);

        /**
         * <p>
         * The integer status code for an HTTP response of a corresponding <code>GetObject</code> request.
         * </p>
         * <p class="title">
         * <b>Status Codes</b>
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>200 - OK</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>206 - Partial Content</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>304 - Not Modified</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>400 - Bad Request</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>401 - Unauthorized</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>403 - Forbidden</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>404 - Not Found</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>405 - Method Not Allowed</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>409 - Conflict</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>411 - Length Required</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>412 - Precondition Failed</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>416 - Range Not Satisfiable</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>500 - Internal Server Error</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>503 - Service Unavailable</code>
         * </p>
         * </li>
         * </ul>
         * 
         * @param statusCode
         *        The integer status code for an HTTP response of a corresponding <code>GetObject</code> request.</p>
         *        <p class="title">
         *        <b>Status Codes</b>
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>200 - OK</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>206 - Partial Content</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>304 - Not Modified</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>400 - Bad Request</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>401 - Unauthorized</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>403 - Forbidden</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>404 - Not Found</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>405 - Method Not Allowed</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>409 - Conflict</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>411 - Length Required</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>412 - Precondition Failed</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>416 - Range Not Satisfiable</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>500 - Internal Server Error</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>503 - Service Unavailable</code>
         *        </p>
         *        </li>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder statusCode(Integer statusCode);

        /**
         * <p>
         * A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML
         * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
         * <code>StatusCode</code> header or when the transformed object is provided in the body. All error codes from
         * S3 are sentence-cased. The regular expression (regex) value is <code>"^[A-Z][a-zA-Z]+$"</code>.
         * </p>
         * 
         * @param errorCode
         *        A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error
         *        XML response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
         *        <code>StatusCode</code> header or when the transformed object is provided in the body. All error codes
         *        from S3 are sentence-cased. The regular expression (regex) value is <code>"^[A-Z][a-zA-Z]+$"</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder errorCode(String errorCode);

        /**
         * <p>
         * Contains a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML
         * response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
         * <code>StatusCode</code> header or when the transformed object is provided in body.
         * </p>
         * 
         * @param errorMessage
         *        Contains a generic description of the error condition. Returned in the &lt;Message&gt; tag of the
         *        error XML response for a corresponding <code>GetObject</code> call. Cannot be used with a successful
         *        <code>StatusCode</code> header or when the transformed object is provided in body.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder errorMessage(String errorMessage);

        /**
         * <p>
         * Indicates that a range of bytes was specified.
         * </p>
         * 
         * @param acceptRanges
         *        Indicates that a range of bytes was specified.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder acceptRanges(String acceptRanges);

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
         * The size of the content body in bytes.
         * </p>
         * 
         * @param contentLength
         *        The size of the content body in bytes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentLength(Long contentLength);

        /**
         * <p>
         * The portion of the object returned in the response.
         * </p>
         * 
         * @param contentRange
         *        The portion of the object returned in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentRange(String contentRange);

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
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This specifies the base64-encoded, 32-bit CRC32 checksum of the object returned by the
         * Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will
         * perform validation of the checksum values only when the original <code>GetObject</code> request required
         * checksum validation. For more information about checksums, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request
         * will fail.
         * </p>
         * <p/>
         * 
         * @param checksumCRC32
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This specifies the base64-encoded, 32-bit CRC32 checksum of the object
         *        returned by the Object Lambda function. This may not match the checksum for the object stored in
         *        Amazon S3. Amazon S3 will perform validation of the checksum values only when the original
         *        <code>GetObject</code> request required checksum validation. For more information about checksums, see
         *        <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         *        </p>
         *        <p>
         *        Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
         *        request will fail.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32(String checksumCRC32);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This specifies the base64-encoded, 32-bit CRC32C checksum of the object returned by the
         * Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will
         * perform validation of the checksum values only when the original <code>GetObject</code> request required
         * checksum validation. For more information about checksums, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request
         * will fail.
         * </p>
         * 
         * @param checksumCRC32C
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This specifies the base64-encoded, 32-bit CRC32C checksum of the object
         *        returned by the Object Lambda function. This may not match the checksum for the object stored in
         *        Amazon S3. Amazon S3 will perform validation of the checksum values only when the original
         *        <code>GetObject</code> request required checksum validation. For more information about checksums, see
         *        <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
         *        request will fail.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32C(String checksumCRC32C);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This specifies the base64-encoded, 160-bit SHA-1 digest of the object returned by the Object
         * Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform
         * validation of the checksum values only when the original <code>GetObject</code> request required checksum
         * validation. For more information about checksums, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request
         * will fail.
         * </p>
         * 
         * @param checksumSHA1
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This specifies the base64-encoded, 160-bit SHA-1 digest of the object
         *        returned by the Object Lambda function. This may not match the checksum for the object stored in
         *        Amazon S3. Amazon S3 will perform validation of the checksum values only when the original
         *        <code>GetObject</code> request required checksum validation. For more information about checksums, see
         *        <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
         *        request will fail.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA1(String checksumSHA1);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This specifies the base64-encoded, 256-bit SHA-256 digest of the object returned by the
         * Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will
         * perform validation of the checksum values only when the original <code>GetObject</code> request required
         * checksum validation. For more information about checksums, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request
         * will fail.
         * </p>
         * 
         * @param checksumSHA256
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This specifies the base64-encoded, 256-bit SHA-256 digest of the object
         *        returned by the Object Lambda function. This may not match the checksum for the object stored in
         *        Amazon S3. Amazon S3 will perform validation of the checksum values only when the original
         *        <code>GetObject</code> request required checksum validation. For more information about checksums, see
         *        <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        Only one checksum header can be specified at a time. If you supply multiple checksum headers, this
         *        request will fail.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA256(String checksumSHA256);

        /**
         * <p>
         * Specifies whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>) a
         * delete marker.
         * </p>
         * 
         * @param deleteMarker
         *        Specifies whether an object stored in Amazon S3 is (<code>true</code>) or is not (<code>false</code>)
         *        a delete marker.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarker(Boolean deleteMarker);

        /**
         * <p>
         * An opaque identifier assigned by a web server to a specific version of a resource found at a URL.
         * </p>
         * 
         * @param eTag
         *        An opaque identifier assigned by a web server to a specific version of a resource found at a URL.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eTag(String eTag);

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
         * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
         * includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs that provide the object
         * expiration information. The value of the <code>rule-id</code> is URL-encoded.
         * </p>
         * 
         * @param expiration
         *        If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header.
         *        It includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs that provide the
         *        object expiration information. The value of the <code>rule-id</code> is URL-encoded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expiration(String expiration);

        /**
         * <p>
         * The date and time that the object was last modified.
         * </p>
         * 
         * @param lastModified
         *        The date and time that the object was last modified.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lastModified(Instant lastModified);

        /**
         * <p>
         * Set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if you
         * create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example,
         * using SOAP, you can create metadata whose values are not legal HTTP headers.
         * </p>
         * 
         * @param missingMeta
         *        Set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen
         *        if you create metadata using an API like SOAP that supports more flexible metadata than the REST API.
         *        For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder missingMeta(Integer missingMeta);

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
         * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
         * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockMode
         *        Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3
         *        Object Lock, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(String objectLockMode);

        /**
         * <p>
         * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object
         * Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockMode
         *        Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3
         *        Object Lock, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock</a>.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(ObjectLockMode objectLockMode);

        /**
         * <p>
         * Indicates whether an object stored in Amazon S3 has an active legal hold.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Indicates whether an object stored in Amazon S3 has an active legal hold.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus);

        /**
         * <p>
         * Indicates whether an object stored in Amazon S3 has an active legal hold.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Indicates whether an object stored in Amazon S3 has an active legal hold.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus);

        /**
         * <p>
         * The date and time when Object Lock is configured to expire.
         * </p>
         * 
         * @param objectLockRetainUntilDate
         *        The date and time when Object Lock is configured to expire.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectLockRetainUntilDate(Instant objectLockRetainUntilDate);

        /**
         * <p>
         * The count of parts this object has.
         * </p>
         * 
         * @param partsCount
         *        The count of parts this object has.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partsCount(Integer partsCount);

        /**
         * <p>
         * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
         * information about S3 Replication, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
         * </p>
         * 
         * @param replicationStatus
         *        Indicates if request involves bucket that is either a source or destination in a Replication rule. For
         *        more information about S3 Replication, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
         * @see ReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationStatus
         */
        Builder replicationStatus(String replicationStatus);

        /**
         * <p>
         * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
         * information about S3 Replication, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
         * </p>
         * 
         * @param replicationStatus
         *        Indicates if request involves bucket that is either a source or destination in a Replication rule. For
         *        more information about S3 Replication, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication</a>.
         * @see ReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationStatus
         */
        Builder replicationStatus(ReplicationStatus replicationStatus);

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
         * Provides information about object restoration operation and expiration time of the restored object copy.
         * </p>
         * 
         * @param restore
         *        Provides information about object restoration operation and expiration time of the restored object
         *        copy.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder restore(String restore);

        /**
         * <p>
         * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing requested object in Amazon S3 (for example,
         *        AES256, aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(String serverSideEncryption);

        /**
         * <p>
         * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing requested object in Amazon S3 (for example,
         *        AES256, aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(ServerSideEncryption serverSideEncryption);

        /**
         * <p>
         * Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified for
         * object stored in Amazon S3.
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        Encryption algorithm used if server-side encryption with a customer-provided encryption key was
         *        specified for object stored in Amazon S3.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
         * symmetric customer managed key that was used for stored in Amazon S3 object.
         * </p>
         * 
         * @param ssekmsKeyId
         *        If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services
         *        KMS) symmetric customer managed key that was used for stored in Amazon S3 object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsKeyId(String ssekmsKeyId);

        /**
         * <p>
         * 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For
         * more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting
         * data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3.
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using server-side encryption with customer-provided encryption keys (SSE-C)</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        /**
         * <p>
         * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3
         * Standard storage class objects.
         * </p>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * </p>
         * 
         * @param storageClass
         *        Provides storage class information of the object. Amazon S3 returns this header for all objects except
         *        for S3 Standard storage class objects.</p>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3
         * Standard storage class objects.
         * </p>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * </p>
         * 
         * @param storageClass
         *        Provides storage class information of the object. Amazon S3 returns this header for all objects except
         *        for S3 Standard storage class objects.</p>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

        /**
         * <p>
         * The number of tags, if any, on the object.
         * </p>
         * 
         * @param tagCount
         *        The number of tags, if any, on the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagCount(Integer tagCount);

        /**
         * <p>
         * An ID used to reference a specific version of the object.
         * </p>
         * 
         * @param versionId
         *        An ID used to reference a specific version of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon
         * Web Services KMS (SSE-KMS).
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with
         *        Amazon Web Services KMS (SSE-KMS).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String requestRoute;

        private String requestToken;

        private Integer statusCode;

        private String errorCode;

        private String errorMessage;

        private String acceptRanges;

        private String cacheControl;

        private String contentDisposition;

        private String contentEncoding;

        private String contentLanguage;

        private Long contentLength;

        private String contentRange;

        private String contentType;

        private String checksumCRC32;

        private String checksumCRC32C;

        private String checksumSHA1;

        private String checksumSHA256;

        private Boolean deleteMarker;

        private String eTag;

        private Instant expires;

        private String expiration;

        private Instant lastModified;

        private Integer missingMeta;

        private Map<String, String> metadata = DefaultSdkAutoConstructMap.getInstance();

        private String objectLockMode;

        private String objectLockLegalHoldStatus;

        private Instant objectLockRetainUntilDate;

        private Integer partsCount;

        private String replicationStatus;

        private String requestCharged;

        private String restore;

        private String serverSideEncryption;

        private String sseCustomerAlgorithm;

        private String ssekmsKeyId;

        private String sseCustomerKeyMD5;

        private String storageClass;

        private Integer tagCount;

        private String versionId;

        private Boolean bucketKeyEnabled;

        private BuilderImpl() {
        }

        private BuilderImpl(WriteGetObjectResponseRequest model) {
            super(model);
            requestRoute(model.requestRoute);
            requestToken(model.requestToken);
            statusCode(model.statusCode);
            errorCode(model.errorCode);
            errorMessage(model.errorMessage);
            acceptRanges(model.acceptRanges);
            cacheControl(model.cacheControl);
            contentDisposition(model.contentDisposition);
            contentEncoding(model.contentEncoding);
            contentLanguage(model.contentLanguage);
            contentLength(model.contentLength);
            contentRange(model.contentRange);
            contentType(model.contentType);
            checksumCRC32(model.checksumCRC32);
            checksumCRC32C(model.checksumCRC32C);
            checksumSHA1(model.checksumSHA1);
            checksumSHA256(model.checksumSHA256);
            deleteMarker(model.deleteMarker);
            eTag(model.eTag);
            expires(model.expires);
            expiration(model.expiration);
            lastModified(model.lastModified);
            missingMeta(model.missingMeta);
            metadata(model.metadata);
            objectLockMode(model.objectLockMode);
            objectLockLegalHoldStatus(model.objectLockLegalHoldStatus);
            objectLockRetainUntilDate(model.objectLockRetainUntilDate);
            partsCount(model.partsCount);
            replicationStatus(model.replicationStatus);
            requestCharged(model.requestCharged);
            restore(model.restore);
            serverSideEncryption(model.serverSideEncryption);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            ssekmsKeyId(model.ssekmsKeyId);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            storageClass(model.storageClass);
            tagCount(model.tagCount);
            versionId(model.versionId);
            bucketKeyEnabled(model.bucketKeyEnabled);
        }

        public final String getRequestRoute() {
            return requestRoute;
        }

        public final void setRequestRoute(String requestRoute) {
            this.requestRoute = requestRoute;
        }

        @Override
        public final Builder requestRoute(String requestRoute) {
            this.requestRoute = requestRoute;
            return this;
        }

        public final String getRequestToken() {
            return requestToken;
        }

        public final void setRequestToken(String requestToken) {
            this.requestToken = requestToken;
        }

        @Override
        public final Builder requestToken(String requestToken) {
            this.requestToken = requestToken;
            return this;
        }

        public final Integer getStatusCode() {
            return statusCode;
        }

        public final void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        @Override
        public final Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public final String getErrorCode() {
            return errorCode;
        }

        public final void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        @Override
        public final Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public final String getErrorMessage() {
            return errorMessage;
        }

        public final void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        @Override
        public final Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public final String getAcceptRanges() {
            return acceptRanges;
        }

        public final void setAcceptRanges(String acceptRanges) {
            this.acceptRanges = acceptRanges;
        }

        @Override
        public final Builder acceptRanges(String acceptRanges) {
            this.acceptRanges = acceptRanges;
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

        public final Long getContentLength() {
            return contentLength;
        }

        public final void setContentLength(Long contentLength) {
            this.contentLength = contentLength;
        }

        @Override
        public final Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        public final String getContentRange() {
            return contentRange;
        }

        public final void setContentRange(String contentRange) {
            this.contentRange = contentRange;
        }

        @Override
        public final Builder contentRange(String contentRange) {
            this.contentRange = contentRange;
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

        public final Boolean getDeleteMarker() {
            return deleteMarker;
        }

        public final void setDeleteMarker(Boolean deleteMarker) {
            this.deleteMarker = deleteMarker;
        }

        @Override
        public final Builder deleteMarker(Boolean deleteMarker) {
            this.deleteMarker = deleteMarker;
            return this;
        }

        public final String getETag() {
            return eTag;
        }

        public final void setETag(String eTag) {
            this.eTag = eTag;
        }

        @Override
        public final Builder eTag(String eTag) {
            this.eTag = eTag;
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

        public final String getExpiration() {
            return expiration;
        }

        public final void setExpiration(String expiration) {
            this.expiration = expiration;
        }

        @Override
        public final Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public final Instant getLastModified() {
            return lastModified;
        }

        public final void setLastModified(Instant lastModified) {
            this.lastModified = lastModified;
        }

        @Override
        public final Builder lastModified(Instant lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public final Integer getMissingMeta() {
            return missingMeta;
        }

        public final void setMissingMeta(Integer missingMeta) {
            this.missingMeta = missingMeta;
        }

        @Override
        public final Builder missingMeta(Integer missingMeta) {
            this.missingMeta = missingMeta;
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

        public final Integer getPartsCount() {
            return partsCount;
        }

        public final void setPartsCount(Integer partsCount) {
            this.partsCount = partsCount;
        }

        @Override
        public final Builder partsCount(Integer partsCount) {
            this.partsCount = partsCount;
            return this;
        }

        public final String getReplicationStatus() {
            return replicationStatus;
        }

        public final void setReplicationStatus(String replicationStatus) {
            this.replicationStatus = replicationStatus;
        }

        @Override
        public final Builder replicationStatus(String replicationStatus) {
            this.replicationStatus = replicationStatus;
            return this;
        }

        @Override
        public final Builder replicationStatus(ReplicationStatus replicationStatus) {
            this.replicationStatus(replicationStatus == null ? null : replicationStatus.toString());
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

        public final String getRestore() {
            return restore;
        }

        public final void setRestore(String restore) {
            this.restore = restore;
        }

        @Override
        public final Builder restore(String restore) {
            this.restore = restore;
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

        public final Integer getTagCount() {
            return tagCount;
        }

        public final void setTagCount(Integer tagCount) {
            this.tagCount = tagCount;
        }

        @Override
        public final Builder tagCount(Integer tagCount) {
            this.tagCount = tagCount;
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
        public WriteGetObjectResponseRequest build() {
            return new WriteGetObjectResponseRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
