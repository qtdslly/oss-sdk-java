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
 * A container specifying S3 Replication Time Control (S3 RTC) related information, including whether S3 RTC is enabled
 * and the time when all objects and operations on objects must be replicated. Must be specified together with a
 * <code>Metrics</code> block.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicationTime implements SdkPojo, Serializable, ToCopyableBuilder<ReplicationTime.Builder, ReplicationTime> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(ReplicationTime::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<ReplicationTimeValue> TIME_FIELD = SdkField
            .<ReplicationTimeValue> builder(MarshallingType.SDK_POJO)
            .memberName("Time")
            .getter(getter(ReplicationTime::time))
            .setter(setter(Builder::time))
            .constructor(ReplicationTimeValue::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Time")
                    .unmarshallLocationName("Time").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STATUS_FIELD, TIME_FIELD));

    private static final long serialVersionUID = 1L;

    private final String status;

    private final ReplicationTimeValue time;

    private ReplicationTime(BuilderImpl builder) {
        this.status = builder.status;
        this.time = builder.time;
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicationTimeStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the replication time is enabled.
     * @see ReplicationTimeStatus
     */
    public final ReplicationTimeStatus status() {
        return ReplicationTimeStatus.fromValue(status);
    }

    /**
     * <p>
     * Specifies whether the replication time is enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicationTimeStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the replication time is enabled.
     * @see ReplicationTimeStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * <p>
     * A container specifying the time by which replication should be complete for all objects and operations on
     * objects.
     * </p>
     * 
     * @return A container specifying the time by which replication should be complete for all objects and operations on
     *         objects.
     */
    public final ReplicationTimeValue time() {
        return time;
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
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(time());
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
        if (!(obj instanceof ReplicationTime)) {
            return false;
        }
        ReplicationTime other = (ReplicationTime) obj;
        return Objects.equals(statusAsString(), other.statusAsString()) && Objects.equals(time(), other.time());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicationTime").add("Status", statusAsString()).add("Time", time()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "Time":
            return Optional.ofNullable(clazz.cast(time()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ReplicationTime, T> g) {
        return obj -> g.apply((ReplicationTime) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicationTime> {
        /**
         * <p>
         * Specifies whether the replication time is enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the replication time is enabled.
         * @see ReplicationTimeStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationTimeStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Specifies whether the replication time is enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the replication time is enabled.
         * @see ReplicationTimeStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationTimeStatus
         */
        Builder status(ReplicationTimeStatus status);

        /**
         * <p>
         * A container specifying the time by which replication should be complete for all objects and operations on
         * objects.
         * </p>
         * 
         * @param time
         *        A container specifying the time by which replication should be complete for all objects and operations
         *        on objects.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder time(ReplicationTimeValue time);

        /**
         * <p>
         * A container specifying the time by which replication should be complete for all objects and operations on
         * objects.
         * </p>
         * This is a convenience method that creates an instance of the {@link ReplicationTimeValue.Builder} avoiding
         * the need to create one manually via {@link ReplicationTimeValue#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationTimeValue.Builder#build()} is called immediately and
         * its result is passed to {@link #time(ReplicationTimeValue)}.
         * 
         * @param time
         *        a consumer that will call methods on {@link ReplicationTimeValue.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #time(ReplicationTimeValue)
         */
        default Builder time(Consumer<ReplicationTimeValue.Builder> time) {
            return time(ReplicationTimeValue.builder().applyMutation(time).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String status;

        private ReplicationTimeValue time;

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicationTime model) {
            status(model.status);
            time(model.time);
        }

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        @Override
        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public final Builder status(ReplicationTimeStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final ReplicationTimeValue.Builder getTime() {
            return time != null ? time.toBuilder() : null;
        }

        public final void setTime(ReplicationTimeValue.BuilderImpl time) {
            this.time = time != null ? time.build() : null;
        }

        @Override
        public final Builder time(ReplicationTimeValue time) {
            this.time = time;
            return this;
        }

        @Override
        public ReplicationTime build() {
            return new ReplicationTime(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
