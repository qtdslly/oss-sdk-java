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
final class TagSetCopier {
    static List<Tag> copy(Collection<? extends Tag> tagSetParam) {
        List<Tag> list;
        if (tagSetParam == null || tagSetParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<Tag> modifiableList = new ArrayList<>();
            tagSetParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<Tag> copyFromBuilder(Collection<? extends Tag.Builder> tagSetParam) {
        List<Tag> list;
        if (tagSetParam == null || tagSetParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<Tag> modifiableList = new ArrayList<>();
            tagSetParam.forEach(entry -> {
                Tag member = entry == null ? null : entry.build();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<Tag.Builder> copyToBuilder(Collection<? extends Tag> tagSetParam) {
        List<Tag.Builder> list;
        if (tagSetParam == null || tagSetParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<Tag.Builder> modifiableList = new ArrayList<>();
            tagSetParam.forEach(entry -> {
                Tag.Builder member = entry == null ? null : entry.toBuilder();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
