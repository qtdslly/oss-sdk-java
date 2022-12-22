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
 * <p>
 * Describes an Amazon S3 location that will receive the results of the restore request.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class S3Location implements SdkPojo, Serializable, ToCopyableBuilder<S3Location.Builder, S3Location> {
    private static final SdkField<String> BUCKET_NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("BucketName")
            .getter(getter(S3Location::bucketName))
            .setter(setter(Builder::bucketName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BucketName")
                    .unmarshallLocationName("BucketName").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(S3Location::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Encryption> ENCRYPTION_FIELD = SdkField
            .<Encryption> builder(MarshallingType.SDK_POJO)
            .memberName("Encryption")
            .getter(getter(S3Location::encryption))
            .setter(setter(Builder::encryption))
            .constructor(Encryption::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Encryption")
                    .unmarshallLocationName("Encryption").build()).build();

    private static final SdkField<String> CANNED_ACL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CannedACL")
            .getter(getter(S3Location::cannedACLAsString))
            .setter(setter(Builder::cannedACL))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CannedACL")
                    .unmarshallLocationName("CannedACL").build()).build();

    private static final SdkField<List<Grant>> ACCESS_CONTROL_LIST_FIELD = SdkField
            .<List<Grant>> builder(MarshallingType.LIST)
            .memberName("AccessControlList")
            .getter(getter(S3Location::accessControlList))
            .setter(setter(Builder::accessControlList))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessControlList")
                    .unmarshallLocationName("AccessControlList").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Grant")
                            .memberFieldInfo(
                                    SdkField.<Grant> builder(MarshallingType.SDK_POJO)
                                            .constructor(Grant::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Grant").unmarshallLocationName("Grant").build()).build())
                            .build()).build();

    private static final SdkField<Tagging> TAGGING_FIELD = SdkField
            .<Tagging> builder(MarshallingType.SDK_POJO)
            .memberName("Tagging")
            .getter(getter(S3Location::tagging))
            .setter(setter(Builder::tagging))
            .constructor(Tagging::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tagging")
                    .unmarshallLocationName("Tagging").build()).build();

    private static final SdkField<List<MetadataEntry>> USER_METADATA_FIELD = SdkField
            .<List<MetadataEntry>> builder(MarshallingType.LIST)
            .memberName("UserMetadata")
            .getter(getter(S3Location::userMetadata))
            .setter(setter(Builder::userMetadata))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("UserMetadata")
                    .unmarshallLocationName("UserMetadata").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("MetadataEntry")
                            .memberFieldInfo(
                                    SdkField.<MetadataEntry> builder(MarshallingType.SDK_POJO)
                                            .constructor(MetadataEntry::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("MetadataEntry").unmarshallLocationName("MetadataEntry")
                                                    .build()).build()).build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(S3Location::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_NAME_FIELD,
            PREFIX_FIELD, ENCRYPTION_FIELD, CANNED_ACL_FIELD, ACCESS_CONTROL_LIST_FIELD, TAGGING_FIELD, USER_METADATA_FIELD,
            STORAGE_CLASS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String bucketName;

    private final String prefix;

    private final Encryption encryption;

    private final String cannedACL;

    private final List<Grant> accessControlList;

    private final Tagging tagging;

    private final List<MetadataEntry> userMetadata;

    private final String storageClass;

    private S3Location(BuilderImpl builder) {
        this.bucketName = builder.bucketName;
        this.prefix = builder.prefix;
        this.encryption = builder.encryption;
        this.cannedACL = builder.cannedACL;
        this.accessControlList = builder.accessControlList;
        this.tagging = builder.tagging;
        this.userMetadata = builder.userMetadata;
        this.storageClass = builder.storageClass;
    }

    /**
     * <p>
     * The name of the bucket where the restore results will be placed.
     * </p>
     * 
     * @return The name of the bucket where the restore results will be placed.
     */
    public final String bucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The prefix that is prepended to the restore results for this request.
     * </p>
     * 
     * @return The prefix that is prepended to the restore results for this request.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * Returns the value of the Encryption property for this object.
     * 
     * @return The value of the Encryption property for this object.
     */
    public final Encryption encryption() {
        return encryption;
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #cannedACL} will
     * return {@link ObjectCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #cannedACLAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the restore results.
     * @see ObjectCannedACL
     */
    public final ObjectCannedACL cannedACL() {
        return ObjectCannedACL.fromValue(cannedACL);
    }

    /**
     * <p>
     * The canned ACL to apply to the restore results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #cannedACL} will
     * return {@link ObjectCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #cannedACLAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the restore results.
     * @see ObjectCannedACL
     */
    public final String cannedACLAsString() {
        return cannedACL;
    }

    /**
     * For responses, this returns true if the service returned a value for the AccessControlList property. This DOES
     * NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasAccessControlList() {
        return accessControlList != null && !(accessControlList instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * A list of grants that control access to the staged results.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasAccessControlList} method.
     * </p>
     * 
     * @return A list of grants that control access to the staged results.
     */
    public final List<Grant> accessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * The tag-set that is applied to the restore results.
     * </p>
     * 
     * @return The tag-set that is applied to the restore results.
     */
    public final Tagging tagging() {
        return tagging;
    }

    /**
     * For responses, this returns true if the service returned a value for the UserMetadata property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasUserMetadata() {
        return userMetadata != null && !(userMetadata instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * A list of metadata to store with the restore results in S3.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasUserMetadata} method.
     * </p>
     * 
     * @return A list of metadata to store with the restore results in S3.
     */
    public final List<MetadataEntry> userMetadata() {
        return userMetadata;
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the restore results.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * The class of storage used to store the restore results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The class of storage used to store the restore results.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
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
        hashCode = 31 * hashCode + Objects.hashCode(bucketName());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(encryption());
        hashCode = 31 * hashCode + Objects.hashCode(cannedACLAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasAccessControlList() ? accessControlList() : null);
        hashCode = 31 * hashCode + Objects.hashCode(tagging());
        hashCode = 31 * hashCode + Objects.hashCode(hasUserMetadata() ? userMetadata() : null);
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
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
        if (!(obj instanceof S3Location)) {
            return false;
        }
        S3Location other = (S3Location) obj;
        return Objects.equals(bucketName(), other.bucketName()) && Objects.equals(prefix(), other.prefix())
                && Objects.equals(encryption(), other.encryption())
                && Objects.equals(cannedACLAsString(), other.cannedACLAsString())
                && hasAccessControlList() == other.hasAccessControlList()
                && Objects.equals(accessControlList(), other.accessControlList()) && Objects.equals(tagging(), other.tagging())
                && hasUserMetadata() == other.hasUserMetadata() && Objects.equals(userMetadata(), other.userMetadata())
                && Objects.equals(storageClassAsString(), other.storageClassAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("S3Location").add("BucketName", bucketName()).add("Prefix", prefix())
                .add("Encryption", encryption()).add("CannedACL", cannedACLAsString())
                .add("AccessControlList", hasAccessControlList() ? accessControlList() : null).add("Tagging", tagging())
                .add("UserMetadata", hasUserMetadata() ? userMetadata() : null).add("StorageClass", storageClassAsString())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "BucketName":
            return Optional.ofNullable(clazz.cast(bucketName()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Encryption":
            return Optional.ofNullable(clazz.cast(encryption()));
        case "CannedACL":
            return Optional.ofNullable(clazz.cast(cannedACLAsString()));
        case "AccessControlList":
            return Optional.ofNullable(clazz.cast(accessControlList()));
        case "Tagging":
            return Optional.ofNullable(clazz.cast(tagging()));
        case "UserMetadata":
            return Optional.ofNullable(clazz.cast(userMetadata()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<S3Location, T> g) {
        return obj -> g.apply((S3Location) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, S3Location> {
        /**
         * <p>
         * The name of the bucket where the restore results will be placed.
         * </p>
         * 
         * @param bucketName
         *        The name of the bucket where the restore results will be placed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketName(String bucketName);

        /**
         * <p>
         * The prefix that is prepended to the restore results for this request.
         * </p>
         * 
         * @param prefix
         *        The prefix that is prepended to the restore results for this request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * Sets the value of the Encryption property for this object.
         *
         * @param encryption
         *        The new value for the Encryption property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder encryption(Encryption encryption);

        /**
         * Sets the value of the Encryption property for this object.
         *
         * This is a convenience method that creates an instance of the {@link Encryption.Builder} avoiding the need to
         * create one manually via {@link Encryption#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Encryption.Builder#build()} is called immediately and its result
         * is passed to {@link #encryption(Encryption)}.
         * 
         * @param encryption
         *        a consumer that will call methods on {@link Encryption.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #encryption(Encryption)
         */
        default Builder encryption(Consumer<Encryption.Builder> encryption) {
            return encryption(Encryption.builder().applyMutation(encryption).build());
        }

        /**
         * <p>
         * The canned ACL to apply to the restore results.
         * </p>
         * 
         * @param cannedACL
         *        The canned ACL to apply to the restore results.
         * @see ObjectCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectCannedACL
         */
        Builder cannedACL(String cannedACL);

        /**
         * <p>
         * The canned ACL to apply to the restore results.
         * </p>
         * 
         * @param cannedACL
         *        The canned ACL to apply to the restore results.
         * @see ObjectCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectCannedACL
         */
        Builder cannedACL(ObjectCannedACL cannedACL);

        /**
         * <p>
         * A list of grants that control access to the staged results.
         * </p>
         * 
         * @param accessControlList
         *        A list of grants that control access to the staged results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessControlList(Collection<Grant> accessControlList);

        /**
         * <p>
         * A list of grants that control access to the staged results.
         * </p>
         * 
         * @param accessControlList
         *        A list of grants that control access to the staged results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessControlList(Grant... accessControlList);

        /**
         * <p>
         * A list of grants that control access to the staged results.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Grant.Builder} avoiding the need to create one manually via
         * {@link Grant#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Grant.Builder#build()}
         * is called immediately and its result is passed to {@link #accessControlList(List<Grant>)}.
         * 
         * @param accessControlList
         *        a consumer that will call methods on {@link Grant.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #accessControlList(Collection<Grant>)
         */
        Builder accessControlList(Consumer<Grant.Builder>... accessControlList);

        /**
         * <p>
         * The tag-set that is applied to the restore results.
         * </p>
         * 
         * @param tagging
         *        The tag-set that is applied to the restore results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagging(Tagging tagging);

        /**
         * <p>
         * The tag-set that is applied to the restore results.
         * </p>
         * This is a convenience method that creates an instance of the {@link Tagging.Builder} avoiding the need to
         * create one manually via {@link Tagging#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tagging.Builder#build()} is called immediately and its result is
         * passed to {@link #tagging(Tagging)}.
         * 
         * @param tagging
         *        a consumer that will call methods on {@link Tagging.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tagging(Tagging)
         */
        default Builder tagging(Consumer<Tagging.Builder> tagging) {
            return tagging(Tagging.builder().applyMutation(tagging).build());
        }

        /**
         * <p>
         * A list of metadata to store with the restore results in S3.
         * </p>
         * 
         * @param userMetadata
         *        A list of metadata to store with the restore results in S3.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder userMetadata(Collection<MetadataEntry> userMetadata);

        /**
         * <p>
         * A list of metadata to store with the restore results in S3.
         * </p>
         * 
         * @param userMetadata
         *        A list of metadata to store with the restore results in S3.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder userMetadata(MetadataEntry... userMetadata);

        /**
         * <p>
         * A list of metadata to store with the restore results in S3.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link MetadataEntry.Builder} avoiding the need to create one
         * manually via {@link MetadataEntry#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link MetadataEntry.Builder#build()} is called immediately and its
         * result is passed to {@link #userMetadata(List<MetadataEntry>)}.
         * 
         * @param userMetadata
         *        a consumer that will call methods on
         *        {@link MetadataEntry.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #userMetadata(Collection<MetadataEntry>)
         */
        Builder userMetadata(Consumer<MetadataEntry.Builder>... userMetadata);

        /**
         * <p>
         * The class of storage used to store the restore results.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the restore results.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * The class of storage used to store the restore results.
         * </p>
         * 
         * @param storageClass
         *        The class of storage used to store the restore results.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);
    }

    static final class BuilderImpl implements Builder {
        private String bucketName;

        private String prefix;

        private Encryption encryption;

        private String cannedACL;

        private List<Grant> accessControlList = DefaultSdkAutoConstructList.getInstance();

        private Tagging tagging;

        private List<MetadataEntry> userMetadata = DefaultSdkAutoConstructList.getInstance();

        private String storageClass;

        private BuilderImpl() {
        }

        private BuilderImpl(S3Location model) {
            bucketName(model.bucketName);
            prefix(model.prefix);
            encryption(model.encryption);
            cannedACL(model.cannedACL);
            accessControlList(model.accessControlList);
            tagging(model.tagging);
            userMetadata(model.userMetadata);
            storageClass(model.storageClass);
        }

        public final String getBucketName() {
            return bucketName;
        }

        public final void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        @Override
        public final Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
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

        public final Encryption.Builder getEncryption() {
            return encryption != null ? encryption.toBuilder() : null;
        }

        public final void setEncryption(Encryption.BuilderImpl encryption) {
            this.encryption = encryption != null ? encryption.build() : null;
        }

        @Override
        public final Builder encryption(Encryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public final String getCannedACL() {
            return cannedACL;
        }

        public final void setCannedACL(String cannedACL) {
            this.cannedACL = cannedACL;
        }

        @Override
        public final Builder cannedACL(String cannedACL) {
            this.cannedACL = cannedACL;
            return this;
        }

        @Override
        public final Builder cannedACL(ObjectCannedACL cannedACL) {
            this.cannedACL(cannedACL == null ? null : cannedACL.toString());
            return this;
        }

        public final List<Grant.Builder> getAccessControlList() {
            List<Grant.Builder> result = GrantsCopier.copyToBuilder(this.accessControlList);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setAccessControlList(Collection<Grant.BuilderImpl> accessControlList) {
            this.accessControlList = GrantsCopier.copyFromBuilder(accessControlList);
        }

        @Override
        public final Builder accessControlList(Collection<Grant> accessControlList) {
            this.accessControlList = GrantsCopier.copy(accessControlList);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder accessControlList(Grant... accessControlList) {
            accessControlList(Arrays.asList(accessControlList));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder accessControlList(Consumer<Grant.Builder>... accessControlList) {
            accessControlList(Stream.of(accessControlList).map(c -> Grant.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        public final Tagging.Builder getTagging() {
            return tagging != null ? tagging.toBuilder() : null;
        }

        public final void setTagging(Tagging.BuilderImpl tagging) {
            this.tagging = tagging != null ? tagging.build() : null;
        }

        @Override
        public final Builder tagging(Tagging tagging) {
            this.tagging = tagging;
            return this;
        }

        public final List<MetadataEntry.Builder> getUserMetadata() {
            List<MetadataEntry.Builder> result = UserMetadataCopier.copyToBuilder(this.userMetadata);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setUserMetadata(Collection<MetadataEntry.BuilderImpl> userMetadata) {
            this.userMetadata = UserMetadataCopier.copyFromBuilder(userMetadata);
        }

        @Override
        public final Builder userMetadata(Collection<MetadataEntry> userMetadata) {
            this.userMetadata = UserMetadataCopier.copy(userMetadata);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder userMetadata(MetadataEntry... userMetadata) {
            userMetadata(Arrays.asList(userMetadata));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder userMetadata(Consumer<MetadataEntry.Builder>... userMetadata) {
            userMetadata(Stream.of(userMetadata).map(c -> MetadataEntry.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
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

        @Override
        public S3Location build() {
            return new S3Location(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
