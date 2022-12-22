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
 * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class SSEKMS implements SdkPojo, Serializable, ToCopyableBuilder<SSEKMS.Builder, SSEKMS> {
    private static final SdkField<String> KEY_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KeyId")
            .getter(getter(SSEKMS::keyId))
            .setter(setter(Builder::keyId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyId")
                    .unmarshallLocationName("KeyId").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(KEY_ID_FIELD));

    private static final long serialVersionUID = 1L;

    private final String keyId;

    private SSEKMS(BuilderImpl builder) {
        this.keyId = builder.keyId;
    }

    /**
     * <p>
     * Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer
     * managed key to use for encrypting inventory reports.
     * </p>
     * 
     * @return Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
     *         customer managed key to use for encrypting inventory reports.
     */
    public final String keyId() {
        return keyId;
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
        hashCode = 31 * hashCode + Objects.hashCode(keyId());
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
        if (!(obj instanceof SSEKMS)) {
            return false;
        }
        SSEKMS other = (SSEKMS) obj;
        return Objects.equals(keyId(), other.keyId());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("SSEKMS").add("KeyId", keyId() == null ? null : "*** Sensitive Data Redacted ***").build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "KeyId":
            return Optional.ofNullable(clazz.cast(keyId()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<SSEKMS, T> g) {
        return obj -> g.apply((SSEKMS) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, SSEKMS> {
        /**
         * <p>
         * Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         * customer managed key to use for encrypting inventory reports.
         * </p>
         * 
         * @param keyId
         *        Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         *        customer managed key to use for encrypting inventory reports.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyId(String keyId);
    }

    static final class BuilderImpl implements Builder {
        private String keyId;

        private BuilderImpl() {
        }

        private BuilderImpl(SSEKMS model) {
            keyId(model.keyId);
        }

        public final String getKeyId() {
            return keyId;
        }

        public final void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        @Override
        public final Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        @Override
        public SSEKMS build() {
            return new SSEKMS(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
