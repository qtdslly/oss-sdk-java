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
 * The container element for Object Lock configuration parameters.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ObjectLockConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<ObjectLockConfiguration.Builder, ObjectLockConfiguration> {
    private static final SdkField<String> OBJECT_LOCK_ENABLED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectLockEnabled")
            .getter(getter(ObjectLockConfiguration::objectLockEnabledAsString))
            .setter(setter(Builder::objectLockEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectLockEnabled")
                    .unmarshallLocationName("ObjectLockEnabled").build()).build();

    private static final SdkField<ObjectLockRule> RULE_FIELD = SdkField
            .<ObjectLockRule> builder(MarshallingType.SDK_POJO)
            .memberName("Rule")
            .getter(getter(ObjectLockConfiguration::rule))
            .setter(setter(Builder::rule))
            .constructor(ObjectLockRule::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Rule")
                    .unmarshallLocationName("Rule").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OBJECT_LOCK_ENABLED_FIELD,
            RULE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String objectLockEnabled;

    private final ObjectLockRule rule;

    private ObjectLockConfiguration(BuilderImpl builder) {
        this.objectLockEnabled = builder.objectLockEnabled;
        this.rule = builder.rule;
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled. Enable <code>ObjectLockEnabled</code>
     * when you apply <code>ObjectLockConfiguration</code> to a bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockEnabled}
     * will return {@link ObjectLockEnabled#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockEnabledAsString}.
     * </p>
     * 
     * @return Indicates whether this bucket has an Object Lock configuration enabled. Enable
     *         <code>ObjectLockEnabled</code> when you apply <code>ObjectLockConfiguration</code> to a bucket.
     * @see ObjectLockEnabled
     */
    public final ObjectLockEnabled objectLockEnabled() {
        return ObjectLockEnabled.fromValue(objectLockEnabled);
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled. Enable <code>ObjectLockEnabled</code>
     * when you apply <code>ObjectLockConfiguration</code> to a bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectLockEnabled}
     * will return {@link ObjectLockEnabled#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectLockEnabledAsString}.
     * </p>
     * 
     * @return Indicates whether this bucket has an Object Lock configuration enabled. Enable
     *         <code>ObjectLockEnabled</code> when you apply <code>ObjectLockConfiguration</code> to a bucket.
     * @see ObjectLockEnabled
     */
    public final String objectLockEnabledAsString() {
        return objectLockEnabled;
    }

    /**
     * <p>
     * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply
     * <code>ObjectLockConfiguration</code> to a bucket. Bucket settings require both a mode and a period. The period
     * can be either <code>Days</code> or <code>Years</code> but you must select one. You cannot specify
     * <code>Days</code> and <code>Years</code> at the same time.
     * </p>
     * 
     * @return Specifies the Object Lock rule for the specified object. Enable the this rule when you apply
     *         <code>ObjectLockConfiguration</code> to a bucket. Bucket settings require both a mode and a period. The
     *         period can be either <code>Days</code> or <code>Years</code> but you must select one. You cannot specify
     *         <code>Days</code> and <code>Years</code> at the same time.
     */
    public final ObjectLockRule rule() {
        return rule;
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
        hashCode = 31 * hashCode + Objects.hashCode(objectLockEnabledAsString());
        hashCode = 31 * hashCode + Objects.hashCode(rule());
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
        if (!(obj instanceof ObjectLockConfiguration)) {
            return false;
        }
        ObjectLockConfiguration other = (ObjectLockConfiguration) obj;
        return Objects.equals(objectLockEnabledAsString(), other.objectLockEnabledAsString())
                && Objects.equals(rule(), other.rule());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ObjectLockConfiguration").add("ObjectLockEnabled", objectLockEnabledAsString())
                .add("Rule", rule()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ObjectLockEnabled":
            return Optional.ofNullable(clazz.cast(objectLockEnabledAsString()));
        case "Rule":
            return Optional.ofNullable(clazz.cast(rule()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ObjectLockConfiguration, T> g) {
        return obj -> g.apply((ObjectLockConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ObjectLockConfiguration> {
        /**
         * <p>
         * Indicates whether this bucket has an Object Lock configuration enabled. Enable <code>ObjectLockEnabled</code>
         * when you apply <code>ObjectLockConfiguration</code> to a bucket.
         * </p>
         * 
         * @param objectLockEnabled
         *        Indicates whether this bucket has an Object Lock configuration enabled. Enable
         *        <code>ObjectLockEnabled</code> when you apply <code>ObjectLockConfiguration</code> to a bucket.
         * @see ObjectLockEnabled
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockEnabled
         */
        Builder objectLockEnabled(String objectLockEnabled);

        /**
         * <p>
         * Indicates whether this bucket has an Object Lock configuration enabled. Enable <code>ObjectLockEnabled</code>
         * when you apply <code>ObjectLockConfiguration</code> to a bucket.
         * </p>
         * 
         * @param objectLockEnabled
         *        Indicates whether this bucket has an Object Lock configuration enabled. Enable
         *        <code>ObjectLockEnabled</code> when you apply <code>ObjectLockConfiguration</code> to a bucket.
         * @see ObjectLockEnabled
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockEnabled
         */
        Builder objectLockEnabled(ObjectLockEnabled objectLockEnabled);

        /**
         * <p>
         * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply
         * <code>ObjectLockConfiguration</code> to a bucket. Bucket settings require both a mode and a period. The
         * period can be either <code>Days</code> or <code>Years</code> but you must select one. You cannot specify
         * <code>Days</code> and <code>Years</code> at the same time.
         * </p>
         * 
         * @param rule
         *        Specifies the Object Lock rule for the specified object. Enable the this rule when you apply
         *        <code>ObjectLockConfiguration</code> to a bucket. Bucket settings require both a mode and a period.
         *        The period can be either <code>Days</code> or <code>Years</code> but you must select one. You cannot
         *        specify <code>Days</code> and <code>Years</code> at the same time.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder rule(ObjectLockRule rule);

        /**
         * <p>
         * Specifies the Object Lock rule for the specified object. Enable the this rule when you apply
         * <code>ObjectLockConfiguration</code> to a bucket. Bucket settings require both a mode and a period. The
         * period can be either <code>Days</code> or <code>Years</code> but you must select one. You cannot specify
         * <code>Days</code> and <code>Years</code> at the same time.
         * </p>
         * This is a convenience method that creates an instance of the {@link ObjectLockRule.Builder} avoiding the need
         * to create one manually via {@link ObjectLockRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ObjectLockRule.Builder#build()} is called immediately and its
         * result is passed to {@link #rule(ObjectLockRule)}.
         * 
         * @param rule
         *        a consumer that will call methods on {@link ObjectLockRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #rule(ObjectLockRule)
         */
        default Builder rule(Consumer<ObjectLockRule.Builder> rule) {
            return rule(ObjectLockRule.builder().applyMutation(rule).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String objectLockEnabled;

        private ObjectLockRule rule;

        private BuilderImpl() {
        }

        private BuilderImpl(ObjectLockConfiguration model) {
            objectLockEnabled(model.objectLockEnabled);
            rule(model.rule);
        }

        public final String getObjectLockEnabled() {
            return objectLockEnabled;
        }

        public final void setObjectLockEnabled(String objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
        }

        @Override
        public final Builder objectLockEnabled(String objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }

        @Override
        public final Builder objectLockEnabled(ObjectLockEnabled objectLockEnabled) {
            this.objectLockEnabled(objectLockEnabled == null ? null : objectLockEnabled.toString());
            return this;
        }

        public final ObjectLockRule.Builder getRule() {
            return rule != null ? rule.toBuilder() : null;
        }

        public final void setRule(ObjectLockRule.BuilderImpl rule) {
            this.rule = rule != null ? rule.build() : null;
        }

        @Override
        public final Builder rule(ObjectLockRule rule) {
            this.rule = rule;
            return this;
        }

        @Override
        public ObjectLockConfiguration build() {
            return new ObjectLockConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
