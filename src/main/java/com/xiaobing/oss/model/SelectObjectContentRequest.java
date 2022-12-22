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
 * <p>
 * Request to filter the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In
 * the request, along with the SQL expression, you must specify a data serialization format (JSON or CSV) of the object.
 * Amazon S3 uses this to parse object data into records. It returns only records that match the specified SQL
 * expression. You must also specify the data serialization format for the response. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html">S3Select API Documentation</a>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class SelectObjectContentRequest extends S3Request implements
        ToCopyableBuilder<SelectObjectContentRequest.Builder, SelectObjectContentRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(SelectObjectContentRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(SelectObjectContentRequest::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.GREEDY_PATH).locationName("Key")
                    .unmarshallLocationName("Key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerAlgorithm")
            .getter(getter(SelectObjectContentRequest::sseCustomerAlgorithm))
            .setter(setter(Builder::sseCustomerAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-algorithm")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-algorithm").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKey")
            .getter(getter(SelectObjectContentRequest::sseCustomerKey))
            .setter(setter(Builder::sseCustomerKey))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key").build()).build();

    private static final SdkField<String> SSE_CUSTOMER_KEY_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("SSECustomerKeyMD5")
            .getter(getter(SelectObjectContentRequest::sseCustomerKeyMD5))
            .setter(setter(Builder::sseCustomerKeyMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER)
                    .locationName("x-amz-server-side-encryption-customer-key-MD5")
                    .unmarshallLocationName("x-amz-server-side-encryption-customer-key-MD5").build()).build();

    private static final SdkField<String> EXPRESSION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Expression")
            .getter(getter(SelectObjectContentRequest::expression))
            .setter(setter(Builder::expression))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Expression")
                    .unmarshallLocationName("Expression").build()).build();

    private static final SdkField<String> EXPRESSION_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpressionType")
            .getter(getter(SelectObjectContentRequest::expressionTypeAsString))
            .setter(setter(Builder::expressionType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ExpressionType")
                    .unmarshallLocationName("ExpressionType").build()).build();

    private static final SdkField<RequestProgress> REQUEST_PROGRESS_FIELD = SdkField
            .<RequestProgress> builder(MarshallingType.SDK_POJO)
            .memberName("RequestProgress")
            .getter(getter(SelectObjectContentRequest::requestProgress))
            .setter(setter(Builder::requestProgress))
            .constructor(RequestProgress::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RequestProgress")
                    .unmarshallLocationName("RequestProgress").build()).build();

    private static final SdkField<InputSerialization> INPUT_SERIALIZATION_FIELD = SdkField
            .<InputSerialization> builder(MarshallingType.SDK_POJO)
            .memberName("InputSerialization")
            .getter(getter(SelectObjectContentRequest::inputSerialization))
            .setter(setter(Builder::inputSerialization))
            .constructor(InputSerialization::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("InputSerialization")
                    .unmarshallLocationName("InputSerialization").build()).build();

    private static final SdkField<OutputSerialization> OUTPUT_SERIALIZATION_FIELD = SdkField
            .<OutputSerialization> builder(MarshallingType.SDK_POJO)
            .memberName("OutputSerialization")
            .getter(getter(SelectObjectContentRequest::outputSerialization))
            .setter(setter(Builder::outputSerialization))
            .constructor(OutputSerialization::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OutputSerialization")
                    .unmarshallLocationName("OutputSerialization").build()).build();

    private static final SdkField<ScanRange> SCAN_RANGE_FIELD = SdkField
            .<ScanRange> builder(MarshallingType.SDK_POJO)
            .memberName("ScanRange")
            .getter(getter(SelectObjectContentRequest::scanRange))
            .setter(setter(Builder::scanRange))
            .constructor(ScanRange::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ScanRange")
                    .unmarshallLocationName("ScanRange").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(SelectObjectContentRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, KEY_FIELD,
            SSE_CUSTOMER_ALGORITHM_FIELD, SSE_CUSTOMER_KEY_FIELD, SSE_CUSTOMER_KEY_MD5_FIELD, EXPRESSION_FIELD,
            EXPRESSION_TYPE_FIELD, REQUEST_PROGRESS_FIELD, INPUT_SERIALIZATION_FIELD, OUTPUT_SERIALIZATION_FIELD,
            SCAN_RANGE_FIELD, EXPECTED_BUCKET_OWNER_FIELD));

    private final String bucket;

    private final String key;

    private final String sseCustomerAlgorithm;

    private final String sseCustomerKey;

    private final String sseCustomerKeyMD5;

    private final String expression;

    private final String expressionType;

    private final RequestProgress requestProgress;

    private final InputSerialization inputSerialization;

    private final OutputSerialization outputSerialization;

    private final ScanRange scanRange;

    private final String expectedBucketOwner;

    private SelectObjectContentRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.sseCustomerAlgorithm = builder.sseCustomerAlgorithm;
        this.sseCustomerKey = builder.sseCustomerKey;
        this.sseCustomerKeyMD5 = builder.sseCustomerKeyMD5;
        this.expression = builder.expression;
        this.expressionType = builder.expressionType;
        this.requestProgress = builder.requestProgress;
        this.inputSerialization = builder.inputSerialization;
        this.outputSerialization = builder.outputSerialization;
        this.scanRange = builder.scanRange;
        this.expectedBucketOwner = builder.expectedBucketOwner;
    }

    /**
     * <p>
     * The S3 bucket.
     * </p>
     * 
     * @return The S3 bucket.
     */
    public final String bucket() {
        return bucket;
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
     * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the
     * object was created using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when
     *         the object was created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerAlgorithm() {
        return sseCustomerAlgorithm;
    }

    /**
     * <p>
     * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created
     * using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
     *         created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerKey() {
        return sseCustomerKey;
    }

    /**
     * <p>
     * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
     * created using a checksum algorithm. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object
     *         was created using a checksum algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting
     *         data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String sseCustomerKeyMD5() {
        return sseCustomerKeyMD5;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     * 
     * @return The expression that is used to query the object.
     */
    public final String expression() {
        return expression;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #expressionType}
     * will return {@link ExpressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #expressionTypeAsString}.
     * </p>
     * 
     * @return The type of the provided expression (for example, SQL).
     * @see ExpressionType
     */
    public final ExpressionType expressionType() {
        return ExpressionType.fromValue(expressionType);
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #expressionType}
     * will return {@link ExpressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #expressionTypeAsString}.
     * </p>
     * 
     * @return The type of the provided expression (for example, SQL).
     * @see ExpressionType
     */
    public final String expressionTypeAsString() {
        return expressionType;
    }

    /**
     * <p>
     * Specifies if periodic request progress information should be enabled.
     * </p>
     * 
     * @return Specifies if periodic request progress information should be enabled.
     */
    public final RequestProgress requestProgress() {
        return requestProgress;
    }

    /**
     * <p>
     * Describes the format of the data in the object that is being queried.
     * </p>
     * 
     * @return Describes the format of the data in the object that is being queried.
     */
    public final InputSerialization inputSerialization() {
        return inputSerialization;
    }

    /**
     * <p>
     * Describes the format of the data that you want Amazon S3 to return in response.
     * </p>
     * 
     * @return Describes the format of the data that you want Amazon S3 to return in response.
     */
    public final OutputSerialization outputSerialization() {
        return outputSerialization;
    }

    /**
     * <p>
     * Specifies the byte range of the object to get the records from. A record is processed when its first byte is
     * contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616,
     * Section 14.35.1 about how to specify the start and end of the range.
     * </p>
     * <p>
     * <code>ScanRange</code>may be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code> - process
     * only the records starting between the bytes 50 and 100 (inclusive, counting from zero)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> - process only the records starting
     * after the byte 50
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> - process only the records within the
     * last 50 bytes of the file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the byte range of the object to get the records from. A record is processed when its first byte
     *         is contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC
     *         2616, Section 14.35.1 about how to specify the start and end of the range.</p>
     *         <p>
     *         <code>ScanRange</code>may be used in the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code> -
     *         process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> - process only the records
     *         starting after the byte 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> - process only the records
     *         within the last 50 bytes of the file.
     *         </p>
     *         </li>
     */
    public final ScanRange scanRange() {
        return scanRange;
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
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerAlgorithm());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKey());
        hashCode = 31 * hashCode + Objects.hashCode(sseCustomerKeyMD5());
        hashCode = 31 * hashCode + Objects.hashCode(expression());
        hashCode = 31 * hashCode + Objects.hashCode(expressionTypeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(requestProgress());
        hashCode = 31 * hashCode + Objects.hashCode(inputSerialization());
        hashCode = 31 * hashCode + Objects.hashCode(outputSerialization());
        hashCode = 31 * hashCode + Objects.hashCode(scanRange());
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
        if (!(obj instanceof SelectObjectContentRequest)) {
            return false;
        }
        SelectObjectContentRequest other = (SelectObjectContentRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(key(), other.key())
                && Objects.equals(sseCustomerAlgorithm(), other.sseCustomerAlgorithm())
                && Objects.equals(sseCustomerKey(), other.sseCustomerKey())
                && Objects.equals(sseCustomerKeyMD5(), other.sseCustomerKeyMD5())
                && Objects.equals(expression(), other.expression())
                && Objects.equals(expressionTypeAsString(), other.expressionTypeAsString())
                && Objects.equals(requestProgress(), other.requestProgress())
                && Objects.equals(inputSerialization(), other.inputSerialization())
                && Objects.equals(outputSerialization(), other.outputSerialization())
                && Objects.equals(scanRange(), other.scanRange())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("SelectObjectContentRequest").add("Bucket", bucket()).add("Key", key())
                .add("SSECustomerAlgorithm", sseCustomerAlgorithm())
                .add("SSECustomerKey", sseCustomerKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("SSECustomerKeyMD5", sseCustomerKeyMD5()).add("Expression", expression())
                .add("ExpressionType", expressionTypeAsString()).add("RequestProgress", requestProgress())
                .add("InputSerialization", inputSerialization()).add("OutputSerialization", outputSerialization())
                .add("ScanRange", scanRange()).add("ExpectedBucketOwner", expectedBucketOwner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "SSECustomerAlgorithm":
            return Optional.ofNullable(clazz.cast(sseCustomerAlgorithm()));
        case "SSECustomerKey":
            return Optional.ofNullable(clazz.cast(sseCustomerKey()));
        case "SSECustomerKeyMD5":
            return Optional.ofNullable(clazz.cast(sseCustomerKeyMD5()));
        case "Expression":
            return Optional.ofNullable(clazz.cast(expression()));
        case "ExpressionType":
            return Optional.ofNullable(clazz.cast(expressionTypeAsString()));
        case "RequestProgress":
            return Optional.ofNullable(clazz.cast(requestProgress()));
        case "InputSerialization":
            return Optional.ofNullable(clazz.cast(inputSerialization()));
        case "OutputSerialization":
            return Optional.ofNullable(clazz.cast(outputSerialization()));
        case "ScanRange":
            return Optional.ofNullable(clazz.cast(scanRange()));
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

    private static <T> Function<Object, T> getter(Function<SelectObjectContentRequest, T> g) {
        return obj -> g.apply((SelectObjectContentRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, SelectObjectContentRequest> {
        /**
         * <p>
         * The S3 bucket.
         * </p>
         * 
         * @param bucket
         *        The S3 bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

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
         * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the
         * object was created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerAlgorithm
         *        The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only
         *        when the object was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerAlgorithm(String sseCustomerAlgorithm);

        /**
         * <p>
         * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
         * created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerKey
         *        The server-side encryption (SSE) customer managed key. This parameter is needed only when the object
         *        was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKey(String sseCustomerKey);

        /**
         * <p>
         * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was
         * created using a checksum algorithm. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param sseCustomerKeyMD5
         *        The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the
         *        object was created using a checksum algorithm. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"
         *        >Protecting data using SSE-C keys</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sseCustomerKeyMD5(String sseCustomerKeyMD5);

        /**
         * <p>
         * The expression that is used to query the object.
         * </p>
         * 
         * @param expression
         *        The expression that is used to query the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expression(String expression);

        /**
         * <p>
         * The type of the provided expression (for example, SQL).
         * </p>
         * 
         * @param expressionType
         *        The type of the provided expression (for example, SQL).
         * @see ExpressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpressionType
         */
        Builder expressionType(String expressionType);

        /**
         * <p>
         * The type of the provided expression (for example, SQL).
         * </p>
         * 
         * @param expressionType
         *        The type of the provided expression (for example, SQL).
         * @see ExpressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpressionType
         */
        Builder expressionType(ExpressionType expressionType);

        /**
         * <p>
         * Specifies if periodic request progress information should be enabled.
         * </p>
         * 
         * @param requestProgress
         *        Specifies if periodic request progress information should be enabled.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder requestProgress(RequestProgress requestProgress);

        /**
         * <p>
         * Specifies if periodic request progress information should be enabled.
         * </p>
         * This is a convenience method that creates an instance of the {@link RequestProgress.Builder} avoiding the
         * need to create one manually via {@link RequestProgress#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link RequestProgress.Builder#build()} is called immediately and its
         * result is passed to {@link #requestProgress(RequestProgress)}.
         * 
         * @param requestProgress
         *        a consumer that will call methods on {@link RequestProgress.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #requestProgress(RequestProgress)
         */
        default Builder requestProgress(Consumer<RequestProgress.Builder> requestProgress) {
            return requestProgress(RequestProgress.builder().applyMutation(requestProgress).build());
        }

        /**
         * <p>
         * Describes the format of the data in the object that is being queried.
         * </p>
         * 
         * @param inputSerialization
         *        Describes the format of the data in the object that is being queried.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder inputSerialization(InputSerialization inputSerialization);

        /**
         * <p>
         * Describes the format of the data in the object that is being queried.
         * </p>
         * This is a convenience method that creates an instance of the {@link InputSerialization.Builder} avoiding the
         * need to create one manually via {@link InputSerialization#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InputSerialization.Builder#build()} is called immediately and its
         * result is passed to {@link #inputSerialization(InputSerialization)}.
         * 
         * @param inputSerialization
         *        a consumer that will call methods on {@link InputSerialization.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #inputSerialization(InputSerialization)
         */
        default Builder inputSerialization(Consumer<InputSerialization.Builder> inputSerialization) {
            return inputSerialization(InputSerialization.builder().applyMutation(inputSerialization).build());
        }

        /**
         * <p>
         * Describes the format of the data that you want Amazon S3 to return in response.
         * </p>
         * 
         * @param outputSerialization
         *        Describes the format of the data that you want Amazon S3 to return in response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder outputSerialization(OutputSerialization outputSerialization);

        /**
         * <p>
         * Describes the format of the data that you want Amazon S3 to return in response.
         * </p>
         * This is a convenience method that creates an instance of the {@link OutputSerialization.Builder} avoiding the
         * need to create one manually via {@link OutputSerialization#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link OutputSerialization.Builder#build()} is called immediately and
         * its result is passed to {@link #outputSerialization(OutputSerialization)}.
         * 
         * @param outputSerialization
         *        a consumer that will call methods on {@link OutputSerialization.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #outputSerialization(OutputSerialization)
         */
        default Builder outputSerialization(Consumer<OutputSerialization.Builder> outputSerialization) {
            return outputSerialization(OutputSerialization.builder().applyMutation(outputSerialization).build());
        }

        /**
         * <p>
         * Specifies the byte range of the object to get the records from. A record is processed when its first byte is
         * contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616,
         * Section 14.35.1 about how to specify the start and end of the range.
         * </p>
         * <p>
         * <code>ScanRange</code>may be used in the following ways:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code> -
         * process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> - process only the records
         * starting after the byte 50
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> - process only the records within
         * the last 50 bytes of the file.
         * </p>
         * </li>
         * </ul>
         * 
         * @param scanRange
         *        Specifies the byte range of the object to get the records from. A record is processed when its first
         *        byte is contained by the range. This parameter is optional, but when specified, it must not be empty.
         *        See RFC 2616, Section 14.35.1 about how to specify the start and end of the range.</p>
         *        <p>
         *        <code>ScanRange</code>may be used in the following ways:
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code>
         *        - process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> - process only the
         *        records starting after the byte 50
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> - process only the records
         *        within the last 50 bytes of the file.
         *        </p>
         *        </li>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder scanRange(ScanRange scanRange);

        /**
         * <p>
         * Specifies the byte range of the object to get the records from. A record is processed when its first byte is
         * contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616,
         * Section 14.35.1 about how to specify the start and end of the range.
         * </p>
         * <p>
         * <code>ScanRange</code>may be used in the following ways:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt;</code> -
         * process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> - process only the records
         * starting after the byte 50
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> - process only the records within
         * the last 50 bytes of the file.
         * </p>
         * </li>
         * </ul>
         * This is a convenience method that creates an instance of the {@link ScanRange.Builder} avoiding the need to
         * create one manually via {@link ScanRange#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ScanRange.Builder#build()} is called immediately and its result
         * is passed to {@link #scanRange(ScanRange)}.
         * 
         * @param scanRange
         *        a consumer that will call methods on {@link ScanRange.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #scanRange(ScanRange)
         */
        default Builder scanRange(Consumer<ScanRange.Builder> scanRange) {
            return scanRange(ScanRange.builder().applyMutation(scanRange).build());
        }

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

        private String key;

        private String sseCustomerAlgorithm;

        private String sseCustomerKey;

        private String sseCustomerKeyMD5;

        private String expression;

        private String expressionType;

        private RequestProgress requestProgress;

        private InputSerialization inputSerialization;

        private OutputSerialization outputSerialization;

        private ScanRange scanRange;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(SelectObjectContentRequest model) {
            super(model);
            bucket(model.bucket);
            key(model.key);
            sseCustomerAlgorithm(model.sseCustomerAlgorithm);
            sseCustomerKey(model.sseCustomerKey);
            sseCustomerKeyMD5(model.sseCustomerKeyMD5);
            expression(model.expression);
            expressionType(model.expressionType);
            requestProgress(model.requestProgress);
            inputSerialization(model.inputSerialization);
            outputSerialization(model.outputSerialization);
            scanRange(model.scanRange);
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

        public final String getSseCustomerKey() {
            return sseCustomerKey;
        }

        public final void setSseCustomerKey(String sseCustomerKey) {
            this.sseCustomerKey = sseCustomerKey;
        }

        @Override
        public final Builder sseCustomerKey(String sseCustomerKey) {
            this.sseCustomerKey = sseCustomerKey;
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

        public final String getExpression() {
            return expression;
        }

        public final void setExpression(String expression) {
            this.expression = expression;
        }

        @Override
        public final Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public final String getExpressionType() {
            return expressionType;
        }

        public final void setExpressionType(String expressionType) {
            this.expressionType = expressionType;
        }

        @Override
        public final Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        @Override
        public final Builder expressionType(ExpressionType expressionType) {
            this.expressionType(expressionType == null ? null : expressionType.toString());
            return this;
        }

        public final RequestProgress.Builder getRequestProgress() {
            return requestProgress != null ? requestProgress.toBuilder() : null;
        }

        public final void setRequestProgress(RequestProgress.BuilderImpl requestProgress) {
            this.requestProgress = requestProgress != null ? requestProgress.build() : null;
        }

        @Override
        public final Builder requestProgress(RequestProgress requestProgress) {
            this.requestProgress = requestProgress;
            return this;
        }

        public final InputSerialization.Builder getInputSerialization() {
            return inputSerialization != null ? inputSerialization.toBuilder() : null;
        }

        public final void setInputSerialization(InputSerialization.BuilderImpl inputSerialization) {
            this.inputSerialization = inputSerialization != null ? inputSerialization.build() : null;
        }

        @Override
        public final Builder inputSerialization(InputSerialization inputSerialization) {
            this.inputSerialization = inputSerialization;
            return this;
        }

        public final OutputSerialization.Builder getOutputSerialization() {
            return outputSerialization != null ? outputSerialization.toBuilder() : null;
        }

        public final void setOutputSerialization(OutputSerialization.BuilderImpl outputSerialization) {
            this.outputSerialization = outputSerialization != null ? outputSerialization.build() : null;
        }

        @Override
        public final Builder outputSerialization(OutputSerialization outputSerialization) {
            this.outputSerialization = outputSerialization;
            return this;
        }

        public final ScanRange.Builder getScanRange() {
            return scanRange != null ? scanRange.toBuilder() : null;
        }

        public final void setScanRange(ScanRange.BuilderImpl scanRange) {
            this.scanRange = scanRange != null ? scanRange.build() : null;
        }

        @Override
        public final Builder scanRange(ScanRange scanRange) {
            this.scanRange = scanRange;
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
        public SelectObjectContentRequest build() {
            return new SelectObjectContentRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
