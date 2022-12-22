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
final class InventoryOptionalFieldsCopier {
    static List<String> copy(Collection<String> inventoryOptionalFieldsParam) {
        List<String> list;
        if (inventoryOptionalFieldsParam == null || inventoryOptionalFieldsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<String> modifiableList = new ArrayList<>();
            inventoryOptionalFieldsParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<String> copyEnumToString(Collection<InventoryOptionalField> inventoryOptionalFieldsParam) {
        List<String> list;
        if (inventoryOptionalFieldsParam == null || inventoryOptionalFieldsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<String> modifiableList = new ArrayList<>();
            inventoryOptionalFieldsParam.forEach(entry -> {
                String result = entry.toString();
                modifiableList.add(result);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<InventoryOptionalField> copyStringToEnum(Collection<String> inventoryOptionalFieldsParam) {
        List<InventoryOptionalField> list;
        if (inventoryOptionalFieldsParam == null || inventoryOptionalFieldsParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<InventoryOptionalField> modifiableList = new ArrayList<>();
            inventoryOptionalFieldsParam.forEach(entry -> {
                InventoryOptionalField result = InventoryOptionalField.fromValue(entry);
                modifiableList.add(result);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
