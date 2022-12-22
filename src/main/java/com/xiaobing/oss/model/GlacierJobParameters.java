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
 * Container for S3 Glacier job parameters.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class GlacierJobParameters implements SdkPojo, Serializable,
        ToCopyableBuilder<GlacierJobParameters.Builder, GlacierJobParameters> {
    private static final SdkField<String> TIER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Tier")
            .getter(getter(GlacierJobParameters::tierAsString))
            .setter(setter(Builder::tier))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tier")
                    .unmarshallLocationName("Tier").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(TIER_FIELD));

    private static final long serialVersionUID = 1L;

    private final String tier;

    private GlacierJobParameters(BuilderImpl builder) {
        this.tier = builder.tier;
    }

    /**
     * <p>
     * Retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #tier} will return
     * {@link Tier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #tierAsString}.
     * </p>
     * 
     * @return Retrieval tier at which the restore will be processed.
     * @see Tier
     */
    public final Tier tier() {
        return Tier.fromValue(tier);
    }

    /**
     * <p>
     * Retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #tier} will return
     * {@link Tier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #tierAsString}.
     * </p>
     * 
     * @return Retrieval tier at which the restore will be processed.
     * @see Tier
     */
    public final String tierAsString() {
        return tier;
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
        hashCode = 31 * hashCode + Objects.hashCode(tierAsString());
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
        if (!(obj instanceof GlacierJobParameters)) {
            return false;
        }
        GlacierJobParameters other = (GlacierJobParameters) obj;
        return Objects.equals(tierAsString(), other.tierAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GlacierJobParameters").add("Tier", tierAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Tier":
            return Optional.ofNullable(clazz.cast(tierAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GlacierJobParameters, T> g) {
        return obj -> g.apply((GlacierJobParameters) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, GlacierJobParameters> {
        /**
         * <p>
         * Retrieval tier at which the restore will be processed.
         * </p>
         * 
         * @param tier
         *        Retrieval tier at which the restore will be processed.
         * @see Tier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Tier
         */
        Builder tier(String tier);

        /**
         * <p>
         * Retrieval tier at which the restore will be processed.
         * </p>
         * 
         * @param tier
         *        Retrieval tier at which the restore will be processed.
         * @see Tier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Tier
         */
        Builder tier(Tier tier);
    }

    static final class BuilderImpl implements Builder {
        private String tier;

        private BuilderImpl() {
        }

        private BuilderImpl(GlacierJobParameters model) {
            tier(model.tier);
        }

        public final String getTier() {
            return tier;
        }

        public final void setTier(String tier) {
            this.tier = tier;
        }

        @Override
        public final Builder tier(String tier) {
            this.tier = tier;
            return this;
        }

        @Override
        public final Builder tier(Tier tier) {
            this.tier(tier == null ? null : tier.toString());
            return this;
        }

        @Override
        public GlacierJobParameters build() {
            return new GlacierJobParameters(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
