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
 * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If
 * request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2. If request
 * results in HTTP error 4xx, redirect request to another host where you might process the error.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Condition implements SdkPojo, Serializable, ToCopyableBuilder<Condition.Builder, Condition> {
    private static final SdkField<String> HTTP_ERROR_CODE_RETURNED_EQUALS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("HttpErrorCodeReturnedEquals")
            .getter(getter(Condition::httpErrorCodeReturnedEquals))
            .setter(setter(Builder::httpErrorCodeReturnedEquals))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("HttpErrorCodeReturnedEquals")
                    .unmarshallLocationName("HttpErrorCodeReturnedEquals").build()).build();

    private static final SdkField<String> KEY_PREFIX_EQUALS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("KeyPrefixEquals")
            .getter(getter(Condition::keyPrefixEquals))
            .setter(setter(Builder::keyPrefixEquals))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyPrefixEquals")
                    .unmarshallLocationName("KeyPrefixEquals").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(
            HTTP_ERROR_CODE_RETURNED_EQUALS_FIELD, KEY_PREFIX_EQUALS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String httpErrorCodeReturnedEquals;

    private final String keyPrefixEquals;

    private Condition(BuilderImpl builder) {
        this.httpErrorCodeReturnedEquals = builder.httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = builder.keyPrefixEquals;
    }

    /**
     * <p>
     * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value,
     * then the specified redirect is applied. Required when parent element <code>Condition</code> is specified and
     * sibling <code>KeyPrefixEquals</code> is not specified. If both are specified, then both must be true for the
     * redirect to be applied.
     * </p>
     * 
     * @return The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this
     *         value, then the specified redirect is applied. Required when parent element <code>Condition</code> is
     *         specified and sibling <code>KeyPrefixEquals</code> is not specified. If both are specified, then both
     *         must be true for the redirect to be applied.
     */
    public final String httpErrorCodeReturnedEquals() {
        return httpErrorCodeReturnedEquals;
    }

    /**
     * <p>
     * The object key name prefix when the redirect is applied. For example, to redirect requests for
     * <code>ExamplePage.html</code>, the key prefix will be <code>ExamplePage.html</code>. To redirect request for all
     * pages with the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>, which identifies all objects
     * in the <code>docs/</code> folder. Required when the parent element <code>Condition</code> is specified and
     * sibling <code>HttpErrorCodeReturnedEquals</code> is not specified. If both conditions are specified, both must be
     * true for the redirect to be applied.
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
     * @return The object key name prefix when the redirect is applied. For example, to redirect requests for
     *         <code>ExamplePage.html</code>, the key prefix will be <code>ExamplePage.html</code>. To redirect request
     *         for all pages with the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>, which
     *         identifies all objects in the <code>docs/</code> folder. Required when the parent element
     *         <code>Condition</code> is specified and sibling <code>HttpErrorCodeReturnedEquals</code> is not
     *         specified. If both conditions are specified, both must be true for the redirect to be applied.</p>
     *         <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */
    public final String keyPrefixEquals() {
        return keyPrefixEquals;
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
        hashCode = 31 * hashCode + Objects.hashCode(httpErrorCodeReturnedEquals());
        hashCode = 31 * hashCode + Objects.hashCode(keyPrefixEquals());
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
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition other = (Condition) obj;
        return Objects.equals(httpErrorCodeReturnedEquals(), other.httpErrorCodeReturnedEquals())
                && Objects.equals(keyPrefixEquals(), other.keyPrefixEquals());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Condition").add("HttpErrorCodeReturnedEquals", httpErrorCodeReturnedEquals())
                .add("KeyPrefixEquals", keyPrefixEquals()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "HttpErrorCodeReturnedEquals":
            return Optional.ofNullable(clazz.cast(httpErrorCodeReturnedEquals()));
        case "KeyPrefixEquals":
            return Optional.ofNullable(clazz.cast(keyPrefixEquals()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Condition, T> g) {
        return obj -> g.apply((Condition) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Condition> {
        /**
         * <p>
         * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this
         * value, then the specified redirect is applied. Required when parent element <code>Condition</code> is
         * specified and sibling <code>KeyPrefixEquals</code> is not specified. If both are specified, then both must be
         * true for the redirect to be applied.
         * </p>
         * 
         * @param httpErrorCodeReturnedEquals
         *        The HTTP error code when the redirect is applied. In the event of an error, if the error code equals
         *        this value, then the specified redirect is applied. Required when parent element
         *        <code>Condition</code> is specified and sibling <code>KeyPrefixEquals</code> is not specified. If both
         *        are specified, then both must be true for the redirect to be applied.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder httpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals);

        /**
         * <p>
         * The object key name prefix when the redirect is applied. For example, to redirect requests for
         * <code>ExamplePage.html</code>, the key prefix will be <code>ExamplePage.html</code>. To redirect request for
         * all pages with the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>, which identifies all
         * objects in the <code>docs/</code> folder. Required when the parent element <code>Condition</code> is
         * specified and sibling <code>HttpErrorCodeReturnedEquals</code> is not specified. If both conditions are
         * specified, both must be true for the redirect to be applied.
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
         * @param keyPrefixEquals
         *        The object key name prefix when the redirect is applied. For example, to redirect requests for
         *        <code>ExamplePage.html</code>, the key prefix will be <code>ExamplePage.html</code>. To redirect
         *        request for all pages with the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>,
         *        which identifies all objects in the <code>docs/</code> folder. Required when the parent element
         *        <code>Condition</code> is specified and sibling <code>HttpErrorCodeReturnedEquals</code> is not
         *        specified. If both conditions are specified, both must be true for the redirect to be applied.</p>
         *        <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyPrefixEquals(String keyPrefixEquals);
    }

    static final class BuilderImpl implements Builder {
        private String httpErrorCodeReturnedEquals;

        private String keyPrefixEquals;

        private BuilderImpl() {
        }

        private BuilderImpl(Condition model) {
            httpErrorCodeReturnedEquals(model.httpErrorCodeReturnedEquals);
            keyPrefixEquals(model.keyPrefixEquals);
        }

        public final String getHttpErrorCodeReturnedEquals() {
            return httpErrorCodeReturnedEquals;
        }

        public final void setHttpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        }

        @Override
        public final Builder httpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        public final String getKeyPrefixEquals() {
            return keyPrefixEquals;
        }

        public final void setKeyPrefixEquals(String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
        }

        @Override
        public final Builder keyPrefixEquals(String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        @Override
        public Condition build() {
            return new Condition(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
