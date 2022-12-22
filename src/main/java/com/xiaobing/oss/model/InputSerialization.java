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
 * Describes the serialization format of the object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InputSerialization implements SdkPojo, Serializable,
        ToCopyableBuilder<InputSerialization.Builder, InputSerialization> {
    private static final SdkField<CSVInput> CSV_FIELD = SdkField
            .<CSVInput> builder(MarshallingType.SDK_POJO)
            .memberName("CSV")
            .getter(getter(InputSerialization::csv))
            .setter(setter(Builder::csv))
            .constructor(CSVInput::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CSV").unmarshallLocationName("CSV")
                    .build()).build();

    private static final SdkField<String> COMPRESSION_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("CompressionType")
            .getter(getter(InputSerialization::compressionTypeAsString))
            .setter(setter(Builder::compressionType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CompressionType")
                    .unmarshallLocationName("CompressionType").build()).build();

    private static final SdkField<JSONInput> JSON_FIELD = SdkField
            .<JSONInput> builder(MarshallingType.SDK_POJO)
            .memberName("JSON")
            .getter(getter(InputSerialization::json))
            .setter(setter(Builder::json))
            .constructor(JSONInput::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("JSON")
                    .unmarshallLocationName("JSON").build()).build();

    private static final SdkField<ParquetInput> PARQUET_FIELD = SdkField
            .<ParquetInput> builder(MarshallingType.SDK_POJO)
            .memberName("Parquet")
            .getter(getter(InputSerialization::parquet))
            .setter(setter(Builder::parquet))
            .constructor(ParquetInput::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Parquet")
                    .unmarshallLocationName("Parquet").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(CSV_FIELD,
            COMPRESSION_TYPE_FIELD, JSON_FIELD, PARQUET_FIELD));

    private static final long serialVersionUID = 1L;

    private final CSVInput csv;

    private final String compressionType;

    private final JSONInput json;

    private final ParquetInput parquet;

    private InputSerialization(BuilderImpl builder) {
        this.csv = builder.csv;
        this.compressionType = builder.compressionType;
        this.json = builder.json;
        this.parquet = builder.parquet;
    }

    /**
     * <p>
     * Describes the serialization of a CSV-encoded object.
     * </p>
     * 
     * @return Describes the serialization of a CSV-encoded object.
     */
    public final CSVInput csv() {
        return csv;
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #compressionType}
     * will return {@link CompressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #compressionTypeAsString}.
     * </p>
     * 
     * @return Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
     * @see CompressionType
     */
    public final CompressionType compressionType() {
        return CompressionType.fromValue(compressionType);
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #compressionType}
     * will return {@link CompressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #compressionTypeAsString}.
     * </p>
     * 
     * @return Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
     * @see CompressionType
     */
    public final String compressionTypeAsString() {
        return compressionType;
    }

    /**
     * <p>
     * Specifies JSON as object's input serialization format.
     * </p>
     * 
     * @return Specifies JSON as object's input serialization format.
     */
    public final JSONInput json() {
        return json;
    }

    /**
     * <p>
     * Specifies Parquet as object's input serialization format.
     * </p>
     * 
     * @return Specifies Parquet as object's input serialization format.
     */
    public final ParquetInput parquet() {
        return parquet;
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
        hashCode = 31 * hashCode + Objects.hashCode(csv());
        hashCode = 31 * hashCode + Objects.hashCode(compressionTypeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(json());
        hashCode = 31 * hashCode + Objects.hashCode(parquet());
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
        if (!(obj instanceof InputSerialization)) {
            return false;
        }
        InputSerialization other = (InputSerialization) obj;
        return Objects.equals(csv(), other.csv()) && Objects.equals(compressionTypeAsString(), other.compressionTypeAsString())
                && Objects.equals(json(), other.json()) && Objects.equals(parquet(), other.parquet());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("InputSerialization").add("CSV", csv()).add("CompressionType", compressionTypeAsString())
                .add("JSON", json()).add("Parquet", parquet()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "CSV":
            return Optional.ofNullable(clazz.cast(csv()));
        case "CompressionType":
            return Optional.ofNullable(clazz.cast(compressionTypeAsString()));
        case "JSON":
            return Optional.ofNullable(clazz.cast(json()));
        case "Parquet":
            return Optional.ofNullable(clazz.cast(parquet()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InputSerialization, T> g) {
        return obj -> g.apply((InputSerialization) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InputSerialization> {
        /**
         * <p>
         * Describes the serialization of a CSV-encoded object.
         * </p>
         * 
         * @param csv
         *        Describes the serialization of a CSV-encoded object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder csv(CSVInput csv);

        /**
         * <p>
         * Describes the serialization of a CSV-encoded object.
         * </p>
         * This is a convenience method that creates an instance of the {@link CSVInput.Builder} avoiding the need to
         * create one manually via {@link CSVInput#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link CSVInput.Builder#build()} is called immediately and its result is
         * passed to {@link #csv(CSVInput)}.
         * 
         * @param csv
         *        a consumer that will call methods on {@link CSVInput.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #csv(CSVInput)
         */
        default Builder csv(Consumer<CSVInput.Builder> csv) {
            return csv(CSVInput.builder().applyMutation(csv).build());
        }

        /**
         * <p>
         * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
         * </p>
         * 
         * @param compressionType
         *        Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
         * @see CompressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see CompressionType
         */
        Builder compressionType(String compressionType);

        /**
         * <p>
         * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
         * </p>
         * 
         * @param compressionType
         *        Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
         * @see CompressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see CompressionType
         */
        Builder compressionType(CompressionType compressionType);

        /**
         * <p>
         * Specifies JSON as object's input serialization format.
         * </p>
         * 
         * @param json
         *        Specifies JSON as object's input serialization format.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder json(JSONInput json);

        /**
         * <p>
         * Specifies JSON as object's input serialization format.
         * </p>
         * This is a convenience method that creates an instance of the {@link JSONInput.Builder} avoiding the need to
         * create one manually via {@link JSONInput#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link JSONInput.Builder#build()} is called immediately and its result
         * is passed to {@link #json(JSONInput)}.
         * 
         * @param json
         *        a consumer that will call methods on {@link JSONInput.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #json(JSONInput)
         */
        default Builder json(Consumer<JSONInput.Builder> json) {
            return json(JSONInput.builder().applyMutation(json).build());
        }

        /**
         * <p>
         * Specifies Parquet as object's input serialization format.
         * </p>
         * 
         * @param parquet
         *        Specifies Parquet as object's input serialization format.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parquet(ParquetInput parquet);

        /**
         * <p>
         * Specifies Parquet as object's input serialization format.
         * </p>
         * This is a convenience method that creates an instance of the {@link ParquetInput.Builder} avoiding the need
         * to create one manually via {@link ParquetInput#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ParquetInput.Builder#build()} is called immediately and its
         * result is passed to {@link #parquet(ParquetInput)}.
         * 
         * @param parquet
         *        a consumer that will call methods on {@link ParquetInput.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #parquet(ParquetInput)
         */
        default Builder parquet(Consumer<ParquetInput.Builder> parquet) {
            return parquet(ParquetInput.builder().applyMutation(parquet).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private CSVInput csv;

        private String compressionType;

        private JSONInput json;

        private ParquetInput parquet;

        private BuilderImpl() {
        }

        private BuilderImpl(InputSerialization model) {
            csv(model.csv);
            compressionType(model.compressionType);
            json(model.json);
            parquet(model.parquet);
        }

        public final CSVInput.Builder getCsv() {
            return csv != null ? csv.toBuilder() : null;
        }

        public final void setCsv(CSVInput.BuilderImpl csv) {
            this.csv = csv != null ? csv.build() : null;
        }

        @Override
        public final Builder csv(CSVInput csv) {
            this.csv = csv;
            return this;
        }

        public final String getCompressionType() {
            return compressionType;
        }

        public final void setCompressionType(String compressionType) {
            this.compressionType = compressionType;
        }

        @Override
        public final Builder compressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        @Override
        public final Builder compressionType(CompressionType compressionType) {
            this.compressionType(compressionType == null ? null : compressionType.toString());
            return this;
        }

        public final JSONInput.Builder getJson() {
            return json != null ? json.toBuilder() : null;
        }

        public final void setJson(JSONInput.BuilderImpl json) {
            this.json = json != null ? json.build() : null;
        }

        @Override
        public final Builder json(JSONInput json) {
            this.json = json;
            return this;
        }

        public final ParquetInput.Builder getParquet() {
            return parquet != null ? parquet.toBuilder() : null;
        }

        public final void setParquet(ParquetInput.BuilderImpl parquet) {
            this.parquet = parquet != null ? parquet.build() : null;
        }

        @Override
        public final Builder parquet(ParquetInput parquet) {
            this.parquet = parquet;
            return this;
        }

        @Override
        public InputSerialization build() {
            return new InputSerialization(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
