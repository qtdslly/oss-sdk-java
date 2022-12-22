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

package com.xiaobing.oss;

import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.client.builder.AwsSyncClientBuilder;

/**
 * A builder for creating an instance of {@link S3Client}. This can be created with the static
 * {@link S3Client#builder()} method.
 */
@Generated("software.amazon.awssdk:codegen")
public interface S3ClientBuilder extends AwsSyncClientBuilder<S3ClientBuilder, S3Client>,
        S3BaseClientBuilder<S3ClientBuilder, S3Client> {
}
