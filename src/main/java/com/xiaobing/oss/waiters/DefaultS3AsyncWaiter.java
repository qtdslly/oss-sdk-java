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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

import com.xiaobing.oss.S3AsyncClient;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.ApiName;
import software.amazon.awssdk.core.internal.waiters.WaiterAttribute;
import software.amazon.awssdk.core.retry.backoff.BackoffStrategy;
import software.amazon.awssdk.core.retry.backoff.FixedDelayBackoffStrategy;
import software.amazon.awssdk.core.waiters.AsyncWaiter;
import software.amazon.awssdk.core.waiters.WaiterAcceptor;
import software.amazon.awssdk.core.waiters.WaiterOverrideConfiguration;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import software.amazon.awssdk.core.waiters.WaiterState;
import com.xiaobing.oss.model.HeadBucketRequest;
import com.xiaobing.oss.model.HeadBucketResponse;
import com.xiaobing.oss.model.HeadObjectRequest;
import com.xiaobing.oss.model.HeadObjectResponse;
import com.xiaobing.oss.model.S3Request;
import com.xiaobing.oss.waiters.internal.WaitersRuntime;
import software.amazon.awssdk.utils.AttributeMap;
import software.amazon.awssdk.utils.SdkAutoCloseable;
import software.amazon.awssdk.utils.ThreadFactoryBuilder;

@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
@ThreadSafe
final class DefaultS3AsyncWaiter implements S3AsyncWaiter {
    private static final WaiterAttribute<SdkAutoCloseable> CLIENT_ATTRIBUTE = new WaiterAttribute<>(SdkAutoCloseable.class);

    private static final WaiterAttribute<ScheduledExecutorService> SCHEDULED_EXECUTOR_SERVICE_ATTRIBUTE = new WaiterAttribute<>(
            ScheduledExecutorService.class);

    private final S3AsyncClient client;

    private final AttributeMap managedResources;

    private final AsyncWaiter<HeadBucketResponse> bucketExistsWaiter;

    private final AsyncWaiter<HeadBucketResponse> bucketNotExistsWaiter;

    private final AsyncWaiter<HeadObjectResponse> objectExistsWaiter;

    private final AsyncWaiter<HeadObjectResponse> objectNotExistsWaiter;

    private final ScheduledExecutorService executorService;

    private DefaultS3AsyncWaiter(DefaultBuilder builder) {
        AttributeMap.Builder attributeMapBuilder = AttributeMap.builder();
        if (builder.client == null) {
            this.client = S3AsyncClient.builder().build();
            attributeMapBuilder.put(CLIENT_ATTRIBUTE, this.client);
        } else {
            this.client = builder.client;
        }
        if (builder.executorService == null) {
            this.executorService = Executors.newScheduledThreadPool(1,
                    new ThreadFactoryBuilder().threadNamePrefix("waiters-ScheduledExecutor").build());
            attributeMapBuilder.put(SCHEDULED_EXECUTOR_SERVICE_ATTRIBUTE, this.executorService);
        } else {
            this.executorService = builder.executorService;
        }
        managedResources = attributeMapBuilder.build();
        this.bucketExistsWaiter = AsyncWaiter.builder(HeadBucketResponse.class).acceptors(bucketExistsWaiterAcceptors())
                .overrideConfiguration(bucketExistsWaiterConfig(builder.overrideConfiguration))
                .scheduledExecutorService(executorService).build();
        this.bucketNotExistsWaiter = AsyncWaiter.builder(HeadBucketResponse.class).acceptors(bucketNotExistsWaiterAcceptors())
                .overrideConfiguration(bucketNotExistsWaiterConfig(builder.overrideConfiguration))
                .scheduledExecutorService(executorService).build();
        this.objectExistsWaiter = AsyncWaiter.builder(HeadObjectResponse.class).acceptors(objectExistsWaiterAcceptors())
                .overrideConfiguration(objectExistsWaiterConfig(builder.overrideConfiguration))
                .scheduledExecutorService(executorService).build();
        this.objectNotExistsWaiter = AsyncWaiter.builder(HeadObjectResponse.class).acceptors(objectNotExistsWaiterAcceptors())
                .overrideConfiguration(objectNotExistsWaiterConfig(builder.overrideConfiguration))
                .scheduledExecutorService(executorService).build();
    }

    private static String errorCode(Throwable error) {
        if (error instanceof AwsServiceException) {
            return ((AwsServiceException) error).awsErrorDetails().errorCode();
        }
        return null;
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadBucketResponse>> waitUntilBucketExists(HeadBucketRequest headBucketRequest) {
        return bucketExistsWaiter.runAsync(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadBucketResponse>> waitUntilBucketExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return bucketExistsWaiter.runAsync(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)),
                bucketExistsWaiterConfig(overrideConfig));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadBucketResponse>> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest) {
        return bucketNotExistsWaiter.runAsync(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadBucketResponse>> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return bucketNotExistsWaiter.runAsync(() -> client.headBucket(applyWaitersUserAgent(headBucketRequest)),
                bucketNotExistsWaiterConfig(overrideConfig));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadObjectResponse>> waitUntilObjectExists(HeadObjectRequest headObjectRequest) {
        return objectExistsWaiter.runAsync(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadObjectResponse>> waitUntilObjectExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return objectExistsWaiter.runAsync(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)),
                objectExistsWaiterConfig(overrideConfig));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadObjectResponse>> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest) {
        return objectNotExistsWaiter.runAsync(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)));
    }

    @Override
    public CompletableFuture<WaiterResponse<HeadObjectResponse>> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        return objectNotExistsWaiter.runAsync(() -> client.headObject(applyWaitersUserAgent(headObjectRequest)),
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
        private S3AsyncClient client;

        private WaiterOverrideConfiguration overrideConfiguration;

        private ScheduledExecutorService executorService;

        private DefaultBuilder() {
        }

        @Override
        public Builder scheduledExecutorService(ScheduledExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        @Override
        public Builder overrideConfiguration(WaiterOverrideConfiguration overrideConfiguration) {
            this.overrideConfiguration = overrideConfiguration;
            return this;
        }

        @Override
        public Builder client(S3AsyncClient client) {
            this.client = client;
            return this;
        }

        public S3AsyncWaiter build() {
            return new DefaultS3AsyncWaiter(this);
        }
    }
}
