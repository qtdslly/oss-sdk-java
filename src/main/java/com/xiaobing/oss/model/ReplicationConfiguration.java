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
 * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is
 * 2 MB.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicationConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<ReplicationConfiguration.Builder, ReplicationConfiguration> {
    private static final SdkField<String> ROLE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Role")
            .getter(getter(ReplicationConfiguration::role))
            .setter(setter(Builder::role))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Role")
                    .unmarshallLocationName("Role").build()).build();

    private static final SdkField<List<ReplicationRule>> RULES_FIELD = SdkField
            .<List<ReplicationRule>> builder(MarshallingType.LIST)
            .memberName("Rules")
            .getter(getter(ReplicationConfiguration::rules))
            .setter(setter(Builder::rules))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Rule")
                    .unmarshallLocationName("Rule").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<ReplicationRule> builder(MarshallingType.SDK_POJO)
                                            .constructor(ReplicationRule::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ROLE_FIELD, RULES_FIELD));

    private static final long serialVersionUID = 1L;

    private final String role;

    private final List<ReplicationRule> rules;

    private ReplicationConfiguration(BuilderImpl builder) {
        this.role = builder.role;
        this.rules = builder.rules;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that Amazon S3 assumes when
     * replicating objects. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html">How to Set Up Replication</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that Amazon S3 assumes
     *         when replicating objects. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html">How to Set Up
     *         Replication</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String role() {
        return role;
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
     * A container for one or more replication rules. A replication configuration must have at least one rule and can
     * contain a maximum of 1,000 rules.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasRules} method.
     * </p>
     * 
     * @return A container for one or more replication rules. A replication configuration must have at least one rule
     *         and can contain a maximum of 1,000 rules.
     */
    public final List<ReplicationRule> rules() {
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
        hashCode = 31 * hashCode + Objects.hashCode(role());
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
        if (!(obj instanceof ReplicationConfiguration)) {
            return false;
        }
        ReplicationConfiguration other = (ReplicationConfiguration) obj;
        return Objects.equals(role(), other.role()) && hasRules() == other.hasRules() && Objects.equals(rules(), other.rules());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicationConfiguration").add("Role", role()).add("Rules", hasRules() ? rules() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Role":
            return Optional.ofNullable(clazz.cast(role()));
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

    private static <T> Function<Object, T> getter(Function<ReplicationConfiguration, T> g) {
        return obj -> g.apply((ReplicationConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicationConfiguration> {
        /**
         * <p>
         * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that Amazon S3 assumes when
         * replicating objects. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html">How to Set Up
         * Replication</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param role
         *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that Amazon S3 assumes
         *        when replicating objects. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html">How to Set Up
         *        Replication</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder role(String role);

        /**
         * <p>
         * A container for one or more replication rules. A replication configuration must have at least one rule and
         * can contain a maximum of 1,000 rules.
         * </p>
         * 
         * @param rules
         *        A container for one or more replication rules. A replication configuration must have at least one rule
         *        and can contain a maximum of 1,000 rules.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder rules(Collection<ReplicationRule> rules);

        /**
         * <p>
         * A container for one or more replication rules. A replication configuration must have at least one rule and
         * can contain a maximum of 1,000 rules.
         * </p>
         * 
         * @param rules
         *        A container for one or more replication rules. A replication configuration must have at least one rule
         *        and can contain a maximum of 1,000 rules.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder rules(ReplicationRule... rules);

        /**
         * <p>
         * A container for one or more replication rules. A replication configuration must have at least one rule and
         * can contain a maximum of 1,000 rules.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link ReplicationRule.Builder} avoiding the need to create one
         * manually via {@link ReplicationRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link ReplicationRule.Builder#build()} is called immediately and
         * its result is passed to {@link #rules(List<ReplicationRule>)}.
         * 
         * @param rules
         *        a consumer that will call methods on
         *        {@link ReplicationRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #rules(Collection<ReplicationRule>)
         */
        Builder rules(Consumer<ReplicationRule.Builder>... rules);
    }

    static final class BuilderImpl implements Builder {
        private String role;

        private List<ReplicationRule> rules = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicationConfiguration model) {
            role(model.role);
            rules(model.rules);
        }

        public final String getRole() {
            return role;
        }

        public final void setRole(String role) {
            this.role = role;
        }

        @Override
        public final Builder role(String role) {
            this.role = role;
            return this;
        }

        public final List<ReplicationRule.Builder> getRules() {
            List<ReplicationRule.Builder> result = ReplicationRulesCopier.copyToBuilder(this.rules);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setRules(Collection<ReplicationRule.BuilderImpl> rules) {
            this.rules = ReplicationRulesCopier.copyFromBuilder(rules);
        }

        @Override
        public final Builder rules(Collection<ReplicationRule> rules) {
            this.rules = ReplicationRulesCopier.copy(rules);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder rules(ReplicationRule... rules) {
            rules(Arrays.asList(rules));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder rules(Consumer<ReplicationRule.Builder>... rules) {
            rules(Stream.of(rules).map(c -> ReplicationRule.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public ReplicationConfiguration build() {
            return new ReplicationConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
