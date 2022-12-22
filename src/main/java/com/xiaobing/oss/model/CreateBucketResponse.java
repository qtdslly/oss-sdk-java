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
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class CreateBucketResponse extends S3Response implements
        ToCopyableBuilder<CreateBucketResponse.Builder, CreateBucketResponse> {
    private static final SdkField<String> LOCATION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Location")
            .getter(getter(CreateBucketResponse::location))
            .setter(setter(Builder::location))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Location")
                    .unmarshallLocationName("Location").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LOCATION_FIELD));

    private final String location;

    private CreateBucketResponse(BuilderImpl builder) {
        super(builder);
        this.location = builder.location;
    }

    /**
     * <p>
     * A forward slash followed by the name of the bucket.
     * </p>
     * 
     * @return A forward slash followed by the name of the bucket.
     */
    public final String location() {
        return location;
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
        hashCode = 31 * hashCode + Objects.hashCode(location());
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
        if (!(obj instanceof CreateBucketResponse)) {
            return false;
        }
        CreateBucketResponse other = (CreateBucketResponse) obj;
        return Objects.equals(location(), other.location());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CreateBucketResponse").add("Location", location()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Location":
            return Optional.ofNullable(clazz.cast(location()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CreateBucketResponse, T> g) {
        return obj -> g.apply((CreateBucketResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, CreateBucketResponse> {
        /**
         * <p>
         * A forward slash followed by the name of the bucket.
         * </p>
         * 
         * @param location
         *        A forward slash followed by the name of the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder location(String location);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String location;

        private BuilderImpl() {
        }

        private BuilderImpl(CreateBucketResponse model) {
            super(model);
            location(model.location);
        }

        public final String getLocation() {
            return location;
        }

        public final void setLocation(String location) {
            this.location = location;
        }

        @Override
        public final Builder location(String location) {
            this.location = location;
            return this;
        }

        @Override
        public CreateBucketResponse build() {
            return new CreateBucketResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
