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
final class MultipartUploadListCopier {
    static List<MultipartUpload> copy(Collection<? extends MultipartUpload> multipartUploadListParam) {
        List<MultipartUpload> list;
        if (multipartUploadListParam == null || multipartUploadListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<MultipartUpload> modifiableList = new ArrayList<>();
            multipartUploadListParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<MultipartUpload> copyFromBuilder(Collection<? extends MultipartUpload.Builder> multipartUploadListParam) {
        List<MultipartUpload> list;
        if (multipartUploadListParam == null || multipartUploadListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<MultipartUpload> modifiableList = new ArrayList<>();
            multipartUploadListParam.forEach(entry -> {
                MultipartUpload member = entry == null ? null : entry.build();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<MultipartUpload.Builder> copyToBuilder(Collection<? extends MultipartUpload> multipartUploadListParam) {
        List<MultipartUpload.Builder> list;
        if (multipartUploadListParam == null || multipartUploadListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<MultipartUpload.Builder> modifiableList = new ArrayList<>();
            multipartUploadListParam.forEach(entry -> {
                MultipartUpload.Builder member = entry == null ? null : entry.toBuilder();
                modifiableList.add(member);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
