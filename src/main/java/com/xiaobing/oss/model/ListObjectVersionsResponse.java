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
public final class ListObjectVersionsResponse extends S3Response implements
        ToCopyableBuilder<ListObjectVersionsResponse.Builder, ListObjectVersionsResponse> {
    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListObjectVersionsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> KEY_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KeyMarker")
            .getter(getter(ListObjectVersionsResponse::keyMarker))
            .setter(setter(Builder::keyMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyMarker")
                    .unmarshallLocationName("KeyMarker").build()).build();

    private static final SdkField<String> VERSION_ID_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionIdMarker")
            .getter(getter(ListObjectVersionsResponse::versionIdMarker))
            .setter(setter(Builder::versionIdMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("VersionIdMarker")
                    .unmarshallLocationName("VersionIdMarker").build()).build();

    private static final SdkField<String> NEXT_KEY_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextKeyMarker")
            .getter(getter(ListObjectVersionsResponse::nextKeyMarker))
            .setter(setter(Builder::nextKeyMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextKeyMarker")
                    .unmarshallLocationName("NextKeyMarker").build()).build();

    private static final SdkField<String> NEXT_VERSION_ID_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextVersionIdMarker")
            .getter(getter(ListObjectVersionsResponse::nextVersionIdMarker))
            .setter(setter(Builder::nextVersionIdMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextVersionIdMarker")
                    .unmarshallLocationName("NextVersionIdMarker").build()).build();

    private static final SdkField<List<ObjectVersion>> VERSIONS_FIELD = SdkField
            .<List<ObjectVersion>> builder(MarshallingType.LIST)
            .memberName("Versions")
            .getter(getter(ListObjectVersionsResponse::versions))
            .setter(setter(Builder::versions))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Version")
                    .unmarshallLocationName("Version").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<ObjectVersion> builder(MarshallingType.SDK_POJO)
                                            .constructor(ObjectVersion::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<DeleteMarkerEntry>> DELETE_MARKERS_FIELD = SdkField
            .<List<DeleteMarkerEntry>> builder(MarshallingType.LIST)
            .memberName("DeleteMarkers")
            .getter(getter(ListObjectVersionsResponse::deleteMarkers))
            .setter(setter(Builder::deleteMarkers))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DeleteMarker")
                    .unmarshallLocationName("DeleteMarker").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<DeleteMarkerEntry> builder(MarshallingType.SDK_POJO)
                                            .constructor(DeleteMarkerEntry::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<String> NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Name")
            .getter(getter(ListObjectVersionsResponse::name))
            .setter(setter(Builder::name))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Name")
                    .unmarshallLocationName("Name").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ListObjectVersionsResponse::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<String> DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Delimiter")
            .getter(getter(ListObjectVersionsResponse::delimiter))
            .setter(setter(Builder::delimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Delimiter")
                    .unmarshallLocationName("Delimiter").build()).build();

    private static final SdkField<Integer> MAX_KEYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxKeys")
            .getter(getter(ListObjectVersionsResponse::maxKeys))
            .setter(setter(Builder::maxKeys))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxKeys")
                    .unmarshallLocationName("MaxKeys").build()).build();

    private static final SdkField<List<CommonPrefix>> COMMON_PREFIXES_FIELD = SdkField
            .<List<CommonPrefix>> builder(MarshallingType.LIST)
            .memberName("CommonPrefixes")
            .getter(getter(ListObjectVersionsResponse::commonPrefixes))
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
            .getter(getter(ListObjectVersionsResponse::encodingTypeAsString))
            .setter(setter(Builder::encodingType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EncodingType")
                    .unmarshallLocationName("EncodingType").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(IS_TRUNCATED_FIELD,
            KEY_MARKER_FIELD, VERSION_ID_MARKER_FIELD, NEXT_KEY_MARKER_FIELD, NEXT_VERSION_ID_MARKER_FIELD, VERSIONS_FIELD,
            DELETE_MARKERS_FIELD, NAME_FIELD, PREFIX_FIELD, DELIMITER_FIELD, MAX_KEYS_FIELD, COMMON_PREFIXES_FIELD,
            ENCODING_TYPE_FIELD));

    private final Boolean isTruncated;

    private final String keyMarker;

    private final String versionIdMarker;

    private final String nextKeyMarker;

    private final String nextVersionIdMarker;

    private final List<ObjectVersion> versions;

    private final List<DeleteMarkerEntry> deleteMarkers;

    private final String name;

    private final String prefix;

    private final String delimiter;

    private final Integer maxKeys;

    private final List<CommonPrefix> commonPrefixes;

    private final String encodingType;

    private ListObjectVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.isTruncated = builder.isTruncated;
        this.keyMarker = builder.keyMarker;
        this.versionIdMarker = builder.versionIdMarker;
        this.nextKeyMarker = builder.nextKeyMarker;
        this.nextVersionIdMarker = builder.nextVersionIdMarker;
        this.versions = builder.versions;
        this.deleteMarkers = builder.deleteMarkers;
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.delimiter = builder.delimiter;
        this.maxKeys = builder.maxKeys;
        this.commonPrefixes = builder.commonPrefixes;
        this.encodingType = builder.encodingType;
    }

    /**
     * <p>
     * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria. If your
     * results were truncated, you can make a follow-up paginated request using the NextKeyMarker and
     * NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
     * </p>
     * 
     * @return A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria.
     *         If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and
     *         NextVersionIdMarker response parameters as a starting place in another request to return the rest of the
     *         results.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Marks the last key returned in a truncated response.
     * </p>
     * 
     * @return Marks the last key returned in a truncated response.
     */
    public final String keyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Marks the last version of the key returned in a truncated response.
     * </p>
     * 
     * @return Marks the last version of the key returned in a truncated response.
     */
    public final String versionIdMarker() {
        return versionIdMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextKeyMarker</code> specifies the
     * first key not returned that satisfies the search criteria. Use this value for the key-marker request parameter in
     * a subsequent request.
     * </p>
     * 
     * @return When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextKeyMarker</code>
     *         specifies the first key not returned that satisfies the search criteria. Use this value for the
     *         key-marker request parameter in a subsequent request.
     */
    public final String nextKeyMarker() {
        return nextKeyMarker;
    }

    /**
     * <p>
     * When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextVersionIdMarker</code>
     * specifies the first object version not returned that satisfies the search criteria. Use this value for the
     * version-id-marker request parameter in a subsequent request.
     * </p>
     * 
     * @return When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextVersionIdMarker</code>
     *         specifies the first object version not returned that satisfies the search criteria. Use this value for
     *         the version-id-marker request parameter in a subsequent request.
     */
    public final String nextVersionIdMarker() {
        return nextVersionIdMarker;
    }

    /**
     * For responses, this returns true if the service returned a value for the Versions property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasVersions() {
        return versions != null && !(versions instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for version information.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasVersions} method.
     * </p>
     * 
     * @return Container for version information.
     */
    public final List<ObjectVersion> versions() {
        return versions;
    }

    /**
     * For responses, this returns true if the service returned a value for the DeleteMarkers property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasDeleteMarkers() {
        return deleteMarkers != null && !(deleteMarkers instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for an object that is a delete marker.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasDeleteMarkers} method.
     * </p>
     * 
     * @return Container for an object that is a delete marker.
     */
    public final List<DeleteMarkerEntry> deleteMarkers() {
        return deleteMarkers;
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
     * Selects objects that start with the value supplied by this parameter.
     * </p>
     * 
     * @return Selects objects that start with the value supplied by this parameter.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All keys
     * that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a
     * single result element in <code>CommonPrefixes</code>. These groups are counted as one result against the max-keys
     * limitation. These keys are not returned elsewhere in the response.
     * </p>
     * 
     * @return The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All
     *         keys that contain the same string between the prefix and the first occurrence of the delimiter are
     *         grouped under a single result element in <code>CommonPrefixes</code>. These groups are counted as one
     *         result against the max-keys limitation. These keys are not returned elsewhere in the response.
     */
    public final String delimiter() {
        return delimiter;
    }

    /**
     * <p>
     * Specifies the maximum number of objects to return.
     * </p>
     * 
     * @return Specifies the maximum number of objects to return.
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
     * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasCommonPrefixes} method.
     * </p>
     * 
     * @return All of the keys rolled up into a common prefix count as a single return when calculating the number of
     *         returns.
     */
    public final List<CommonPrefix> commonPrefixes() {
        return commonPrefixes;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML response.
     * </p>
     * <p>
     * If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns
     * encoded key name values in the following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object key names in the XML response.</p>
     *         <p>
     *         If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and
     *         returns encoded key name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
     * @see EncodingType
     */
    public final EncodingType encodingType() {
        return EncodingType.fromValue(encodingType);
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object key names in the XML response.
     * </p>
     * <p>
     * If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns
     * encoded key name values in the following response elements:
     * </p>
     * <p>
     * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return Encoding type used by Amazon S3 to encode object key names in the XML response.</p>
     *         <p>
     *         If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and
     *         returns encoded key name values in the following response elements:
     *         </p>
     *         <p>
     *         <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
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
        hashCode = 31 * hashCode + Objects.hashCode(keyMarker());
        hashCode = 31 * hashCode + Objects.hashCode(versionIdMarker());
        hashCode = 31 * hashCode + Objects.hashCode(nextKeyMarker());
        hashCode = 31 * hashCode + Objects.hashCode(nextVersionIdMarker());
        hashCode = 31 * hashCode + Objects.hashCode(hasVersions() ? versions() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasDeleteMarkers() ? deleteMarkers() : null);
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
        if (!(obj instanceof ListObjectVersionsResponse)) {
            return false;
        }
        ListObjectVersionsResponse other = (ListObjectVersionsResponse) obj;
        return Objects.equals(isTruncated(), other.isTruncated()) && Objects.equals(keyMarker(), other.keyMarker())
                && Objects.equals(versionIdMarker(), other.versionIdMarker())
                && Objects.equals(nextKeyMarker(), other.nextKeyMarker())
                && Objects.equals(nextVersionIdMarker(), other.nextVersionIdMarker()) && hasVersions() == other.hasVersions()
                && Objects.equals(versions(), other.versions()) && hasDeleteMarkers() == other.hasDeleteMarkers()
                && Objects.equals(deleteMarkers(), other.deleteMarkers()) && Objects.equals(name(), other.name())
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
        return ToString.builder("ListObjectVersionsResponse").add("IsTruncated", isTruncated()).add("KeyMarker", keyMarker())
                .add("VersionIdMarker", versionIdMarker()).add("NextKeyMarker", nextKeyMarker())
                .add("NextVersionIdMarker", nextVersionIdMarker()).add("Versions", hasVersions() ? versions() : null)
                .add("DeleteMarkers", hasDeleteMarkers() ? deleteMarkers() : null).add("Name", name()).add("Prefix", prefix())
                .add("Delimiter", delimiter()).add("MaxKeys", maxKeys())
                .add("CommonPrefixes", hasCommonPrefixes() ? commonPrefixes() : null).add("EncodingType", encodingTypeAsString())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "KeyMarker":
            return Optional.ofNullable(clazz.cast(keyMarker()));
        case "VersionIdMarker":
            return Optional.ofNullable(clazz.cast(versionIdMarker()));
        case "NextKeyMarker":
            return Optional.ofNullable(clazz.cast(nextKeyMarker()));
        case "NextVersionIdMarker":
            return Optional.ofNullable(clazz.cast(nextVersionIdMarker()));
        case "Versions":
            return Optional.ofNullable(clazz.cast(versions()));
        case "DeleteMarkers":
            return Optional.ofNullable(clazz.cast(deleteMarkers()));
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

    private static <T> Function<Object, T> getter(Function<ListObjectVersionsResponse, T> g) {
        return obj -> g.apply((ListObjectVersionsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, ListObjectVersionsResponse> {
        /**
         * <p>
         * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria. If
         * your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and
         * NextVersionIdMarker response parameters as a starting place in another request to return the rest of the
         * results.
         * </p>
         * 
         * @param isTruncated
         *        A flag that indicates whether Amazon S3 returned all of the results that satisfied the search
         *        criteria. If your results were truncated, you can make a follow-up paginated request using the
         *        NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to
         *        return the rest of the results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * Marks the last key returned in a truncated response.
         * </p>
         * 
         * @param keyMarker
         *        Marks the last key returned in a truncated response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyMarker(String keyMarker);

        /**
         * <p>
         * Marks the last version of the key returned in a truncated response.
         * </p>
         * 
         * @param versionIdMarker
         *        Marks the last version of the key returned in a truncated response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionIdMarker(String versionIdMarker);

        /**
         * <p>
         * When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextKeyMarker</code> specifies
         * the first key not returned that satisfies the search criteria. Use this value for the key-marker request
         * parameter in a subsequent request.
         * </p>
         * 
         * @param nextKeyMarker
         *        When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextKeyMarker</code>
         *        specifies the first key not returned that satisfies the search criteria. Use this value for the
         *        key-marker request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextKeyMarker(String nextKeyMarker);

        /**
         * <p>
         * When the number of responses exceeds the value of <code>MaxKeys</code>, <code>NextVersionIdMarker</code>
         * specifies the first object version not returned that satisfies the search criteria. Use this value for the
         * version-id-marker request parameter in a subsequent request.
         * </p>
         * 
         * @param nextVersionIdMarker
         *        When the number of responses exceeds the value of <code>MaxKeys</code>,
         *        <code>NextVersionIdMarker</code> specifies the first object version not returned that satisfies the
         *        search criteria. Use this value for the version-id-marker request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextVersionIdMarker(String nextVersionIdMarker);

        /**
         * <p>
         * Container for version information.
         * </p>
         * 
         * @param versions
         *        Container for version information.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versions(Collection<ObjectVersion> versions);

        /**
         * <p>
         * Container for version information.
         * </p>
         * 
         * @param versions
         *        Container for version information.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versions(ObjectVersion... versions);

        /**
         * <p>
         * Container for version information.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link ObjectVersion.Builder} avoiding the need to create one
         * manually via {@link ObjectVersion#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link ObjectVersion.Builder#build()} is called immediately and its
         * result is passed to {@link #versions(List<ObjectVersion>)}.
         * 
         * @param versions
         *        a consumer that will call methods on
         *        {@link ObjectVersion.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #versions(Collection<ObjectVersion>)
         */
        Builder versions(Consumer<ObjectVersion.Builder>... versions);

        /**
         * <p>
         * Container for an object that is a delete marker.
         * </p>
         * 
         * @param deleteMarkers
         *        Container for an object that is a delete marker.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarkers(Collection<DeleteMarkerEntry> deleteMarkers);

        /**
         * <p>
         * Container for an object that is a delete marker.
         * </p>
         * 
         * @param deleteMarkers
         *        Container for an object that is a delete marker.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarkers(DeleteMarkerEntry... deleteMarkers);

        /**
         * <p>
         * Container for an object that is a delete marker.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link DeleteMarkerEntry.Builder} avoiding the need to create one
         * manually via {@link DeleteMarkerEntry#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link DeleteMarkerEntry.Builder#build()} is called immediately and
         * its result is passed to {@link #deleteMarkers(List<DeleteMarkerEntry>)}.
         * 
         * @param deleteMarkers
         *        a consumer that will call methods on
         *        {@link DeleteMarkerEntry.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #deleteMarkers(Collection<DeleteMarkerEntry>)
         */
        Builder deleteMarkers(Consumer<DeleteMarkerEntry.Builder>... deleteMarkers);

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
         * Selects objects that start with the value supplied by this parameter.
         * </p>
         * 
         * @param prefix
         *        Selects objects that start with the value supplied by this parameter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All keys
         * that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a
         * single result element in <code>CommonPrefixes</code>. These groups are counted as one result against the
         * max-keys limitation. These keys are not returned elsewhere in the response.
         * </p>
         * 
         * @param delimiter
         *        The delimiter grouping the included keys. A delimiter is a character that you specify to group keys.
         *        All keys that contain the same string between the prefix and the first occurrence of the delimiter are
         *        grouped under a single result element in <code>CommonPrefixes</code>. These groups are counted as one
         *        result against the max-keys limitation. These keys are not returned elsewhere in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder delimiter(String delimiter);

        /**
         * <p>
         * Specifies the maximum number of objects to return.
         * </p>
         * 
         * @param maxKeys
         *        Specifies the maximum number of objects to return.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxKeys(Integer maxKeys);

        /**
         * <p>
         * All of the keys rolled up into a common prefix count as a single return when calculating the number of
         * returns.
         * </p>
         * 
         * @param commonPrefixes
         *        All of the keys rolled up into a common prefix count as a single return when calculating the number of
         *        returns.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(Collection<CommonPrefix> commonPrefixes);

        /**
         * <p>
         * All of the keys rolled up into a common prefix count as a single return when calculating the number of
         * returns.
         * </p>
         * 
         * @param commonPrefixes
         *        All of the keys rolled up into a common prefix count as a single return when calculating the number of
         *        returns.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder commonPrefixes(CommonPrefix... commonPrefixes);

        /**
         * <p>
         * All of the keys rolled up into a common prefix count as a single return when calculating the number of
         * returns.
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
         * Encoding type used by Amazon S3 to encode object key names in the XML response.
         * </p>
         * <p>
         * If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns
         * encoded key name values in the following response elements:
         * </p>
         * <p>
         * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object key names in the XML response.</p>
         *        <p>
         *        If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and
         *        returns encoded key name values in the following response elements:
         *        </p>
         *        <p>
         *        <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(String encodingType);

        /**
         * <p>
         * Encoding type used by Amazon S3 to encode object key names in the XML response.
         * </p>
         * <p>
         * If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns
         * encoded key name values in the following response elements:
         * </p>
         * <p>
         * <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
         * </p>
         * 
         * @param encodingType
         *        Encoding type used by Amazon S3 to encode object key names in the XML response.</p>
         *        <p>
         *        If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and
         *        returns encoded key name values in the following response elements:
         *        </p>
         *        <p>
         *        <code>KeyMarker, NextKeyMarker, Prefix, Key</code>, and <code>Delimiter</code>.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(EncodingType encodingType);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean isTruncated;

        private String keyMarker;

        private String versionIdMarker;

        private String nextKeyMarker;

        private String nextVersionIdMarker;

        private List<ObjectVersion> versions = DefaultSdkAutoConstructList.getInstance();

        private List<DeleteMarkerEntry> deleteMarkers = DefaultSdkAutoConstructList.getInstance();

        private String name;

        private String prefix;

        private String delimiter;

        private Integer maxKeys;

        private List<CommonPrefix> commonPrefixes = DefaultSdkAutoConstructList.getInstance();

        private String encodingType;

        private BuilderImpl() {
        }

        private BuilderImpl(ListObjectVersionsResponse model) {
            super(model);
            isTruncated(model.isTruncated);
            keyMarker(model.keyMarker);
            versionIdMarker(model.versionIdMarker);
            nextKeyMarker(model.nextKeyMarker);
            nextVersionIdMarker(model.nextVersionIdMarker);
            versions(model.versions);
            deleteMarkers(model.deleteMarkers);
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

        public final String getVersionIdMarker() {
            return versionIdMarker;
        }

        public final void setVersionIdMarker(String versionIdMarker) {
            this.versionIdMarker = versionIdMarker;
        }

        @Override
        public final Builder versionIdMarker(String versionIdMarker) {
            this.versionIdMarker = versionIdMarker;
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

        public final String getNextVersionIdMarker() {
            return nextVersionIdMarker;
        }

        public final void setNextVersionIdMarker(String nextVersionIdMarker) {
            this.nextVersionIdMarker = nextVersionIdMarker;
        }

        @Override
        public final Builder nextVersionIdMarker(String nextVersionIdMarker) {
            this.nextVersionIdMarker = nextVersionIdMarker;
            return this;
        }

        public final List<ObjectVersion.Builder> getVersions() {
            List<ObjectVersion.Builder> result = ObjectVersionListCopier.copyToBuilder(this.versions);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setVersions(Collection<ObjectVersion.BuilderImpl> versions) {
            this.versions = ObjectVersionListCopier.copyFromBuilder(versions);
        }

        @Override
        public final Builder versions(Collection<ObjectVersion> versions) {
            this.versions = ObjectVersionListCopier.copy(versions);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder versions(ObjectVersion... versions) {
            versions(Arrays.asList(versions));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder versions(Consumer<ObjectVersion.Builder>... versions) {
            versions(Stream.of(versions).map(c -> ObjectVersion.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final List<DeleteMarkerEntry.Builder> getDeleteMarkers() {
            List<DeleteMarkerEntry.Builder> result = DeleteMarkersCopier.copyToBuilder(this.deleteMarkers);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setDeleteMarkers(Collection<DeleteMarkerEntry.BuilderImpl> deleteMarkers) {
            this.deleteMarkers = DeleteMarkersCopier.copyFromBuilder(deleteMarkers);
        }

        @Override
        public final Builder deleteMarkers(Collection<DeleteMarkerEntry> deleteMarkers) {
            this.deleteMarkers = DeleteMarkersCopier.copy(deleteMarkers);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder deleteMarkers(DeleteMarkerEntry... deleteMarkers) {
            deleteMarkers(Arrays.asList(deleteMarkers));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder deleteMarkers(Consumer<DeleteMarkerEntry.Builder>... deleteMarkers) {
            deleteMarkers(Stream.of(deleteMarkers).map(c -> DeleteMarkerEntry.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
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
        public ListObjectVersionsResponse build() {
            return new ListObjectVersionsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
