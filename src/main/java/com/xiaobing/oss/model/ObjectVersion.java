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

import java.io.Serializable;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
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
import software.amazon.awssdk.core.traits.ListTrait;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructList;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * The version of an object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ObjectVersion implements SdkPojo, Serializable, ToCopyableBuilder<ObjectVersion.Builder, ObjectVersion> {
    private static final SdkField<String> E_TAG_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ETag")
            .getter(getter(ObjectVersion::eTag))
            .setter(setter(Builder::eTag))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ETag")
                    .unmarshallLocationName("ETag").build()).build();

    private static final SdkField<List<String>> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("ChecksumAlgorithm")
            .getter(getter(ObjectVersion::checksumAlgorithmAsStrings))
            .setter(setter(Builder::checksumAlgorithmWithStrings))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumAlgorithm")
                    .unmarshallLocationName("ChecksumAlgorithm").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<Long> SIZE_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("Size")
            .getter(getter(ObjectVersion::size))
            .setter(setter(Builder::size))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Size")
                    .unmarshallLocationName("Size").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(ObjectVersion::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(ObjectVersion::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(ObjectVersion::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("VersionId")
                    .unmarshallLocationName("VersionId").build()).build();

    private static final SdkField<Boolean> IS_LATEST_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsLatest")
            .getter(getter(ObjectVersion::isLatest))
            .setter(setter(Builder::isLatest))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsLatest")
                    .unmarshallLocationName("IsLatest").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(ObjectVersion::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LastModified")
                    .unmarshallLocationName("LastModified").build()).build();

    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(ObjectVersion::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(E_TAG_FIELD,
            CHECKSUM_ALGORITHM_FIELD, SIZE_FIELD, STORAGE_CLASS_FIELD, KEY_FIELD, VERSION_ID_FIELD, IS_LATEST_FIELD,
            LAST_MODIFIED_FIELD, OWNER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String eTag;

    private final List<String> checksumAlgorithm;

    private final Long size;

    private final String storageClass;

    private final String key;

    private final String versionId;

    private final Boolean isLatest;

    private final Instant lastModified;

    private final Owner owner;

    private ObjectVersion(BuilderImpl builder) {
        this.eTag = builder.eTag;
        this.checksumAlgorithm = builder.checksumAlgorithm;
        this.size = builder.size;
        this.storageClass = builder.storageClass;
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.isLatest = builder.isLatest;
        this.lastModified = builder.lastModified;
        this.owner = builder.owner;
    }

    /**
     * <p>
     * The entity tag is an MD5 hash of that version of the object.
     * </p>
     * 
     * @return The entity tag is an MD5 hash of that version of the object.
     */
    public final String eTag() {
        return eTag;
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasChecksumAlgorithm} method.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     */
    public final List<ChecksumAlgorithm> checksumAlgorithm() {
        return ChecksumAlgorithmListCopier.copyStringToEnum(checksumAlgorithm);
    }

    /**
     * For responses, this returns true if the service returned a value for the ChecksumAlgorithm property. This DOES
     * NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasChecksumAlgorithm() {
        return checksumAlgorithm != null && !(checksumAlgorithm instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasChecksumAlgorithm} method.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     */
    public final List<String> checksumAlgorithmAsStrings() {
        return checksumAlgorithm;
    }

    /**
     * <p>
     * Size in bytes of the object.
     * </p>
     * 
     * @return Size in bytes of the object.
     */
    public final Long size() {
        return size;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link ObjectVersionStorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the object.
     * @see ObjectVersionStorageClass
     */
    public final ObjectVersionStorageClass storageClass() {
        return ObjectVersionStorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link ObjectVersionStorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the object.
     * @see ObjectVersionStorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
    }

    /**
     * <p>
     * The object key.
     * </p>
     * 
     * @return The object key.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * Version ID of an object.
     * </p>
     * 
     * @return Version ID of an object.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * Specifies whether the object is (true) or is not (false) the latest version of an object.
     * </p>
     * 
     * @return Specifies whether the object is (true) or is not (false) the latest version of an object.
     */
    public final Boolean isLatest() {
        return isLatest;
    }

    /**
     * <p>
     * Date and time the object was last modified.
     * </p>
     * 
     * @return Date and time the object was last modified.
     */
    public final Instant lastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Specifies the owner of the object.
     * </p>
     * 
     * @return Specifies the owner of the object.
     */
    public final Owner owner() {
        return owner;
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
        hashCode = 31 * hashCode + Objects.hashCode(eTag());
        hashCode = 31 * hashCode + Objects.hashCode(hasChecksumAlgorithm() ? checksumAlgorithmAsStrings() : null);
        hashCode = 31 * hashCode + Objects.hashCode(size());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(isLatest());
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
        hashCode = 31 * hashCode + Objects.hashCode(owner());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ObjectVersion)) {
            return false;
        }
        ObjectVersion other = (ObjectVersion) obj;
        return Objects.equals(eTag(), other.eTag()) && hasChecksumAlgorithm() == other.hasChecksumAlgorithm()
                && Objects.equals(checksumAlgorithmAsStrings(), other.checksumAlgorithmAsStrings())
                && Objects.equals(size(), other.size()) && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(key(), other.key()) && Objects.equals(versionId(), other.versionId())
                && Objects.equals(isLatest(), other.isLatest()) && Objects.equals(lastModified(), other.lastModified())
                && Objects.equals(owner(), other.owner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ObjectVersion").add("ETag", eTag())
                .add("ChecksumAlgorithm", hasChecksumAlgorithm() ? checksumAlgorithmAsStrings() : null).add("Size", size())
                .add("StorageClass", storageClassAsString()).add("Key", key()).add("VersionId", versionId())
                .add("IsLatest", isLatest()).add("LastModified", lastModified()).add("Owner", owner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ETag":
            return Optional.ofNullable(clazz.cast(eTag()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsStrings()));
        case "Size":
            return Optional.ofNullable(clazz.cast(size()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "IsLatest":
            return Optional.ofNullable(clazz.cast(isLatest()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ObjectVersion, T> g) {
        return obj -> g.apply((ObjectVersion) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ObjectVersion> {
        /**
         * <p>
         * The entity tag is an MD5 hash of that version of the object.
         * </p>
         * 
         * @param eTag
         *        The entity tag is an MD5 hash of that version of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eTag(String eTag);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumAlgorithmWithStrings(Collection<String> checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumAlgorithmWithStrings(String... checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumAlgorithm(Collection<ChecksumAlgorithm> checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumAlgorithm(ChecksumAlgorithm... checksumAlgorithm);

        /**
         * <p>
         * Size in bytes of the object.
         * </p>
         * 
         * @param size
         *        Size in bytes of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder size(Long size);

        /**
         * <p>
         * The class of storage used to store the object.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the object.
         * @see ObjectVersionStorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectVersionStorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * The class of storage used to store the object.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the object.
         * @see ObjectVersionStorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectVersionStorageClass
         */
        Builder storageClass(ObjectVersionStorageClass storageClass);

        /**
         * <p>
         * The object key.
         * </p>
         * 
         * @param key
         *        The object key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * Version ID of an object.
         * </p>
         * 
         * @param versionId
         *        Version ID of an object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * Specifies whether the object is (true) or is not (false) the latest version of an object.
         * </p>
         * 
         * @param isLatest
         *        Specifies whether the object is (true) or is not (false) the latest version of an object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isLatest(Boolean isLatest);

        /**
         * <p>
         * Date and time the object was last modified.
         * </p>
         * 
         * @param lastModified
         *        Date and time the object was last modified.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lastModified(Instant lastModified);

        /**
         * <p>
         * Specifies the owner of the object.
         * </p>
         * 
         * @param owner
         *        Specifies the owner of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * Specifies the owner of the object.
         * </p>
         * This is a convenience method that creates an instance of the {@link Owner.Builder} avoiding the need to
         * create one manually via {@link Owner#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Owner.Builder#build()} is called immediately and its result is
         * passed to {@link #owner(Owner)}.
         * 
         * @param owner
         *        a consumer that will call methods on {@link Owner.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #owner(Owner)
         */
        default Builder owner(Consumer<Owner.Builder> owner) {
            return owner(Owner.builder().applyMutation(owner).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String eTag;

        private List<String> checksumAlgorithm = DefaultSdkAutoConstructList.getInstance();

        private Long size;

        private String storageClass;

        private String key;

        private String versionId;

        private Boolean isLatest;

        private Instant lastModified;

        private Owner owner;

        private BuilderImpl() {
        }

        private BuilderImpl(ObjectVersion model) {
            eTag(model.eTag);
            checksumAlgorithmWithStrings(model.checksumAlgorithm);
            size(model.size);
            storageClass(model.storageClass);
            key(model.key);
            versionId(model.versionId);
            isLatest(model.isLatest);
            lastModified(model.lastModified);
            owner(model.owner);
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

        public final Collection<String> getChecksumAlgorithm() {
            if (checksumAlgorithm instanceof SdkAutoConstructList) {
                return null;
            }
            return checksumAlgorithm;
        }

        public final void setChecksumAlgorithm(Collection<String> checksumAlgorithm) {
            this.checksumAlgorithm = ChecksumAlgorithmListCopier.copy(checksumAlgorithm);
        }

        @Override
        public final Builder checksumAlgorithmWithStrings(Collection<String> checksumAlgorithm) {
            this.checksumAlgorithm = ChecksumAlgorithmListCopier.copy(checksumAlgorithm);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder checksumAlgorithmWithStrings(String... checksumAlgorithm) {
            checksumAlgorithmWithStrings(Arrays.asList(checksumAlgorithm));
            return this;
        }

        @Override
        public final Builder checksumAlgorithm(Collection<ChecksumAlgorithm> checksumAlgorithm) {
            this.checksumAlgorithm = ChecksumAlgorithmListCopier.copyEnumToString(checksumAlgorithm);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder checksumAlgorithm(ChecksumAlgorithm... checksumAlgorithm) {
            checksumAlgorithm(Arrays.asList(checksumAlgorithm));
            return this;
        }

        public final Long getSize() {
            return size;
        }

        public final void setSize(Long size) {
            this.size = size;
        }

        @Override
        public final Builder size(Long size) {
            this.size = size;
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
        public final Builder storageClass(ObjectVersionStorageClass storageClass) {
            this.storageClass(storageClass == null ? null : storageClass.toString());
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

        public final Boolean getIsLatest() {
            return isLatest;
        }

        public final void setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
        }

        @Override
        public final Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
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

        public final Owner.Builder getOwner() {
            return owner != null ? owner.toBuilder() : null;
        }

        public final void setOwner(Owner.BuilderImpl owner) {
            this.owner = owner != null ? owner.build() : null;
        }

        @Override
        public final Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        @Override
        public ObjectVersion build() {
            return new ObjectVersion(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
