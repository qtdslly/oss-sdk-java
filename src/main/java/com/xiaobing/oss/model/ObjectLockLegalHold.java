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
 * A legal hold configuration for an object.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ObjectLockLegalHold implements SdkPojo, Serializable,
        ToCopyableBuilder<ObjectLockLegalHold.Builder, ObjectLockLegalHold> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(ObjectLockLegalHold::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STATUS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String status;

    private ObjectLockLegalHold(BuilderImpl builder) {
        this.status = builder.status;
    }

    /**
     * <p>
     * Indicates whether the specified object has a legal hold in place.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Indicates whether the specified object has a legal hold in place.
     * @see ObjectLockLegalHoldStatus
     */
    public final ObjectLockLegalHoldStatus status() {
        return ObjectLockLegalHoldStatus.fromValue(status);
    }

    /**
     * <p>
     * Indicates whether the specified object has a legal hold in place.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ObjectLockLegalHoldStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Indicates whether the specified object has a legal hold in place.
     * @see ObjectLockLegalHoldStatus
     */
    public final String statusAsString() {
        return status;
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
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
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
        if (!(obj instanceof ObjectLockLegalHold)) {
            return false;
        }
        ObjectLockLegalHold other = (ObjectLockLegalHold) obj;
        return Objects.equals(statusAsString(), other.statusAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ObjectLockLegalHold").add("Status", statusAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ObjectLockLegalHold, T> g) {
        return obj -> g.apply((ObjectLockLegalHold) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ObjectLockLegalHold> {
        /**
         * <p>
         * Indicates whether the specified object has a legal hold in place.
         * </p>
         * 
         * @param status
         *        Indicates whether the specified object has a legal hold in place.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Indicates whether the specified object has a legal hold in place.
         * </p>
         * 
         * @param status
         *        Indicates whether the specified object has a legal hold in place.
         * @see ObjectLockLegalHoldStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectLockLegalHoldStatus
         */
        Builder status(ObjectLockLegalHoldStatus status);
    }

    static final class BuilderImpl implements Builder {
        private String status;

        private BuilderImpl() {
        }

        private BuilderImpl(ObjectLockLegalHold model) {
            status(model.status);
        }

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        @Override
        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public final Builder status(ObjectLockLegalHoldStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        @Override
        public ObjectLockLegalHold build() {
            return new ObjectLockLegalHold(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
