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
 * Describes the cross-origin access configuration for objects in an Amazon S3 bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling Cross-Origin Resource Sharing</a> in the
 * <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CORSConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<CORSConfiguration.Builder, CORSConfiguration> {
    private static final SdkField<List<CORSRule>> CORS_RULES_FIELD = SdkField
            .<List<CORSRule>> builder(MarshallingType.LIST)
            .memberName("CORSRules")
            .getter(getter(CORSConfiguration::corsRules))
            .setter(setter(Builder::corsRules))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CORSRule")
                    .unmarshallLocationName("CORSRule").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<CORSRule> builder(MarshallingType.SDK_POJO)
                                            .constructor(CORSRule::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(CORS_RULES_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<CORSRule> corsRules;

    private CORSConfiguration(BuilderImpl builder) {
        this.corsRules = builder.corsRules;
    }

    /**
     * For responses, this returns true if the service returned a value for the CORSRules property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasCorsRules() {
        return corsRules != null && !(corsRules instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the
     * configuration.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasCorsRules} method.
     * </p>
     * 
     * @return A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to
     *         the configuration.
     */
    public final List<CORSRule> corsRules() {
        return corsRules;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasCorsRules() ? corsRules() : null);
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
        if (!(obj instanceof CORSConfiguration)) {
            return false;
        }
        CORSConfiguration other = (CORSConfiguration) obj;
        return hasCorsRules() == other.hasCorsRules() && Objects.equals(corsRules(), other.corsRules());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CORSConfiguration").add("CORSRules", hasCorsRules() ? corsRules() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "CORSRules":
            return Optional.ofNullable(clazz.cast(corsRules()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CORSConfiguration, T> g) {
        return obj -> g.apply((CORSConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CORSConfiguration> {
        /**
         * <p>
         * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the
         * configuration.
         * </p>
         * 
         * @param corsRules
         *        A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules
         *        to the configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder corsRules(Collection<CORSRule> corsRules);

        /**
         * <p>
         * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the
         * configuration.
         * </p>
         * 
         * @param corsRules
         *        A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules
         *        to the configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder corsRules(CORSRule... corsRules);

        /**
         * <p>
         * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the
         * configuration.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link CORSRule.Builder} avoiding the need to create one manually
         * via {@link CORSRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link CORSRule.Builder#build()} is called immediately and its
         * result is passed to {@link #corsRules(List<CORSRule>)}.
         * 
         * @param corsRules
         *        a consumer that will call methods on {@link CORSRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #corsRules(Collection<CORSRule>)
         */
        Builder corsRules(Consumer<CORSRule.Builder>... corsRules);
    }

    static final class BuilderImpl implements Builder {
        private List<CORSRule> corsRules = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(CORSConfiguration model) {
            corsRules(model.corsRules);
        }

        public final List<CORSRule.Builder> getCorsRules() {
            List<CORSRule.Builder> result = CORSRulesCopier.copyToBuilder(this.corsRules);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setCorsRules(Collection<CORSRule.BuilderImpl> corsRules) {
            this.corsRules = CORSRulesCopier.copyFromBuilder(corsRules);
        }

        @Override
        public final Builder corsRules(Collection<CORSRule> corsRules) {
            this.corsRules = CORSRulesCopier.copy(corsRules);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder corsRules(CORSRule... corsRules) {
            corsRules(Arrays.asList(corsRules));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder corsRules(Consumer<CORSRule.Builder>... corsRules) {
            corsRules(Stream.of(corsRules).map(c -> CORSRule.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public CORSConfiguration build() {
            return new CORSConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
