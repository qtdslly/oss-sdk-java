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
public final class ListBucketIntelligentTieringConfigurationsResponse extends S3Response
        implements
        ToCopyableBuilder<ListBucketIntelligentTieringConfigurationsResponse.Builder, ListBucketIntelligentTieringConfigurationsResponse> {
    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListBucketIntelligentTieringConfigurationsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContinuationToken")
            .getter(getter(ListBucketIntelligentTieringConfigurationsResponse::continuationToken))
            .setter(setter(Builder::continuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ContinuationToken")
                    .unmarshallLocationName("ContinuationToken").build()).build();

    private static final SdkField<String> NEXT_CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextContinuationToken")
            .getter(getter(ListBucketIntelligentTieringConfigurationsResponse::nextContinuationToken))
            .setter(setter(Builder::nextContinuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextContinuationToken")
                    .unmarshallLocationName("NextContinuationToken").build()).build();

    private static final SdkField<List<IntelligentTieringConfiguration>> INTELLIGENT_TIERING_CONFIGURATION_LIST_FIELD = SdkField
            .<List<IntelligentTieringConfiguration>> builder(MarshallingType.LIST)
            .memberName("IntelligentTieringConfigurationList")
            .getter(getter(ListBucketIntelligentTieringConfigurationsResponse::intelligentTieringConfigurationList))
            .setter(setter(Builder::intelligentTieringConfigurationList))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IntelligentTieringConfiguration")
                    .unmarshallLocationName("IntelligentTieringConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<IntelligentTieringConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(IntelligentTieringConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(IS_TRUNCATED_FIELD,
            CONTINUATION_TOKEN_FIELD, NEXT_CONTINUATION_TOKEN_FIELD, INTELLIGENT_TIERING_CONFIGURATION_LIST_FIELD));

    private final Boolean isTruncated;

    private final String continuationToken;

    private final String nextContinuationToken;

    private final List<IntelligentTieringConfiguration> intelligentTieringConfigurationList;

    private ListBucketIntelligentTieringConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.isTruncated = builder.isTruncated;
        this.continuationToken = builder.continuationToken;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.intelligentTieringConfigurationList = builder.intelligentTieringConfigurationList;
    }

    /**
     * <p>
     * Indicates whether the returned list of analytics configurations is complete. A value of <code>true</code>
     * indicates that the list is not complete and the <code>NextContinuationToken</code> will be provided for a
     * subsequent request.
     * </p>
     * 
     * @return Indicates whether the returned list of analytics configurations is complete. A value of <code>true</code>
     *         indicates that the list is not complete and the <code>NextContinuationToken</code> will be provided for a
     *         subsequent request.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * The <code>ContinuationToken</code> that represents a placeholder from where this request should begin.
     * </p>
     * 
     * @return The <code>ContinuationToken</code> that represents a placeholder from where this request should begin.
     */
    public final String continuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The marker used to continue this inventory configuration listing. Use the <code>NextContinuationToken</code> from
     * this response to continue the listing in a subsequent request. The continuation token is an opaque value that
     * Amazon S3 understands.
     * </p>
     * 
     * @return The marker used to continue this inventory configuration listing. Use the
     *         <code>NextContinuationToken</code> from this response to continue the listing in a subsequent request.
     *         The continuation token is an opaque value that Amazon S3 understands.
     */
    public final String nextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * For responses, this returns true if the service returned a value for the IntelligentTieringConfigurationList
     * property. This DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()}
     * method on the property). This is useful because the SDK will never return a null collection or map, but you may
     * need to differentiate between the service returning nothing (or null) and the service returning an empty
     * collection or map. For requests, this returns true if a value for the property was specified in the request
     * builder, and false if a value was not specified.
     */
    public final boolean hasIntelligentTieringConfigurationList() {
        return intelligentTieringConfigurationList != null
                && !(intelligentTieringConfigurationList instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of S3 Intelligent-Tiering configurations for a bucket.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasIntelligentTieringConfigurationList}
     * method.
     * </p>
     * 
     * @return The list of S3 Intelligent-Tiering configurations for a bucket.
     */
    public final List<IntelligentTieringConfiguration> intelligentTieringConfigurationList() {
        return intelligentTieringConfigurationList;
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
        hashCode = 31 * hashCode
                + Objects.hashCode(hasIntelligentTieringConfigurationList() ? intelligentTieringConfigurationList() : null);
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
        if (!(obj instanceof ListBucketIntelligentTieringConfigurationsResponse)) {
            return false;
        }
        ListBucketIntelligentTieringConfigurationsResponse other = (ListBucketIntelligentTieringConfigurationsResponse) obj;
        return Objects.equals(isTruncated(), other.isTruncated())
                && Objects.equals(continuationToken(), other.continuationToken())
                && Objects.equals(nextContinuationToken(), other.nextContinuationToken())
                && hasIntelligentTieringConfigurationList() == other.hasIntelligentTieringConfigurationList()
                && Objects.equals(intelligentTieringConfigurationList(), other.intelligentTieringConfigurationList());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString
                .builder("ListBucketIntelligentTieringConfigurationsResponse")
                .add("IsTruncated", isTruncated())
                .add("ContinuationToken", continuationToken())
                .add("NextContinuationToken", nextContinuationToken())
                .add("IntelligentTieringConfigurationList",
                        hasIntelligentTieringConfigurationList() ? intelligentTieringConfigurationList() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "ContinuationToken":
            return Optional.ofNullable(clazz.cast(continuationToken()));
        case "NextContinuationToken":
            return Optional.ofNullable(clazz.cast(nextContinuationToken()));
        case "IntelligentTieringConfigurationList":
            return Optional.ofNullable(clazz.cast(intelligentTieringConfigurationList()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListBucketIntelligentTieringConfigurationsResponse, T> g) {
        return obj -> g.apply((ListBucketIntelligentTieringConfigurationsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, ListBucketIntelligentTieringConfigurationsResponse> {
        /**
         * <p>
         * Indicates whether the returned list of analytics configurations is complete. A value of <code>true</code>
         * indicates that the list is not complete and the <code>NextContinuationToken</code> will be provided for a
         * subsequent request.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of analytics configurations is complete. A value of
         *        <code>true</code> indicates that the list is not complete and the <code>NextContinuationToken</code>
         *        will be provided for a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * The <code>ContinuationToken</code> that represents a placeholder from where this request should begin.
         * </p>
         * 
         * @param continuationToken
         *        The <code>ContinuationToken</code> that represents a placeholder from where this request should begin.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder continuationToken(String continuationToken);

        /**
         * <p>
         * The marker used to continue this inventory configuration listing. Use the <code>NextContinuationToken</code>
         * from this response to continue the listing in a subsequent request. The continuation token is an opaque value
         * that Amazon S3 understands.
         * </p>
         * 
         * @param nextContinuationToken
         *        The marker used to continue this inventory configuration listing. Use the
         *        <code>NextContinuationToken</code> from this response to continue the listing in a subsequent request.
         *        The continuation token is an opaque value that Amazon S3 understands.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextContinuationToken(String nextContinuationToken);

        /**
         * <p>
         * The list of S3 Intelligent-Tiering configurations for a bucket.
         * </p>
         * 
         * @param intelligentTieringConfigurationList
         *        The list of S3 Intelligent-Tiering configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder intelligentTieringConfigurationList(
                Collection<IntelligentTieringConfiguration> intelligentTieringConfigurationList);

        /**
         * <p>
         * The list of S3 Intelligent-Tiering configurations for a bucket.
         * </p>
         * 
         * @param intelligentTieringConfigurationList
         *        The list of S3 Intelligent-Tiering configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder intelligentTieringConfigurationList(IntelligentTieringConfiguration... intelligentTieringConfigurationList);

        /**
         * <p>
         * The list of S3 Intelligent-Tiering configurations for a bucket.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link IntelligentTieringConfiguration.Builder} avoiding the need to
         * create one manually via
         * {@link IntelligentTieringConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link IntelligentTieringConfiguration.Builder#build()} is called
         * immediately and its result is passed to {@link
         * #intelligentTieringConfigurationList(List<IntelligentTieringConfiguration>)}.
         * 
         * @param intelligentTieringConfigurationList
         *        a consumer that will call methods on
         *        {@link IntelligentTieringConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #intelligentTieringConfigurationList(Collection<IntelligentTieringConfiguration>)
         */
        Builder intelligentTieringConfigurationList(
                Consumer<IntelligentTieringConfiguration.Builder>... intelligentTieringConfigurationList);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Boolean isTruncated;

        private String continuationToken;

        private String nextContinuationToken;

        private List<IntelligentTieringConfiguration> intelligentTieringConfigurationList = DefaultSdkAutoConstructList
                .getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(ListBucketIntelligentTieringConfigurationsResponse model) {
            super(model);
            isTruncated(model.isTruncated);
            continuationToken(model.continuationToken);
            nextContinuationToken(model.nextContinuationToken);
            intelligentTieringConfigurationList(model.intelligentTieringConfigurationList);
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

        public final List<IntelligentTieringConfiguration.Builder> getIntelligentTieringConfigurationList() {
            List<IntelligentTieringConfiguration.Builder> result = IntelligentTieringConfigurationListCopier
                    .copyToBuilder(this.intelligentTieringConfigurationList);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setIntelligentTieringConfigurationList(
                Collection<IntelligentTieringConfiguration.BuilderImpl> intelligentTieringConfigurationList) {
            this.intelligentTieringConfigurationList = IntelligentTieringConfigurationListCopier
                    .copyFromBuilder(intelligentTieringConfigurationList);
        }

        @Override
        public final Builder intelligentTieringConfigurationList(
                Collection<IntelligentTieringConfiguration> intelligentTieringConfigurationList) {
            this.intelligentTieringConfigurationList = IntelligentTieringConfigurationListCopier
                    .copy(intelligentTieringConfigurationList);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder intelligentTieringConfigurationList(
                IntelligentTieringConfiguration... intelligentTieringConfigurationList) {
            intelligentTieringConfigurationList(Arrays.asList(intelligentTieringConfigurationList));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder intelligentTieringConfigurationList(
                Consumer<IntelligentTieringConfiguration.Builder>... intelligentTieringConfigurationList) {
            intelligentTieringConfigurationList(Stream.of(intelligentTieringConfigurationList)
                    .map(c -> IntelligentTieringConfiguration.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public ListBucketIntelligentTieringConfigurationsResponse build() {
            return new ListBucketIntelligentTieringConfigurationsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
