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
 * <p>
 * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
 * </p>
 * <p>
 * For information about the S3 Intelligent-Tiering storage class, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage class
 * for automatically optimizing frequently and infrequently accessed objects</a>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class IntelligentTieringConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<IntelligentTieringConfiguration.Builder, IntelligentTieringConfiguration> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(IntelligentTieringConfiguration::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Id").unmarshallLocationName("Id")
                    .build()).build();

    private static final SdkField<IntelligentTieringFilter> FILTER_FIELD = SdkField
            .<IntelligentTieringFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(IntelligentTieringConfiguration::filter))
            .setter(setter(Builder::filter))
            .constructor(IntelligentTieringFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(IntelligentTieringConfiguration::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<List<Tiering>> TIERINGS_FIELD = SdkField
            .<List<Tiering>> builder(MarshallingType.LIST)
            .memberName("Tierings")
            .getter(getter(IntelligentTieringConfiguration::tierings))
            .setter(setter(Builder::tierings))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tiering")
                    .unmarshallLocationName("Tiering").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<Tiering> builder(MarshallingType.SDK_POJO)
                                            .constructor(Tiering::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD, FILTER_FIELD,
            STATUS_FIELD, TIERINGS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final IntelligentTieringFilter filter;

    private final String status;

    private final List<Tiering> tierings;

    private IntelligentTieringConfiguration(BuilderImpl builder) {
        this.id = builder.id;
        this.filter = builder.filter;
        this.status = builder.status;
        this.tierings = builder.tierings;
    }

    /**
     * <p>
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * </p>
     * 
     * @return The ID used to identify the S3 Intelligent-Tiering configuration.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
     * </p>
     * 
     * @return Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
     */
    public final IntelligentTieringFilter filter() {
        return filter;
    }

    /**
     * <p>
     * Specifies the status of the configuration.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link IntelligentTieringStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies the status of the configuration.
     * @see IntelligentTieringStatus
     */
    public final IntelligentTieringStatus status() {
        return IntelligentTieringStatus.fromValue(status);
    }

    /**
     * <p>
     * Specifies the status of the configuration.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link IntelligentTieringStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies the status of the configuration.
     * @see IntelligentTieringStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * For responses, this returns true if the service returned a value for the Tierings property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasTierings() {
        return tierings != null && !(tierings instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTierings} method.
     * </p>
     * 
     * @return Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
     */
    public final List<Tiering> tierings() {
        return tierings;
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
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasTierings() ? tierings() : null);
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
        if (!(obj instanceof IntelligentTieringConfiguration)) {
            return false;
        }
        IntelligentTieringConfiguration other = (IntelligentTieringConfiguration) obj;
        return Objects.equals(id(), other.id()) && Objects.equals(filter(), other.filter())
                && Objects.equals(statusAsString(), other.statusAsString()) && hasTierings() == other.hasTierings()
                && Objects.equals(tierings(), other.tierings());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("IntelligentTieringConfiguration").add("Id", id()).add("Filter", filter())
                .add("Status", statusAsString()).add("Tierings", hasTierings() ? tierings() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "Tierings":
            return Optional.ofNullable(clazz.cast(tierings()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<IntelligentTieringConfiguration, T> g) {
        return obj -> g.apply((IntelligentTieringConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, IntelligentTieringConfiguration> {
        /**
         * <p>
         * The ID used to identify the S3 Intelligent-Tiering configuration.
         * </p>
         * 
         * @param id
         *        The ID used to identify the S3 Intelligent-Tiering configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
         * </p>
         * 
         * @param filter
         *        Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(IntelligentTieringFilter filter);

        /**
         * <p>
         * Specifies a bucket filter. The configuration only includes objects that meet the filter's criteria.
         * </p>
         * This is a convenience method that creates an instance of the {@link IntelligentTieringFilter.Builder}
         * avoiding the need to create one manually via {@link IntelligentTieringFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link IntelligentTieringFilter.Builder#build()} is called immediately
         * and its result is passed to {@link #filter(IntelligentTieringFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link IntelligentTieringFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(IntelligentTieringFilter)
         */
        default Builder filter(Consumer<IntelligentTieringFilter.Builder> filter) {
            return filter(IntelligentTieringFilter.builder().applyMutation(filter).build());
        }

        /**
         * <p>
         * Specifies the status of the configuration.
         * </p>
         * 
         * @param status
         *        Specifies the status of the configuration.
         * @see IntelligentTieringStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Specifies the status of the configuration.
         * </p>
         * 
         * @param status
         *        Specifies the status of the configuration.
         * @see IntelligentTieringStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringStatus
         */
        Builder status(IntelligentTieringStatus status);

        /**
         * <p>
         * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
         * </p>
         * 
         * @param tierings
         *        Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tierings(Collection<Tiering> tierings);

        /**
         * <p>
         * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
         * </p>
         * 
         * @param tierings
         *        Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tierings(Tiering... tierings);

        /**
         * <p>
         * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Tiering.Builder} avoiding the need to create one manually via
         * {@link Tiering#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tiering.Builder#build()}
         * is called immediately and its result is passed to {@link #tierings(List<Tiering>)}.
         * 
         * @param tierings
         *        a consumer that will call methods on {@link Tiering.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tierings(Collection<Tiering>)
         */
        Builder tierings(Consumer<Tiering.Builder>... tierings);
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private IntelligentTieringFilter filter;

        private String status;

        private List<Tiering> tierings = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(IntelligentTieringConfiguration model) {
            id(model.id);
            filter(model.filter);
            status(model.status);
            tierings(model.tierings);
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

        public final IntelligentTieringFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(IntelligentTieringFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(IntelligentTieringFilter filter) {
            this.filter = filter;
            return this;
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
        public final Builder status(IntelligentTieringStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final List<Tiering.Builder> getTierings() {
            List<Tiering.Builder> result = TieringListCopier.copyToBuilder(this.tierings);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setTierings(Collection<Tiering.BuilderImpl> tierings) {
            this.tierings = TieringListCopier.copyFromBuilder(tierings);
        }

        @Override
        public final Builder tierings(Collection<Tiering> tierings) {
            this.tierings = TieringListCopier.copy(tierings);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tierings(Tiering... tierings) {
            tierings(Arrays.asList(tierings));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tierings(Consumer<Tiering.Builder>... tierings) {
            tierings(Stream.of(tierings).map(c -> Tiering.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public IntelligentTieringConfiguration build() {
            return new IntelligentTieringConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
