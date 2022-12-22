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
 * Information about the delete marker.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class DeleteMarkerEntry implements SdkPojo, Serializable,
        ToCopyableBuilder<DeleteMarkerEntry.Builder, DeleteMarkerEntry> {
    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(DeleteMarkerEntry::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(DeleteMarkerEntry::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(DeleteMarkerEntry::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("VersionId")
                    .unmarshallLocationName("VersionId").build()).build();

    private static final SdkField<Boolean> IS_LATEST_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsLatest")
            .getter(getter(DeleteMarkerEntry::isLatest))
            .setter(setter(Builder::isLatest))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsLatest")
                    .unmarshallLocationName("IsLatest").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(DeleteMarkerEntry::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LastModified")
                    .unmarshallLocationName("LastModified").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OWNER_FIELD, KEY_FIELD,
            VERSION_ID_FIELD, IS_LATEST_FIELD, LAST_MODIFIED_FIELD));

    private static final long serialVersionUID = 1L;

    private final Owner owner;

    private final String key;

    private final String versionId;

    private final Boolean isLatest;

    private final Instant lastModified;

    private DeleteMarkerEntry(BuilderImpl builder) {
        this.owner = builder.owner;
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.isLatest = builder.isLatest;
        this.lastModified = builder.lastModified;
    }

    /**
     * <p>
     * The account that created the delete marker.&gt;
     * </p>
     * 
     * @return The account that created the delete marker.&gt;
     */
    public final Owner owner() {
        return owner;
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
        hashCode = 31 * hashCode + Objects.hashCode(owner());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(isLatest());
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
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
        if (!(obj instanceof DeleteMarkerEntry)) {
            return false;
        }
        DeleteMarkerEntry other = (DeleteMarkerEntry) obj;
        return Objects.equals(owner(), other.owner()) && Objects.equals(key(), other.key())
                && Objects.equals(versionId(), other.versionId()) && Objects.equals(isLatest(), other.isLatest())
                && Objects.equals(lastModified(), other.lastModified());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DeleteMarkerEntry").add("Owner", owner()).add("Key", key()).add("VersionId", versionId())
                .add("IsLatest", isLatest()).add("LastModified", lastModified()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "IsLatest":
            return Optional.ofNullable(clazz.cast(isLatest()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DeleteMarkerEntry, T> g) {
        return obj -> g.apply((DeleteMarkerEntry) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, DeleteMarkerEntry> {
        /**
         * <p>
         * The account that created the delete marker.&gt;
         * </p>
         * 
         * @param owner
         *        The account that created the delete marker.&gt;
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * The account that created the delete marker.&gt;
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
    }

    static final class BuilderImpl implements Builder {
        private Owner owner;

        private String key;

        private String versionId;

        private Boolean isLatest;

        private Instant lastModified;

        private BuilderImpl() {
        }

        private BuilderImpl(DeleteMarkerEntry model) {
            owner(model.owner);
            key(model.key);
            versionId(model.versionId);
            isLatest(model.isLatest);
            lastModified(model.lastModified);
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

        @Override
        public DeleteMarkerEntry build() {
            return new DeleteMarkerEntry(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
