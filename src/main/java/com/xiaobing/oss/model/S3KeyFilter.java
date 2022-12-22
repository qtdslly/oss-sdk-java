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
 * A container for object key name prefix and suffix filtering rules.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class S3KeyFilter implements SdkPojo, Serializable, ToCopyableBuilder<S3KeyFilter.Builder, S3KeyFilter> {
    private static final SdkField<List<FilterRule>> FILTER_RULES_FIELD = SdkField
            .<List<FilterRule>> builder(MarshallingType.LIST)
            .memberName("FilterRules")
            .getter(getter(S3KeyFilter::filterRules))
            .setter(setter(Builder::filterRules))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("FilterRule")
                    .unmarshallLocationName("FilterRule").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<FilterRule> builder(MarshallingType.SDK_POJO)
                                            .constructor(FilterRule::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(FILTER_RULES_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<FilterRule> filterRules;

    private S3KeyFilter(BuilderImpl builder) {
        this.filterRules = builder.filterRules;
    }

    /**
     * For responses, this returns true if the service returned a value for the FilterRules property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasFilterRules() {
        return filterRules != null && !(filterRules instanceof SdkAutoConstructList);
    }

    /**
     * Returns the value of the FilterRules property for this object.
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasFilterRules} method.
     * </p>
     * 
     * @return The value of the FilterRules property for this object.
     */
    public final List<FilterRule> filterRules() {
        return filterRules;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasFilterRules() ? filterRules() : null);
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
        if (!(obj instanceof S3KeyFilter)) {
            return false;
        }
        S3KeyFilter other = (S3KeyFilter) obj;
        return hasFilterRules() == other.hasFilterRules() && Objects.equals(filterRules(), other.filterRules());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("S3KeyFilter").add("FilterRules", hasFilterRules() ? filterRules() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "FilterRules":
            return Optional.ofNullable(clazz.cast(filterRules()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<S3KeyFilter, T> g) {
        return obj -> g.apply((S3KeyFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, S3KeyFilter> {
        /**
         * Sets the value of the FilterRules property for this object.
         *
         * @param filterRules
         *        The new value for the FilterRules property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filterRules(Collection<FilterRule> filterRules);

        /**
         * Sets the value of the FilterRules property for this object.
         *
         * @param filterRules
         *        The new value for the FilterRules property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filterRules(FilterRule... filterRules);

        /**
         * Sets the value of the FilterRules property for this object.
         *
         * This is a convenience method that creates an instance of the
         * {@link FilterRule.Builder} avoiding the need to create one manually
         * via {@link FilterRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link FilterRule.Builder#build()} is called immediately and its
         * result is passed to {@link #filterRules(List<FilterRule>)}.
         * 
         * @param filterRules
         *        a consumer that will call methods on
         *        {@link FilterRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filterRules(Collection<FilterRule>)
         */
        Builder filterRules(Consumer<FilterRule.Builder>... filterRules);
    }

    static final class BuilderImpl implements Builder {
        private List<FilterRule> filterRules = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(S3KeyFilter model) {
            filterRules(model.filterRules);
        }

        public final List<FilterRule.Builder> getFilterRules() {
            List<FilterRule.Builder> result = FilterRuleListCopier.copyToBuilder(this.filterRules);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setFilterRules(Collection<FilterRule.BuilderImpl> filterRules) {
            this.filterRules = FilterRuleListCopier.copyFromBuilder(filterRules);
        }

        @Override
        public final Builder filterRules(Collection<FilterRule> filterRules) {
            this.filterRules = FilterRuleListCopier.copy(filterRules);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder filterRules(FilterRule... filterRules) {
            filterRules(Arrays.asList(filterRules));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder filterRules(Consumer<FilterRule.Builder>... filterRules) {
            filterRules(Stream.of(filterRules).map(c -> FilterRule.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public S3KeyFilter build() {
            return new S3KeyFilter(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
