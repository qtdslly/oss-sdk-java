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
import java.time.Instant;
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
import software.amazon.awssdk.core.traits.TimestampFormatTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * A Retention configuration for an object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ObjectLockRetention implements SdkPojo, Serializable,
        ToCopyableBuilder<ObjectLockRetention.Builder, ObjectLockRetention> {
    private static final SdkField<String> MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Mode")
            .getter(getter(ObjectLockRetention::modeAsString))
            .setter(setter(Builder::mode))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Mode")
                    .unmarshallLocationName("Mode").build()).build();

    private static final SdkField<Instant> RETAIN_UNTIL_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("RetainUntilDate")
            .getter(getter(ObjectLockRetention::retainUntilDate))
            .setter(setter(Builder::retainUntilDate))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RetainUntilDate")
                    .unmarshallLocationName("RetainUntilDate").build(),
                    TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601)).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(MODE_FIELD,
            RETAIN_UNTIL_DATE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String mode;

    private final Instant retainUntilDate;

    private ObjectLockRetention(BuilderImpl builder) {
        this.mode = builder.mode;
        this.retainUntilDate = builder.retainUntilDate;
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mode} will return
     * {@link ObjectLockRetentionMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #modeAsString}.
     * </p>
     * 
     * @return Indicates the Retention mode for the specified object.
     * @see ObjectLockRetentionMode
     */
    public final ObjectLockRetentionMode mode() {
        return ObjectLockRetentionMode.fromValue(mode);
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mode} will return
     * {@link ObjectLockRetentionMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #modeAsString}.
     * </p>
     * 
     * @return Indicates the Retention mode for the specified object.
     * @see ObjectLockRetentionMode
     */
    public final String modeAsString() {
        return mode;
    }

    /**
     * <p>
     * The date on which this Object Lock Retention will expire.
     * </p>
     * 
     * @return The date on which this Object Lock Retention will expire.
     */
    public final Instant retainUntilDate() {
        return retainUntilDate;
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
        hashCode = 31 * hashCode + Objects.hashCode(modeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(retainUntilDate());
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
        if (!(obj instanceof ObjectLockRetention)) {
            return false;
        }
        ObjectLockRetention other = (ObjectLockRetention) obj;
        return Objects.equals(modeAsString(), other.modeAsString()) && Objects.equals(retainUntilDate(), other.retainUntilDate());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ObjectLockRetention").add("Mode", modeAsString()).add("RetainUntilDate", retainUntilDate())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Mode":
            return Optional.ofNullable(clazz.cast(modeAsString()));
        case "RetainUntilDate":
            return Optional.ofNullable(clazz.cast(retainUntilDate()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ObjectLockRetention, T> g) {
        return obj -> g.apply((ObjectLockRetention) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ObjectLockRetention> {
        /**
         * <p>
         * Indicates the Retention mode for the specified object.
         * </p>
         * 
         * @param mode
         *        Indicates the Retention mode for the specified object.
         * @see ObjectLockRetentionMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockRetentionMode
         */
        Builder mode(String mode);

        /**
         * <p>
         * Indicates the Retention mode for the specified object.
         * </p>
         * 
         * @param mode
         *        Indicates the Retention mode for the specified object.
         * @see ObjectLockRetentionMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockRetentionMode
         */
        Builder mode(ObjectLockRetentionMode mode);

        /**
         * <p>
         * The date on which this Object Lock Retention will expire.
         * </p>
         * 
         * @param retainUntilDate
         *        The date on which this Object Lock Retention will expire.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder retainUntilDate(Instant retainUntilDate);
    }

    static final class BuilderImpl implements Builder {
        private String mode;

        private Instant retainUntilDate;

        private BuilderImpl() {
        }

        private BuilderImpl(ObjectLockRetention model) {
            mode(model.mode);
            retainUntilDate(model.retainUntilDate);
        }

        public final String getMode() {
            return mode;
        }

        public final void setMode(String mode) {
            this.mode = mode;
        }

        @Override
        public final Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        @Override
        public final Builder mode(ObjectLockRetentionMode mode) {
            this.mode(mode == null ? null : mode.toString());
            return this;
        }

        public final Instant getRetainUntilDate() {
            return retainUntilDate;
        }

        public final void setRetainUntilDate(Instant retainUntilDate) {
            this.retainUntilDate = retainUntilDate;
        }

        @Override
        public final Builder retainUntilDate(Instant retainUntilDate) {
            this.retainUntilDate = retainUntilDate;
            return this;
        }

        @Override
        public ObjectLockRetention build() {
            return new ObjectLockRetention(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
