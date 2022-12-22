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
 * The container element for specifying the default Object Lock retention settings for new objects placed in the
 * specified bucket.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * The <code>DefaultRetention</code> settings require both a mode and a period.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>DefaultRetention</code> period can be either <code>Days</code> or <code>Years</code> but you must select
 * one. You cannot specify <code>Days</code> and <code>Years</code> at the same time.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
@Generated("software.amazon.awssdk:codegen")
public final class DefaultRetention implements SdkPojo, Serializable,
        ToCopyableBuilder<DefaultRetention.Builder, DefaultRetention> {
    private static final SdkField<String> MODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Mode")
            .getter(getter(DefaultRetention::modeAsString))
            .setter(setter(Builder::mode))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Mode")
                    .unmarshallLocationName("Mode").build()).build();

    private static final SdkField<Integer> DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Days")
            .getter(getter(DefaultRetention::days))
            .setter(setter(Builder::days))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Days")
                    .unmarshallLocationName("Days").build()).build();

    private static final SdkField<Integer> YEARS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Years")
            .getter(getter(DefaultRetention::years))
            .setter(setter(Builder::years))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Years")
                    .unmarshallLocationName("Years").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(MODE_FIELD, DAYS_FIELD,
            YEARS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String mode;

    private final Integer days;

    private final Integer years;

    private DefaultRetention(BuilderImpl builder) {
        this.mode = builder.mode;
        this.days = builder.days;
        this.years = builder.years;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must be
     * used with either <code>Days</code> or <code>Years</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mode} will return
     * {@link ObjectLockRetentionMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #modeAsString}.
     * </p>
     * 
     * @return The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     *         Must be used with either <code>Days</code> or <code>Years</code>.
     * @see ObjectLockRetentionMode
     */
    public final ObjectLockRetentionMode mode() {
        return ObjectLockRetentionMode.fromValue(mode);
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must be
     * used with either <code>Days</code> or <code>Years</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #mode} will return
     * {@link ObjectLockRetentionMode#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #modeAsString}.
     * </p>
     * 
     * @return The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
     *         Must be used with either <code>Days</code> or <code>Years</code>.
     * @see ObjectLockRetentionMode
     */
    public final String modeAsString() {
        return mode;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention period. Must be used with <code>Mode</code>
     * .
     * </p>
     * 
     * @return The number of days that you want to specify for the default retention period. Must be used with
     *         <code>Mode</code>.
     */
    public final Integer days() {
        return days;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention period. Must be used with
     * <code>Mode</code>.
     * </p>
     * 
     * @return The number of years that you want to specify for the default retention period. Must be used with
     *         <code>Mode</code>.
     */
    public final Integer years() {
        return years;
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
        hashCode = 31 * hashCode + Objects.hashCode(days());
        hashCode = 31 * hashCode + Objects.hashCode(years());
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
        if (!(obj instanceof DefaultRetention)) {
            return false;
        }
        DefaultRetention other = (DefaultRetention) obj;
        return Objects.equals(modeAsString(), other.modeAsString()) && Objects.equals(days(), other.days())
                && Objects.equals(years(), other.years());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DefaultRetention").add("Mode", modeAsString()).add("Days", days()).add("Years", years()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Mode":
            return Optional.ofNullable(clazz.cast(modeAsString()));
        case "Days":
            return Optional.ofNullable(clazz.cast(days()));
        case "Years":
            return Optional.ofNullable(clazz.cast(years()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DefaultRetention, T> g) {
        return obj -> g.apply((DefaultRetention) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, DefaultRetention> {
        /**
         * <p>
         * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must
         * be used with either <code>Days</code> or <code>Years</code>.
         * </p>
         * 
         * @param mode
         *        The default Object Lock retention mode you want to apply to new objects placed in the specified
         *        bucket. Must be used with either <code>Days</code> or <code>Years</code>.
         * @see ObjectLockRetentionMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockRetentionMode
         */
        Builder mode(String mode);

        /**
         * <p>
         * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket. Must
         * be used with either <code>Days</code> or <code>Years</code>.
         * </p>
         * 
         * @param mode
         *        The default Object Lock retention mode you want to apply to new objects placed in the specified
         *        bucket. Must be used with either <code>Days</code> or <code>Years</code>.
         * @see ObjectLockRetentionMode
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockRetentionMode
         */
        Builder mode(ObjectLockRetentionMode mode);

        /**
         * <p>
         * The number of days that you want to specify for the default retention period. Must be used with
         * <code>Mode</code>.
         * </p>
         * 
         * @param days
         *        The number of days that you want to specify for the default retention period. Must be used with
         *        <code>Mode</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder days(Integer days);

        /**
         * <p>
         * The number of years that you want to specify for the default retention period. Must be used with
         * <code>Mode</code>.
         * </p>
         * 
         * @param years
         *        The number of years that you want to specify for the default retention period. Must be used with
         *        <code>Mode</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder years(Integer years);
    }

    static final class BuilderImpl implements Builder {
        private String mode;

        private Integer days;

        private Integer years;

        private BuilderImpl() {
        }

        private BuilderImpl(DefaultRetention model) {
            mode(model.mode);
            days(model.days);
            years(model.years);
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

        public final Integer getYears() {
            return years;
        }

        public final void setYears(Integer years) {
            this.years = years;
        }

        @Override
        public final Builder years(Integer years) {
            this.years = years;
            return this;
        }

        @Override
        public DefaultRetention build() {
            return new DefaultRetention(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
