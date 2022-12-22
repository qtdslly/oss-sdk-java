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
 * Specifies JSON as request's output serialization format.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class JSONOutput implements SdkPojo, Serializable, ToCopyableBuilder<JSONOutput.Builder, JSONOutput> {
    private static final SdkField<String> RECORD_DELIMITER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RecordDelimiter")
            .getter(getter(JSONOutput::recordDelimiter))
            .setter(setter(Builder::recordDelimiter))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RecordDelimiter")
                    .unmarshallLocationName("RecordDelimiter").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(RECORD_DELIMITER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String recordDelimiter;

    private JSONOutput(BuilderImpl builder) {
        this.recordDelimiter = builder.recordDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual records in the output. If no value is specified, Amazon S3 uses a newline
     * character ('\n').
     * </p>
     * 
     * @return The value used to separate individual records in the output. If no value is specified, Amazon S3 uses a
     *         newline character ('\n').
     */
    public final String recordDelimiter() {
        return recordDelimiter;
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
        hashCode = 31 * hashCode + Objects.hashCode(recordDelimiter());
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
        if (!(obj instanceof JSONOutput)) {
            return false;
        }
        JSONOutput other = (JSONOutput) obj;
        return Objects.equals(recordDelimiter(), other.recordDelimiter());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("JSONOutput").add("RecordDelimiter", recordDelimiter()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "RecordDelimiter":
            return Optional.ofNullable(clazz.cast(recordDelimiter()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<JSONOutput, T> g) {
        return obj -> g.apply((JSONOutput) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, JSONOutput> {
        /**
         * <p>
         * The value used to separate individual records in the output. If no value is specified, Amazon S3 uses a
         * newline character ('\n').
         * </p>
         * 
         * @param recordDelimiter
         *        The value used to separate individual records in the output. If no value is specified, Amazon S3 uses
         *        a newline character ('\n').
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder recordDelimiter(String recordDelimiter);
    }

    static final class BuilderImpl implements Builder {
        private String recordDelimiter;

        private BuilderImpl() {
        }

        private BuilderImpl(JSONOutput model) {
            recordDelimiter(model.recordDelimiter);
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

        @Override
        public JSONOutput build() {
            return new JSONOutput(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
