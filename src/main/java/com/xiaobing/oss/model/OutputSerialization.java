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
 * Describes how results of the Select job are serialized.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class OutputSerialization implements SdkPojo, Serializable,
        ToCopyableBuilder<OutputSerialization.Builder, OutputSerialization> {
    private static final SdkField<CSVOutput> CSV_FIELD = SdkField
            .<CSVOutput> builder(MarshallingType.SDK_POJO)
            .memberName("CSV")
            .getter(getter(OutputSerialization::csv))
            .setter(setter(Builder::csv))
            .constructor(CSVOutput::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CSV").unmarshallLocationName("CSV")
                    .build()).build();

    private static final SdkField<JSONOutput> JSON_FIELD = SdkField
            .<JSONOutput> builder(MarshallingType.SDK_POJO)
            .memberName("JSON")
            .getter(getter(OutputSerialization::json))
            .setter(setter(Builder::json))
            .constructor(JSONOutput::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("JSON")
                    .unmarshallLocationName("JSON").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(CSV_FIELD, JSON_FIELD));

    private static final long serialVersionUID = 1L;

    private final CSVOutput csv;

    private final JSONOutput json;

    private OutputSerialization(BuilderImpl builder) {
        this.csv = builder.csv;
        this.json = builder.json;
    }

    /**
     * <p>
     * Describes the serialization of CSV-encoded Select results.
     * </p>
     * 
     * @return Describes the serialization of CSV-encoded Select results.
     */
    public final CSVOutput csv() {
        return csv;
    }

    /**
     * <p>
     * Specifies JSON as request's output serialization format.
     * </p>
     * 
     * @return Specifies JSON as request's output serialization format.
     */
    public final JSONOutput json() {
        return json;
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
        hashCode = 31 * hashCode + Objects.hashCode(json());
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
        if (!(obj instanceof OutputSerialization)) {
            return false;
        }
        OutputSerialization other = (OutputSerialization) obj;
        return Objects.equals(csv(), other.csv()) && Objects.equals(json(), other.json());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("OutputSerialization").add("CSV", csv()).add("JSON", json()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "CSV":
            return Optional.ofNullable(clazz.cast(csv()));
        case "JSON":
            return Optional.ofNullable(clazz.cast(json()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<OutputSerialization, T> g) {
        return obj -> g.apply((OutputSerialization) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, OutputSerialization> {
        /**
         * <p>
         * Describes the serialization of CSV-encoded Select results.
         * </p>
         * 
         * @param csv
         *        Describes the serialization of CSV-encoded Select results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder csv(CSVOutput csv);

        /**
         * <p>
         * Describes the serialization of CSV-encoded Select results.
         * </p>
         * This is a convenience method that creates an instance of the {@link CSVOutput.Builder} avoiding the need to
         * create one manually via {@link CSVOutput#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link CSVOutput.Builder#build()} is called immediately and its result
         * is passed to {@link #csv(CSVOutput)}.
         * 
         * @param csv
         *        a consumer that will call methods on {@link CSVOutput.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #csv(CSVOutput)
         */
        default Builder csv(Consumer<CSVOutput.Builder> csv) {
            return csv(CSVOutput.builder().applyMutation(csv).build());
        }

        /**
         * <p>
         * Specifies JSON as request's output serialization format.
         * </p>
         * 
         * @param json
         *        Specifies JSON as request's output serialization format.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder json(JSONOutput json);

        /**
         * <p>
         * Specifies JSON as request's output serialization format.
         * </p>
         * This is a convenience method that creates an instance of the {@link JSONOutput.Builder} avoiding the need to
         * create one manually via {@link JSONOutput#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link JSONOutput.Builder#build()} is called immediately and its result
         * is passed to {@link #json(JSONOutput)}.
         * 
         * @param json
         *        a consumer that will call methods on {@link JSONOutput.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #json(JSONOutput)
         */
        default Builder json(Consumer<JSONOutput.Builder> json) {
            return json(JSONOutput.builder().applyMutation(json).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private CSVOutput csv;

        private JSONOutput json;

        private BuilderImpl() {
        }

        private BuilderImpl(OutputSerialization model) {
            csv(model.csv);
            json(model.json);
        }

        public final CSVOutput.Builder getCsv() {
            return csv != null ? csv.toBuilder() : null;
        }

        public final void setCsv(CSVOutput.BuilderImpl csv) {
            this.csv = csv != null ? csv.build() : null;
        }

        @Override
        public final Builder csv(CSVOutput csv) {
            this.csv = csv;
            return this;
        }

        public final JSONOutput.Builder getJson() {
            return json != null ? json.toBuilder() : null;
        }

        public final void setJson(JSONOutput.BuilderImpl json) {
            this.json = json != null ? json.build() : null;
        }

        @Override
        public final Builder json(JSONOutput json) {
            this.json = json;
            return this;
        }

        @Override
        public OutputSerialization build() {
            return new OutputSerialization(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
