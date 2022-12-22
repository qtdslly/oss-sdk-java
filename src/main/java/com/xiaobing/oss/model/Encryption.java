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
 * Contains the type of server-side encryption used.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Encryption implements SdkPojo, Serializable, ToCopyableBuilder<Encryption.Builder, Encryption> {
    private static final SdkField<String> ENCRYPTION_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("EncryptionType")
            .getter(getter(Encryption::encryptionTypeAsString))
            .setter(setter(Builder::encryptionType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EncryptionType")
                    .unmarshallLocationName("EncryptionType").build()).build();

    private static final SdkField<String> KMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KMSKeyId")
            .getter(getter(Encryption::kmsKeyId))
            .setter(setter(Builder::kmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KMSKeyId")
                    .unmarshallLocationName("KMSKeyId").build()).build();

    private static final SdkField<String> KMS_CONTEXT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KMSContext")
            .getter(getter(Encryption::kmsContext))
            .setter(setter(Builder::kmsContext))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KMSContext")
                    .unmarshallLocationName("KMSContext").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ENCRYPTION_TYPE_FIELD,
            KMS_KEY_ID_FIELD, KMS_CONTEXT_FIELD));

    private static final long serialVersionUID = 1L;

    private final String encryptionType;

    private final String kmsKeyId;

    private final String kmsContext;

    private Encryption(BuilderImpl builder) {
        this.encryptionType = builder.encryptionType;
        this.kmsKeyId = builder.kmsKeyId;
        this.kmsContext = builder.kmsContext;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encryptionType}
     * will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #encryptionTypeAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final ServerSideEncryption encryptionType() {
        return ServerSideEncryption.fromValue(encryptionType);
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #encryptionType}
     * will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #encryptionTypeAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final String encryptionTypeAsString() {
        return encryptionType;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value specifies the ID of the symmetric customer
     * managed key to use for encryption of job results. Amazon S3 only supports symmetric keys. For more information,
     * see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return If the encryption type is <code>aws:kms</code>, this optional value specifies the ID of the symmetric
     *         customer managed key to use for encryption of job results. Amazon S3 only supports symmetric keys. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *         and asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */
    public final String kmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If the encryption type is <code>aws:kms</code>, this optional value can be used to specify the encryption context
     * for the restore results.
     * </p>
     * 
     * @return If the encryption type is <code>aws:kms</code>, this optional value can be used to specify the encryption
     *         context for the restore results.
     */
    public final String kmsContext() {
        return kmsContext;
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
        hashCode = 31 * hashCode + Objects.hashCode(encryptionTypeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(kmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(kmsContext());
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
        if (!(obj instanceof Encryption)) {
            return false;
        }
        Encryption other = (Encryption) obj;
        return Objects.equals(encryptionTypeAsString(), other.encryptionTypeAsString())
                && Objects.equals(kmsKeyId(), other.kmsKeyId()) && Objects.equals(kmsContext(), other.kmsContext());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Encryption").add("EncryptionType", encryptionTypeAsString())
                .add("KMSKeyId", kmsKeyId() == null ? null : "*** Sensitive Data Redacted ***").add("KMSContext", kmsContext())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "EncryptionType":
            return Optional.ofNullable(clazz.cast(encryptionTypeAsString()));
        case "KMSKeyId":
            return Optional.ofNullable(clazz.cast(kmsKeyId()));
        case "KMSContext":
            return Optional.ofNullable(clazz.cast(kmsContext()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Encryption, T> g) {
        return obj -> g.apply((Encryption) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Encryption> {
        /**
         * <p>
         * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param encryptionType
         *        The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder encryptionType(String encryptionType);

        /**
         * <p>
         * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param encryptionType
         *        The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder encryptionType(ServerSideEncryption encryptionType);

        /**
         * <p>
         * If the encryption type is <code>aws:kms</code>, this optional value specifies the ID of the symmetric
         * customer managed key to use for encryption of job results. Amazon S3 only supports symmetric keys. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
         * asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
         * </p>
         * 
         * @param kmsKeyId
         *        If the encryption type is <code>aws:kms</code>, this optional value specifies the ID of the symmetric
         *        customer managed key to use for encryption of job results. Amazon S3 only supports symmetric keys. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
         *        and asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder kmsKeyId(String kmsKeyId);

        /**
         * <p>
         * If the encryption type is <code>aws:kms</code>, this optional value can be used to specify the encryption
         * context for the restore results.
         * </p>
         * 
         * @param kmsContext
         *        If the encryption type is <code>aws:kms</code>, this optional value can be used to specify the
         *        encryption context for the restore results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder kmsContext(String kmsContext);
    }

    static final class BuilderImpl implements Builder {
        private String encryptionType;

        private String kmsKeyId;

        private String kmsContext;

        private BuilderImpl() {
        }

        private BuilderImpl(Encryption model) {
            encryptionType(model.encryptionType);
            kmsKeyId(model.kmsKeyId);
            kmsContext(model.kmsContext);
        }

        public final String getEncryptionType() {
            return encryptionType;
        }

        public final void setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
        }

        @Override
        public final Builder encryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }

        @Override
        public final Builder encryptionType(ServerSideEncryption encryptionType) {
            this.encryptionType(encryptionType == null ? null : encryptionType.toString());
            return this;
        }

        public final String getKmsKeyId() {
            return kmsKeyId;
        }

        public final void setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
        }

        @Override
        public final Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public final String getKmsContext() {
            return kmsContext;
        }

        public final void setKmsContext(String kmsContext) {
            this.kmsContext = kmsContext;
        }

        @Override
        public final Builder kmsContext(String kmsContext) {
            this.kmsContext = kmsContext;
            return this;
        }

        @Override
        public Encryption build() {
            return new Encryption(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
