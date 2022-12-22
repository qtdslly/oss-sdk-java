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
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class CopyObjectResponse extends S3Response implements
        ToCopyableBuilder<CopyObjectResponse.Builder, CopyObjectResponse> {
    private static final SdkField<CopyObjectResult> COPY_OBJECT_RESULT_FIELD = SdkField
            .<CopyObjectResult> builder(MarshallingType.SDK_POJO)
            .memberName("CopyObjectResult")
            .getter(getter(CopyObjectResponse::copyObjectResult))
            .setter(setter(Builder::copyObjectResult))
            .constructor(CopyObjectResult::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CopyObjectResult")
                    .unmarshallLocationName("CopyObjectResult").build(), PayloadTrait.create()).build();

    private static final SdkField<String> EXPIRATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Expiration")
            .getter(getter(CopyObjectResponse::expiration))
            .setter(setter(Builder::expiration))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expiration")
                    .unmarshallLocationName("x-amz-expiration").build()).build();

    private static final SdkField<String> COPY_SOURCE_VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CopySourceVersionId")
            .getter(getter(CopyObjectResponse::copySourceVersionId))
            .setter(setter(Builder::copySourceVersionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-copy-source-version-id")
                    .unmarshallLocationName("x-amz-copy-source-version-id").build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(CopyObjectResponse::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-version-id")
                    .unmarshallLocationName("x-amz-version-id").build()).build();

    private static final SdkField<String> SERVER_SIDE_ENCRYPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ServerSideEncryption")
            .getter(getter(CopyObjectResponse::serverSideEncryptionAsString))
            .setter(setter(Builder::serverSideEncryption))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-server-side-encryption")
                    .unmarshallLocationName("x-amz-server-side-encryption").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(CopyObjectResponse::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(CopyObjectResponse::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> SSEKMS_KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSKeyId")
            .getter(getter(CopyObjectResponse::ssekmsKeyId))
            .setter(setter(Builder::ssekmsKeyId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-aws-kms-key-id")
                    .unmarshallLocationName("x-amz-server-side-encryption-aws-kms-key-id").build()).build();

    private static final SdkField<String> SSEKMS_ENCRYPTION_CONTEXT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSEKMSEncryptionContext")
            .getter(getter(CopyObjectResponse::ssekmsEncryptionContext))
            .setter(setter(Builder::ssekmsEncryptionContext))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-context")
                    .unmarshallLocationName("x-amz-server-side-encryption-context").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(CopyObjectResponse::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-bucket-key-enabled")
                    .unmarshallLocationName("x-amz-server-side-encryption-bucket-key-enabled").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(CopyObjectResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(COPY_OBJECT_RESULT_FIELD,
            EXPIRATION_FIELD, COPY_SOURCE_VERSION_ID_FIELD, VERSION_ID_FIELD, SERVER_SIDE_ENCRYPTION_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD, SSEKMS_KEY_ID_FIELD, SSEKMS_ENCRYPTION_CONTEXT_FIELD,
            BUCKET_KEY_ENABLED_FIELD, REQUEST_CHARGED_FIELD));

    private final CopyObjectResult copyObjectResult;

    private final String expiration;

    private final String copySourceVersionId;

    private final String versionId;

    private final String serverSideEncryption;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKeyMD5;

    private final String ssekmsKeyId;

    private final String ssekmsEncryptionContext;

    private final Boolean bucketKeyEnabled;

    private final String requestCharged;

    private CopyObjectResponse(BuilderImpl builder) {
        super(builder);
        this.copyObjectResult = builder.copyObjectResult;
        this.expiration = builder.expiration;
        this.copySourceVersionId = builder.copySourceVersionId;
        this.versionId = builder.versionId;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.ssekmsKeyId = builder.ssekmsKeyId;
        this.ssekmsEncryptionContext = builder.ssekmsEncryptionContext;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
        this.requestCharged = builder.requestCharged;
    }

    /**
     * <p>
     * Container for all response elements.
     * </p>
     * 
     * @return Container for all response elements.
     */
    public final CopyObjectResult copyObjectResult() {
        return copyObjectResult;
    }

    /**
     * <p>
     * If the object expiration is configured, the response includes this header.
     * </p>
     * 
     * @return If the object expiration is configured, the response includes this header.
     */
    public final String expiration() {
        return expiration;
    }

    /**
     * <p>
     * Version of the copied object in the destination bucket.
     * </p>
     * 
     * @return Version of the copied object in the destination bucket.
     */
    public final String copySourceVersionId() {
        return copySourceVersionId;
    }

    /**
     * <p>
     * Version ID of the newly created copy.
     * </p>
     * 
     * @return Version ID of the newly created copy.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final ServerSideEncryption serverSideEncryption() {
        return ServerSideEncryption.fromValue(serverSideEncryption);
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #serverSideEncryption} will return {@link ServerSideEncryption#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #serverSideEncryptionAsString}.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
     *         aws:kms).
     * @see ServerSideEncryption
     */
    public final String serverSideEncryptionAsString() {
        return serverSideEncryption;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this
     * header confirming the encryption algorithm used.
     * </p>
     * 
     * @return If server-side encryption with a customer-provided encryption key was requested, the response will
     *         include this header confirming the encryption algorithm used.
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * If server-side encryption with a customer-provided encryption key was requested, the response will include this
     * header to provide round-trip message integrity verification of the customer-provided encryption key.
     * </p>
     * 
     * @return If server-side encryption with a customer-provided encryption key was requested, the response will
     *         include this header to provide round-trip message integrity verification of the customer-provided
     *         encryption key.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * <p>
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     * symmetric customer managed key that was used for the object.
     * </p>
     * 
     * @return If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *         symmetric customer managed key that was used for the object.
     */
    public final String ssekmsKeyId() {
        return ssekmsKeyId;
    }

    /**
     * <p>
     * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of
     * this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
     * </p>
     * 
     * @return If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
     *         value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
     *         pairs.
     */
    public final String ssekmsEncryptionContext() {
        return ssekmsEncryptionContext;
    }

    /**
     * <p>
     * Indicates whether the copied object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS
     * (SSE-KMS).
     * </p>
     * 
     * @return Indicates whether the copied object uses an S3 Bucket Key for server-side encryption with Amazon Web
     *         Services KMS (SSE-KMS).
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
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
        hashCode = 31 * hashCode + Objects.hashCode(copyObjectResult());
        hashCode = 31 * hashCode + Objects.hashCode(expiration());
        hashCode = 31 * hashCode + Objects.hashCode(copySourceVersionId());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(serverSideEncryptionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsKeyId());
        hashCode = 31 * hashCode + Objects.hashCode(ssekmsEncryptionContext());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
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
        if (!(obj instanceof CopyObjectResponse)) {
            return false;
        }
        CopyObjectResponse other = (CopyObjectResponse) obj;
        return Objects.equals(copyObjectResult(), other.copyObjectResult()) && Objects.equals(expiration(), other.expiration())
                && Objects.equals(copySourceVersionId(), other.copySourceVersionId())
                && Objects.equals(versionId(), other.versionId())
                && Objects.equals(serverSideEncryptionAsString(), other.serverSideEncryptionAsString())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(ssekmsKeyId(), other.ssekmsKeyId())
                && Objects.equals(ssekmsEncryptionContext(), other.ssekmsEncryptionContext())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CopyObjectResponse").add("CopyObjectResult", copyObjectResult()).add("Expiration", expiration())
                .add("CopySourceVersionId", copySourceVersionId()).add("VersionId", versionId())
                .add("ServerSideEncryption", serverSideEncryptionAsString()).add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5())
                .add("SSEKMSKeyId", ssekmsKeyId() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSEKMSEncryptionContext", ssekmsEncryptionContext() == null ? null : "*** Sensitive Data Redacted ***")
                .add("BucketKeyEnabled", bucketKeyEnabled()).add("RequestCharged", requestChargedAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "CopyObjectResult":
            return Optional.ofNullable(clazz.cast(copyObjectResult()));
        case "Expiration":
            return Optional.ofNullable(clazz.cast(expiration()));
        case "CopySourceVersionId":
            return Optional.ofNullable(clazz.cast(copySourceVersionId()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "ServerSideEncryption":
            return Optional.ofNullable(clazz.cast(serverSideEncryptionAsString()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "SSEKMSKeyId":
            return Optional.ofNullable(clazz.cast(ssekmsKeyId()));
        case "SSEKMSEncryptionContext":
            return Optional.ofNullable(clazz.cast(ssekmsEncryptionContext()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CopyObjectResponse, T> g) {
        return obj -> g.apply((CopyObjectResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, CopyObjectResponse> {
        /**
         * <p>
         * Container for all response elements.
         * </p>
         * 
         * @param copyObjectResult
         *        Container for all response elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copyObjectResult(CopyObjectResult copyObjectResult);

        /**
         * <p>
         * Container for all response elements.
         * </p>
         * This is a convenience method that creates an instance of the {@link CopyObjectResult.Builder} avoiding the
         * need to create one manually via {@link CopyObjectResult#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link CopyObjectResult.Builder#build()} is called immediately and its
         * result is passed to {@link #copyObjectResult(CopyObjectResult)}.
         * 
         * @param copyObjectResult
         *        a consumer that will call methods on {@link CopyObjectResult.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #copyObjectResult(CopyObjectResult)
         */
        default Builder copyObjectResult(Consumer<CopyObjectResult.Builder> copyObjectResult) {
            return copyObjectResult(CopyObjectResult.builder().applyMutation(copyObjectResult).build());
        }

        /**
         * <p>
         * If the object expiration is configured, the response includes this header.
         * </p>
         * 
         * @param expiration
         *        If the object expiration is configured, the response includes this header.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expiration(String expiration);

        /**
         * <p>
         * Version of the copied object in the destination bucket.
         * </p>
         * 
         * @param copySourceVersionId
         *        Version of the copied object in the destination bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder copySourceVersionId(String copySourceVersionId);

        /**
         * <p>
         * Version ID of the newly created copy.
         * </p>
         * 
         * @param versionId
         *        Version ID of the newly created copy.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(String serverSideEncryption);

        /**
         * <p>
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         * aws:kms).
         * </p>
         * 
         * @param serverSideEncryption
         *        The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256,
         *        aws:kms).
         * @see ServerSideEncryption
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ServerSideEncryption
         */
        Builder serverSideEncryption(ServerSideEncryption serverSideEncryption);

        /**
         * <p>
         * If server-side encryption with a customer-provided encryption key was requested, the response will include
         * this header confirming the encryption algorithm used.
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        If server-side encryption with a customer-provided encryption key was requested, the response will
         *        include this header confirming the encryption algorithm used.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * If server-side encryption with a customer-provided encryption key was requested, the response will include
         * this header to provide round-trip message integrity verification of the customer-provided encryption key.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        If server-side encryption with a customer-provided encryption key was requested, the response will
         *        include this header to provide round-trip message integrity verification of the customer-provided
         *        encryption key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        /**
         * <p>
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS)
         * symmetric customer managed key that was used for the object.
         * </p>
         * 
         * @param ssekmsKeyId
         *        If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services
         *        KMS) symmetric customer managed key that was used for the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsKeyId(String ssekmsKeyId);

        /**
         * <p>
         * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value
         * of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
         * </p>
         * 
         * @param ssekmsEncryptionContext
         *        If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
         *        value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context
         *        key-value pairs.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekmsEncryptionContext(String ssekmsEncryptionContext);

        /**
         * <p>
         * Indicates whether the copied object uses an S3 Bucket Key for server-side encryption with Amazon Web Services
         * KMS (SSE-KMS).
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Indicates whether the copied object uses an S3 Bucket Key for server-side encryption with Amazon Web
         *        Services KMS (SSE-KMS).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);

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
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private CopyObjectResult copyObjectResult;

        private String expiration;

        private String copySourceVersionId;

        private String versionId;

        private String serverSideEncryption;

        private String sseCustomerAlgorithm;

        private String sseCustomerKeyMD5;

        private String ssekmsKeyId;

        private String ssekmsEncryptionContext;

        private Boolean bucketKeyEnabled;

        private String requestCharged;

        private BuilderImpl() {
        }

        private BuilderImpl(CopyObjectResponse model) {
            super(model);
            copyObjectResult(model.copyObjectResult);
            expiration(model.expiration);
            copySourceVersionId(model.copySourceVersionId);
            versionId(model.versionId);
            serverSideEncryption(model.serverSideEncryption);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            ssekmsKeyId(model.ssekmsKeyId);
            ssekmsEncryptionContext(model.ssekmsEncryptionContext);
            bucketKeyEnabled(model.bucketKeyEnabled);
            requestCharged(model.requestCharged);
        }

        public final CopyObjectResult.Builder getCopyObjectResult() {
            return copyObjectResult != null ? copyObjectResult.toBuilder() : null;
        }

        public final void setCopyObjectResult(CopyObjectResult.BuilderImpl copyObjectResult) {
            this.copyObjectResult = copyObjectResult != null ? copyObjectResult.build() : null;
        }

        @Override
        public final Builder copyObjectResult(CopyObjectResult copyObjectResult) {
            this.copyObjectResult = copyObjectResult;
            return this;
        }

        public final String getExpiration() {
            return expiration;
        }

        public final void setExpiration(String expiration) {
            this.expiration = expiration;
        }

        @Override
        public final Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        public final String getCopySourceVersionId() {
            return copySourceVersionId;
        }

        public final void setCopySourceVersionId(String copySourceVersionId) {
            this.copySourceVersionId = copySourceVersionId;
        }

        @Override
        public final Builder copySourceVersionId(String copySourceVersionId) {
            this.copySourceVersionId = copySourceVersionId;
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

        public final String getServerSideEncryption() {
            return serverSideEncryption;
        }

        public final void setServerSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
        }

        @Override
        public final Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        @Override
        public final Builder serverSideEncryption(ServerSideEncryption serverSideEncryption) {
            this.serverSideEncryption(serverSideEncryption == null ? null : serverSideEncryption.toString());
            return this;
        }

        public final String getSseCustomerAlgorithm() {
            return sseCustomerAlgorithm;
        }

        public final void setSseCustomerAlgorithm(String sseCustomerAlgorithm) {
            this.sseCustomerAlgorithm = sseCustomerAlgorithm;
        }

        @Override
        public final Builder sseCustomerAlgorithm(String sseCustomerAlgorithm) {
            this.sseCustomerAlgorithm = sseCustomerAlgorithm;
            return this;
        }

        public final String getSseCustomerKeyMD5() {
            return sseCustomerKeyMD5;
        }

        public final void setSseCustomerKeyMD5(String sseCustomerKeyMD5) {
            this.sseCustomerKeyMD5 = sseCustomerKeyMD5;
        }

        @Override
        public final Builder sseCustomerKeyMD5(String sseCustomerKeyMD5) {
            this.sseCustomerKeyMD5 = sseCustomerKeyMD5;
            return this;
        }

        public final String getSsekmsKeyId() {
            return ssekmsKeyId;
        }

        public final void setSsekmsKeyId(String ssekmsKeyId) {
            this.ssekmsKeyId = ssekmsKeyId;
        }

        @Override
        public final Builder ssekmsKeyId(String ssekmsKeyId) {
            this.ssekmsKeyId = ssekmsKeyId;
            return this;
        }

        public final String getSsekmsEncryptionContext() {
            return ssekmsEncryptionContext;
        }

        public final void setSsekmsEncryptionContext(String ssekmsEncryptionContext) {
            this.ssekmsEncryptionContext = ssekmsEncryptionContext;
        }

        @Override
        public final Builder ssekmsEncryptionContext(String ssekmsEncryptionContext) {
            this.ssekmsEncryptionContext = ssekmsEncryptionContext;
            return this;
        }

        public final Boolean getBucketKeyEnabled() {
            return bucketKeyEnabled;
        }

        public final void setBucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
        }

        @Override
        public final Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
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

        @Override
        public CopyObjectResponse build() {
            return new CopyObjectResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
