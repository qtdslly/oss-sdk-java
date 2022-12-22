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
public final class GetBucketRequestPaymentResponse extends S3Response implements
        ToCopyableBuilder<GetBucketRequestPaymentResponse.Builder, GetBucketRequestPaymentResponse> {
    private static final SdkField<String> PAYER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Payer")
            .getter(getter(GetBucketRequestPaymentResponse::payerAsString))
            .setter(setter(Builder::payer))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Payer")
                    .unmarshallLocationName("Payer").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PAYER_FIELD));

    private final String payer;

    private GetBucketRequestPaymentResponse(BuilderImpl builder) {
        super(builder);
        this.payer = builder.payer;
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #payer} will return
     * {@link Payer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #payerAsString}.
     * </p>
     * 
     * @return Specifies who pays for the download and request fees.
     * @see Payer
     */
    public final Payer payer() {
        return Payer.fromValue(payer);
    }

    /**
     * <p>
     * Specifies who pays for the download and request fees.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #payer} will return
     * {@link Payer#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #payerAsString}.
     * </p>
     * 
     * @return Specifies who pays for the download and request fees.
     * @see Payer
     */
    public final String payerAsString() {
        return payer;
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
        hashCode = 31 * hashCode + Objects.hashCode(payerAsString());
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
        if (!(obj instanceof GetBucketRequestPaymentResponse)) {
            return false;
        }
        GetBucketRequestPaymentResponse other = (GetBucketRequestPaymentResponse) obj;
        return Objects.equals(payerAsString(), other.payerAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketRequestPaymentResponse").add("Payer", payerAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Payer":
            return Optional.ofNullable(clazz.cast(payerAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketRequestPaymentResponse, T> g) {
        return obj -> g.apply((GetBucketRequestPaymentResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketRequestPaymentResponse> {
        /**
         * <p>
         * Specifies who pays for the download and request fees.
         * </p>
         * 
         * @param payer
         *        Specifies who pays for the download and request fees.
         * @see Payer
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Payer
         */
        Builder payer(String payer);

        /**
         * <p>
         * Specifies who pays for the download and request fees.
         * </p>
         * 
         * @param payer
         *        Specifies who pays for the download and request fees.
         * @see Payer
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Payer
         */
        Builder payer(Payer payer);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String payer;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketRequestPaymentResponse model) {
            super(model);
            payer(model.payer);
        }

        public final String getPayer() {
            return payer;
        }

        public final void setPayer(String payer) {
            this.payer = payer;
        }

        @Override
        public final Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        @Override
        public final Builder payer(Payer payer) {
            this.payer(payer == null ? null : payer.toString());
            return this;
        }

        @Override
        public GetBucketRequestPaymentResponse build() {
            return new GetBucketRequestPaymentResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
