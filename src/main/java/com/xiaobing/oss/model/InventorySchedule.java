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
 * Specifies the schedule for generating inventory results.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InventorySchedule implements SdkPojo, Serializable,
        ToCopyableBuilder<InventorySchedule.Builder, InventorySchedule> {
    private static final SdkField<String> FREQUENCY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Frequency")
            .getter(getter(InventorySchedule::frequencyAsString))
            .setter(setter(Builder::frequency))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Frequency")
                    .unmarshallLocationName("Frequency").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(FREQUENCY_FIELD));

    private static final long serialVersionUID = 1L;

    private final String frequency;

    private InventorySchedule(BuilderImpl builder) {
        this.frequency = builder.frequency;
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #frequency} will
     * return {@link InventoryFrequency#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #frequencyAsString}.
     * </p>
     * 
     * @return Specifies how frequently inventory results are produced.
     * @see InventoryFrequency
     */
    public final InventoryFrequency frequency() {
        return InventoryFrequency.fromValue(frequency);
    }

    /**
     * <p>
     * Specifies how frequently inventory results are produced.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #frequency} will
     * return {@link InventoryFrequency#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #frequencyAsString}.
     * </p>
     * 
     * @return Specifies how frequently inventory results are produced.
     * @see InventoryFrequency
     */
    public final String frequencyAsString() {
        return frequency;
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
        hashCode = 31 * hashCode + Objects.hashCode(frequencyAsString());
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
        if (!(obj instanceof InventorySchedule)) {
            return false;
        }
        InventorySchedule other = (InventorySchedule) obj;
        return Objects.equals(frequencyAsString(), other.frequencyAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("InventorySchedule").add("Frequency", frequencyAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Frequency":
            return Optional.ofNullable(clazz.cast(frequencyAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InventorySchedule, T> g) {
        return obj -> g.apply((InventorySchedule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InventorySchedule> {
        /**
         * <p>
         * Specifies how frequently inventory results are produced.
         * </p>
         * 
         * @param frequency
         *        Specifies how frequently inventory results are produced.
         * @see InventoryFrequency
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryFrequency
         */
        Builder frequency(String frequency);

        /**
         * <p>
         * Specifies how frequently inventory results are produced.
         * </p>
         * 
         * @param frequency
         *        Specifies how frequently inventory results are produced.
         * @see InventoryFrequency
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryFrequency
         */
        Builder frequency(InventoryFrequency frequency);
    }

    static final class BuilderImpl implements Builder {
        private String frequency;

        private BuilderImpl() {
        }

        private BuilderImpl(InventorySchedule model) {
            frequency(model.frequency);
        }

        public final String getFrequency() {
            return frequency;
        }

        public final void setFrequency(String frequency) {
            this.frequency = frequency;
        }

        @Override
        public final Builder frequency(String frequency) {
            this.frequency = frequency;
            return this;
        }

        @Override
        public final Builder frequency(InventoryFrequency frequency) {
            this.frequency(frequency == null ? null : frequency.toString());
            return this;
        }

        @Override
        public InventorySchedule build() {
            return new InventorySchedule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
