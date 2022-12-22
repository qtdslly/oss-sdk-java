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
 * <p>
 * The container for the completed multipart upload details.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CompletedMultipartUpload implements SdkPojo, Serializable,
        ToCopyableBuilder<CompletedMultipartUpload.Builder, CompletedMultipartUpload> {
    private static final SdkField<List<CompletedPart>> PARTS_FIELD = SdkField
            .<List<CompletedPart>> builder(MarshallingType.LIST)
            .memberName("Parts")
            .getter(getter(CompletedMultipartUpload::parts))
            .setter(setter(Builder::parts))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Part")
                    .unmarshallLocationName("Part").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<CompletedPart> builder(MarshallingType.SDK_POJO)
                                            .constructor(CompletedPart::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PARTS_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<CompletedPart> parts;

    private CompletedMultipartUpload(BuilderImpl builder) {
        this.parts = builder.parts;
    }

    /**
     * For responses, this returns true if the service returned a value for the Parts property. This DOES NOT check that
     * the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is useful
     * because the SDK will never return a null collection or map, but you may need to differentiate between the service
     * returning nothing (or null) and the service returning an empty collection or map. For requests, this returns true
     * if a value for the property was specified in the request builder, and false if a value was not specified.
     */
    public final boolean hasParts() {
        return parts != null && !(parts instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Array of CompletedPart data types.
     * </p>
     * <p>
     * If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400 response.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasParts} method.
     * </p>
     * 
     * @return Array of CompletedPart data types.</p>
     *         <p>
     *         If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
     *         response.
     */
    public final List<CompletedPart> parts() {
        return parts;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasParts() ? parts() : null);
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
        if (!(obj instanceof CompletedMultipartUpload)) {
            return false;
        }
        CompletedMultipartUpload other = (CompletedMultipartUpload) obj;
        return hasParts() == other.hasParts() && Objects.equals(parts(), other.parts());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CompletedMultipartUpload").add("Parts", hasParts() ? parts() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Parts":
            return Optional.ofNullable(clazz.cast(parts()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CompletedMultipartUpload, T> g) {
        return obj -> g.apply((CompletedMultipartUpload) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CompletedMultipartUpload> {
        /**
         * <p>
         * Array of CompletedPart data types.
         * </p>
         * <p>
         * If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
         * response.
         * </p>
         * 
         * @param parts
         *        Array of CompletedPart data types.</p>
         *        <p>
         *        If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
         *        response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(Collection<CompletedPart> parts);

        /**
         * <p>
         * Array of CompletedPart data types.
         * </p>
         * <p>
         * If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
         * response.
         * </p>
         * 
         * @param parts
         *        Array of CompletedPart data types.</p>
         *        <p>
         *        If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
         *        response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(CompletedPart... parts);

        /**
         * <p>
         * Array of CompletedPart data types.
         * </p>
         * <p>
         * If you do not supply a valid <code>Part</code> with your request, the service sends back an HTTP 400
         * response.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link CompletedPart.Builder} avoiding the need to create one
         * manually via {@link CompletedPart#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link CompletedPart.Builder#build()} is called immediately and its
         * result is passed to {@link #parts(List<CompletedPart>)}.
         * 
         * @param parts
         *        a consumer that will call methods on
         *        {@link CompletedPart.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #parts(Collection<CompletedPart>)
         */
        Builder parts(Consumer<CompletedPart.Builder>... parts);
    }

    static final class BuilderImpl implements Builder {
        private List<CompletedPart> parts = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(CompletedMultipartUpload model) {
            parts(model.parts);
        }

        public final List<CompletedPart.Builder> getParts() {
            List<CompletedPart.Builder> result = CompletedPartListCopier.copyToBuilder(this.parts);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setParts(Collection<CompletedPart.BuilderImpl> parts) {
            this.parts = CompletedPartListCopier.copyFromBuilder(parts);
        }

        @Override
        public final Builder parts(Collection<CompletedPart> parts) {
            this.parts = CompletedPartListCopier.copy(parts);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(CompletedPart... parts) {
            parts(Arrays.asList(parts));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(Consumer<CompletedPart.Builder>... parts) {
            parts(Stream.of(parts).map(c -> CompletedPart.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public CompletedMultipartUpload build() {
            return new CompletedMultipartUpload(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
