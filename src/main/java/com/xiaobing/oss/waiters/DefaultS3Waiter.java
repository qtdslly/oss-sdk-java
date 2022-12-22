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

package com.xiaobing.oss.waiters;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import com.xiaobing.oss.S3Client;
import com.xiaobing.oss.waiters.internal.WaitersRuntime;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.ApiName;
import software.amazon.awssdk.core.internal.waiters.WaiterAttribute;
import software.amazon.awssdk.core.retry.backoff.BackoffStrategy;
import software.amazon.awssdk.core.retry.backoff.FixedDelayBackoffStrategy;
import software.amazon.awssdk.core.waiters.Waiter;
import software.amazon.awssdk.core.waiters.WaiterAcceptor;
import software.amazon.awssdk.core.waiters.WaiterOverrideConfiguration;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.core.waiters.WaiterState;
import com.xiaobing.oss.model.HeadBucketRequest;
import com.xiaobing.oss.model.HeadBucketResponse;
import com.xiaobing.oss.model.HeadObjectRequest;
import com.xiaobing.oss.model.HeadObjectResponse;
import com.xiaobing.oss.model.S3Request;
import software.amazon.awssdk.utils.AttributeMap;
import software.amazon.awssdk.utils.SdkAutoCloseable;

@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
@ThreadSafe
final class DefaultS3Waiter implements S3Waiter {
    private static final WaiterAttribute<SdkAutoCloseable> CLIENT_ATTRIBUTE = new WaiterAttribute<>(SdkAutoCloseable.class);

    private final S3Client client;

    private final AttributeMap managedResources;

    private final Waiter<HeadBucketResponse> bucketExistsWaiter;

    private final Waiter<HeadBucketResponse> bucketNotExistsWaiter;

    private final Waiter<HeadObjectResponse> objectExistsWaiter;

    private final Waiter<HeadObjectResponse> objectNotExistsWaiter;

    private DefaultS3Waiter(DefaultBuilder builder) {
        AttributeMap.Builder attributeMapBuilder = AttributeMap.builder();
        if (builder.client == null) {
            this.client = S3Client.builder().build();
            attributeMapBuilder.put(CLIENT_ATTRIBUTE, this.client);
        } else {
            this.client = builder.client;
        }
        managedResources = attributeMapBuilder.build();
        this.bucketExistsWaiter = Waiter.builder(HeadBucketResponse.class).acceptors(bucketExistsWaiterAcceptors())
                .overrideConfiguration(bucketExistsWaiterConfig(builder.overrideConfiguration)).build();
        this.bucketNotExistsWaiter = Waiter.builder(HeadBucketResponse.class).acceptors(bucketNotExistsWaiterAcceptors())
                .overrideConfiguration(bucketNotExistsWaiterConfig(builder.overrideConfiguration)).build();
        this.objectExistsWaiter = Waiter.builder(HeadObjectResponse.class).acceptors(objectExistsWaiterAcceptors())
                .overrideConfiguration(objectExistsWaiterConfig(builder.overrideConfiguration)).build();
        this.objectNotExistsWaiter = Waiter.builder(HeadObjectResponse.class).acceptors(objectNotExistsWaiterAcceptors())
                .overrideConfiguration(objectNotExistsWaiterConfig(builder.overrideConfiguration)).build();
    }

    private static String errorCode(Throwable error) {
        if (error instanceof AwsServiceException) {
            return ((AwsServiceException) error).awsErrorDetails().errorCode();
        }
        return null;
    }

    @Override
    public WaiterResponse<HeadBucketResponse> waitUntilBucketExists(HeadBucketRequest headBucketRequest) {
        return bucketExistsWaiter.run(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)));
    }

    @Override
    public WaiterResponse<HeadBucketResponse> waitUntilBucketExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return bucketExistsWaiter.run(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)),
                bucketExistsWaiterConfig(overrideConfig));
    }

    @Override
    public WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest) {
        return bucketNotExistsWaiter.run(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)));
    }

    @Override
    public WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return bucketNotExistsWaiter.run(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)),
                bucketNotExistsWaiterConfig(overrideConfig));
    }

    @Override
    public WaiterResponse<HeadObjectResponse> waitUntilObjectExists(HeadObjectRequest headObjectRequest) {
        return objectExistsWaiter.run(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)));
    }

    @Override
    public WaiterResponse<HeadObjectResponse> waitUntilObjectExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return objectExistsWaiter.run(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)),
                objectExistsWaiterConfig(overrideConfig));
    }

    @Override
    public WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest) {
        return objectNotExistsWaiter.run(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)));
    }

    @Override
    public WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return objectNotExistsWaiter.run(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)),
                objectNotExistsWaiterConfig(overrideConfig));
    }

    private static List<WaiterAcceptor<? super HeadBucketResponse>> bucketExistsWaiterAcceptors() {
        List<WaiterAcceptor<? super HeadBucketResponse>> result = new ArrayList<>();
        result.add(new WaitersRuntime.ResponseStatusAcceptor(200, WaiterState.SUCCESS));
        result.add(new WaitersRuntime.ResponseStatusAcceptor(301, WaiterState.SUCCESS));
        result.add(new WaitersRuntime.ResponseStatusAcceptor(403, WaiterState.SUCCESS));
        result.add(new WaitersRuntime.ResponseStatusAcceptor(404, WaiterState.RETRY));
        result.addAll(WaitersRuntime.DEFAULT_ACCEPTORS);
        return result;
    }

    private static List<WaiterAcceptor<? super HeadBucketResponse>> bucketNotExistsWaiterAcceptors() {
        List<WaiterAcceptor<? super HeadBucketResponse>> result = new ArrayList<>();
        result.add(new WaitersRuntime.ResponseStatusAcceptor(404, WaiterState.SUCCESS));
        result.addAll(WaitersRuntime.DEFAULT_ACCEPTORS);
        return result;
    }

    private static List<WaiterAcceptor<? super HeadObjectResponse>> objectExistsWaiterAcceptors() {
        List<WaiterAcceptor<? super HeadObjectResponse>> result = new ArrayList<>();
        result.add(new WaitersRuntime.ResponseStatusAcceptor(200, WaiterState.SUCCESS));
        result.add(new WaitersRuntime.ResponseStatusAcceptor(404, WaiterState.RETRY));
        result.addAll(WaitersRuntime.DEFAULT_ACCEPTORS);
        return result;
    }

    private static List<WaiterAcceptor<? super HeadObjectResponse>> objectNotExistsWaiterAcceptors() {
        List<WaiterAcceptor<? super HeadObjectResponse>> result = new ArrayList<>();
        result.add(new WaitersRuntime.ResponseStatusAcceptor(404, WaiterState.SUCCESS));
        result.addAll(WaitersRuntime.DEFAULT_ACCEPTORS);
        return result;
    }

    private static WaiterOverrideConfiguration bucketExistsWaiterConfig(WaiterOverrideConfiguration overrideConfig) {
        Optional<WaiterOverrideConfiguration> optionalOverrideConfig = Optional.ofNullable(overrideConfig);
        int maxAttempts = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::maxAttempts).orElse(20);
        BackoffStrategy backoffStrategy = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::backoffStrategy).orElse(
                FixedDelayBackoffStrategy.create(Duration.ofSeconds(5)));
        Duration waitTimeout = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::waitTimeout).orElse(null);
        return WaiterOverrideConfiguration.builder().maxAttempts(maxAttempts).backoffStrategy(backoffStrategy)
                .waitTimeout(waitTimeout).build();
    }

    private static WaiterOverrideConfiguration bucketNotExistsWaiterConfig(WaiterOverrideConfiguration overrideConfig) {
        Optional<WaiterOverrideConfiguration> optionalOverrideConfig = Optional.ofNullable(overrideConfig);
        int maxAttempts = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::maxAttempts).orElse(20);
        BackoffStrategy backoffStrategy = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::backoffStrategy).orElse(
                FixedDelayBackoffStrategy.create(Duration.ofSeconds(5)));
        Duration waitTimeout = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::waitTimeout).orElse(null);
        return WaiterOverrideConfiguration.builder().maxAttempts(maxAttempts).backoffStrategy(backoffStrategy)
                .waitTimeout(waitTimeout).build();
    }

    private static WaiterOverrideConfiguration objectExistsWaiterConfig(WaiterOverrideConfiguration overrideConfig) {
        Optional<WaiterOverrideConfiguration> optionalOverrideConfig = Optional.ofNullable(overrideConfig);
        int maxAttempts = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::maxAttempts).orElse(20);
        BackoffStrategy backoffStrategy = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::backoffStrategy).orElse(
                FixedDelayBackoffStrategy.create(Duration.ofSeconds(5)));
        Duration waitTimeout = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::waitTimeout).orElse(null);
        return WaiterOverrideConfiguration.builder().maxAttempts(maxAttempts).backoffStrategy(backoffStrategy)
                .waitTimeout(waitTimeout).build();
    }

    private static WaiterOverrideConfiguration objectNotExistsWaiterConfig(WaiterOverrideConfiguration overrideConfig) {
        Optional<WaiterOverrideConfiguration> optionalOverrideConfig = Optional.ofNullable(overrideConfig);
        int maxAttempts = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::maxAttempts).orElse(20);
        BackoffStrategy backoffStrategy = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::backoffStrategy).orElse(
                FixedDelayBackoffStrategy.create(Duration.ofSeconds(5)));
        Duration waitTimeout = optionalOverrideConfig.flatMap(WaiterOverrideConfiguration::waitTimeout).orElse(null);
        return WaiterOverrideConfiguration.builder().maxAttempts(maxAttempts).backoffStrategy(backoffStrategy)
                .waitTimeout(waitTimeout).build();
    }

    @Override
    public void close() {
        managedResources.close();
    }

    public static Builder builder() {
        return new DefaultBuilder();
    }

    private <T extends S3Request> T applyWaitersUserAgent(T request) {
        Consumer<AwsRequestOverrideConfiguration.Builder> userAgentApplier = b -> b.addApiName(ApiName.builder()
                .version("waiter").name("hll").build());
        AwsRequestOverrideConfiguration overrideConfiguration = request.overrideConfiguration()
                .map(c -> c.toBuilder().applyMutation(userAgentApplier).build())
                .orElse((AwsRequestOverrideConfiguration.builder().applyMutation(userAgentApplier).build()));
        return (T) request.toBuilder().overrideConfiguration(overrideConfiguration).build();
    }

    public static final class DefaultBuilder implements Builder {
        private S3Client client;

        private WaiterOverrideConfiguration overrideConfiguration;

        private DefaultBuilder() {
        }

        @Override
        public Builder overrideConfiguration(WaiterOverrideConfiguration overrideConfiguration) {
            this.overrideConfiguration = overrideConfiguration;
            return this;
        }

        @Override
        public Builder client(S3Client client) {
            this.client = client;
            return this;
        }

        public S3Waiter build() {
            return new DefaultS3Waiter(this);
        }
    }
}
