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
public final class DeleteObjectTaggingResponse extends S3Response implements
        ToCopyableBuilder<DeleteObjectTaggingResponse.Builder, DeleteObjectTaggingResponse> {
    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(DeleteObjectTaggingResponse::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-version-id")
                    .unmarshallLocationName("x-amz-version-id").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(VERSION_ID_FIELD));

    private final String versionId;

    private DeleteObjectTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.versionId = builder.versionId;
    }

    /**
     * <p>
     * The versionId of the object the tag-set was removed from.
     * </p>
     * 
     * @return The versionId of the object the tag-set was removed from.
     */
    public final String versionId() {
        return versionId;
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
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
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
        if (!(obj instanceof DeleteObjectTaggingResponse)) {
            return false;
        }
        DeleteObjectTaggingResponse other = (DeleteObjectTaggingResponse) obj;
        return Objects.equals(versionId(), other.versionId());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DeleteObjectTaggingResponse").add("VersionId", versionId()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DeleteObjectTaggingResponse, T> g) {
        return obj -> g.apply((DeleteObjectTaggingResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, DeleteObjectTaggingResponse> {
        /**
         * <p>
         * The versionId of the object the tag-set was removed from.
         * </p>
         * 
         * @param versionId
         *        The versionId of the object the tag-set was removed from.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String versionId;

        private BuilderImpl() {
        }

        private BuilderImpl(DeleteObjectTaggingResponse model) {
            super(model);
            versionId(model.versionId);
        }

        public final String getVersionId() {
            return versionId;
        }

        public final void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        @Override
        public final Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteObjectTaggingResponse build() {
            return new DeleteObjectTaggingResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
