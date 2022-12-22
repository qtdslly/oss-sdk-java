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
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class PutBucketAnalyticsConfigurationRequest extends S3Request implements
        ToCopyableBuilder<PutBucketAnalyticsConfigurationRequest.Builder, PutBucketAnalyticsConfigurationRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketAnalyticsConfigurationRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Id")
            .getter(getter(PutBucketAnalyticsConfigurationRequest::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.QUERY_PARAM).locationName("id")
                    .unmarshallLocationName("id").build()).build();

    private static final SdkField<AnalyticsConfiguration> ANALYTICS_CONFIGURATION_FIELD = SdkField
            .<AnalyticsConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("AnalyticsConfiguration")
            .getter(getter(PutBucketAnalyticsConfigurationRequest::analyticsConfiguration))
            .setter(setter(Builder::analyticsConfiguration))
            .constructor(AnalyticsConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AnalyticsConfiguration")
                    .unmarshallLocationName("AnalyticsConfiguration").build(), PayloadTrait.create()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketAnalyticsConfigurationRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, ID_FIELD,
            ANALYTICS_CONFIGURATION_FIELD, EXPECTED_BUCKET_OWNER_FIELD));

    private final String bucket;

    private final String id;

    private final AnalyticsConfiguration analyticsConfiguration;

    private final String expectedBucketOwner;

    private PutBucketAnalyticsConfigurationRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.id = builder.id;
        this.analyticsConfiguration = builder.analyticsConfiguration;
        this.expectedBucketOwner = builder.expectedBucketOwner;
    }

    /**
     * <p>
     * The name of the bucket to which an analytics configuration is stored.
     * </p>
     * 
     * @return The name of the bucket to which an analytics configuration is stored.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     * 
     * @return The ID that identifies the analytics configuration.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     * 
     * @return The configuration and any analyses for the analytics filter.
     */
    public final AnalyticsConfiguration analyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * <p>
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
     * with the HTTP status code <code>403 Forbidden</code> (access denied).
     * </p>
     * 
     * @return The account ID of the expected bucket owner. If the bucket is owned by a different account, the request
     *         fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     */
    public final String expectedBucketOwner() {
        return expectedBucketOwner;
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
        hashCode = 31 * hashCode + Objects.hashCode(analyticsConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
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
        if (!(obj instanceof PutBucketAnalyticsConfigurationRequest)) {
            return false;
        }
        PutBucketAnalyticsConfigurationRequest other = (PutBucketAnalyticsConfigurationRequest) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(id(), other.id())
                && Objects.equals(analyticsConfiguration(), other.analyticsConfiguration())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketAnalyticsConfigurationRequest").add("Bucket", bucket()).add("Id", id())
                .add("AnalyticsConfiguration", analyticsConfiguration()).add("ExpectedBucketOwner", expectedBucketOwner())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Id":
            return Optional.ofNullable(clazz.cast(id()));
        case "AnalyticsConfiguration":
            return Optional.ofNullable(clazz.cast(analyticsConfiguration()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketAnalyticsConfigurationRequest, T> g) {
        return obj -> g.apply((PutBucketAnalyticsConfigurationRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, PutBucketAnalyticsConfigurationRequest> {
        /**
         * <p>
         * The name of the bucket to which an analytics configuration is stored.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket to which an analytics configuration is stored.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The ID that identifies the analytics configuration.
         * </p>
         * 
         * @param id
         *        The ID that identifies the analytics configuration.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * The configuration and any analyses for the analytics filter.
         * </p>
         * 
         * @param analyticsConfiguration
         *        The configuration and any analyses for the analytics filter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder analyticsConfiguration(AnalyticsConfiguration analyticsConfiguration);

        /**
         * <p>
         * The configuration and any analyses for the analytics filter.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsConfiguration.Builder} avoiding
         * the need to create one manually via {@link AnalyticsConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #analyticsConfiguration(AnalyticsConfiguration)}.
         * 
         * @param analyticsConfiguration
         *        a consumer that will call methods on {@link AnalyticsConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #analyticsConfiguration(AnalyticsConfiguration)
         */
        default Builder analyticsConfiguration(Consumer<AnalyticsConfiguration.Builder> analyticsConfiguration) {
            return analyticsConfiguration(AnalyticsConfiguration.builder().applyMutation(analyticsConfiguration).build());
        }

        /**
         * <p>
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
         * with the HTTP status code <code>403 Forbidden</code> (access denied).
         * </p>
         * 
         * @param expectedBucketOwner
         *        The account ID of the expected bucket owner. If the bucket is owned by a different account, the
         *        request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expectedBucketOwner(String expectedBucketOwner);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private String id;

        private AnalyticsConfiguration analyticsConfiguration;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketAnalyticsConfigurationRequest model) {
            super(model);
            bucket(model.bucket);
            id(model.id);
            analyticsConfiguration(model.analyticsConfiguration);
            expectedBucketOwner(model.expectedBucketOwner);
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

        public final AnalyticsConfiguration.Builder getAnalyticsConfiguration() {
            return analyticsConfiguration != null ? analyticsConfiguration.toBuilder() : null;
        }

        public final void setAnalyticsConfiguration(AnalyticsConfiguration.BuilderImpl analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration != null ? analyticsConfiguration.build() : null;
        }

        @Override
        public final Builder analyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration;
            return this;
        }

        public final String getExpectedBucketOwner() {
            return expectedBucketOwner;
        }

        public final void setExpectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
        }

        @Override
        public final Builder expectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
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
        public PutBucketAnalyticsConfigurationRequest build() {
            return new PutBucketAnalyticsConfigurationRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
