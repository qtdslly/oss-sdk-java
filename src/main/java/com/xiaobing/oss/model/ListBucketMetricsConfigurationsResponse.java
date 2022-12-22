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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.ListTrait;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructList;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class ListBucketMetricsConfigurationsResponse extends S3Response implements
        ToCopyableBuilder<ListBucketMetricsConfigurationsResponse.Builder, ListBucketMetricsConfigurationsResponse> {
    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListBucketMetricsConfigurationsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContinuationToken")
            .getter(getter(ListBucketMetricsConfigurationsResponse::continuationToken))
            .setter(setter(Builder::continuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ContinuationToken")
                    .unmarshallLocationName("ContinuationToken").build()).build();

    private static final SdkField<String> NEXT_CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextContinuationToken")
            .getter(getter(ListBucketMetricsConfigurationsResponse::nextContinuationToken))
            .setter(setter(Builder::nextContinuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextContinuationToken")
                    .unmarshallLocationName("NextContinuationToken").build()).build();

    private static final SdkField<List<MetricsConfiguration>> METRICS_CONFIGURATION_LIST_FIELD = SdkField
            .<List<MetricsConfiguration>> builder(MarshallingType.LIST)
            .memberName("MetricsConfigurationList")
            .getter(getter(ListBucketMetricsConfigurationsResponse::metricsConfigurationList))
            .setter(setter(Builder::metricsConfigurationList))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MetricsConfiguration")
                    .unmarshallLocationName("MetricsConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<MetricsConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(MetricsConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(IS_TRUNCATED_FIELD,
            CONTINUATION_TOKEN_FIELD, NEXT_CONTINUATION_TOKEN_FIELD, METRICS_CONFIGURATION_LIST_FIELD));

    private final Boolean isTruncated;

    private final String continuationToken;

    private final String nextContinuationToken;

    private final List<MetricsConfiguration> metricsConfigurationList;

    private ListBucketMetricsConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.isTruncated = builder.isTruncated;
        this.continuationToken = builder.continuationToken;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.metricsConfigurationList = builder.metricsConfigurationList;
    }

    /**
     * <p>
     * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the
     * list is not complete and the NextContinuationToken will be provided for a subsequent request.
     * </p>
     * 
     * @return Indicates whether the returned list of metrics configurations is complete. A value of true indicates that
     *         the list is not complete and the NextContinuationToken will be provided for a subsequent request.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this metrics configuration list response. This value is present
     * if it was sent in the request.
     * </p>
     * 
     * @return The marker that is used as a starting point for this metrics configuration list response. This value is
     *         present if it was sent in the request.
     */
    public final String continuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The marker used to continue a metrics configuration listing that has been truncated. Use the
     * <code>NextContinuationToken</code> from a previously truncated list response to continue the listing. The
     * continuation token is an opaque value that Amazon S3 understands.
     * </p>
     * 
     * @return The marker used to continue a metrics configuration listing that has been truncated. Use the
     *         <code>NextContinuationToken</code> from a previously truncated list response to continue the listing. The
     *         continuation token is an opaque value that Amazon S3 understands.
     */
    public final String nextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * For responses, this returns true if the service returned a value for the MetricsConfigurationList property. This
     * DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the
     * property). This is useful because the SDK will never return a null collection or map, but you may need to
     * differentiate between the service returning nothing (or null) and the service returning an empty collection or
     * map. For requests, this returns true if a value for the property was specified in the request builder, and false
     * if a value was not specified.
     */
    public final boolean hasMetricsConfigurationList() {
        return metricsConfigurationList != null && !(metricsConfigurationList instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of metrics configurations for a bucket.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasMetricsConfigurationList} method.
     * </p>
     * 
     * @return The list of metrics configurations for a bucket.
     */
    public final List<MetricsConfiguration> metricsConfigurationList() {
        return metricsConfigurationList;
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
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(continuationToken());
        hashCode = 31 * hashCode + Objects.hashCode(nextContinuationToken());
        hashCode = 31 * hashCode + Objects.hashCode(hasMetricsConfigurationList() ? metricsConfigurationList() : null);
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
        if (!(obj instanceof ListBucketMetricsConfigurationsResponse)) {
            return false;
        }
        ListBucketMetricsConfigurationsResponse other = (ListBucketMetricsConfigurationsResponse) obj;
        return Objects.equals(isTruncated(), other.isTruncated())
                && Objects.equals(continuationToken(), other.continuationToken())
                && Objects.equals(nextContinuationToken(), other.nextContinuationToken())
                && hasMetricsConfigurationList() == other.hasMetricsConfigurationList()
                && Objects.equals(metricsConfigurationList(), other.metricsConfigurationList());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListBucketMetricsConfigurationsResponse").add("IsTruncated", isTruncated())
                .add("ContinuationToken", continuationToken()).add("NextContinuationToken", nextContinuationToken())
                .add("MetricsConfigurationList", hasMetricsConfigurationList() ? metricsConfigurationList() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "ContinuationToken":
            return Optional.ofNullable(clazz.cast(continuationToken()));
        case "NextContinuationToken":
            return Optional.ofNullable(clazz.cast(nextContinuationToken()));
        case "MetricsConfigurationList":
            return Optional.ofNullable(clazz.cast(metricsConfigurationList()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListBucketMetricsConfigurationsResponse, T> g) {
        return obj -> g.apply((ListBucketMetricsConfigurationsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, ListBucketMetricsConfigurationsResponse> {
        /**
         * <p>
         * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the
         * list is not complete and the NextContinuationToken will be provided for a subsequent request.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of metrics configurations is complete. A value of true indicates
         *        that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * The marker that is used as a starting point for this metrics configuration list response. This value is
         * present if it was sent in the request.
         * </p>
         * 
         * @param continuationToken
         *        The marker that is used as a starting point for this metrics configuration list response. This value
         *        is present if it was sent in the request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder continuationToken(String continuationToken);

        /**
         * <p>
         * The marker used to continue a metrics configuration listing that has been truncated. Use the
         * <code>NextContinuationToken</code> from a previously truncated list response to continue the listing. The
         * continuation token is an opaque value that Amazon S3 understands.
         * </p>
         * 
         * @param nextContinuationToken
         *        The marker used to continue a metrics configuration listing that has been truncated. Use the
         *        <code>NextContinuationToken</code> from a previously truncated list response to continue the listing.
         *        The continuation token is an opaque value that Amazon S3 understands.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextContinuationToken(String nextContinuationToken);

        /**
         * <p>
         * The list of metrics configurations for a bucket.
         * </p>
         * 
         * @param metricsConfigurationList
         *        The list of metrics configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder metricsConfigurationList(Collection<MetricsConfiguration> metricsConfigurationList);

        /**
         * <p>
         * The list of metrics configurations for a bucket.
         * </p>
         * 
         * @param metricsConfigurationList
         *        The list of metrics configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder metricsConfigurationList(MetricsConfiguration... metricsConfigurationList);

        /**
         * <p>
         * The list of metrics configurations for a bucket.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link MetricsConfiguration.Builder} avoiding the need to create one
         * manually via {@link MetricsConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link MetricsConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #metricsConfigurationList(List<MetricsConfiguration>)}.
         * 
         * @param metricsConfigurationList
         *        a consumer that will call methods on
         *        {@link MetricsConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #metricsConfigurationList(Collection<MetricsConfiguration>)
         */
        Builder metricsConfigurationList(Consumer<MetricsConfiguration.Builder>... metricsConfigurationList);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean isTruncated;

        private String continuationToken;

        private String nextContinuationToken;

        private List<MetricsConfiguration> metricsConfigurationList = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(ListBucketMetricsConfigurationsResponse model) {
            super(model);
            isTruncated(model.isTruncated);
            continuationToken(model.continuationToken);
            nextContinuationToken(model.nextContinuationToken);
            metricsConfigurationList(model.metricsConfigurationList);
        }

        public final Boolean getIsTruncated() {
            return isTruncated;
        }

        public final void setIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
        }

        @Override
        public final Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        public final String getContinuationToken() {
            return continuationToken;
        }

        public final void setContinuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
        }

        @Override
        public final Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        public final String getNextContinuationToken() {
            return nextContinuationToken;
        }

        public final void setNextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
        }

        @Override
        public final Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
            return this;
        }

        public final List<MetricsConfiguration.Builder> getMetricsConfigurationList() {
            List<MetricsConfiguration.Builder> result = MetricsConfigurationListCopier
                    .copyToBuilder(this.metricsConfigurationList);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setMetricsConfigurationList(Collection<MetricsConfiguration.BuilderImpl> metricsConfigurationList) {
            this.metricsConfigurationList = MetricsConfigurationListCopier.copyFromBuilder(metricsConfigurationList);
        }

        @Override
        public final Builder metricsConfigurationList(Collection<MetricsConfiguration> metricsConfigurationList) {
            this.metricsConfigurationList = MetricsConfigurationListCopier.copy(metricsConfigurationList);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder metricsConfigurationList(MetricsConfiguration... metricsConfigurationList) {
            metricsConfigurationList(Arrays.asList(metricsConfigurationList));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder metricsConfigurationList(Consumer<MetricsConfiguration.Builder>... metricsConfigurationList) {
            metricsConfigurationList(Stream.of(metricsConfigurationList)
                    .map(c -> MetricsConfiguration.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public ListBucketMetricsConfigurationsResponse build() {
            return new ListBucketMetricsConfigurationsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
