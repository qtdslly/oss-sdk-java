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
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * The <code>Filter</code> is used to identify objects that the S3 Intelligent-Tiering configuration applies to.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class IntelligentTieringFilter implements SdkPojo, Serializable,
        ToCopyableBuilder<IntelligentTieringFilter.Builder, IntelligentTieringFilter> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(IntelligentTieringFilter::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<Tag> TAG_FIELD = SdkField
            .<Tag> builder(MarshallingType.SDK_POJO)
            .memberName("Tag")
            .getter(getter(IntelligentTieringFilter::tag))
            .setter(setter(Builder::tag))
            .constructor(Tag::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tag").unmarshallLocationName("Tag")
                    .build()).build();

    private static final SdkField<IntelligentTieringAndOperator> AND_FIELD = SdkField
            .<IntelligentTieringAndOperator> builder(MarshallingType.SDK_POJO)
            .memberName("And")
            .getter(getter(IntelligentTieringFilter::and))
            .setter(setter(Builder::and))
            .constructor(IntelligentTieringAndOperator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("And").unmarshallLocationName("And")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAG_FIELD,
            AND_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final Tag tag;

    private final IntelligentTieringAndOperator and;

    private IntelligentTieringFilter(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tag = builder.tag;
        this.and = builder.and;
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
     * Returns the value of the Tag property for this object.
     * 
     * @return The value of the Tag property for this object.
     */
    public final Tag tag() {
        return tag;
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
    public final IntelligentTieringAndOperator and() {
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
        if (!(obj instanceof IntelligentTieringFilter)) {
            return false;
        }
        IntelligentTieringFilter other = (IntelligentTieringFilter) obj;
        return Objects.equals(prefix(), other.prefix()) && Objects.equals(tag(), other.tag())
                && Objects.equals(and(), other.and());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("IntelligentTieringFilter").add("Prefix", prefix()).add("Tag", tag()).add("And", and()).build();
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

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<IntelligentTieringFilter, T> g) {
        return obj -> g.apply((IntelligentTieringFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, IntelligentTieringFilter> {
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
         * Sets the value of the Tag property for this object.
         *
         * @param tag
         *        The new value for the Tag property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tag(Tag tag);

        /**
         * Sets the value of the Tag property for this object.
         *
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
        Builder and(IntelligentTieringAndOperator and);

        /**
         * <p>
         * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must
         * have at least two predicates, and an object must match all of the predicates in order for the filter to
         * apply.
         * </p>
         * This is a convenience method that creates an instance of the {@link IntelligentTieringAndOperator.Builder}
         * avoiding the need to create one manually via {@link IntelligentTieringAndOperator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link IntelligentTieringAndOperator.Builder#build()} is called
         * immediately and its result is passed to {@link #and(IntelligentTieringAndOperator)}.
         * 
         * @param and
         *        a consumer that will call methods on {@link IntelligentTieringAndOperator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #and(IntelligentTieringAndOperator)
         */
        default Builder and(Consumer<IntelligentTieringAndOperator.Builder> and) {
            return and(IntelligentTieringAndOperator.builder().applyMutation(and).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private Tag tag;

        private IntelligentTieringAndOperator and;

        private BuilderImpl() {
        }

        private BuilderImpl(IntelligentTieringFilter model) {
            prefix(model.prefix);
            tag(model.tag);
            and(model.and);
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

        public final Tag.Builder getTag() {
            return tag != null ? tag.toBuilder() : null;
        }

        public final void setTag(Tag.BuilderImpl tag) {
            this.tag = tag != null ? tag.build() : null;
        }

        @Override
        public final Builder tag(Tag tag) {
            this.tag = tag;
            return this;
        }

        public final IntelligentTieringAndOperator.Builder getAnd() {
            return and != null ? and.toBuilder() : null;
        }

        public final void setAnd(IntelligentTieringAndOperator.BuilderImpl and) {
            this.and = and != null ? and.build() : null;
        }

        @Override
        public final Builder and(IntelligentTieringAndOperator and) {
            this.and = and;
            return this;
        }

        @Override
        public IntelligentTieringFilter build() {
            return new IntelligentTieringFilter(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
