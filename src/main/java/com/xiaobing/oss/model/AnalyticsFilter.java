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
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.util.SdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructMap;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one
 * conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AnalyticsFilter implements SdkPojo, Serializable, ToCopyableBuilder<AnalyticsFilter.Builder, AnalyticsFilter> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(AnalyticsFilter::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Tag> TAG_FIELD = SdkField
            .<Tag> builder(MarshallingType.SDK_POJO)
            .memberName("Tag")
            .getter(getter(AnalyticsFilter::tag))
            .setter(setter(Builder::tag))
            .constructor(Tag::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build()).build();

    private static final SdkField<AnalyticsAndOperator> AND_FIELD = SdkField
            .<AnalyticsAndOperator> builder(MarshallingType.SDK_POJO)
            .memberName("And")
            .getter(getter(AnalyticsFilter::and))
            .setter(setter(Builder::and))
            .constructor(AnalyticsAndOperator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("And").unmarshallLocationName("And")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAG_FIELD,
            AND_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final Tag tag;

    private final AnalyticsAndOperator and;

    private final Type type;

    private AnalyticsFilter(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tag = builder.tag;
        this.and = builder.and;
        this.type = builder.type;
    }

    /**
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     * 
     * @return The prefix to use when evaluating an analytics filter.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     * 
     * @return The tag to use when evaluating an analytics filter.
     */
    public final Tag tag() {
        return tag;
    }

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must
     * have at least two predicates.
     * </p>
     * 
     * @return A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator
     *         must have at least two predicates.
     */
    public final AnalyticsAndOperator and() {
        return and;
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
        hashCode = 31 * hashCode + Objects.hashCode(tag());
        hashCode = 31 * hashCode + Objects.hashCode(and());
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
        if (!(obj instanceof AnalyticsFilter)) {
            return false;
        }
        AnalyticsFilter other = (AnalyticsFilter) obj;
        return Objects.equals(prefix(), other.prefix()) && Objects.equals(tag(), other.tag())
                && Objects.equals(and(), other.and());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AnalyticsFilter").add("Prefix", prefix()).add("Tag", tag()).add("And", and()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Tag":
            return Optional.ofNullable(clazz.cast(tag()));
        case "And":
            return Optional.ofNullable(clazz.cast(and()));
        default:
            return Optional.empty();
        }
    }

    /**
     * Create an instance of this class with {@link #prefix()} initialized to the given value.
     *
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     * 
     * @param prefix
     *        The prefix to use when evaluating an analytics filter.
     */
    public static AnalyticsFilter fromPrefix(String prefix) {
        return builder().prefix(prefix).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     * 
     * @param tag
     *        The tag to use when evaluating an analytics filter.
     */
    public static AnalyticsFilter fromTag(Tag tag) {
        return builder().tag(tag).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     * 
     * @param tag
     *        The tag to use when evaluating an analytics filter.
     */
    public static AnalyticsFilter fromTag(Consumer<Tag.Builder> tag) {
        Tag.Builder builder = Tag.builder();
        tag.accept(builder);
        return fromTag(builder.build());
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must
     * have at least two predicates.
     * </p>
     * 
     * @param and
     *        A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator
     *        must have at least two predicates.
     */
    public static AnalyticsFilter fromAnd(AnalyticsAndOperator and) {
        return builder().and(and).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must
     * have at least two predicates.
     * </p>
     * 
     * @param and
     *        A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator
     *        must have at least two predicates.
     */
    public static AnalyticsFilter fromAnd(Consumer<AnalyticsAndOperator.Builder> and) {
        AnalyticsAndOperator.Builder builder = AnalyticsAndOperator.builder();
        and.accept(builder);
        return fromAnd(builder.build());
    }

    /**
     * Retrieve an enum value representing which member of this object is populated.
     *
     * When this class is returned in a service response, this will be {@link Type#UNKNOWN_TO_SDK_VERSION} if the
     * service returned a member that is only known to a newer SDK version.
     *
     * When this class is created directly in your code, this will be {@link Type#UNKNOWN_TO_SDK_VERSION} if zero
     * members are set, and {@code null} if more than one member is set.
     */
    public Type type() {
        return type;
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AnalyticsFilter, T> g) {
        return obj -> g.apply((AnalyticsFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AnalyticsFilter> {
        /**
         * <p>
         * The prefix to use when evaluating an analytics filter.
         * </p>
         * 
         * @param prefix
         *        The prefix to use when evaluating an analytics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * The tag to use when evaluating an analytics filter.
         * </p>
         * 
         * @param tag
         *        The tag to use when evaluating an analytics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tag(Tag tag);

        /**
         * <p>
         * The tag to use when evaluating an analytics filter.
         * </p>
         * This is a convenience method that creates an instance of the {@link Tag.Builder} avoiding the need to create
         * one manually via {@link Tag#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tag.Builder#build()} is called immediately and its result is
         * passed to {@link #tag(Tag)}.
         * 
         * @param tag
         *        a consumer that will call methods on {@link Tag.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tag(Tag)
         */
        default Builder tag(Consumer<Tag.Builder> tag) {
            return tag(Tag.builder().applyMutation(tag).build());
        }

        /**
         * <p>
         * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must
         * have at least two predicates.
         * </p>
         * 
         * @param and
         *        A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The
         *        operator must have at least two predicates.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder and(AnalyticsAndOperator and);

        /**
         * <p>
         * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must
         * have at least two predicates.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsAndOperator.Builder} avoiding
         * the need to create one manually via {@link AnalyticsAndOperator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsAndOperator.Builder#build()} is called immediately and
         * its result is passed to {@link #and(AnalyticsAndOperator)}.
         * 
         * @param and
         *        a consumer that will call methods on {@link AnalyticsAndOperator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #and(AnalyticsAndOperator)
         */
        default Builder and(Consumer<AnalyticsAndOperator.Builder> and) {
            return and(AnalyticsAndOperator.builder().applyMutation(and).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private Tag tag;

        private AnalyticsAndOperator and;

        private Type type = Type.UNKNOWN_TO_SDK_VERSION;

        private Set<Type> setTypes = EnumSet.noneOf(Type.class);

        private BuilderImpl() {
        }

        private BuilderImpl(AnalyticsFilter model) {
            prefix(model.prefix);
            tag(model.tag);
            and(model.and);
        }

        public final String getPrefix() {
            return prefix;
        }

        public final void setPrefix(String prefix) {
            Object oldValue = this.prefix;
            this.prefix = prefix;
            handleUnionValueChange(Type.PREFIX, oldValue, this.prefix);
        }

        @Override
        public final Builder prefix(String prefix) {
            Object oldValue = this.prefix;
            this.prefix = prefix;
            handleUnionValueChange(Type.PREFIX, oldValue, this.prefix);
            return this;
        }

        public final Tag.Builder getTag() {
            return tag != null ? tag.toBuilder() : null;
        }

        public final void setTag(Tag.BuilderImpl tag) {
            Object oldValue = this.tag;
            this.tag = tag != null ? tag.build() : null;
            handleUnionValueChange(Type.TAG, oldValue, this.tag);
        }

        @Override
        public final Builder tag(Tag tag) {
            Object oldValue = this.tag;
            this.tag = tag;
            handleUnionValueChange(Type.TAG, oldValue, this.tag);
            return this;
        }

        public final AnalyticsAndOperator.Builder getAnd() {
            return and != null ? and.toBuilder() : null;
        }

        public final void setAnd(AnalyticsAndOperator.BuilderImpl and) {
            Object oldValue = this.and;
            this.and = and != null ? and.build() : null;
            handleUnionValueChange(Type.AND, oldValue, this.and);
        }

        @Override
        public final Builder and(AnalyticsAndOperator and) {
            Object oldValue = this.and;
            this.and = and;
            handleUnionValueChange(Type.AND, oldValue, this.and);
            return this;
        }

        @Override
        public AnalyticsFilter build() {
            return new AnalyticsFilter(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }

        private final void handleUnionValueChange(Type type, Object oldValue, Object newValue) {
            if (this.type == type || oldValue == newValue) {
                return;
            }
            if (newValue == null || newValue instanceof SdkAutoConstructList || newValue instanceof SdkAutoConstructMap) {
                setTypes.remove(type);
            } else if (oldValue == null || oldValue instanceof SdkAutoConstructList || oldValue instanceof SdkAutoConstructMap) {
                setTypes.add(type);
            }
            if (setTypes.size() == 1) {
                this.type = setTypes.iterator().next();
            } else if (setTypes.isEmpty()) {
                this.type = Type.UNKNOWN_TO_SDK_VERSION;
            } else {
                this.type = null;
            }
        }
    }

    /**
     * @see AnalyticsFilter#type()
     */
    public enum Type {
        PREFIX,

        TAG,

        AND,

        UNKNOWN_TO_SDK_VERSION
    }
}
