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
 * Container for logging status information.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class BucketLoggingStatus implements SdkPojo, Serializable,
        ToCopyableBuilder<BucketLoggingStatus.Builder, BucketLoggingStatus> {
    private static final SdkField<LoggingEnabled> LOGGING_ENABLED_FIELD = SdkField
            .<LoggingEnabled> builder(MarshallingType.SDK_POJO)
            .memberName("LoggingEnabled")
            .getter(getter(BucketLoggingStatus::loggingEnabled))
            .setter(setter(Builder::loggingEnabled))
            .constructor(LoggingEnabled::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LoggingEnabled")
                    .unmarshallLocationName("LoggingEnabled").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LOGGING_ENABLED_FIELD));

    private static final long serialVersionUID = 1L;

    private final LoggingEnabled loggingEnabled;

    private BucketLoggingStatus(BuilderImpl builder) {
        this.loggingEnabled = builder.loggingEnabled;
    }

    /**
     * Returns the value of the LoggingEnabled property for this object.
     * 
     * @return The value of the LoggingEnabled property for this object.
     */
    public final LoggingEnabled loggingEnabled() {
        return loggingEnabled;
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
        hashCode = 31 * hashCode + Objects.hashCode(loggingEnabled());
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
        if (!(obj instanceof BucketLoggingStatus)) {
            return false;
        }
        BucketLoggingStatus other = (BucketLoggingStatus) obj;
        return Objects.equals(loggingEnabled(), other.loggingEnabled());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("BucketLoggingStatus").add("LoggingEnabled", loggingEnabled()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "LoggingEnabled":
            return Optional.ofNullable(clazz.cast(loggingEnabled()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<BucketLoggingStatus, T> g) {
        return obj -> g.apply((BucketLoggingStatus) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, BucketLoggingStatus> {
        /**
         * Sets the value of the LoggingEnabled property for this object.
         *
         * @param loggingEnabled
         *        The new value for the LoggingEnabled property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder loggingEnabled(LoggingEnabled loggingEnabled);

        /**
         * Sets the value of the LoggingEnabled property for this object.
         *
         * This is a convenience method that creates an instance of the {@link LoggingEnabled.Builder} avoiding the need
         * to create one manually via {@link LoggingEnabled#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link LoggingEnabled.Builder#build()} is called immediately and its
         * result is passed to {@link #loggingEnabled(LoggingEnabled)}.
         * 
         * @param loggingEnabled
         *        a consumer that will call methods on {@link LoggingEnabled.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #loggingEnabled(LoggingEnabled)
         */
        default Builder loggingEnabled(Consumer<LoggingEnabled.Builder> loggingEnabled) {
            return loggingEnabled(LoggingEnabled.builder().applyMutation(loggingEnabled).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private LoggingEnabled loggingEnabled;

        private BuilderImpl() {
        }

        private BuilderImpl(BucketLoggingStatus model) {
            loggingEnabled(model.loggingEnabled);
        }

        public final LoggingEnabled.Builder getLoggingEnabled() {
            return loggingEnabled != null ? loggingEnabled.toBuilder() : null;
        }

        public final void setLoggingEnabled(LoggingEnabled.BuilderImpl loggingEnabled) {
            this.loggingEnabled = loggingEnabled != null ? loggingEnabled.build() : null;
        }

        @Override
        public final Builder loggingEnabled(LoggingEnabled loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }

        @Override
        public BucketLoggingStatus build() {
            return new BucketLoggingStatus(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
