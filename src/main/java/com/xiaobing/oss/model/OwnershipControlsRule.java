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
 * The container element for an ownership control rule.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class OwnershipControlsRule implements SdkPojo, Serializable,
        ToCopyableBuilder<OwnershipControlsRule.Builder, OwnershipControlsRule> {
    private static final SdkField<String> OBJECT_OWNERSHIP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectOwnership")
            .getter(getter(OwnershipControlsRule::objectOwnershipAsString))
            .setter(setter(Builder::objectOwnership))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectOwnership")
                    .unmarshallLocationName("ObjectOwnership").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OBJECT_OWNERSHIP_FIELD));

    private static final long serialVersionUID = 1L;

    private final String objectOwnership;

    private OwnershipControlsRule(BuilderImpl builder) {
        this.objectOwnership = builder.objectOwnership;
    }

    /**
     * Returns the value of the ObjectOwnership property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectOwnership}
     * will return {@link ObjectOwnership#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectOwnershipAsString}.
     * </p>
     * 
     * @return The value of the ObjectOwnership property for this object.
     * @see ObjectOwnership
     */
    public final ObjectOwnership objectOwnership() {
        return ObjectOwnership.fromValue(objectOwnership);
    }

    /**
     * Returns the value of the ObjectOwnership property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectOwnership}
     * will return {@link ObjectOwnership#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectOwnershipAsString}.
     * </p>
     * 
     * @return The value of the ObjectOwnership property for this object.
     * @see ObjectOwnership
     */
    public final String objectOwnershipAsString() {
        return objectOwnership;
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
        hashCode = 31 * hashCode + Objects.hashCode(objectOwnershipAsString());
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
        if (!(obj instanceof OwnershipControlsRule)) {
            return false;
        }
        OwnershipControlsRule other = (OwnershipControlsRule) obj;
        return Objects.equals(objectOwnershipAsString(), other.objectOwnershipAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("OwnershipControlsRule").add("ObjectOwnership", objectOwnershipAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ObjectOwnership":
            return Optional.ofNullable(clazz.cast(objectOwnershipAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<OwnershipControlsRule, T> g) {
        return obj -> g.apply((OwnershipControlsRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, OwnershipControlsRule> {
        /**
         * Sets the value of the ObjectOwnership property for this object.
         *
         * @param objectOwnership
         *        The new value for the ObjectOwnership property for this object.
         * @see ObjectOwnership
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectOwnership
         */
        Builder objectOwnership(String objectOwnership);

        /**
         * Sets the value of the ObjectOwnership property for this object.
         *
         * @param objectOwnership
         *        The new value for the ObjectOwnership property for this object.
         * @see ObjectOwnership
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectOwnership
         */
        Builder objectOwnership(ObjectOwnership objectOwnership);
    }

    static final class BuilderImpl implements Builder {
        private String objectOwnership;

        private BuilderImpl() {
        }

        private BuilderImpl(OwnershipControlsRule model) {
            objectOwnership(model.objectOwnership);
        }

        public final String getObjectOwnership() {
            return objectOwnership;
        }

        public final void setObjectOwnership(String objectOwnership) {
            this.objectOwnership = objectOwnership;
        }

        @Override
        public final Builder objectOwnership(String objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        @Override
        public final Builder objectOwnership(ObjectOwnership objectOwnership) {
            this.objectOwnership(objectOwnership == null ? null : objectOwnership.toString());
            return this;
        }

        @Override
        public OwnershipControlsRule build() {
            return new OwnershipControlsRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
