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
 * Specifies when an object transitions to a specified storage class. For more information about Amazon S3 lifecycle
 * configuration rules, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html">Transitioning
 * Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Transition implements SdkPojo, Serializable, ToCopyableBuilder<Transition.Builder, Transition> {
    private static final SdkField<Instant> DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Date")
            .getter(getter(Transition::date))
            .setter(setter(Builder::date))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Date")
                    .unmarshallLocationName("Date").build(), TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601))
            .build();

    private static final SdkField<Integer> DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Days")
            .getter(getter(Transition::days))
            .setter(setter(Builder::days))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Days")
                    .unmarshallLocationName("Days").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(Transition::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DATE_FIELD, DAYS_FIELD,
            STORAGE_CLASS_FIELD));

    private static final long serialVersionUID = 1L;

    private final Instant date;

    private final Integer days;

    private final String storageClass;

    private Transition(BuilderImpl builder) {
        this.date = builder.date;
        this.days = builder.days;
        this.storageClass = builder.storageClass;
    }

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     * format. The time is always midnight UTC.
     * </p>
     * 
     * @return Indicates when objects are transitioned to the specified storage class. The date value must be in ISO
     *         8601 format. The time is always midnight UTC.
     */
    public final Instant date() {
        return date;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
     * value must be a positive integer.
     * </p>
     * 
     * @return Indicates the number of days after creation when objects are transitioned to the specified storage class.
     *         The value must be a positive integer.
     */
    public final Integer days() {
        return days;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link TransitionStorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #storageClassAsString}.
     * </p>
     * 
     * @return The storage class to which you want the object to transition.
     * @see TransitionStorageClass
     */
    public final TransitionStorageClass storageClass() {
        return TransitionStorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link TransitionStorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #storageClassAsString}.
     * </p>
     * 
     * @return The storage class to which you want the object to transition.
     * @see TransitionStorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
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
        hashCode = 31 * hashCode + Objects.hashCode(date());
        hashCode = 31 * hashCode + Objects.hashCode(days());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
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
        if (!(obj instanceof Transition)) {
            return false;
        }
        Transition other = (Transition) obj;
        return Objects.equals(date(), other.date()) && Objects.equals(days(), other.days())
                && Objects.equals(storageClassAsString(), other.storageClassAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Transition").add("Date", date()).add("Days", days()).add("StorageClass", storageClassAsString())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Date":
            return Optional.ofNullable(clazz.cast(date()));
        case "Days":
            return Optional.ofNullable(clazz.cast(days()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Transition, T> g) {
        return obj -> g.apply((Transition) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Transition> {
        /**
         * <p>
         * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
         * format. The time is always midnight UTC.
         * </p>
         * 
         * @param date
         *        Indicates when objects are transitioned to the specified storage class. The date value must be in ISO
         *        8601 format. The time is always midnight UTC.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder date(Instant date);

        /**
         * <p>
         * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
         * value must be a positive integer.
         * </p>
         * 
         * @param days
         *        Indicates the number of days after creation when objects are transitioned to the specified storage
         *        class. The value must be a positive integer.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder days(Integer days);

        /**
         * <p>
         * The storage class to which you want the object to transition.
         * </p>
         * 
         * @param storageClass
         *        The storage class to which you want the object to transition.
         * @see TransitionStorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see TransitionStorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * The storage class to which you want the object to transition.
         * </p>
         * 
         * @param storageClass
         *        The storage class to which you want the object to transition.
         * @see TransitionStorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see TransitionStorageClass
         */
        Builder storageClass(TransitionStorageClass storageClass);
    }

    static final class BuilderImpl implements Builder {
        private Instant date;

        private Integer days;

        private String storageClass;

        private BuilderImpl() {
        }

        private BuilderImpl(Transition model) {
            date(model.date);
            days(model.days);
            storageClass(model.storageClass);
        }

        public final Instant getDate() {
            return date;
        }

        public final void setDate(Instant date) {
            this.date = date;
        }

        @Override
        public final Builder date(Instant date) {
            this.date = date;
            return this;
        }

        public final Integer getDays() {
            return days;
        }

        public final void setDays(Integer days) {
            this.days = days;
        }

        @Override
        public final Builder days(Integer days) {
            this.days = days;
            return this;
        }

        public final String getStorageClass() {
            return storageClass;
        }

        public final void setStorageClass(String storageClass) {
            this.storageClass = storageClass;
        }

        @Override
        public final Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public final Builder storageClass(TransitionStorageClass storageClass) {
            this.storageClass(storageClass == null ? null : storageClass.toString());
            return this;
        }

        @Override
        public Transition build() {
            return new Transition(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
