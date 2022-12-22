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
public final class GetBucketOwnershipControlsResponse extends S3Response implements
        ToCopyableBuilder<GetBucketOwnershipControlsResponse.Builder, GetBucketOwnershipControlsResponse> {
    private static final SdkField<OwnershipControls> OWNERSHIP_CONTROLS_FIELD = SdkField
            .<OwnershipControls> builder(MarshallingType.SDK_POJO)
            .memberName("OwnershipControls")
            .getter(getter(GetBucketOwnershipControlsResponse::ownershipControls))
            .setter(setter(Builder::ownershipControls))
            .constructor(OwnershipControls::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OwnershipControls")
                    .unmarshallLocationName("OwnershipControls").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OWNERSHIP_CONTROLS_FIELD));

    private final OwnershipControls ownershipControls;

    private GetBucketOwnershipControlsResponse(BuilderImpl builder) {
        super(builder);
        this.ownershipControls = builder.ownershipControls;
    }

    /**
     * <p>
     * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) currently in
     * effect for this Amazon S3 bucket.
     * </p>
     * 
     * @return The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) currently
     *         in effect for this Amazon S3 bucket.
     */
    public final OwnershipControls ownershipControls() {
        return ownershipControls;
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
        hashCode = 31 * hashCode + Objects.hashCode(ownershipControls());
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
        if (!(obj instanceof GetBucketOwnershipControlsResponse)) {
            return false;
        }
        GetBucketOwnershipControlsResponse other = (GetBucketOwnershipControlsResponse) obj;
        return Objects.equals(ownershipControls(), other.ownershipControls());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketOwnershipControlsResponse").add("OwnershipControls", ownershipControls()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "OwnershipControls":
            return Optional.ofNullable(clazz.cast(ownershipControls()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketOwnershipControlsResponse, T> g) {
        return obj -> g.apply((GetBucketOwnershipControlsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketOwnershipControlsResponse> {
        /**
         * <p>
         * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) currently in
         * effect for this Amazon S3 bucket.
         * </p>
         * 
         * @param ownershipControls
         *        The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter)
         *        currently in effect for this Amazon S3 bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ownershipControls(OwnershipControls ownershipControls);

        /**
         * <p>
         * The <code>OwnershipControls</code> (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) currently in
         * effect for this Amazon S3 bucket.
         * </p>
         * This is a convenience method that creates an instance of the {@link OwnershipControls.Builder} avoiding the
         * need to create one manually via {@link OwnershipControls#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link OwnershipControls.Builder#build()} is called immediately and its
         * result is passed to {@link #ownershipControls(OwnershipControls)}.
         * 
         * @param ownershipControls
         *        a consumer that will call methods on {@link OwnershipControls.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #ownershipControls(OwnershipControls)
         */
        default Builder ownershipControls(Consumer<OwnershipControls.Builder> ownershipControls) {
            return ownershipControls(OwnershipControls.builder().applyMutation(ownershipControls).build());
        }
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private OwnershipControls ownershipControls;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketOwnershipControlsResponse model) {
            super(model);
            ownershipControls(model.ownershipControls);
        }

        public final OwnershipControls.Builder getOwnershipControls() {
            return ownershipControls != null ? ownershipControls.toBuilder() : null;
        }

        public final void setOwnershipControls(OwnershipControls.BuilderImpl ownershipControls) {
            this.ownershipControls = ownershipControls != null ? ownershipControls.build() : null;
        }

        @Override
        public final Builder ownershipControls(OwnershipControls ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }

        @Override
        public GetBucketOwnershipControlsResponse build() {
            return new GetBucketOwnershipControlsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
