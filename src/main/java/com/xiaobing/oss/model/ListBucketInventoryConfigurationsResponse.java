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
public final class ListBucketInventoryConfigurationsResponse extends S3Response implements
        ToCopyableBuilder<ListBucketInventoryConfigurationsResponse.Builder, ListBucketInventoryConfigurationsResponse> {
    private static final SdkField<String> CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContinuationToken")
            .getter(getter(ListBucketInventoryConfigurationsResponse::continuationToken))
            .setter(setter(Builder::continuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ContinuationToken")
                    .unmarshallLocationName("ContinuationToken").build()).build();

    private static final SdkField<List<InventoryConfiguration>> INVENTORY_CONFIGURATION_LIST_FIELD = SdkField
            .<List<InventoryConfiguration>> builder(MarshallingType.LIST)
            .memberName("InventoryConfigurationList")
            .getter(getter(ListBucketInventoryConfigurationsResponse::inventoryConfigurationList))
            .setter(setter(Builder::inventoryConfigurationList))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("InventoryConfiguration")
                    .unmarshallLocationName("InventoryConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<InventoryConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(InventoryConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListBucketInventoryConfigurationsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<String> NEXT_CONTINUATION_TOKEN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("NextContinuationToken")
            .getter(getter(ListBucketInventoryConfigurationsResponse::nextContinuationToken))
            .setter(setter(Builder::nextContinuationToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextContinuationToken")
                    .unmarshallLocationName("NextContinuationToken").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(CONTINUATION_TOKEN_FIELD,
            INVENTORY_CONFIGURATION_LIST_FIELD, IS_TRUNCATED_FIELD, NEXT_CONTINUATION_TOKEN_FIELD));

    private final String continuationToken;

    private final List<InventoryConfiguration> inventoryConfigurationList;

    private final Boolean isTruncated;

    private final String nextContinuationToken;

    private ListBucketInventoryConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.continuationToken = builder.continuationToken;
        this.inventoryConfigurationList = builder.inventoryConfigurationList;
        this.isTruncated = builder.isTruncated;
        this.nextContinuationToken = builder.nextContinuationToken;
    }

    /**
     * <p>
     * If sent in the request, the marker that is used as a starting point for this inventory configuration list
     * response.
     * </p>
     * 
     * @return If sent in the request, the marker that is used as a starting point for this inventory configuration list
     *         response.
     */
    public final String continuationToken() {
        return continuationToken;
    }

    /**
     * For responses, this returns true if the service returned a value for the InventoryConfigurationList property.
     * This DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the
     * property). This is useful because the SDK will never return a null collection or map, but you may need to
     * differentiate between the service returning nothing (or null) and the service returning an empty collection or
     * map. For requests, this returns true if a value for the property was specified in the request builder, and false
     * if a value was not specified.
     */
    public final boolean hasInventoryConfigurationList() {
        return inventoryConfigurationList != null && !(inventoryConfigurationList instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasInventoryConfigurationList} method.
     * </p>
     * 
     * @return The list of inventory configurations for a bucket.
     */
    public final List<InventoryConfiguration> inventoryConfigurationList() {
        return inventoryConfigurationList;
    }

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete. A value of true indicates that the list
     * is not complete and the NextContinuationToken is provided for a subsequent request.
     * </p>
     * 
     * @return Tells whether the returned list of inventory configurations is complete. A value of true indicates that
     *         the list is not complete and the NextContinuationToken is provided for a subsequent request.
     */
    public final Boolean isTruncated() {
        return isTruncated;
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
        hashCode = 31 * hashCode + Objects.hashCode(continuationToken());
        hashCode = 31 * hashCode + Objects.hashCode(hasInventoryConfigurationList() ? inventoryConfigurationList() : null);
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(nextContinuationToken());
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
        if (!(obj instanceof ListBucketInventoryConfigurationsResponse)) {
            return false;
        }
        ListBucketInventoryConfigurationsResponse other = (ListBucketInventoryConfigurationsResponse) obj;
        return Objects.equals(continuationToken(), other.continuationToken())
                && hasInventoryConfigurationList() == other.hasInventoryConfigurationList()
                && Objects.equals(inventoryConfigurationList(), other.inventoryConfigurationList())
                && Objects.equals(isTruncated(), other.isTruncated())
                && Objects.equals(nextContinuationToken(), other.nextContinuationToken());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListBucketInventoryConfigurationsResponse").add("ContinuationToken", continuationToken())
                .add("InventoryConfigurationList", hasInventoryConfigurationList() ? inventoryConfigurationList() : null)
                .add("IsTruncated", isTruncated()).add("NextContinuationToken", nextContinuationToken()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ContinuationToken":
            return Optional.ofNullable(clazz.cast(continuationToken()));
        case "InventoryConfigurationList":
            return Optional.ofNullable(clazz.cast(inventoryConfigurationList()));
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "NextContinuationToken":
            return Optional.ofNullable(clazz.cast(nextContinuationToken()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListBucketInventoryConfigurationsResponse, T> g) {
        return obj -> g.apply((ListBucketInventoryConfigurationsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, ListBucketInventoryConfigurationsResponse> {
        /**
         * <p>
         * If sent in the request, the marker that is used as a starting point for this inventory configuration list
         * response.
         * </p>
         * 
         * @param continuationToken
         *        If sent in the request, the marker that is used as a starting point for this inventory configuration
         *        list response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder continuationToken(String continuationToken);

        /**
         * <p>
         * The list of inventory configurations for a bucket.
         * </p>
         * 
         * @param inventoryConfigurationList
         *        The list of inventory configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder inventoryConfigurationList(Collection<InventoryConfiguration> inventoryConfigurationList);

        /**
         * <p>
         * The list of inventory configurations for a bucket.
         * </p>
         * 
         * @param inventoryConfigurationList
         *        The list of inventory configurations for a bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder inventoryConfigurationList(InventoryConfiguration... inventoryConfigurationList);

        /**
         * <p>
         * The list of inventory configurations for a bucket.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link InventoryConfiguration.Builder} avoiding the need to create
         * one manually via {@link InventoryConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link InventoryConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #inventoryConfigurationList(List<InventoryConfiguration>)}.
         * 
         * @param inventoryConfigurationList
         *        a consumer that will call methods on
         *        {@link InventoryConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #inventoryConfigurationList(Collection<InventoryConfiguration>)
         */
        Builder inventoryConfigurationList(Consumer<InventoryConfiguration.Builder>... inventoryConfigurationList);

        /**
         * <p>
         * Tells whether the returned list of inventory configurations is complete. A value of true indicates that the
         * list is not complete and the NextContinuationToken is provided for a subsequent request.
         * </p>
         * 
         * @param isTruncated
         *        Tells whether the returned list of inventory configurations is complete. A value of true indicates
         *        that the list is not complete and the NextContinuationToken is provided for a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

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
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String continuationToken;

        private List<InventoryConfiguration> inventoryConfigurationList = DefaultSdkAutoConstructList.getInstance();

        private Boolean isTruncated;

        private String nextContinuationToken;

        private BuilderImpl() {
        }

        private BuilderImpl(ListBucketInventoryConfigurationsResponse model) {
            super(model);
            continuationToken(model.continuationToken);
            inventoryConfigurationList(model.inventoryConfigurationList);
            isTruncated(model.isTruncated);
            nextContinuationToken(model.nextContinuationToken);
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

        public final List<InventoryConfiguration.Builder> getInventoryConfigurationList() {
            List<InventoryConfiguration.Builder> result = InventoryConfigurationListCopier
                    .copyToBuilder(this.inventoryConfigurationList);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setInventoryConfigurationList(Collection<InventoryConfiguration.BuilderImpl> inventoryConfigurationList) {
            this.inventoryConfigurationList = InventoryConfigurationListCopier.copyFromBuilder(inventoryConfigurationList);
        }

        @Override
        public final Builder inventoryConfigurationList(Collection<InventoryConfiguration> inventoryConfigurationList) {
            this.inventoryConfigurationList = InventoryConfigurationListCopier.copy(inventoryConfigurationList);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder inventoryConfigurationList(InventoryConfiguration... inventoryConfigurationList) {
            inventoryConfigurationList(Arrays.asList(inventoryConfigurationList));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder inventoryConfigurationList(Consumer<InventoryConfiguration.Builder>... inventoryConfigurationList) {
            inventoryConfigurationList(Stream.of(inventoryConfigurationList)
                    .map(c -> InventoryConfiguration.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
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

        @Override
        public ListBucketInventoryConfigurationsResponse build() {
            return new ListBucketInventoryConfigurationsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
