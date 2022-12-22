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
public final class ListObjectsResponse extends S3Response implements
        ToCopyableBuilder<ListObjectsResponse.Builder, ListObjectsResponse> {
    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListObjectsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Marker")
            .getter(getter(ListObjectsResponse::marker))
            .setter(setter(Builder::marker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Marker")
                    .unmarshallLocationName("Marker").build()).build();

    private static final SdkField<String> NEXT_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextMarker")
            .getter(getter(ListObjectsResponse::nextMarker))
            .setter(setter(Builder::nextMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextMarker")
                    .unmarshallLocationName("NextMarker").build()).build();

    private static final SdkField<List<S3Object>> CONTENTS_FIELD = SdkField
            .<List<S3Object>> builder(MarshallingType.LIST)
            .memberName("Contents")
            .getter(getter(ListObjectsResponse::contents))
            .setter(setter(Builder::contents))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Contents")
                    .unmarshallLocationName("Contents").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<S3Object> builder(MarshallingType.SDK_POJO)
                                            .constructor(S3Object::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<String> NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Name")
            .getter(getter(ListObjectsResponse::name))
            .setter(setter(Builder::name))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Name")
                    .unmarshallLocationName("Name").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ListObjectsResponse::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<String> DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Delimiter")
            .getter(getter(ListObjectsResponse::delimiter))
            .setter(setter(Builder::delimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Delimiter")
                    .unmarshallLocationName("Delimiter").build()).build();

    private static final SdkField<Integer> MAX_KEYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxKeys")
            .getter(getter(ListObjectsResponse::maxKeys))
            .setter(setter(Builder::maxKeys))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxKeys")
                    .unmarshallLocationName("MaxKeys").build()).build();

    private static final SdkField<List<CommonPrefix>> COMMON_PREFIXES_FIELD = SdkField
            .<List<CommonPrefix>> builder(MarshallingType.LIST)
            .memberName("CommonPrefixes")
            .getter(getter(ListObjectsResponse::commonPrefixes))
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
            .getter(getter(ListObjectsResponse::encodingTypeAsString))
            .setter(setter(Builder::encodingType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EncodingType")
                    .unmarshallLocationName("EncodingType").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(IS_TRUNCATED_FIELD,
            MARKER_FIELD, NEXT_MARKER_FIELD, CONTENTS_FIELD, NAME_FIELD, PREFIX_FIELD, DELIMITER_FIELD, MAX_KEYS_FIELD,
            COMMON_PREFIXES_FIELD, ENCODING_TYPE_FIELD));

    private final Boolean isTruncated;

    private final String marker;

    private final String nextMarker;

    private final List<S3Object> contents;

    private final String name;

    private final String prefix;

    private final String delimiter;

    private final Integer maxKeys;

    private final List<CommonPrefix> commonPrefixes;

    private final String encodingType;

    private ListObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.nextMarker = builder.nextMarker;
        this.contents = builder.contents;
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.delimiter = builder.delimiter;
        this.maxKeys = builder.maxKeys;
        this.commonPrefixes = builder.commonPrefixes;
        this.encodingType = builder.encodingType;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria.
     * </p>
     * 
     * @return A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates where in the bucket listing begins. Marker is included in the response if it was sent with the request.
     * </p>
     * 
     * @return Indicates where in the bucket listing begins. Marker is included in the response if it was sent with the
     *         request.
     */
    public final String marker() {
        return marker;
    }

    /**
     * <p>
     * When response is truncated (the IsTruncated element value in the response is true), you can use the key name in
     * this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in
     * alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If
     * response does not include the NextMarker and it is truncated, you can use the value of the last Key in the
     * response as the marker in the subsequent request to get the next set of object keys.
     * </p>
     * 
     * @return When response is truncated (the IsTruncated element value in the response is true), you can use the key
     *         name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists
     *         objects in alphabetical order Note: This element is returned only if you have delimiter request parameter
     *         specified. If response does not include the NextMarker and it is truncated, you can use the value of the
     *         last Key in the response as the marker in the subsequent request to get the next set of object keys.
     */
    public final String nextMarker() {
        return nextMarker;
    }

    /**
     * For responses, this returns true if the service returned a value for the Contents property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasContents() {
        return contents != null && !(contents instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Metadata about each object returned.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasContents} method.
     * </p>
     * 
     * @return Metadata about each object returned.
     */
    public final List<S3Object> contents() {
        return contents;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * 
     * @return The bucket name.
     */
    public final String name() {
        return name;
    }

    /**
     * <p>
     * Keys that begin with the indicated prefix.
     * </p>
     * 
     * @return Keys that begin with the indicated prefix.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be
     * rolled up into a single result element in the <code>CommonPrefixes</code> collection. These rolled-up keys are
     * not returned elsewhere in the response. Each rolled-up result counts as only one return against the
     * <code>MaxKeys</code> value.
     * </p>
     * 
     * @return Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to
     *         be rolled up into a single result element in the <code>CommonPrefixes</code> collection. These rolled-up
     *         keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against
     *         the <code>MaxKeys</code> value.
     */
    public final String delimiter() {
        return delimiter;
    }

    /**
     * <p>
     * The maximum number of keys returned in the response body.
     * </p>
     * 
     * @return The maximum number of keys returned in the response body.
     */
    public final Integer maxKeys() {
        return maxKeys;
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
     * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the number
     * of returns.
     * </p>
     * <p>
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * </p>
     * <p>
     * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string
     * specified by the delimiter.
     * </p>
     * <p>
     * CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
     * </p>
     * <p>
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix
     * is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the
     * number of returns.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasCommonPrefixes} method.
     * </p>
     * 
     * @return All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the
     *         number of returns. </p>
     *         <p>
     *         A response can contain CommonPrefixes only if you specify a delimiter.
     *         </p>
     *         <p>
     *         CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string
     *         specified by the delimiter.
     *         </p>
     *         <p>
     *         CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
     *         </p>
     *         <p>
     *         For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common
     *         prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when
     *         calculating the number of returns.
     */
    public final List<CommonPrefix> commonPrefixes() {
        return commonPrefixes;
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
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(marker());
        hashCode = 31 * hashCode + Objects.hashCode(nextMarker());
        hashCode = 31 * hashCode + Objects.hashCode(hasContents() ? contents() : null);
        hashCode = 31 * hashCode + Objects.hashCode(name());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(delimiter());
        hashCode = 31 * hashCode + Objects.hashCode(maxKeys());
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
        if (!(obj instanceof ListObjectsResponse)) {
            return false;
        }
        ListObjectsResponse other = (ListObjectsResponse) obj;
        return Objects.equals(isTruncated(), other.isTruncated()) && Objects.equals(marker(), other.marker())
                && Objects.equals(nextMarker(), other.nextMarker()) && hasContents() == other.hasContents()
                && Objects.equals(contents(), other.contents()) && Objects.equals(name(), other.name())
                && Objects.equals(prefix(), other.prefix()) && Objects.equals(delimiter(), other.delimiter())
                && Objects.equals(maxKeys(), other.maxKeys()) && hasCommonPrefixes() == other.hasCommonPrefixes()
                && Objects.equals(commonPrefixes(), other.commonPrefixes())
                && Objects.equals(encodingTypeAsString(), other.encodingTypeAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListObjectsResponse").add("IsTruncated", isTruncated()).add("Marker", marker())
                .add("NextMarker", nextMarker()).add("Contents", hasContents() ? contents() : null).add("Name", name())
                .add("Prefix", prefix()).add("Delimiter", delimiter()).add("MaxKeys", maxKeys())
                .add("CommonPrefixes", hasCommonPrefixes() ? commonPrefixes() : null).add("EncodingType", encodingTypeAsString())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "Marker":
            return Optional.ofNullable(clazz.cast(marker()));
        case "NextMarker":
            return Optional.ofNullable(clazz.cast(nextMarker()));
        case "Contents":
            return Optional.ofNullable(clazz.cast(contents()));
        case "Name":
            return Optional.ofNullable(clazz.cast(name()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Delimiter":
            return Optional.ofNullable(clazz.cast(delimiter()));
        case "MaxKeys":
            return Optional.ofNullable(clazz.cast(maxKeys()));
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

    private static <T> Function<Object, T> getter(Function<ListObjectsResponse, T> g) {
        return obj -> g.apply((ListObjectsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, ListObjectsResponse> {
        /**
         * <p>
         * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria.
         * </p>
         * 
         * @param isTruncated
         *        A flag that indicates whether Amazon S3 returned all of the results that satisfied the search
         *        criteria.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * Indicates where in the bucket listing begins. Marker is included in the response if it was sent with the
         * request.
         * </p>
         * 
         * @param marker
         *        Indicates where in the bucket listing begins. Marker is included in the response if it was sent with
         *        the request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder marker(String marker);

        /**
         * <p>
         * When response is truncated (the IsTruncated element value in the response is true), you can use the key name
         * in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in
         * alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If
         * response does not include the NextMarker and it is truncated, you can use the value of the last Key in the
         * response as the marker in the subsequent request to get the next set of object keys.
         * </p>
         * 
         * @param nextMarker
         *        When response is truncated (the IsTruncated element value in the response is true), you can use the
         *        key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists
         *        objects in alphabetical order Note: This element is returned only if you have delimiter request
         *        parameter specified. If response does not include the NextMarker and it is truncated, you can use the
         *        value of the last Key in the response as the marker in the subsequent request to get the next set of
         *        object keys.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextMarker(String nextMarker);

        /**
         * <p>
         * Metadata about each object returned.
         * </p>
         * 
         * @param contents
         *        Metadata about each object returned.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contents(Collection<S3Object> contents);

        /**
         * <p>
         * Metadata about each object returned.
         * </p>
         * 
         * @param contents
         *        Metadata about each object returned.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contents(S3Object... contents);

        /**
         * <p>
         * Metadata about each object returned.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link S3Object.Builder} avoiding the need to create one manually
         * via {@link S3Object#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link S3Object.Builder#build()} is called immediately and its
         * result is passed to {@link #contents(List<S3Object>)}.
         * 
         * @param contents
         *        a consumer that will call methods on {@link S3Object.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #contents(Collection<S3Object>)
         */
        Builder contents(Consumer<S3Object.Builder>... contents);

        /**
         * <p>
         * The bucket name.
         * </p>
         * 
         * @param name
         *        The bucket name.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder name(String name);

        /**
         * <p>
         * Keys that begin with the indicated prefix.
         * </p>
         * 
         * @param prefix
         *        Keys that begin with the indicated prefix.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be
         * rolled up into a single result element in the <code>CommonPrefixes</code> collection. These rolled-up keys
         * are not returned elsewhere in the response. Each rolled-up result counts as only one return against the
         * <code>MaxKeys</code> value.
         * </p>
         * 
         * @param delimiter
         *        Causes keys that contain the same string between the prefix and the first occurrence of the delimiter
         *        to be rolled up into a single result element in the <code>CommonPrefixes</code> collection. These
         *        rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one
         *        return against the <code>MaxKeys</code> value.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder delimiter(String delimiter);

        /**
         * <p>
         * The maximum number of keys returned in the response body.
         * </p>
         * 
         * @param maxKeys
         *        The maximum number of keys returned in the response body.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxKeys(Integer maxKeys);

        /**
         * <p>
         * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the
         * number of returns.
         * </p>
         * <p>
         * A response can contain CommonPrefixes only if you specify a delimiter.
         * </p>
         * <p>
         * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string
         * specified by the delimiter.
         * </p>
         * <p>
         * CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
         * </p>
         * <p>
         * For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common
         * prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when
         * calculating the number of returns.
         * </p>
         * 
         * @param commonPrefixes
         *        All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating
         *        the number of returns. </p>
         *        <p>
         *        A response can contain CommonPrefixes only if you specify a delimiter.
         *        </p>
         *        <p>
         *        CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the
         *        string specified by the delimiter.
         *        </p>
         *        <p>
         *        CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
         *        </p>
         *        <p>
         *        For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the
         *        common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single
         *        return when calculating the number of returns.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(Collection<CommonPrefix> commonPrefixes);

        /**
         * <p>
         * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the
         * number of returns.
         * </p>
         * <p>
         * A response can contain CommonPrefixes only if you specify a delimiter.
         * </p>
         * <p>
         * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string
         * specified by the delimiter.
         * </p>
         * <p>
         * CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
         * </p>
         * <p>
         * For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common
         * prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when
         * calculating the number of returns.
         * </p>
         * 
         * @param commonPrefixes
         *        All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating
         *        the number of returns. </p>
         *        <p>
         *        A response can contain CommonPrefixes only if you specify a delimiter.
         *        </p>
         *        <p>
         *        CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the
         *        string specified by the delimiter.
         *        </p>
         *        <p>
         *        CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
         *        </p>
         *        <p>
         *        For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the
         *        common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single
         *        return when calculating the number of returns.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(CommonPrefix... commonPrefixes);

        /**
         * <p>
         * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating the
         * number of returns.
         * </p>
         * <p>
         * A response can contain CommonPrefixes only if you specify a delimiter.
         * </p>
         * <p>
         * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string
         * specified by the delimiter.
         * </p>
         * <p>
         * CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix.
         * </p>
         * <p>
         * For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common
         * prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when
         * calculating the number of returns.
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
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean isTruncated;

        private String marker;

        private String nextMarker;

        private List<S3Object> contents = DefaultSdkAutoConstructList.getInstance();

        private String name;

        private String prefix;

        private String delimiter;

        private Integer maxKeys;

        private List<CommonPrefix> commonPrefixes = DefaultSdkAutoConstructList.getInstance();

        private String encodingType;

        private BuilderImpl() {
        }

        private BuilderImpl(ListObjectsResponse model) {
            super(model);
            isTruncated(model.isTruncated);
            marker(model.marker);
            nextMarker(model.nextMarker);
            contents(model.contents);
            name(model.name);
            prefix(model.prefix);
            delimiter(model.delimiter);
            maxKeys(model.maxKeys);
            commonPrefixes(model.commonPrefixes);
            encodingType(model.encodingType);
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

        public final String getMarker() {
            return marker;
        }

        public final void setMarker(String marker) {
            this.marker = marker;
        }

        @Override
        public final Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        public final String getNextMarker() {
            return nextMarker;
        }

        public final void setNextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
        }

        @Override
        public final Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        public final List<S3Object.Builder> getContents() {
            List<S3Object.Builder> result = ObjectListCopier.copyToBuilder(this.contents);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setContents(Collection<S3Object.BuilderImpl> contents) {
            this.contents = ObjectListCopier.copyFromBuilder(contents);
        }

        @Override
        public final Builder contents(Collection<S3Object> contents) {
            this.contents = ObjectListCopier.copy(contents);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder contents(S3Object... contents) {
            contents(Arrays.asList(contents));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder contents(Consumer<S3Object.Builder>... contents) {
            contents(Stream.of(contents).map(c -> S3Object.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final String getName() {
            return name;
        }

        public final void setName(String name) {
            this.name = name;
        }

        @Override
        public final Builder name(String name) {
            this.name = name;
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
        public ListObjectsResponse build() {
            return new ListObjectsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
