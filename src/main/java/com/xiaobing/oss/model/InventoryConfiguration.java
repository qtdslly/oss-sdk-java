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
 * Specifies the inventory configuration for an Amazon S3 bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html">GET Bucket inventory</a> in
 * the <i>Amazon S3 API Reference</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InventoryConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<InventoryConfiguration.Builder, InventoryConfiguration> {
    private static final SdkField<InventoryDestination> DESTINATION_FIELD = SdkField
            .<InventoryDestination> builder(MarshallingType.SDK_POJO)
            .memberName("Destination")
            .getter(getter(InventoryConfiguration::destination))
            .setter(setter(Builder::destination))
            .constructor(InventoryDestination::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Destination")
                    .unmarshallLocationName("Destination").build()).build();

    private static final SdkField<Boolean> IS_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsEnabled")
            .getter(getter(InventoryConfiguration::isEnabled))
            .setter(setter(Builder::isEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsEnabled")
                    .unmarshallLocationName("IsEnabled").build()).build();

    private static final SdkField<InventoryFilter> FILTER_FIELD = SdkField
            .<InventoryFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(InventoryConfiguration::filter))
            .setter(setter(Builder::filter))
            .constructor(InventoryFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(InventoryConfiguration::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Id").unmarshallLocationName("Id")
                    .build()).build();

    private static final SdkField<String> INCLUDED_OBJECT_VERSIONS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("IncludedObjectVersions")
            .getter(getter(InventoryConfiguration::includedObjectVersionsAsString))
            .setter(setter(Builder::includedObjectVersions))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IncludedObjectVersions")
                    .unmarshallLocationName("IncludedObjectVersions").build()).build();

    private static final SdkField<List<String>> OPTIONAL_FIELDS_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("OptionalFields")
            .getter(getter(InventoryConfiguration::optionalFieldsAsStrings))
            .setter(setter(Builder::optionalFieldsWithStrings))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OptionalFields")
                    .unmarshallLocationName("OptionalFields").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Field")
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Field").unmarshallLocationName("Field").build()).build())
                            .build()).build();

    private static final SdkField<InventorySchedule> SCHEDULE_FIELD = SdkField
            .<InventorySchedule> builder(MarshallingType.SDK_POJO)
            .memberName("Schedule")
            .getter(getter(InventoryConfiguration::schedule))
            .setter(setter(Builder::schedule))
            .constructor(InventorySchedule::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Schedule")
                    .unmarshallLocationName("Schedule").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DESTINATION_FIELD,
            IS_ENABLED_FIELD, FILTER_FIELD, ID_FIELD, INCLUDED_OBJECT_VERSIONS_FIELD, OPTIONAL_FIELDS_FIELD, SCHEDULE_FIELD));

    private static final long serialVersionUID = 1L;

    private final InventoryDestination destination;

    private final Boolean isEnabled;

    private final InventoryFilter filter;

    private final String id;

    private final String includedObjectVersions;

    private final List<String> optionalFields;

    private final InventorySchedule schedule;

    private InventoryConfiguration(BuilderImpl builder) {
        this.destination = builder.destination;
        this.isEnabled = builder.isEnabled;
        this.filter = builder.filter;
        this.id = builder.id;
        this.includedObjectVersions = builder.includedObjectVersions;
        this.optionalFields = builder.optionalFields;
        this.schedule = builder.schedule;
    }

    /**
     * <p>
     * Contains information about where to publish the inventory results.
     * </p>
     * 
     * @return Contains information about where to publish the inventory results.
     */
    public final InventoryDestination destination() {
        return destination;
    }

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to <code>True</code>, an inventory list is
     * generated. If set to <code>False</code>, no inventory list is generated.
     * </p>
     * 
     * @return Specifies whether the inventory is enabled or disabled. If set to <code>True</code>, an inventory list is
     *         generated. If set to <code>False</code>, no inventory list is generated.
     */
    public final Boolean isEnabled() {
        return isEnabled;
    }

    /**
     * <p>
     * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
     * </p>
     * 
     * @return Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
     */
    public final InventoryFilter filter() {
        return filter;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     * 
     * @return The ID used to identify the inventory configuration.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the object
     * versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
     * <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
     * version-related fields.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #includedObjectVersions} will return {@link InventoryIncludedObjectVersions#UNKNOWN_TO_SDK_VERSION}. The
     * raw value returned by the service is available from {@link #includedObjectVersionsAsString}.
     * </p>
     * 
     * @return Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the
     *         object versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
     *         <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
     *         version-related fields.
     * @see InventoryIncludedObjectVersions
     */
    public final InventoryIncludedObjectVersions includedObjectVersions() {
        return InventoryIncludedObjectVersions.fromValue(includedObjectVersions);
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the object
     * versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
     * <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
     * version-related fields.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #includedObjectVersions} will return {@link InventoryIncludedObjectVersions#UNKNOWN_TO_SDK_VERSION}. The
     * raw value returned by the service is available from {@link #includedObjectVersionsAsString}.
     * </p>
     * 
     * @return Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the
     *         object versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
     *         <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
     *         version-related fields.
     * @see InventoryIncludedObjectVersions
     */
    public final String includedObjectVersionsAsString() {
        return includedObjectVersions;
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasOptionalFields} method.
     * </p>
     * 
     * @return Contains the optional fields that are included in the inventory results.
     */
    public final List<InventoryOptionalField> optionalFields() {
        return InventoryOptionalFieldsCopier.copyStringToEnum(optionalFields);
    }

    /**
     * For responses, this returns true if the service returned a value for the OptionalFields property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasOptionalFields() {
        return optionalFields != null && !(optionalFields instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasOptionalFields} method.
     * </p>
     * 
     * @return Contains the optional fields that are included in the inventory results.
     */
    public final List<String> optionalFieldsAsStrings() {
        return optionalFields;
    }

    /**
     * <p>
     * Specifies the schedule for generating inventory results.
     * </p>
     * 
     * @return Specifies the schedule for generating inventory results.
     */
    public final InventorySchedule schedule() {
        return schedule;
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
        hashCode = 31 * hashCode + Objects.hashCode(destination());
        hashCode = 31 * hashCode + Objects.hashCode(isEnabled());
        hashCode = 31 * hashCode + Objects.hashCode(filter());
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(includedObjectVersionsAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasOptionalFields() ? optionalFieldsAsStrings() : null);
        hashCode = 31 * hashCode + Objects.hashCode(schedule());
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
        if (!(obj instanceof InventoryConfiguration)) {
            return false;
        }
        InventoryConfiguration other = (InventoryConfiguration) obj;
        return Objects.equals(destination(), other.destination()) && Objects.equals(isEnabled(), other.isEnabled())
                && Objects.equals(filter(), other.filter()) && Objects.equals(id(), other.id())
                && Objects.equals(includedObjectVersionsAsString(), other.includedObjectVersionsAsString())
                && hasOptionalFields() == other.hasOptionalFields()
                && Objects.equals(optionalFieldsAsStrings(), other.optionalFieldsAsStrings())
                && Objects.equals(schedule(), other.schedule());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("InventoryConfiguration").add("Destination", destination()).add("IsEnabled", isEnabled())
                .add("Filter", filter()).add("Id", id()).add("IncludedObjectVersions", includedObjectVersionsAsString())
                .add("OptionalFields", hasOptionalFields() ? optionalFieldsAsStrings() : null).add("Schedule", schedule())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Destination":
            return Optional.ofNullable(clazz.cast(destination()));
        case "IsEnabled":
            return Optional.ofNullable(clazz.cast(isEnabled()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        case "IncludedObjectVersions":
            return Optional.ofNullable(clazz.cast(includedObjectVersionsAsString()));
        case "OptionalFields":
            return Optional.ofNullable(clazz.cast(optionalFieldsAsStrings()));
        case "Schedule":
            return Optional.ofNullable(clazz.cast(schedule()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InventoryConfiguration, T> g) {
        return obj -> g.apply((InventoryConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InventoryConfiguration> {
        /**
         * <p>
         * Contains information about where to publish the inventory results.
         * </p>
         * 
         * @param destination
         *        Contains information about where to publish the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder destination(InventoryDestination destination);

        /**
         * <p>
         * Contains information about where to publish the inventory results.
         * </p>
         * This is a convenience method that creates an instance of the {@link InventoryDestination.Builder} avoiding
         * the need to create one manually via {@link InventoryDestination#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InventoryDestination.Builder#build()} is called immediately and
         * its result is passed to {@link #destination(InventoryDestination)}.
         * 
         * @param destination
         *        a consumer that will call methods on {@link InventoryDestination.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #destination(InventoryDestination)
         */
        default Builder destination(Consumer<InventoryDestination.Builder> destination) {
            return destination(InventoryDestination.builder().applyMutation(destination).build());
        }

        /**
         * <p>
         * Specifies whether the inventory is enabled or disabled. If set to <code>True</code>, an inventory list is
         * generated. If set to <code>False</code>, no inventory list is generated.
         * </p>
         * 
         * @param isEnabled
         *        Specifies whether the inventory is enabled or disabled. If set to <code>True</code>, an inventory list
         *        is generated. If set to <code>False</code>, no inventory list is generated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isEnabled(Boolean isEnabled);

        /**
         * <p>
         * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
         * </p>
         * 
         * @param filter
         *        Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(InventoryFilter filter);

        /**
         * <p>
         * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
         * </p>
         * This is a convenience method that creates an instance of the {@link InventoryFilter.Builder} avoiding the
         * need to create one manually via {@link InventoryFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InventoryFilter.Builder#build()} is called immediately and its
         * result is passed to {@link #filter(InventoryFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link InventoryFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(InventoryFilter)
         */
        default Builder filter(Consumer<InventoryFilter.Builder> filter) {
            return filter(InventoryFilter.builder().applyMutation(filter).build());
        }

        /**
         * <p>
         * The ID used to identify the inventory configuration.
         * </p>
         * 
         * @param id
         *        The ID used to identify the inventory configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the
         * object versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
         * <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
         * version-related fields.
         * </p>
         * 
         * @param includedObjectVersions
         *        Object versions to include in the inventory list. If set to <code>All</code>, the list includes all
         *        the object versions, which adds the version-related fields <code>VersionId</code>,
         *        <code>IsLatest</code>, and <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the
         *        list does not contain these version-related fields.
         * @see InventoryIncludedObjectVersions
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryIncludedObjectVersions
         */
        Builder includedObjectVersions(String includedObjectVersions);

        /**
         * <p>
         * Object versions to include in the inventory list. If set to <code>All</code>, the list includes all the
         * object versions, which adds the version-related fields <code>VersionId</code>, <code>IsLatest</code>, and
         * <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the list does not contain these
         * version-related fields.
         * </p>
         * 
         * @param includedObjectVersions
         *        Object versions to include in the inventory list. If set to <code>All</code>, the list includes all
         *        the object versions, which adds the version-related fields <code>VersionId</code>,
         *        <code>IsLatest</code>, and <code>DeleteMarker</code> to the list. If set to <code>Current</code>, the
         *        list does not contain these version-related fields.
         * @see InventoryIncludedObjectVersions
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see InventoryIncludedObjectVersions
         */
        Builder includedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions);

        /**
         * <p>
         * Contains the optional fields that are included in the inventory results.
         * </p>
         * 
         * @param optionalFields
         *        Contains the optional fields that are included in the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder optionalFieldsWithStrings(Collection<String> optionalFields);

        /**
         * <p>
         * Contains the optional fields that are included in the inventory results.
         * </p>
         * 
         * @param optionalFields
         *        Contains the optional fields that are included in the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder optionalFieldsWithStrings(String... optionalFields);

        /**
         * <p>
         * Contains the optional fields that are included in the inventory results.
         * </p>
         * 
         * @param optionalFields
         *        Contains the optional fields that are included in the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder optionalFields(Collection<InventoryOptionalField> optionalFields);

        /**
         * <p>
         * Contains the optional fields that are included in the inventory results.
         * </p>
         * 
         * @param optionalFields
         *        Contains the optional fields that are included in the inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder optionalFields(InventoryOptionalField... optionalFields);

        /**
         * <p>
         * Specifies the schedule for generating inventory results.
         * </p>
         * 
         * @param schedule
         *        Specifies the schedule for generating inventory results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder schedule(InventorySchedule schedule);

        /**
         * <p>
         * Specifies the schedule for generating inventory results.
         * </p>
         * This is a convenience method that creates an instance of the {@link InventorySchedule.Builder} avoiding the
         * need to create one manually via {@link InventorySchedule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InventorySchedule.Builder#build()} is called immediately and its
         * result is passed to {@link #schedule(InventorySchedule)}.
         * 
         * @param schedule
         *        a consumer that will call methods on {@link InventorySchedule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #schedule(InventorySchedule)
         */
        default Builder schedule(Consumer<InventorySchedule.Builder> schedule) {
            return schedule(InventorySchedule.builder().applyMutation(schedule).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private InventoryDestination destination;

        private Boolean isEnabled;

        private InventoryFilter filter;

        private String id;

        private String includedObjectVersions;

        private List<String> optionalFields = DefaultSdkAutoConstructList.getInstance();

        private InventorySchedule schedule;

        private BuilderImpl() {
        }

        private BuilderImpl(InventoryConfiguration model) {
            destination(model.destination);
            isEnabled(model.isEnabled);
            filter(model.filter);
            id(model.id);
            includedObjectVersions(model.includedObjectVersions);
            optionalFieldsWithStrings(model.optionalFields);
            schedule(model.schedule);
        }

        public final InventoryDestination.Builder getDestination() {
            return destination != null ? destination.toBuilder() : null;
        }

        public final void setDestination(InventoryDestination.BuilderImpl destination) {
            this.destination = destination != null ? destination.build() : null;
        }

        @Override
        public final Builder destination(InventoryDestination destination) {
            this.destination = destination;
            return this;
        }

        public final Boolean getIsEnabled() {
            return isEnabled;
        }

        public final void setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
        }

        @Override
        public final Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public final InventoryFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(InventoryFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(InventoryFilter filter) {
            this.filter = filter;
            return this;
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

        public final String getIncludedObjectVersions() {
            return includedObjectVersions;
        }

        public final void setIncludedObjectVersions(String includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
        }

        @Override
        public final Builder includedObjectVersions(String includedObjectVersions) {
            this.includedObjectVersions = includedObjectVersions;
            return this;
        }

        @Override
        public final Builder includedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions(includedObjectVersions == null ? null : includedObjectVersions.toString());
            return this;
        }

        public final Collection<String> getOptionalFields() {
            if (optionalFields instanceof SdkAutoConstructList) {
                return null;
            }
            return optionalFields;
        }

        public final void setOptionalFields(Collection<String> optionalFields) {
            this.optionalFields = InventoryOptionalFieldsCopier.copy(optionalFields);
        }

        @Override
        public final Builder optionalFieldsWithStrings(Collection<String> optionalFields) {
            this.optionalFields = InventoryOptionalFieldsCopier.copy(optionalFields);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder optionalFieldsWithStrings(String... optionalFields) {
            optionalFieldsWithStrings(Arrays.asList(optionalFields));
            return this;
        }

        @Override
        public final Builder optionalFields(Collection<InventoryOptionalField> optionalFields) {
            this.optionalFields = InventoryOptionalFieldsCopier.copyEnumToString(optionalFields);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder optionalFields(InventoryOptionalField... optionalFields) {
            optionalFields(Arrays.asList(optionalFields));
            return this;
        }

        public final InventorySchedule.Builder getSchedule() {
            return schedule != null ? schedule.toBuilder() : null;
        }

        public final void setSchedule(InventorySchedule.BuilderImpl schedule) {
            this.schedule = schedule != null ? schedule.build() : null;
        }

        @Override
        public final Builder schedule(InventorySchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        @Override
        public InventoryConfiguration build() {
            return new InventoryConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
