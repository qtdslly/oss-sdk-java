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
 * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are
 * published.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InventoryS3BucketDestination implements SdkPojo, Serializable,
        ToCopyableBuilder<InventoryS3BucketDestination.Builder, InventoryS3BucketDestination> {
    private static final SdkField<String> ACCOUNT_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AccountId")
            .getter(getter(InventoryS3BucketDestination::accountId))
            .setter(setter(Builder::accountId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccountId")
                    .unmarshallLocationName("AccountId").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(InventoryS3BucketDestination::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> FORMAT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Format")
            .getter(getter(InventoryS3BucketDestination::formatAsString))
            .setter(setter(Builder::format))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Format")
                    .unmarshallLocationName("Format").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(InventoryS3BucketDestination::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<InventoryEncryption> ENCRYPTION_FIELD = SdkField
            .<InventoryEncryption> builder(MarshallingType.SDK_POJO)
            .memberName("Encryption")
            .getter(getter(InventoryS3BucketDestination::encryption))
            .setter(setter(Builder::encryption))
            .constructor(InventoryEncryption::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Encryption")
                    .unmarshallLocationName("Encryption").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ACCOUNT_ID_FIELD,
            BUCKET_FIELD, FORMAT_FIELD, PREFIX_FIELD, ENCRYPTION_FIELD));

    private static final long serialVersionUID = 1L;

    private final String accountId;

    private final String bucket;

    private final String format;

    private final String prefix;

    private final InventoryEncryption encryption;

    private InventoryS3BucketDestination(BuilderImpl builder) {
        this.accountId = builder.accountId;
        this.bucket = builder.bucket;
        this.format = builder.format;
        this.prefix = builder.prefix;
        this.encryption = builder.encryption;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated
     * before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to help prevent problems if the
     * destination bucket ownership changes.
     * </p>
     * </note>
     * 
     * @return The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not
     *         validated before exporting data. </p> <note>
     *         <p>
     *         Although this value is optional, we strongly recommend that you set it to help prevent problems if the
     *         destination bucket ownership changes.
     *         </p>
     */
    public final String accountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #format} will
     * return {@link InventoryFormat#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #formatAsString}.
     * </p>
     * 
     * @return Specifies the output format of the inventory results.
     * @see InventoryFormat
     */
    public final InventoryFormat format() {
        return InventoryFormat.fromValue(format);
    }

    /**
     * <p>
     * Specifies the output format of the inventory results.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #format} will
     * return {@link InventoryFormat#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #formatAsString}.
     * </p>
     * 
     * @return Specifies the output format of the inventory results.
     * @see InventoryFormat
     */
    public final String formatAsString() {
        return format;
    }

    /**
     * <p>
     * The prefix that is prepended to all inventory results.
     * </p>
     * 
     * @return The prefix that is prepended to all inventory results.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * Contains the type of server-side encryption used to encrypt the inventory results.
     * </p>
     * 
     * @return Contains the type of server-side encryption used to encrypt the inventory results.
     */
    public final InventoryEncryption encryption() {
        return encryption;
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
        hashCode = 31 * hashCode + Objects.hashCode(accountId());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(formatAsString());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(encryption());
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
        if (!(obj instanceof InventoryS3BucketDestination)) {
            return false;
        }
        InventoryS3BucketDestination other = (InventoryS3BucketDestination) obj;
        return Objects.equals(accountId(), other.accountId()) && Objects.equals(bucket(), other.bucket())
                && Objects.equals(formatAsString(), other.formatAsString()) && Objects.equals(prefix(), other.prefix())
                && Objects.equals(encryption(), other.encryption());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("InventoryS3BucketDestination").add("AccountId", accountId()).add("Bucket", bucket())
                .add("Format", formatAsString()).add("Prefix", prefix()).add("Encryption", encryption()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "AccountId":
            return Optional.ofNullable(clazz.cast(accountId()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Format":
            return Optional.ofNullable(clazz.cast(formatAsString()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Encryption":
            return Optional.ofNullable(clazz.cast(encryption()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InventoryS3BucketDestination, T> g) {
        return obj -> g.apply((InventoryS3BucketDestination) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InventoryS3BucketDestination> {
        /**
         * <p>
         * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated
         * before exporting data.
         * </p>
         * <note>
         * <p>
         * Although this value is optional, we strongly recommend that you set it to help prevent problems if the
         * destination bucket ownership changes.
         * </p>
         * </note>
         * 
         * @param accountId
         *        The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not
         *        validated before exporting data. </p> <note>
         *        <p>
         *        Although this value is optional, we strongly recommend that you set it to help prevent problems if the
         *        destination bucket ownership changes.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accountId(String accountId);

        /**
         * <p>
         * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
         * </p>
         * 
         * @param bucket
         *        The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * Specifies the output format of the inventory results.
         * </p>
         * 
         * @param format
         *        Specifies the output format of the inventory results.
         * @see InventoryFormat
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryFormat
         */
        Builder format(String format);

        /**
         * <p>
         * Specifies the output format of the inventory results.
         * </p>
         * 
         * @param format
         *        Specifies the output format of the inventory results.
         * @see InventoryFormat
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryFormat
         */
        Builder format(InventoryFormat format);

        /**
         * <p>
         * The prefix that is prepended to all inventory results.
         * </p>
         * 
         * @param prefix
         *        The prefix that is prepended to all inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * Contains the type of server-side encryption used to encrypt the inventory results.
         * </p>
         * 
         * @param encryption
         *        Contains the type of server-side encryption used to encrypt the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder encryption(InventoryEncryption encryption);

        /**
         * <p>
         * Contains the type of server-side encryption used to encrypt the inventory results.
         * </p>
         * This is a convenience method that creates an instance of the {@link InventoryEncryption.Builder} avoiding the
         * need to create one manually via {@link InventoryEncryption#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InventoryEncryption.Builder#build()} is called immediately and
         * its result is passed to {@link #encryption(InventoryEncryption)}.
         * 
         * @param encryption
         *        a consumer that will call methods on {@link InventoryEncryption.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #encryption(InventoryEncryption)
         */
        default Builder encryption(Consumer<InventoryEncryption.Builder> encryption) {
            return encryption(InventoryEncryption.builder().applyMutation(encryption).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String accountId;

        private String bucket;

        private String format;

        private String prefix;

        private InventoryEncryption encryption;

        private BuilderImpl() {
        }

        private BuilderImpl(InventoryS3BucketDestination model) {
            accountId(model.accountId);
            bucket(model.bucket);
            format(model.format);
            prefix(model.prefix);
            encryption(model.encryption);
        }

        public final String getAccountId() {
            return accountId;
        }

        public final void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        @Override
        public final Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
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

        public final String getFormat() {
            return format;
        }

        public final void setFormat(String format) {
            this.format = format;
        }

        @Override
        public final Builder format(String format) {
            this.format = format;
            return this;
        }

        @Override
        public final Builder format(InventoryFormat format) {
            this.format(format == null ? null : format.toString());
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

        public final InventoryEncryption.Builder getEncryption() {
            return encryption != null ? encryption.toBuilder() : null;
        }

        public final void setEncryption(InventoryEncryption.BuilderImpl encryption) {
            this.encryption = encryption != null ? encryption.build() : null;
        }

        @Override
        public final Builder encryption(InventoryEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        @Override
        public InventoryS3BucketDestination build() {
            return new InventoryS3BucketDestination(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
