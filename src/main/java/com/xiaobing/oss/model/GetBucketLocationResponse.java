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
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetBucketLocationResponse extends S3Response implements
        ToCopyableBuilder<GetBucketLocationResponse.Builder, GetBucketLocationResponse> {
    private static final SdkField<String> LOCATION_CONSTRAINT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("LocationConstraint")
            .getter(getter(GetBucketLocationResponse::locationConstraintAsString))
            .setter(setter(Builder::locationConstraint))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LocationConstraint")
                    .unmarshallLocationName("LocationConstraint").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LOCATION_CONSTRAINT_FIELD));

    private final String locationConstraint;

    private GetBucketLocationResponse(BuilderImpl builder) {
        super(builder);
        this.locationConstraint = builder.locationConstraint;
    }

    /**
     * <p>
     * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by
     * Region, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and
     * Endpoints</a>. Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #locationConstraint} will return {@link BucketLocationConstraint#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #locationConstraintAsString}.
     * </p>
     * 
     * @return Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location
     *         constraints by Region, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a>.
     *         Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
     * @see BucketLocationConstraint
     */
    public final BucketLocationConstraint locationConstraint() {
        return BucketLocationConstraint.fromValue(locationConstraint);
    }

    /**
     * <p>
     * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by
     * Region, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and
     * Endpoints</a>. Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #locationConstraint} will return {@link BucketLocationConstraint#UNKNOWN_TO_SDK_VERSION}. The raw value
     * returned by the service is available from {@link #locationConstraintAsString}.
     * </p>
     * 
     * @return Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location
     *         constraints by Region, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a>.
     *         Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(locationConstraintAsString());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof GetBucketLocationResponse)) {
            return false;
        }
        GetBucketLocationResponse other = (GetBucketLocationResponse) obj;
        return Objects.equals(locationConstraintAsString(), other.locationConstraintAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketLocationResponse").add("LocationConstraint", locationConstraintAsString()).build();
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

    private static <T> Function<Object, T> getter(Function<GetBucketLocationResponse, T> g) {
        return obj -> g.apply((GetBucketLocationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketLocationResponse> {
        /**
         * <p>
         * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints
         * by Region, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and
         * Endpoints</a>. Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
         * </p>
         * 
         * @param locationConstraint
         *        Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location
         *        constraints by Region, see <a
         *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a>.
         *        Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
         * @see BucketLocationConstraint
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLocationConstraint
         */
        Builder locationConstraint(String locationConstraint);

        /**
         * <p>
         * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints
         * by Region, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and
         * Endpoints</a>. Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
         * </p>
         * 
         * @param locationConstraint
         *        Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location
         *        constraints by Region, see <a
         *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a>.
         *        Buckets in Region <code>us-east-1</code> have a LocationConstraint of <code>null</code>.
         * @see BucketLocationConstraint
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLocationConstraint
         */
        Builder locationConstraint(BucketLocationConstraint locationConstraint);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String locationConstraint;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketLocationResponse model) {
            super(model);
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
        public GetBucketLocationResponse build() {
            return new GetBucketLocationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
