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
 * The container element for an Object Lock rule.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ObjectLockRule implements SdkPojo, Serializable, ToCopyableBuilder<ObjectLockRule.Builder, ObjectLockRule> {
    private static final SdkField<DefaultRetention> DEFAULT_RETENTION_FIELD = SdkField
            .<DefaultRetention> builder(MarshallingType.SDK_POJO)
            .memberName("DefaultRetention")
            .getter(getter(ObjectLockRule::defaultRetention))
            .setter(setter(Builder::defaultRetention))
            .constructor(DefaultRetention::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DefaultRetention")
                    .unmarshallLocationName("DefaultRetention").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DEFAULT_RETENTION_FIELD));

    private static final long serialVersionUID = 1L;

    private final DefaultRetention defaultRetention;

    private ObjectLockRule(BuilderImpl builder) {
        this.defaultRetention = builder.defaultRetention;
    }

    /**
     * <p>
     * The default Object Lock retention mode and period that you want to apply to new objects placed in the specified
     * bucket. Bucket settings require both a mode and a period. The period can be either <code>Days</code> or
     * <code>Years</code> but you must select one. You cannot specify <code>Days</code> and <code>Years</code> at the
     * same time.
     * </p>
     * 
     * @return The default Object Lock retention mode and period that you want to apply to new objects placed in the
     *         specified bucket. Bucket settings require both a mode and a period. The period can be either
     *         <code>Days</code> or <code>Years</code> but you must select one. You cannot specify <code>Days</code> and
     *         <code>Years</code> at the same time.
     */
    public final DefaultRetention defaultRetention() {
        return defaultRetention;
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
        hashCode = 31 * hashCode + Objects.hashCode(defaultRetention());
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
        if (!(obj instanceof ObjectLockRule)) {
            return false;
        }
        ObjectLockRule other = (ObjectLockRule) obj;
        return Objects.equals(defaultRetention(), other.defaultRetention());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ObjectLockRule").add("DefaultRetention", defaultRetention()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DefaultRetention":
            return Optional.ofNullable(clazz.cast(defaultRetention()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ObjectLockRule, T> g) {
        return obj -> g.apply((ObjectLockRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ObjectLockRule> {
        /**
         * <p>
         * The default Object Lock retention mode and period that you want to apply to new objects placed in the
         * specified bucket. Bucket settings require both a mode and a period. The period can be either
         * <code>Days</code> or <code>Years</code> but you must select one. You cannot specify <code>Days</code> and
         * <code>Years</code> at the same time.
         * </p>
         * 
         * @param defaultRetention
         *        The default Object Lock retention mode and period that you want to apply to new objects placed in the
         *        specified bucket. Bucket settings require both a mode and a period. The period can be either
         *        <code>Days</code> or <code>Years</code> but you must select one. You cannot specify <code>Days</code>
         *        and <code>Years</code> at the same time.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder defaultRetention(DefaultRetention defaultRetention);

        /**
         * <p>
         * The default Object Lock retention mode and period that you want to apply to new objects placed in the
         * specified bucket. Bucket settings require both a mode and a period. The period can be either
         * <code>Days</code> or <code>Years</code> but you must select one. You cannot specify <code>Days</code> and
         * <code>Years</code> at the same time.
         * </p>
         * This is a convenience method that creates an instance of the {@link DefaultRetention.Builder} avoiding the
         * need to create one manually via {@link DefaultRetention#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link DefaultRetention.Builder#build()} is called immediately and its
         * result is passed to {@link #defaultRetention(DefaultRetention)}.
         * 
         * @param defaultRetention
         *        a consumer that will call methods on {@link DefaultRetention.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #defaultRetention(DefaultRetention)
         */
        default Builder defaultRetention(Consumer<DefaultRetention.Builder> defaultRetention) {
            return defaultRetention(DefaultRetention.builder().applyMutation(defaultRetention).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private DefaultRetention defaultRetention;

        private BuilderImpl() {
        }

        private BuilderImpl(ObjectLockRule model) {
            defaultRetention(model.defaultRetention);
        }

        public final DefaultRetention.Builder getDefaultRetention() {
            return defaultRetention != null ? defaultRetention.toBuilder() : null;
        }

        public final void setDefaultRetention(DefaultRetention.BuilderImpl defaultRetention) {
            this.defaultRetention = defaultRetention != null ? defaultRetention.build() : null;
        }

        @Override
        public final Builder defaultRetention(DefaultRetention defaultRetention) {
            this.defaultRetention = defaultRetention;
            return this;
        }

        @Override
        public ObjectLockRule build() {
            return new ObjectLockRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
