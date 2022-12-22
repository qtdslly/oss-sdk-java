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
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class RestoreObjectResponse extends S3Response implements
        ToCopyableBuilder<RestoreObjectResponse.Builder, RestoreObjectResponse> {
    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(RestoreObjectResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<String> RESTORE_OUTPUT_PATH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RestoreOutputPath")
            .getter(getter(RestoreObjectResponse::restoreOutputPath))
            .setter(setter(Builder::restoreOutputPath))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-restore-output-path")
                    .unmarshallLocationName("x-amz-restore-output-path").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(REQUEST_CHARGED_FIELD,
            RESTORE_OUTPUT_PATH_FIELD));

    private final String requestCharged;

    private final String restoreOutputPath;

    private RestoreObjectResponse(BuilderImpl builder) {
        super(builder);
        this.requestCharged = builder.requestCharged;
        this.restoreOutputPath = builder.restoreOutputPath;
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final RequestCharged requestCharged() {
        return RequestCharged.fromValue(requestCharged);
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final String requestChargedAsString() {
        return requestCharged;
    }

    /**
     * <p>
     * Indicates the path in the provided S3 output location where Select results will be restored to.
     * </p>
     * 
     * @return Indicates the path in the provided S3 output location where Select results will be restored to.
     */
    public final String restoreOutputPath() {
        return restoreOutputPath;
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
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(restoreOutputPath());
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
        if (!(obj instanceof RestoreObjectResponse)) {
            return false;
        }
        RestoreObjectResponse other = (RestoreObjectResponse) obj;
        return Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(restoreOutputPath(), other.restoreOutputPath());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("RestoreObjectResponse").add("RequestCharged", requestChargedAsString())
                .add("RestoreOutputPath", restoreOutputPath()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "RestoreOutputPath":
            return Optional.ofNullable(clazz.cast(restoreOutputPath()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<RestoreObjectResponse, T> g) {
        return obj -> g.apply((RestoreObjectResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, RestoreObjectResponse> {
        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(String requestCharged);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(RequestCharged requestCharged);

        /**
         * <p>
         * Indicates the path in the provided S3 output location where Select results will be restored to.
         * </p>
         * 
         * @param restoreOutputPath
         *        Indicates the path in the provided S3 output location where Select results will be restored to.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder restoreOutputPath(String restoreOutputPath);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String requestCharged;

        private String restoreOutputPath;

        private BuilderImpl() {
        }

        private BuilderImpl(RestoreObjectResponse model) {
            super(model);
            requestCharged(model.requestCharged);
            restoreOutputPath(model.restoreOutputPath);
        }

        public final String getRequestCharged() {
            return requestCharged;
        }

        public final void setRequestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
        }

        @Override
        public final Builder requestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
            return this;
        }

        @Override
        public final Builder requestCharged(RequestCharged requestCharged) {
            this.requestCharged(requestCharged == null ? null : requestCharged.toString());
            return this;
        }

        public final String getRestoreOutputPath() {
            return restoreOutputPath;
        }

        public final void setRestoreOutputPath(String restoreOutputPath) {
            this.restoreOutputPath = restoreOutputPath;
        }

        @Override
        public final Builder restoreOutputPath(String restoreOutputPath) {
            this.restoreOutputPath = restoreOutputPath;
            return this;
        }

        @Override
        public RestoreObjectResponse build() {
            return new RestoreObjectResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
