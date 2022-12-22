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
 * Container element that identifies who initiated the multipart upload.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Initiator implements SdkPojo, Serializable, ToCopyableBuilder<Initiator.Builder, Initiator> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ID")
            .getter(getter(Initiator::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ID").unmarshallLocationName("ID")
                    .build()).build();

    private static final SdkField<String> DISPLAY_NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("DisplayName")
            .getter(getter(Initiator::displayName))
            .setter(setter(Builder::displayName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DisplayName")
                    .unmarshallLocationName("DisplayName").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD, DISPLAY_NAME_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final String displayName;

    private Initiator(BuilderImpl builder) {
        this.id = builder.id;
        this.displayName = builder.displayName;
    }

    /**
     * <p>
     * If the principal is an Amazon Web Services account, it provides the Canonical User ID. If the principal is an IAM
     * User, it provides a user ARN value.
     * </p>
     * 
     * @return If the principal is an Amazon Web Services account, it provides the Canonical User ID. If the principal
     *         is an IAM User, it provides a user ARN value.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Name of the Principal.
     * </p>
     * 
     * @return Name of the Principal.
     */
    public final String displayName() {
        return displayName;
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
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(displayName());
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
        if (!(obj instanceof Initiator)) {
            return false;
        }
        Initiator other = (Initiator) obj;
        return Objects.equals(id(), other.id()) && Objects.equals(displayName(), other.displayName());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Initiator").add("ID", id()).add("DisplayName", displayName()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ID":
            return Optional.ofNullable(clazz.cast(id()));
        case "DisplayName":
            return Optional.ofNullable(clazz.cast(displayName()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Initiator, T> g) {
        return obj -> g.apply((Initiator) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Initiator> {
        /**
         * <p>
         * If the principal is an Amazon Web Services account, it provides the Canonical User ID. If the principal is an
         * IAM User, it provides a user ARN value.
         * </p>
         * 
         * @param id
         *        If the principal is an Amazon Web Services account, it provides the Canonical User ID. If the
         *        principal is an IAM User, it provides a user ARN value.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Name of the Principal.
         * </p>
         * 
         * @param displayName
         *        Name of the Principal.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder displayName(String displayName);
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private String displayName;

        private BuilderImpl() {
        }

        private BuilderImpl(Initiator model) {
            id(model.id);
            displayName(model.displayName);
        }

        public final String getId() {
            return id;
        }

        public final void setId(String id) {
            this.id = id;
        }

        @Override
        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final String getDisplayName() {
            return displayName;
        }

        public final void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public final Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        public Initiator build() {
            return new Initiator(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
