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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructList;

@Generated("software.amazon.awssdk:codegen")
final class TargetGrantsCopier {
    static List<TargetGrant> copy(Collection<? extends TargetGrant> targetGrantsParam) {
        List<TargetGrant> list;
        if (targetGrantsParam == null || targetGrantsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<TargetGrant> modifiableList = new ArrayList<>();
            targetGrantsParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<TargetGrant> copyFromBuilder(Collection<? extends TargetGrant.Builder> targetGrantsParam) {
        List<TargetGrant> list;
        if (targetGrantsParam == null || targetGrantsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<TargetGrant> modifiableList = new ArrayList<>();
            targetGrantsParam.forEach(entry -> {
                TargetGrant member = entry == null ? null : entry.build();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<TargetGrant.Builder> copyToBuilder(Collection<? extends TargetGrant> targetGrantsParam) {
        List<TargetGrant.Builder> list;
        if (targetGrantsParam == null || targetGrantsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<TargetGrant.Builder> modifiableList = new ArrayList<>();
            targetGrantsParam.forEach(entry -> {
                TargetGrant.Builder member = entry == null ? null : entry.toBuilder();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
