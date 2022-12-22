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
public final class GetBucketAnalyticsConfigurationResponse extends S3Response implements
        ToCopyableBuilder<GetBucketAnalyticsConfigurationResponse.Builder, GetBucketAnalyticsConfigurationResponse> {
    private static final SdkField<AnalyticsConfiguration> ANALYTICS_CONFIGURATION_FIELD = SdkField
            .<AnalyticsConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("AnalyticsConfiguration")
            .getter(getter(GetBucketAnalyticsConfigurationResponse::analyticsConfiguration))
            .setter(setter(Builder::analyticsConfiguration))
            .constructor(AnalyticsConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AnalyticsConfiguration")
                    .unmarshallLocationName("AnalyticsConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections
            .unmodifiableList(Arrays.asList(ANALYTICS_CONFIGURATION_FIELD));

    private final AnalyticsConfiguration analyticsConfiguration;

    private GetBucketAnalyticsConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.analyticsConfiguration = builder.analyticsConfiguration;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     * 
     * @return The configuration and any analyses for the analytics filter.
     */
    public final AnalyticsConfiguration analyticsConfiguration() {
        return analyticsConfiguration;
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
        hashCode = 31 * hashCode + Objects.hashCode(analyticsConfiguration());
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
        if (!(obj instanceof GetBucketAnalyticsConfigurationResponse)) {
            return false;
        }
        GetBucketAnalyticsConfigurationResponse other = (GetBucketAnalyticsConfigurationResponse) obj;
        return Objects.equals(analyticsConfiguration(), other.analyticsConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketAnalyticsConfigurationResponse")
                .add("AnalyticsConfiguration", analyticsConfiguration()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "AnalyticsConfiguration":
            return Optional.ofNullable(clazz.cast(analyticsConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketAnalyticsConfigurationResponse, T> g) {
        return obj -> g.apply((GetBucketAnalyticsConfigurationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, GetBucketAnalyticsConfigurationResponse> {
        /**
         * <p>
         * The configuration and any analyses for the analytics filter.
         * </p>
         * 
         * @param analyticsConfiguration
         *        The configuration and any analyses for the analytics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder analyticsConfiguration(AnalyticsConfiguration analyticsConfiguration);

        /**
         * <p>
         * The configuration and any analyses for the analytics filter.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsConfiguration.Builder} avoiding
         * the need to create one manually via {@link AnalyticsConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #analyticsConfiguration(AnalyticsConfiguration)}.
         * 
         * @param analyticsConfiguration
         *        a consumer that will call methods on {@link AnalyticsConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #analyticsConfiguration(AnalyticsConfiguration)
         */
        default Builder analyticsConfiguration(Consumer<AnalyticsConfiguration.Builder> analyticsConfiguration) {
            return analyticsConfiguration(AnalyticsConfiguration.builder().applyMutation(analyticsConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private AnalyticsConfiguration analyticsConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketAnalyticsConfigurationResponse model) {
            super(model);
            analyticsConfiguration(model.analyticsConfiguration);
        }

        public final AnalyticsConfiguration.Builder getAnalyticsConfiguration() {
            return analyticsConfiguration != null ? analyticsConfiguration.toBuilder() : null;
        }

        public final void setAnalyticsConfiguration(AnalyticsConfiguration.BuilderImpl analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration != null ? analyticsConfiguration.build() : null;
        }

        @Override
        public final Builder analyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration;
            return this;
        }

        @Override
        public GetBucketAnalyticsConfigurationResponse build() {
            return new GetBucketAnalyticsConfigurationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
