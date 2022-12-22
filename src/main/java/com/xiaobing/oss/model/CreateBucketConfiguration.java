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
 * The configuration information for the bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CreateBucketConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<CreateBucketConfiguration.Builder, CreateBucketConfiguration> {
    private static final SdkField<String> LOCATION_CONSTRAINT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("LocationConstraint")
            .getter(getter(CreateBucketConfiguration::locationConstraintAsString))
            .setter(setter(Builder::locationConstraint))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LocationConstraint")
                    .unmarshallLocationName("LocationConstraint").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LOCATION_CONSTRAINT_FIELD));

    private static final long serialVersionUID = 1L;

    private final String locationConstraint;

    private CreateBucketConfiguration(BuilderImpl builder) {
        this.locationConstraint = builder.locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in
     * the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #locationConstraint} will return {@link BucketLocationConstraint#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #locationConstraintAsString}.
     * </p>
     * 
     * @return Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is
     *         created in the US East (N. Virginia) Region (us-east-1).
     * @see BucketLocationConstraint
     */
    public final BucketLocationConstraint locationConstraint() {
        return BucketLocationConstraint.fromValue(locationConstraint);
    }

    /**
     * <p>
     * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in
     * the US East (N. Virginia) Region (us-east-1).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #locationConstraint} will return {@link BucketLocationConstraint#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #locationConstraintAsString}.
     * </p>
     * 
     * @return Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is
     *         created in the US East (N. Virginia) Region (us-east-1).
     * @see BucketLocationConstraint
     */
    public final String locationConstraintAsString() {
        return locationConstraint;
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
        hashCode = 31 * hashCode + Objects.hashCode(locationConstraintAsString());
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
        if (!(obj instanceof CreateBucketConfiguration)) {
            return false;
        }
        CreateBucketConfiguration other = (CreateBucketConfiguration) obj;
        return Objects.equals(locationConstraintAsString(), other.locationConstraintAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CreateBucketConfiguration").add("LocationConstraint", locationConstraintAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "LocationConstraint":
            return Optional.ofNullable(clazz.cast(locationConstraintAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CreateBucketConfiguration, T> g) {
        return obj -> g.apply((CreateBucketConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CreateBucketConfiguration> {
        /**
         * <p>
         * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created
         * in the US East (N. Virginia) Region (us-east-1).
         * </p>
         * 
         * @param locationConstraint
         *        Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is
         *        created in the US East (N. Virginia) Region (us-east-1).
         * @see BucketLocationConstraint
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLocationConstraint
         */
        Builder locationConstraint(String locationConstraint);

        /**
         * <p>
         * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created
         * in the US East (N. Virginia) Region (us-east-1).
         * </p>
         * 
         * @param locationConstraint
         *        Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is
         *        created in the US East (N. Virginia) Region (us-east-1).
         * @see BucketLocationConstraint
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLocationConstraint
         */
        Builder locationConstraint(BucketLocationConstraint locationConstraint);
    }

    static final class BuilderImpl implements Builder {
        private String locationConstraint;

        private BuilderImpl() {
        }

        private BuilderImpl(CreateBucketConfiguration model) {
            locationConstraint(model.locationConstraint);
        }

        public final String getLocationConstraint() {
            return locationConstraint;
        }

        public final void setLocationConstraint(String locationConstraint) {
            this.locationConstraint = locationConstraint;
        }

        @Override
        public final Builder locationConstraint(String locationConstraint) {
            this.locationConstraint = locationConstraint;
            return this;
        }

        @Override
        public final Builder locationConstraint(BucketLocationConstraint locationConstraint) {
            this.locationConstraint(locationConstraint == null ? null : locationConstraint.toString());
            return this;
        }

        @Override
        public CreateBucketConfiguration build() {
            return new CreateBucketConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
