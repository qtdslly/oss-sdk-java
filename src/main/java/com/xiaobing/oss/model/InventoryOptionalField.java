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
public enum InventoryOptionalField {
    SIZE("Size"),

    LAST_MODIFIED_DATE("LastModifiedDate"),

    STORAGE_CLASS("StorageClass"),

    E_TAG("ETag"),

    IS_MULTIPART_UPLOADED("IsMultipartUploaded"),

    REPLICATION_STATUS("ReplicationStatus"),

    ENCRYPTION_STATUS("EncryptionStatus"),

    OBJECT_LOCK_RETAIN_UNTIL_DATE("ObjectLockRetainUntilDate"),

    OBJECT_LOCK_MODE("ObjectLockMode"),

    OBJECT_LOCK_LEGAL_HOLD_STATUS("ObjectLockLegalHoldStatus"),

    INTELLIGENT_TIERING_ACCESS_TIER("IntelligentTieringAccessTier"),

    BUCKET_KEY_STATUS("BucketKeyStatus"),

    CHECKSUM_ALGORITHM("ChecksumAlgorithm"),

    UNKNOWN_TO_SDK_VERSION(null);

    private static final Map<String, InventoryOptionalField> VALUE_MAP = EnumUtils.uniqueIndex(InventoryOptionalField.class,
            InventoryOptionalField::toString);

    private final String value;

    private InventoryOptionalField(String value) {
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
     * @return InventoryOptionalField corresponding to the value
     */
    public static InventoryOptionalField fromValue(String value) {
        if (value == null) {
            return null;
        }
        return VALUE_MAP.getOrDefault(value, UNKNOWN_TO_SDK_VERSION);
    }

    /**
     * Use this in place of {@link #values()} to return a {@link Set} of all values known to the SDK. This will return
     * all known enum values except {@link #UNKNOWN_TO_SDK_VERSION}.
     *
     * @return a {@link Set} of known {@link InventoryOptionalField}s
     */
    public static Set<InventoryOptionalField> knownValues() {
        Set<InventoryOptionalField> knownValues = EnumSet.allOf(InventoryOptionalField.class);
        knownValues.remove(UNKNOWN_TO_SDK_VERSION);
        return knownValues;
    }
}
