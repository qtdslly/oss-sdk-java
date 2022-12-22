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
public final class ListObjectVersionsRequest extends S3Request implements
        ToCopyableBuilder<ListObjectVersionsRequest.Builder, ListObjectVersionsRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(ListObjectVersionsRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Delimiter")
            .getter(getter(ListObjectVersionsRequest::delimiter))
            .setter(setter(Builder::delimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("delimiter")
                    .unmarshallLocationName("delimiter").build()).build();

    private static final SdkField<String> ENCODING_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("EncodingType")
            .getter(getter(ListObjectVersionsRequest::encodingTypeAsString))
            .setter(setter(Builder::encodingType))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("encoding-type")
                    .unmarshallLocationName("encoding-type").build()).build();

    private static final SdkField<String> KEY_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KeyMarker")
            .getter(getter(ListObjectVersionsRequest::keyMarker))
            .setter(setter(Builder::keyMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("key-marker")
                    .unmarshallLocationName("key-marker").build()).build();

    private static final SdkField<Integer> MAX_KEYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxKeys")
            .getter(getter(ListObjectVersionsRequest::maxKeys))
            .setter(setter(Builder::maxKeys))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("max-keys")
                    .unmarshallLocationName("max-keys").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ListObjectVersionsRequest::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("prefix")
                    .unmarshallLocationName("prefix").build()).build();

    private static final SdkField<String> VERSION_ID_MARKER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionIdMarker")
            .getter(getter(ListObjectVersionsRequest::versionIdMarker))
            .setter(setter(Builder::versionIdMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("version-id-marker")
                    .unmarshallLocationName("version-id-marker").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(ListObjectVersionsRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, DELIMITER_FIELD,
            ENCODING_TYPE_FIELD, KEY_MARKER_FIELD, MAX_KEYS_FIELD, PREFIX_FIELD, VERSION_ID_MARKER_FIELD,
            EXPECTED_BUCKET_OWNER_FIELD));

    private final String bucket;

    private final String delimiter;

    private final String encodingType;

    private final String keyMarker;

    private final Integer maxKeys;

    private final String prefix;

    private final String versionIdMarker;

    private final String expectedBucketOwner;

    private ListObjectVersionsRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.keyMarker = builder.keyMarker;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
        this.versionIdMarker = builder.versionIdMarker;
        this.expectedBucketOwner = builder.expectedBucketOwner;
    }

    /**
     * <p>
     * The bucket name that contains the objects.
     * </p>
     * 
     * @return The bucket name that contains the objects.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * A delimiter is a character that you specify to group keys. All keys that contain the same string between the
     * <code>prefix</code> and the first occurrence of the delimiter are grouped under a single result element in
     * CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not
     * returned elsewhere in the response.
     * </p>
     * 
     * @return A delimiter is a character that you specify to group keys. All keys that contain the same string between
     *         the <code>prefix</code> and the first occurrence of the delimiter are grouped under a single result
     *         element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These
     *         keys are not returned elsewhere in the response.
     */
    public final String delimiter() {
        return delimiter;
    }

    /**
     * Returns the value of the EncodingType property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return The value of the EncodingType property for this object.
     * @see EncodingType
     */
    public final EncodingType encodingType() {
        return EncodingType.fromValue(encodingType);
    }

    /**
     * Returns the value of the EncodingType property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encodingType} will
     * return {@link EncodingType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #encodingTypeAsString}.
     * </p>
     * 
     * @return The value of the EncodingType property for this object.
     * @see EncodingType
     */
    public final String encodingTypeAsString() {
        return encodingType;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     * 
     * @return Specifies the key to start with when listing objects in a bucket.
     */
    public final String keyMarker() {
        return keyMarker;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key names.
     * The response might contain fewer keys but will never contain more. If additional keys satisfy the search
     * criteria, but were not returned because max-keys was exceeded, the response contains
     * &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker and version-id-marker.
     * </p>
     * 
     * @return Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key
     *         names. The response might contain fewer keys but will never contain more. If additional keys satisfy the
     *         search criteria, but were not returned because max-keys was exceeded, the response contains
     *         &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker and
     *         version-id-marker.
     */
    public final Integer maxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Use this parameter to select only those keys that begin with the specified prefix. You can use prefixes to
     * separate a bucket into different groupings of keys. (You can think of using prefix to make groups in the same way
     * you'd use a folder in a file system.) You can use prefix with delimiter to roll up numerous objects into a single
     * result under CommonPrefixes.
     * </p>
     * 
     * @return Use this parameter to select only those keys that begin with the specified prefix. You can use prefixes
     *         to separate a bucket into different groupings of keys. (You can think of using prefix to make groups in
     *         the same way you'd use a folder in a file system.) You can use prefix with delimiter to roll up numerous
     *         objects into a single result under CommonPrefixes.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * Specifies the object version you want to start listing from.
     * </p>
     * 
     * @return Specifies the object version you want to start listing from.
     */
    public final String versionIdMarker() {
        return versionIdMarker;
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
        hashCode = 31 * hashCode + Objects.hashCode(keyMarker());
        hashCode = 31 * hashCode + Objects.hashCode(maxKeys());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(versionIdMarker());
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
        if (!(obj instanceof ListObjectVersionsRequest)) {
            return false;
        }
        ListObjectVersionsRequest other = (ListObjectVersionsRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(delimiter(), other.delimiter())
                && Objects.equals(encodingTypeAsString(), other.encodingTypeAsString())
                && Objects.equals(keyMarker(), other.keyMarker()) && Objects.equals(maxKeys(), other.maxKeys())
                && Objects.equals(prefix(), other.prefix()) && Objects.equals(versionIdMarker(), other.versionIdMarker())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListObjectVersionsRequest").add("Bucket", bucket()).add("Delimiter", delimiter())
                .add("EncodingType", encodingTypeAsString()).add("KeyMarker", keyMarker()).add("MaxKeys", maxKeys())
                .add("Prefix", prefix()).add("VersionIdMarker", versionIdMarker())
                .add("ExpectedBucketOwner", expectedBucketOwner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Delimiter":
            return Optional.ofNullable(clazz.cast(delimiter()));
        case "EncodingType":
            return Optional.ofNullable(clazz.cast(encodingTypeAsString()));
        case "KeyMarker":
            return Optional.ofNullable(clazz.cast(keyMarker()));
        case "MaxKeys":
            return Optional.ofNullable(clazz.cast(maxKeys()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "VersionIdMarker":
            return Optional.ofNullable(clazz.cast(versionIdMarker()));
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

    private static <T> Function<Object, T> getter(Function<ListObjectVersionsRequest, T> g) {
        return obj -> g.apply((ListObjectVersionsRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, ListObjectVersionsRequest> {
        /**
         * <p>
         * The bucket name that contains the objects.
         * </p>
         * 
         * @param bucket
         *        The bucket name that contains the objects.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * A delimiter is a character that you specify to group keys. All keys that contain the same string between the
         * <code>prefix</code> and the first occurrence of the delimiter are grouped under a single result element in
         * CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not
         * returned elsewhere in the response.
         * </p>
         * 
         * @param delimiter
         *        A delimiter is a character that you specify to group keys. All keys that contain the same string
         *        between the <code>prefix</code> and the first occurrence of the delimiter are grouped under a single
         *        result element in CommonPrefixes. These groups are counted as one result against the max-keys
         *        limitation. These keys are not returned elsewhere in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder delimiter(String delimiter);

        /**
         * Sets the value of the EncodingType property for this object.
         *
         * @param encodingType
         *        The new value for the EncodingType property for this object.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(String encodingType);

        /**
         * Sets the value of the EncodingType property for this object.
         *
         * @param encodingType
         *        The new value for the EncodingType property for this object.
         * @see EncodingType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see EncodingType
         */
        Builder encodingType(EncodingType encodingType);

        /**
         * <p>
         * Specifies the key to start with when listing objects in a bucket.
         * </p>
         * 
         * @param keyMarker
         *        Specifies the key to start with when listing objects in a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyMarker(String keyMarker);

        /**
         * <p>
         * Sets the maximum number of keys returned in the response. By default the action returns up to 1,000 key
         * names. The response might contain fewer keys but will never contain more. If additional keys satisfy the
         * search criteria, but were not returned because max-keys was exceeded, the response contains
         * &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker and
         * version-id-marker.
         * </p>
         * 
         * @param maxKeys
         *        Sets the maximum number of keys returned in the response. By default the action returns up to 1,000
         *        key names. The response might contain fewer keys but will never contain more. If additional keys
         *        satisfy the search criteria, but were not returned because max-keys was exceeded, the response
         *        contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker
         *        and version-id-marker.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxKeys(Integer maxKeys);

        /**
         * <p>
         * Use this parameter to select only those keys that begin with the specified prefix. You can use prefixes to
         * separate a bucket into different groupings of keys. (You can think of using prefix to make groups in the same
         * way you'd use a folder in a file system.) You can use prefix with delimiter to roll up numerous objects into
         * a single result under CommonPrefixes.
         * </p>
         * 
         * @param prefix
         *        Use this parameter to select only those keys that begin with the specified prefix. You can use
         *        prefixes to separate a bucket into different groupings of keys. (You can think of using prefix to make
         *        groups in the same way you'd use a folder in a file system.) You can use prefix with delimiter to roll
         *        up numerous objects into a single result under CommonPrefixes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * Specifies the object version you want to start listing from.
         * </p>
         * 
         * @param versionIdMarker
         *        Specifies the object version you want to start listing from.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionIdMarker(String versionIdMarker);

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

        private String keyMarker;

        private Integer maxKeys;

        private String prefix;

        private String versionIdMarker;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(ListObjectVersionsRequest model) {
            super(model);
            bucket(model.bucket);
            delimiter(model.delimiter);
            encodingType(model.encodingType);
            keyMarker(model.keyMarker);
            maxKeys(model.maxKeys);
            prefix(model.prefix);
            versionIdMarker(model.versionIdMarker);
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
        public ListObjectVersionsRequest build() {
            return new ListObjectVersionsRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
