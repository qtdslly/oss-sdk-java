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

import java.util.List;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.auth.signer.AwsS3V4Signer;
import software.amazon.awssdk.awscore.client.builder.AwsDefaultClientBuilder;
import software.amazon.awssdk.awscore.client.config.AwsClientOption;
import software.amazon.awssdk.core.client.config.SdkAdvancedClientOption;
import software.amazon.awssdk.core.client.config.SdkClientConfiguration;
import software.amazon.awssdk.core.client.config.SdkClientOption;
import software.amazon.awssdk.core.interceptor.ClasspathInterceptorChainFactory;
import software.amazon.awssdk.core.interceptor.ExecutionInterceptor;
import software.amazon.awssdk.core.signer.Signer;
import software.amazon.awssdk.utils.CollectionUtils;
import software.amazon.awssdk.utils.Validate;

/**
 * Internal base class for {@link DefaultS3ClientBuilder} and {@link DefaultS3AsyncClientBuilder}.
 */
@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
abstract class DefaultS3BaseClientBuilder<B extends S3BaseClientBuilder<B, C>, C> extends AwsDefaultClientBuilder<B, C> {
    @Override
    protected final String serviceEndpointPrefix() {
        return "s3";
    }

    @Override
    protected final String serviceName() {
        return "S3";
    }

    @Override
    protected final SdkClientConfiguration mergeServiceDefaults(SdkClientConfiguration config) {
        return config.merge(c -> c.option(SdkAdvancedClientOption.SIGNER, defaultSigner())
                .option(SdkClientOption.CRC32_FROM_COMPRESSED_DATA_ENABLED, false)
                .option(SdkClientOption.SERVICE_CONFIGURATION, S3Configuration.builder().build()));
    }

    @Override
    protected final SdkClientConfiguration finalizeServiceConfiguration(SdkClientConfiguration config) {
        ClasspathInterceptorChainFactory interceptorFactory = new ClasspathInterceptorChainFactory();
        List<ExecutionInterceptor> interceptors = interceptorFactory
                .getInterceptors("com/xiaobing/oss/execution.interceptors");
        interceptors = CollectionUtils.mergeLists(interceptors, config.option(SdkClientOption.EXECUTION_INTERCEPTORS));
        S3Configuration.Builder c = ((S3Configuration) config.option(SdkClientOption.SERVICE_CONFIGURATION)).toBuilder();
        c.profileFile(c.profileFile() != null ? c.profileFile() : config.option(SdkClientOption.PROFILE_FILE));
        c.profileName(c.profileName() != null ? c.profileName() : config.option(SdkClientOption.PROFILE_NAME));
        if (c.dualstackEnabled() != null) {
            Validate.validState(
                    config.option(AwsClientOption.DUALSTACK_ENDPOINT_ENABLED) == null,
                    "Dualstack has been configured on both S3Configuration and the client/global level. Please limit dualstack configuration to one location.");
        } else {
            c.dualstackEnabled(config.option(AwsClientOption.DUALSTACK_ENDPOINT_ENABLED));
        }
        return config.toBuilder().option(AwsClientOption.DUALSTACK_ENDPOINT_ENABLED, c.dualstackEnabled())
                .option(SdkClientOption.EXECUTION_INTERCEPTORS, interceptors)
                .option(SdkClientOption.SERVICE_CONFIGURATION, c.build()).build();
    }

    private Signer defaultSigner() {
        return AwsS3V4Signer.create();
    }

    @Override
    protected final String signingName() {
        return "s3";
    }

    public B serviceConfiguration(S3Configuration serviceConfiguration) {
        clientConfiguration.option(SdkClientOption.SERVICE_CONFIGURATION, serviceConfiguration);
        return thisBuilder();
    }

    public void setServiceConfiguration(S3Configuration serviceConfiguration) {
        serviceConfiguration(serviceConfiguration);
    }
}
