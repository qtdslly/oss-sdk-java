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
 * Specifies JSON as object's input serialization format.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class JSONInput implements SdkPojo, Serializable, ToCopyableBuilder<JSONInput.Builder, JSONInput> {
    private static final SdkField<String> TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Type")
            .getter(getter(JSONInput::typeAsString))
            .setter(setter(Builder::type))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Type")
                    .unmarshallLocationName("Type").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(TYPE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String type;

    private JSONInput(BuilderImpl builder) {
        this.type = builder.type;
    }

    /**
     * <p>
     * The type of JSON. Valid values: Document, Lines.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link JSONType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return The type of JSON. Valid values: Document, Lines.
     * @see JSONType
     */
    public final JSONType type() {
        return JSONType.fromValue(type);
    }

    /**
     * <p>
     * The type of JSON. Valid values: Document, Lines.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link JSONType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return The type of JSON. Valid values: Document, Lines.
     * @see JSONType
     */
    public final String typeAsString() {
        return type;
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
        hashCode = 31 * hashCode + Objects.hashCode(typeAsString());
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
        if (!(obj instanceof JSONInput)) {
            return false;
        }
        JSONInput other = (JSONInput) obj;
        return Objects.equals(typeAsString(), other.typeAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("JSONInput").add("Type", typeAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Type":
            return Optional.ofNullable(clazz.cast(typeAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<JSONInput, T> g) {
        return obj -> g.apply((JSONInput) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, JSONInput> {
        /**
         * <p>
         * The type of JSON. Valid values: Document, Lines.
         * </p>
         * 
         * @param type
         *        The type of JSON. Valid values: Document, Lines.
         * @see JSONType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see JSONType
         */
        Builder type(String type);

        /**
         * <p>
         * The type of JSON. Valid values: Document, Lines.
         * </p>
         * 
         * @param type
         *        The type of JSON. Valid values: Document, Lines.
         * @see JSONType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see JSONType
         */
        Builder type(JSONType type);
    }

    static final class BuilderImpl implements Builder {
        private String type;

        private BuilderImpl() {
        }

        private BuilderImpl(JSONInput model) {
            type(model.type);
        }

        public final String getType() {
            return type;
        }

        public final void setType(String type) {
            this.type = type;
        }

        @Override
        public final Builder type(String type) {
            this.type = type;
            return this;
        }

        @Override
        public final Builder type(JSONType type) {
            this.type(type == null ? null : type.toString());
            return this;
        }

        @Override
        public JSONInput build() {
            return new JSONInput(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
