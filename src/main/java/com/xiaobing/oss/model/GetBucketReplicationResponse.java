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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetBucketReplicationResponse extends S3Response implements
        ToCopyableBuilder<GetBucketReplicationResponse.Builder, GetBucketReplicationResponse> {
    private static final SdkField<ReplicationConfiguration> REPLICATION_CONFIGURATION_FIELD = SdkField
            .<ReplicationConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("ReplicationConfiguration")
            .getter(getter(GetBucketReplicationResponse::replicationConfiguration))
            .setter(setter(Builder::replicationConfiguration))
            .constructor(ReplicationConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplicationConfiguration")
                    .unmarshallLocationName("ReplicationConfiguration").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays
            .asList(REPLICATION_CONFIGURATION_FIELD));

    private final ReplicationConfiguration replicationConfiguration;

    private GetBucketReplicationResponse(BuilderImpl builder) {
        super(builder);
        this.replicationConfiguration = builder.replicationConfiguration;
    }

    /**
     * Returns the value of the ReplicationConfiguration property for this object.
     * 
     * @return The value of the ReplicationConfiguration property for this object.
     */
    public final ReplicationConfiguration replicationConfiguration() {
        return replicationConfiguration;
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(replicationConfiguration());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof GetBucketReplicationResponse)) {
            return false;
        }
        GetBucketReplicationResponse other = (GetBucketReplicationResponse) obj;
        return Objects.equals(replicationConfiguration(), other.replicationConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketReplicationResponse").add("ReplicationConfiguration", replicationConfiguration())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ReplicationConfiguration":
            return Optional.ofNullable(clazz.cast(replicationConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketReplicationResponse, T> g) {
        return obj -> g.apply((GetBucketReplicationResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketReplicationResponse> {
        /**
         * Sets the value of the ReplicationConfiguration property for this object.
         *
         * @param replicationConfiguration
         *        The new value for the ReplicationConfiguration property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration);

        /**
         * Sets the value of the ReplicationConfiguration property for this object.
         *
         * This is a convenience method that creates an instance of the {@link ReplicationConfiguration.Builder}
         * avoiding the need to create one manually via {@link ReplicationConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #replicationConfiguration(ReplicationConfiguration)}.
         * 
         * @param replicationConfiguration
         *        a consumer that will call methods on {@link ReplicationConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #replicationConfiguration(ReplicationConfiguration)
         */
        default Builder replicationConfiguration(Consumer<ReplicationConfiguration.Builder> replicationConfiguration) {
            return replicationConfiguration(ReplicationConfiguration.builder().applyMutation(replicationConfiguration).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private ReplicationConfiguration replicationConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketReplicationResponse model) {
            super(model);
            replicationConfiguration(model.replicationConfiguration);
        }

        public final ReplicationConfiguration.Builder getReplicationConfiguration() {
            return replicationConfiguration != null ? replicationConfiguration.toBuilder() : null;
        }

        public final void setReplicationConfiguration(ReplicationConfiguration.BuilderImpl replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration != null ? replicationConfiguration.build() : null;
        }

        @Override
        public final Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        @Override
        public GetBucketReplicationResponse build() {
            return new GetBucketReplicationResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
