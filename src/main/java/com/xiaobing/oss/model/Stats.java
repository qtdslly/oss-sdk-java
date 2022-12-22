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
 * Container for the stats details.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Stats implements SdkPojo, Serializable, ToCopyableBuilder<Stats.Builder, Stats> {
    private static final SdkField<Long> BYTES_SCANNED_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("BytesScanned")
            .getter(getter(Stats::bytesScanned))
            .setter(setter(Builder::bytesScanned))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BytesScanned")
                    .unmarshallLocationName("BytesScanned").build()).build();

    private static final SdkField<Long> BYTES_PROCESSED_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("BytesProcessed")
            .getter(getter(Stats::bytesProcessed))
            .setter(setter(Builder::bytesProcessed))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BytesProcessed")
                    .unmarshallLocationName("BytesProcessed").build()).build();

    private static final SdkField<Long> BYTES_RETURNED_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("BytesReturned")
            .getter(getter(Stats::bytesReturned))
            .setter(setter(Builder::bytesReturned))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BytesReturned")
                    .unmarshallLocationName("BytesReturned").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BYTES_SCANNED_FIELD,
            BYTES_PROCESSED_FIELD, BYTES_RETURNED_FIELD));

    private static final long serialVersionUID = 1L;

    private final Long bytesScanned;

    private final Long bytesProcessed;

    private final Long bytesReturned;

    private Stats(BuilderImpl builder) {
        this.bytesScanned = builder.bytesScanned;
        this.bytesProcessed = builder.bytesProcessed;
        this.bytesReturned = builder.bytesReturned;
    }

    /**
     * <p>
     * The total number of object bytes scanned.
     * </p>
     * 
     * @return The total number of object bytes scanned.
     */
    public final Long bytesScanned() {
        return bytesScanned;
    }

    /**
     * <p>
     * The total number of uncompressed object bytes processed.
     * </p>
     * 
     * @return The total number of uncompressed object bytes processed.
     */
    public final Long bytesProcessed() {
        return bytesProcessed;
    }

    /**
     * <p>
     * The total number of bytes of records payload data returned.
     * </p>
     * 
     * @return The total number of bytes of records payload data returned.
     */
    public final Long bytesReturned() {
        return bytesReturned;
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
        hashCode = 31 * hashCode + Objects.hashCode(bytesScanned());
        hashCode = 31 * hashCode + Objects.hashCode(bytesProcessed());
        hashCode = 31 * hashCode + Objects.hashCode(bytesReturned());
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
        if (!(obj instanceof Stats)) {
            return false;
        }
        Stats other = (Stats) obj;
        return Objects.equals(bytesScanned(), other.bytesScanned()) && Objects.equals(bytesProcessed(), other.bytesProcessed())
                && Objects.equals(bytesReturned(), other.bytesReturned());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Stats").add("BytesScanned", bytesScanned()).add("BytesProcessed", bytesProcessed())
                .add("BytesReturned", bytesReturned()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "BytesScanned":
            return Optional.ofNullable(clazz.cast(bytesScanned()));
        case "BytesProcessed":
            return Optional.ofNullable(clazz.cast(bytesProcessed()));
        case "BytesReturned":
            return Optional.ofNullable(clazz.cast(bytesReturned()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Stats, T> g) {
        return obj -> g.apply((Stats) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Stats> {
        /**
         * <p>
         * The total number of object bytes scanned.
         * </p>
         * 
         * @param bytesScanned
         *        The total number of object bytes scanned.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bytesScanned(Long bytesScanned);

        /**
         * <p>
         * The total number of uncompressed object bytes processed.
         * </p>
         * 
         * @param bytesProcessed
         *        The total number of uncompressed object bytes processed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bytesProcessed(Long bytesProcessed);

        /**
         * <p>
         * The total number of bytes of records payload data returned.
         * </p>
         * 
         * @param bytesReturned
         *        The total number of bytes of records payload data returned.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bytesReturned(Long bytesReturned);
    }

    static final class BuilderImpl implements Builder {
        private Long bytesScanned;

        private Long bytesProcessed;

        private Long bytesReturned;

        private BuilderImpl() {
        }

        private BuilderImpl(Stats model) {
            bytesScanned(model.bytesScanned);
            bytesProcessed(model.bytesProcessed);
            bytesReturned(model.bytesReturned);
        }

        public final Long getBytesScanned() {
            return bytesScanned;
        }

        public final void setBytesScanned(Long bytesScanned) {
            this.bytesScanned = bytesScanned;
        }

        @Override
        public final Builder bytesScanned(Long bytesScanned) {
            this.bytesScanned = bytesScanned;
            return this;
        }

        public final Long getBytesProcessed() {
            return bytesProcessed;
        }

        public final void setBytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
        }

        @Override
        public final Builder bytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
            return this;
        }

        public final Long getBytesReturned() {
            return bytesReturned;
        }

        public final void setBytesReturned(Long bytesReturned) {
            this.bytesReturned = bytesReturned;
        }

        @Override
        public final Builder bytesReturned(Long bytesReturned) {
            this.bytesReturned = bytesReturned;
            return this;
        }

        @Override
        public Stats build() {
            return new Stats(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
