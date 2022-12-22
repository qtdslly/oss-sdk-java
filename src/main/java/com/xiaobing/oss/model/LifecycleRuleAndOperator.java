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
 * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will
 * apply to any object matching all of the predicates configured inside the And operator.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class LifecycleRuleAndOperator implements SdkPojo, Serializable,
        ToCopyableBuilder<LifecycleRuleAndOperator.Builder, LifecycleRuleAndOperator> {
    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(LifecycleRuleAndOperator::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<List<Tag>> TAGS_FIELD = SdkField
            .<List<Tag>> builder(MarshallingType.LIST)
            .memberName("Tags")
            .getter(getter(LifecycleRuleAndOperator::tags))
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

    private static final SdkField<Long> OBJECT_SIZE_GREATER_THAN_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ObjectSizeGreaterThan")
            .getter(getter(LifecycleRuleAndOperator::objectSizeGreaterThan))
            .setter(setter(Builder::objectSizeGreaterThan))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectSizeGreaterThan")
                    .unmarshallLocationName("ObjectSizeGreaterThan").build()).build();

    private static final SdkField<Long> OBJECT_SIZE_LESS_THAN_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("ObjectSizeLessThan")
            .getter(getter(LifecycleRuleAndOperator::objectSizeLessThan))
            .setter(setter(Builder::objectSizeLessThan))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectSizeLessThan")
                    .unmarshallLocationName("ObjectSizeLessThan").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PREFIX_FIELD, TAGS_FIELD,
            OBJECT_SIZE_GREATER_THAN_FIELD, OBJECT_SIZE_LESS_THAN_FIELD));

    private static final long serialVersionUID = 1L;

    private final String prefix;

    private final List<Tag> tags;

    private final Long objectSizeGreaterThan;

    private final Long objectSizeLessThan;

    private LifecycleRuleAndOperator(BuilderImpl builder) {
        this.prefix = builder.prefix;
        this.tags = builder.tags;
        this.objectSizeGreaterThan = builder.objectSizeGreaterThan;
        this.objectSizeLessThan = builder.objectSizeLessThan;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * 
     * @return Prefix identifying one or more objects to which the rule applies.
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
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTags} method.
     * </p>
     * 
     * @return All of these tags must exist in the object's tag set in order for the rule to apply.
     */
    public final List<Tag> tags() {
        return tags;
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
        hashCode = 31 * hashCode + Objects.hashCode(objectSizeGreaterThan());
        hashCode = 31 * hashCode + Objects.hashCode(objectSizeLessThan());
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
        if (!(obj instanceof LifecycleRuleAndOperator)) {
            return false;
        }
        LifecycleRuleAndOperator other = (LifecycleRuleAndOperator) obj;
        return Objects.equals(prefix(), other.prefix()) && hasTags() == other.hasTags() && Objects.equals(tags(), other.tags())
                && Objects.equals(objectSizeGreaterThan(), other.objectSizeGreaterThan())
                && Objects.equals(objectSizeLessThan(), other.objectSizeLessThan());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("LifecycleRuleAndOperator").add("Prefix", prefix()).add("Tags", hasTags() ? tags() : null)
                .add("ObjectSizeGreaterThan", objectSizeGreaterThan()).add("ObjectSizeLessThan", objectSizeLessThan()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Tags":
            return Optional.ofNullable(clazz.cast(tags()));
        case "ObjectSizeGreaterThan":
            return Optional.ofNullable(clazz.cast(objectSizeGreaterThan()));
        case "ObjectSizeLessThan":
            return Optional.ofNullable(clazz.cast(objectSizeLessThan()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<LifecycleRuleAndOperator, T> g) {
        return obj -> g.apply((LifecycleRuleAndOperator) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, LifecycleRuleAndOperator> {
        /**
         * <p>
         * Prefix identifying one or more objects to which the rule applies.
         * </p>
         * 
         * @param prefix
         *        Prefix identifying one or more objects to which the rule applies.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);

        /**
         * <p>
         * All of these tags must exist in the object's tag set in order for the rule to apply.
         * </p>
         * 
         * @param tags
         *        All of these tags must exist in the object's tag set in order for the rule to apply.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tags(Collection<Tag> tags);

        /**
         * <p>
         * All of these tags must exist in the object's tag set in order for the rule to apply.
         * </p>
         * 
         * @param tags
         *        All of these tags must exist in the object's tag set in order for the rule to apply.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tags(Tag... tags);

        /**
         * <p>
         * All of these tags must exist in the object's tag set in order for the rule to apply.
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
    }

    static final class BuilderImpl implements Builder {
        private String prefix;

        private List<Tag> tags = DefaultSdkAutoConstructList.getInstance();

        private Long objectSizeGreaterThan;

        private Long objectSizeLessThan;

        private BuilderImpl() {
        }

        private BuilderImpl(LifecycleRuleAndOperator model) {
            prefix(model.prefix);
            tags(model.tags);
            objectSizeGreaterThan(model.objectSizeGreaterThan);
            objectSizeLessThan(model.objectSizeLessThan);
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

        public final Long getObjectSizeGreaterThan() {
            return objectSizeGreaterThan;
        }

        public final void setObjectSizeGreaterThan(Long objectSizeGreaterThan) {
            this.objectSizeGreaterThan = objectSizeGreaterThan;
        }

        @Override
        public final Builder objectSizeGreaterThan(Long objectSizeGreaterThan) {
            this.objectSizeGreaterThan = objectSizeGreaterThan;
            return this;
        }

        public final Long getObjectSizeLessThan() {
            return objectSizeLessThan;
        }

        public final void setObjectSizeLessThan(Long objectSizeLessThan) {
            this.objectSizeLessThan = objectSizeLessThan;
        }

        @Override
        public final Builder objectSizeLessThan(Long objectSizeLessThan) {
            this.objectSizeLessThan = objectSizeLessThan;
            return this;
        }

        @Override
        public LifecycleRuleAndOperator build() {
            return new LifecycleRuleAndOperator(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
