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
 * Specifies the default server-side-encryption configuration.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ServerSideEncryptionConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<ServerSideEncryptionConfiguration.Builder, ServerSideEncryptionConfiguration> {
    private static final SdkField<List<ServerSideEncryptionRule>> RULES_FIELD = SdkField
            .<List<ServerSideEncryptionRule>> builder(MarshallingType.LIST)
            .memberName("Rules")
            .getter(getter(ServerSideEncryptionConfiguration::rules))
            .setter(setter(Builder::rules))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Rule")
                    .unmarshallLocationName("Rule").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<ServerSideEncryptionRule> builder(MarshallingType.SDK_POJO)
                                            .constructor(ServerSideEncryptionRule::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(RULES_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<ServerSideEncryptionRule> rules;

    private ServerSideEncryptionConfiguration(BuilderImpl builder) {
        this.rules = builder.rules;
    }

    /**
     * For responses, this returns true if the service returned a value for the Rules property. This DOES NOT check that
     * the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is useful
     * because the SDK will never return a null collection or map, but you may need to differentiate between the service
     * returning nothing (or null) and the service returning an empty collection or map. For requests, this returns true
     * if a value for the property was specified in the request builder, and false if a value was not specified.
     */
    public final boolean hasRules() {
        return rules != null && !(rules instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for information about a particular server-side encryption configuration rule.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasRules} method.
     * </p>
     * 
     * @return Container for information about a particular server-side encryption configuration rule.
     */
    public final List<ServerSideEncryptionRule> rules() {
        return rules;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasRules() ? rules() : null);
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
        if (!(obj instanceof ServerSideEncryptionConfiguration)) {
            return false;
        }
        ServerSideEncryptionConfiguration other = (ServerSideEncryptionConfiguration) obj;
        return hasRules() == other.hasRules() && Objects.equals(rules(), other.rules());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ServerSideEncryptionConfiguration").add("Rules", hasRules() ? rules() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Rules":
            return Optional.ofNullable(clazz.cast(rules()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ServerSideEncryptionConfiguration, T> g) {
        return obj -> g.apply((ServerSideEncryptionConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ServerSideEncryptionConfiguration> {
        /**
         * <p>
         * Container for information about a particular server-side encryption configuration rule.
         * </p>
         * 
         * @param rules
         *        Container for information about a particular server-side encryption configuration rule.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder rules(Collection<ServerSideEncryptionRule> rules);

        /**
         * <p>
         * Container for information about a particular server-side encryption configuration rule.
         * </p>
         * 
         * @param rules
         *        Container for information about a particular server-side encryption configuration rule.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder rules(ServerSideEncryptionRule... rules);

        /**
         * <p>
         * Container for information about a particular server-side encryption configuration rule.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link ServerSideEncryptionRule.Builder} avoiding the need to create
         * one manually via {@link ServerSideEncryptionRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link ServerSideEncryptionRule.Builder#build()} is called
         * immediately and its result is passed to {@link #rules(List<ServerSideEncryptionRule>)}.
         * 
         * @param rules
         *        a consumer that will call methods on
         *        {@link ServerSideEncryptionRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #rules(Collection<ServerSideEncryptionRule>)
         */
        Builder rules(Consumer<ServerSideEncryptionRule.Builder>... rules);
    }

    static final class BuilderImpl implements Builder {
        private List<ServerSideEncryptionRule> rules = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(ServerSideEncryptionConfiguration model) {
            rules(model.rules);
        }

        public final List<ServerSideEncryptionRule.Builder> getRules() {
            List<ServerSideEncryptionRule.Builder> result = ServerSideEncryptionRulesCopier.copyToBuilder(this.rules);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setRules(Collection<ServerSideEncryptionRule.BuilderImpl> rules) {
            this.rules = ServerSideEncryptionRulesCopier.copyFromBuilder(rules);
        }

        @Override
        public final Builder rules(Collection<ServerSideEncryptionRule> rules) {
            this.rules = ServerSideEncryptionRulesCopier.copy(rules);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder rules(ServerSideEncryptionRule... rules) {
            rules(Arrays.asList(rules));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder rules(Consumer<ServerSideEncryptionRule.Builder>... rules) {
            rules(Stream.of(rules).map(c -> ServerSideEncryptionRule.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public ServerSideEncryptionConfiguration build() {
            return new ServerSideEncryptionConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
