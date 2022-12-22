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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.ListTrait;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.util.DefaultSdkAutoConstructList;
import software.amazon.awssdk.core.util.SdkAutoConstructList;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetObjectTaggingResponse extends S3Response implements
        ToCopyableBuilder<GetObjectTaggingResponse.Builder, GetObjectTaggingResponse> {
    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(GetObjectTaggingResponse::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-version-id")
                    .unmarshallLocationName("x-amz-version-id").build()).build();

    private static final SdkField<List<Tag>> TAG_SET_FIELD = SdkField
            .<List<Tag>> builder(MarshallingType.LIST)
            .memberName("TagSet")
            .getter(getter(GetObjectTaggingResponse::tagSet))
            .setter(setter(Builder::tagSet))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("TagSet")
                    .unmarshallLocationName("TagSet").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Tag")
                            .memberFieldInfo(
                                    SdkField.<Tag> builder(MarshallingType.SDK_POJO)
                                            .constructor(Tag::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Tag").unmarshallLocationName("Tag").build()).build()).build())
            .build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(VERSION_ID_FIELD,
            TAG_SET_FIELD));

    private final String versionId;

    private final List<Tag> tagSet;

    private GetObjectTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.versionId = builder.versionId;
        this.tagSet = builder.tagSet;
    }

    /**
     * <p>
     * The versionId of the object for which you got the tagging information.
     * </p>
     * 
     * @return The versionId of the object for which you got the tagging information.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * For responses, this returns true if the service returned a value for the TagSet property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasTagSet() {
        return tagSet != null && !(tagSet instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Contains the tag set.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTagSet} method.
     * </p>
     * 
     * @return Contains the tag set.
     */
    public final List<Tag> tagSet() {
        return tagSet;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasTagSet() ? tagSet() : null);
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
        if (!(obj instanceof GetObjectTaggingResponse)) {
            return false;
        }
        GetObjectTaggingResponse other = (GetObjectTaggingResponse) obj;
        return Objects.equals(versionId(), other.versionId()) && hasTagSet() == other.hasTagSet()
                && Objects.equals(tagSet(), other.tagSet());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectTaggingResponse").add("VersionId", versionId())
                .add("TagSet", hasTagSet() ? tagSet() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "TagSet":
            return Optional.ofNullable(clazz.cast(tagSet()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectTaggingResponse, T> g) {
        return obj -> g.apply((GetObjectTaggingResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectTaggingResponse> {
        /**
         * <p>
         * The versionId of the object for which you got the tagging information.
         * </p>
         * 
         * @param versionId
         *        The versionId of the object for which you got the tagging information.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * Contains the tag set.
         * </p>
         * 
         * @param tagSet
         *        Contains the tag set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagSet(Collection<Tag> tagSet);

        /**
         * <p>
         * Contains the tag set.
         * </p>
         * 
         * @param tagSet
         *        Contains the tag set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagSet(Tag... tagSet);

        /**
         * <p>
         * Contains the tag set.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Tag.Builder} avoiding the need to create one manually via
         * {@link Tag#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Tag.Builder#build()} is
         * called immediately and its result is passed to {@link #tagSet(List<Tag>)}.
         * 
         * @param tagSet
         *        a consumer that will call methods on {@link Tag.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #tagSet(Collection<Tag>)
         */
        Builder tagSet(Consumer<Tag.Builder>... tagSet);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private String versionId;

        private List<Tag> tagSet = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectTaggingResponse model) {
            super(model);
            versionId(model.versionId);
            tagSet(model.tagSet);
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

        public final List<Tag.Builder> getTagSet() {
            List<Tag.Builder> result = TagSetCopier.copyToBuilder(this.tagSet);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setTagSet(Collection<Tag.BuilderImpl> tagSet) {
            this.tagSet = TagSetCopier.copyFromBuilder(tagSet);
        }

        @Override
        public final Builder tagSet(Collection<Tag> tagSet) {
            this.tagSet = TagSetCopier.copy(tagSet);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tagSet(Tag... tagSet) {
            tagSet(Arrays.asList(tagSet));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder tagSet(Consumer<Tag.Builder>... tagSet) {
            tagSet(Stream.of(tagSet).map(c -> Tag.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public GetObjectTaggingResponse build() {
            return new GetObjectTaggingResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
