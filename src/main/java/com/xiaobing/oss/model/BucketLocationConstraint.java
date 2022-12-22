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

@Generated("software.amazon.awssdk:codegen")
public enum BucketLocationConstraint {
    AF_SOUTH_1("af-south-1"),

    AP_EAST_1("ap-east-1"),

    AP_NORTHEAST_1("ap-northeast-1"),

    AP_NORTHEAST_2("ap-northeast-2"),

    AP_NORTHEAST_3("ap-northeast-3"),

    AP_SOUTH_1("ap-south-1"),

    AP_SOUTHEAST_1("ap-southeast-1"),

    AP_SOUTHEAST_2("ap-southeast-2"),

    CA_CENTRAL_1("ca-central-1"),

    CN_NORTH_1("cn-north-1"),

    CN_NORTHWEST_1("cn-northwest-1"),

    EU("EU"),

    EU_CENTRAL_1("eu-central-1"),

    EU_NORTH_1("eu-north-1"),

    EU_SOUTH_1("eu-south-1"),

    EU_WEST_1("eu-west-1"),

    EU_WEST_2("eu-west-2"),

    EU_WEST_3("eu-west-3"),

    ME_SOUTH_1("me-south-1"),

    SA_EAST_1("sa-east-1"),

    US_EAST_2("us-east-2"),

    US_GOV_EAST_1("us-gov-east-1"),

    US_GOV_WEST_1("us-gov-west-1"),

    US_WEST_1("us-west-1"),

    US_WEST_2("us-west-2"),

    UNKNOWN_TO_SDK_VERSION(null);

    private static final Map<String, BucketLocationConstraint> VALUE_MAP = EnumUtils.uniqueIndex(BucketLocationConstraint.class,
            BucketLocationConstraint::toString);

    private final String value;

    private BucketLocationConstraint(String value) {
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
     * @return BucketLocationConstraint corresponding to the value
     */
    public static BucketLocationConstraint fromValue(String value) {
        if (value == null) {
            return null;
        }
        return VALUE_MAP.getOrDefault(value, UNKNOWN_TO_SDK_VERSION);
    }

    /**
     * Use this in place of {@link #values()} to return a {@link Set} of all values known to the SDK. This will return
     * all known enum values except {@link #UNKNOWN_TO_SDK_VERSION}.
     *
     * @return a {@link Set} of known {@link BucketLocationConstraint}s
     */
    public static Set<BucketLocationConstraint> knownValues() {
        Set<BucketLocationConstraint> knownValues = EnumSet.allOf(BucketLocationConstraint.class);
        knownValues.remove(UNKNOWN_TO_SDK_VERSION);
        return knownValues;
    }
}
