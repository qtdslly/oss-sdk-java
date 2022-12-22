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
public final class GetObjectLockConfigurationResponse extends S3Response implements
        ToCopyableBuilder<GetObjectLockConfigurationResponse.Builder, GetObjectLockConfigurationResponse> {
    private static final SdkField<ObjectLockConfiguration> OBJECT_LOCK_CONFIGURATION_FIELD = SdkField
            .<ObjectLockConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("ObjectLockConfiguration")
            .getter(getter(GetObjectLockConfigurationResponse::objectLockConfiguration))
            .setter(setter(Builder::objectLockConfiguration))
            .constructor(ObjectLockConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ObjectLockConfiguration")
                    .unmarshallLocationName("ObjectLockConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays
            .asList(OBJECT_LOCK_CONFIGURATION_FIELD));

    private final ObjectLockConfiguration objectLockConfiguration;

    private GetObjectLockConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.objectLockConfiguration = builder.objectLockConfiguration;
    }

    /**
     * <p>
     * The specified bucket's Object Lock configuration.
     * </p>
     * 
     * @return The specified bucket's Object Lock configuration.
     */
    public final ObjectLockConfiguration objectLockConfiguration() {
        return objectLockConfiguration;
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
        hashCode = 31 * hashCode + Objects.hashCode(objectLockConfiguration());
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
        if (!(obj instanceof GetObjectLockConfigurationResponse)) {
            return false;
        }
        GetObjectLockConfigurationResponse other = (GetObjectLockConfigurationResponse) obj;
        return Objects.equals(objectLockConfiguration(), other.objectLockConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectLockConfigurationResponse").add("ObjectLockConfiguration", objectLockConfiguration())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ObjectLockConfiguration":
            return Optional.ofNullable(clazz.cast(objectLockConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectLockConfigurationResponse, T> g) {
        return obj -> g.apply((GetObjectLockConfigurationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectLockConfigurationResponse> {
        /**
         * <p>
         * The specified bucket's Object Lock configuration.
         * </p>
         * 
         * @param objectLockConfiguration
         *        The specified bucket's Object Lock configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectLockConfiguration(ObjectLockConfiguration objectLockConfiguration);

        /**
         * <p>
         * The specified bucket's Object Lock configuration.
         * </p>
         * This is a convenience method that creates an instance of the {@link ObjectLockConfiguration.Builder} avoiding
         * the need to create one manually via {@link ObjectLockConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ObjectLockConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #objectLockConfiguration(ObjectLockConfiguration)}.
         * 
         * @param objectLockConfiguration
         *        a consumer that will call methods on {@link ObjectLockConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #objectLockConfiguration(ObjectLockConfiguration)
         */
        default Builder objectLockConfiguration(Consumer<ObjectLockConfiguration.Builder> objectLockConfiguration) {
            return objectLockConfiguration(ObjectLockConfiguration.builder().applyMutation(objectLockConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private ObjectLockConfiguration objectLockConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectLockConfigurationResponse model) {
            super(model);
            objectLockConfiguration(model.objectLockConfiguration);
        }

        public final ObjectLockConfiguration.Builder getObjectLockConfiguration() {
            return objectLockConfiguration != null ? objectLockConfiguration.toBuilder() : null;
        }

        public final void setObjectLockConfiguration(ObjectLockConfiguration.BuilderImpl objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration != null ? objectLockConfiguration.build() : null;
        }

        @Override
        public final Builder objectLockConfiguration(ObjectLockConfiguration objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        @Override
        public GetObjectLockConfigurationResponse build() {
            return new GetObjectLockConfigurationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
