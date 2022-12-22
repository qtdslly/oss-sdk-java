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

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.utils.internal.EnumUtils;

/**
 * <p>
 * Requests Amazon S3 to encode the object keys in the response and specifies the encoding method to use. An object key
 * may contain any Unicode character; however, XML 1.0 parser cannot parse some characters, such as characters with an
 * ASCII value from 0 to 10. For characters that are not supported in XML 1.0, you can add this parameter to request
 * that Amazon S3 encode the keys in the response.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public enum EncodingType {
    URL("url"),

    UNKNOWN_TO_SDK_VERSION(null);

    private static final Map<String, EncodingType> VALUE_MAP = EnumUtils.uniqueIndex(EncodingType.class, EncodingType::toString);

    private final String value;

    private EncodingType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Use this in place of valueOf to convert the raw string returned by the service into the enum value.
     *
     * @param value
     *        real value
     * @return EncodingType corresponding to the value
     */
    public static EncodingType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return VALUE_MAP.getOrDefault(value, UNKNOWN_TO_SDK_VERSION);
    }

    /**
     * Use this in place of {@link #values()} to return a {@link Set} of all values known to the SDK. This will return
     * all known enum values except {@link #UNKNOWN_TO_SDK_VERSION}.
     *
     * @return a {@link Set} of known {@link EncodingType}s
     */
    public static Set<EncodingType> knownValues() {
        Set<EncodingType> knownValues = EnumSet.allOf(EncodingType.class);
        knownValues.remove(UNKNOWN_TO_SDK_VERSION);
        return knownValues;
    }
}
