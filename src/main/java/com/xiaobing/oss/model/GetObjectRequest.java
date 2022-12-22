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
import software.amazon.awssdk.core.traits.TimestampFormatTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetObjectRequest extends S3Request implements ToCopyableBuilder<GetObjectRequest.Builder, GetObjectRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(GetObjectRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> IF_MATCH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("IfMatch")
            .getter(getter(GetObjectRequest::ifMatch))
            .setter(setter(Builder::ifMatch))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("If-Match")
                    .unmarshallLocationName("If-Match").build()).build();

    private static final SdkField<Instant> IF_MODIFIED_SINCE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("IfModifiedSince")
            .getter(getter(GetObjectRequest::ifModifiedSince))
            .setter(setter(Builder::ifModifiedSince))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("If-Modified-Since")
                    .unmarshallLocationName("If-Modified-Since").build()).build();

    private static final SdkField<String> IF_NONE_MATCH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("IfNoneMatch")
            .getter(getter(GetObjectRequest::ifNoneMatch))
            .setter(setter(Builder::ifNoneMatch))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("If-None-Match")
                    .unmarshallLocationName("If-None-Match").build()).build();

    private static final SdkField<Instant> IF_UNMODIFIED_SINCE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("IfUnmodifiedSince")
            .getter(getter(GetObjectRequest::ifUnmodifiedSince))
            .setter(setter(Builder::ifUnmodifiedSince))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("If-Unmodified-Since")
                    .unmarshallLocationName("If-Unmodified-Since").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(GetObjectRequest::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<String> RANGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Range")
            .getter(getter(GetObjectRequest::range))
            .setter(setter(Builder::range))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Range")
                    .unmarshallLocationName("Range").build()).build();

    private static final SdkField<String> RESPONSE_CACHE_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ResponseCacheControl")
            .getter(getter(GetObjectRequest::responseCacheControl))
            .setter(setter(Builder::responseCacheControl))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-cache-control")
                    .unmarshallLocationName("response-cache-control").build()).build();

    private static final SdkField<String> RESPONSE_CONTENT_DISPOSITION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ResponseContentDisposition")
            .getter(getter(GetObjectRequest::responseContentDisposition))
            .setter(setter(Builder::responseContentDisposition))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-content-disposition")
                    .unmarshallLocationName("response-content-disposition").build()).build();

    private static final SdkField<String> RESPONSE_CONTENT_ENCODING_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ResponseContentEncoding")
            .getter(getter(GetObjectRequest::responseContentEncoding))
            .setter(setter(Builder::responseContentEncoding))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-content-encoding")
                    .unmarshallLocationName("response-content-encoding").build()).build();

    private static final SdkField<String> RESPONSE_CONTENT_LANGUAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ResponseContentLanguage")
            .getter(getter(GetObjectRequest::responseContentLanguage))
            .setter(setter(Builder::responseContentLanguage))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-content-language")
                    .unmarshallLocationName("response-content-language").build()).build();

    private static final SdkField<String> RESPONSE_CONTENT_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ResponseContentType")
            .getter(getter(GetObjectRequest::responseContentType))
            .setter(setter(Builder::responseContentType))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-content-type")
                    .unmarshallLocationName("response-content-type").build()).build();

    private static final SdkField<Instant> RESPONSE_EXPIRES_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("ResponseExpires")
            .getter(getter(GetObjectRequest::responseExpires))
            .setter(setter(Builder::responseExpires))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("response-expires")
                    .unmarshallLocationName("response-expires").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.RFC_822)).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(GetObjectRequest::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("versionId")
                    .unmarshallLocationName("versionId").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(GetObjectRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKey")
            .getter(getter(GetObjectRequest::sseCustomerKey))
            .setter(setter(Builder::sseCustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(GetObjectRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(GetObjectRequest::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final SdkField<Integer> PART_NUMBER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartNumber")
            .getter(getter(GetObjectRequest::partNumber))
            .setter(setter(Builder::partNumber))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("partNumber")
                    .unmarshallLocationName("partNumber").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(GetObjectRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<String> CHECKSUM_MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumMode")
            .getter(getter(GetObjectRequest::checksumModeAsString))
            .setter(setter(Builder::checksumMode))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-checksum-mode")
                    .unmarshallLocationName("x-amz-checksum-mode").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, IF_MATCH_FIELD,
            IF_MODIFIED_SINCE_FIELD, IF_NONE_MATCH_FIELD, IF_UNMODIFIED_SINCE_FIELD, KEY_FIELD, RANGE_FIELD,
            RESPONSE_CACHE_CONTROL_FIELD, RESPONSE_CONTENT_DISPOSITION_FIELD, RESPONSE_CONTENT_ENCODING_FIELD,
            RESPONSE_CONTENT_LANGUAGE_FIELD, RESPONSE_CONTENT_TYPE_FIELD, RESPONSE_EXPIRES_FIELD, VERSION_ID_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD, REQUEST_PAYER_FIELD,
            PART_NUMBER_FIELD, EXPECTED_BUCKET_OWNER_FIELD, CHECKSUM_MODE_FIELD));

    private final String bucket;

    private final String ifMatch;

    private final Instant ifModifiedSince;

    private final String ifNoneMatch;

    private final Instant ifUnmodifiedSince;

    private final String key;

    private final String range;

    private final String responseCacheControl;

    private final String responseContentDisposition;

    private final String responseContentEncoding;

    private final String responseContentLanguage;

    private final String responseContentType;

    private final Instant responseExpires;

    private final String versionId;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKey;

    private final String sseCustomerKeyMD5;

    private final String requestPayer;

    private final Integer partNumber;

    private final String expectedBucketOwner;

    private final String checksumMode;

    private GetObjectRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.ifMatch = builder.ifMatch;
        this.ifModifiedSince = builder.ifModifiedSince;
        this.ifNoneMatch = builder.ifNoneMatch;
        this.ifUnmodifiedSince = builder.ifUnmodifiedSince;
        this.key = builder.key;
        this.range = builder.range;
        this.responseCacheControl = builder.responseCacheControl;
        this.responseContentDisposition = builder.responseContentDisposition;
        this.responseContentEncoding = builder.responseContentEncoding;
        this.responseContentLanguage = builder.responseContentLanguage;
        this.responseContentType = builder.responseContentType;
        this.responseExpires = builder.responseExpires;
        this.versionId = builder.versionId;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKey = builder.sseCustomerKey;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.requestPayer = builder.requestPayer;
        this.partNumber = builder.partNumber;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.checksumMode = builder.checksumMode;
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
     * When using an Object Lambda access point the hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-object-lambda.<i>Region</i>.amazonaws.com.
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
     *         When using an Object Lambda access point the hostname takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-object-lambda.<i>Region</i>.amazonaws.com.
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
     * Return the object only if its entity tag (ETag) is the same as the one specified; otherwise, return a 412
     * (precondition failed) error.
     * </p>
     * 
     * @return Return the object only if its entity tag (ETag) is the same as the one specified; otherwise, return a 412
     *         (precondition failed) error.
     */
    public final String ifMatch() {
        return ifMatch;
    }

    /**
     * <p>
     * Return the object only if it has been modified since the specified time; otherwise, return a 304 (not modified)
     * error.
     * </p>
     * 
     * @return Return the object only if it has been modified since the specified time; otherwise, return a 304 (not
     *         modified) error.
     */
    public final Instant ifModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * <p>
     * Return the object only if its entity tag (ETag) is different from the one specified; otherwise, return a 304 (not
     * modified) error.
     * </p>
     * 
     * @return Return the object only if its entity tag (ETag) is different from the one specified; otherwise, return a
     *         304 (not modified) error.
     */
    public final String ifNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * <p>
     * Return the object only if it has not been modified since the specified time; otherwise, return a 412
     * (precondition failed) error.
     * </p>
     * 
     * @return Return the object only if it has not been modified since the specified time; otherwise, return a 412
     *         (precondition failed) error.
     */
    public final Instant ifUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    /**
     * <p>
     * Key of the object to get.
     * </p>
     * 
     * @return Key of the object to get.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * </p>
     * <note>
     * <p>
     * Amazon S3 doesn't support retrieving multiple ranges of data per <code>GET</code> request.
     * </p>
     * </note>
     * 
     * @return Downloads the specified range bytes of an object. For more information about the HTTP Range header, see
     *         <a href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">https://www.w3.org/Protocols/
     *         rfc2616/rfc2616-sec14.html#sec14.35</a>.</p> <note>
     *         <p>
     *         Amazon S3 doesn't support retrieving multiple ranges of data per <code>GET</code> request.
     *         </p>
     */
    public final String range() {
        return range;
    }

    /**
     * <p>
     * Sets the <code>Cache-Control</code> header of the response.
     * </p>
     * 
     * @return Sets the <code>Cache-Control</code> header of the response.
     */
    public final String responseCacheControl() {
        return responseCacheControl;
    }

    /**
     * <p>
     * Sets the <code>Content-Disposition</code> header of the response
     * </p>
     * 
     * @return Sets the <code>Content-Disposition</code> header of the response
     */
    public final String responseContentDisposition() {
        return responseContentDisposition;
    }

    /**
     * <p>
     * Sets the <code>Content-Encoding</code> header of the response.
     * </p>
     * 
     * @return Sets the <code>Content-Encoding</code> header of the response.
     */
    public final String responseContentEncoding() {
        return responseContentEncoding;
    }

    /**
     * <p>
     * Sets the <code>Content-Language</code> header of the response.
     * </p>
     * 
     * @return Sets the <code>Content-Language</code> header of the response.
     */
    public final String responseContentLanguage() {
        return responseContentLanguage;
    }

    /**
     * <p>
     * Sets the <code>Content-Type</code> header of the response.
     * </p>
     * 
     * @return Sets the <code>Content-Type</code> header of the response.
     */
    public final String responseContentType() {
        return responseContentType;
    }

    /**
     * <p>
     * Sets the <code>Expires</code> header of the response.
     * </p>
     * 
     * @return Sets the <code>Expires</code> header of the response.
     */
    public final Instant responseExpires() {
        return responseExpires;
    }

    /**
     * <p>
     * VersionId used to reference a specific version of the object.
     * </p>
     * 
     * @return VersionId used to reference a specific version of the object.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * Specifies the algorithm to use to when decrypting the object (for example, AES256).
     * </p>
     * 
     * @return Specifies the algorithm to use to when decrypting the object (for example, AES256).
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used to
     * decrypt the object when recovering it and must match the one used when storing the data. The key must be
     * appropriate for use with the algorithm specified in the
     * <code>x-amz-server-side-encryption-customer-algorithm</code> header.
     * </p>
     * 
     * @return Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used
     *         to decrypt the object when recovering it and must match the one used when storing the data. The key must
     *         be appropriate for use with the algorithm specified in the
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
     * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a
     * 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
     * </p>
     * 
     * @return Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively
     *         performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
     */
    public final Integer partNumber() {
        return partNumber;
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
     * To retrieve the checksum, this mode must be enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumMode} will
     * return {@link ChecksumMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #checksumModeAsString}.
     * </p>
     * 
     * @return To retrieve the checksum, this mode must be enabled.
     * @see ChecksumMode
     */
    public final ChecksumMode checksumMode() {
        return ChecksumMode.fromValue(checksumMode);
    }

    /**
     * <p>
     * To retrieve the checksum, this mode must be enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumMode} will
     * return {@link ChecksumMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #checksumModeAsString}.
     * </p>
     * 
     * @return To retrieve the checksum, this mode must be enabled.
     * @see ChecksumMode
     */
    public final String checksumModeAsString() {
        return checksumMode;
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
        hashCode = 31 * hashCode + Objects.hashCode(ifMatch());
        hashCode = 31 * hashCode + Objects.hashCode(ifModifiedSince());
        hashCode = 31 * hashCode + Objects.hashCode(ifNoneMatch());
        hashCode = 31 * hashCode + Objects.hashCode(ifUnmodifiedSince());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(range());
        hashCode = 31 * hashCode + Objects.hashCode(responseCacheControl());
        hashCode = 31 * hashCode + Objects.hashCode(responseContentDisposition());
        hashCode = 31 * hashCode + Objects.hashCode(responseContentEncoding());
        hashCode = 31 * hashCode + Objects.hashCode(responseContentLanguage());
        hashCode = 31 * hashCode + Objects.hashCode(responseContentType());
        hashCode = 31 * hashCode + Objects.hashCode(responseExpires());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
        hashCode = 31 * hashCode + Objects.hashCode(partNumber());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(checksumModeAsString());
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
        if (!(obj instanceof GetObjectRequest)) {
            return false;
        }
        GetObjectRequest other = (GetObjectRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(ifMatch(), other.ifMatch())
                && Objects.equals(ifModifiedSince(), other.ifModifiedSince())
                && Objects.equals(ifNoneMatch(), other.ifNoneMatch())
                && Objects.equals(ifUnmodifiedSince(), other.ifUnmodifiedSince()) && Objects.equals(key(), other.key())
                && Objects.equals(range(), other.range()) && Objects.equals(responseCacheControl(), other.responseCacheControl())
                && Objects.equals(responseContentDisposition(), other.responseContentDisposition())
                && Objects.equals(responseContentEncoding(), other.responseContentEncoding())
                && Objects.equals(responseContentLanguage(), other.responseContentLanguage())
                && Objects.equals(responseContentType(), other.responseContentType())
                && Objects.equals(responseExpires(), other.responseExpires()) && Objects.equals(versionId(), other.versionId())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKey(), other.sseCustomerKey())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString())
                && Objects.equals(partNumber(), other.partNumber())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(checksumModeAsString(), other.checksumModeAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectRequest").add("Bucket", bucket()).add("IfMatch", ifMatch())
                .add("IfModifiedSince", ifModifiedSince()).add("IfNoneMatch", ifNoneMatch())
                .add("IfUnmodifiedSince", ifUnmodifiedSince()).add("Key", key()).add("Range", range())
                .add("ResponseCacheControl", responseCacheControl())
                .add("ResponseContentDisposition", responseContentDisposition())
                .add("ResponseContentEncoding", responseContentEncoding())
                .add("ResponseContentLanguage", responseContentLanguage()).add("ResponseContentType", responseContentType())
                .add("ResponseExpires", responseExpires()).add("VersionId", versionId())
                .add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKey", sseCustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5()).add("RequestPayer", requestPayerAsString())
                .add("PartNumber", partNumber()).add("ExpectedBucketOwner", expectedBucketOwner())
                .add("ChecksumMode", checksumModeAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "IfMatch":
            return Optional.ofNullable(clazz.cast(ifMatch()));
        case "IfModifiedSince":
            return Optional.ofNullable(clazz.cast(ifModifiedSince()));
        case "IfNoneMatch":
            return Optional.ofNullable(clazz.cast(ifNoneMatch()));
        case "IfUnmodifiedSince":
            return Optional.ofNullable(clazz.cast(ifUnmodifiedSince()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "Range":
            return Optional.ofNullable(clazz.cast(range()));
        case "ResponseCacheControl":
            return Optional.ofNullable(clazz.cast(responseCacheControl()));
        case "ResponseContentDisposition":
            return Optional.ofNullable(clazz.cast(responseContentDisposition()));
        case "ResponseContentEncoding":
            return Optional.ofNullable(clazz.cast(responseContentEncoding()));
        case "ResponseContentLanguage":
            return Optional.ofNullable(clazz.cast(responseContentLanguage()));
        case "ResponseContentType":
            return Optional.ofNullable(clazz.cast(responseContentType()));
        case "ResponseExpires":
            return Optional.ofNullable(clazz.cast(responseExpires()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKey":
            return Optional.ofNullable(clazz.cast(sseCustomerKey()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
        case "PartNumber":
            return Optional.ofNullable(clazz.cast(partNumber()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "ChecksumMode":
            return Optional.ofNullable(clazz.cast(checksumModeAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectRequest, T> g) {
        return obj -> g.apply((GetObjectRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectRequest> {
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
         * When using an Object Lambda access point the hostname takes the form
         * <i>AccessPointName</i>-<i>AccountId</i>.s3-object-lambda.<i>Region</i>.amazonaws.com.
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
         *        When using an Object Lambda access point the hostname takes the form
         *        <i>AccessPointName</i>-<i>AccountId</i>.s3-object-lambda.<i>Region</i>.amazonaws.com.
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
         * Return the object only if its entity tag (ETag) is the same as the one specified; otherwise, return a 412
         * (precondition failed) error.
         * </p>
         * 
         * @param ifMatch
         *        Return the object only if its entity tag (ETag) is the same as the one specified; otherwise, return a
         *        412 (precondition failed) error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ifMatch(String ifMatch);

        /**
         * <p>
         * Return the object only if it has been modified since the specified time; otherwise, return a 304 (not
         * modified) error.
         * </p>
         * 
         * @param ifModifiedSince
         *        Return the object only if it has been modified since the specified time; otherwise, return a 304 (not
         *        modified) error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ifModifiedSince(Instant ifModifiedSince);

        /**
         * <p>
         * Return the object only if its entity tag (ETag) is different from the one specified; otherwise, return a 304
         * (not modified) error.
         * </p>
         * 
         * @param ifNoneMatch
         *        Return the object only if its entity tag (ETag) is different from the one specified; otherwise, return
         *        a 304 (not modified) error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ifNoneMatch(String ifNoneMatch);

        /**
         * <p>
         * Return the object only if it has not been modified since the specified time; otherwise, return a 412
         * (precondition failed) error.
         * </p>
         * 
         * @param ifUnmodifiedSince
         *        Return the object only if it has not been modified since the specified time; otherwise, return a 412
         *        (precondition failed) error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ifUnmodifiedSince(Instant ifUnmodifiedSince);

        /**
         * <p>
         * Key of the object to get.
         * </p>
         * 
         * @param key
         *        Key of the object to get.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see <a
         * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">https://www.w3.org/Protocols/rfc2616/
         * rfc2616-sec14.html#sec14.35</a>.
         * </p>
         * <note>
         * <p>
         * Amazon S3 doesn't support retrieving multiple ranges of data per <code>GET</code> request.
         * </p>
         * </note>
         * 
         * @param range
         *        Downloads the specified range bytes of an object. For more information about the HTTP Range header,
         *        see <a
         *        href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">https://www.w3.org/Protocols
         *        /rfc2616/rfc2616-sec14.html#sec14.35</a>.</p> <note>
         *        <p>
         *        Amazon S3 doesn't support retrieving multiple ranges of data per <code>GET</code> request.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder range(String range);

        /**
         * <p>
         * Sets the <code>Cache-Control</code> header of the response.
         * </p>
         * 
         * @param responseCacheControl
         *        Sets the <code>Cache-Control</code> header of the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseCacheControl(String responseCacheControl);

        /**
         * <p>
         * Sets the <code>Content-Disposition</code> header of the response
         * </p>
         * 
         * @param responseContentDisposition
         *        Sets the <code>Content-Disposition</code> header of the response
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseContentDisposition(String responseContentDisposition);

        /**
         * <p>
         * Sets the <code>Content-Encoding</code> header of the response.
         * </p>
         * 
         * @param responseContentEncoding
         *        Sets the <code>Content-Encoding</code> header of the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseContentEncoding(String responseContentEncoding);

        /**
         * <p>
         * Sets the <code>Content-Language</code> header of the response.
         * </p>
         * 
         * @param responseContentLanguage
         *        Sets the <code>Content-Language</code> header of the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseContentLanguage(String responseContentLanguage);

        /**
         * <p>
         * Sets the <code>Content-Type</code> header of the response.
         * </p>
         * 
         * @param responseContentType
         *        Sets the <code>Content-Type</code> header of the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseContentType(String responseContentType);

        /**
         * <p>
         * Sets the <code>Expires</code> header of the response.
         * </p>
         * 
         * @param responseExpires
         *        Sets the <code>Expires</code> header of the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder responseExpires(Instant responseExpires);

        /**
         * <p>
         * VersionId used to reference a specific version of the object.
         * </p>
         * 
         * @param versionId
         *        VersionId used to reference a specific version of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * Specifies the algorithm to use to when decrypting the object (for example, AES256).
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        Specifies the algorithm to use to when decrypting the object (for example, AES256).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used to
         * decrypt the object when recovering it and must match the one used when storing the data. The key must be
         * appropriate for use with the algorithm specified in the
         * <code>x-amz-server-side-encryption-customer-algorithm</code> header.
         * </p>
         * 
         * @param sseCustomerKey
         *        Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is
         *        used to decrypt the object when recovering it and must match the one used when storing the data. The
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
         * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a
         * 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
         * </p>
         * 
         * @param partNumber
         *        Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively
         *        performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an
         *        object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partNumber(Integer partNumber);

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
         * To retrieve the checksum, this mode must be enabled.
         * </p>
         * 
         * @param checksumMode
         *        To retrieve the checksum, this mode must be enabled.
         * @see ChecksumMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumMode
         */
        Builder checksumMode(String checksumMode);

        /**
         * <p>
         * To retrieve the checksum, this mode must be enabled.
         * </p>
         * 
         * @param checksumMode
         *        To retrieve the checksum, this mode must be enabled.
         * @see ChecksumMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumMode
         */
        Builder checksumMode(ChecksumMode checksumMode);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String ifMatch;

        private Instant ifModifiedSince;

        private String ifNoneMatch;

        private Instant ifUnmodifiedSince;

        private String key;

        private String range;

        private String responseCacheControl;

        private String responseContentDisposition;

        private String responseContentEncoding;

        private String responseContentLanguage;

        private String responseContentType;

        private Instant responseExpires;

        private String versionId;

        private String sseCustomerAlgorithm;

        private String sseCustomerKey;

        private String sseCustomerKeyMD5;

        private String requestPayer;

        private Integer partNumber;

        private String expectedBucketOwner;

        private String checksumMode;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectRequest model) {
            super(model);
            bucket(model.bucket);
            ifMatch(model.ifMatch);
            ifModifiedSince(model.ifModifiedSince);
            ifNoneMatch(model.ifNoneMatch);
            ifUnmodifiedSince(model.ifUnmodifiedSince);
            key(model.key);
            range(model.range);
            responseCacheControl(model.responseCacheControl);
            responseContentDisposition(model.responseContentDisposition);
            responseContentEncoding(model.responseContentEncoding);
            responseContentLanguage(model.responseContentLanguage);
            responseContentType(model.responseContentType);
            responseExpires(model.responseExpires);
            versionId(model.versionId);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKey(model.sseCustomerKey);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            requestPayer(model.requestPayer);
            partNumber(model.partNumber);
            expectedBucketOwner(model.expectedBucketOwner);
            checksumMode(model.checksumMode);
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

        public final String getIfMatch() {
            return ifMatch;
        }

        public final void setIfMatch(String ifMatch) {
            this.ifMatch = ifMatch;
        }

        @Override
        public final Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        public final Instant getIfModifiedSince() {
            return ifModifiedSince;
        }

        public final void setIfModifiedSince(Instant ifModifiedSince) {
            this.ifModifiedSince = ifModifiedSince;
        }

        @Override
        public final Builder ifModifiedSince(Instant ifModifiedSince) {
            this.ifModifiedSince = ifModifiedSince;
            return this;
        }

        public final String getIfNoneMatch() {
            return ifNoneMatch;
        }

        public final void setIfNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
        }

        @Override
        public final Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        public final Instant getIfUnmodifiedSince() {
            return ifUnmodifiedSince;
        }

        public final void setIfUnmodifiedSince(Instant ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
        }

        @Override
        public final Builder ifUnmodifiedSince(Instant ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
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

        public final String getRange() {
            return range;
        }

        public final void setRange(String range) {
            this.range = range;
        }

        @Override
        public final Builder range(String range) {
            this.range = range;
            return this;
        }

        public final String getResponseCacheControl() {
            return responseCacheControl;
        }

        public final void setResponseCacheControl(String responseCacheControl) {
            this.responseCacheControl = responseCacheControl;
        }

        @Override
        public final Builder responseCacheControl(String responseCacheControl) {
            this.responseCacheControl = responseCacheControl;
            return this;
        }

        public final String getResponseContentDisposition() {
            return responseContentDisposition;
        }

        public final void setResponseContentDisposition(String responseContentDisposition) {
            this.responseContentDisposition = responseContentDisposition;
        }

        @Override
        public final Builder responseContentDisposition(String responseContentDisposition) {
            this.responseContentDisposition = responseContentDisposition;
            return this;
        }

        public final String getResponseContentEncoding() {
            return responseContentEncoding;
        }

        public final void setResponseContentEncoding(String responseContentEncoding) {
            this.responseContentEncoding = responseContentEncoding;
        }

        @Override
        public final Builder responseContentEncoding(String responseContentEncoding) {
            this.responseContentEncoding = responseContentEncoding;
            return this;
        }

        public final String getResponseContentLanguage() {
            return responseContentLanguage;
        }

        public final void setResponseContentLanguage(String responseContentLanguage) {
            this.responseContentLanguage = responseContentLanguage;
        }

        @Override
        public final Builder responseContentLanguage(String responseContentLanguage) {
            this.responseContentLanguage = responseContentLanguage;
            return this;
        }

        public final String getResponseContentType() {
            return responseContentType;
        }

        public final void setResponseContentType(String responseContentType) {
            this.responseContentType = responseContentType;
        }

        @Override
        public final Builder responseContentType(String responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }

        public final Instant getResponseExpires() {
            return responseExpires;
        }

        public final void setResponseExpires(Instant responseExpires) {
            this.responseExpires = responseExpires;
        }

        @Override
        public final Builder responseExpires(Instant responseExpires) {
            this.responseExpires = responseExpires;
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

        public final String getChecksumMode() {
            return checksumMode;
        }

        public final void setChecksumMode(String checksumMode) {
            this.checksumMode = checksumMode;
        }

        @Override
        public final Builder checksumMode(String checksumMode) {
            this.checksumMode = checksumMode;
            return this;
        }

        @Override
        public final Builder checksumMode(ChecksumMode checksumMode) {
            this.checksumMode(checksumMode == null ? null : checksumMode.toString());
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
        public GetObjectRequest build() {
            return new GetObjectRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
