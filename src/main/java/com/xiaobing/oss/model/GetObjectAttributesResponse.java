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
public final class GetObjectAttributesResponse extends S3Response implements
        ToCopyableBuilder<GetObjectAttributesResponse.Builder, GetObjectAttributesResponse> {
    private static final SdkField<Boolean> DELETE_MARKER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("DeleteMarker")
            .getter(getter(GetObjectAttributesResponse::deleteMarker))
            .setter(setter(Builder::deleteMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-delete-marker")
                    .unmarshallLocationName("x-amz-delete-marker").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(GetObjectAttributesResponse::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Last-Modified")
                    .unmarshallLocationName("Last-Modified").build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(GetObjectAttributesResponse::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-version-id")
                    .unmarshallLocationName("x-amz-version-id").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(GetObjectAttributesResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<String> E_TAG_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ETag")
            .getter(getter(GetObjectAttributesResponse::eTag))
            .setter(setter(Builder::eTag))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ETag")
                    .unmarshallLocationName("ETag").build()).build();

    private static final SdkField<Checksum> CHECKSUM_FIELD = SdkField
            .<Checksum> builder(MarshallingType.SDK_POJO)
            .memberName("Checksum")
            .getter(getter(GetObjectAttributesResponse::checksum))
            .setter(setter(Builder::checksum))
            .constructor(Checksum::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Checksum")
                    .unmarshallLocationName("Checksum").build()).build();

    private static final SdkField<GetObjectAttributesParts> OBJECT_PARTS_FIELD = SdkField
            .<GetObjectAttributesParts> builder(MarshallingType.SDK_POJO)
            .memberName("ObjectParts")
            .getter(getter(GetObjectAttributesResponse::objectParts))
            .setter(setter(Builder::objectParts))
            .constructor(GetObjectAttributesParts::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectParts")
                    .unmarshallLocationName("ObjectParts").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(GetObjectAttributesResponse::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<Long> OBJECT_SIZE_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ObjectSize")
            .getter(getter(GetObjectAttributesResponse::objectSize))
            .setter(setter(Builder::objectSize))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectSize")
                    .unmarshallLocationName("ObjectSize").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DELETE_MARKER_FIELD,
            LAST_MODIFIED_FIELD, VERSION_ID_FIELD, REQUEST_CHARGED_FIELD, E_TAG_FIELD, CHECKSUM_FIELD, OBJECT_PARTS_FIELD,
            STORAGE_CLASS_FIELD, OBJECT_SIZE_FIELD));

    private final Boolean deleteMarker;

    private final Instant lastModified;

    private final String versionId;

    private final String requestCharged;

    private final String eTag;

    private final Checksum checksum;

    private final GetObjectAttributesParts objectParts;

    private final String storageClass;

    private final Long objectSize;

    private GetObjectAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.deleteMarker = builder.deleteMarker;
        this.lastModified = builder.lastModified;
        this.versionId = builder.versionId;
        this.requestCharged = builder.requestCharged;
        this.eTag = builder.eTag;
        this.checksum = builder.checksum;
        this.objectParts = builder.objectParts;
        this.storageClass = builder.storageClass;
        this.objectSize = builder.objectSize;
    }

    /**
     * <p>
     * Specifies whether the object retrieved was (<code>true</code>) or was not (<code>false</code>) a delete marker.
     * If <code>false</code>, this response header does not appear in the response.
     * </p>
     * 
     * @return Specifies whether the object retrieved was (<code>true</code>) or was not (<code>false</code>) a delete
     *         marker. If <code>false</code>, this response header does not appear in the response.
     */
    public final Boolean deleteMarker() {
        return deleteMarker;
    }

    /**
     * <p>
     * The creation date of the object.
     * </p>
     * 
     * @return The creation date of the object.
     */
    public final Instant lastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The version ID of the object.
     * </p>
     * 
     * @return The version ID of the object.
     */
    public final String versionId() {
        return versionId;
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
     * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
     * </p>
     * 
     * @return An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a
     *         URL.
     */
    public final String eTag() {
        return eTag;
    }

    /**
     * <p>
     * The checksum or digest of the object.
     * </p>
     * 
     * @return The checksum or digest of the object.
     */
    public final Checksum checksum() {
        return checksum;
    }

    /**
     * <p>
     * A collection of parts associated with a multipart upload.
     * </p>
     * 
     * @return A collection of parts associated with a multipart upload.
     */
    public final GetObjectAttributesParts objectParts() {
        return objectParts;
    }

    /**
     * <p>
     * Provides the storage class information of the object. Amazon S3 returns this header for all objects except for S3
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
     * @return Provides the storage class information of the object. Amazon S3 returns this header for all objects
     *         except for S3 Standard storage class objects.</p>
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
     * Provides the storage class information of the object. Amazon S3 returns this header for all objects except for S3
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
     * @return Provides the storage class information of the object. Amazon S3 returns this header for all objects
     *         except for S3 Standard storage class objects.</p>
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
     * The size of the object in bytes.
     * </p>
     * 
     * @return The size of the object in bytes.
     */
    public final Long objectSize() {
        return objectSize;
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
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(eTag());
        hashCode = 31 * hashCode + Objects.hashCode(checksum());
        hashCode = 31 * hashCode + Objects.hashCode(objectParts());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(objectSize());
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
        if (!(obj instanceof GetObjectAttributesResponse)) {
            return false;
        }
        GetObjectAttributesResponse other = (GetObjectAttributesResponse) obj;
        return Objects.equals(deleteMarker(), other.deleteMarker()) && Objects.equals(lastModified(), other.lastModified())
                && Objects.equals(versionId(), other.versionId())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(eTag(), other.eTag()) && Objects.equals(checksum(), other.checksum())
                && Objects.equals(objectParts(), other.objectParts())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(objectSize(), other.objectSize());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectAttributesResponse").add("DeleteMarker", deleteMarker())
                .add("LastModified", lastModified()).add("VersionId", versionId())
                .add("RequestCharged", requestChargedAsString()).add("ETag", eTag()).add("Checksum", checksum())
                .add("ObjectParts", objectParts()).add("StorageClass", storageClassAsString()).add("ObjectSize", objectSize())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DeleteMarker":
            return Optional.ofNullable(clazz.cast(deleteMarker()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "ETag":
            return Optional.ofNullable(clazz.cast(eTag()));
        case "Checksum":
            return Optional.ofNullable(clazz.cast(checksum()));
        case "ObjectParts":
            return Optional.ofNullable(clazz.cast(objectParts()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "ObjectSize":
            return Optional.ofNullable(clazz.cast(objectSize()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectAttributesResponse, T> g) {
        return obj -> g.apply((GetObjectAttributesResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectAttributesResponse> {
        /**
         * <p>
         * Specifies whether the object retrieved was (<code>true</code>) or was not (<code>false</code>) a delete
         * marker. If <code>false</code>, this response header does not appear in the response.
         * </p>
         * 
         * @param deleteMarker
         *        Specifies whether the object retrieved was (<code>true</code>) or was not (<code>false</code>) a
         *        delete marker. If <code>false</code>, this response header does not appear in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarker(Boolean deleteMarker);

        /**
         * <p>
         * The creation date of the object.
         * </p>
         * 
         * @param lastModified
         *        The creation date of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lastModified(Instant lastModified);

        /**
         * <p>
         * The version ID of the object.
         * </p>
         * 
         * @param versionId
         *        The version ID of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

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
         * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
         * </p>
         * 
         * @param eTag
         *        An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at
         *        a URL.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eTag(String eTag);

        /**
         * <p>
         * The checksum or digest of the object.
         * </p>
         * 
         * @param checksum
         *        The checksum or digest of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksum(Checksum checksum);

        /**
         * <p>
         * The checksum or digest of the object.
         * </p>
         * This is a convenience method that creates an instance of the {@link Checksum.Builder} avoiding the need to
         * create one manually via {@link Checksum#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Checksum.Builder#build()} is called immediately and its result is
         * passed to {@link #checksum(Checksum)}.
         * 
         * @param checksum
         *        a consumer that will call methods on {@link Checksum.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #checksum(Checksum)
         */
        default Builder checksum(Consumer<Checksum.Builder> checksum) {
            return checksum(Checksum.builder().applyMutation(checksum).build());
        }

        /**
         * <p>
         * A collection of parts associated with a multipart upload.
         * </p>
         * 
         * @param objectParts
         *        A collection of parts associated with a multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectParts(GetObjectAttributesParts objectParts);

        /**
         * <p>
         * A collection of parts associated with a multipart upload.
         * </p>
         * This is a convenience method that creates an instance of the {@link GetObjectAttributesParts.Builder}
         * avoiding the need to create one manually via {@link GetObjectAttributesParts#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link GetObjectAttributesParts.Builder#build()} is called immediately
         * and its result is passed to {@link #objectParts(GetObjectAttributesParts)}.
         * 
         * @param objectParts
         *        a consumer that will call methods on {@link GetObjectAttributesParts.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #objectParts(GetObjectAttributesParts)
         */
        default Builder objectParts(Consumer<GetObjectAttributesParts.Builder> objectParts) {
            return objectParts(GetObjectAttributesParts.builder().applyMutation(objectParts).build());
        }

        /**
         * <p>
         * Provides the storage class information of the object. Amazon S3 returns this header for all objects except
         * for S3 Standard storage class objects.
         * </p>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * </p>
         * 
         * @param storageClass
         *        Provides the storage class information of the object. Amazon S3 returns this header for all objects
         *        except for S3 Standard storage class objects.</p>
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
         * Provides the storage class information of the object. Amazon S3 returns this header for all objects except
         * for S3 Standard storage class objects.
         * </p>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a>.
         * </p>
         * 
         * @param storageClass
         *        Provides the storage class information of the object. Amazon S3 returns this header for all objects
         *        except for S3 Standard storage class objects.</p>
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
         * The size of the object in bytes.
         * </p>
         * 
         * @param objectSize
         *        The size of the object in bytes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectSize(Long objectSize);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean deleteMarker;

        private Instant lastModified;

        private String versionId;

        private String requestCharged;

        private String eTag;

        private Checksum checksum;

        private GetObjectAttributesParts objectParts;

        private String storageClass;

        private Long objectSize;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectAttributesResponse model) {
            super(model);
            deleteMarker(model.deleteMarker);
            lastModified(model.lastModified);
            versionId(model.versionId);
            requestCharged(model.requestCharged);
            eTag(model.eTag);
            checksum(model.checksum);
            objectParts(model.objectParts);
            storageClass(model.storageClass);
            objectSize(model.objectSize);
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

        public final Checksum.Builder getChecksum() {
            return checksum != null ? checksum.toBuilder() : null;
        }

        public final void setChecksum(Checksum.BuilderImpl checksum) {
            this.checksum = checksum != null ? checksum.build() : null;
        }

        @Override
        public final Builder checksum(Checksum checksum) {
            this.checksum = checksum;
            return this;
        }

        public final GetObjectAttributesParts.Builder getObjectParts() {
            return objectParts != null ? objectParts.toBuilder() : null;
        }

        public final void setObjectParts(GetObjectAttributesParts.BuilderImpl objectParts) {
            this.objectParts = objectParts != null ? objectParts.build() : null;
        }

        @Override
        public final Builder objectParts(GetObjectAttributesParts objectParts) {
            this.objectParts = objectParts;
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

        public final Long getObjectSize() {
            return objectSize;
        }

        public final void setObjectSize(Long objectSize) {
            this.objectSize = objectSize;
        }

        @Override
        public final Builder objectSize(Long objectSize) {
            this.objectSize = objectSize;
            return this;
        }

        @Override
        public GetObjectAttributesResponse build() {
            return new GetObjectAttributesResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
