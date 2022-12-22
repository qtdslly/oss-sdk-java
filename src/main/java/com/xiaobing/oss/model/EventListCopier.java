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
final class EventListCopier {
    static List<String> copy(Collection<String> eventListParam) {
        List<String> list;
        if (eventListParam == null || eventListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<String> modifiableList = new ArrayList<>();
            eventListParam.forEach(entry -> {
                modifiableList.add(entry);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<String> copyEnumToString(Collection<Event> eventListParam) {
        List<String> list;
        if (eventListParam == null || eventListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<String> modifiableList = new ArrayList<>();
            eventListParam.forEach(entry -> {
                String result = entry.toString();
                modifiableList.add(result);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }

    static List<Event> copyStringToEnum(Collection<String> eventListParam) {
        List<Event> list;
        if (eventListParam == null || eventListParam instanceof SdkAutoConstructList) {
            list = DefaultSdkAutoConstructList.getInstance();
        } else {
            List<Event> modifiableList = new ArrayList<>();
            eventListParam.forEach(entry -> {
                Event result = Event.fromValue(entry);
                modifiableList.add(result);
            });
            list = Collections.unmodifiableList(modifiableList);
        }
        return list;
    }
}
