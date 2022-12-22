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

import java.util.function.Consumer;

import com.xiaobing.oss.S3Client;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.core.waiters.WaiterOverrideConfiguration;
import software.amazon.awssdk.core.waiters.WaiterResponse;
import com.xiaobing.oss.model.HeadBucketRequest;
import com.xiaobing.oss.model.HeadBucketResponse;
import com.xiaobing.oss.model.HeadObjectRequest;
import com.xiaobing.oss.model.HeadObjectResponse;
import software.amazon.awssdk.utils.SdkAutoCloseable;

/**
 * Waiter utility class that polls a resource until a desired state is reached or until it is determined that the
 * resource will never enter into the desired state. This can be created using the static {@link #builder()} method
 */
@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public interface S3Waiter extends SdkAutoCloseable {
    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headBucketRequest
     *        the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketExists(HeadBucketRequest headBucketRequest) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder without the need to create one manually
     * using {@link HeadBucketRequest#builder()}
     *
     * @param headBucketRequest
     *        The consumer that will configure the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketExists(Consumer<HeadBucketRequest.Builder> headBucketRequest) {
        return waitUntilBucketExists(HeadBucketRequest.builder().applyMutation(headBucketRequest).build());
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headBucketRequest
     *        The request to be used for polling
     * @param overrideConfig
     *        Per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder and instance of the override config
     * builder
     *
     * @param headBucketRequest
     *        The consumer that will configure the request to be used for polling
     * @param overrideConfig
     *        The consumer that will configure the per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketExists(Consumer<HeadBucketRequest.Builder> headBucketRequest,
            Consumer<WaiterOverrideConfiguration.Builder> overrideConfig) {
        return waitUntilBucketExists(HeadBucketRequest.builder().applyMutation(headBucketRequest).build(),
                WaiterOverrideConfiguration.builder().applyMutation(overrideConfig).build());
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headBucketRequest
     *        the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder without the need to create one manually
     * using {@link HeadBucketRequest#builder()}
     *
     * @param headBucketRequest
     *        The consumer that will configure the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(Consumer<HeadBucketRequest.Builder> headBucketRequest) {
        return waitUntilBucketNotExists(HeadBucketRequest.builder().applyMutation(headBucketRequest).build());
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headBucketRequest
     *        The request to be used for polling
     * @param overrideConfig
     *        Per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(HeadBucketRequest headBucketRequest,
            WaiterOverrideConfiguration overrideConfig) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headBucket} API until the desired condition {@code BucketNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder and instance of the override config
     * builder
     *
     * @param headBucketRequest
     *        The consumer that will configure the request to be used for polling
     * @param overrideConfig
     *        The consumer that will configure the per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadBucketResponse> waitUntilBucketNotExists(Consumer<HeadBucketRequest.Builder> headBucketRequest,
            Consumer<WaiterOverrideConfiguration.Builder> overrideConfig) {
        return waitUntilBucketNotExists(HeadBucketRequest.builder().applyMutation(headBucketRequest).build(),
                WaiterOverrideConfiguration.builder().applyMutation(overrideConfig).build());
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headObjectRequest
     *        the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectExists(HeadObjectRequest headObjectRequest) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder without the need to create one manually
     * using {@link HeadObjectRequest#builder()}
     *
     * @param headObjectRequest
     *        The consumer that will configure the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectExists(Consumer<HeadObjectRequest.Builder> headObjectRequest) {
        return waitUntilObjectExists(HeadObjectRequest.builder().applyMutation(headObjectRequest).build());
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headObjectRequest
     *        The request to be used for polling
     * @param overrideConfig
     *        Per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder and instance of the override config
     * builder
     *
     * @param headObjectRequest
     *        The consumer that will configure the request to be used for polling
     * @param overrideConfig
     *        The consumer that will configure the per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectExists(Consumer<HeadObjectRequest.Builder> headObjectRequest,
            Consumer<WaiterOverrideConfiguration.Builder> overrideConfig) {
        return waitUntilObjectExists(HeadObjectRequest.builder().applyMutation(headObjectRequest).build(),
                WaiterOverrideConfiguration.builder().applyMutation(overrideConfig).build());
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headObjectRequest
     *        the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder without the need to create one manually
     * using {@link HeadObjectRequest#builder()}
     *
     * @param headObjectRequest
     *        The consumer that will configure the request to be used for polling
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(Consumer<HeadObjectRequest.Builder> headObjectRequest) {
        return waitUntilObjectNotExists(HeadObjectRequest.builder().applyMutation(headObjectRequest).build());
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state
     *
     * @param headObjectRequest
     *        The request to be used for polling
     * @param overrideConfig
     *        Per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(HeadObjectRequest headObjectRequest,
            WaiterOverrideConfiguration overrideConfig) {
        throw new UnsupportedOperationException();
    }

    /**
     * Polls {@link S3Client#headObject} API until the desired condition {@code ObjectNotExists} is met, or until it is
     * determined that the resource will never enter into the desired state.
     * <p>
     * This is a convenience method to create an instance of the request builder and instance of the override config
     * builder
     *
     * @param headObjectRequest
     *        The consumer that will configure the request to be used for polling
     * @param overrideConfig
     *        The consumer that will configure the per request override configuration for waiters
     * @return WaiterResponse containing either a response or an exception that has matched with the waiter success
     *         condition
     */
    default WaiterResponse<HeadObjectResponse> waitUntilObjectNotExists(Consumer<HeadObjectRequest.Builder> headObjectRequest,
            Consumer<WaiterOverrideConfiguration.Builder> overrideConfig) {
        return waitUntilObjectNotExists(HeadObjectRequest.builder().applyMutation(headObjectRequest).build(),
                WaiterOverrideConfiguration.builder().applyMutation(overrideConfig).build());
    }

    /**
     * Create a builder that can be used to configure and create a {@link S3Waiter}.
     *
     * @return a builder
     */
    static Builder builder() {
        return DefaultS3Waiter.builder();
    }

    /**
     * Create an instance of {@link S3Waiter} with the default configuration.
     * <p>
     * <b>A default {@link S3Client} will be created to poll resources. It is recommended to share a single instance of
     * the waiter created via this method. If it is not desirable to share a waiter instance, invoke {@link #close()} to
     * release the resources once the waiter is not needed.</b>
     *
     * @return an instance of {@link S3Waiter}
     */
    static S3Waiter create() {
        return DefaultS3Waiter.builder().build();
    }

    interface Builder {
        /**
         * Defines overrides to the default SDK waiter configuration that should be used for waiters created from this
         * builder
         *
         * @param overrideConfiguration
         *        the override configuration to set
         * @return a reference to this object so that method calls can be chained together.
         */
        Builder overrideConfiguration(WaiterOverrideConfiguration overrideConfiguration);

        /**
         * This is a convenient method to pass the override configuration without the need to create an instance
         * manually via {@link WaiterOverrideConfiguration#builder()}
         *
         * @param overrideConfiguration
         *        The consumer that will configure the overrideConfiguration
         * @return a reference to this object so that method calls can be chained together.
         * @see #overrideConfiguration(WaiterOverrideConfiguration)
         */
        default Builder overrideConfiguration(Consumer<WaiterOverrideConfiguration.Builder> overrideConfiguration) {
            WaiterOverrideConfiguration.Builder builder = WaiterOverrideConfiguration.builder();
            overrideConfiguration.accept(builder);
            return overrideConfiguration(builder.build());
        }

        /**
         * Sets a custom {@link S3Client} that will be used to poll the resource
         * <p>
         * This SDK client must be closed by the caller when it is ready to be disposed. The SDK will not close the
         * client when the waiter is closed
         *
         * @param client
         *        the client to send the request
         * @return a reference to this object so that method calls can be chained together.
         */
        Builder client(S3Client client);

        /**
         * Builds an instance of {@link S3Waiter} based on the configurations supplied to this builder
         *
         * @return An initialized {@link S3Waiter}
         */
        S3Waiter build();
    }
}
