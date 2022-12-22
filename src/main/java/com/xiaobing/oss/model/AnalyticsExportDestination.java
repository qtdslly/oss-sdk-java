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
 * Where to publish the analytics results.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AnalyticsExportDestination implements SdkPojo, Serializable,
        ToCopyableBuilder<AnalyticsExportDestination.Builder, AnalyticsExportDestination> {
    private static final SdkField<AnalyticsS3BucketDestination> S3_BUCKET_DESTINATION_FIELD = SdkField
            .<AnalyticsS3BucketDestination> builder(MarshallingType.SDK_POJO)
            .memberName("S3BucketDestination")
            .getter(getter(AnalyticsExportDestination::s3BucketDestination))
            .setter(setter(Builder::s3BucketDestination))
            .constructor(AnalyticsS3BucketDestination::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("S3BucketDestination")
                    .unmarshallLocationName("S3BucketDestination").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(S3_BUCKET_DESTINATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final AnalyticsS3BucketDestination s3BucketDestination;

    private AnalyticsExportDestination(BuilderImpl builder) {
        this.s3BucketDestination = builder.s3BucketDestination;
    }

    /**
     * <p>
     * A destination signifying output to an S3 bucket.
     * </p>
     * 
     * @return A destination signifying output to an S3 bucket.
     */
    public final AnalyticsS3BucketDestination s3BucketDestination() {
        return s3BucketDestination;
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
        hashCode = 31 * hashCode + Objects.hashCode(s3BucketDestination());
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
        if (!(obj instanceof AnalyticsExportDestination)) {
            return false;
        }
        AnalyticsExportDestination other = (AnalyticsExportDestination) obj;
        return Objects.equals(s3BucketDestination(), other.s3BucketDestination());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AnalyticsExportDestination").add("S3BucketDestination", s3BucketDestination()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "S3BucketDestination":
            return Optional.ofNullable(clazz.cast(s3BucketDestination()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AnalyticsExportDestination, T> g) {
        return obj -> g.apply((AnalyticsExportDestination) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AnalyticsExportDestination> {
        /**
         * <p>
         * A destination signifying output to an S3 bucket.
         * </p>
         * 
         * @param s3BucketDestination
         *        A destination signifying output to an S3 bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder s3BucketDestination(AnalyticsS3BucketDestination s3BucketDestination);

        /**
         * <p>
         * A destination signifying output to an S3 bucket.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsS3BucketDestination.Builder}
         * avoiding the need to create one manually via {@link AnalyticsS3BucketDestination#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsS3BucketDestination.Builder#build()} is called
         * immediately and its result is passed to {@link #s3BucketDestination(AnalyticsS3BucketDestination)}.
         * 
         * @param s3BucketDestination
         *        a consumer that will call methods on {@link AnalyticsS3BucketDestination.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #s3BucketDestination(AnalyticsS3BucketDestination)
         */
        default Builder s3BucketDestination(Consumer<AnalyticsS3BucketDestination.Builder> s3BucketDestination) {
            return s3BucketDestination(AnalyticsS3BucketDestination.builder().applyMutation(s3BucketDestination).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private AnalyticsS3BucketDestination s3BucketDestination;

        private BuilderImpl() {
        }

        private BuilderImpl(AnalyticsExportDestination model) {
            s3BucketDestination(model.s3BucketDestination);
        }

        public final AnalyticsS3BucketDestination.Builder getS3BucketDestination() {
            return s3BucketDestination != null ? s3BucketDestination.toBuilder() : null;
        }

        public final void setS3BucketDestination(AnalyticsS3BucketDestination.BuilderImpl s3BucketDestination) {
            this.s3BucketDestination = s3BucketDestination != null ? s3BucketDestination.build() : null;
        }

        @Override
        public final Builder s3BucketDestination(AnalyticsS3BucketDestination s3BucketDestination) {
            this.s3BucketDestination = s3BucketDestination;
            return this;
        }

        @Override
        public AnalyticsExportDestination build() {
            return new AnalyticsExportDestination(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
