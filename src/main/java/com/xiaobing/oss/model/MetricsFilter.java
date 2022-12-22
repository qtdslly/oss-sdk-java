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
 * Specifies a metrics configuration filter. The metrics configuration only includes objects that meet the filter's
 * criteria. A filter must be a prefix, an object tag, an access point ARN, or a conjunction (MetricsAndOperator). For
 * more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html"
 * >PutBucketMetricsConfiguration</a>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class MetricsFilter implements SdkPojo, Serializable, ToCopyableBuilder<MetricsFilter.Builder, MetricsFilter> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(MetricsFilter::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Tag> TAG_FIELD = SdkField
            .<Tag> builder(MarshallingType.SDK_POJO)
            .memberName("Tag")
            .getter(getter(MetricsFilter::tag))
            .setter(setter(Builder::tag))
            .constructor(Tag::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build()).build();

    private static final SdkField<String> ACCESS_POINT_ARN_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AccessPointArn")
            .getter(getter(MetricsFilter::accessPointArn))
            .setter(setter(Builder::accessPointArn))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessPointArn")
                    .unmarshallLocationName("AccessPointArn").build()).build();

    private static final SdkField<MetricsAndOperator> AND_FIELD = SdkField
            .<MetricsAndOperator> builder(MarshallingType.SDK_POJO)
            .memberName("And")
            .getter(getter(MetricsFilter::and))
            .setter(setter(Builder::and))
            .constructor(MetricsAndOperator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("And").unmarshallLocationName("And")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAG_FIELD,
            ACCESS_POINT_ARN_FIELD, AND_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final Tag tag;

    private final String accessPointArn;

    private final MetricsAndOperator and;

    private final Type type;

    private MetricsFilter(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tag = builder.tag;
        this.accessPointArn = builder.accessPointArn;
        this.and = builder.and;
        this.type = builder.type;
    }

    /**
     * <p>
     * The prefix used when evaluating a metrics filter.
     * </p>
     * 
     * @return The prefix used when evaluating a metrics filter.
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * The tag used when evaluating a metrics filter.
     * </p>
     * 
     * @return The tag used when evaluating a metrics filter.
     */
    public final Tag tag() {
        return tag;
    }

    /**
     * <p>
     * The access point ARN used when evaluating a metrics filter.
     * </p>
     * 
     * @return The access point ARN used when evaluating a metrics filter.
     */
    public final String accessPointArn() {
        return accessPointArn;
    }

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have
     * at least two predicates, and an object must match all of the predicates in order for the filter to apply.
     * </p>
     * 
     * @return A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator
     *         must have at least two predicates, and an object must match all of the predicates in order for the filter
     *         to apply.
     */
    public final MetricsAndOperator and() {
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
        hashCode = 31 * hashCode + Objects.hashCode(accessPointArn());
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
        if (!(obj instanceof MetricsFilter)) {
            return false;
        }
        MetricsFilter other = (MetricsFilter) obj;
        return Objects.equals(prefix(), other.prefix()) && Objects.equals(tag(), other.tag())
                && Objects.equals(accessPointArn(), other.accessPointArn()) && Objects.equals(and(), other.and());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("MetricsFilter").add("Prefix", prefix()).add("Tag", tag())
                .add("AccessPointArn", accessPointArn()).add("And", and()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Tag":
            return Optional.ofNullable(clazz.cast(tag()));
        case "AccessPointArn":
            return Optional.ofNullable(clazz.cast(accessPointArn()));
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
     * The prefix used when evaluating a metrics filter.
     * </p>
     * 
     * @param prefix
     *        The prefix used when evaluating a metrics filter.
     */
    public static MetricsFilter fromPrefix(String prefix) {
        return builder().prefix(prefix).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * The tag used when evaluating a metrics filter.
     * </p>
     * 
     * @param tag
     *        The tag used when evaluating a metrics filter.
     */
    public static MetricsFilter fromTag(Tag tag) {
        return builder().tag(tag).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * The tag used when evaluating a metrics filter.
     * </p>
     * 
     * @param tag
     *        The tag used when evaluating a metrics filter.
     */
    public static MetricsFilter fromTag(Consumer<Tag.Builder> tag) {
        Tag.Builder builder = Tag.builder();
        tag.accept(builder);
        return fromTag(builder.build());
    }

    /**
     * Create an instance of this class with {@link #accessPointArn()} initialized to the given value.
     *
     * <p>
     * The access point ARN used when evaluating a metrics filter.
     * </p>
     * 
     * @param accessPointArn
     *        The access point ARN used when evaluating a metrics filter.
     */
    public static MetricsFilter fromAccessPointArn(String accessPointArn) {
        return builder().accessPointArn(accessPointArn).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have
     * at least two predicates, and an object must match all of the predicates in order for the filter to apply.
     * </p>
     * 
     * @param and
     *        A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must
     *        have at least two predicates, and an object must match all of the predicates in order for the filter to
     *        apply.
     */
    public static MetricsFilter fromAnd(MetricsAndOperator and) {
        return builder().and(and).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have
     * at least two predicates, and an object must match all of the predicates in order for the filter to apply.
     * </p>
     * 
     * @param and
     *        A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must
     *        have at least two predicates, and an object must match all of the predicates in order for the filter to
     *        apply.
     */
    public static MetricsFilter fromAnd(Consumer<MetricsAndOperator.Builder> and) {
        MetricsAndOperator.Builder builder = MetricsAndOperator.builder();
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

    private static <T> Function<Object, T> getter(Function<MetricsFilter, T> g) {
        return obj -> g.apply((MetricsFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, MetricsFilter> {
        /**
         * <p>
         * The prefix used when evaluating a metrics filter.
         * </p>
         * 
         * @param prefix
         *        The prefix used when evaluating a metrics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * The tag used when evaluating a metrics filter.
         * </p>
         * 
         * @param tag
         *        The tag used when evaluating a metrics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tag(Tag tag);

        /**
         * <p>
         * The tag used when evaluating a metrics filter.
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
         * The access point ARN used when evaluating a metrics filter.
         * </p>
         * 
         * @param accessPointArn
         *        The access point ARN used when evaluating a metrics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessPointArn(String accessPointArn);

        /**
         * <p>
         * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must
         * have at least two predicates, and an object must match all of the predicates in order for the filter to
         * apply.
         * </p>
         * 
         * @param and
         *        A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator
         *        must have at least two predicates, and an object must match all of the predicates in order for the
         *        filter to apply.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder and(MetricsAndOperator and);

        /**
         * <p>
         * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must
         * have at least two predicates, and an object must match all of the predicates in order for the filter to
         * apply.
         * </p>
         * This is a convenience method that creates an instance of the {@link MetricsAndOperator.Builder} avoiding the
         * need to create one manually via {@link MetricsAndOperator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link MetricsAndOperator.Builder#build()} is called immediately and its
         * result is passed to {@link #and(MetricsAndOperator)}.
         * 
         * @param and
         *        a consumer that will call methods on {@link MetricsAndOperator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #and(MetricsAndOperator)
         */
        default Builder and(Consumer<MetricsAndOperator.Builder> and) {
            return and(MetricsAndOperator.builder().applyMutation(and).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private Tag tag;

        private String accessPointArn;

        private MetricsAndOperator and;

        private Type type = Type.UNKNOWN_TO_SDK_VERSION;

        private Set<Type> setTypes = EnumSet.noneOf(Type.class);

        private BuilderImpl() {
        }

        private BuilderImpl(MetricsFilter model) {
            prefix(model.prefix);
            tag(model.tag);
            accessPointArn(model.accessPointArn);
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

        public final String getAccessPointArn() {
            return accessPointArn;
        }

        public final void setAccessPointArn(String accessPointArn) {
            Object oldValue = this.accessPointArn;
            this.accessPointArn = accessPointArn;
            handleUnionValueChange(Type.ACCESS_POINT_ARN, oldValue, this.accessPointArn);
        }

        @Override
        public final Builder accessPointArn(String accessPointArn) {
            Object oldValue = this.accessPointArn;
            this.accessPointArn = accessPointArn;
            handleUnionValueChange(Type.ACCESS_POINT_ARN, oldValue, this.accessPointArn);
            return this;
        }

        public final MetricsAndOperator.Builder getAnd() {
            return and != null ? and.toBuilder() : null;
        }

        public final void setAnd(MetricsAndOperator.BuilderImpl and) {
            Object oldValue = this.and;
            this.and = and != null ? and.build() : null;
            handleUnionValueChange(Type.AND, oldValue, this.and);
        }

        @Override
        public final Builder and(MetricsAndOperator and) {
            Object oldValue = this.and;
            this.and = and;
            handleUnionValueChange(Type.AND, oldValue, this.and);
            return this;
        }

        @Override
        public MetricsFilter build() {
            return new MetricsFilter(this);
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
     * @see MetricsFilter#type()
     */
    public enum Type {
        PREFIX,

        TAG,

        ACCESS_POINT_ARN,

        AND,

        UNKNOWN_TO_SDK_VERSION
    }
}
