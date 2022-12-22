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

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Specifies whether Amazon S3 replicates delete markers. If you specify a <code>Filter</code> in your replication
 * configuration, you must also include a <code>DeleteMarkerReplication</code> element. If your <code>Filter</code>
 * includes a <code>Tag</code> element, the <code>DeleteMarkerReplication</code> <code>Status</code> must be set to
 * Disabled, because Amazon S3 does not support replicating delete markers for tag-based rules. For an example
 * configuration, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
 * >Basic Rule Configuration</a>.
 * </p>
 * <p>
 * For more information about delete marker replication, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html">Basic Rule Configuration</a>.
 * </p>
 * <note>
 * <p>
 * If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete markers
 * differently. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
 * >Backward Compatibility</a>.
 * </p>
 * </note>
 */
@Generated("software.amazon.awssdk:codegen")
public final class DeleteMarkerReplication implements SdkPojo, Serializable,
        ToCopyableBuilder<DeleteMarkerReplication.Builder, DeleteMarkerReplication> {
    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(DeleteMarkerReplication::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(STATUS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String status;

    private DeleteMarkerReplication(BuilderImpl builder) {
        this.status = builder.status;
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * </note>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link DeleteMarkerReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Indicates whether to replicate delete markers.</p> <note>
     *         <p>
     *         Indicates whether to replicate delete markers.
     *         </p>
     * @see DeleteMarkerReplicationStatus
     */
    public final DeleteMarkerReplicationStatus status() {
        return DeleteMarkerReplicationStatus.fromValue(status);
    }

    /**
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * <note>
     * <p>
     * Indicates whether to replicate delete markers.
     * </p>
     * </note>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link DeleteMarkerReplicationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #statusAsString}.
     * </p>
     * 
     * @return Indicates whether to replicate delete markers.</p> <note>
     *         <p>
     *         Indicates whether to replicate delete markers.
     *         </p>
     * @see DeleteMarkerReplicationStatus
     */
    public final String statusAsString() {
        return status;
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public static Class<? extends Builder> serializableBuilderClass() {
        return BuilderImpl.class;
    }

    @Override
    public final int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DeleteMarkerReplication)) {
            return false;
        }
        DeleteMarkerReplication other = (DeleteMarkerReplication) obj;
        return Objects.equals(statusAsString(), other.statusAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DeleteMarkerReplication").add("Status", statusAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DeleteMarkerReplication, T> g) {
        return obj -> g.apply((DeleteMarkerReplication) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, DeleteMarkerReplication> {
        /**
         * <p>
         * Indicates whether to replicate delete markers.
         * </p>
         * <note>
         * <p>
         * Indicates whether to replicate delete markers.
         * </p>
         * </note>
         * 
         * @param status
         *        Indicates whether to replicate delete markers.</p> <note>
         *        <p>
         *        Indicates whether to replicate delete markers.
         *        </p>
         * @see DeleteMarkerReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see DeleteMarkerReplicationStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Indicates whether to replicate delete markers.
         * </p>
         * <note>
         * <p>
         * Indicates whether to replicate delete markers.
         * </p>
         * </note>
         * 
         * @param status
         *        Indicates whether to replicate delete markers.</p> <note>
         *        <p>
         *        Indicates whether to replicate delete markers.
         *        </p>
         * @see DeleteMarkerReplicationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see DeleteMarkerReplicationStatus
         */
        Builder status(DeleteMarkerReplicationStatus status);
    }

    static final class BuilderImpl implements Builder {
        private String status;

        private BuilderImpl() {
        }

        private BuilderImpl(DeleteMarkerReplication model) {
            status(model.status);
        }

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        @Override
        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public final Builder status(DeleteMarkerReplicationStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        @Override
        public DeleteMarkerReplication build() {
            return new DeleteMarkerReplication(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
