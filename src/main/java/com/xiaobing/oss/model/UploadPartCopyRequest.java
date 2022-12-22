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
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
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
public final class UploadPartCopyRequest extends S3Request implements
        ToCopyableBuilder<UploadPartCopyRequest.Builder, UploadPartCopyRequest> {
    private static final SdkField<String> COPY_SOURCE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySource")
            .getter(getter(UploadPartCopyRequest::copySource))
            .setter(setter(Builder::copySource))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source")
                    .unmarshallLocationName("x-amz-copy-source").build()).build();

    private static final SdkField<String> COPY_SOURCE_IF_MATCH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceIfMatch")
            .getter(getter(UploadPartCopyRequest::copySourceIfMatch))
            .setter(setter(Builder::copySourceIfMatch))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source-if-match")
                    .unmarshallLocationName("x-amz-copy-source-if-match").build()).build();

    private static final SdkField<Instant> COPY_SOURCE_IF_MODIFIED_SINCE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("CopySourceIfModifiedSince")
            .getter(getter(UploadPartCopyRequest::copySourceIfModifiedSince))
            .setter(setter(Builder::copySourceIfModifiedSince))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source-if-modified-since")
                    .unmarshallLocationName("x-amz-copy-source-if-modified-since").build()).build();

    private static final SdkField<String> COPY_SOURCE_IF_NONE_MATCH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceIfNoneMatch")
            .getter(getter(UploadPartCopyRequest::copySourceIfNoneMatch))
            .setter(setter(Builder::copySourceIfNoneMatch))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source-if-none-match")
                    .unmarshallLocationName("x-amz-copy-source-if-none-match").build()).build();

    private static final SdkField<Instant> COPY_SOURCE_IF_UNMODIFIED_SINCE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("CopySourceIfUnmodifiedSince")
            .getter(getter(UploadPartCopyRequest::copySourceIfUnmodifiedSince))
            .setter(setter(Builder::copySourceIfUnmodifiedSince))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-copy-source-if-unmodified-since")
                    .unmarshallLocationName("x-amz-copy-source-if-unmodified-since").build()).build();

    private static final SdkField<String> COPY_SOURCE_RANGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceRange")
            .getter(getter(UploadPartCopyRequest::copySourceRange))
            .setter(setter(Builder::copySourceRange))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source-range")
                    .unmarshallLocationName("x-amz-copy-source-range").build()).build();

    private static final SdkField<Integer> PART_NUMBER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartNumber")
            .getter(getter(UploadPartCopyRequest::partNumber))
            .setter(setter(Builder::partNumber))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("partNumber")
                    .unmarshallLocationName("partNumber").build()).build();

    private static final SdkField<String> UPLOAD_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadId")
            .getter(getter(UploadPartCopyRequest::uploadId))
            .setter(setter(Builder::uploadId))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("uploadId")
                    .unmarshallLocationName("uploadId").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(UploadPartCopyRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKey")
            .getter(getter(UploadPartCopyRequest::sseCustomerKey))
            .setter(setter(Builder::sseCustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(UploadPartCopyRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> COPY_SOURCE_SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceSSECustomerAlgorithm")
            .getter(getter(UploadPartCopyRequest::copySourceSSECustomerAlgorithm))
            .setter(setter(Builder::copySourceSSECustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-copy-source-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-copy-source-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> COPY_SOURCE_SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceSSECustomerKey")
            .getter(getter(UploadPartCopyRequest::copySourceSSECustomerKey))
            .setter(setter(Builder::copySourceSSECustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-copy-source-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-copy-source-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> COPY_SOURCE_SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceSSECustomerKeyMD5")
            .getter(getter(UploadPartCopyRequest::copySourceSSECustomerKeyMD5))
            .setter(setter(Builder::copySourceSSECustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-copy-source-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-copy-source-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(UploadPartCopyRequest::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(UploadPartCopyRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> EXPECTED_SOURCE_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedSourceBucketOwner")
            .getter(getter(UploadPartCopyRequest::expectedSourceBucketOwner))
            .setter(setter(Builder::expectedSourceBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-source-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-source-expected-bucket-owner").build()).build();

    private static final SdkField<String> DESTINATION_BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("DestinationBucket")
            .getter(getter(UploadPartCopyRequest::destinationBucket))
            .setter(setter(Builder::destinationBucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> DESTINATION_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("DestinationKey")
            .getter(getter(UploadPartCopyRequest::destinationKey))
            .setter(setter(Builder::destinationKey))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<String> SOURCE_BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SourceBucket")
            .getter(getter(UploadPartCopyRequest::sourceBucket))
            .setter(setter(Builder::sourceBucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SourceBucket")
                    .unmarshallLocationName("SourceBucket").build()).build();

    private static final SdkField<String> SOURCE_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SourceKey")
            .getter(getter(UploadPartCopyRequest::sourceKey))
            .setter(setter(Builder::sourceKey))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SourceKey")
                    .unmarshallLocationName("SourceKey").build()).build();

    private static final SdkField<String> SOURCE_VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SourceVersionId")
            .getter(getter(UploadPartCopyRequest::sourceVersionId))
            .setter(setter(Builder::sourceVersionId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SourceVersionId")
                    .unmarshallLocationName("SourceVersionId").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(COPY_SOURCE_FIELD,
            COPY_SOURCE_IF_MATCH_FIELD, COPY_SOURCE_IF_MODIFIED_SINCE_FIELD, COPY_SOURCE_IF_NONE_MATCH_FIELD,
            COPY_SOURCE_IF_UNMODIFIED_SINCE_FIELD, COPY_SOURCE_RANGE_FIELD, PART_NUMBER_FIELD, UPLOAD_ID_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD,
            COPY_SOURCE_SSE_CUSTOMER_ALGORITHM_FIELD, COPY_SOURCE_SSE_CUSTOMER_KEY_FIELD, COPY_SOURCE_SSE_CUSTOMER_KEY_MD5_FIELD,
            REQUEST_PAYER_FIELD, EXPECTED_BUCKET_OWNER_FIELD, EXPECTED_SOURCE_BUCKET_OWNER_FIELD, DESTINATION_BUCKET_FIELD,
            DESTINATION_KEY_FIELD, SOURCE_BUCKET_FIELD, SOURCE_KEY_FIELD, SOURCE_VERSION_ID_FIELD));

    private final String copySource;

    private final String copySourceIfMatch;

    private final Instant copySourceIfModifiedSince;

    private final String copySourceIfNoneMatch;

    private final Instant copySourceIfUnmodifiedSince;

    private final String copySourceRange;

    private final Integer partNumber;

    private final String uploadId;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKey;

    private final String sseCustomerKeyMD5;

    private final String copySourceSSECustomerAlgorithm;

    private final String copySourceSSECustomerKey;

    private final String copySourceSSECustomerKeyMD5;

    private final String requestPayer;

    private final String expectedBucketOwner;

    private final String expectedSourceBucketOwner;

    private final String destinationBucket;

    private final String destinationKey;

    private final String sourceBucket;

    private final String sourceKey;

    private final String sourceVersionId;

    private UploadPartCopyRequest(BuilderImpl builder) {
        super(builder);
        this.copySource = builder.copySource;
        this.copySourceIfMatch = builder.copySourceIfMatch;
        this.copySourceIfModifiedSince = builder.copySourceIfModifiedSince;
        this.copySourceIfNoneMatch = builder.copySourceIfNoneMatch;
        this.copySourceIfUnmodifiedSince = builder.copySourceIfUnmodifiedSince;
        this.copySourceRange = builder.copySourceRange;
        this.partNumber = builder.partNumber;
        this.uploadId = builder.uploadId;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKey = builder.sseCustomerKey;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.copySourceSSECustomerAlgorithm = builder.copySourceSSECustomerAlgorithm;
        this.copySourceSSECustomerKey = builder.copySourceSSECustomerKey;
        this.copySourceSSECustomerKeyMD5 = builder.copySourceSSECustomerKeyMD5;
        this.requestPayer = builder.requestPayer;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.expectedSourceBucketOwner = builder.expectedSourceBucketOwner;
        this.destinationBucket = builder.destinationBucket;
        this.destinationKey = builder.destinationKey;
        this.sourceBucket = builder.sourceBucket;
        this.sourceKey = builder.sourceKey;
        this.sourceVersionId = builder.sourceVersionId;
    }

    /**
     * <p>
     * Specifies the source object for the copy operation. You specify the value in one of two formats, depending on
     * whether you want to access the source object through an <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For objects not accessed through an access point, specify the name of the source bucket and key of the source
     * object, separated by a slash (/). For example, to copy the object <code>reports/january.pdf</code> from the
     * bucket <code>awsexamplebucket</code>, use <code>awsexamplebucket/reports/january.pdf</code>. The value must be
     * URL-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed
     * through the access point, in the format
     * <code>arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;</code>
     * . For example, to copy the object <code>reports/january.pdf</code> through access point
     * <code>my-access-point</code> owned by account <code>123456789012</code> in Region <code>us-west-2</code>, use the
     * URL encoding of
     * <code>arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf</code>. The value
     * must be URL encoded.
     * </p>
     * <note>
     * <p>
     * Amazon S3 supports copy operations using access points only when the source and destination buckets are in the
     * same Amazon Web Services Region.
     * </p>
     * </note>
     * <p>
     * Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in
     * the format
     * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;</code>.
     * For example, to copy the object <code>reports/january.pdf</code> through outpost <code>my-outpost</code> owned by
     * account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
     * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf</code>. The value
     * must be URL-encoded.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To copy a specific version of an object, append <code>?versionId=&lt;version-id&gt;</code> to the value (for
     * example, <code>awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893</code>). If you
     * don't specify a version ID, Amazon S3 copies the latest version of the source object.
     * </p>
     * 
     * @return Specifies the source object for the copy operation. You specify the value in one of two formats,
     *         depending on whether you want to access the source object through an <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point</a>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For objects not accessed through an access point, specify the name of the source bucket and key of the
     *         source object, separated by a slash (/). For example, to copy the object <code>reports/january.pdf</code>
     *         from the bucket <code>awsexamplebucket</code>, use <code>awsexamplebucket/reports/january.pdf</code>. The
     *         value must be URL-encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as
     *         accessed through the access point, in the format
     *         <code>arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;</code>
     *         . For example, to copy the object <code>reports/january.pdf</code> through access point
     *         <code>my-access-point</code> owned by account <code>123456789012</code> in Region <code>us-west-2</code>,
     *         use the URL encoding of
     *         <code>arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf</code>.
     *         The value must be URL encoded.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon S3 supports copy operations using access points only when the source and destination buckets are
     *         in the same Amazon Web Services Region.
     *         </p>
     *         </note>
     *         <p>
     *         Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as
     *         accessed in the format
     *         <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;</code>
     *         . For example, to copy the object <code>reports/january.pdf</code> through outpost
     *         <code>my-outpost</code> owned by account <code>123456789012</code> in Region <code>us-west-2</code>, use
     *         the URL encoding of
     *         <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf</code>.
     *         The value must be URL-encoded.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To copy a specific version of an object, append <code>?versionId=&lt;version-id&gt;</code> to the value
     *         (for example,
     *         <code>awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893</code>). If you
     *         don't specify a version ID, Amazon S3 copies the latest version of the source object.
     * @deprecated The {@code copySource} parameter has been deprecated in favor of the more user-friendly
     *             {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters. The
     *             {@code copySource} parameter will remain fully functional, but it must not be used in conjunction
     *             with its replacement parameters.
     */
    @Deprecated
    public final String copySource() {
        return copySource;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) matches the specified tag.
     * </p>
     * 
     * @return Copies the object if its entity tag (ETag) matches the specified tag.
     */
    public final String copySourceIfMatch() {
        return copySourceIfMatch;
    }

    /**
     * <p>
     * Copies the object if it has been modified since the specified time.
     * </p>
     * 
     * @return Copies the object if it has been modified since the specified time.
     */
    public final Instant copySourceIfModifiedSince() {
        return copySourceIfModifiedSince;
    }

    /**
     * <p>
     * Copies the object if its entity tag (ETag) is different than the specified ETag.
     * </p>
     * 
     * @return Copies the object if its entity tag (ETag) is different than the specified ETag.
     */
    public final String copySourceIfNoneMatch() {
        return copySourceIfNoneMatch;
    }

    /**
     * <p>
     * Copies the object if it hasn't been modified since the specified time.
     * </p>
     * 
     * @return Copies the object if it hasn't been modified since the specified time.
     */
    public final Instant copySourceIfUnmodifiedSince() {
        return copySourceIfUnmodifiedSince;
    }

    /**
     * <p>
     * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the
     * first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy
     * the first 10 bytes of the source. You can copy a range only if the source object is greater than 5 MB.
     * </p>
     * 
     * @return The range of bytes to copy from the source object. The range value must use the form bytes=first-last,
     *         where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that
     *         you want to copy the first 10 bytes of the source. You can copy a range only if the source object is
     *         greater than 5 MB.
     */
    public final String copySourceRange() {
        return copySourceRange;
    }

    /**
     * <p>
     * Part number of part being copied. This is a positive integer between 1 and 10,000.
     * </p>
     * 
     * @return Part number of part being copied. This is a positive integer between 1 and 10,000.
     */
    public final Integer partNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose part is being copied.
     * </p>
     * 
     * @return Upload ID identifying the multipart upload whose part is being copied.
     */
    public final String uploadId() {
        return uploadId;
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
     * <code>x-amz-server-side-encryption-customer-algorithm</code> header. This must be the same encryption key
     * specified in the initiate multipart upload request.
     * </p>
     * 
     * @return Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is
     *         used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key
     *         must be appropriate for use with the algorithm specified in the
     *         <code>x-amz-server-side-encryption-customer-algorithm</code> header. This must be the same encryption key
     *         specified in the initiate multipart upload request.
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
     * Specifies the algorithm to use when decrypting the source object (for example, AES256).
     * </p>
     * 
     * @return Specifies the algorithm to use when decrypting the source object (for example, AES256).
     */
    public final String copySourceSSECustomerAlgorithm() {
        return copySourceSSECustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption
     * key provided in this header must be one that was used when the source object was created.
     * </p>
     * 
     * @return Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The
     *         encryption key provided in this header must be one that was used when the source object was created.
     */
    public final String copySourceSSECustomerKey() {
        return copySourceSSECustomerKey;
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
    public final String copySourceSSECustomerKeyMD5() {
        return copySourceSSECustomerKeyMD5;
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
     * The account ID of the expected destination bucket owner. If the destination bucket is owned by a different
     * account, the request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     * </p>
     * 
     * @return The account ID of the expected destination bucket owner. If the destination bucket is owned by a
     *         different account, the request fails with the HTTP status code <code>403 Forbidden</code> (access
     *         denied).
     */
    public final String expectedBucketOwner() {
        return expectedBucketOwner;
    }

    /**
     * <p>
     * The account ID of the expected source bucket owner. If the source bucket is owned by a different account, the
     * request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     * </p>
     * 
     * @return The account ID of the expected source bucket owner. If the source bucket is owned by a different account,
     *         the request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     */
    public final String expectedSourceBucketOwner() {
        return expectedSourceBucketOwner;
    }

    /**
     * <p>
     * The bucket name.
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
     * @return The bucket name.</p>
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
     * @deprecated Use {@link #destinationBucket()}
     */
    @Deprecated
    public final String bucket() {
        return destinationBucket;
    }

    /**
     * <p>
     * The bucket name.
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
     * @return The bucket name.</p>
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
    public final String destinationBucket() {
        return destinationBucket;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * 
     * @return Object key for which the multipart upload was initiated.
     * @deprecated Use {@link #destinationKey()}
     */
    @Deprecated
    public final String key() {
        return destinationKey;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * 
     * @return Object key for which the multipart upload was initiated.
     */
    public final String destinationKey() {
        return destinationKey;
    }

    /**
     * The name of the bucket containing the object to copy. The provided input will be URL encoded. The
     * {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction
     * with the {@code copySource} parameter.
     * 
     * @return The name of the bucket containing the object to copy. The provided input will be URL encoded. The
     *         {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in
     *         conjunction with the {@code copySource} parameter.
     */
    public final String sourceBucket() {
        return sourceBucket;
    }

    /**
     * The key of the object to copy. The provided input will be URL encoded. The {@code sourceBucket},
     * {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction with the
     * {@code copySource} parameter.
     * 
     * @return The key of the object to copy. The provided input will be URL encoded. The {@code sourceBucket},
     *         {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction with the
     *         {@code copySource} parameter.
     */
    public final String sourceKey() {
        return sourceKey;
    }

    /**
     * Specifies a particular version of the source object to copy. By default the latest version is copied. The
     * {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction
     * with the {@code copySource} parameter.
     * 
     * @return Specifies a particular version of the source object to copy. By default the latest version is copied. The
     *         {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in
     *         conjunction with the {@code copySource} parameter.
     */
    public final String sourceVersionId() {
        return sourceVersionId;
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
        hashCode = 31 * hashCode + Objects.hashCode(copySource());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceIfMatch());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceIfModifiedSince());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceIfNoneMatch());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceIfUnmodifiedSince());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceRange());
        hashCode = 31 * hashCode + Objects.hashCode(partNumber());
        hashCode = 31 * hashCode + Objects.hashCode(uploadId());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceSSECustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceSSECustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceSSECustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(expectedSourceBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(destinationBucket());
        hashCode = 31 * hashCode + Objects.hashCode(destinationKey());
        hashCode = 31 * hashCode + Objects.hashCode(sourceBucket());
        hashCode = 31 * hashCode + Objects.hashCode(sourceKey());
        hashCode = 31 * hashCode + Objects.hashCode(sourceVersionId());
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
        if (!(obj instanceof UploadPartCopyRequest)) {
            return false;
        }
        UploadPartCopyRequest other = (UploadPartCopyRequest) obj;
        return Objects.equals(copySource(), other.copySource()) && Objects.equals(copySourceIfMatch(), other.copySourceIfMatch())
                && Objects.equals(copySourceIfModifiedSince(), other.copySourceIfModifiedSince())
                && Objects.equals(copySourceIfNoneMatch(), other.copySourceIfNoneMatch())
                && Objects.equals(copySourceIfUnmodifiedSince(), other.copySourceIfUnmodifiedSince())
                && Objects.equals(copySourceRange(), other.copySourceRange()) && Objects.equals(partNumber(), other.partNumber())
                && Objects.equals(uploadId(), other.uploadId())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKey(), other.sseCustomerKey())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(copySourceSSECustomerAlgorithm(), other.copySourceSSECustomerAlgorithm())
                && Objects.equals(copySourceSSECustomerKey(), other.copySourceSSECustomerKey())
                && Objects.equals(copySourceSSECustomerKeyMD5(), other.copySourceSSECustomerKeyMD5())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(expectedSourceBucketOwner(), other.expectedSourceBucketOwner())
                && Objects.equals(destinationBucket(), other.destinationBucket())
                && Objects.equals(destinationKey(), other.destinationKey())
                && Objects.equals(sourceBucket(), other.sourceBucket()) && Objects.equals(sourceKey(), other.sourceKey())
                && Objects.equals(sourceVersionId(), other.sourceVersionId());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("UploadPartCopyRequest").add("CopySource", copySource())
                .add("CopySourceIfMatch", copySourceIfMatch()).add("CopySourceIfModifiedSince", copySourceIfModifiedSince())
                .add("CopySourceIfNoneMatch", copySourceIfNoneMatch())
                .add("CopySourceIfUnmodifiedSince", copySourceIfUnmodifiedSince()).add("CopySourceRange", copySourceRange())
                .add("PartNumber", partNumber()).add("UploadId", uploadId()).add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKey", sseCustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5())
                .add("CopySourceSSECustomerAlgorithm", copySourceSSECustomerAlgorithm())
                .add("CopySourceSSECustomerKey", copySourceSSECustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("CopySourceSSECustomerKeyMD5", copySourceSSECustomerKeyMD5()).add("RequestPayer", requestPayerAsString())
                .add("ExpectedBucketOwner", expectedBucketOwner()).add("ExpectedSourceBucketOwner", expectedSourceBucketOwner())
                .add("DestinationBucket", destinationBucket()).add("DestinationKey", destinationKey())
                .add("SourceBucket", sourceBucket()).add("SourceKey", sourceKey()).add("SourceVersionId", sourceVersionId())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "CopySource":
            return Optional.ofNullable(clazz.cast(copySource()));
        case "CopySourceIfMatch":
            return Optional.ofNullable(clazz.cast(copySourceIfMatch()));
        case "CopySourceIfModifiedSince":
            return Optional.ofNullable(clazz.cast(copySourceIfModifiedSince()));
        case "CopySourceIfNoneMatch":
            return Optional.ofNullable(clazz.cast(copySourceIfNoneMatch()));
        case "CopySourceIfUnmodifiedSince":
            return Optional.ofNullable(clazz.cast(copySourceIfUnmodifiedSince()));
        case "CopySourceRange":
            return Optional.ofNullable(clazz.cast(copySourceRange()));
        case "PartNumber":
            return Optional.ofNullable(clazz.cast(partNumber()));
        case "UploadId":
            return Optional.ofNullable(clazz.cast(uploadId()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKey":
            return Optional.ofNullable(clazz.cast(sseCustomerKey()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "CopySourceSSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(copySourceSSECustomerAlgorithm()));
        case "CopySourceSSECustomerKey":
            return Optional.ofNullable(clazz.cast(copySourceSSECustomerKey()));
        case "CopySourceSSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(copySourceSSECustomerKeyMD5()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "ExpectedSourceBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedSourceBucketOwner()));
        case "DestinationBucket":
            return Optional.ofNullable(clazz.cast(destinationBucket()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(destinationBucket()));
        case "DestinationKey":
            return Optional.ofNullable(clazz.cast(destinationKey()));
        case "Key":
            return Optional.ofNullable(clazz.cast(destinationKey()));
        case "SourceBucket":
            return Optional.ofNullable(clazz.cast(sourceBucket()));
        case "SourceKey":
            return Optional.ofNullable(clazz.cast(sourceKey()));
        case "SourceVersionId":
            return Optional.ofNullable(clazz.cast(sourceVersionId()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<UploadPartCopyRequest, T> g) {
        return obj -> g.apply((UploadPartCopyRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, UploadPartCopyRequest> {
        /**
         * <p>
         * Specifies the source object for the copy operation. You specify the value in one of two formats, depending on
         * whether you want to access the source object through an <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point</a>:
         * </p>
         * <ul>
         * <li>
         * <p>
         * For objects not accessed through an access point, specify the name of the source bucket and key of the source
         * object, separated by a slash (/). For example, to copy the object <code>reports/january.pdf</code> from the
         * bucket <code>awsexamplebucket</code>, use <code>awsexamplebucket/reports/january.pdf</code>. The value must
         * be URL-encoded.
         * </p>
         * </li>
         * <li>
         * <p>
         * For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed
         * through the access point, in the format
         * <code>arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;</code>
         * . For example, to copy the object <code>reports/january.pdf</code> through access point
         * <code>my-access-point</code> owned by account <code>123456789012</code> in Region <code>us-west-2</code>, use
         * the URL encoding of
         * <code>arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf</code>. The
         * value must be URL encoded.
         * </p>
         * <note>
         * <p>
         * Amazon S3 supports copy operations using access points only when the source and destination buckets are in
         * the same Amazon Web Services Region.
         * </p>
         * </note>
         * <p>
         * Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed
         * in the format
         * <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;</code>
         * . For example, to copy the object <code>reports/january.pdf</code> through outpost <code>my-outpost</code>
         * owned by account <code>123456789012</code> in Region <code>us-west-2</code>, use the URL encoding of
         * <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf</code>. The
         * value must be URL-encoded.
         * </p>
         * </li>
         * </ul>
         * <p>
         * To copy a specific version of an object, append <code>?versionId=&lt;version-id&gt;</code> to the value (for
         * example, <code>awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893</code>). If
         * you don't specify a version ID, Amazon S3 copies the latest version of the source object.
         * </p>
         * 
         * @param copySource
         *        Specifies the source object for the copy operation. You specify the value in one of two formats,
         *        depending on whether you want to access the source object through an <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point</a>:</p>
         *        <ul>
         *        <li>
         *        <p>
         *        For objects not accessed through an access point, specify the name of the source bucket and key of the
         *        source object, separated by a slash (/). For example, to copy the object
         *        <code>reports/january.pdf</code> from the bucket <code>awsexamplebucket</code>, use
         *        <code>awsexamplebucket/reports/january.pdf</code>. The value must be URL-encoded.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as
         *        accessed through the access point, in the format
         *        <code>arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;</code>
         *        . For example, to copy the object <code>reports/january.pdf</code> through access point
         *        <code>my-access-point</code> owned by account <code>123456789012</code> in Region
         *        <code>us-west-2</code>, use the URL encoding of
         *        <code>arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf</code>.
         *        The value must be URL encoded.
         *        </p>
         *        <note>
         *        <p>
         *        Amazon S3 supports copy operations using access points only when the source and destination buckets
         *        are in the same Amazon Web Services Region.
         *        </p>
         *        </note>
         *        <p>
         *        Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as
         *        accessed in the format
         *        <code>arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;</code>
         *        . For example, to copy the object <code>reports/january.pdf</code> through outpost
         *        <code>my-outpost</code> owned by account <code>123456789012</code> in Region <code>us-west-2</code>,
         *        use the URL encoding of
         *        <code>arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf</code>.
         *        The value must be URL-encoded.
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        To copy a specific version of an object, append <code>?versionId=&lt;version-id&gt;</code> to the
         *        value (for example,
         *        <code>awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893</code>). If
         *        you don't specify a version ID, Amazon S3 copies the latest version of the source object.
         * @return Returns a reference to this object so that method calls can be chained together.
         * @deprecated The {@code copySource} parameter has been deprecated in favor of the more user-friendly
         *             {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters. The
         *             {@code copySource} parameter will remain fully functional, but it must not be used in conjunction
         *             with its replacement parameters.
         */
        @Deprecated
        Builder copySource(String copySource);

        /**
         * <p>
         * Copies the object if its entity tag (ETag) matches the specified tag.
         * </p>
         * 
         * @param copySourceIfMatch
         *        Copies the object if its entity tag (ETag) matches the specified tag.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceIfMatch(String copySourceIfMatch);

        /**
         * <p>
         * Copies the object if it has been modified since the specified time.
         * </p>
         * 
         * @param copySourceIfModifiedSince
         *        Copies the object if it has been modified since the specified time.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceIfModifiedSince(Instant copySourceIfModifiedSince);

        /**
         * <p>
         * Copies the object if its entity tag (ETag) is different than the specified ETag.
         * </p>
         * 
         * @param copySourceIfNoneMatch
         *        Copies the object if its entity tag (ETag) is different than the specified ETag.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceIfNoneMatch(String copySourceIfNoneMatch);

        /**
         * <p>
         * Copies the object if it hasn't been modified since the specified time.
         * </p>
         * 
         * @param copySourceIfUnmodifiedSince
         *        Copies the object if it hasn't been modified since the specified time.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceIfUnmodifiedSince(Instant copySourceIfUnmodifiedSince);

        /**
         * <p>
         * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where
         * the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to
         * copy the first 10 bytes of the source. You can copy a range only if the source object is greater than 5 MB.
         * </p>
         * 
         * @param copySourceRange
         *        The range of bytes to copy from the source object. The range value must use the form bytes=first-last,
         *        where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates
         *        that you want to copy the first 10 bytes of the source. You can copy a range only if the source object
         *        is greater than 5 MB.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceRange(String copySourceRange);

        /**
         * <p>
         * Part number of part being copied. This is a positive integer between 1 and 10,000.
         * </p>
         * 
         * @param partNumber
         *        Part number of part being copied. This is a positive integer between 1 and 10,000.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partNumber(Integer partNumber);

        /**
         * <p>
         * Upload ID identifying the multipart upload whose part is being copied.
         * </p>
         * 
         * @param uploadId
         *        Upload ID identifying the multipart upload whose part is being copied.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploadId(String uploadId);

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
         * <code>x-amz-server-side-encryption-customer-algorithm</code> header. This must be the same encryption key
         * specified in the initiate multipart upload request.
         * </p>
         * 
         * @param sseCustomerKey
         *        Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is
         *        used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The
         *        key must be appropriate for use with the algorithm specified in the
         *        <code>x-amz-server-side-encryption-customer-algorithm</code> header. This must be the same encryption
         *        key specified in the initiate multipart upload request.
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
         * Specifies the algorithm to use when decrypting the source object (for example, AES256).
         * </p>
         * 
         * @param copySourceSSECustomerAlgorithm
         *        Specifies the algorithm to use when decrypting the source object (for example, AES256).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceSSECustomerAlgorithm(String copySourceSSECustomerAlgorithm);

        /**
         * <p>
         * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The
         * encryption key provided in this header must be one that was used when the source object was created.
         * </p>
         * 
         * @param copySourceSSECustomerKey
         *        Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The
         *        encryption key provided in this header must be one that was used when the source object was created.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceSSECustomerKey(String copySourceSSECustomerKey);

        /**
         * <p>
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for
         * a message integrity check to ensure that the encryption key was transmitted without error.
         * </p>
         * 
         * @param copySourceSSECustomerKeyMD5
         *        Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this
         *        header for a message integrity check to ensure that the encryption key was transmitted without error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5);

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
         * The account ID of the expected destination bucket owner. If the destination bucket is owned by a different
         * account, the request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * </p>
         * 
         * @param expectedBucketOwner
         *        The account ID of the expected destination bucket owner. If the destination bucket is owned by a
         *        different account, the request fails with the HTTP status code <code>403 Forbidden</code> (access
         *        denied).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expectedBucketOwner(String expectedBucketOwner);

        /**
         * <p>
         * The account ID of the expected source bucket owner. If the source bucket is owned by a different account, the
         * request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * </p>
         * 
         * @param expectedSourceBucketOwner
         *        The account ID of the expected source bucket owner. If the source bucket is owned by a different
         *        account, the request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expectedSourceBucketOwner(String expectedSourceBucketOwner);

        /**
         * <p>
         * The bucket name.
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
         * @param destinationBucket
         *        The bucket name.</p>
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
        Builder destinationBucket(String destinationBucket);

        /**
         * <p>
         * The bucket name.
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
         * @param destinationBucket
         *        The bucket name.</p>
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
         * @deprecated Use {@link #destinationBucket(String)}
         */
        @Deprecated
        Builder bucket(String destinationBucket);

        /**
         * <p>
         * Object key for which the multipart upload was initiated.
         * </p>
         * 
         * @param destinationKey
         *        Object key for which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder destinationKey(String destinationKey);

        /**
         * <p>
         * Object key for which the multipart upload was initiated.
         * </p>
         * 
         * @param destinationKey
         *        Object key for which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         * @deprecated Use {@link #destinationKey(String)}
         */
        @Deprecated
        Builder key(String destinationKey);

        /**
         * The name of the bucket containing the object to copy. The provided input will be URL encoded. The
         * {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in
         * conjunction with the {@code copySource} parameter.
         * 
         * @param sourceBucket
         *        The name of the bucket containing the object to copy. The provided input will be URL encoded. The
         *        {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in
         *        conjunction with the {@code copySource} parameter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sourceBucket(String sourceBucket);

        /**
         * The key of the object to copy. The provided input will be URL encoded. The {@code sourceBucket},
         * {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction with the
         * {@code copySource} parameter.
         * 
         * @param sourceKey
         *        The key of the object to copy. The provided input will be URL encoded. The {@code sourceBucket},
         *        {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in conjunction with the
         *        {@code copySource} parameter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sourceKey(String sourceKey);

        /**
         * Specifies a particular version of the source object to copy. By default the latest version is copied. The
         * {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used in
         * conjunction with the {@code copySource} parameter.
         * 
         * @param sourceVersionId
         *        Specifies a particular version of the source object to copy. By default the latest version is copied.
         *        The {@code sourceBucket}, {@code sourceKey}, and {@code sourceVersionId} parameters must not be used
         *        in conjunction with the {@code copySource} parameter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sourceVersionId(String sourceVersionId);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String copySource;

        private String copySourceIfMatch;

        private Instant copySourceIfModifiedSince;

        private String copySourceIfNoneMatch;

        private Instant copySourceIfUnmodifiedSince;

        private String copySourceRange;

        private Integer partNumber;

        private String uploadId;

        private String sseCustomerAlgorithm;

        private String sseCustomerKey;

        private String sseCustomerKeyMD5;

        private String copySourceSSECustomerAlgorithm;

        private String copySourceSSECustomerKey;

        private String copySourceSSECustomerKeyMD5;

        private String requestPayer;

        private String expectedBucketOwner;

        private String expectedSourceBucketOwner;

        private String destinationBucket;

        private String destinationKey;

        private String sourceBucket;

        private String sourceKey;

        private String sourceVersionId;

        private BuilderImpl() {
        }

        private BuilderImpl(UploadPartCopyRequest model) {
            super(model);
            copySource(model.copySource);
            copySourceIfMatch(model.copySourceIfMatch);
            copySourceIfModifiedSince(model.copySourceIfModifiedSince);
            copySourceIfNoneMatch(model.copySourceIfNoneMatch);
            copySourceIfUnmodifiedSince(model.copySourceIfUnmodifiedSince);
            copySourceRange(model.copySourceRange);
            partNumber(model.partNumber);
            uploadId(model.uploadId);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKey(model.sseCustomerKey);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            copySourceSSECustomerAlgorithm(model.copySourceSSECustomerAlgorithm);
            copySourceSSECustomerKey(model.copySourceSSECustomerKey);
            copySourceSSECustomerKeyMD5(model.copySourceSSECustomerKeyMD5);
            requestPayer(model.requestPayer);
            expectedBucketOwner(model.expectedBucketOwner);
            expectedSourceBucketOwner(model.expectedSourceBucketOwner);
            destinationBucket(model.destinationBucket);
            destinationKey(model.destinationKey);
            sourceBucket(model.sourceBucket);
            sourceKey(model.sourceKey);
            sourceVersionId(model.sourceVersionId);
        }

        @Deprecated
        public final String getCopySource() {
            return copySource;
        }

        @Deprecated
        public final void setCopySource(String copySource) {
            this.copySource = copySource;
        }

        @Override
        @Deprecated
        public final Builder copySource(String copySource) {
            this.copySource = copySource;
            return this;
        }

        public final String getCopySourceIfMatch() {
            return copySourceIfMatch;
        }

        public final void setCopySourceIfMatch(String copySourceIfMatch) {
            this.copySourceIfMatch = copySourceIfMatch;
        }

        @Override
        public final Builder copySourceIfMatch(String copySourceIfMatch) {
            this.copySourceIfMatch = copySourceIfMatch;
            return this;
        }

        public final Instant getCopySourceIfModifiedSince() {
            return copySourceIfModifiedSince;
        }

        public final void setCopySourceIfModifiedSince(Instant copySourceIfModifiedSince) {
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
        }

        @Override
        public final Builder copySourceIfModifiedSince(Instant copySourceIfModifiedSince) {
            this.copySourceIfModifiedSince = copySourceIfModifiedSince;
            return this;
        }

        public final String getCopySourceIfNoneMatch() {
            return copySourceIfNoneMatch;
        }

        public final void setCopySourceIfNoneMatch(String copySourceIfNoneMatch) {
            this.copySourceIfNoneMatch = copySourceIfNoneMatch;
        }

        @Override
        public final Builder copySourceIfNoneMatch(String copySourceIfNoneMatch) {
            this.copySourceIfNoneMatch = copySourceIfNoneMatch;
            return this;
        }

        public final Instant getCopySourceIfUnmodifiedSince() {
            return copySourceIfUnmodifiedSince;
        }

        public final void setCopySourceIfUnmodifiedSince(Instant copySourceIfUnmodifiedSince) {
            this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
        }

        @Override
        public final Builder copySourceIfUnmodifiedSince(Instant copySourceIfUnmodifiedSince) {
            this.copySourceIfUnmodifiedSince = copySourceIfUnmodifiedSince;
            return this;
        }

        public final String getCopySourceRange() {
            return copySourceRange;
        }

        public final void setCopySourceRange(String copySourceRange) {
            this.copySourceRange = copySourceRange;
        }

        @Override
        public final Builder copySourceRange(String copySourceRange) {
            this.copySourceRange = copySourceRange;
            return this;
        }

        public final Integer getPartNumber() {
            return partNumber;
        }

        public final void setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
        }

        @Override
        public final Builder partNumber(Integer partNumber) {
            this.partNumber = partNumber;
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

        public final String getCopySourceSSECustomerAlgorithm() {
            return copySourceSSECustomerAlgorithm;
        }

        public final void setCopySourceSSECustomerAlgorithm(String copySourceSSECustomerAlgorithm) {
            this.copySourceSSECustomerAlgorithm = copySourceSSECustomerAlgorithm;
        }

        @Override
        public final Builder copySourceSSECustomerAlgorithm(String copySourceSSECustomerAlgorithm) {
            this.copySourceSSECustomerAlgorithm = copySourceSSECustomerAlgorithm;
            return this;
        }

        public final String getCopySourceSSECustomerKey() {
            return copySourceSSECustomerKey;
        }

        public final void setCopySourceSSECustomerKey(String copySourceSSECustomerKey) {
            this.copySourceSSECustomerKey = copySourceSSECustomerKey;
        }

        @Override
        public final Builder copySourceSSECustomerKey(String copySourceSSECustomerKey) {
            this.copySourceSSECustomerKey = copySourceSSECustomerKey;
            return this;
        }

        public final String getCopySourceSSECustomerKeyMD5() {
            return copySourceSSECustomerKeyMD5;
        }

        public final void setCopySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5) {
            this.copySourceSSECustomerKeyMD5 = copySourceSSECustomerKeyMD5;
        }

        @Override
        public final Builder copySourceSSECustomerKeyMD5(String copySourceSSECustomerKeyMD5) {
            this.copySourceSSECustomerKeyMD5 = copySourceSSECustomerKeyMD5;
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

        public final String getExpectedSourceBucketOwner() {
            return expectedSourceBucketOwner;
        }

        public final void setExpectedSourceBucketOwner(String expectedSourceBucketOwner) {
            this.expectedSourceBucketOwner = expectedSourceBucketOwner;
        }

        @Override
        public final Builder expectedSourceBucketOwner(String expectedSourceBucketOwner) {
            this.expectedSourceBucketOwner = expectedSourceBucketOwner;
            return this;
        }

        public final String getDestinationBucket() {
            return destinationBucket;
        }

        public final void setDestinationBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
        }

        /**
         * @deprecated Use {@link #setDestinationBucket} instead
         */
        @Deprecated
        public final void setBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
        }

        @Override
        public final Builder destinationBucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
            return this;
        }

        @Override
        public final Builder bucket(String destinationBucket) {
            this.destinationBucket = destinationBucket;
            return this;
        }

        public final String getDestinationKey() {
            return destinationKey;
        }

        public final void setDestinationKey(String destinationKey) {
            this.destinationKey = destinationKey;
        }

        /**
         * @deprecated Use {@link #setDestinationKey} instead
         */
        @Deprecated
        public final void setKey(String destinationKey) {
            this.destinationKey = destinationKey;
        }

        @Override
        public final Builder destinationKey(String destinationKey) {
            this.destinationKey = destinationKey;
            return this;
        }

        @Override
        public final Builder key(String destinationKey) {
            this.destinationKey = destinationKey;
            return this;
        }

        public final String getSourceBucket() {
            return sourceBucket;
        }

        public final void setSourceBucket(String sourceBucket) {
            this.sourceBucket = sourceBucket;
        }

        @Override
        public final Builder sourceBucket(String sourceBucket) {
            this.sourceBucket = sourceBucket;
            return this;
        }

        public final String getSourceKey() {
            return sourceKey;
        }

        public final void setSourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
        }

        @Override
        public final Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            return this;
        }

        public final String getSourceVersionId() {
            return sourceVersionId;
        }

        public final void setSourceVersionId(String sourceVersionId) {
            this.sourceVersionId = sourceVersionId;
        }

        @Override
        public final Builder sourceVersionId(String sourceVersionId) {
            this.sourceVersionId = sourceVersionId;
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
        public UploadPartCopyRequest build() {
            return new UploadPartCopyRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
