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
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently
 * removing all parts of the upload. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
 * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AbortIncompleteMultipartUpload implements SdkPojo, Serializable,
        ToCopyableBuilder<AbortIncompleteMultipartUpload.Builder, AbortIncompleteMultipartUpload> {
    private static final SdkField<Integer> DAYS_AFTER_INITIATION_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("DaysAfterInitiation")
            .getter(getter(AbortIncompleteMultipartUpload::daysAfterInitiation))
            .setter(setter(Builder::daysAfterInitiation))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DaysAfterInitiation")
                    .unmarshallLocationName("DaysAfterInitiation").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DAYS_AFTER_INITIATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer daysAfterInitiation;

    private AbortIncompleteMultipartUpload(BuilderImpl builder) {
        this.daysAfterInitiation = builder.daysAfterInitiation;
    }

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * </p>
     * 
     * @return Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     */
    public final Integer daysAfterInitiation() {
        return daysAfterInitiation;
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
        hashCode = 31 * hashCode + Objects.hashCode(daysAfterInitiation());
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
        if (!(obj instanceof AbortIncompleteMultipartUpload)) {
            return false;
        }
        AbortIncompleteMultipartUpload other = (AbortIncompleteMultipartUpload) obj;
        return Objects.equals(daysAfterInitiation(), other.daysAfterInitiation());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AbortIncompleteMultipartUpload").add("DaysAfterInitiation", daysAfterInitiation()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DaysAfterInitiation":
            return Optional.ofNullable(clazz.cast(daysAfterInitiation()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AbortIncompleteMultipartUpload, T> g) {
        return obj -> g.apply((AbortIncompleteMultipartUpload) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AbortIncompleteMultipartUpload> {
        /**
         * <p>
         * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
         * </p>
         * 
         * @param daysAfterInitiation
         *        Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder daysAfterInitiation(Integer daysAfterInitiation);
    }

    static final class BuilderImpl implements Builder {
        private Integer daysAfterInitiation;

        private BuilderImpl() {
        }

        private BuilderImpl(AbortIncompleteMultipartUpload model) {
            daysAfterInitiation(model.daysAfterInitiation);
        }

        public final Integer getDaysAfterInitiation() {
            return daysAfterInitiation;
        }

        public final void setDaysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = daysAfterInitiation;
        }

        @Override
        public final Builder daysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = daysAfterInitiation;
            return this;
        }

        @Override
        public AbortIncompleteMultipartUpload build() {
            return new AbortIncompleteMultipartUpload(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
