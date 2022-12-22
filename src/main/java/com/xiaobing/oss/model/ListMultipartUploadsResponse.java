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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.ListTrait;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructList;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class ListMultipartUploadsResponse extends S3Response implements
        ToCopyableBuilder<ListMultipartUploadsResponse.Builder, ListMultipartUploadsResponse> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(ListMultipartUploadsResponse::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KeyMarker")
            .getter(getter(ListMultipartUploadsResponse::keyMarker))
            .setter(setter(Builder::keyMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyMarker")
                    .unmarshallLocationName("KeyMarker").build()).build();

    private static final SdkField<String> UPLOAD_ID_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadIdMarker")
            .getter(getter(ListMultipartUploadsResponse::uploadIdMarker))
            .setter(setter(Builder::uploadIdMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("UploadIdMarker")
                    .unmarshallLocationName("UploadIdMarker").build()).build();

    private static final SdkField<String> NEXT_KEY_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextKeyMarker")
            .getter(getter(ListMultipartUploadsResponse::nextKeyMarker))
            .setter(setter(Builder::nextKeyMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextKeyMarker")
                    .unmarshallLocationName("NextKeyMarker").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ListMultipartUploadsResponse::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<String> DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Delimiter")
            .getter(getter(ListMultipartUploadsResponse::delimiter))
            .setter(setter(Builder::delimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Delimiter")
                    .unmarshallLocationName("Delimiter").build()).build();

    private static final SdkField<String> NEXT_UPLOAD_ID_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextUploadIdMarker")
            .getter(getter(ListMultipartUploadsResponse::nextUploadIdMarker))
            .setter(setter(Builder::nextUploadIdMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextUploadIdMarker")
                    .unmarshallLocationName("NextUploadIdMarker").build()).build();

    private static final SdkField<Integer> MAX_UPLOADS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxUploads")
            .getter(getter(ListMultipartUploadsResponse::maxUploads))
            .setter(setter(Builder::maxUploads))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxUploads")
                    .unmarshallLocationName("MaxUploads").build()).build();

    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListMultipartUploadsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<List<MultipartUpload>> UPLOADS_FIELD = SdkField
            .<List<MultipartUpload>> builder(MarshallingType.LIST)
            .memberName("Uploads")
            .getter(getter(ListMultipartUploadsResponse::uploads))
            .setter(setter(Builder::uploads))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Upload")
                    .unmarshallLocationName("Upload").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<MultipartUpload> builder(MarshallingType.SDK_POJO)
                                            .constructor(MultipartUpload::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<CommonPrefix>> COMMON_PREFIXES_FIELD = SdkField
            .<List<CommonPrefix>> builder(MarshallingType.LIST)
            .memberName("CommonPrefixes")
            .getter(getter(ListMultipartUploadsResponse::commonPrefixes))
            .setter(setter(Builder::commonPrefixes))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CommonPrefixes")
                    .unmarshallLocationName("CommonPrefixes").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<CommonPrefix> builder(MarshallingType.SDK_POJO)
                                            .constructor(CommonPrefix::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<String> ENCODING_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("EncodingType")
            .getter(getter(ListMultipartUploadsResponse::encodingTypeAsString))
            .setter(setter(Builder::encodingType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EncodingType")
                    .unmarshallLocationName("EncodingType").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD,
            KEY_MARKER_FIELD, UPLOAD_ID_MARKER_FIELD, NEXT_KEY_MARKER_FIELD, PREFIX_FIELD, DELIMITER_FIELD,
            NEXT_UPLOAD_ID_MARKER_FIELD, MAX_UPLOADS_FIELD, IS_TRUNCATED_FIELD, UPLOADS_FIELD, COMMON_PREFIXES_FIELD,
            ENCODING_TYPE_FIELD));

    private final String bucket;

    private final String keyMarker;

    private final String uploadIdMarker;

    private final String nextKeyMarker;

    private final String prefix;

    private final String delimiter;

    private final String nextUploadIdMarker;

    private final Integer maxUploads;

    private final Boolean isTruncated;

    private final List<MultipartUpload> uploads;

    private final List<CommonPrefix> commonPrefixes;

    private final String encodingType;

    private ListMultipartUploadsResponse(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.keyMarker = builder.keyMarker;
        this.uploadIdMarker = builder.uploadIdMarker;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.prefix = builder.prefix;
        this.delimiter = builder.delimiter;
        this.nextUploadIdMarker = builder.nextUploadIdMarker;
        this.maxUploads = builder.maxUploads;
        this.isTruncated = builder.isTruncated;
        this.uploads = builder.uploads;
        this.commonPrefixes = builder.commonPrefixes;
        this.encodingType = builder.encodingType;
    }

    /**
     * <p>
     * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
     * access point alias if used.
     * </p>
     * 
     * @return The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN
     *         or access point alias if used.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The key at or after which the listing began.
     * </p>
     * 
     * @return The key at or after which the listing began.
     */
    public final String keyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Upload ID after which listing began.
     * </p>
     * 
     * @return Upload ID after which listing began.
     */
    public final String uploadIdMarker() {
        return uploadIdMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be used for the key-marker request
     * parameter in a subsequent request.
     * </p>
     * 
     * @return When a list is truncated, this element specifies the value that should be used for the key-marker request
     *         parameter in a subsequent request.
     */
    public final String nextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * <p>
     * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys
     * starting with the specified prefix.
     * </p>
     * 
     * @return When a prefix is provided in the request, this field contains the specified prefix. The result contains
     *         only keys starting with the specified prefix.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * Contains the delimiter you specified in the request. If you don't specify a delimiter in your request, this
     * element is absent from the response.
     * </p>
     * 
     * @return Contains the delimiter you specified in the request. If you don't specify a delimiter in your request,
     *         this element is absent from the response.
     */
    public final String delimiter() {
        return delimiter;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the value that should be used for the
     * <code>upload-id-marker</code> request parameter in a subsequent request.
     * </p>
     * 
     * @return When a list is truncated, this element specifies the value that should be used for the
     *         <code>upload-id-marker</code> request parameter in a subsequent request.
     */
    public final String nextUploadIdMarker() {
        return nextUploadIdMarker;
    }

    /**
     * <p>
     * Maximum number of multipart uploads that could have been included in the response.
     * </p>
     * 
     * @return Maximum number of multipart uploads that could have been included in the response.
     */
    public final Integer maxUploads() {
        return maxUploads;
    }

    /**
     * <p>
     * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list
     * was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or
     * specified by max uploads.
     * </p>
     * 
     * @return Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the
     *         list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit
     *         allowed or specified by max uploads.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * For responses, this returns true if the service returned a value for the Uploads property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasUploads() {
        return uploads != null && !(uploads instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for elements related to a particular multipart upload. A response can contain zero or more
     * <code>Upload</code> elements.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasUploads} method.
     * </p>
     * 
     * @return Container for elements related to a particular multipart upload. A response can contain zero or more
     *         <code>Upload</code> elements.
     */
    public final List<MultipartUpload> uploads() {
        return uploads;
    }

    /**
     * For responses, this returns true if the service returned a value for the CommonPrefixes property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasCommonPrefixes() {
        return commonPrefixes != null && !(commonPrefixes instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the
     * delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
     * <code>Prefix</code> child element.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasCommonPrefixes} method.
     * </p>
     * 
     * @return If you specify a delimiter in the request, then the result returns each distinct key prefix containing
     *         the delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
     *         <code>Prefix</code> child element.
     */
    public final List<CommonPrefix> commonPrefixes() {
        return commonPrefixes;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the response, and
     * returns encoded key name values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>, <code>Key</code>
     * .
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object keys in the response.</p>
     *         <p>
     *         If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the
     *         response, and returns encoded key name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
     *         <code>Key</code>.
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
     * If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the response, and
     * returns encoded key name values in the following response elements:
     * </p>
     * <p>
     * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>, <code>Key</code>
     * .
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object keys in the response.</p>
     *         <p>
     *         If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the
     *         response, and returns encoded key name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
     *         <code>Key</code>.
     * @see EncodingType
     */
    public final String encodingTypeAsString() {
        return encodingType;
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
        hashCode = 31 * hashCode + Objects.hashCode(keyMarker());
        hashCode = 31 * hashCode + Objects.hashCode(uploadIdMarker());
        hashCode = 31 * hashCode + Objects.hashCode(nextKeyMarker());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(delimiter());
        hashCode = 31 * hashCode + Objects.hashCode(nextUploadIdMarker());
        hashCode = 31 * hashCode + Objects.hashCode(maxUploads());
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(hasUploads() ? uploads() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasCommonPrefixes() ? commonPrefixes() : null);
        hashCode = 31 * hashCode + Objects.hashCode(encodingTypeAsString());
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
        if (!(obj instanceof ListMultipartUploadsResponse)) {
            return false;
        }
        ListMultipartUploadsResponse other = (ListMultipartUploadsResponse) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(keyMarker(), other.keyMarker())
                && Objects.equals(uploadIdMarker(), other.uploadIdMarker())
                && Objects.equals(nextKeyMarker(), other.nextKeyMarker()) && Objects.equals(prefix(), other.prefix())
                && Objects.equals(delimiter(), other.delimiter())
                && Objects.equals(nextUploadIdMarker(), other.nextUploadIdMarker())
                && Objects.equals(maxUploads(), other.maxUploads()) && Objects.equals(isTruncated(), other.isTruncated())
                && hasUploads() == other.hasUploads() && Objects.equals(uploads(), other.uploads())
                && hasCommonPrefixes() == other.hasCommonPrefixes() && Objects.equals(commonPrefixes(), other.commonPrefixes())
                && Objects.equals(encodingTypeAsString(), other.encodingTypeAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListMultipartUploadsResponse").add("Bucket", bucket()).add("KeyMarker", keyMarker())
                .add("UploadIdMarker", uploadIdMarker()).add("NextKeyMarker", nextKeyMarker()).add("Prefix", prefix())
                .add("Delimiter", delimiter()).add("NextUploadIdMarker", nextUploadIdMarker()).add("MaxUploads", maxUploads())
                .add("IsTruncated", isTruncated()).add("Uploads", hasUploads() ? uploads() : null)
                .add("CommonPrefixes", hasCommonPrefixes() ? commonPrefixes() : null).add("EncodingType", encodingTypeAsString())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "KeyMarker":
            return Optional.ofNullable(clazz.cast(keyMarker()));
        case "UploadIdMarker":
            return Optional.ofNullable(clazz.cast(uploadIdMarker()));
        case "NextKeyMarker":
            return Optional.ofNullable(clazz.cast(nextKeyMarker()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Delimiter":
            return Optional.ofNullable(clazz.cast(delimiter()));
        case "NextUploadIdMarker":
            return Optional.ofNullable(clazz.cast(nextUploadIdMarker()));
        case "MaxUploads":
            return Optional.ofNullable(clazz.cast(maxUploads()));
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "Uploads":
            return Optional.ofNullable(clazz.cast(uploads()));
        case "CommonPrefixes":
            return Optional.ofNullable(clazz.cast(commonPrefixes()));
        case "EncodingType":
            return Optional.ofNullable(clazz.cast(encodingTypeAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListMultipartUploadsResponse, T> g) {
        return obj -> g.apply((ListMultipartUploadsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, ListMultipartUploadsResponse> {
        /**
         * <p>
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
         * access point alias if used.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket to which the multipart upload was initiated. Does not return the access point
         *        ARN or access point alias if used.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The key at or after which the listing began.
         * </p>
         * 
         * @param keyMarker
         *        The key at or after which the listing began.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyMarker(String keyMarker);

        /**
         * <p>
         * Upload ID after which listing began.
         * </p>
         * 
         * @param uploadIdMarker
         *        Upload ID after which listing began.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploadIdMarker(String uploadIdMarker);

        /**
         * <p>
         * When a list is truncated, this element specifies the value that should be used for the key-marker request
         * parameter in a subsequent request.
         * </p>
         * 
         * @param nextKeyMarker
         *        When a list is truncated, this element specifies the value that should be used for the key-marker
         *        request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextKeyMarker(String nextKeyMarker);

        /**
         * <p>
         * When a prefix is provided in the request, this field contains the specified prefix. The result contains only
         * keys starting with the specified prefix.
         * </p>
         * 
         * @param prefix
         *        When a prefix is provided in the request, this field contains the specified prefix. The result
         *        contains only keys starting with the specified prefix.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * Contains the delimiter you specified in the request. If you don't specify a delimiter in your request, this
         * element is absent from the response.
         * </p>
         * 
         * @param delimiter
         *        Contains the delimiter you specified in the request. If you don't specify a delimiter in your request,
         *        this element is absent from the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder delimiter(String delimiter);

        /**
         * <p>
         * When a list is truncated, this element specifies the value that should be used for the
         * <code>upload-id-marker</code> request parameter in a subsequent request.
         * </p>
         * 
         * @param nextUploadIdMarker
         *        When a list is truncated, this element specifies the value that should be used for the
         *        <code>upload-id-marker</code> request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextUploadIdMarker(String nextUploadIdMarker);

        /**
         * <p>
         * Maximum number of multipart uploads that could have been included in the response.
         * </p>
         * 
         * @param maxUploads
         *        Maximum number of multipart uploads that could have been included in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxUploads(Integer maxUploads);

        /**
         * <p>
         * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the
         * list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or
         * specified by max uploads.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that
         *        the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit
         *        allowed or specified by max uploads.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * Container for elements related to a particular multipart upload. A response can contain zero or more
         * <code>Upload</code> elements.
         * </p>
         * 
         * @param uploads
         *        Container for elements related to a particular multipart upload. A response can contain zero or more
         *        <code>Upload</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploads(Collection<MultipartUpload> uploads);

        /**
         * <p>
         * Container for elements related to a particular multipart upload. A response can contain zero or more
         * <code>Upload</code> elements.
         * </p>
         * 
         * @param uploads
         *        Container for elements related to a particular multipart upload. A response can contain zero or more
         *        <code>Upload</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploads(MultipartUpload... uploads);

        /**
         * <p>
         * Container for elements related to a particular multipart upload. A response can contain zero or more
         * <code>Upload</code> elements.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link MultipartUpload.Builder} avoiding the need to create one
         * manually via {@link MultipartUpload#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link MultipartUpload.Builder#build()} is called immediately and
         * its result is passed to {@link #uploads(List<MultipartUpload>)}.
         * 
         * @param uploads
         *        a consumer that will call methods on
         *        {@link MultipartUpload.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #uploads(Collection<MultipartUpload>)
         */
        Builder uploads(Consumer<MultipartUpload.Builder>... uploads);

        /**
         * <p>
         * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the
         * delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
         * <code>Prefix</code> child element.
         * </p>
         * 
         * @param commonPrefixes
         *        If you specify a delimiter in the request, then the result returns each distinct key prefix containing
         *        the delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
         *        <code>Prefix</code> child element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(Collection<CommonPrefix> commonPrefixes);

        /**
         * <p>
         * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the
         * delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
         * <code>Prefix</code> child element.
         * </p>
         * 
         * @param commonPrefixes
         *        If you specify a delimiter in the request, then the result returns each distinct key prefix containing
         *        the delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
         *        <code>Prefix</code> child element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(CommonPrefix... commonPrefixes);

        /**
         * <p>
         * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the
         * delimiter in a <code>CommonPrefixes</code> element. The distinct key prefixes are returned in the
         * <code>Prefix</code> child element.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link CommonPrefix.Builder} avoiding the need to create one
         * manually via {@link CommonPrefix#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link CommonPrefix.Builder#build()} is called immediately and its
         * result is passed to {@link #commonPrefixes(List<CommonPrefix>)}.
         * 
         * @param commonPrefixes
         *        a consumer that will call methods on
         *        {@link CommonPrefix.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #commonPrefixes(Collection<CommonPrefix>)
         */
        Builder commonPrefixes(Consumer<CommonPrefix.Builder>... commonPrefixes);

        /**
         * <p>
         * Encoding type used by Amazon S3 to encode object keys in the response.
         * </p>
         * <p>
         * If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the response,
         * and returns encoded key name values in the following response elements:
         * </p>
         * <p>
         * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
         * <code>Key</code>.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object keys in the response.</p>
         *        <p>
         *        If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the
         *        response, and returns encoded key name values in the following response elements:
         *        </p>
         *        <p>
         *        <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
         *        <code>Key</code>.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(String encodingType);

        /**
         * <p>
         * Encoding type used by Amazon S3 to encode object keys in the response.
         * </p>
         * <p>
         * If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the response,
         * and returns encoded key name values in the following response elements:
         * </p>
         * <p>
         * <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
         * <code>Key</code>.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object keys in the response.</p>
         *        <p>
         *        If you specify <code>encoding-type</code> request parameter, Amazon S3 includes this element in the
         *        response, and returns encoded key name values in the following response elements:
         *        </p>
         *        <p>
         *        <code>Delimiter</code>, <code>KeyMarker</code>, <code>Prefix</code>, <code>NextKeyMarker</code>,
         *        <code>Key</code>.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(EncodingType encodingType);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String bucket;

        private String keyMarker;

        private String uploadIdMarker;

        private String nextKeyMarker;

        private String prefix;

        private String delimiter;

        private String nextUploadIdMarker;

        private Integer maxUploads;

        private Boolean isTruncated;

        private List<MultipartUpload> uploads = DefaultSdkAutoConstructList.getInstance();

        private List<CommonPrefix> commonPrefixes = DefaultSdkAutoConstructList.getInstance();

        private String encodingType;

        private BuilderImpl() {
        }

        private BuilderImpl(ListMultipartUploadsResponse model) {
            super(model);
            bucket(model.bucket);
            keyMarker(model.keyMarker);
            uploadIdMarker(model.uploadIdMarker);
            nextKeyMarker(model.nextKeyMarker);
            prefix(model.prefix);
            delimiter(model.delimiter);
            nextUploadIdMarker(model.nextUploadIdMarker);
            maxUploads(model.maxUploads);
            isTruncated(model.isTruncated);
            uploads(model.uploads);
            commonPrefixes(model.commonPrefixes);
            encodingType(model.encodingType);
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

        public final String getKeyMarker() {
            return keyMarker;
        }

        public final void setKeyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
        }

        @Override
        public final Builder keyMarker(String keyMarker) {
            this.keyMarker = keyMarker;
            return this;
        }

        public final String getUploadIdMarker() {
            return uploadIdMarker;
        }

        public final void setUploadIdMarker(String uploadIdMarker) {
            this.uploadIdMarker = uploadIdMarker;
        }

        @Override
        public final Builder uploadIdMarker(String uploadIdMarker) {
            this.uploadIdMarker = uploadIdMarker;
            return this;
        }

        public final String getNextKeyMarker() {
            return nextKeyMarker;
        }

        public final void setNextKeyMarker(String nextKeyMarker) {
            this.nextKeyMarker = nextKeyMarker;
        }

        @Override
        public final Builder nextKeyMarker(String nextKeyMarker) {
            this.nextKeyMarker = nextKeyMarker;
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

        public final String getNextUploadIdMarker() {
            return nextUploadIdMarker;
        }

        public final void setNextUploadIdMarker(String nextUploadIdMarker) {
            this.nextUploadIdMarker = nextUploadIdMarker;
        }

        @Override
        public final Builder nextUploadIdMarker(String nextUploadIdMarker) {
            this.nextUploadIdMarker = nextUploadIdMarker;
            return this;
        }

        public final Integer getMaxUploads() {
            return maxUploads;
        }

        public final void setMaxUploads(Integer maxUploads) {
            this.maxUploads = maxUploads;
        }

        @Override
        public final Builder maxUploads(Integer maxUploads) {
            this.maxUploads = maxUploads;
            return this;
        }

        public final Boolean getIsTruncated() {
            return isTruncated;
        }

        public final void setIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
        }

        @Override
        public final Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        public final List<MultipartUpload.Builder> getUploads() {
            List<MultipartUpload.Builder> result = MultipartUploadListCopier.copyToBuilder(this.uploads);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setUploads(Collection<MultipartUpload.BuilderImpl> uploads) {
            this.uploads = MultipartUploadListCopier.copyFromBuilder(uploads);
        }

        @Override
        public final Builder uploads(Collection<MultipartUpload> uploads) {
            this.uploads = MultipartUploadListCopier.copy(uploads);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder uploads(MultipartUpload... uploads) {
            uploads(Arrays.asList(uploads));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder uploads(Consumer<MultipartUpload.Builder>... uploads) {
            uploads(Stream.of(uploads).map(c -> MultipartUpload.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final List<CommonPrefix.Builder> getCommonPrefixes() {
            List<CommonPrefix.Builder> result = CommonPrefixListCopier.copyToBuilder(this.commonPrefixes);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setCommonPrefixes(Collection<CommonPrefix.BuilderImpl> commonPrefixes) {
            this.commonPrefixes = CommonPrefixListCopier.copyFromBuilder(commonPrefixes);
        }

        @Override
        public final Builder commonPrefixes(Collection<CommonPrefix> commonPrefixes) {
            this.commonPrefixes = CommonPrefixListCopier.copy(commonPrefixes);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder commonPrefixes(CommonPrefix... commonPrefixes) {
            commonPrefixes(Arrays.asList(commonPrefixes));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder commonPrefixes(Consumer<CommonPrefix.Builder>... commonPrefixes) {
            commonPrefixes(Stream.of(commonPrefixes).map(c -> CommonPrefix.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
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

        @Override
        public ListMultipartUploadsResponse build() {
            return new ListMultipartUploadsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
