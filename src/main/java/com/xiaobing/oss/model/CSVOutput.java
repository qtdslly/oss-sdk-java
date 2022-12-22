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
 * Describes how uncompressed comma-separated values (CSV)-formatted results are formatted.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CSVOutput implements SdkPojo, Serializable, ToCopyableBuilder<CSVOutput.Builder, CSVOutput> {
    private static final SdkField<String> QUOTE_FIELDS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("QuoteFields")
            .getter(getter(CSVOutput::quoteFieldsAsString))
            .setter(setter(Builder::quoteFields))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QuoteFields")
                    .unmarshallLocationName("QuoteFields").build()).build();

    private static final SdkField<String> QUOTE_ESCAPE_CHARACTER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("QuoteEscapeCharacter")
            .getter(getter(CSVOutput::quoteEscapeCharacter))
            .setter(setter(Builder::quoteEscapeCharacter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QuoteEscapeCharacter")
                    .unmarshallLocationName("QuoteEscapeCharacter").build()).build();

    private static final SdkField<String> RECORD_DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RecordDelimiter")
            .getter(getter(CSVOutput::recordDelimiter))
            .setter(setter(Builder::recordDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RecordDelimiter")
                    .unmarshallLocationName("RecordDelimiter").build()).build();

    private static final SdkField<String> FIELD_DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("FieldDelimiter")
            .getter(getter(CSVOutput::fieldDelimiter))
            .setter(setter(Builder::fieldDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("FieldDelimiter")
                    .unmarshallLocationName("FieldDelimiter").build()).build();

    private static final SdkField<String> QUOTE_CHARACTER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("QuoteCharacter")
            .getter(getter(CSVOutput::quoteCharacter))
            .setter(setter(Builder::quoteCharacter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QuoteCharacter")
                    .unmarshallLocationName("QuoteCharacter").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(QUOTE_FIELDS_FIELD,
            QUOTE_ESCAPE_CHARACTER_FIELD, RECORD_DELIMITER_FIELD, FIELD_DELIMITER_FIELD, QUOTE_CHARACTER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String quoteFields;

    private final String quoteEscapeCharacter;

    private final String recordDelimiter;

    private final String fieldDelimiter;

    private final String quoteCharacter;

    private CSVOutput(BuilderImpl builder) {
        this.quoteFields = builder.quoteFields;
        this.quoteEscapeCharacter = builder.quoteEscapeCharacter;
        this.recordDelimiter = builder.recordDelimiter;
        this.fieldDelimiter = builder.fieldDelimiter;
        this.quoteCharacter = builder.quoteCharacter;
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #quoteFields} will
     * return {@link QuoteFields#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #quoteFieldsAsString}.
     * </p>
     * 
     * @return Indicates whether to use quotation marks around output fields. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALWAYS</code>: Always use quotation marks for output fields.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     *         </p>
     *         </li>
     * @see QuoteFields
     */
    public final QuoteFields quoteFields() {
        return QuoteFields.fromValue(quoteFields);
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #quoteFields} will
     * return {@link QuoteFields#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #quoteFieldsAsString}.
     * </p>
     * 
     * @return Indicates whether to use quotation marks around output fields. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALWAYS</code>: Always use quotation marks for output fields.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     *         </p>
     *         </li>
     * @see QuoteFields
     */
    public final String quoteFieldsAsString() {
        return quoteFields;
    }

    /**
     * <p>
     * The single character used for escaping the quote character inside an already escaped value.
     * </p>
     * 
     * @return The single character used for escaping the quote character inside an already escaped value.
     */
    public final String quoteEscapeCharacter() {
        return quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the output. Instead of the default value, you can
     * specify an arbitrary delimiter.
     * </p>
     * 
     * @return A single character used to separate individual records in the output. Instead of the default value, you
     *         can specify an arbitrary delimiter.
     */
    public final String recordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
     * </p>
     * 
     * @return The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
     */
    public final String fieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of the value. For example, if the value is
     * <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows: <code>" a , b "</code>.
     * </p>
     * 
     * @return A single character used for escaping when the field delimiter is part of the value. For example, if the
     *         value is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows:
     *         <code>" a , b "</code>.
     */
    public final String quoteCharacter() {
        return quoteCharacter;
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
        hashCode = 31 * hashCode + Objects.hashCode(quoteFieldsAsString());
        hashCode = 31 * hashCode + Objects.hashCode(quoteEscapeCharacter());
        hashCode = 31 * hashCode + Objects.hashCode(recordDelimiter());
        hashCode = 31 * hashCode + Objects.hashCode(fieldDelimiter());
        hashCode = 31 * hashCode + Objects.hashCode(quoteCharacter());
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
        if (!(obj instanceof CSVOutput)) {
            return false;
        }
        CSVOutput other = (CSVOutput) obj;
        return Objects.equals(quoteFieldsAsString(), other.quoteFieldsAsString())
                && Objects.equals(quoteEscapeCharacter(), other.quoteEscapeCharacter())
                && Objects.equals(recordDelimiter(), other.recordDelimiter())
                && Objects.equals(fieldDelimiter(), other.fieldDelimiter())
                && Objects.equals(quoteCharacter(), other.quoteCharacter());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CSVOutput").add("QuoteFields", quoteFieldsAsString())
                .add("QuoteEscapeCharacter", quoteEscapeCharacter()).add("RecordDelimiter", recordDelimiter())
                .add("FieldDelimiter", fieldDelimiter()).add("QuoteCharacter", quoteCharacter()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "QuoteFields":
            return Optional.ofNullable(clazz.cast(quoteFieldsAsString()));
        case "QuoteEscapeCharacter":
            return Optional.ofNullable(clazz.cast(quoteEscapeCharacter()));
        case "RecordDelimiter":
            return Optional.ofNullable(clazz.cast(recordDelimiter()));
        case "FieldDelimiter":
            return Optional.ofNullable(clazz.cast(fieldDelimiter()));
        case "QuoteCharacter":
            return Optional.ofNullable(clazz.cast(quoteCharacter()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CSVOutput, T> g) {
        return obj -> g.apply((CSVOutput) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CSVOutput> {
        /**
         * <p>
         * Indicates whether to use quotation marks around output fields.
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>ALWAYS</code>: Always use quotation marks for output fields.
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
         * </p>
         * </li>
         * </ul>
         * 
         * @param quoteFields
         *        Indicates whether to use quotation marks around output fields. </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>ALWAYS</code>: Always use quotation marks for output fields.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
         *        </p>
         *        </li>
         * @see QuoteFields
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see QuoteFields
         */
        Builder quoteFields(String quoteFields);

        /**
         * <p>
         * Indicates whether to use quotation marks around output fields.
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>ALWAYS</code>: Always use quotation marks for output fields.
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
         * </p>
         * </li>
         * </ul>
         * 
         * @param quoteFields
         *        Indicates whether to use quotation marks around output fields. </p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>ALWAYS</code>: Always use quotation marks for output fields.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
         *        </p>
         *        </li>
         * @see QuoteFields
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see QuoteFields
         */
        Builder quoteFields(QuoteFields quoteFields);

        /**
         * <p>
         * The single character used for escaping the quote character inside an already escaped value.
         * </p>
         * 
         * @param quoteEscapeCharacter
         *        The single character used for escaping the quote character inside an already escaped value.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder quoteEscapeCharacter(String quoteEscapeCharacter);

        /**
         * <p>
         * A single character used to separate individual records in the output. Instead of the default value, you can
         * specify an arbitrary delimiter.
         * </p>
         * 
         * @param recordDelimiter
         *        A single character used to separate individual records in the output. Instead of the default value,
         *        you can specify an arbitrary delimiter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder recordDelimiter(String recordDelimiter);

        /**
         * <p>
         * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
         * </p>
         * 
         * @param fieldDelimiter
         *        The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder fieldDelimiter(String fieldDelimiter);

        /**
         * <p>
         * A single character used for escaping when the field delimiter is part of the value. For example, if the value
         * is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows: <code>" a , b "</code>
         * .
         * </p>
         * 
         * @param quoteCharacter
         *        A single character used for escaping when the field delimiter is part of the value. For example, if
         *        the value is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows:
         *        <code>" a , b "</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder quoteCharacter(String quoteCharacter);
    }

    static final class BuilderImpl implements Builder {
        private String quoteFields;

        private String quoteEscapeCharacter;

        private String recordDelimiter;

        private String fieldDelimiter;

        private String quoteCharacter;

        private BuilderImpl() {
        }

        private BuilderImpl(CSVOutput model) {
            quoteFields(model.quoteFields);
            quoteEscapeCharacter(model.quoteEscapeCharacter);
            recordDelimiter(model.recordDelimiter);
            fieldDelimiter(model.fieldDelimiter);
            quoteCharacter(model.quoteCharacter);
        }

        public final String getQuoteFields() {
            return quoteFields;
        }

        public final void setQuoteFields(String quoteFields) {
            this.quoteFields = quoteFields;
        }

        @Override
        public final Builder quoteFields(String quoteFields) {
            this.quoteFields = quoteFields;
            return this;
        }

        @Override
        public final Builder quoteFields(QuoteFields quoteFields) {
            this.quoteFields(quoteFields == null ? null : quoteFields.toString());
            return this;
        }

        public final String getQuoteEscapeCharacter() {
            return quoteEscapeCharacter;
        }

        public final void setQuoteEscapeCharacter(String quoteEscapeCharacter) {
            this.quoteEscapeCharacter = quoteEscapeCharacter;
        }

        @Override
        public final Builder quoteEscapeCharacter(String quoteEscapeCharacter) {
            this.quoteEscapeCharacter = quoteEscapeCharacter;
            return this;
        }

        public final String getRecordDelimiter() {
            return recordDelimiter;
        }

        public final void setRecordDelimiter(String recordDelimiter) {
            this.recordDelimiter = recordDelimiter;
        }

        @Override
        public final Builder recordDelimiter(String recordDelimiter) {
            this.recordDelimiter = recordDelimiter;
            return this;
        }

        public final String getFieldDelimiter() {
            return fieldDelimiter;
        }

        public final void setFieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
        }

        @Override
        public final Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public final String getQuoteCharacter() {
            return quoteCharacter;
        }

        public final void setQuoteCharacter(String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
        }

        @Override
        public final Builder quoteCharacter(String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            return this;
        }

        @Override
        public CSVOutput build() {
            return new CSVOutput(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
