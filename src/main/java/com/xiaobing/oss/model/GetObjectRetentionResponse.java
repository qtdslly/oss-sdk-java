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
public final class GetObjectRetentionResponse extends S3Response implements
        ToCopyableBuilder<GetObjectRetentionResponse.Builder, GetObjectRetentionResponse> {
    private static final SdkField<ObjectLockRetention> RETENTION_FIELD = SdkField
            .<ObjectLockRetention> builder(MarshallingType.SDK_POJO)
            .memberName("Retention")
            .getter(getter(GetObjectRetentionResponse::retention))
            .setter(setter(Builder::retention))
            .constructor(ObjectLockRetention::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Retention")
                    .unmarshallLocationName("Retention").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(RETENTION_FIELD));

    private final ObjectLockRetention retention;

    private GetObjectRetentionResponse(BuilderImpl builder) {
        super(builder);
        this.retention = builder.retention;
    }

    /**
     * <p>
     * The container element for an object's retention settings.
     * </p>
     * 
     * @return The container element for an object's retention settings.
     */
    public final ObjectLockRetention retention() {
        return retention;
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
        hashCode = 31 * hashCode + Objects.hashCode(retention());
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
        if (!(obj instanceof GetObjectRetentionResponse)) {
            return false;
        }
        GetObjectRetentionResponse other = (GetObjectRetentionResponse) obj;
        return Objects.equals(retention(), other.retention());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectRetentionResponse").add("Retention", retention()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Retention":
            return Optional.ofNullable(clazz.cast(retention()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectRetentionResponse, T> g) {
        return obj -> g.apply((GetObjectRetentionResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectRetentionResponse> {
        /**
         * <p>
         * The container element for an object's retention settings.
         * </p>
         * 
         * @param retention
         *        The container element for an object's retention settings.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder retention(ObjectLockRetention retention);

        /**
         * <p>
         * The container element for an object's retention settings.
         * </p>
         * This is a convenience method that creates an instance of the {@link ObjectLockRetention.Builder} avoiding the
         * need to create one manually via {@link ObjectLockRetention#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ObjectLockRetention.Builder#build()} is called immediately and
         * its result is passed to {@link #retention(ObjectLockRetention)}.
         * 
         * @param retention
         *        a consumer that will call methods on {@link ObjectLockRetention.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #retention(ObjectLockRetention)
         */
        default Builder retention(Consumer<ObjectLockRetention.Builder> retention) {
            return retention(ObjectLockRetention.builder().applyMutation(retention).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private ObjectLockRetention retention;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectRetentionResponse model) {
            super(model);
            retention(model.retention);
        }

        public final ObjectLockRetention.Builder getRetention() {
            return retention != null ? retention.toBuilder() : null;
        }

        public final void setRetention(ObjectLockRetention.BuilderImpl retention) {
            this.retention = retention != null ? retention.build() : null;
        }

        @Override
        public final Builder retention(ObjectLockRetention retention) {
            this.retention = retention;
            return this;
        }

        @Override
        public GetObjectRetentionResponse build() {
            return new GetObjectRetentionResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
