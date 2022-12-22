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
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
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
public final class HeadObjectResponse extends S3Response implements
        ToCopyableBuilder<HeadObjectResponse.Builder, HeadObjectResponse> {
    private static final SdkField<Boolean> DELETE_MARKER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("DeleteMarker")
            .getter(getter(HeadObjectResponse::deleteMarker))
            .setter(setter(Builder::deleteMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-delete-marker")
                    .unmarshallLocationName("x-amz-delete-marker").build()).build();

    private static final SdkField<String> ACCEPT_RANGES_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AcceptRanges")
            .getter(getter(HeadObjectResponse::acceptRanges))
            .setter(setter(Builder::acceptRanges))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("accept-ranges")
                    .unmarshallLocationName("accept-ranges").build()).build();

    private static final SdkField<String> EXPIRATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Expiration")
            .getter(getter(HeadObjectResponse::expiration))
            .setter(setter(Builder::expiration))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expiration")
                    .unmarshallLocationName("x-amz-expiration").build()).build();

    private static final SdkField<String> RESTORE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Restore")
            .getter(getter(HeadObjectResponse::restore))
            .setter(setter(Builder::restore))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-restore")
                    .unmarshallLocationName("x-amz-restore").build()).build();

    private static final SdkField<String> ARCHIVE_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ArchiveStatus")
            .getter(getter(HeadObjectResponse::archiveStatusAsString))
            .setter(setter(Builder::archiveStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-archive-status")
                    .unmarshallLocationName("x-amz-archive-status").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(HeadObjectResponse::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Last-Modified")
                    .unmarshallLocationName("Last-Modified").build()).build();

    private static final SdkField<Long> CONTENT_LENGTH_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ContentLength")
            .getter(getter(HeadObjectResponse::contentLength))
            .setter(setter(Builder::contentLength))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Length")
                    .unmarshallLocationName("Content-Length").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32")
            .getter(getter(HeadObjectResponse::checksumCRC32))
            .setter(setter(Builder::checksumCRC32))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-crc32")
                    .unmarshallLocationName("x-amz-checksum-crc32").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_C_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32C")
            .getter(getter(HeadObjectResponse::checksumCRC32C))
            .setter(setter(Builder::checksumCRC32C))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-crc32c")
                    .unmarshallLocationName("x-amz-checksum-crc32c").build()).build();

    private static final SdkField<String> CHECKSUM_SHA1_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA1")
            .getter(getter(HeadObjectResponse::checksumSHA1))
            .setter(setter(Builder::checksumSHA1))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-sha1")
                    .unmarshallLocationName("x-amz-checksum-sha1").build()).build();

    private static final SdkField<String> CHECKSUM_SHA256_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA256")
            .getter(getter(HeadObjectResponse::checksumSHA256))
            .setter(setter(Builder::checksumSHA256))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-sha256")
                    .unmarshallLocationName("x-amz-checksum-sha256").build()).build();

    private static final SdkField<String> E_TAG_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ETag")
            .getter(getter(HeadObjectResponse::eTag))
            .setter(setter(Builder::eTag))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("ETag").unmarshallLocationName("ETag")
                    .build()).build();

    private static final SdkField<Integer> MISSING_META_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MissingMeta")
            .getter(getter(HeadObjectResponse::missingMeta))
            .setter(setter(Builder::missingMeta))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-missing-meta")
                    .unmarshallLocationName("x-amz-missing-meta").build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(HeadObjectResponse::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-version-id")
                    .unmarshallLocationName("x-amz-version-id").build()).build();

    private static final SdkField<String> CACHE_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CacheControl")
            .getter(getter(HeadObjectResponse::cacheControl))
            .setter(setter(Builder::cacheControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Cache-Control")
                    .unmarshallLocationName("Cache-Control").build()).build();

    private static final SdkField<String> CONTENT_DISPOSITION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentDisposition")
            .getter(getter(HeadObjectResponse::contentDisposition))
            .setter(setter(Builder::contentDisposition))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Disposition")
                    .unmarshallLocationName("Content-Disposition").build()).build();

    private static final SdkField<String> CONTENT_ENCODING_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentEncoding")
            .getter(getter(HeadObjectResponse::contentEncoding))
            .setter(setter(Builder::contentEncoding))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Encoding")
                    .unmarshallLocationName("Content-Encoding").build()).build();

    private static final SdkField<String> CONTENT_LANGUAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentLanguage")
            .getter(getter(HeadObjectResponse::contentLanguage))
            .setter(setter(Builder::contentLanguage))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Language")
                    .unmarshallLocationName("Content-Language").build()).build();

    private static final SdkField<String> CONTENT_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentType")
            .getter(getter(HeadObjectResponse::contentType))
            .setter(setter(Builder::contentType))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-Type")
                    .unmarshallLocationName("Content-Type").build()).build();

    private static final SdkField<Instant> EXPIRES_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Expires")
            .getter(getter(HeadObjectResponse::expires))
            .setter(setter(Builder::expires))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Expires")
                    .unmarshallLocationName("Expires").build()).build();

    private static final SdkField<String> WEBSITE_REDIRECT_LOCATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("WebsiteRedirectLocation")
            .getter(getter(HeadObjectResponse::websiteRedirectLocation))
            .setter(setter(Builder::websiteRedirectLocation))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-website-redirect-location")
                    .unmarshallLocationName("x-amz-website-redirect-location").build()).build();

    private static final SdkField<String> SERVER_SIDE_ENCRYPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ServerSideEncryption")
            .getter(getter(HeadObjectResponse::serverSideEncryptionAsString))
            .setter(setter(Builder::serverSideEncryption))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-server-side-encryption")
                    .unmarshallLocationName("x-amz-server-side-encryption").build()).build();

    private static final SdkField<Map<String, String>> METADATA_FIELD = SdkField
            .<Map<String, String>> builder(MarshallingType.MAP)
            .memberName("Metadata")
            .getter(getter(HeadObjectResponse::metadata))
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

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(HeadObjectResponse::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(HeadObjectResponse::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> SSEKMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSKeyId")
            .getter(getter(HeadObjectResponse::ssekmsKeyId))
            .setter(setter(Builder::ssekmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-aws-kms-key-id")
                    .unmarshallLocationName("x-amz-server-side-encryption-aws-kms-key-id").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(HeadObjectResponse::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-bucket-key-enabled")
                    .unmarshallLocationName("x-amz-server-side-encryption-bucket-key-enabled").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(HeadObjectResponse::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-storage-class")
                    .unmarshallLocationName("x-amz-storage-class").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(HeadObjectResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<String> REPLICATION_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ReplicationStatus")
            .getter(getter(HeadObjectResponse::replicationStatusAsString))
            .setter(setter(Builder::replicationStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-replication-status")
                    .unmarshallLocationName("x-amz-replication-status").build()).build();

    private static final SdkField<Integer> PARTS_COUNT_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartsCount")
            .getter(getter(HeadObjectResponse::partsCount))
            .setter(setter(Builder::partsCount))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-mp-parts-count")
                    .unmarshallLocationName("x-amz-mp-parts-count").build()).build();

    private static final SdkField<String> OBJECT_LOCK_MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockMode")
            .getter(getter(HeadObjectResponse::objectLockModeAsString))
            .setter(setter(Builder::objectLockMode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-mode")
                    .unmarshallLocationName("x-amz-object-lock-mode").build()).build();

    private static final SdkField<Instant> OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("ObjectLockRetainUntilDate")
            .getter(getter(HeadObjectResponse::objectLockRetainUntilDate))
            .setter(setter(Builder::objectLockRetainUntilDate))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-retain-until-date")
                    .unmarshallLocationName("x-amz-object-lock-retain-until-date").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final SdkField<String> OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockLegalHoldStatus")
            .getter(getter(HeadObjectResponse::objectLockLegalHoldStatusAsString))
            .setter(setter(Builder::objectLockLegalHoldStatus))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-lock-legal-hold")
                    .unmarshallLocationName("x-amz-object-lock-legal-hold").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DELETE_MARKER_FIELD,
            ACCEPT_RANGES_FIELD, EXPIRATION_FIELD, RESTORE_FIELD, ARCHIVE_STATUS_FIELD, LAST_MODIFIED_FIELD,
            CONTENT_LENGTH_FIELD, CHECKSUM_CRC32_FIELD, CHECKSUM_CRC32_C_FIELD, CHECKSUM_SHA1_FIELD, CHECKSUM_SHA256_FIELD,
            E_TAG_FIELD, MISSING_META_FIELD, VERSION_ID_FIELD, CACHE_CONTROL_FIELD, CONTENT_DISPOSITION_FIELD,
            CONTENT_ENCODING_FIELD, CONTENT_LANGUAGE_FIELD, CONTENT_TYPE_FIELD, EXPIRES_FIELD, WEBSITE_REDIRECT_LOCATION_FIELD,
            SERVER_SIDE_ENCRYPTION_FIELD, METADATA_FIELD, SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD,
            SSEKMS_KEY_ID_FIELD, BUCKET_KEY_ENABLED_FIELD, STORAGE_CLASS_FIELD, REQUEST_CHARGED_FIELD, REPLICATION_STATUS_FIELD,
            PARTS_COUNT_FIELD, OBJECT_LOCK_MODE_FIELD, OBJECT_LOCK_RETAIN_UNTIL_DATE_FIELD, OBJECT_LOCK_LEGAL_HOLD_STATUS_FIELD));

    private final Boolean deleteMarker;

    private final String acceptRanges;

    private final String expiration;

    private final String restore;

    private final String archiveStatus;

    private final Instant lastModified;

    private final Long contentLength;

    private final String checksumCRC32;

    private final String checksumCRC32C;

    private final String checksumSHA1;

    private final String checksumSHA256;

    private final String eTag;

    private final Integer missingMeta;

    private final String versionId;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    private final Instant expires;

    private final String websiteRedirectLocation;

    private final String serverSideEncryption;

    private final Map<String, String> metadata;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKeyMD5;

    private final String ssekmsKeyId;

    private final Boolean bucketKeyEnabled;

    private final String storageClass;

    private final String requestCharged;

    private final String replicationStatus;

    private final Integer partsCount;

    private final String objectLockMode;

    private final Instant objectLockRetainUntilDate;

    private final String objectLockLegalHoldStatus;

    private HeadObjectResponse(BuilderImpl builder) {
        super(builder);
        this.deleteMarker = builder.deleteMarker;
        this.acceptRanges = builder.acceptRanges;
        this.expiration = builder.expiration;
        this.restore = builder.restore;
        this.archiveStatus = builder.archiveStatus;
        this.lastModified = builder.lastModified;
        this.contentLength = builder.contentLength;
        this.checksumCRC32 = builder.checksumCRC32;
        this.checksumCRC32C = builder.checksumCRC32C;
        this.checksumSHA1 = builder.checksumSHA1;
        this.checksumSHA256 = builder.checksumSHA256;
        this.eTag = builder.eTag;
        this.missingMeta = builder.missingMeta;
        this.versionId = builder.versionId;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentLanguage = builder.contentLanguage;
        this.contentType = builder.contentType;
        this.expires = builder.expires;
        this.websiteRedirectLocation = builder.websiteRedirectLocation;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.metadata = builder.metadata;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.ssekmsKeyId = builder.ssekmsKeyId;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
        this.storageClass = builder.storageClass;
        this.requestCharged = builder.requestCharged;
        this.replicationStatus = builder.replicationStatus;
        this.partsCount = builder.partsCount;
        this.objectLockMode = builder.objectLockMode;
        this.objectLockRetainUntilDate = builder.objectLockRetainUntilDate;
        this.objectLockLegalHoldStatus = builder.objectLockLegalHoldStatus;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response
     * header does not appear in the response.
     * </p>
     * 
     * @return Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this
     *         response header does not appear in the response.
     */
    public final Boolean deleteMarker() {
        return deleteMarker;
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
     * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes
     * the <code>expiry-date</code> and <code>rule-id</code> key-value pairs providing object expiration information.
     * The value of the <code>rule-id</code> is URL-encoded.
     * </p>
     * 
     * @return If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
     *         includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs providing object
     *         expiration information. The value of the <code>rule-id</code> is URL-encoded.
     */
    public final String expiration() {
        return expiration;
    }

    /**
     * <p>
     * If the object is an archived object (an object whose storage class is GLACIER), the response includes this header
     * if either the archive restoration is in progress (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a> or an archive
     * copy is already restored.
     * </p>
     * <p>
     * If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the
     * object copy. For example:
     * </p>
     * <p>
     * <code>x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"</code>
     * </p>
     * <p>
     * If the object restoration is in progress, the header returns the value <code>ongoing-request="true"</code>.
     * </p>
     * <p>
     * For more information about archiving objects, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations"
     * >Transitioning Objects: General Considerations</a>.
     * </p>
     * 
     * @return If the object is an archived object (an object whose storage class is GLACIER), the response includes
     *         this header if either the archive restoration is in progress (see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a> or an
     *         archive copy is already restored.</p>
     *         <p>
     *         If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete
     *         the object copy. For example:
     *         </p>
     *         <p>
     *         <code>x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"</code>
     *         </p>
     *         <p>
     *         If the object restoration is in progress, the header returns the value
     *         <code>ongoing-request="true"</code>.
     *         </p>
     *         <p>
     *         For more information about archiving objects, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations"
     *         >Transitioning Objects: General Considerations</a>.
     */
    public final String restore() {
        return restore;
    }

    /**
     * <p>
     * The archive state of the head object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #archiveStatus}
     * will return {@link ArchiveStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #archiveStatusAsString}.
     * </p>
     * 
     * @return The archive state of the head object.
     * @see ArchiveStatus
     */
    public final ArchiveStatus archiveStatus() {
        return ArchiveStatus.fromValue(archiveStatus);
    }

    /**
     * <p>
     * The archive state of the head object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #archiveStatus}
     * will return {@link ArchiveStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #archiveStatusAsString}.
     * </p>
     * 
     * @return The archive state of the head object.
     * @see ArchiveStatus
     */
    public final String archiveStatusAsString() {
        return archiveStatus;
    }

    /**
     * <p>
     * Creation date of the object.
     * </p>
     * 
     * @return Creation date of the object.
     */
    public final Instant lastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Size of the body in bytes.
     * </p>
     * 
     * @return Size of the body in bytes.
     */
    public final Long contentLength() {
        return contentLength;
    }

    /**
     * <p>
     * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded
     *         with the object. With multipart uploads, this may not be a checksum value of the object. For more
     *         information about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32() {
        return checksumCRC32;
    }

    /**
     * <p>
     * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded
     *         with the object. With multipart uploads, this may not be a checksum value of the object. For more
     *         information about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32C() {
        return checksumCRC32C;
    }

    /**
     * <p>
     * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with
     *         the object. With multipart uploads, this may not be a checksum value of the object. For more information
     *         about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA1() {
        return checksumSHA1;
    }

    /**
     * <p>
     * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded
     *         with the object. With multipart uploads, this may not be a checksum value of the object. For more
     *         information about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA256() {
        return checksumSHA256;
    }

    /**
     * <p>
     * An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource found
     * at a URL.
     * </p>
     * 
     * @return An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource
     *         found at a URL.
     */
    public final String eTag() {
        return eTag;
    }

    /**
     * <p>
     * This is set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can happen if
     * you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example,
     * using SOAP, you can create metadata whose values are not legal HTTP headers.
     * </p>
     * 
     * @return This is set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can
     *         happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST
     *         API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
     */
    public final Integer missingMeta() {
        return missingMeta;
    }

    /**
     * <p>
     * Version of the object.
     * </p>
     * 
     * @return Version of the object.
     */
    public final String versionId() {
        return versionId;
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
     * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon
     * S3-managed encryption key, the response includes this header with the value of the server-side encryption
     * algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an
     *         Amazon S3-managed encryption key, the response includes this header with the value of the server-side
     *         encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * @see ServerSideEncryption
     */
    public final ServerSideEncryption serverSideEncryption() {
        return ServerSideEncryption.fromValue(serverSideEncryption);
    }

    /**
     * <p>
     * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon
     * S3-managed encryption key, the response includes this header with the value of the server-side encryption
     * algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an
     *         Amazon S3-managed encryption key, the response includes this header with the value of the server-side
     *         encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * @see ServerSideEncryption
     */
    public final String serverSideEncryptionAsString() {
        return serverSideEncryption;
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
     * Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS
     * (SSE-KMS).
     * </p>
     * 
     * @return Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services
     *         KMS (SSE-KMS).
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
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
     * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a
     * replication rule.
     * </p>
     * <p>
     * In replication, you have a source bucket on which you configure replication and destination bucket or buckets
     * where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or object metadata (
     * <code>HeadObject</code>) from these buckets, Amazon S3 will return the <code>x-amz-replication-status</code>
     * header in the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
     * <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
     * </p>
     * <p>
     * For example, suppose that in your replication configuration, you specify object prefix <code>TaxDocs</code>
     * requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any objects you upload with this
     * key name prefix, for example <code>TaxDocs/document1.pdf</code>, are eligible for replication. For any object
     * request with this key name prefix, Amazon S3 will return the <code>x-amz-replication-status</code> header with
     * value PENDING, COMPLETED or FAILED indicating object replication status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
     * <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a replica that
     * Amazon S3 created and there is no replica modification replication in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>When replicating objects to multiple destination buckets</b>, the <code>x-amz-replication-status</code> header
     * acts differently. The header of the source object will only return a value of COMPLETED when replication is
     * successful to all destinations. The header will remain at value PENDING until replication has completed for all
     * destinations. If one or more destinations fails replication the header will return FAILED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #replicationStatus}
     * will return {@link ReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #replicationStatusAsString}.
     * </p>
     * 
     * @return Amazon S3 can return this header if your request involves a bucket that is either a source or a
     *         destination in a replication rule.</p>
     *         <p>
     *         In replication, you have a source bucket on which you configure replication and destination bucket or
     *         buckets where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or
     *         object metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header in the response as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
     *         </p>
     *         <p>
     *         For example, suppose that in your replication configuration, you specify object prefix
     *         <code>TaxDocs</code> requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any
     *         objects you upload with this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are
     *         eligible for replication. For any object request with this key name prefix, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header with value PENDING, COMPLETED or FAILED indicating object
     *         replication status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a
     *         replica that Amazon S3 created and there is no replica modification replication in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>When replicating objects to multiple destination buckets</b>, the
     *         <code>x-amz-replication-status</code> header acts differently. The header of the source object will only
     *         return a value of COMPLETED when replication is successful to all destinations. The header will remain at
     *         value PENDING until replication has completed for all destinations. If one or more destinations fails
     *         replication the header will return FAILED.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
     * @see ReplicationStatus
     */
    public final ReplicationStatus replicationStatus() {
        return ReplicationStatus.fromValue(replicationStatus);
    }

    /**
     * <p>
     * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a
     * replication rule.
     * </p>
     * <p>
     * In replication, you have a source bucket on which you configure replication and destination bucket or buckets
     * where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or object metadata (
     * <code>HeadObject</code>) from these buckets, Amazon S3 will return the <code>x-amz-replication-status</code>
     * header in the response as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
     * <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
     * </p>
     * <p>
     * For example, suppose that in your replication configuration, you specify object prefix <code>TaxDocs</code>
     * requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any objects you upload with this
     * key name prefix, for example <code>TaxDocs/document1.pdf</code>, are eligible for replication. For any object
     * request with this key name prefix, Amazon S3 will return the <code>x-amz-replication-status</code> header with
     * value PENDING, COMPLETED or FAILED indicating object replication status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
     * <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a replica that
     * Amazon S3 created and there is no replica modification replication in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>When replicating objects to multiple destination buckets</b>, the <code>x-amz-replication-status</code> header
     * acts differently. The header of the source object will only return a value of COMPLETED when replication is
     * successful to all destinations. The header will remain at value PENDING until replication has completed for all
     * destinations. If one or more destinations fails replication the header will return FAILED.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #replicationStatus}
     * will return {@link ReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #replicationStatusAsString}.
     * </p>
     * 
     * @return Amazon S3 can return this header if your request involves a bucket that is either a source or a
     *         destination in a replication rule.</p>
     *         <p>
     *         In replication, you have a source bucket on which you configure replication and destination bucket or
     *         buckets where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or
     *         object metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header in the response as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
     *         </p>
     *         <p>
     *         For example, suppose that in your replication configuration, you specify object prefix
     *         <code>TaxDocs</code> requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any
     *         objects you upload with this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are
     *         eligible for replication. For any object request with this key name prefix, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header with value PENDING, COMPLETED or FAILED indicating object
     *         replication status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
     *         <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a
     *         replica that Amazon S3 created and there is no replica modification replication in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>When replicating objects to multiple destination buckets</b>, the
     *         <code>x-amz-replication-status</code> header acts differently. The header of the source object will only
     *         return a value of COMPLETED when replication is successful to all destinations. The header will remain at
     *         value PENDING until replication has completed for all destinations. If one or more destinations fails
     *         replication the header will return FAILED.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
     * @see ReplicationStatus
     */
    public final String replicationStatusAsString() {
        return replicationStatus;
    }

    /**
     * <p>
     * The count of parts this object has. This value is only returned if you specify <code>partNumber</code> in your
     * request and the object was uploaded as a multipart upload.
     * </p>
     * 
     * @return The count of parts this object has. This value is only returned if you specify <code>partNumber</code> in
     *         your request and the object was uploaded as a multipart upload.
     */
    public final Integer partsCount() {
        return partsCount;
    }

    /**
     * <p>
     * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has
     * the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return The Object Lock mode, if any, that's in effect for this object. This header is only returned if the
     *         requester has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object
     *         Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * @see ObjectLockMode
     */
    public final ObjectLockMode objectLockMode() {
        return ObjectLockMode.fromValue(objectLockMode);
    }

    /**
     * <p>
     * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has
     * the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockMode}
     * will return {@link ObjectLockMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockModeAsString}.
     * </p>
     * 
     * @return The Object Lock mode, if any, that's in effect for this object. This header is only returned if the
     *         requester has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object
     *         Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * @see ObjectLockMode
     */
    public final String objectLockModeAsString() {
        return objectLockMode;
    }

    /**
     * <p>
     * The date and time when the Object Lock retention period expires. This header is only returned if the requester
     * has the <code>s3:GetObjectRetention</code> permission.
     * </p>
     * 
     * @return The date and time when the Object Lock retention period expires. This header is only returned if the
     *         requester has the <code>s3:GetObjectRetention</code> permission.
     */
    public final Instant objectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * <p>
     * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has
     * the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the specified version of this
     * object has never had a legal hold applied. For more information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Specifies whether a legal hold is in effect for this object. This header is only returned if the
     *         requester has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the
     *         specified version of this object has never had a legal hold applied. For more information about S3 Object
     *         Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * @see ObjectLockLegalHoldStatus
     */
    public final ObjectLockLegalHoldStatus objectLockLegalHoldStatus() {
        return ObjectLockLegalHoldStatus.fromValue(objectLockLegalHoldStatus);
    }

    /**
     * <p>
     * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has
     * the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the specified version of this
     * object has never had a legal hold applied. For more information about S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #objectLockLegalHoldStatus} will return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw
     * value returned by the service is available from {@link #objectLockLegalHoldStatusAsString}.
     * </p>
     * 
     * @return Specifies whether a legal hold is in effect for this object. This header is only returned if the
     *         requester has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the
     *         specified version of this object has never had a legal hold applied. For more information about S3 Object
     *         Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
     * @see ObjectLockLegalHoldStatus
     */
    public final String objectLockLegalHoldStatusAsString() {
        return objectLockLegalHoldStatus;
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
        hashCode = 31 * hashCode + Objects.hashCode(deleteMarker());
        hashCode = 31 * hashCode + Objects.hashCode(acceptRanges());
        hashCode = 31 * hashCode + Objects.hashCode(expiration());
        hashCode = 31 * hashCode + Objects.hashCode(restore());
        hashCode = 31 * hashCode + Objects.hashCode(archiveStatusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
        hashCode = 31 * hashCode + Objects.hashCode(contentLength());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32C());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA1());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA256());
        hashCode = 31 * hashCode + Objects.hashCode(eTag());
        hashCode = 31 * hashCode + Objects.hashCode(missingMeta());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(cacheControl());
        hashCode = 31 * hashCode + Objects.hashCode(contentDisposition());
        hashCode = 31 * hashCode + Objects.hashCode(contentEncoding());
        hashCode = 31 * hashCode + Objects.hashCode(contentLanguage());
        hashCode = 31 * hashCode + Objects.hashCode(contentType());
        hashCode = 31 * hashCode + Objects.hashCode(expires());
        hashCode = 31 * hashCode + Objects.hashCode(websiteRedirectLocation());
        hashCode = 31 * hashCode + Objects.hashCode(serverSideEncryptionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasMetadata() ? metadata() : null);
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(replicationStatusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(partsCount());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockModeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockRetainUntilDate());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockLegalHoldStatusAsString());
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
        if (!(obj instanceof HeadObjectResponse)) {
            return false;
        }
        HeadObjectResponse other = (HeadObjectResponse) obj;
        return Objects.equals(deleteMarker(), other.deleteMarker()) && Objects.equals(acceptRanges(), other.acceptRanges())
                && Objects.equals(expiration(), other.expiration()) && Objects.equals(restore(), other.restore())
                && Objects.equals(archiveStatusAsString(), other.archiveStatusAsString())
                && Objects.equals(lastModified(), other.lastModified()) && Objects.equals(contentLength(), other.contentLength())
                && Objects.equals(checksumCRC32(), other.checksumCRC32())
                && Objects.equals(checksumCRC32C(), other.checksumCRC32C())
                && Objects.equals(checksumSHA1(), other.checksumSHA1())
                && Objects.equals(checksumSHA256(), other.checksumSHA256()) && Objects.equals(eTag(), other.eTag())
                && Objects.equals(missingMeta(), other.missingMeta()) && Objects.equals(versionId(), other.versionId())
                && Objects.equals(cacheControl(), other.cacheControl())
                && Objects.equals(contentDisposition(), other.contentDisposition())
                && Objects.equals(contentEncoding(), other.contentEncoding())
                && Objects.equals(contentLanguage(), other.contentLanguage())
                && Objects.equals(contentType(), other.contentType()) && Objects.equals(expires(), other.expires())
                && Objects.equals(websiteRedirectLocation(), other.websiteRedirectLocation())
                && Objects.equals(serverSideEncryptionAsString(), other.serverSideEncryptionAsString())
                && hasMetadata() == other.hasMetadata() && Objects.equals(metadata(), other.metadata())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(ssekmsKeyId(), other.ssekmsKeyId())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(replicationStatusAsString(), other.replicationStatusAsString())
                && Objects.equals(partsCount(), other.partsCount())
                && Objects.equals(objectLockModeAsString(), other.objectLockModeAsString())
                && Objects.equals(objectLockRetainUntilDate(), other.objectLockRetainUntilDate())
                && Objects.equals(objectLockLegalHoldStatusAsString(), other.objectLockLegalHoldStatusAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("HeadObjectResponse").add("DeleteMarker", deleteMarker()).add("AcceptRanges", acceptRanges())
                .add("Expiration", expiration()).add("Restore", restore()).add("ArchiveStatus", archiveStatusAsString())
                .add("LastModified", lastModified()).add("ContentLength", contentLength()).add("ChecksumCRC32", checksumCRC32())
                .add("ChecksumCRC32C", checksumCRC32C()).add("ChecksumSHA1", checksumSHA1())
                .add("ChecksumSHA256", checksumSHA256()).add("ETag", eTag()).add("MissingMeta", missingMeta())
                .add("VersionId", versionId()).add("CacheControl", cacheControl())
                .add("ContentDisposition", contentDisposition()).add("ContentEncoding", contentEncoding())
                .add("ContentLanguage", contentLanguage()).add("ContentType", contentType()).add("Expires", expires())
                .add("WebsiteRedirectLocation", websiteRedirectLocation())
                .add("ServerSideEncryption", serverSideEncryptionAsString()).add("Metadata", hasMetadata() ? metadata() : null)
                .add("SSECustomerAlgorithm", sseCustomerAlgorithm()).add("SSECustomerKeyMD5", sseCustomerKeyMD5())
                .add("SSEKMSKeyId", ssekmsKeyId() == null ? null : "*** Sensitive Data Redacted ***")
                .add("BucketKeyEnabled", bucketKeyEnabled()).add("StorageClass", storageClassAsString())
                .add("RequestCharged", requestChargedAsString()).add("ReplicationStatus", replicationStatusAsString())
                .add("PartsCount", partsCount()).add("ObjectLockMode", objectLockModeAsString())
                .add("ObjectLockRetainUntilDate", objectLockRetainUntilDate())
                .add("ObjectLockLegalHoldStatus", objectLockLegalHoldStatusAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DeleteMarker":
            return Optional.ofNullable(clazz.cast(deleteMarker()));
        case "AcceptRanges":
            return Optional.ofNullable(clazz.cast(acceptRanges()));
        case "Expiration":
            return Optional.ofNullable(clazz.cast(expiration()));
        case "Restore":
            return Optional.ofNullable(clazz.cast(restore()));
        case "ArchiveStatus":
            return Optional.ofNullable(clazz.cast(archiveStatusAsString()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        case "ContentLength":
            return Optional.ofNullable(clazz.cast(contentLength()));
        case "ChecksumCRC32":
            return Optional.ofNullable(clazz.cast(checksumCRC32()));
        case "ChecksumCRC32C":
            return Optional.ofNullable(clazz.cast(checksumCRC32C()));
        case "ChecksumSHA1":
            return Optional.ofNullable(clazz.cast(checksumSHA1()));
        case "ChecksumSHA256":
            return Optional.ofNullable(clazz.cast(checksumSHA256()));
        case "ETag":
            return Optional.ofNullable(clazz.cast(eTag()));
        case "MissingMeta":
            return Optional.ofNullable(clazz.cast(missingMeta()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
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
        case "WebsiteRedirectLocation":
            return Optional.ofNullable(clazz.cast(websiteRedirectLocation()));
        case "ServerSideEncryption":
            return Optional.ofNullable(clazz.cast(serverSideEncryptionAsString()));
        case "Metadata":
            return Optional.ofNullable(clazz.cast(metadata()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "SSEKMSKeyId":
            return Optional.ofNullable(clazz.cast(ssekmsKeyId()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "ReplicationStatus":
            return Optional.ofNullable(clazz.cast(replicationStatusAsString()));
        case "PartsCount":
            return Optional.ofNullable(clazz.cast(partsCount()));
        case "ObjectLockMode":
            return Optional.ofNullable(clazz.cast(objectLockModeAsString()));
        case "ObjectLockRetainUntilDate":
            return Optional.ofNullable(clazz.cast(objectLockRetainUntilDate()));
        case "ObjectLockLegalHoldStatus":
            return Optional.ofNullable(clazz.cast(objectLockLegalHoldStatusAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<HeadObjectResponse, T> g) {
        return obj -> g.apply((HeadObjectResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, HeadObjectResponse> {
        /**
         * <p>
         * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response
         * header does not appear in the response.
         * </p>
         * 
         * @param deleteMarker
         *        Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this
         *        response header does not appear in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarker(Boolean deleteMarker);

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
         * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It
         * includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs providing object expiration
         * information. The value of the <code>rule-id</code> is URL-encoded.
         * </p>
         * 
         * @param expiration
         *        If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header.
         *        It includes the <code>expiry-date</code> and <code>rule-id</code> key-value pairs providing object
         *        expiration information. The value of the <code>rule-id</code> is URL-encoded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expiration(String expiration);

        /**
         * <p>
         * If the object is an archived object (an object whose storage class is GLACIER), the response includes this
         * header if either the archive restoration is in progress (see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a> or an archive
         * copy is already restored.
         * </p>
         * <p>
         * If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the
         * object copy. For example:
         * </p>
         * <p>
         * <code>x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"</code>
         * </p>
         * <p>
         * If the object restoration is in progress, the header returns the value <code>ongoing-request="true"</code>.
         * </p>
         * <p>
         * For more information about archiving objects, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations"
         * >Transitioning Objects: General Considerations</a>.
         * </p>
         * 
         * @param restore
         *        If the object is an archived object (an object whose storage class is GLACIER), the response includes
         *        this header if either the archive restoration is in progress (see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a> or an
         *        archive copy is already restored.</p>
         *        <p>
         *        If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to
         *        delete the object copy. For example:
         *        </p>
         *        <p>
         *        <code>x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"</code>
         *        </p>
         *        <p>
         *        If the object restoration is in progress, the header returns the value
         *        <code>ongoing-request="true"</code>.
         *        </p>
         *        <p>
         *        For more information about archiving objects, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-transition-general-considerations"
         *        >Transitioning Objects: General Considerations</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder restore(String restore);

        /**
         * <p>
         * The archive state of the head object.
         * </p>
         * 
         * @param archiveStatus
         *        The archive state of the head object.
         * @see ArchiveStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ArchiveStatus
         */
        Builder archiveStatus(String archiveStatus);

        /**
         * <p>
         * The archive state of the head object.
         * </p>
         * 
         * @param archiveStatus
         *        The archive state of the head object.
         * @see ArchiveStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ArchiveStatus
         */
        Builder archiveStatus(ArchiveStatus archiveStatus);

        /**
         * <p>
         * Creation date of the object.
         * </p>
         * 
         * @param lastModified
         *        Creation date of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lastModified(Instant lastModified);

        /**
         * <p>
         * Size of the body in bytes.
         * </p>
         * 
         * @param contentLength
         *        Size of the body in bytes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentLength(Long contentLength);

        /**
         * <p>
         * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded with
         * the object. With multipart uploads, this may not be a checksum value of the object. For more information
         * about how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32
         *        The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32(String checksumCRC32);

        /**
         * <p>
         * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with
         * the object. With multipart uploads, this may not be a checksum value of the object. For more information
         * about how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32C
         *        The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32C(String checksumCRC32C);

        /**
         * <p>
         * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the
         * object. With multipart uploads, this may not be a checksum value of the object. For more information about
         * how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA1
         *        The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA1(String checksumSHA1);

        /**
         * <p>
         * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with
         * the object. With multipart uploads, this may not be a checksum value of the object. For more information
         * about how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA256
         *        The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA256(String checksumSHA256);

        /**
         * <p>
         * An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource
         * found at a URL.
         * </p>
         * 
         * @param eTag
         *        An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a
         *        resource found at a URL.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eTag(String eTag);

        /**
         * <p>
         * This is set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This can
         * happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API.
         * For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
         * </p>
         * 
         * @param missingMeta
         *        This is set to the number of metadata entries not returned in <code>x-amz-meta</code> headers. This
         *        can happen if you create metadata using an API like SOAP that supports more flexible metadata than the
         *        REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder missingMeta(Integer missingMeta);

        /**
         * <p>
         * Version of the object.
         * </p>
         * 
         * @param versionId
         *        Version of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

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
         * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon
         * S3-managed encryption key, the response includes this header with the value of the server-side encryption
         * algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an
         *        Amazon S3-managed encryption key, the response includes this header with the value of the server-side
         *        encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(String serverSideEncryption);

        /**
         * <p>
         * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon
         * S3-managed encryption key, the response includes this header with the value of the server-side encryption
         * algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an
         *        Amazon S3-managed encryption key, the response includes this header with the value of the server-side
         *        encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(ServerSideEncryption serverSideEncryption);

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
         * Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS
         * (SSE-KMS).
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services
         *        KMS (SSE-KMS).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);

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
         * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination
         * in a replication rule.
         * </p>
         * <p>
         * In replication, you have a source bucket on which you configure replication and destination bucket or buckets
         * where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or object
         * metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header in the response as follows:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
         * </p>
         * <p>
         * For example, suppose that in your replication configuration, you specify object prefix <code>TaxDocs</code>
         * requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any objects you upload with
         * this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are eligible for replication. For any
         * object request with this key name prefix, Amazon S3 will return the <code>x-amz-replication-status</code>
         * header with value PENDING, COMPLETED or FAILED indicating object replication status.
         * </p>
         * </li>
         * <li>
         * <p>
         * <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a replica
         * that Amazon S3 created and there is no replica modification replication in progress.
         * </p>
         * </li>
         * <li>
         * <p>
         * <b>When replicating objects to multiple destination buckets</b>, the <code>x-amz-replication-status</code>
         * header acts differently. The header of the source object will only return a value of COMPLETED when
         * replication is successful to all destinations. The header will remain at value PENDING until replication has
         * completed for all destinations. If one or more destinations fails replication the header will return FAILED.
         * </p>
         * </li>
         * </ul>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
         * </p>
         * 
         * @param replicationStatus
         *        Amazon S3 can return this header if your request involves a bucket that is either a source or a
         *        destination in a replication rule.</p>
         *        <p>
         *        In replication, you have a source bucket on which you configure replication and destination bucket or
         *        buckets where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or
         *        object metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header in the response as follows:
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header if the object in your request is eligible for
         *        replication.
         *        </p>
         *        <p>
         *        For example, suppose that in your replication configuration, you specify object prefix
         *        <code>TaxDocs</code> requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>.
         *        Any objects you upload with this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are
         *        eligible for replication. For any object request with this key name prefix, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header with value PENDING, COMPLETED or FAILED indicating object
         *        replication status.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a
         *        replica that Amazon S3 created and there is no replica modification replication in progress.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <b>When replicating objects to multiple destination buckets</b>, the
         *        <code>x-amz-replication-status</code> header acts differently. The header of the source object will
         *        only return a value of COMPLETED when replication is successful to all destinations. The header will
         *        remain at value PENDING until replication has completed for all destinations. If one or more
         *        destinations fails replication the header will return FAILED.
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
         * @see ReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationStatus
         */
        Builder replicationStatus(String replicationStatus);

        /**
         * <p>
         * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination
         * in a replication rule.
         * </p>
         * <p>
         * In replication, you have a source bucket on which you configure replication and destination bucket or buckets
         * where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or object
         * metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header in the response as follows:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header if the object in your request is eligible for replication.
         * </p>
         * <p>
         * For example, suppose that in your replication configuration, you specify object prefix <code>TaxDocs</code>
         * requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>. Any objects you upload with
         * this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are eligible for replication. For any
         * object request with this key name prefix, Amazon S3 will return the <code>x-amz-replication-status</code>
         * header with value PENDING, COMPLETED or FAILED indicating object replication status.
         * </p>
         * </li>
         * <li>
         * <p>
         * <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
         * <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a replica
         * that Amazon S3 created and there is no replica modification replication in progress.
         * </p>
         * </li>
         * <li>
         * <p>
         * <b>When replicating objects to multiple destination buckets</b>, the <code>x-amz-replication-status</code>
         * header acts differently. The header of the source object will only return a value of COMPLETED when
         * replication is successful to all destinations. The header will remain at value PENDING until replication has
         * completed for all destinations. If one or more destinations fails replication the header will return FAILED.
         * </p>
         * </li>
         * </ul>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
         * </p>
         * 
         * @param replicationStatus
         *        Amazon S3 can return this header if your request involves a bucket that is either a source or a
         *        destination in a replication rule.</p>
         *        <p>
         *        In replication, you have a source bucket on which you configure replication and destination bucket or
         *        buckets where Amazon S3 stores object replicas. When you request an object (<code>GetObject</code>) or
         *        object metadata (<code>HeadObject</code>) from these buckets, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header in the response as follows:
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <b>If requesting an object from the source bucket</b>, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header if the object in your request is eligible for
         *        replication.
         *        </p>
         *        <p>
         *        For example, suppose that in your replication configuration, you specify object prefix
         *        <code>TaxDocs</code> requesting Amazon S3 to replicate objects with key prefix <code>TaxDocs</code>.
         *        Any objects you upload with this key name prefix, for example <code>TaxDocs/document1.pdf</code>, are
         *        eligible for replication. For any object request with this key name prefix, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header with value PENDING, COMPLETED or FAILED indicating object
         *        replication status.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <b>If requesting an object from a destination bucket</b>, Amazon S3 will return the
         *        <code>x-amz-replication-status</code> header with value REPLICA if the object in your request is a
         *        replica that Amazon S3 created and there is no replica modification replication in progress.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <b>When replicating objects to multiple destination buckets</b>, the
         *        <code>x-amz-replication-status</code> header acts differently. The header of the source object will
         *        only return a value of COMPLETED when replication is successful to all destinations. The header will
         *        remain at value PENDING until replication has completed for all destinations. If one or more
         *        destinations fails replication the header will return FAILED.
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Replication</a>.
         * @see ReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationStatus
         */
        Builder replicationStatus(ReplicationStatus replicationStatus);

        /**
         * <p>
         * The count of parts this object has. This value is only returned if you specify <code>partNumber</code> in
         * your request and the object was uploaded as a multipart upload.
         * </p>
         * 
         * @param partsCount
         *        The count of parts this object has. This value is only returned if you specify <code>partNumber</code>
         *        in your request and the object was uploaded as a multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partsCount(Integer partsCount);

        /**
         * <p>
         * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester
         * has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object Lock, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockMode
         *        The Object Lock mode, if any, that's in effect for this object. This header is only returned if the
         *        requester has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object
         *        Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(String objectLockMode);

        /**
         * <p>
         * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester
         * has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object Lock, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockMode
         *        The Object Lock mode, if any, that's in effect for this object. This header is only returned if the
         *        requester has the <code>s3:GetObjectRetention</code> permission. For more information about S3 Object
         *        Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * @see ObjectLockMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockMode
         */
        Builder objectLockMode(ObjectLockMode objectLockMode);

        /**
         * <p>
         * The date and time when the Object Lock retention period expires. This header is only returned if the
         * requester has the <code>s3:GetObjectRetention</code> permission.
         * </p>
         * 
         * @param objectLockRetainUntilDate
         *        The date and time when the Object Lock retention period expires. This header is only returned if the
         *        requester has the <code>s3:GetObjectRetention</code> permission.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectLockRetainUntilDate(Instant objectLockRetainUntilDate);

        /**
         * <p>
         * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester
         * has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the specified version
         * of this object has never had a legal hold applied. For more information about S3 Object Lock, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Specifies whether a legal hold is in effect for this object. This header is only returned if the
         *        requester has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the
         *        specified version of this object has never had a legal hold applied. For more information about S3
         *        Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object
         *        Lock</a>.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(String objectLockLegalHoldStatus);

        /**
         * <p>
         * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester
         * has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the specified version
         * of this object has never had a legal hold applied. For more information about S3 Object Lock, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object Lock</a>.
         * </p>
         * 
         * @param objectLockLegalHoldStatus
         *        Specifies whether a legal hold is in effect for this object. This header is only returned if the
         *        requester has the <code>s3:GetObjectLegalHold</code> permission. This header is not returned if the
         *        specified version of this object has never had a legal hold applied. For more information about S3
         *        Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object
         *        Lock</a>.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder objectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean deleteMarker;

        private String acceptRanges;

        private String expiration;

        private String restore;

        private String archiveStatus;

        private Instant lastModified;

        private Long contentLength;

        private String checksumCRC32;

        private String checksumCRC32C;

        private String checksumSHA1;

        private String checksumSHA256;

        private String eTag;

        private Integer missingMeta;

        private String versionId;

        private String cacheControl;

        private String contentDisposition;

        private String contentEncoding;

        private String contentLanguage;

        private String contentType;

        private Instant expires;

        private String websiteRedirectLocation;

        private String serverSideEncryption;

        private Map<String, String> metadata = DefaultSdkAutoConstructMap.getInstance();

        private String sseCustomerAlgorithm;

        private String sseCustomerKeyMD5;

        private String ssekmsKeyId;

        private Boolean bucketKeyEnabled;

        private String storageClass;

        private String requestCharged;

        private String replicationStatus;

        private Integer partsCount;

        private String objectLockMode;

        private Instant objectLockRetainUntilDate;

        private String objectLockLegalHoldStatus;

        private BuilderImpl() {
        }

        private BuilderImpl(HeadObjectResponse model) {
            super(model);
            deleteMarker(model.deleteMarker);
            acceptRanges(model.acceptRanges);
            expiration(model.expiration);
            restore(model.restore);
            archiveStatus(model.archiveStatus);
            lastModified(model.lastModified);
            contentLength(model.contentLength);
            checksumCRC32(model.checksumCRC32);
            checksumCRC32C(model.checksumCRC32C);
            checksumSHA1(model.checksumSHA1);
            checksumSHA256(model.checksumSHA256);
            eTag(model.eTag);
            missingMeta(model.missingMeta);
            versionId(model.versionId);
            cacheControl(model.cacheControl);
            contentDisposition(model.contentDisposition);
            contentEncoding(model.contentEncoding);
            contentLanguage(model.contentLanguage);
            contentType(model.contentType);
            expires(model.expires);
            websiteRedirectLocation(model.websiteRedirectLocation);
            serverSideEncryption(model.serverSideEncryption);
            metadata(model.metadata);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            ssekmsKeyId(model.ssekmsKeyId);
            bucketKeyEnabled(model.bucketKeyEnabled);
            storageClass(model.storageClass);
            requestCharged(model.requestCharged);
            replicationStatus(model.replicationStatus);
            partsCount(model.partsCount);
            objectLockMode(model.objectLockMode);
            objectLockRetainUntilDate(model.objectLockRetainUntilDate);
            objectLockLegalHoldStatus(model.objectLockLegalHoldStatus);
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

        public final String getArchiveStatus() {
            return archiveStatus;
        }

        public final void setArchiveStatus(String archiveStatus) {
            this.archiveStatus = archiveStatus;
        }

        @Override
        public final Builder archiveStatus(String archiveStatus) {
            this.archiveStatus = archiveStatus;
            return this;
        }

        @Override
        public final Builder archiveStatus(ArchiveStatus archiveStatus) {
            this.archiveStatus(archiveStatus == null ? null : archiveStatus.toString());
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

        @Override
        public HeadObjectResponse build() {
            return new HeadObjectResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
