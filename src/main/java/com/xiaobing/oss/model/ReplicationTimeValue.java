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
 * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics
 * <code>EventThreshold</code>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicationTimeValue implements SdkPojo, Serializable,
        ToCopyableBuilder<ReplicationTimeValue.Builder, ReplicationTimeValue> {
    private static final SdkField<Integer> MINUTES_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Minutes")
            .getter(getter(ReplicationTimeValue::minutes))
            .setter(setter(Builder::minutes))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Minutes")
                    .unmarshallLocationName("Minutes").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(MINUTES_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer minutes;

    private ReplicationTimeValue(BuilderImpl builder) {
        this.minutes = builder.minutes;
    }

    /**
     * <p>
     * Contains an integer specifying time in minutes.
     * </p>
     * <p>
     * Valid value: 15
     * </p>
     * 
     * @return Contains an integer specifying time in minutes. </p>
     *         <p>
     *         Valid value: 15
     */
    public final Integer minutes() {
        return minutes;
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
        hashCode = 31 * hashCode + Objects.hashCode(minutes());
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
        if (!(obj instanceof ReplicationTimeValue)) {
            return false;
        }
        ReplicationTimeValue other = (ReplicationTimeValue) obj;
        return Objects.equals(minutes(), other.minutes());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicationTimeValue").add("Minutes", minutes()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Minutes":
            return Optional.ofNullable(clazz.cast(minutes()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ReplicationTimeValue, T> g) {
        return obj -> g.apply((ReplicationTimeValue) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicationTimeValue> {
        /**
         * <p>
         * Contains an integer specifying time in minutes.
         * </p>
         * <p>
         * Valid value: 15
         * </p>
         * 
         * @param minutes
         *        Contains an integer specifying time in minutes. </p>
         *        <p>
         *        Valid value: 15
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder minutes(Integer minutes);
    }

    static final class BuilderImpl implements Builder {
        private Integer minutes;

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicationTimeValue model) {
            minutes(model.minutes);
        }

        public final Integer getMinutes() {
            return minutes;
        }

        public final void setMinutes(Integer minutes) {
            this.minutes = minutes;
        }

        @Override
        public final Builder minutes(Integer minutes) {
            this.minutes = minutes;
            return this;
        }

        @Override
        public ReplicationTimeValue build() {
            return new ReplicationTimeValue(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
