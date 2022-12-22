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
 * Container for the <code>Suffix</code> element.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class IndexDocument implements SdkPojo, Serializable, ToCopyableBuilder<IndexDocument.Builder, IndexDocument> {
    private static final SdkField<String> SUFFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Suffix")
            .getter(getter(IndexDocument::suffix))
            .setter(setter(Builder::suffix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Suffix")
                    .unmarshallLocationName("Suffix").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(SUFFIX_FIELD));

    private static final long serialVersionUID = 1L;

    private final String suffix;

    private IndexDocument(BuilderImpl builder) {
        this.suffix = builder.suffix;
    }

    /**
     * <p>
     * A suffix that is appended to a request that is for a directory on the website endpoint (for example,if the suffix
     * is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object
     * with the key name images/index.html) The suffix must not be empty and must not include a slash character.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @return A suffix that is appended to a request that is for a directory on the website endpoint (for example,if
     *         the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be
     *         for the object with the key name images/index.html) The suffix must not be empty and must not include a
     *         slash character.</p> <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */
    public final String suffix() {
        return suffix;
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
        hashCode = 31 * hashCode + Objects.hashCode(suffix());
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
        if (!(obj instanceof IndexDocument)) {
            return false;
        }
        IndexDocument other = (IndexDocument) obj;
        return Objects.equals(suffix(), other.suffix());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("IndexDocument").add("Suffix", suffix()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Suffix":
            return Optional.ofNullable(clazz.cast(suffix()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<IndexDocument, T> g) {
        return obj -> g.apply((IndexDocument) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, IndexDocument> {
        /**
         * <p>
         * A suffix that is appended to a request that is for a directory on the website endpoint (for example,if the
         * suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the
         * object with the key name images/index.html) The suffix must not be empty and must not include a slash
         * character.
         * </p>
         * <important>
         * <p>
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints</a>.
         * </p>
         * </important>
         * 
         * @param suffix
         *        A suffix that is appended to a request that is for a directory on the website endpoint (for example,if
         *        the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will
         *        be for the object with the key name images/index.html) The suffix must not be empty and must not
         *        include a slash character.</p> <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder suffix(String suffix);
    }

    static final class BuilderImpl implements Builder {
        private String suffix;

        private BuilderImpl() {
        }

        private BuilderImpl(IndexDocument model) {
            suffix(model.suffix);
        }

        public final String getSuffix() {
            return suffix;
        }

        public final void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        @Override
        public final Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        @Override
        public IndexDocument build() {
            return new IndexDocument(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
