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
 * Describes how an uncompressed comma-separated values (CSV)-formatted input object is formatted.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CSVInput implements SdkPojo, Serializable, ToCopyableBuilder<CSVInput.Builder, CSVInput> {
    private static final SdkField<String> FILE_HEADER_INFO_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("FileHeaderInfo")
            .getter(getter(CSVInput::fileHeaderInfoAsString))
            .setter(setter(Builder::fileHeaderInfo))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("FileHeaderInfo")
                    .unmarshallLocationName("FileHeaderInfo").build()).build();

    private static final SdkField<String> COMMENTS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Comments")
            .getter(getter(CSVInput::comments))
            .setter(setter(Builder::comments))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Comments")
                    .unmarshallLocationName("Comments").build()).build();

    private static final SdkField<String> QUOTE_ESCAPE_CHARACTER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("QuoteEscapeCharacter")
            .getter(getter(CSVInput::quoteEscapeCharacter))
            .setter(setter(Builder::quoteEscapeCharacter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QuoteEscapeCharacter")
                    .unmarshallLocationName("QuoteEscapeCharacter").build()).build();

    private static final SdkField<String> RECORD_DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RecordDelimiter")
            .getter(getter(CSVInput::recordDelimiter))
            .setter(setter(Builder::recordDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RecordDelimiter")
                    .unmarshallLocationName("RecordDelimiter").build()).build();

    private static final SdkField<String> FIELD_DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("FieldDelimiter")
            .getter(getter(CSVInput::fieldDelimiter))
            .setter(setter(Builder::fieldDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("FieldDelimiter")
                    .unmarshallLocationName("FieldDelimiter").build()).build();

    private static final SdkField<String> QUOTE_CHARACTER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("QuoteCharacter")
            .getter(getter(CSVInput::quoteCharacter))
            .setter(setter(Builder::quoteCharacter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QuoteCharacter")
                    .unmarshallLocationName("QuoteCharacter").build()).build();

    private static final SdkField<Boolean> ALLOW_QUOTED_RECORD_DELIMITER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("AllowQuotedRecordDelimiter")
            .getter(getter(CSVInput::allowQuotedRecordDelimiter))
            .setter(setter(Builder::allowQuotedRecordDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AllowQuotedRecordDelimiter")
                    .unmarshallLocationName("AllowQuotedRecordDelimiter").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(FILE_HEADER_INFO_FIELD,
            COMMENTS_FIELD, QUOTE_ESCAPE_CHARACTER_FIELD, RECORD_DELIMITER_FIELD, FIELD_DELIMITER_FIELD, QUOTE_CHARACTER_FIELD,
            ALLOW_QUOTED_RECORD_DELIMITER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String fileHeaderInfo;

    private final String comments;

    private final String quoteEscapeCharacter;

    private final String recordDelimiter;

    private final String fieldDelimiter;

    private final String quoteCharacter;

    private final Boolean allowQuotedRecordDelimiter;

    private CSVInput(BuilderImpl builder) {
        this.fileHeaderInfo = builder.fileHeaderInfo;
        this.comments = builder.comments;
        this.quoteEscapeCharacter = builder.quoteEscapeCharacter;
        this.recordDelimiter = builder.recordDelimiter;
        this.fieldDelimiter = builder.fieldDelimiter;
        this.quoteCharacter = builder.quoteCharacter;
        this.allowQuotedRecordDelimiter = builder.allowQuotedRecordDelimiter;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column in an
     * expression. You can use column position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header value to identify a column in an expression
     * (<code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #fileHeaderInfo}
     * will return {@link FileHeaderInfo#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #fileHeaderInfoAsString}.
     * </p>
     * 
     * @return Describes the first line of input. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: First line is not a header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column
     *         in an expression. You can use column position (such as _1, _2, …) to indicate the column (
     *         <code>SELECT s._1 FROM OBJECT s</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
     *         expression (<code>SELECT "name" FROM OBJECT</code>).
     *         </p>
     *         </li>
     * @see FileHeaderInfo
     */
    public final FileHeaderInfo fileHeaderInfo() {
        return FileHeaderInfo.fromValue(fileHeaderInfo);
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column in an
     * expression. You can use column position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header value to identify a column in an expression
     * (<code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #fileHeaderInfo}
     * will return {@link FileHeaderInfo#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #fileHeaderInfoAsString}.
     * </p>
     * 
     * @return Describes the first line of input. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: First line is not a header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column
     *         in an expression. You can use column position (such as _1, _2, …) to indicate the column (
     *         <code>SELECT s._1 FROM OBJECT s</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
     *         expression (<code>SELECT "name" FROM OBJECT</code>).
     *         </p>
     *         </li>
     * @see FileHeaderInfo
     */
    public final String fileHeaderInfoAsString() {
        return fileHeaderInfo;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the character is present at the start of
     * that row. You can specify any character to indicate a comment line.
     * </p>
     * 
     * @return A single character used to indicate that a row should be ignored when the character is present at the
     *         start of that row. You can specify any character to indicate a comment line.
     */
    public final String comments() {
        return comments;
    }

    /**
     * <p>
     * A single character used for escaping the quotation mark character inside an already escaped value. For example,
     * the value <code>""" a , b """</code> is parsed as <code>" a , b "</code>.
     * </p>
     * 
     * @return A single character used for escaping the quotation mark character inside an already escaped value. For
     *         example, the value <code>""" a , b """</code> is parsed as <code>" a , b "</code>.
     */
    public final String quoteEscapeCharacter() {
        return quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the input. Instead of the default value, you can
     * specify an arbitrary delimiter.
     * </p>
     * 
     * @return A single character used to separate individual records in the input. Instead of the default value, you
     *         can specify an arbitrary delimiter.
     */
    public final String recordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual fields in a record. You can specify an arbitrary delimiter.
     * </p>
     * 
     * @return A single character used to separate individual fields in a record. You can specify an arbitrary
     *         delimiter.
     */
    public final String fieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of the value. For example, if the value is
     * <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows: <code>" a , b "</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: <code>"</code>
     * </p>
     * <p>
     * Ancestors: <code>CSV</code>
     * </p>
     * 
     * @return A single character used for escaping when the field delimiter is part of the value. For example, if the
     *         value is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows:
     *         <code>" a , b "</code>.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: <code>"</code>
     *         </p>
     *         <p>
     *         Ancestors: <code>CSV</code>
     */
    public final String quoteCharacter() {
        return quoteCharacter;
    }

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default
     * value is FALSE. Setting this value to TRUE may lower performance.
     * </p>
     * 
     * @return Specifies that CSV field values may contain quoted record delimiters and such records should be allowed.
     *         Default value is FALSE. Setting this value to TRUE may lower performance.
     */
    public final Boolean allowQuotedRecordDelimiter() {
        return allowQuotedRecordDelimiter;
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
        hashCode = 31 * hashCode + Objects.hashCode(fileHeaderInfoAsString());
        hashCode = 31 * hashCode + Objects.hashCode(comments());
        hashCode = 31 * hashCode + Objects.hashCode(quoteEscapeCharacter());
        hashCode = 31 * hashCode + Objects.hashCode(recordDelimiter());
        hashCode = 31 * hashCode + Objects.hashCode(fieldDelimiter());
        hashCode = 31 * hashCode + Objects.hashCode(quoteCharacter());
        hashCode = 31 * hashCode + Objects.hashCode(allowQuotedRecordDelimiter());
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
        if (!(obj instanceof CSVInput)) {
            return false;
        }
        CSVInput other = (CSVInput) obj;
        return Objects.equals(fileHeaderInfoAsString(), other.fileHeaderInfoAsString())
                && Objects.equals(comments(), other.comments())
                && Objects.equals(quoteEscapeCharacter(), other.quoteEscapeCharacter())
                && Objects.equals(recordDelimiter(), other.recordDelimiter())
                && Objects.equals(fieldDelimiter(), other.fieldDelimiter())
                && Objects.equals(quoteCharacter(), other.quoteCharacter())
                && Objects.equals(allowQuotedRecordDelimiter(), other.allowQuotedRecordDelimiter());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CSVInput").add("FileHeaderInfo", fileHeaderInfoAsString()).add("Comments", comments())
                .add("QuoteEscapeCharacter", quoteEscapeCharacter()).add("RecordDelimiter", recordDelimiter())
                .add("FieldDelimiter", fieldDelimiter()).add("QuoteCharacter", quoteCharacter())
                .add("AllowQuotedRecordDelimiter", allowQuotedRecordDelimiter()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "FileHeaderInfo":
            return Optional.ofNullable(clazz.cast(fileHeaderInfoAsString()));
        case "Comments":
            return Optional.ofNullable(clazz.cast(comments()));
        case "QuoteEscapeCharacter":
            return Optional.ofNullable(clazz.cast(quoteEscapeCharacter()));
        case "RecordDelimiter":
            return Optional.ofNullable(clazz.cast(recordDelimiter()));
        case "FieldDelimiter":
            return Optional.ofNullable(clazz.cast(fieldDelimiter()));
        case "QuoteCharacter":
            return Optional.ofNullable(clazz.cast(quoteCharacter()));
        case "AllowQuotedRecordDelimiter":
            return Optional.ofNullable(clazz.cast(allowQuotedRecordDelimiter()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CSVInput, T> g) {
        return obj -> g.apply((CSVInput) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CSVInput> {
        /**
         * <p>
         * Describes the first line of input. Valid values are:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>NONE</code>: First line is not a header.
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column in an
         * expression. You can use column position (such as _1, _2, …) to indicate the column (
         * <code>SELECT s._1 FROM OBJECT s</code>).
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
         * expression (<code>SELECT "name" FROM OBJECT</code>).
         * </p>
         * </li>
         * </ul>
         * 
         * @param fileHeaderInfo
         *        Describes the first line of input. Valid values are:</p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>NONE</code>: First line is not a header.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the
         *        column in an expression. You can use column position (such as _1, _2, …) to indicate the column (
         *        <code>SELECT s._1 FROM OBJECT s</code>).
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
         *        expression (<code>SELECT "name" FROM OBJECT</code>).
         *        </p>
         *        </li>
         * @see FileHeaderInfo
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see FileHeaderInfo
         */
        Builder fileHeaderInfo(String fileHeaderInfo);

        /**
         * <p>
         * Describes the first line of input. Valid values are:
         * </p>
         * <ul>
         * <li>
         * <p>
         * <code>NONE</code>: First line is not a header.
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the column in an
         * expression. You can use column position (such as _1, _2, …) to indicate the column (
         * <code>SELECT s._1 FROM OBJECT s</code>).
         * </p>
         * </li>
         * <li>
         * <p>
         * <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
         * expression (<code>SELECT "name" FROM OBJECT</code>).
         * </p>
         * </li>
         * </ul>
         * 
         * @param fileHeaderInfo
         *        Describes the first line of input. Valid values are:</p>
         *        <ul>
         *        <li>
         *        <p>
         *        <code>NONE</code>: First line is not a header.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>IGNORE</code>: First line is a header, but you can't use the header values to indicate the
         *        column in an expression. You can use column position (such as _1, _2, …) to indicate the column (
         *        <code>SELECT s._1 FROM OBJECT s</code>).
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <code>Use</code>: First line is a header, and you can use the header value to identify a column in an
         *        expression (<code>SELECT "name" FROM OBJECT</code>).
         *        </p>
         *        </li>
         * @see FileHeaderInfo
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see FileHeaderInfo
         */
        Builder fileHeaderInfo(FileHeaderInfo fileHeaderInfo);

        /**
         * <p>
         * A single character used to indicate that a row should be ignored when the character is present at the start
         * of that row. You can specify any character to indicate a comment line.
         * </p>
         * 
         * @param comments
         *        A single character used to indicate that a row should be ignored when the character is present at the
         *        start of that row. You can specify any character to indicate a comment line.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder comments(String comments);

        /**
         * <p>
         * A single character used for escaping the quotation mark character inside an already escaped value. For
         * example, the value <code>""" a , b """</code> is parsed as <code>" a , b "</code>.
         * </p>
         * 
         * @param quoteEscapeCharacter
         *        A single character used for escaping the quotation mark character inside an already escaped value. For
         *        example, the value <code>""" a , b """</code> is parsed as <code>" a , b "</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder quoteEscapeCharacter(String quoteEscapeCharacter);

        /**
         * <p>
         * A single character used to separate individual records in the input. Instead of the default value, you can
         * specify an arbitrary delimiter.
         * </p>
         * 
         * @param recordDelimiter
         *        A single character used to separate individual records in the input. Instead of the default value, you
         *        can specify an arbitrary delimiter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder recordDelimiter(String recordDelimiter);

        /**
         * <p>
         * A single character used to separate individual fields in a record. You can specify an arbitrary delimiter.
         * </p>
         * 
         * @param fieldDelimiter
         *        A single character used to separate individual fields in a record. You can specify an arbitrary
         *        delimiter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder fieldDelimiter(String fieldDelimiter);

        /**
         * <p>
         * A single character used for escaping when the field delimiter is part of the value. For example, if the value
         * is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows: <code>" a , b "</code>
         * .
         * </p>
         * <p>
         * Type: String
         * </p>
         * <p>
         * Default: <code>"</code>
         * </p>
         * <p>
         * Ancestors: <code>CSV</code>
         * </p>
         * 
         * @param quoteCharacter
         *        A single character used for escaping when the field delimiter is part of the value. For example, if
         *        the value is <code>a, b</code>, Amazon S3 wraps this field value in quotation marks, as follows:
         *        <code>" a , b "</code>.</p>
         *        <p>
         *        Type: String
         *        </p>
         *        <p>
         *        Default: <code>"</code>
         *        </p>
         *        <p>
         *        Ancestors: <code>CSV</code>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder quoteCharacter(String quoteCharacter);

        /**
         * <p>
         * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed.
         * Default value is FALSE. Setting this value to TRUE may lower performance.
         * </p>
         * 
         * @param allowQuotedRecordDelimiter
         *        Specifies that CSV field values may contain quoted record delimiters and such records should be
         *        allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter);
    }

    static final class BuilderImpl implements Builder {
        private String fileHeaderInfo;

        private String comments;

        private String quoteEscapeCharacter;

        private String recordDelimiter;

        private String fieldDelimiter;

        private String quoteCharacter;

        private Boolean allowQuotedRecordDelimiter;

        private BuilderImpl() {
        }

        private BuilderImpl(CSVInput model) {
            fileHeaderInfo(model.fileHeaderInfo);
            comments(model.comments);
            quoteEscapeCharacter(model.quoteEscapeCharacter);
            recordDelimiter(model.recordDelimiter);
            fieldDelimiter(model.fieldDelimiter);
            quoteCharacter(model.quoteCharacter);
            allowQuotedRecordDelimiter(model.allowQuotedRecordDelimiter);
        }

        public final String getFileHeaderInfo() {
            return fileHeaderInfo;
        }

        public final void setFileHeaderInfo(String fileHeaderInfo) {
            this.fileHeaderInfo = fileHeaderInfo;
        }

        @Override
        public final Builder fileHeaderInfo(String fileHeaderInfo) {
            this.fileHeaderInfo = fileHeaderInfo;
            return this;
        }

        @Override
        public final Builder fileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
            this.fileHeaderInfo(fileHeaderInfo == null ? null : fileHeaderInfo.toString());
            return this;
        }

        public final String getComments() {
            return comments;
        }

        public final void setComments(String comments) {
            this.comments = comments;
        }

        @Override
        public final Builder comments(String comments) {
            this.comments = comments;
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

        public final Boolean getAllowQuotedRecordDelimiter() {
            return allowQuotedRecordDelimiter;
        }

        public final void setAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
            this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
        }

        @Override
        public final Builder allowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
            this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
            return this;
        }

        @Override
        public CSVInput build() {
            return new CSVInput(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
