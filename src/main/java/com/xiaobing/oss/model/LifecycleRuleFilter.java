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
 * The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A <code>Filter</code> must have
 * exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class LifecycleRuleFilter implements SdkPojo, Serializable,
        ToCopyableBuilder<LifecycleRuleFilter.Builder, LifecycleRuleFilter> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(LifecycleRuleFilter::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Tag> TAG_FIELD = SdkField
            .<Tag> builder(MarshallingType.SDK_POJO)
            .memberName("Tag")
            .getter(getter(LifecycleRuleFilter::tag))
            .setter(setter(Builder::tag))
            .constructor(Tag::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build()).build();

    private static final SdkField<Long> OBJECT_SIZE_GREATER_THAN_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ObjectSizeGreaterThan")
            .getter(getter(LifecycleRuleFilter::objectSizeGreaterThan))
            .setter(setter(Builder::objectSizeGreaterThan))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectSizeGreaterThan")
                    .unmarshallLocationName("ObjectSizeGreaterThan").build()).build();

    private static final SdkField<Long> OBJECT_SIZE_LESS_THAN_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ObjectSizeLessThan")
            .getter(getter(LifecycleRuleFilter::objectSizeLessThan))
            .setter(setter(Builder::objectSizeLessThan))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectSizeLessThan")
                    .unmarshallLocationName("ObjectSizeLessThan").build()).build();

    private static final SdkField<LifecycleRuleAndOperator> AND_FIELD = SdkField
            .<LifecycleRuleAndOperator> builder(MarshallingType.SDK_POJO)
            .memberName("And")
            .getter(getter(LifecycleRuleFilter::and))
            .setter(setter(Builder::and))
            .constructor(LifecycleRuleAndOperator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("And").unmarshallLocationName("And")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAG_FIELD,
            OBJECT_SIZE_GREATER_THAN_FIELD, OBJECT_SIZE_LESS_THAN_FIELD, AND_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final Tag tag;

    private final Long objectSizeGreaterThan;

    private final Long objectSizeLessThan;

    private final LifecycleRuleAndOperator and;

    private final Type type;

    private LifecycleRuleFilter(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tag = builder.tag;
        this.objectSizeGreaterThan = builder.objectSizeGreaterThan;
        this.objectSizeLessThan = builder.objectSizeLessThan;
        this.and = builder.and;
        this.type = builder.type;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @return Prefix identifying one or more objects to which the rule applies.</p> <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */
    public final String prefix() {
        return prefix;
    }

    /**
     * <p>
     * This tag must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @return This tag must exist in the object's tag set in order for the rule to apply.
     */
    public final Tag tag() {
        return tag;
    }

    /**
     * <p>
     * Minimum object size to which the rule applies.
     * </p>
     * 
     * @return Minimum object size to which the rule applies.
     */
    public final Long objectSizeGreaterThan() {
        return objectSizeGreaterThan;
    }

    /**
     * <p>
     * Maximum object size to which the rule applies.
     * </p>
     * 
     * @return Maximum object size to which the rule applies.
     */
    public final Long objectSizeLessThan() {
        return objectSizeLessThan;
    }

    /**
     * Returns the value of the And property for this object.
     * 
     * @return The value of the And property for this object.
     */
    public final LifecycleRuleAndOperator and() {
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
        hashCode = 31 * hashCode + Objects.hashCode(objectSizeGreaterThan());
        hashCode = 31 * hashCode + Objects.hashCode(objectSizeLessThan());
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
        if (!(obj instanceof LifecycleRuleFilter)) {
            return false;
        }
        LifecycleRuleFilter other = (LifecycleRuleFilter) obj;
        return Objects.equals(prefix(), other.prefix()) && Objects.equals(tag(), other.tag())
                && Objects.equals(objectSizeGreaterThan(), other.objectSizeGreaterThan())
                && Objects.equals(objectSizeLessThan(), other.objectSizeLessThan()) && Objects.equals(and(), other.and());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("LifecycleRuleFilter").add("Prefix", prefix()).add("Tag", tag())
                .add("ObjectSizeGreaterThan", objectSizeGreaterThan()).add("ObjectSizeLessThan", objectSizeLessThan())
                .add("And", and()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Tag":
            return Optional.ofNullable(clazz.cast(tag()));
        case "ObjectSizeGreaterThan":
            return Optional.ofNullable(clazz.cast(objectSizeGreaterThan()));
        case "ObjectSizeLessThan":
            return Optional.ofNullable(clazz.cast(objectSizeLessThan()));
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
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        Prefix identifying one or more objects to which the rule applies.</p> <important>
     *        <p>
     *        Replacement must be made for object keys containing special characters (such as carriage returns) when
     *        using XML requests. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML related object key constraints</a>.
     *        </p>
     */
    public static LifecycleRuleFilter fromPrefix(String prefix) {
        return builder().prefix(prefix).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * This tag must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @param tag
     *        This tag must exist in the object's tag set in order for the rule to apply.
     */
    public static LifecycleRuleFilter fromTag(Tag tag) {
        return builder().tag(tag).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * This tag must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @param tag
     *        This tag must exist in the object's tag set in order for the rule to apply.
     */
    public static LifecycleRuleFilter fromTag(Consumer<Tag.Builder> tag) {
        Tag.Builder builder = Tag.builder();
        tag.accept(builder);
        return fromTag(builder.build());
    }

    /**
     * Create an instance of this class with {@link #objectSizeGreaterThan()} initialized to the given value.
     *
     * <p>
     * Minimum object size to which the rule applies.
     * </p>
     * 
     * @param objectSizeGreaterThan
     *        Minimum object size to which the rule applies.
     */
    public static LifecycleRuleFilter fromObjectSizeGreaterThan(Long objectSizeGreaterThan) {
        return builder().objectSizeGreaterThan(objectSizeGreaterThan).build();
    }

    /**
     * Create an instance of this class with {@link #objectSizeLessThan()} initialized to the given value.
     *
     * <p>
     * Maximum object size to which the rule applies.
     * </p>
     * 
     * @param objectSizeLessThan
     *        Maximum object size to which the rule applies.
     */
    public static LifecycleRuleFilter fromObjectSizeLessThan(Long objectSizeLessThan) {
        return builder().objectSizeLessThan(objectSizeLessThan).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * Sets the value of the And property for this object.
     *
     * @param and
     *        The new value for the And property for this object.
     */
    public static LifecycleRuleFilter fromAnd(LifecycleRuleAndOperator and) {
        return builder().and(and).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * Sets the value of the And property for this object.
     *
     * @param and
     *        The new value for the And property for this object.
     */
    public static LifecycleRuleFilter fromAnd(Consumer<LifecycleRuleAndOperator.Builder> and) {
        LifecycleRuleAndOperator.Builder builder = LifecycleRuleAndOperator.builder();
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

    private static <T> Function<Object, T> getter(Function<LifecycleRuleFilter, T> g) {
        return obj -> g.apply((LifecycleRuleFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, LifecycleRuleFilter> {
        /**
         * <p>
         * Prefix identifying one or more objects to which the rule applies.
         * </p>
         * <important>
         * <p>
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints</a>.
         * </p>
         * </important>
         * 
         * @param prefix
         *        Prefix identifying one or more objects to which the rule applies.</p> <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * This tag must exist in the object's tag set in order for the rule to apply.
         * </p>
         * 
         * @param tag
         *        This tag must exist in the object's tag set in order for the rule to apply.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tag(Tag tag);

        /**
         * <p>
         * This tag must exist in the object's tag set in order for the rule to apply.
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
         * Minimum object size to which the rule applies.
         * </p>
         * 
         * @param objectSizeGreaterThan
         *        Minimum object size to which the rule applies.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectSizeGreaterThan(Long objectSizeGreaterThan);

        /**
         * <p>
         * Maximum object size to which the rule applies.
         * </p>
         * 
         * @param objectSizeLessThan
         *        Maximum object size to which the rule applies.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectSizeLessThan(Long objectSizeLessThan);

        /**
         * Sets the value of the And property for this object.
         *
         * @param and
         *        The new value for the And property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder and(LifecycleRuleAndOperator and);

        /**
         * Sets the value of the And property for this object.
         *
         * This is a convenience method that creates an instance of the {@link LifecycleRuleAndOperator.Builder}
         * avoiding the need to create one manually via {@link LifecycleRuleAndOperator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link LifecycleRuleAndOperator.Builder#build()} is called immediately
         * and its result is passed to {@link #and(LifecycleRuleAndOperator)}.
         * 
         * @param and
         *        a consumer that will call methods on {@link LifecycleRuleAndOperator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #and(LifecycleRuleAndOperator)
         */
        default Builder and(Consumer<LifecycleRuleAndOperator.Builder> and) {
            return and(LifecycleRuleAndOperator.builder().applyMutation(and).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private Tag tag;

        private Long objectSizeGreaterThan;

        private Long objectSizeLessThan;

        private LifecycleRuleAndOperator and;

        private Type type = Type.UNKNOWN_TO_SDK_VERSION;

        private Set<Type> setTypes = EnumSet.noneOf(Type.class);

        private BuilderImpl() {
        }

        private BuilderImpl(LifecycleRuleFilter model) {
            prefix(model.prefix);
            tag(model.tag);
            objectSizeGreaterThan(model.objectSizeGreaterThan);
            objectSizeLessThan(model.objectSizeLessThan);
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

        public final Long getObjectSizeGreaterThan() {
            return objectSizeGreaterThan;
        }

        public final void setObjectSizeGreaterThan(Long objectSizeGreaterThan) {
            Object oldValue = this.objectSizeGreaterThan;
            this.objectSizeGreaterThan = objectSizeGreaterThan;
            handleUnionValueChange(Type.OBJECT_SIZE_GREATER_THAN, oldValue, this.objectSizeGreaterThan);
        }

        @Override
        public final Builder objectSizeGreaterThan(Long objectSizeGreaterThan) {
            Object oldValue = this.objectSizeGreaterThan;
            this.objectSizeGreaterThan = objectSizeGreaterThan;
            handleUnionValueChange(Type.OBJECT_SIZE_GREATER_THAN, oldValue, this.objectSizeGreaterThan);
            return this;
        }

        public final Long getObjectSizeLessThan() {
            return objectSizeLessThan;
        }

        public final void setObjectSizeLessThan(Long objectSizeLessThan) {
            Object oldValue = this.objectSizeLessThan;
            this.objectSizeLessThan = objectSizeLessThan;
            handleUnionValueChange(Type.OBJECT_SIZE_LESS_THAN, oldValue, this.objectSizeLessThan);
        }

        @Override
        public final Builder objectSizeLessThan(Long objectSizeLessThan) {
            Object oldValue = this.objectSizeLessThan;
            this.objectSizeLessThan = objectSizeLessThan;
            handleUnionValueChange(Type.OBJECT_SIZE_LESS_THAN, oldValue, this.objectSizeLessThan);
            return this;
        }

        public final LifecycleRuleAndOperator.Builder getAnd() {
            return and != null ? and.toBuilder() : null;
        }

        public final void setAnd(LifecycleRuleAndOperator.BuilderImpl and) {
            Object oldValue = this.and;
            this.and = and != null ? and.build() : null;
            handleUnionValueChange(Type.AND, oldValue, this.and);
        }

        @Override
        public final Builder and(LifecycleRuleAndOperator and) {
            Object oldValue = this.and;
            this.and = and;
            handleUnionValueChange(Type.AND, oldValue, this.and);
            return this;
        }

        @Override
        public LifecycleRuleFilter build() {
            return new LifecycleRuleFilter(this);
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
     * @see LifecycleRuleFilter#type()
     */
    public enum Type {
        PREFIX,

        TAG,

        OBJECT_SIZE_GREATER_THAN,

        OBJECT_SIZE_LESS_THAN,

        AND,

        UNKNOWN_TO_SDK_VERSION
    }
}
