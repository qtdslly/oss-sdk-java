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
public final class ListBucketAnalyticsConfigurationsResponse extends S3Response implements
        ToCopyableBuilder<ListBucketAnalyticsConfigurationsResponse.Builder, ListBucketAnalyticsConfigurationsResponse> {
    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListBucketAnalyticsConfigurationsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContinuationToken")
            .getter(getter(ListBucketAnalyticsConfigurationsResponse::continuationToken))
            .setter(setter(Builder::continuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ContinuationToken")
                    .unmarshallLocationName("ContinuationToken").build()).build();

    private static final SdkField<String> NEXT_CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextContinuationToken")
            .getter(getter(ListBucketAnalyticsConfigurationsResponse::nextContinuationToken))
            .setter(setter(Builder::nextContinuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextContinuationToken")
                    .unmarshallLocationName("NextContinuationToken").build()).build();

    private static final SdkField<List<AnalyticsConfiguration>> ANALYTICS_CONFIGURATION_LIST_FIELD = SdkField
            .<List<AnalyticsConfiguration>> builder(MarshallingType.LIST)
            .memberName("AnalyticsConfigurationList")
            .getter(getter(ListBucketAnalyticsConfigurationsResponse::analyticsConfigurationList))
            .setter(setter(Builder::analyticsConfigurationList))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AnalyticsConfiguration")
                    .unmarshallLocationName("AnalyticsConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<AnalyticsConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(AnalyticsConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(IS_TRUNCATED_FIELD,
            CONTINUATION_TOKEN_FIELD, NEXT_CONTINUATION_TOKEN_FIELD, ANALYTICS_CONFIGURATION_LIST_FIELD));

    private final Boolean isTruncated;

    private final String continuationToken;

    private final String nextContinuationToken;

    private final List<AnalyticsConfiguration> analyticsConfigurationList;

    private ListBucketAnalyticsConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.isTruncated = builder.isTruncated;
        this.continuationToken = builder.continuationToken;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.analyticsConfigurationList = builder.analyticsConfigurationList;
    }

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the
     * list is not complete and the NextContinuationToken will be provided for a subsequent request.
     * </p>
     * 
     * @return Indicates whether the returned list of analytics configurations is complete. A value of true indicates
     *         that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * The marker that is used as a starting point for this analytics configuration list response. This value is present
     * if it was sent in the request.
     * </p>
     * 
     * @return The marker that is used as a starting point for this analytics configuration list response. This value is
     *         present if it was sent in the request.
     */
    public final String continuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * <code>NextContinuationToken</code> is sent when <code>isTruncated</code> is true, which indicates that there are
     * more analytics configurations to list. The next request must include this <code>NextContinuationToken</code>. The
     * token is obfuscated and is not a usable value.
     * </p>
     * 
     * @return <code>NextContinuationToken</code> is sent when <code>isTruncated</code> is true, which indicates that
     *         there are more analytics configurations to list. The next request must include this
     *         <code>NextContinuationToken</code>. The token is obfuscated and is not a usable value.
     */
    public final String nextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * For responses, this returns true if the service returned a value for the AnalyticsConfigurationList property.
     * This DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the
     * property). This is useful because the SDK will never return a null collection or map, but you may need to
     * differentiate between the service returning nothing (or null) and the service returning an empty collection or
     * map. For requests, this returns true if a value for the property was specified in the request builder, and false
     * if a value was not specified.
     */
    public final boolean hasAnalyticsConfigurationList() {
        return analyticsConfigurationList != null && !(analyticsConfigurationList instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of analytics configurations for a bucket.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasAnalyticsConfigurationList} method.
     * </p>
     * 
     * @return The list of analytics configurations for a bucket.
     */
    public final List<AnalyticsConfiguration> analyticsConfigurationList() {
        return analyticsConfigurationList;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasAnalyticsConfigurationList() ? analyticsConfigurationList() : null);
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
        if (!(obj instanceof ListBucketAnalyticsConfigurationsResponse)) {
            return false;
        }
        ListBucketAnalyticsConfigurationsResponse other = (ListBucketAnalyticsConfigurationsResponse) obj;
        return Objects.equals(isTruncated(), other.isTruncated())
                && Objects.equals(continuationToken(), other.continuationToken())
                && Objects.equals(nextContinuationToken(), other.nextContinuationToken())
                && hasAnalyticsConfigurationList() == other.hasAnalyticsConfigurationList()
                && Objects.equals(analyticsConfigurationList(), other.analyticsConfigurationList());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListBucketAnalyticsConfigurationsResponse").add("IsTruncated", isTruncated())
                .add("ContinuationToken", continuationToken()).add("NextContinuationToken", nextContinuationToken())
                .add("AnalyticsConfigurationList", hasAnalyticsConfigurationList() ? analyticsConfigurationList() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "ContinuationToken":
            return Optional.ofNullable(clazz.cast(continuationToken()));
        case "NextContinuationToken":
            return Optional.ofNullable(clazz.cast(nextContinuationToken()));
        case "AnalyticsConfigurationList":
            return Optional.ofNullable(clazz.cast(analyticsConfigurationList()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListBucketAnalyticsConfigurationsResponse, T> g) {
        return obj -> g.apply((ListBucketAnalyticsConfigurationsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, ListBucketAnalyticsConfigurationsResponse> {
        /**
         * <p>
         * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that
         * the list is not complete and the NextContinuationToken will be provided for a subsequent request.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of analytics configurations is complete. A value of true indicates
         *        that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * The marker that is used as a starting point for this analytics configuration list response. This value is
         * present if it was sent in the request.
         * </p>
         * 
         * @param continuationToken
         *        The marker that is used as a starting point for this analytics configuration list response. This value
         *        is present if it was sent in the request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder continuationToken(String continuationToken);

        /**
         * <p>
         * <code>NextContinuationToken</code> is sent when <code>isTruncated</code> is true, which indicates that there
         * are more analytics configurations to list. The next request must include this
         * <code>NextContinuationToken</code>. The token is obfuscated and is not a usable value.
         * </p>
         * 
         * @param nextContinuationToken
         *        <code>NextContinuationToken</code> is sent when <code>isTruncated</code> is true, which indicates that
         *        there are more analytics configurations to list. The next request must include this
         *        <code>NextContinuationToken</code>. The token is obfuscated and is not a usable value.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextContinuationToken(String nextContinuationToken);

        /**
         * <p>
         * The list of analytics configurations for a bucket.
         * </p>
         * 
         * @param analyticsConfigurationList
         *        The list of analytics configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder analyticsConfigurationList(Collection<AnalyticsConfiguration> analyticsConfigurationList);

        /**
         * <p>
         * The list of analytics configurations for a bucket.
         * </p>
         * 
         * @param analyticsConfigurationList
         *        The list of analytics configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder analyticsConfigurationList(AnalyticsConfiguration... analyticsConfigurationList);

        /**
         * <p>
         * The list of analytics configurations for a bucket.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link AnalyticsConfiguration.Builder} avoiding the need to create
         * one manually via {@link AnalyticsConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link AnalyticsConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #analyticsConfigurationList(List<AnalyticsConfiguration>)}.
         * 
         * @param analyticsConfigurationList
         *        a consumer that will call methods on
         *        {@link AnalyticsConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #analyticsConfigurationList(Collection<AnalyticsConfiguration>)
         */
        Builder analyticsConfigurationList(Consumer<AnalyticsConfiguration.Builder>... analyticsConfigurationList);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean isTruncated;

        private String continuationToken;

        private String nextContinuationToken;

        private List<AnalyticsConfiguration> analyticsConfigurationList = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(ListBucketAnalyticsConfigurationsResponse model) {
            super(model);
            isTruncated(model.isTruncated);
            continuationToken(model.continuationToken);
            nextContinuationToken(model.nextContinuationToken);
            analyticsConfigurationList(model.analyticsConfigurationList);
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

        public final List<AnalyticsConfiguration.Builder> getAnalyticsConfigurationList() {
            List<AnalyticsConfiguration.Builder> result = AnalyticsConfigurationListCopier
                    .copyToBuilder(this.analyticsConfigurationList);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setAnalyticsConfigurationList(Collection<AnalyticsConfiguration.BuilderImpl> analyticsConfigurationList) {
            this.analyticsConfigurationList = AnalyticsConfigurationListCopier.copyFromBuilder(analyticsConfigurationList);
        }

        @Override
        public final Builder analyticsConfigurationList(Collection<AnalyticsConfiguration> analyticsConfigurationList) {
            this.analyticsConfigurationList = AnalyticsConfigurationListCopier.copy(analyticsConfigurationList);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder analyticsConfigurationList(AnalyticsConfiguration... analyticsConfigurationList) {
            analyticsConfigurationList(Arrays.asList(analyticsConfigurationList));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder analyticsConfigurationList(Consumer<AnalyticsConfiguration.Builder>... analyticsConfigurationList) {
            analyticsConfigurationList(Stream.of(analyticsConfigurationList)
                    .map(c -> AnalyticsConfiguration.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public ListBucketAnalyticsConfigurationsResponse build() {
            return new ListBucketAnalyticsConfigurationsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
