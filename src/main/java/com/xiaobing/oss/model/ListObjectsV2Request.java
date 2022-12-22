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
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class ListObjectsV2Request extends S3Request implements
        ToCopyableBuilder<ListObjectsV2Request.Builder, ListObjectsV2Request> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(ListObjectsV2Request::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Delimiter")
            .getter(getter(ListObjectsV2Request::delimiter))
            .setter(setter(Builder::delimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("delimiter")
                    .unmarshallLocationName("delimiter").build()).build();

    private static final SdkField<String> ENCODING_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("EncodingType")
            .getter(getter(ListObjectsV2Request::encodingTypeAsString))
            .setter(setter(Builder::encodingType))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("encoding-type")
                    .unmarshallLocationName("encoding-type").build()).build();

    private static final SdkField<Integer> MAX_KEYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxKeys")
            .getter(getter(ListObjectsV2Request::maxKeys))
            .setter(setter(Builder::maxKeys))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("max-keys")
                    .unmarshallLocationName("max-keys").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ListObjectsV2Request::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("prefix")
                    .unmarshallLocationName("prefix").build()).build();

    private static final SdkField<String> CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContinuationToken")
            .getter(getter(ListObjectsV2Request::continuationToken))
            .setter(setter(Builder::continuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("continuation-token")
                    .unmarshallLocationName("continuation-token").build()).build();

    private static final SdkField<Boolean> FETCH_OWNER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("FetchOwner")
            .getter(getter(ListObjectsV2Request::fetchOwner))
            .setter(setter(Builder::fetchOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("fetch-owner")
                    .unmarshallLocationName("fetch-owner").build()).build();

    private static final SdkField<String> START_AFTER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StartAfter")
            .getter(getter(ListObjectsV2Request::startAfter))
            .setter(setter(Builder::startAfter))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("start-after")
                    .unmarshallLocationName("start-after").build()).build();

    private static final SdkField<String> REQUEST_PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestPayer")
            .getter(getter(ListObjectsV2Request::requestPayerAsString))
            .setter(setter(Builder::requestPayer))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-payer")
                    .unmarshallLocationName("x-amz-request-payer").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(ListObjectsV2Request::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, DELIMITER_FIELD,
            ENCODING_TYPE_FIELD, MAX_KEYS_FIELD, PREFIX_FIELD, CONTINUATION_TOKEN_FIELD, FETCH_OWNER_FIELD, START_AFTER_FIELD,
            REQUEST_PAYER_FIELD, EXPECTED_BUCKET_OWNER_FIELD));

    private final String bucket;

    private final String delimiter;

    private final String encodingType;

    private final Integer maxKeys;

    private final String prefix;

    private final String continuationToken;

    private final Boolean fetchOwner;

    private final String startAfter;

    private final String requestPayer;

    private final String expectedBucketOwner;

    private ListObjectsV2Request(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
        this.continuationToken = builder.continuationToken;
        this.fetchOwner = builder.fetchOwner;
        this.startAfter = builder.startAfter;
        this.requestPayer = builder.requestPayer;
        this.expectedBucketOwner = builder.expectedBucketOwner;
    }

    /**
     * <p>
     * Bucket name to list.
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
     * @return Bucket name to list. </p>
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
     * A delimiter is a character you use to group keys.
     * </p>
     * 
     * @return A delimiter is a character you use to group keys.
     */
    public final String delimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object keys in the response.
     * @see EncodingType
     */
    public final EncodingType encodingType() {
        return EncodingType.fromValue(encodingType);
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object keys in the response.
     * @see EncodingType
     */
    public final String encodingTypeAsString() {
        return encodingType;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key names.
     * The response might contain fewer keys but will never contain more.
     * </p>
     * 
     * @return Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key
     *         names. The response might contain fewer keys but will never contain more.
     */
    public final Integer maxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Limits the response to keys that begin with the specified prefix.
     * </p>
     * 
     * @return Limits the response to keys that begin with the specified prefix.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token.
     * ContinuationToken is obfuscated and is not a real key.
     * </p>
     * 
     * @return ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token.
     *         ContinuationToken is obfuscated and is not a real key.
     */
    public final String continuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to return owner field with each key in the
     * result then set the fetch owner field to true.
     * </p>
     * 
     * @return The owner field is not present in listV2 by default, if you want to return owner field with each key in
     *         the result then set the fetch owner field to true.
     */
    public final Boolean fetchOwner() {
        return fetchOwner;
    }

    /**
     * <p>
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key.
     * StartAfter can be any key in the bucket.
     * </p>
     * 
     * @return StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this
     *         specified key. StartAfter can be any key in the bucket.
     */
    public final String startAfter() {
        return startAfter;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket
     * owners need not specify this parameter in their requests.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestPayer} will
     * return {@link RequestPayer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #requestPayerAsString}.
     * </p>
     * 
     * @return Confirms that the requester knows that she or he will be charged for the list objects request in V2
     *         style. Bucket owners need not specify this parameter in their requests.
     * @see RequestPayer
     */
    public final RequestPayer requestPayer() {
        return RequestPayer.fromValue(requestPayer);
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket
     * owners need not specify this parameter in their requests.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestPayer} will
     * return {@link RequestPayer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #requestPayerAsString}.
     * </p>
     * 
     * @return Confirms that the requester knows that she or he will be charged for the list objects request in V2
     *         style. Bucket owners need not specify this parameter in their requests.
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
        hashCode = 31 * hashCode + Objects.hashCode(delimiter());
        hashCode = 31 * hashCode + Objects.hashCode(encodingTypeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(maxKeys());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(continuationToken());
        hashCode = 31 * hashCode + Objects.hashCode(fetchOwner());
        hashCode = 31 * hashCode + Objects.hashCode(startAfter());
        hashCode = 31 * hashCode + Objects.hashCode(requestPayerAsString());
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
        if (!(obj instanceof ListObjectsV2Request)) {
            return false;
        }
        ListObjectsV2Request other = (ListObjectsV2Request) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(delimiter(), other.delimiter())
                && Objects.equals(encodingTypeAsString(), other.encodingTypeAsString())
                && Objects.equals(maxKeys(), other.maxKeys()) && Objects.equals(prefix(), other.prefix())
                && Objects.equals(continuationToken(), other.continuationToken())
                && Objects.equals(fetchOwner(), other.fetchOwner()) && Objects.equals(startAfter(), other.startAfter())
                && Objects.equals(requestPayerAsString(), other.requestPayerAsString())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListObjectsV2Request").add("Bucket", bucket()).add("Delimiter", delimiter())
                .add("EncodingType", encodingTypeAsString()).add("MaxKeys", maxKeys()).add("Prefix", prefix())
                .add("ContinuationToken", continuationToken()).add("FetchOwner", fetchOwner()).add("StartAfter", startAfter())
                .add("RequestPayer", requestPayerAsString()).add("ExpectedBucketOwner", expectedBucketOwner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Delimiter":
            return Optional.ofNullable(clazz.cast(delimiter()));
        case "EncodingType":
            return Optional.ofNullable(clazz.cast(encodingTypeAsString()));
        case "MaxKeys":
            return Optional.ofNullable(clazz.cast(maxKeys()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "ContinuationToken":
            return Optional.ofNullable(clazz.cast(continuationToken()));
        case "FetchOwner":
            return Optional.ofNullable(clazz.cast(fetchOwner()));
        case "StartAfter":
            return Optional.ofNullable(clazz.cast(startAfter()));
        case "RequestPayer":
            return Optional.ofNullable(clazz.cast(requestPayerAsString()));
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

    private static <T> Function<Object, T> getter(Function<ListObjectsV2Request, T> g) {
        return obj -> g.apply((ListObjectsV2Request) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, ListObjectsV2Request> {
        /**
         * <p>
         * Bucket name to list.
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
         *        Bucket name to list. </p>
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
         * A delimiter is a character you use to group keys.
         * </p>
         * 
         * @param delimiter
         *        A delimiter is a character you use to group keys.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder delimiter(String delimiter);

        /**
         * <p>
         * Encoding type used by Amazon S3 to encode object keys in the response.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object keys in the response.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(String encodingType);

        /**
         * <p>
         * Encoding type used by Amazon S3 to encode object keys in the response.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object keys in the response.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(EncodingType encodingType);

        /**
         * <p>
         * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key
         * names. The response might contain fewer keys but will never contain more.
         * </p>
         * 
         * @param maxKeys
         *        Sets the maximum number of keys returned in the response. By default the action returns up to 1,000
         *        key names. The response might contain fewer keys but will never contain more.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxKeys(Integer maxKeys);

        /**
         * <p>
         * Limits the response to keys that begin with the specified prefix.
         * </p>
         * 
         * @param prefix
         *        Limits the response to keys that begin with the specified prefix.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token.
         * ContinuationToken is obfuscated and is not a real key.
         * </p>
         * 
         * @param continuationToken
         *        ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token.
         *        ContinuationToken is obfuscated and is not a real key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder continuationToken(String continuationToken);

        /**
         * <p>
         * The owner field is not present in listV2 by default, if you want to return owner field with each key in the
         * result then set the fetch owner field to true.
         * </p>
         * 
         * @param fetchOwner
         *        The owner field is not present in listV2 by default, if you want to return owner field with each key
         *        in the result then set the fetch owner field to true.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder fetchOwner(Boolean fetchOwner);

        /**
         * <p>
         * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified
         * key. StartAfter can be any key in the bucket.
         * </p>
         * 
         * @param startAfter
         *        StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this
         *        specified key. StartAfter can be any key in the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder startAfter(String startAfter);

        /**
         * <p>
         * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style.
         * Bucket owners need not specify this parameter in their requests.
         * </p>
         * 
         * @param requestPayer
         *        Confirms that the requester knows that she or he will be charged for the list objects request in V2
         *        style. Bucket owners need not specify this parameter in their requests.
         * @see RequestPayer
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestPayer
         */
        Builder requestPayer(String requestPayer);

        /**
         * <p>
         * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style.
         * Bucket owners need not specify this parameter in their requests.
         * </p>
         * 
         * @param requestPayer
         *        Confirms that the requester knows that she or he will be charged for the list objects request in V2
         *        style. Bucket owners need not specify this parameter in their requests.
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

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String delimiter;

        private String encodingType;

        private Integer maxKeys;

        private String prefix;

        private String continuationToken;

        private Boolean fetchOwner;

        private String startAfter;

        private String requestPayer;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(ListObjectsV2Request model) {
            super(model);
            bucket(model.bucket);
            delimiter(model.delimiter);
            encodingType(model.encodingType);
            maxKeys(model.maxKeys);
            prefix(model.prefix);
            continuationToken(model.continuationToken);
            fetchOwner(model.fetchOwner);
            startAfter(model.startAfter);
            requestPayer(model.requestPayer);
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

        public final String getDelimiter() {
            return delimiter;
        }

        public final void setDelimiter(String delimiter) {
            this.delimiter = delimiter;
        }

        @Override
        public final Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public final String getEncodingType() {
            return encodingType;
        }

        public final void setEncodingType(String encodingType) {
            this.encodingType = encodingType;
        }

        @Override
        public final Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        @Override
        public final Builder encodingType(EncodingType encodingType) {
            this.encodingType(encodingType == null ? null : encodingType.toString());
            return this;
        }

        public final Integer getMaxKeys() {
            return maxKeys;
        }

        public final void setMaxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
        }

        @Override
        public final Builder maxKeys(Integer maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }

        public final String getPrefix() {
            return prefix;
        }

        public final void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public final Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public final String getContinuationToken() {
            return continuationToken;
        }

        public final void setContinuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
        }

        @Override
        public final Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        public final Boolean getFetchOwner() {
            return fetchOwner;
        }

        public final void setFetchOwner(Boolean fetchOwner) {
            this.fetchOwner = fetchOwner;
        }

        @Override
        public final Builder fetchOwner(Boolean fetchOwner) {
            this.fetchOwner = fetchOwner;
            return this;
        }

        public final String getStartAfter() {
            return startAfter;
        }

        public final void setStartAfter(String startAfter) {
            this.startAfter = startAfter;
        }

        @Override
        public final Builder startAfter(String startAfter) {
            this.startAfter = startAfter;
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
        public ListObjectsV2Request build() {
            return new ListObjectsV2Request(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
