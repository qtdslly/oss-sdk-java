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
public final class PutBucketNotificationConfigurationRequest extends S3Request implements
        ToCopyableBuilder<PutBucketNotificationConfigurationRequest.Builder, PutBucketNotificationConfigurationRequest> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketNotificationConfigurationRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<NotificationConfiguration> NOTIFICATION_CONFIGURATION_FIELD = SdkField
            .<NotificationConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("NotificationConfiguration")
            .getter(getter(PutBucketNotificationConfigurationRequest::notificationConfiguration))
            .setter(setter(Builder::notificationConfiguration))
            .constructor(NotificationConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NotificationConfiguration")
                    .unmarshallLocationName("NotificationConfiguration").build(), PayloadTrait.create()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketNotificationConfigurationRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final SdkField<Boolean> SKIP_DESTINATION_VALIDATION_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("SkipDestinationValidation")
            .getter(getter(PutBucketNotificationConfigurationRequest::skipDestinationValidation))
            .setter(setter(Builder::skipDestinationValidation))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-skip-destination-validation")
                    .unmarshallLocationName("x-amz-skip-destination-validation").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD,
            NOTIFICATION_CONFIGURATION_FIELD, EXPECTED_BUCKET_OWNER_FIELD, SKIP_DESTINATION_VALIDATION_FIELD));

    private final String bucket;

    private final NotificationConfiguration notificationConfiguration;

    private final String expectedBucketOwner;

    private final Boolean skipDestinationValidation;

    private PutBucketNotificationConfigurationRequest(BuilderImpl builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.notificationConfiguration = builder.notificationConfiguration;
        this.expectedBucketOwner = builder.expectedBucketOwner;
        this.skipDestinationValidation = builder.skipDestinationValidation;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * Returns the value of the NotificationConfiguration property for this object.
     * 
     * @return The value of the NotificationConfiguration property for this object.
     */
    public final NotificationConfiguration notificationConfiguration() {
        return notificationConfiguration;
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

    /**
     * <p>
     * Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
     * </p>
     * 
     * @return Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
     */
    public final Boolean skipDestinationValidation() {
        return skipDestinationValidation;
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
        hashCode = 31 * hashCode + Objects.hashCode(notificationConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
        hashCode = 31 * hashCode + Objects.hashCode(skipDestinationValidation());
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
        if (!(obj instanceof PutBucketNotificationConfigurationRequest)) {
            return false;
        }
        PutBucketNotificationConfigurationRequest other = (PutBucketNotificationConfigurationRequest) obj;
        return Objects.equals(bucket(), other.bucket())
                && Objects.equals(notificationConfiguration(), other.notificationConfiguration())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner())
                && Objects.equals(skipDestinationValidation(), other.skipDestinationValidation());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketNotificationConfigurationRequest").add("Bucket", bucket())
                .add("NotificationConfiguration", notificationConfiguration()).add("ExpectedBucketOwner", expectedBucketOwner())
                .add("SkipDestinationValidation", skipDestinationValidation()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "NotificationConfiguration":
            return Optional.ofNullable(clazz.cast(notificationConfiguration()));
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        case "SkipDestinationValidation":
            return Optional.ofNullable(clazz.cast(skipDestinationValidation()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketNotificationConfigurationRequest, T> g) {
        return obj -> g.apply((PutBucketNotificationConfigurationRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo,
            CopyableBuilder<Builder, PutBucketNotificationConfigurationRequest> {
        /**
         * <p>
         * The name of the bucket.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * Sets the value of the NotificationConfiguration property for this object.
         *
         * @param notificationConfiguration
         *        The new value for the NotificationConfiguration property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder notificationConfiguration(NotificationConfiguration notificationConfiguration);

        /**
         * Sets the value of the NotificationConfiguration property for this object.
         *
         * This is a convenience method that creates an instance of the {@link NotificationConfiguration.Builder}
         * avoiding the need to create one manually via {@link NotificationConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link NotificationConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #notificationConfiguration(NotificationConfiguration)}.
         * 
         * @param notificationConfiguration
         *        a consumer that will call methods on {@link NotificationConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #notificationConfiguration(NotificationConfiguration)
         */
        default Builder notificationConfiguration(Consumer<NotificationConfiguration.Builder> notificationConfiguration) {
            return notificationConfiguration(NotificationConfiguration.builder().applyMutation(notificationConfiguration).build());
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

        /**
         * <p>
         * Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
         * </p>
         * 
         * @param skipDestinationValidation
         *        Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder skipDestinationValidation(Boolean skipDestinationValidation);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String bucket;

        private NotificationConfiguration notificationConfiguration;

        private String expectedBucketOwner;

        private Boolean skipDestinationValidation;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketNotificationConfigurationRequest model) {
            super(model);
            bucket(model.bucket);
            notificationConfiguration(model.notificationConfiguration);
            expectedBucketOwner(model.expectedBucketOwner);
            skipDestinationValidation(model.skipDestinationValidation);
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

        public final NotificationConfiguration.Builder getNotificationConfiguration() {
            return notificationConfiguration != null ? notificationConfiguration.toBuilder() : null;
        }

        public final void setNotificationConfiguration(NotificationConfiguration.BuilderImpl notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration != null ? notificationConfiguration.build() : null;
        }

        @Override
        public final Builder notificationConfiguration(NotificationConfiguration notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration;
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

        public final Boolean getSkipDestinationValidation() {
            return skipDestinationValidation;
        }

        public final void setSkipDestinationValidation(Boolean skipDestinationValidation) {
            this.skipDestinationValidation = skipDestinationValidation;
        }

        @Override
        public final Builder skipDestinationValidation(Boolean skipDestinationValidation) {
            this.skipDestinationValidation = skipDestinationValidation;
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
        public PutBucketNotificationConfigurationRequest build() {
            return new PutBucketNotificationConfigurationRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
