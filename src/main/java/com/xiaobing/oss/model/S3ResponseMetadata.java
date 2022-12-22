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

import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.awscore.AwsResponseMetadata;

@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public final class S3ResponseMetadata extends AwsResponseMetadata {
    private static final String EXTENDED_REQUEST_ID = "x-amz-id-2";

    private static final String REQUEST_ID = "x-amz-request-id";

    private static final String CLOUD_FRONT_ID = "X-Amz-Cf-Id";

    private S3ResponseMetadata(AwsResponseMetadata responseMetadata) {
        super(responseMetadata);
    }

    public static S3ResponseMetadata create(AwsResponseMetadata responseMetadata) {
        return new S3ResponseMetadata(responseMetadata);
    }

    public String extendedRequestId() {
        return getValue(EXTENDED_REQUEST_ID);
    }

    @Override
    public String requestId() {
        return getValue(REQUEST_ID);
    }

    public String cloudFrontId() {
        return getValue(CLOUD_FRONT_ID);
    }
}
