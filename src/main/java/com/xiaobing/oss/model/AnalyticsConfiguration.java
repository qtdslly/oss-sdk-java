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
 * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AnalyticsConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<AnalyticsConfiguration.Builder, AnalyticsConfiguration> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(AnalyticsConfiguration::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Id").unmarshallLocationName("Id")
                    .build()).build();

    private static final SdkField<AnalyticsFilter> FILTER_FIELD = SdkField
            .<AnalyticsFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(AnalyticsConfiguration::filter))
            .setter(setter(Builder::filter))
            .constructor(AnalyticsFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final SdkField<StorageClassAnalysis> STORAGE_CLASS_ANALYSIS_FIELD = SdkField
            .<StorageClassAnalysis> builder(MarshallingType.SDK_POJO)
            .memberName("StorageClassAnalysis")
            .getter(getter(AnalyticsConfiguration::storageClassAnalysis))
            .setter(setter(Builder::storageClassAnalysis))
            .constructor(StorageClassAnalysis::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClassAnalysis")
                    .unmarshallLocationName("StorageClassAnalysis").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD, FILTER_FIELD,
            STORAGE_CLASS_ANALYSIS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final AnalyticsFilter filter;

    private final StorageClassAnalysis storageClassAnalysis;

    private AnalyticsConfiguration(BuilderImpl builder) {
        this.id = builder.id;
        this.filter = builder.filter;
        this.storageClassAnalysis = builder.storageClassAnalysis;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     * 
     * @return The ID that identifies the analytics configuration.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one
     * conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
     * </p>
     * 
     * @return The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one
     *         tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered
     *         in any analysis.
     */
    public final AnalyticsFilter filter() {
        return filter;
    }

    /**
     * <p>
     * Contains data related to access patterns to be collected and made available to analyze the tradeoffs between
     * different storage classes.
     * </p>
     * 
     * @return Contains data related to access patterns to be collected and made available to analyze the tradeoffs
     *         between different storage classes.
     */
    public final StorageClassAnalysis storageClassAnalysis() {
        return storageClassAnalysis;
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
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAnalysis());
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
        if (!(obj instanceof AnalyticsConfiguration)) {
            return false;
        }
        AnalyticsConfiguration other = (AnalyticsConfiguration) obj;
        return Objects.equals(id(), other.id()) && Objects.equals(filter(), other.filter())
                && Objects.equals(storageClassAnalysis(), other.storageClassAnalysis());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AnalyticsConfiguration").add("Id", id()).add("Filter", filter())
                .add("StorageClassAnalysis", storageClassAnalysis()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        case "StorageClassAnalysis":
            return Optional.ofNullable(clazz.cast(storageClassAnalysis()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AnalyticsConfiguration, T> g) {
        return obj -> g.apply((AnalyticsConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AnalyticsConfiguration> {
        /**
         * <p>
         * The ID that identifies the analytics configuration.
         * </p>
         * 
         * @param id
         *        The ID that identifies the analytics configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or
         * one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any
         * analysis.
         * </p>
         * 
         * @param filter
         *        The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one
         *        tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be
         *        considered in any analysis.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(AnalyticsFilter filter);

        /**
         * <p>
         * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or
         * one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any
         * analysis.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsFilter.Builder} avoiding the
         * need to create one manually via {@link AnalyticsFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsFilter.Builder#build()} is called immediately and its
         * result is passed to {@link #filter(AnalyticsFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link AnalyticsFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(AnalyticsFilter)
         */
        default Builder filter(Consumer<AnalyticsFilter.Builder> filter) {
            return filter(AnalyticsFilter.builder().applyMutation(filter).build());
        }

        /**
         * <p>
         * Contains data related to access patterns to be collected and made available to analyze the tradeoffs between
         * different storage classes.
         * </p>
         * 
         * @param storageClassAnalysis
         *        Contains data related to access patterns to be collected and made available to analyze the tradeoffs
         *        between different storage classes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder storageClassAnalysis(StorageClassAnalysis storageClassAnalysis);

        /**
         * <p>
         * Contains data related to access patterns to be collected and made available to analyze the tradeoffs between
         * different storage classes.
         * </p>
         * This is a convenience method that creates an instance of the {@link StorageClassAnalysis.Builder} avoiding
         * the need to create one manually via {@link StorageClassAnalysis#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link StorageClassAnalysis.Builder#build()} is called immediately and
         * its result is passed to {@link #storageClassAnalysis(StorageClassAnalysis)}.
         * 
         * @param storageClassAnalysis
         *        a consumer that will call methods on {@link StorageClassAnalysis.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #storageClassAnalysis(StorageClassAnalysis)
         */
        default Builder storageClassAnalysis(Consumer<StorageClassAnalysis.Builder> storageClassAnalysis) {
            return storageClassAnalysis(StorageClassAnalysis.builder().applyMutation(storageClassAnalysis).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private AnalyticsFilter filter;

        private StorageClassAnalysis storageClassAnalysis;

        private BuilderImpl() {
        }

        private BuilderImpl(AnalyticsConfiguration model) {
            id(model.id);
            filter(model.filter);
            storageClassAnalysis(model.storageClassAnalysis);
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

        public final AnalyticsFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(AnalyticsFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(AnalyticsFilter filter) {
            this.filter = filter;
            return this;
        }

        public final StorageClassAnalysis.Builder getStorageClassAnalysis() {
            return storageClassAnalysis != null ? storageClassAnalysis.toBuilder() : null;
        }

        public final void setStorageClassAnalysis(StorageClassAnalysis.BuilderImpl storageClassAnalysis) {
            this.storageClassAnalysis = storageClassAnalysis != null ? storageClassAnalysis.build() : null;
        }

        @Override
        public final Builder storageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
            this.storageClassAnalysis = storageClassAnalysis;
            return this;
        }

        @Override
        public AnalyticsConfiguration build() {
            return new AnalyticsConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
