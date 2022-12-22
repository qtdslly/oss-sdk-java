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
 * Contains the type of server-side encryption used to encrypt the inventory results.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class InventoryEncryption implements SdkPojo, Serializable,
        ToCopyableBuilder<InventoryEncryption.Builder, InventoryEncryption> {
    private static final SdkField<SSES3> SSES3_FIELD = SdkField
            .<SSES3> builder(MarshallingType.SDK_POJO)
            .memberName("SSES3")
            .getter(getter(InventoryEncryption::sses3))
            .setter(setter(Builder::sses3))
            .constructor(SSES3::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SSE-S3")
                    .unmarshallLocationName("SSE-S3").build()).build();

    private static final SdkField<SSEKMS> SSEKMS_FIELD = SdkField
            .<SSEKMS> builder(MarshallingType.SDK_POJO)
            .memberName("SSEKMS")
            .getter(getter(InventoryEncryption::ssekms))
            .setter(setter(Builder::ssekms))
            .constructor(SSEKMS::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SSE-KMS")
                    .unmarshallLocationName("SSE-KMS").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(SSES3_FIELD, SSEKMS_FIELD));

    private static final long serialVersionUID = 1L;

    private final SSES3 sses3;

    private final SSEKMS ssekms;

    private InventoryEncryption(BuilderImpl builder) {
        this.sses3 = builder.sses3;
        this.ssekms = builder.ssekms;
    }

    /**
     * <p>
     * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
     * </p>
     * 
     * @return Specifies the use of SSE-S3 to encrypt delivered inventory reports.
     */
    public final SSES3 sses3() {
        return sses3;
    }

    /**
     * <p>
     * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
     * </p>
     * 
     * @return Specifies the use of SSE-KMS to encrypt delivered inventory reports.
     */
    public final SSEKMS ssekms() {
        return ssekms;
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
        hashCode = 31 * hashCode + Objects.hashCode(sses3());
        hashCode = 31 * hashCode + Objects.hashCode(ssekms());
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
        if (!(obj instanceof InventoryEncryption)) {
            return false;
        }
        InventoryEncryption other = (InventoryEncryption) obj;
        return Objects.equals(sses3(), other.sses3()) && Objects.equals(ssekms(), other.ssekms());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("InventoryEncryption").add("SSES3", sses3()).add("SSEKMS", ssekms()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "SSES3":
            return Optional.ofNullable(clazz.cast(sses3()));
        case "SSEKMS":
            return Optional.ofNullable(clazz.cast(ssekms()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<InventoryEncryption, T> g) {
        return obj -> g.apply((InventoryEncryption) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, InventoryEncryption> {
        /**
         * <p>
         * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
         * </p>
         * 
         * @param sses3
         *        Specifies the use of SSE-S3 to encrypt delivered inventory reports.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sses3(SSES3 sses3);

        /**
         * <p>
         * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
         * </p>
         * This is a convenience method that creates an instance of the {@link SSES3.Builder} avoiding the need to
         * create one manually via {@link SSES3#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link SSES3.Builder#build()} is called immediately and its result is
         * passed to {@link #sses3(SSES3)}.
         * 
         * @param sses3
         *        a consumer that will call methods on {@link SSES3.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #sses3(SSES3)
         */
        default Builder sses3(Consumer<SSES3.Builder> sses3) {
            return sses3(SSES3.builder().applyMutation(sses3).build());
        }

        /**
         * <p>
         * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
         * </p>
         * 
         * @param ssekms
         *        Specifies the use of SSE-KMS to encrypt delivered inventory reports.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ssekms(SSEKMS ssekms);

        /**
         * <p>
         * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
         * </p>
         * This is a convenience method that creates an instance of the {@link SSEKMS.Builder} avoiding the need to
         * create one manually via {@link SSEKMS#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link SSEKMS.Builder#build()} is called immediately and its result is
         * passed to {@link #ssekms(SSEKMS)}.
         * 
         * @param ssekms
         *        a consumer that will call methods on {@link SSEKMS.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #ssekms(SSEKMS)
         */
        default Builder ssekms(Consumer<SSEKMS.Builder> ssekms) {
            return ssekms(SSEKMS.builder().applyMutation(ssekms).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private SSES3 sses3;

        private SSEKMS ssekms;

        private BuilderImpl() {
        }

        private BuilderImpl(InventoryEncryption model) {
            sses3(model.sses3);
            ssekms(model.ssekms);
        }

        public final SSES3.Builder getSses3() {
            return sses3 != null ? sses3.toBuilder() : null;
        }

        public final void setSses3(SSES3.BuilderImpl sses3) {
            this.sses3 = sses3 != null ? sses3.build() : null;
        }

        @Override
        public final Builder sses3(SSES3 sses3) {
            this.sses3 = sses3;
            return this;
        }

        public final SSEKMS.Builder getSsekms() {
            return ssekms != null ? ssekms.toBuilder() : null;
        }

        public final void setSsekms(SSEKMS.BuilderImpl ssekms) {
            this.ssekms = ssekms != null ? ssekms.build() : null;
        }

        @Override
        public final Builder ssekms(SSEKMS ssekms) {
            this.ssekms = ssekms;
            return this;
        }

        @Override
        public InventoryEncryption build() {
            return new InventoryEncryption(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
