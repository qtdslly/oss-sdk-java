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
 * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics configuration ID) from
 * an Amazon S3 bucket. If you're updating an existing metrics configuration, note that this is a full replacement of
 * the existing metrics configuration. If you don't include the elements you want to keep, they are erased. For more
 * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html">
 * PutBucketMetricsConfiguration</a>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class MetricsConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<MetricsConfiguration.Builder, MetricsConfiguration> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(MetricsConfiguration::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Id").unmarshallLocationName("Id")
                    .build()).build();

    private static final SdkField<MetricsFilter> FILTER_FIELD = SdkField
            .<MetricsFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(MetricsConfiguration::filter))
            .setter(setter(Builder::filter))
            .constructor(MetricsFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD, FILTER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final MetricsFilter filter;

    private MetricsConfiguration(BuilderImpl builder) {
        this.id = builder.id;
        this.filter = builder.filter;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     * 
     * @return The ID used to identify the metrics configuration.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the
     * filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction
     * (MetricsAndOperator).
     * </p>
     * 
     * @return Specifies a metrics configuration filter. The metrics configuration will only include objects that meet
     *         the filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction
     *         (MetricsAndOperator).
     */
    public final MetricsFilter filter() {
        return filter;
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
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(filter());
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
        if (!(obj instanceof MetricsConfiguration)) {
            return false;
        }
        MetricsConfiguration other = (MetricsConfiguration) obj;
        return Objects.equals(id(), other.id()) && Objects.equals(filter(), other.filter());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("MetricsConfiguration").add("Id", id()).add("Filter", filter()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<MetricsConfiguration, T> g) {
        return obj -> g.apply((MetricsConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, MetricsConfiguration> {
        /**
         * <p>
         * The ID used to identify the metrics configuration.
         * </p>
         * 
         * @param id
         *        The ID used to identify the metrics configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the
         * filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction
         * (MetricsAndOperator).
         * </p>
         * 
         * @param filter
         *        Specifies a metrics configuration filter. The metrics configuration will only include objects that
         *        meet the filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a
         *        conjunction (MetricsAndOperator).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(MetricsFilter filter);

        /**
         * <p>
         * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the
         * filter's criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction
         * (MetricsAndOperator).
         * </p>
         * This is a convenience method that creates an instance of the {@link MetricsFilter.Builder} avoiding the need
         * to create one manually via {@link MetricsFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link MetricsFilter.Builder#build()} is called immediately and its
         * result is passed to {@link #filter(MetricsFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link MetricsFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(MetricsFilter)
         */
        default Builder filter(Consumer<MetricsFilter.Builder> filter) {
            return filter(MetricsFilter.builder().applyMutation(filter).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private MetricsFilter filter;

        private BuilderImpl() {
        }

        private BuilderImpl(MetricsConfiguration model) {
            id(model.id);
            filter(model.filter);
        }

        public final String getId() {
            return id;
        }

        public final void setId(String id) {
            this.id = id;
        }

        @Override
        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final MetricsFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(MetricsFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(MetricsFilter filter) {
            this.filter = filter;
            return this;
        }

        @Override
        public MetricsConfiguration build() {
            return new MetricsConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
