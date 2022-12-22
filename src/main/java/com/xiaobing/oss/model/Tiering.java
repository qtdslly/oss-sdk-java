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
 * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to the
 * most cost-effective storage access tier, without additional operational overhead.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Tiering implements SdkPojo, Serializable, ToCopyableBuilder<Tiering.Builder, Tiering> {
    private static final SdkField<Integer> DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Days")
            .getter(getter(Tiering::days))
            .setter(setter(Builder::days))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Days")
                    .unmarshallLocationName("Days").build()).build();

    private static final SdkField<String> ACCESS_TIER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AccessTier")
            .getter(getter(Tiering::accessTierAsString))
            .setter(setter(Builder::accessTier))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessTier")
                    .unmarshallLocationName("AccessTier").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections
            .unmodifiableList(Arrays.asList(DAYS_FIELD, ACCESS_TIER_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer days;

    private final String accessTier;

    private Tiering(BuilderImpl builder) {
        this.days = builder.days;
        this.accessTier = builder.accessTier;
    }

    /**
     * <p>
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the
     * corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and
     * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
     * </p>
     * 
     * @return The number of consecutive days of no access after which an object will be eligible to be transitioned to
     *         the corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90
     *         days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
     */
    public final Integer days() {
        return days;
    }

    /**
     * <p>
     * S3 Intelligent-Tiering access tier. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a> for a list of access tiers in
     * the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #accessTier} will
     * return {@link IntelligentTieringAccessTier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #accessTierAsString}.
     * </p>
     * 
     * @return S3 Intelligent-Tiering access tier. See <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
     *         >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a list
     *         of access tiers in the S3 Intelligent-Tiering storage class.
     * @see IntelligentTieringAccessTier
     */
    public final IntelligentTieringAccessTier accessTier() {
        return IntelligentTieringAccessTier.fromValue(accessTier);
    }

    /**
     * <p>
     * S3 Intelligent-Tiering access tier. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a> for a list of access tiers in
     * the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #accessTier} will
     * return {@link IntelligentTieringAccessTier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #accessTierAsString}.
     * </p>
     * 
     * @return S3 Intelligent-Tiering access tier. See <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
     *         >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a list
     *         of access tiers in the S3 Intelligent-Tiering storage class.
     * @see IntelligentTieringAccessTier
     */
    public final String accessTierAsString() {
        return accessTier;
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
        hashCode = 31 * hashCode + Objects.hashCode(days());
        hashCode = 31 * hashCode + Objects.hashCode(accessTierAsString());
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
        if (!(obj instanceof Tiering)) {
            return false;
        }
        Tiering other = (Tiering) obj;
        return Objects.equals(days(), other.days()) && Objects.equals(accessTierAsString(), other.accessTierAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Tiering").add("Days", days()).add("AccessTier", accessTierAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Days":
            return Optional.ofNullable(clazz.cast(days()));
        case "AccessTier":
            return Optional.ofNullable(clazz.cast(accessTierAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Tiering, T> g) {
        return obj -> g.apply((Tiering) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Tiering> {
        /**
         * <p>
         * The number of consecutive days of no access after which an object will be eligible to be transitioned to the
         * corresponding tier. The minimum number of days specified for Archive Access tier must be at least 90 days and
         * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
         * </p>
         * 
         * @param days
         *        The number of consecutive days of no access after which an object will be eligible to be transitioned
         *        to the corresponding tier. The minimum number of days specified for Archive Access tier must be at
         *        least 90 days and Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years
         *        (730 days).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder days(Integer days);

        /**
         * <p>
         * S3 Intelligent-Tiering access tier. See <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
         * >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a list of
         * access tiers in the S3 Intelligent-Tiering storage class.
         * </p>
         * 
         * @param accessTier
         *        S3 Intelligent-Tiering access tier. See <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
         *        >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a
         *        list of access tiers in the S3 Intelligent-Tiering storage class.
         * @see IntelligentTieringAccessTier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringAccessTier
         */
        Builder accessTier(String accessTier);

        /**
         * <p>
         * S3 Intelligent-Tiering access tier. See <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
         * >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a list of
         * access tiers in the S3 Intelligent-Tiering storage class.
         * </p>
         * 
         * @param accessTier
         *        S3 Intelligent-Tiering access tier. See <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access"
         *        >Storage class for automatically optimizing frequently and infrequently accessed objects</a> for a
         *        list of access tiers in the S3 Intelligent-Tiering storage class.
         * @see IntelligentTieringAccessTier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see IntelligentTieringAccessTier
         */
        Builder accessTier(IntelligentTieringAccessTier accessTier);
    }

    static final class BuilderImpl implements Builder {
        private Integer days;

        private String accessTier;

        private BuilderImpl() {
        }

        private BuilderImpl(Tiering model) {
            days(model.days);
            accessTier(model.accessTier);
        }

        public final Integer getDays() {
            return days;
        }

        public final void setDays(Integer days) {
            this.days = days;
        }

        @Override
        public final Builder days(Integer days) {
            this.days = days;
            return this;
        }

        public final String getAccessTier() {
            return accessTier;
        }

        public final void setAccessTier(String accessTier) {
            this.accessTier = accessTier;
        }

        @Override
        public final Builder accessTier(String accessTier) {
            this.accessTier = accessTier;
            return this;
        }

        @Override
        public final Builder accessTier(IntelligentTieringAccessTier accessTier) {
            this.accessTier(accessTier == null ? null : accessTier.toString());
            return this;
        }

        @Override
        public Tiering build() {
            return new Tiering(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
