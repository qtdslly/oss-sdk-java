/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.xiaobing.oss.internal.settingproviders;

import java.util.Optional;
import software.amazon.awssdk.annotations.SdkInternalApi;

/**
 * Interface for loading useArnRegion configuration.
 */
@FunctionalInterface
@SdkInternalApi
public interface UseArnRegionProvider {

    /**
     * @return whether use-arn-region is enabled, or empty if it is not configured.
     */
    Optional<Boolean> resolveUseArnRegion();
}
