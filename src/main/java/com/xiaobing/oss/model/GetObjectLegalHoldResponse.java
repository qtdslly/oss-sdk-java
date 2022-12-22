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
import java.util.function.Consumer;
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
public final class GetObjectLegalHoldResponse extends S3Response implements
        ToCopyableBuilder<GetObjectLegalHoldResponse.Builder, GetObjectLegalHoldResponse> {
    private static final SdkField<ObjectLockLegalHold> LEGAL_HOLD_FIELD = SdkField
            .<ObjectLockLegalHold> builder(MarshallingType.SDK_POJO)
            .memberName("LegalHold")
            .getter(getter(GetObjectLegalHoldResponse::legalHold))
            .setter(setter(Builder::legalHold))
            .constructor(ObjectLockLegalHold::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LegalHold")
                    .unmarshallLocationName("LegalHold").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(LEGAL_HOLD_FIELD));

    private final ObjectLockLegalHold legalHold;

    private GetObjectLegalHoldResponse(BuilderImpl builder) {
        super(builder);
        this.legalHold = builder.legalHold;
    }

    /**
     * <p>
     * The current legal hold status for the specified object.
     * </p>
     * 
     * @return The current legal hold status for the specified object.
     */
    public final ObjectLockLegalHold legalHold() {
        return legalHold;
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
        hashCode = 31 * hashCode + Objects.hashCode(legalHold());
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
        if (!(obj instanceof GetObjectLegalHoldResponse)) {
            return false;
        }
        GetObjectLegalHoldResponse other = (GetObjectLegalHoldResponse) obj;
        return Objects.equals(legalHold(), other.legalHold());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectLegalHoldResponse").add("LegalHold", legalHold()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "LegalHold":
            return Optional.ofNullable(clazz.cast(legalHold()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectLegalHoldResponse, T> g) {
        return obj -> g.apply((GetObjectLegalHoldResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectLegalHoldResponse> {
        /**
         * <p>
         * The current legal hold status for the specified object.
         * </p>
         * 
         * @param legalHold
         *        The current legal hold status for the specified object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder legalHold(ObjectLockLegalHold legalHold);

        /**
         * <p>
         * The current legal hold status for the specified object.
         * </p>
         * This is a convenience method that creates an instance of the {@link ObjectLockLegalHold.Builder} avoiding the
         * need to create one manually via {@link ObjectLockLegalHold#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ObjectLockLegalHold.Builder#build()} is called immediately and
         * its result is passed to {@link #legalHold(ObjectLockLegalHold)}.
         * 
         * @param legalHold
         *        a consumer that will call methods on {@link ObjectLockLegalHold.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #legalHold(ObjectLockLegalHold)
         */
        default Builder legalHold(Consumer<ObjectLockLegalHold.Builder> legalHold) {
            return legalHold(ObjectLockLegalHold.builder().applyMutation(legalHold).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private ObjectLockLegalHold legalHold;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectLegalHoldResponse model) {
            super(model);
            legalHold(model.legalHold);
        }

        public final ObjectLockLegalHold.Builder getLegalHold() {
            return legalHold != null ? legalHold.toBuilder() : null;
        }

        public final void setLegalHold(ObjectLockLegalHold.BuilderImpl legalHold) {
            this.legalHold = legalHold != null ? legalHold.build() : null;
        }

        @Override
        public final Builder legalHold(ObjectLockLegalHold legalHold) {
            this.legalHold = legalHold;
            return this;
        }

        @Override
        public GetObjectLegalHoldResponse build() {
            return new GetObjectLegalHoldResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
