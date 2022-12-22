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
public final class GetPublicAccessBlockResponse extends S3Response implements
        ToCopyableBuilder<GetPublicAccessBlockResponse.Builder, GetPublicAccessBlockResponse> {
    private static final SdkField<PublicAccessBlockConfiguration> PUBLIC_ACCESS_BLOCK_CONFIGURATION_FIELD = SdkField
            .<PublicAccessBlockConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("PublicAccessBlockConfiguration")
            .getter(getter(GetPublicAccessBlockResponse::publicAccessBlockConfiguration))
            .setter(setter(Builder::publicAccessBlockConfiguration))
            .constructor(PublicAccessBlockConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PublicAccessBlockConfiguration")
                    .unmarshallLocationName("PublicAccessBlockConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays
            .asList(PUBLIC_ACCESS_BLOCK_CONFIGURATION_FIELD));

    private final PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    private GetPublicAccessBlockResponse(BuilderImpl builder) {
        super(builder);
        this.publicAccessBlockConfiguration = builder.publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The <code>PublicAccessBlock</code> configuration currently in effect for this Amazon S3 bucket.
     * </p>
     * 
     * @return The <code>PublicAccessBlock</code> configuration currently in effect for this Amazon S3 bucket.
     */
    public final PublicAccessBlockConfiguration publicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
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
        hashCode = 31 * hashCode + Objects.hashCode(publicAccessBlockConfiguration());
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
        if (!(obj instanceof GetPublicAccessBlockResponse)) {
            return false;
        }
        GetPublicAccessBlockResponse other = (GetPublicAccessBlockResponse) obj;
        return Objects.equals(publicAccessBlockConfiguration(), other.publicAccessBlockConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetPublicAccessBlockResponse")
                .add("PublicAccessBlockConfiguration", publicAccessBlockConfiguration()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "PublicAccessBlockConfiguration":
            return Optional.ofNullable(clazz.cast(publicAccessBlockConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetPublicAccessBlockResponse, T> g) {
        return obj -> g.apply((GetPublicAccessBlockResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetPublicAccessBlockResponse> {
        /**
         * <p>
         * The <code>PublicAccessBlock</code> configuration currently in effect for this Amazon S3 bucket.
         * </p>
         * 
         * @param publicAccessBlockConfiguration
         *        The <code>PublicAccessBlock</code> configuration currently in effect for this Amazon S3 bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder publicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration);

        /**
         * <p>
         * The <code>PublicAccessBlock</code> configuration currently in effect for this Amazon S3 bucket.
         * </p>
         * This is a convenience method that creates an instance of the {@link PublicAccessBlockConfiguration.Builder}
         * avoiding the need to create one manually via {@link PublicAccessBlockConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link PublicAccessBlockConfiguration.Builder#build()} is called
         * immediately and its result is passed to
         * {@link #publicAccessBlockConfiguration(PublicAccessBlockConfiguration)}.
         * 
         * @param publicAccessBlockConfiguration
         *        a consumer that will call methods on {@link PublicAccessBlockConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #publicAccessBlockConfiguration(PublicAccessBlockConfiguration)
         */
        default Builder publicAccessBlockConfiguration(
                Consumer<PublicAccessBlockConfiguration.Builder> publicAccessBlockConfiguration) {
            return publicAccessBlockConfiguration(PublicAccessBlockConfiguration.builder()
                    .applyMutation(publicAccessBlockConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetPublicAccessBlockResponse model) {
            super(model);
            publicAccessBlockConfiguration(model.publicAccessBlockConfiguration);
        }

        public final PublicAccessBlockConfiguration.Builder getPublicAccessBlockConfiguration() {
            return publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.toBuilder() : null;
        }

        public final void setPublicAccessBlockConfiguration(
                PublicAccessBlockConfiguration.BuilderImpl publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration != null ? publicAccessBlockConfiguration.build()
                    : null;
        }

        @Override
        public final Builder publicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        @Override
        public GetPublicAccessBlockResponse build() {
            return new GetPublicAccessBlockResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
