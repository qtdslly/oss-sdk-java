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
 * <p>
 * Container for the <code>MultipartUpload</code> for the Amazon S3 object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class MultipartUpload implements SdkPojo, Serializable, ToCopyableBuilder<MultipartUpload.Builder, MultipartUpload> {
    private static final SdkField<String> UPLOAD_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadId")
            .getter(getter(MultipartUpload::uploadId))
            .setter(setter(Builder::uploadId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("UploadId")
                    .unmarshallLocationName("UploadId").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(MultipartUpload::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<Instant> INITIATED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Initiated")
            .getter(getter(MultipartUpload::initiated))
            .setter(setter(Builder::initiated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Initiated")
                    .unmarshallLocationName("Initiated").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(MultipartUpload::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(MultipartUpload::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final SdkField<Initiator> INITIATOR_FIELD = SdkField
            .<Initiator> builder(MarshallingType.SDK_POJO)
            .memberName("Initiator")
            .getter(getter(MultipartUpload::initiator))
            .setter(setter(Builder::initiator))
            .constructor(Initiator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Initiator")
                    .unmarshallLocationName("Initiator").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(MultipartUpload::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumAlgorithm")
                    .unmarshallLocationName("ChecksumAlgorithm").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(UPLOAD_ID_FIELD, KEY_FIELD,
            INITIATED_FIELD, STORAGE_CLASS_FIELD, OWNER_FIELD, INITIATOR_FIELD, CHECKSUM_ALGORITHM_FIELD));

    private static final long serialVersionUID = 1L;

    private final String uploadId;

    private final String key;

    private final Instant initiated;

    private final String storageClass;

    private final Owner owner;

    private final Initiator initiator;

    private final String checksumAlgorithm;

    private MultipartUpload(BuilderImpl builder) {
        this.uploadId = builder.uploadId;
        this.key = builder.key;
        this.initiated = builder.initiated;
        this.storageClass = builder.storageClass;
        this.owner = builder.owner;
        this.initiator = builder.initiator;
        this.checksumAlgorithm = builder.checksumAlgorithm;
    }

    /**
     * <p>
     * Upload ID that identifies the multipart upload.
     * </p>
     * 
     * @return Upload ID that identifies the multipart upload.
     */
    public final String uploadId() {
        return uploadId;
    }

    /**
     * <p>
     * Key of the object for which the multipart upload was initiated.
     * </p>
     * 
     * @return Key of the object for which the multipart upload was initiated.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * Date and time at which the multipart upload was initiated.
     * </p>
     * 
     * @return Date and time at which the multipart upload was initiated.
     */
    public final Instant initiated() {
        return initiated;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the object.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the object.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
    }

    /**
     * <p>
     * Specifies the owner of the object that is part of the multipart upload.
     * </p>
     * 
     * @return Specifies the owner of the object that is part of the multipart upload.
     */
    public final Owner owner() {
        return owner;
    }

    /**
     * <p>
     * Identifies who initiated the multipart upload.
     * </p>
     * 
     * @return Identifies who initiated the multipart upload.
     */
    public final Initiator initiator() {
        return initiator;
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     * @see ChecksumAlgorithm
     */
    public final String checksumAlgorithmAsString() {
        return checksumAlgorithm;
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
        hashCode = 31 * hashCode + Objects.hashCode(uploadId());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(initiated());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(owner());
        hashCode = 31 * hashCode + Objects.hashCode(initiator());
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
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
        if (!(obj instanceof MultipartUpload)) {
            return false;
        }
        MultipartUpload other = (MultipartUpload) obj;
        return Objects.equals(uploadId(), other.uploadId()) && Objects.equals(key(), other.key())
                && Objects.equals(initiated(), other.initiated())
                && Objects.equals(storageClassAsString(), other.storageClassAsString()) && Objects.equals(owner(), other.owner())
                && Objects.equals(initiator(), other.initiator())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("MultipartUpload").add("UploadId", uploadId()).add("Key", key()).add("Initiated", initiated())
                .add("StorageClass", storageClassAsString()).add("Owner", owner()).add("Initiator", initiator())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "UploadId":
            return Optional.ofNullable(clazz.cast(uploadId()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "Initiated":
            return Optional.ofNullable(clazz.cast(initiated()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        case "Initiator":
            return Optional.ofNullable(clazz.cast(initiator()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<MultipartUpload, T> g) {
        return obj -> g.apply((MultipartUpload) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, MultipartUpload> {
        /**
         * <p>
         * Upload ID that identifies the multipart upload.
         * </p>
         * 
         * @param uploadId
         *        Upload ID that identifies the multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploadId(String uploadId);

        /**
         * <p>
         * Key of the object for which the multipart upload was initiated.
         * </p>
         * 
         * @param key
         *        Key of the object for which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * Date and time at which the multipart upload was initiated.
         * </p>
         * 
         * @param initiated
         *        Date and time at which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder initiated(Instant initiated);

        /**
         * <p>
         * The class of storage used to store the object.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * The class of storage used to store the object.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

        /**
         * <p>
         * Specifies the owner of the object that is part of the multipart upload.
         * </p>
         * 
         * @param owner
         *        Specifies the owner of the object that is part of the multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * Specifies the owner of the object that is part of the multipart upload.
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

        /**
         * <p>
         * Identifies who initiated the multipart upload.
         * </p>
         * 
         * @param initiator
         *        Identifies who initiated the multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder initiator(Initiator initiator);

        /**
         * <p>
         * Identifies who initiated the multipart upload.
         * </p>
         * This is a convenience method that creates an instance of the {@link Initiator.Builder} avoiding the need to
         * create one manually via {@link Initiator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Initiator.Builder#build()} is called immediately and its result
         * is passed to {@link #initiator(Initiator)}.
         * 
         * @param initiator
         *        a consumer that will call methods on {@link Initiator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #initiator(Initiator)
         */
        default Builder initiator(Consumer<Initiator.Builder> initiator) {
            return initiator(Initiator.builder().applyMutation(initiator).build());
        }

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm);
    }

    static final class BuilderImpl implements Builder {
        private String uploadId;

        private String key;

        private Instant initiated;

        private String storageClass;

        private Owner owner;

        private Initiator initiator;

        private String checksumAlgorithm;

        private BuilderImpl() {
        }

        private BuilderImpl(MultipartUpload model) {
            uploadId(model.uploadId);
            key(model.key);
            initiated(model.initiated);
            storageClass(model.storageClass);
            owner(model.owner);
            initiator(model.initiator);
            checksumAlgorithm(model.checksumAlgorithm);
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

        public final Instant getInitiated() {
            return initiated;
        }

        public final void setInitiated(Instant initiated) {
            this.initiated = initiated;
        }

        @Override
        public final Builder initiated(Instant initiated) {
            this.initiated = initiated;
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

        public final Initiator.Builder getInitiator() {
            return initiator != null ? initiator.toBuilder() : null;
        }

        public final void setInitiator(Initiator.BuilderImpl initiator) {
            this.initiator = initiator != null ? initiator.build() : null;
        }

        @Override
        public final Builder initiator(Initiator initiator) {
            this.initiator = initiator;
            return this;
        }

        public final String getChecksumAlgorithm() {
            return checksumAlgorithm;
        }

        public final void setChecksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
        }

        @Override
        public final Builder checksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
            return this;
        }

        @Override
        public final Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
            this.checksumAlgorithm(checksumAlgorithm == null ? null : checksumAlgorithm.toString());
            return this;
        }

        @Override
        public MultipartUpload build() {
            return new MultipartUpload(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
