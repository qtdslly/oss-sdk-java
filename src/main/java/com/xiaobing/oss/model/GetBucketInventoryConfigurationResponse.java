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
public final class GetBucketInventoryConfigurationResponse extends S3Response implements
        ToCopyableBuilder<GetBucketInventoryConfigurationResponse.Builder, GetBucketInventoryConfigurationResponse> {
    private static final SdkField<InventoryConfiguration> INVENTORY_CONFIGURATION_FIELD = SdkField
            .<InventoryConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("InventoryConfiguration")
            .getter(getter(GetBucketInventoryConfigurationResponse::inventoryConfiguration))
            .setter(setter(Builder::inventoryConfiguration))
            .constructor(InventoryConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("InventoryConfiguration")
                    .unmarshallLocationName("InventoryConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections
            .unmodifiableList(Arrays.asList(INVENTORY_CONFIGURATION_FIELD));

    private final InventoryConfiguration inventoryConfiguration;

    private GetBucketInventoryConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.inventoryConfiguration = builder.inventoryConfiguration;
    }

    /**
     * <p>
     * Specifies the inventory configuration.
     * </p>
     * 
     * @return Specifies the inventory configuration.
     */
    public final InventoryConfiguration inventoryConfiguration() {
        return inventoryConfiguration;
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
        hashCode = 31 * hashCode + Objects.hashCode(inventoryConfiguration());
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
        if (!(obj instanceof GetBucketInventoryConfigurationResponse)) {
            return false;
        }
        GetBucketInventoryConfigurationResponse other = (GetBucketInventoryConfigurationResponse) obj;
        return Objects.equals(inventoryConfiguration(), other.inventoryConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketInventoryConfigurationResponse")
                .add("InventoryConfiguration", inventoryConfiguration()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "InventoryConfiguration":
            return Optional.ofNullable(clazz.cast(inventoryConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketInventoryConfigurationResponse, T> g) {
        return obj -> g.apply((GetBucketInventoryConfigurationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo,
            CopyableBuilder<Builder, GetBucketInventoryConfigurationResponse> {
        /**
         * <p>
         * Specifies the inventory configuration.
         * </p>
         * 
         * @param inventoryConfiguration
         *        Specifies the inventory configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder inventoryConfiguration(InventoryConfiguration inventoryConfiguration);

        /**
         * <p>
         * Specifies the inventory configuration.
         * </p>
         * This is a convenience method that creates an instance of the {@link InventoryConfiguration.Builder} avoiding
         * the need to create one manually via {@link InventoryConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InventoryConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #inventoryConfiguration(InventoryConfiguration)}.
         * 
         * @param inventoryConfiguration
         *        a consumer that will call methods on {@link InventoryConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #inventoryConfiguration(InventoryConfiguration)
         */
        default Builder inventoryConfiguration(Consumer<InventoryConfiguration.Builder> inventoryConfiguration) {
            return inventoryConfiguration(InventoryConfiguration.builder().applyMutation(inventoryConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private InventoryConfiguration inventoryConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketInventoryConfigurationResponse model) {
            super(model);
            inventoryConfiguration(model.inventoryConfiguration);
        }

        public final InventoryConfiguration.Builder getInventoryConfiguration() {
            return inventoryConfiguration != null ? inventoryConfiguration.toBuilder() : null;
        }

        public final void setInventoryConfiguration(InventoryConfiguration.BuilderImpl inventoryConfiguration) {
            this.inventoryConfiguration = inventoryConfiguration != null ? inventoryConfiguration.build() : null;
        }

        @Override
        public final Builder inventoryConfiguration(InventoryConfiguration inventoryConfiguration) {
            this.inventoryConfiguration = inventoryConfiguration;
            return this;
        }

        @Override
        public GetBucketInventoryConfigurationResponse build() {
            return new GetBucketInventoryConfigurationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
