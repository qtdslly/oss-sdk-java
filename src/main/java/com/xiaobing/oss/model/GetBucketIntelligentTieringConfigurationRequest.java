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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
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
public final class GetBucketIntelligentTieringConfigurationRequest extends S3Request
        implements
        ToCopyableBuilder<GetBucketIntelligentTieringConfigurationRequest.Builder, GetBucketIntelligentTieringConfigurationRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(GetBucketIntelligentTieringConfigurationRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(GetBucketIntelligentTieringConfigurationRequest::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("id")
                    .unmarshallLocationName("id").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, ID_FIELD));

    private final String bucket;

    private final String id;

    private GetBucketIntelligentTieringConfigurationRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.id = builder.id;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * </p>
     * 
     * @return The ID used to identify the S3 Intelligent-Tiering configuration.
     */
    public final String id() {
        return id;
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
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(id());
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
        if (!(obj instanceof GetBucketIntelligentTieringConfigurationRequest)) {
            return false;
        }
        GetBucketIntelligentTieringConfigurationRequest other = (GetBucketIntelligentTieringConfigurationRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(id(), other.id());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketIntelligentTieringConfigurationRequest").add("Bucket", bucket()).add("Id", id())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketIntelligentTieringConfigurationRequest, T> g) {
        return obj -> g.apply((GetBucketIntelligentTieringConfigurationRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo,
            CopyableBuilder<Builder, GetBucketIntelligentTieringConfigurationRequest> {
        /**
         * <p>
         * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
         * </p>
         * 
         * @param bucket
         *        The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The ID used to identify the S3 Intelligent-Tiering configuration.
         * </p>
         * 
         * @param id
         *        The ID used to identify the S3 Intelligent-Tiering configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String id;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketIntelligentTieringConfigurationRequest model) {
            super(model);
            bucket(model.bucket);
            id(model.id);
        }

        public final String getBucket() {
            return bucket;
        }

        public final void setBucket(String bucket) {
            this.bucket = bucket;
        }

        @Override
        public final Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
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

        @Override
        public Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration) {
            super.overrideConfiguration(overrideConfiguration);
            return this;
        }

        @Override
        public Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer) {
            super.overrideConfiguration(builderConsumer);
            return this;
        }

        @Override
        public GetBucketIntelligentTieringConfigurationRequest build() {
            return new GetBucketIntelligentTieringConfigurationRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
