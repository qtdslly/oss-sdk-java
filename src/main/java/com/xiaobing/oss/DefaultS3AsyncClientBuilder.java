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
import software.amazon.awssdk.annotations.SdkInternalApi;

/**
 * Internal implementation of {@link S3AsyncClientBuilder}.
 */
@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
final class DefaultS3AsyncClientBuilder extends DefaultS3BaseClientBuilder<S3AsyncClientBuilder, S3AsyncClient> implements
        S3AsyncClientBuilder {
    @Override
    protected final S3AsyncClient buildClient() {
        return new DefaultS3AsyncClient(super.asyncClientConfiguration());
    }
}
