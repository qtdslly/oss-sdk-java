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
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.exception.AwsErrorDetails;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * The bucket you tried to create already exists, and you own it. Amazon S3 returns this error in all Amazon Web
 * Services Regions except in the North Virginia Region. For legacy compatibility, if you re-create an existing bucket
 * that you already own in the North Virginia Region, Amazon S3 returns 200 OK and resets the bucket access control
 * lists (ACLs).
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class BucketAlreadyOwnedByYouException extends S3Exception implements
        ToCopyableBuilder<BucketAlreadyOwnedByYouException.Builder, BucketAlreadyOwnedByYouException> {
    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList());

    private static final long serialVersionUID = 1L;

    private BucketAlreadyOwnedByYouException(BuilderImpl builder) {
        super(builder);
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
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, BucketAlreadyOwnedByYouException>, S3Exception.Builder {
        @Override
        Builder awsErrorDetails(AwsErrorDetails awsErrorDetails);

        @Override
        Builder message(String message);

        @Override
        Builder requestId(String requestId);

        @Override
        Builder statusCode(int statusCode);

        @Override
        Builder cause(Throwable cause);
    }

    static final class BuilderImpl extends S3Exception.BuilderImpl implements Builder {
        private BuilderImpl() {
        }

        private BuilderImpl(BucketAlreadyOwnedByYouException model) {
            super(model);
        }

        @Override
        public BuilderImpl awsErrorDetails(AwsErrorDetails awsErrorDetails) {
            this.awsErrorDetails = awsErrorDetails;
            return this;
        }

        @Override
        public BuilderImpl message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public BuilderImpl requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        @Override
        public BuilderImpl statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        @Override
        public BuilderImpl cause(Throwable cause) {
            this.cause = cause;
            return this;
        }

        @Override
        public BucketAlreadyOwnedByYouException build() {
            return new BucketAlreadyOwnedByYouException(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
