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
 * Describes the location where the restore job's output is stored.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class OutputLocation implements SdkPojo, Serializable, ToCopyableBuilder<OutputLocation.Builder, OutputLocation> {
    private static final SdkField<S3Location> S3_FIELD = SdkField
            .<S3Location> builder(MarshallingType.SDK_POJO)
            .memberName("S3")
            .getter(getter(OutputLocation::s3))
            .setter(setter(Builder::s3))
            .constructor(S3Location::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("S3").unmarshallLocationName("S3")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(S3_FIELD));

    private static final long serialVersionUID = 1L;

    private final S3Location s3;

    private OutputLocation(BuilderImpl builder) {
        this.s3 = builder.s3;
    }

    /**
     * <p>
     * Describes an S3 location that will receive the results of the restore request.
     * </p>
     * 
     * @return Describes an S3 location that will receive the results of the restore request.
     */
    public final S3Location s3() {
        return s3;
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
        hashCode = 31 * hashCode + Objects.hashCode(s3());
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
        if (!(obj instanceof OutputLocation)) {
            return false;
        }
        OutputLocation other = (OutputLocation) obj;
        return Objects.equals(s3(), other.s3());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("OutputLocation").add("S3", s3()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "S3":
            return Optional.ofNullable(clazz.cast(s3()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<OutputLocation, T> g) {
        return obj -> g.apply((OutputLocation) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, OutputLocation> {
        /**
         * <p>
         * Describes an S3 location that will receive the results of the restore request.
         * </p>
         * 
         * @param s3
         *        Describes an S3 location that will receive the results of the restore request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder s3(S3Location s3);

        /**
         * <p>
         * Describes an S3 location that will receive the results of the restore request.
         * </p>
         * This is a convenience method that creates an instance of the {@link S3Location.Builder} avoiding the need to
         * create one manually via {@link S3Location#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link S3Location.Builder#build()} is called immediately and its result
         * is passed to {@link #s3(S3Location)}.
         * 
         * @param s3
         *        a consumer that will call methods on {@link S3Location.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #s3(S3Location)
         */
        default Builder s3(Consumer<S3Location.Builder> s3) {
            return s3(S3Location.builder().applyMutation(s3).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private S3Location s3;

        private BuilderImpl() {
        }

        private BuilderImpl(OutputLocation model) {
            s3(model.s3);
        }

        public final S3Location.Builder getS3() {
            return s3 != null ? s3.toBuilder() : null;
        }

        public final void setS3(S3Location.BuilderImpl s3) {
            this.s3 = s3 != null ? s3.build() : null;
        }

        @Override
        public final Builder s3(S3Location s3) {
            this.s3 = s3;
            return this;
        }

        @Override
        public OutputLocation build() {
            return new OutputLocation(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
