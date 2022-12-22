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
 * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code> must
 * specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicationRuleFilter implements SdkPojo, Serializable,
        ToCopyableBuilder<ReplicationRuleFilter.Builder, ReplicationRuleFilter> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ReplicationRuleFilter::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Tag> TAG_FIELD = SdkField
            .<Tag> builder(MarshallingType.SDK_POJO)
            .memberName("Tag")
            .getter(getter(ReplicationRuleFilter::tag))
            .setter(setter(Builder::tag))
            .constructor(Tag::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build()).build();

    private static final SdkField<ReplicationRuleAndOperator> AND_FIELD = SdkField
            .<ReplicationRuleAndOperator> builder(MarshallingType.SDK_POJO)
            .memberName("And")
            .getter(getter(ReplicationRuleFilter::and))
            .setter(setter(Builder::and))
            .constructor(ReplicationRuleAndOperator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("And").unmarshallLocationName("And")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAG_FIELD,
            AND_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final Tag tag;

    private final ReplicationRuleAndOperator and;

    private final Type type;

    private ReplicationRuleFilter(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tag = builder.tag;
        this.and = builder.and;
        this.type = builder.type;
    }

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which the rule applies.
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
     * @return An object key name prefix that identifies the subset of objects to which the rule applies.</p>
     *         <important>
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
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     * 
     * @return A container for specifying a tag key and value. </p>
     *         <p>
     *         The rule applies only to objects that have the tag in their tag set.
     */
    public final Tag tag() {
        return tag;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A container for specifying rule filters. The filters determine the subset of objects to which the rule
     *         applies. This element is required only if you specify more than one filter. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *         <code>And</code> tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *         tag.
     *         </p>
     *         </li>
     */
    public final ReplicationRuleAndOperator and() {
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
        if (!(obj instanceof ReplicationRuleFilter)) {
            return false;
        }
        ReplicationRuleFilter other = (ReplicationRuleFilter) obj;
        return Objects.equals(prefix(), other.prefix()) && Objects.equals(tag(), other.tag())
                && Objects.equals(and(), other.and());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicationRuleFilter").add("Prefix", prefix()).add("Tag", tag()).add("And", and()).build();
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
     * An object key name prefix that identifies the subset of objects to which the rule applies.
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
     *        An object key name prefix that identifies the subset of objects to which the rule applies.</p> <important>
     *        <p>
     *        Replacement must be made for object keys containing special characters (such as carriage returns) when
     *        using XML requests. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML related object key constraints</a>.
     *        </p>
     */
    public static ReplicationRuleFilter fromPrefix(String prefix) {
        return builder().prefix(prefix).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     * 
     * @param tag
     *        A container for specifying a tag key and value. </p>
     *        <p>
     *        The rule applies only to objects that have the tag in their tag set.
     */
    public static ReplicationRuleFilter fromTag(Tag tag) {
        return builder().tag(tag).build();
    }

    /**
     * Create an instance of this class with {@link #tag()} initialized to the given value.
     *
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     * 
     * @param tag
     *        A container for specifying a tag key and value. </p>
     *        <p>
     *        The rule applies only to objects that have the tag in their tag set.
     */
    public static ReplicationRuleFilter fromTag(Consumer<Tag.Builder> tag) {
        Tag.Builder builder = Tag.builder();
        tag.accept(builder);
        return fromTag(builder.build());
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param and
     *        A container for specifying rule filters. The filters determine the subset of objects to which the rule
     *        applies. This element is required only if you specify more than one filter. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *        <code>And</code> tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *        tag.
     *        </p>
     *        </li>
     */
    public static ReplicationRuleFilter fromAnd(ReplicationRuleAndOperator and) {
        return builder().and(and).build();
    }

    /**
     * Create an instance of this class with {@link #and()} initialized to the given value.
     *
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param and
     *        A container for specifying rule filters. The filters determine the subset of objects to which the rule
     *        applies. This element is required only if you specify more than one filter. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *        <code>And</code> tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *        tag.
     *        </p>
     *        </li>
     */
    public static ReplicationRuleFilter fromAnd(Consumer<ReplicationRuleAndOperator.Builder> and) {
        ReplicationRuleAndOperator.Builder builder = ReplicationRuleAndOperator.builder();
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

    private static <T> Function<Object, T> getter(Function<ReplicationRuleFilter, T> g) {
        return obj -> g.apply((ReplicationRuleFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicationRuleFilter> {
        /**
         * <p>
         * An object key name prefix that identifies the subset of objects to which the rule applies.
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
         *        An object key name prefix that identifies the subset of objects to which the rule applies.</p>
         *        <important>
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
         * A container for specifying a tag key and value.
         * </p>
         * <p>
         * The rule applies only to objects that have the tag in their tag set.
         * </p>
         * 
         * @param tag
         *        A container for specifying a tag key and value. </p>
         *        <p>
         *        The rule applies only to objects that have the tag in their tag set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tag(Tag tag);

        /**
         * <p>
         * A container for specifying a tag key and value.
         * </p>
         * <p>
         * The rule applies only to objects that have the tag in their tag set.
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
         * A container for specifying rule filters. The filters determine the subset of objects to which the rule
         * applies. This element is required only if you specify more than one filter. For example:
         * </p>
         * <ul>
         * <li>
         * <p>
         * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
         * <code>And</code> tag.
         * </p>
         * </li>
         * <li>
         * <p>
         * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
         * tag.
         * </p>
         * </li>
         * </ul>
         * 
         * @param and
         *        A container for specifying rule filters. The filters determine the subset of objects to which the rule
         *        applies. This element is required only if you specify more than one filter. For example: </p>
         *        <ul>
         *        <li>
         *        <p>
         *        If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
         *        <code>And</code> tag.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an
         *        <code>And</code> tag.
         *        </p>
         *        </li>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder and(ReplicationRuleAndOperator and);

        /**
         * <p>
         * A container for specifying rule filters. The filters determine the subset of objects to which the rule
         * applies. This element is required only if you specify more than one filter. For example:
         * </p>
         * <ul>
         * <li>
         * <p>
         * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
         * <code>And</code> tag.
         * </p>
         * </li>
         * <li>
         * <p>
         * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
         * tag.
         * </p>
         * </li>
         * </ul>
         * This is a convenience method that creates an instance of the {@link ReplicationRuleAndOperator.Builder}
         * avoiding the need to create one manually via {@link ReplicationRuleAndOperator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationRuleAndOperator.Builder#build()} is called immediately
         * and its result is passed to {@link #and(ReplicationRuleAndOperator)}.
         * 
         * @param and
         *        a consumer that will call methods on {@link ReplicationRuleAndOperator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #and(ReplicationRuleAndOperator)
         */
        default Builder and(Consumer<ReplicationRuleAndOperator.Builder> and) {
            return and(ReplicationRuleAndOperator.builder().applyMutation(and).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private Tag tag;

        private ReplicationRuleAndOperator and;

        private Type type = Type.UNKNOWN_TO_SDK_VERSION;

        private Set<Type> setTypes = EnumSet.noneOf(Type.class);

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicationRuleFilter model) {
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

        public final ReplicationRuleAndOperator.Builder getAnd() {
            return and != null ? and.toBuilder() : null;
        }

        public final void setAnd(ReplicationRuleAndOperator.BuilderImpl and) {
            Object oldValue = this.and;
            this.and = and != null ? and.build() : null;
            handleUnionValueChange(Type.AND, oldValue, this.and);
        }

        @Override
        public final Builder and(ReplicationRuleAndOperator and) {
            Object oldValue = this.and;
            this.and = and;
            handleUnionValueChange(Type.AND, oldValue, this.and);
            return this;
        }

        @Override
        public ReplicationRuleFilter build() {
            return new ReplicationRuleFilter(this);
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
     * @see ReplicationRuleFilter#type()
     */
    public enum Type {
        PREFIX,

        TAG,

        AND,

        UNKNOWN_TO_SDK_VERSION
    }
}
