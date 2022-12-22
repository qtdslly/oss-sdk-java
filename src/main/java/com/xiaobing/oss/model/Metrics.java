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
 * A container specifying replication metrics-related settings enabling replication metrics and events.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Metrics implements SdkPojo, Serializable, ToCopyableBuilder<Metrics.Builder, Metrics> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(Metrics::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<ReplicationTimeValue> EVENT_THRESHOLD_FIELD = SdkField
            .<ReplicationTimeValue> builder(MarshallingType.SDK_POJO)
            .memberName("EventThreshold")
            .getter(getter(Metrics::eventThreshold))
            .setter(setter(Builder::eventThreshold))
            .constructor(ReplicationTimeValue::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EventThreshold")
                    .unmarshallLocationName("EventThreshold").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STATUS_FIELD,
            EVENT_THRESHOLD_FIELD));

    private static final long serialVersionUID = 1L;

    private final String status;

    private final ReplicationTimeValue eventThreshold;

    private Metrics(BuilderImpl builder) {
        this.status = builder.status;
        this.eventThreshold = builder.eventThreshold;
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link MetricsStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the replication metrics are enabled.
     * @see MetricsStatus
     */
    public final MetricsStatus status() {
        return MetricsStatus.fromValue(status);
    }

    /**
     * <p>
     * Specifies whether the replication metrics are enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link MetricsStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the replication metrics are enabled.
     * @see MetricsStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * <p>
     * A container specifying the time threshold for emitting the <code>s3:Replication:OperationMissedThreshold</code>
     * event.
     * </p>
     * 
     * @return A container specifying the time threshold for emitting the
     *         <code>s3:Replication:OperationMissedThreshold</code> event.
     */
    public final ReplicationTimeValue eventThreshold() {
        return eventThreshold;
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
        hashCode = 31 * hashCode + Objects.hashCode(eventThreshold());
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
        if (!(obj instanceof Metrics)) {
            return false;
        }
        Metrics other = (Metrics) obj;
        return Objects.equals(statusAsString(), other.statusAsString())
                && Objects.equals(eventThreshold(), other.eventThreshold());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Metrics").add("Status", statusAsString()).add("EventThreshold", eventThreshold()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "EventThreshold":
            return Optional.ofNullable(clazz.cast(eventThreshold()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Metrics, T> g) {
        return obj -> g.apply((Metrics) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Metrics> {
        /**
         * <p>
         * Specifies whether the replication metrics are enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the replication metrics are enabled.
         * @see MetricsStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see MetricsStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Specifies whether the replication metrics are enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the replication metrics are enabled.
         * @see MetricsStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see MetricsStatus
         */
        Builder status(MetricsStatus status);

        /**
         * <p>
         * A container specifying the time threshold for emitting the
         * <code>s3:Replication:OperationMissedThreshold</code> event.
         * </p>
         * 
         * @param eventThreshold
         *        A container specifying the time threshold for emitting the
         *        <code>s3:Replication:OperationMissedThreshold</code> event.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eventThreshold(ReplicationTimeValue eventThreshold);

        /**
         * <p>
         * A container specifying the time threshold for emitting the
         * <code>s3:Replication:OperationMissedThreshold</code> event.
         * </p>
         * This is a convenience method that creates an instance of the {@link ReplicationTimeValue.Builder} avoiding
         * the need to create one manually via {@link ReplicationTimeValue#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationTimeValue.Builder#build()} is called immediately and
         * its result is passed to {@link #eventThreshold(ReplicationTimeValue)}.
         * 
         * @param eventThreshold
         *        a consumer that will call methods on {@link ReplicationTimeValue.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #eventThreshold(ReplicationTimeValue)
         */
        default Builder eventThreshold(Consumer<ReplicationTimeValue.Builder> eventThreshold) {
            return eventThreshold(ReplicationTimeValue.builder().applyMutation(eventThreshold).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String status;

        private ReplicationTimeValue eventThreshold;

        private BuilderImpl() {
        }

        private BuilderImpl(Metrics model) {
            status(model.status);
            eventThreshold(model.eventThreshold);
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
        public final Builder status(MetricsStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final ReplicationTimeValue.Builder getEventThreshold() {
            return eventThreshold != null ? eventThreshold.toBuilder() : null;
        }

        public final void setEventThreshold(ReplicationTimeValue.BuilderImpl eventThreshold) {
            this.eventThreshold = eventThreshold != null ? eventThreshold.build() : null;
        }

        @Override
        public final Builder eventThreshold(ReplicationTimeValue eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }

        @Override
        public Metrics build() {
            return new Metrics(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
