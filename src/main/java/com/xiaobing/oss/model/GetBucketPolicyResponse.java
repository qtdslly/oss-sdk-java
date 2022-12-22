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
public final class GetBucketPolicyResponse extends S3Response implements
        ToCopyableBuilder<GetBucketPolicyResponse.Builder, GetBucketPolicyResponse> {
    private static final SdkField<String> POLICY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Policy")
            .getter(getter(GetBucketPolicyResponse::policy))
            .setter(setter(Builder::policy))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Policy")
                    .unmarshallLocationName("Policy").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(POLICY_FIELD));

    private final String policy;

    private GetBucketPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.policy = builder.policy;
    }

    /**
     * <p>
     * The bucket policy as a JSON document.
     * </p>
     * 
     * @return The bucket policy as a JSON document.
     */
    public final String policy() {
        return policy;
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
        hashCode = 31 * hashCode + Objects.hashCode(policy());
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
        if (!(obj instanceof GetBucketPolicyResponse)) {
            return false;
        }
        GetBucketPolicyResponse other = (GetBucketPolicyResponse) obj;
        return Objects.equals(policy(), other.policy());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetBucketPolicyResponse").add("Policy", policy()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Policy":
            return Optional.ofNullable(clazz.cast(policy()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetBucketPolicyResponse, T> g) {
        return obj -> g.apply((GetBucketPolicyResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetBucketPolicyResponse> {
        /**
         * <p>
         * The bucket policy as a JSON document.
         * </p>
         * 
         * @param policy
         *        The bucket policy as a JSON document.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder policy(String policy);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String policy;

        private BuilderImpl() {
        }

        private BuilderImpl(GetBucketPolicyResponse model) {
            super(model);
            policy(model.policy);
        }

        public final String getPolicy() {
            return policy;
        }

        public final void setPolicy(String policy) {
            this.policy = policy;
        }

        @Override
        public final Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        @Override
        public GetBucketPolicyResponse build() {
            return new GetBucketPolicyResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
