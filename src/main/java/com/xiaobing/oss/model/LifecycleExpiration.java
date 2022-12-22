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
 * Container for the expiration for the lifecycle of the object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class LifecycleExpiration implements SdkPojo, Serializable,
        ToCopyableBuilder<LifecycleExpiration.Builder, LifecycleExpiration> {
    private static final SdkField<Instant> DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("Date")
            .getter(getter(LifecycleExpiration::date))
            .setter(setter(Builder::date))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Date")
                    .unmarshallLocationName("Date").build(), TimestampFormatTrait.create(TimestampFormatTrait.Format.ISO_8601))
            .build();

    private static final SdkField<Integer> DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Days")
            .getter(getter(LifecycleExpiration::days))
            .setter(setter(Builder::days))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Days")
                    .unmarshallLocationName("Days").build()).build();

    private static final SdkField<Boolean> EXPIRED_OBJECT_DELETE_MARKER_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("ExpiredObjectDeleteMarker")
            .getter(getter(LifecycleExpiration::expiredObjectDeleteMarker))
            .setter(setter(Builder::expiredObjectDeleteMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ExpiredObjectDeleteMarker")
                    .unmarshallLocationName("ExpiredObjectDeleteMarker").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DATE_FIELD, DAYS_FIELD,
            EXPIRED_OBJECT_DELETE_MARKER_FIELD));

    private static final long serialVersionUID = 1L;

    private final Instant date;

    private final Integer days;

    private final Boolean expiredObjectDeleteMarker;

    private LifecycleExpiration(BuilderImpl builder) {
        this.date = builder.date;
        this.days = builder.days;
        this.expiredObjectDeleteMarker = builder.expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
     * </p>
     * 
     * @return Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
     */
    public final Instant date() {
        return date;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     * positive integer.
     * </p>
     * 
     * @return Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a
     *         non-zero positive integer.
     */
    public final Integer days() {
        return days;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in
     * a Lifecycle Expiration Policy.
     * </p>
     * 
     * @return Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
     *         delete marker will be expired; if set to false the policy takes no action. This cannot be specified with
     *         Days or Date in a Lifecycle Expiration Policy.
     */
    public final Boolean expiredObjectDeleteMarker() {
        return expiredObjectDeleteMarker;
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
        hashCode = 31 * hashCode + Objects.hashCode(expiredObjectDeleteMarker());
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
        if (!(obj instanceof LifecycleExpiration)) {
            return false;
        }
        LifecycleExpiration other = (LifecycleExpiration) obj;
        return Objects.equals(date(), other.date()) && Objects.equals(days(), other.days())
                && Objects.equals(expiredObjectDeleteMarker(), other.expiredObjectDeleteMarker());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("LifecycleExpiration").add("Date", date()).add("Days", days())
                .add("ExpiredObjectDeleteMarker", expiredObjectDeleteMarker()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Date":
            return Optional.ofNullable(clazz.cast(date()));
        case "Days":
            return Optional.ofNullable(clazz.cast(days()));
        case "ExpiredObjectDeleteMarker":
            return Optional.ofNullable(clazz.cast(expiredObjectDeleteMarker()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<LifecycleExpiration, T> g) {
        return obj -> g.apply((LifecycleExpiration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, LifecycleExpiration> {
        /**
         * <p>
         * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
         * </p>
         * 
         * @param date
         *        Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder date(Instant date);

        /**
         * <p>
         * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
         * positive integer.
         * </p>
         * 
         * @param days
         *        Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a
         *        non-zero positive integer.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder days(Integer days);

        /**
         * <p>
         * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
         * delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days
         * or Date in a Lifecycle Expiration Policy.
         * </p>
         * 
         * @param expiredObjectDeleteMarker
         *        Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true,
         *        the delete marker will be expired; if set to false the policy takes no action. This cannot be
         *        specified with Days or Date in a Lifecycle Expiration Policy.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker);
    }

    static final class BuilderImpl implements Builder {
        private Instant date;

        private Integer days;

        private Boolean expiredObjectDeleteMarker;

        private BuilderImpl() {
        }

        private BuilderImpl(LifecycleExpiration model) {
            date(model.date);
            days(model.days);
            expiredObjectDeleteMarker(model.expiredObjectDeleteMarker);
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

        public final Boolean getExpiredObjectDeleteMarker() {
            return expiredObjectDeleteMarker;
        }

        public final void setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
        }

        @Override
        public final Builder expiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }

        @Override
        public LifecycleExpiration build() {
            return new LifecycleExpiration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
