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
 * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at
 * least two predicates, and an object must match all of the predicates in order for the filter to apply.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class MetricsAndOperator implements SdkPojo, Serializable,
        ToCopyableBuilder<MetricsAndOperator.Builder, MetricsAndOperator> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(MetricsAndOperator::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<List<Tag>> TAGS_FIELD = SdkField
            .<List<Tag>> builder(MarshallingType.LIST)
            .memberName("Tags")
            .getter(getter(MetricsAndOperator::tags))
            .setter(setter(Builder::tags))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Tag")
                            .memberFieldInfo(
                                    SdkField.<Tag> builder(MarshallingType.SDK_POJO)
                                            .constructor(Tag::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Tag").unmarshallLocationName("Tag").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<String> ACCESS_POINT_ARN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AccessPointArn")
            .getter(getter(MetricsAndOperator::accessPointArn))
            .setter(setter(Builder::accessPointArn))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessPointArn")
                    .unmarshallLocationName("AccessPointArn").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAGS_FIELD,
            ACCESS_POINT_ARN_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final List<Tag> tags;

    private final String accessPointArn;

    private MetricsAndOperator(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tags = builder.tags;
        this.accessPointArn = builder.accessPointArn;
    }

    /**
     * <p>
     * The prefix used when evaluating an AND predicate.
     * </p>
     * 
     * @return The prefix used when evaluating an AND predicate.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * For responses, this returns true if the service returned a value for the Tags property. This DOES NOT check that
     * the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is useful
     * because the SDK will never return a null collection or map, but you may need to differentiate between the service
     * returning nothing (or null) and the service returning an empty collection or map. For requests, this returns true
     * if a value for the property was specified in the request builder, and false if a value was not specified.
     */
    public final boolean hasTags() {
        return tags != null && !(tags instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of tags used when evaluating an AND predicate.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTags} method.
     * </p>
     * 
     * @return The list of tags used when evaluating an AND predicate.
     */
    public final List<Tag> tags() {
        return tags;
    }

    /**
     * <p>
     * The access point ARN used when evaluating an <code>AND</code> predicate.
     * </p>
     * 
     * @return The access point ARN used when evaluating an <code>AND</code> predicate.
     */
    public final String accessPointArn() {
        return accessPointArn;
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
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(hasTags() ? tags() : null);
        hashCode = 31 * hashCode + Objects.hashCode(accessPointArn());
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
        if (!(obj instanceof MetricsAndOperator)) {
            return false;
        }
        MetricsAndOperator other = (MetricsAndOperator) obj;
        return Objects.equals(prefix(), other.prefix()) && hasTags() == other.hasTags() && Objects.equals(tags(), other.tags())
                && Objects.equals(accessPointArn(), other.accessPointArn());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("MetricsAndOperator").add("Prefix", prefix()).add("Tags", hasTags() ? tags() : null)
                .add("AccessPointArn", accessPointArn()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Tags":
            return Optional.ofNullable(clazz.cast(tags()));
        case "AccessPointArn":
            return Optional.ofNullable(clazz.cast(accessPointArn()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<MetricsAndOperator, T> g) {
        return obj -> g.apply((MetricsAndOperator) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, MetricsAndOperator> {
        /**
         * <p>
         * The prefix used when evaluating an AND predicate.
         * </p>
         * 
         * @param prefix
         *        The prefix used when evaluating an AND predicate.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * The list of tags used when evaluating an AND predicate.
         * </p>
         * 
         * @param tags
         *        The list of tags used when evaluating an AND predicate.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tags(Collection<Tag> tags);

        /**
         * <p>
         * The list of tags used when evaluating an AND predicate.
         * </p>
         * 
         * @param tags
         *        The list of tags used when evaluating an AND predicate.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tags(Tag... tags);

        /**
         * <p>
         * The list of tags used when evaluating an AND predicate.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Tag.Builder} avoiding the need to create one manually via
         * {@link Tag#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tag.Builder#build()} is
         * called immediately and its result is passed to {@link #tags(List<Tag>)}.
         * 
         * @param tags
         *        a consumer that will call methods on {@link Tag.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tags(Collection<Tag>)
         */
        Builder tags(Consumer<Tag.Builder>... tags);

        /**
         * <p>
         * The access point ARN used when evaluating an <code>AND</code> predicate.
         * </p>
         * 
         * @param accessPointArn
         *        The access point ARN used when evaluating an <code>AND</code> predicate.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessPointArn(String accessPointArn);
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private List<Tag> tags = DefaultSdkAutoConstructList.getInstance();

        private String accessPointArn;

        private BuilderImpl() {
        }

        private BuilderImpl(MetricsAndOperator model) {
            prefix(model.prefix);
            tags(model.tags);
            accessPointArn(model.accessPointArn);
        }

        public final String getPrefix() {
            return prefix;
        }

        public final void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public final Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public final List<Tag.Builder> getTags() {
            List<Tag.Builder> result = TagSetCopier.copyToBuilder(this.tags);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setTags(Collection<Tag.BuilderImpl> tags) {
            this.tags = TagSetCopier.copyFromBuilder(tags);
        }

        @Override
        public final Builder tags(Collection<Tag> tags) {
            this.tags = TagSetCopier.copy(tags);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tags(Tag... tags) {
            tags(Arrays.asList(tags));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tags(Consumer<Tag.Builder>... tags) {
            tags(Stream.of(tags).map(c -> Tag.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final String getAccessPointArn() {
            return accessPointArn;
        }

        public final void setAccessPointArn(String accessPointArn) {
            this.accessPointArn = accessPointArn;
        }

        @Override
        public final Builder accessPointArn(String accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }

        @Override
        public MetricsAndOperator build() {
            return new MetricsAndOperator(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
