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
final class FilterRuleListCopier {
    static List<FilterRule> copy(Collection<? extends FilterRule> filterRuleListParam) {
        List<FilterRule> list;
        if (filterRuleListParam == null || filterRuleListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<FilterRule> modifiableList = new ArrayList<>();
            filterRuleListParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<FilterRule> copyFromBuilder(Collection<? extends FilterRule.Builder> filterRuleListParam) {
        List<FilterRule> list;
        if (filterRuleListParam == null || filterRuleListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<FilterRule> modifiableList = new ArrayList<>();
            filterRuleListParam.forEach(entry -> {
                FilterRule member = entry == null ? null : entry.build();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<FilterRule.Builder> copyToBuilder(Collection<? extends FilterRule> filterRuleListParam) {
        List<FilterRule.Builder> list;
        if (filterRuleListParam == null || filterRuleListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<FilterRule.Builder> modifiableList = new ArrayList<>();
            filterRuleListParam.forEach(entry -> {
                FilterRule.Builder member = entry == null ? null : entry.toBuilder();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
