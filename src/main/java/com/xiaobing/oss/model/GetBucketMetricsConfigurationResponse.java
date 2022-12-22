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
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetBucketMetricsConfigurationResponse extends S3Response implements
        ToCopyableBuilder<GetBucketMetricsConfigurationResponse.Builder, GetBucketMetricsConfigurationResponse> {
    private static final SdkField<MetricsConfiguration> METRICS_CONFIGURATION_FIELD = SdkField
            .<MetricsConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("MetricsConfiguration")
            .getter(getter(GetBucketMetricsConfigurationResponse::metricsConfiguration))
            .setter(setter(Builder::metricsConfiguration))
            .constructor(MetricsConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MetricsConfiguration")
                    .unmarshallLocationName("MetricsConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(METRICS_CONFIGURATION_FIELD));

    private final MetricsConfiguration metricsConfiguration;

    private GetBucketMetricsConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.metricsConfiguration = builder.metricsConfiguration;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     * 
     * @return Specifies the metrics configuration.
     */
    public final MetricsConfiguration metricsConfiguration() {
        return metricsConfiguration;
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(metricsConfiguration());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof GetBucketMetricsConfigurationResponse)) {
            return false;
        }
        GetBucketMetricsConfigurationResponse other = (GetBucketMetricsConfigurationResponse) obj;
        return Objects.equals(metricsConfiguration(), other.metricsConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketMetricsConfigurationResponse").add("MetricsConfiguration", metricsConfiguration())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "MetricsConfiguration":
            return Optional.ofNullable(clazz.cast(metricsConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketMetricsConfigurationResponse, T> g) {
        return obj -> g.apply((GetBucketMetricsConfigurationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketMetricsConfigurationResponse> {
        /**
         * <p>
         * Specifies the metrics configuration.
         * </p>
         * 
         * @param metricsConfiguration
         *        Specifies the metrics configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder metricsConfiguration(MetricsConfiguration metricsConfiguration);

        /**
         * <p>
         * Specifies the metrics configuration.
         * </p>
         * This is a convenience method that creates an instance of the {@link MetricsConfiguration.Builder} avoiding
         * the need to create one manually via {@link MetricsConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link MetricsConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #metricsConfiguration(MetricsConfiguration)}.
         * 
         * @param metricsConfiguration
         *        a consumer that will call methods on {@link MetricsConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #metricsConfiguration(MetricsConfiguration)
         */
        default Builder metricsConfiguration(Consumer<MetricsConfiguration.Builder> metricsConfiguration) {
            return metricsConfiguration(MetricsConfiguration.builder().applyMutation(metricsConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private MetricsConfiguration metricsConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketMetricsConfigurationResponse model) {
            super(model);
            metricsConfiguration(model.metricsConfiguration);
        }

        public final MetricsConfiguration.Builder getMetricsConfiguration() {
            return metricsConfiguration != null ? metricsConfiguration.toBuilder() : null;
        }

        public final void setMetricsConfiguration(MetricsConfiguration.BuilderImpl metricsConfiguration) {
            this.metricsConfiguration = metricsConfiguration != null ? metricsConfiguration.build() : null;
        }

        @Override
        public final Builder metricsConfiguration(MetricsConfiguration metricsConfiguration) {
            this.metricsConfiguration = metricsConfiguration;
            return this;
        }

        @Override
        public GetBucketMetricsConfigurationResponse build() {
            return new GetBucketMetricsConfigurationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
