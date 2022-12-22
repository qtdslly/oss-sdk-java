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
import java.util.function.Function;
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
 * Specifies a cross-origin access rule for an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class CORSRule implements SdkPojo, Serializable, ToCopyableBuilder<CORSRule.Builder, CORSRule> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ID")
            .getter(getter(CORSRule::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ID").unmarshallLocationName("ID")
                    .build()).build();

    private static final SdkField<List<String>> ALLOWED_HEADERS_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("AllowedHeaders")
            .getter(getter(CORSRule::allowedHeaders))
            .setter(setter(Builder::allowedHeaders))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AllowedHeader")
                    .unmarshallLocationName("AllowedHeader").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<String>> ALLOWED_METHODS_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("AllowedMethods")
            .getter(getter(CORSRule::allowedMethods))
            .setter(setter(Builder::allowedMethods))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AllowedMethod")
                    .unmarshallLocationName("AllowedMethod").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<String>> ALLOWED_ORIGINS_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("AllowedOrigins")
            .getter(getter(CORSRule::allowedOrigins))
            .setter(setter(Builder::allowedOrigins))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AllowedOrigin")
                    .unmarshallLocationName("AllowedOrigin").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<String>> EXPOSE_HEADERS_FIELD = SdkField
            .<List<String>> builder(MarshallingType.LIST)
            .memberName("ExposeHeaders")
            .getter(getter(CORSRule::exposeHeaders))
            .setter(setter(Builder::exposeHeaders))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ExposeHeader")
                    .unmarshallLocationName("ExposeHeader").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<String> builder(MarshallingType.STRING)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<Integer> MAX_AGE_SECONDS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxAgeSeconds")
            .getter(getter(CORSRule::maxAgeSeconds))
            .setter(setter(Builder::maxAgeSeconds))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxAgeSeconds")
                    .unmarshallLocationName("MaxAgeSeconds").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD,
            ALLOWED_HEADERS_FIELD, ALLOWED_METHODS_FIELD, ALLOWED_ORIGINS_FIELD, EXPOSE_HEADERS_FIELD, MAX_AGE_SECONDS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final List<String> allowedHeaders;

    private final List<String> allowedMethods;

    private final List<String> allowedOrigins;

    private final List<String> exposeHeaders;

    private final Integer maxAgeSeconds;

    private CORSRule(BuilderImpl builder) {
        this.id = builder.id;
        this.allowedHeaders = builder.allowedHeaders;
        this.allowedMethods = builder.allowedMethods;
        this.allowedOrigins = builder.allowedOrigins;
        this.exposeHeaders = builder.exposeHeaders;
        this.maxAgeSeconds = builder.maxAgeSeconds;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     * 
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     */
    public final String id() {
        return id;
    }

    /**
     * For responses, this returns true if the service returned a value for the AllowedHeaders property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasAllowedHeaders() {
        return allowedHeaders != null && !(allowedHeaders instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers are allowed
     * in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any requested
     * headers that are allowed.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasAllowedHeaders} method.
     * </p>
     * 
     * @return Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers are
     *         allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns
     *         any requested headers that are allowed.
     */
    public final List<String> allowedHeaders() {
        return allowedHeaders;
    }

    /**
     * For responses, this returns true if the service returned a value for the AllowedMethods property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasAllowedMethods() {
        return allowedMethods != null && !(allowedMethods instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>, <code>PUT</code>,
     * <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasAllowedMethods} method.
     * </p>
     * 
     * @return An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>, <code>PUT</code>,
     *         <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
     */
    public final List<String> allowedMethods() {
        return allowedMethods;
    }

    /**
     * For responses, this returns true if the service returned a value for the AllowedOrigins property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasAllowedOrigins() {
        return allowedOrigins != null && !(allowedOrigins instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * One or more origins you want customers to be able to access the bucket from.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasAllowedOrigins} method.
     * </p>
     * 
     * @return One or more origins you want customers to be able to access the bucket from.
     */
    public final List<String> allowedOrigins() {
        return allowedOrigins;
    }

    /**
     * For responses, this returns true if the service returned a value for the ExposeHeaders property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasExposeHeaders() {
        return exposeHeaders != null && !(exposeHeaders instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * One or more headers in the response that you want customers to be able to access from their applications (for
     * example, from a JavaScript <code>XMLHttpRequest</code> object).
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasExposeHeaders} method.
     * </p>
     * 
     * @return One or more headers in the response that you want customers to be able to access from their applications
     *         (for example, from a JavaScript <code>XMLHttpRequest</code> object).
     */
    public final List<String> exposeHeaders() {
        return exposeHeaders;
    }

    /**
     * <p>
     * The time in seconds that your browser is to cache the preflight response for the specified resource.
     * </p>
     * 
     * @return The time in seconds that your browser is to cache the preflight response for the specified resource.
     */
    public final Integer maxAgeSeconds() {
        return maxAgeSeconds;
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
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(hasAllowedHeaders() ? allowedHeaders() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasAllowedMethods() ? allowedMethods() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasAllowedOrigins() ? allowedOrigins() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasExposeHeaders() ? exposeHeaders() : null);
        hashCode = 31 * hashCode + Objects.hashCode(maxAgeSeconds());
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
        if (!(obj instanceof CORSRule)) {
            return false;
        }
        CORSRule other = (CORSRule) obj;
        return Objects.equals(id(), other.id()) && hasAllowedHeaders() == other.hasAllowedHeaders()
                && Objects.equals(allowedHeaders(), other.allowedHeaders()) && hasAllowedMethods() == other.hasAllowedMethods()
                && Objects.equals(allowedMethods(), other.allowedMethods()) && hasAllowedOrigins() == other.hasAllowedOrigins()
                && Objects.equals(allowedOrigins(), other.allowedOrigins()) && hasExposeHeaders() == other.hasExposeHeaders()
                && Objects.equals(exposeHeaders(), other.exposeHeaders())
                && Objects.equals(maxAgeSeconds(), other.maxAgeSeconds());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CORSRule").add("ID", id()).add("AllowedHeaders", hasAllowedHeaders() ? allowedHeaders() : null)
                .add("AllowedMethods", hasAllowedMethods() ? allowedMethods() : null)
                .add("AllowedOrigins", hasAllowedOrigins() ? allowedOrigins() : null)
                .add("ExposeHeaders", hasExposeHeaders() ? exposeHeaders() : null).add("MaxAgeSeconds", maxAgeSeconds()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ID":
            return Optional.ofNullable(clazz.cast(id()));
        case "AllowedHeaders":
            return Optional.ofNullable(clazz.cast(allowedHeaders()));
        case "AllowedMethods":
            return Optional.ofNullable(clazz.cast(allowedMethods()));
        case "AllowedOrigins":
            return Optional.ofNullable(clazz.cast(allowedOrigins()));
        case "ExposeHeaders":
            return Optional.ofNullable(clazz.cast(exposeHeaders()));
        case "MaxAgeSeconds":
            return Optional.ofNullable(clazz.cast(maxAgeSeconds()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CORSRule, T> g) {
        return obj -> g.apply((CORSRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, CORSRule> {
        /**
         * <p>
         * Unique identifier for the rule. The value cannot be longer than 255 characters.
         * </p>
         * 
         * @param id
         *        Unique identifier for the rule. The value cannot be longer than 255 characters.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers are
         * allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any
         * requested headers that are allowed.
         * </p>
         * 
         * @param allowedHeaders
         *        Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers
         *        are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3
         *        returns any requested headers that are allowed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedHeaders(Collection<String> allowedHeaders);

        /**
         * <p>
         * Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers are
         * allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any
         * requested headers that are allowed.
         * </p>
         * 
         * @param allowedHeaders
         *        Headers that are specified in the <code>Access-Control-Request-Headers</code> header. These headers
         *        are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3
         *        returns any requested headers that are allowed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedHeaders(String... allowedHeaders);

        /**
         * <p>
         * An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>, <code>PUT</code>,
         * <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
         * </p>
         * 
         * @param allowedMethods
         *        An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>,
         *        <code>PUT</code>, <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedMethods(Collection<String> allowedMethods);

        /**
         * <p>
         * An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>, <code>PUT</code>,
         * <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
         * </p>
         * 
         * @param allowedMethods
         *        An HTTP method that you allow the origin to execute. Valid values are <code>GET</code>,
         *        <code>PUT</code>, <code>HEAD</code>, <code>POST</code>, and <code>DELETE</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedMethods(String... allowedMethods);

        /**
         * <p>
         * One or more origins you want customers to be able to access the bucket from.
         * </p>
         * 
         * @param allowedOrigins
         *        One or more origins you want customers to be able to access the bucket from.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedOrigins(Collection<String> allowedOrigins);

        /**
         * <p>
         * One or more origins you want customers to be able to access the bucket from.
         * </p>
         * 
         * @param allowedOrigins
         *        One or more origins you want customers to be able to access the bucket from.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder allowedOrigins(String... allowedOrigins);

        /**
         * <p>
         * One or more headers in the response that you want customers to be able to access from their applications (for
         * example, from a JavaScript <code>XMLHttpRequest</code> object).
         * </p>
         * 
         * @param exposeHeaders
         *        One or more headers in the response that you want customers to be able to access from their
         *        applications (for example, from a JavaScript <code>XMLHttpRequest</code> object).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder exposeHeaders(Collection<String> exposeHeaders);

        /**
         * <p>
         * One or more headers in the response that you want customers to be able to access from their applications (for
         * example, from a JavaScript <code>XMLHttpRequest</code> object).
         * </p>
         * 
         * @param exposeHeaders
         *        One or more headers in the response that you want customers to be able to access from their
         *        applications (for example, from a JavaScript <code>XMLHttpRequest</code> object).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder exposeHeaders(String... exposeHeaders);

        /**
         * <p>
         * The time in seconds that your browser is to cache the preflight response for the specified resource.
         * </p>
         * 
         * @param maxAgeSeconds
         *        The time in seconds that your browser is to cache the preflight response for the specified resource.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxAgeSeconds(Integer maxAgeSeconds);
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private List<String> allowedHeaders = DefaultSdkAutoConstructList.getInstance();

        private List<String> allowedMethods = DefaultSdkAutoConstructList.getInstance();

        private List<String> allowedOrigins = DefaultSdkAutoConstructList.getInstance();

        private List<String> exposeHeaders = DefaultSdkAutoConstructList.getInstance();

        private Integer maxAgeSeconds;

        private BuilderImpl() {
        }

        private BuilderImpl(CORSRule model) {
            id(model.id);
            allowedHeaders(model.allowedHeaders);
            allowedMethods(model.allowedMethods);
            allowedOrigins(model.allowedOrigins);
            exposeHeaders(model.exposeHeaders);
            maxAgeSeconds(model.maxAgeSeconds);
        }

        public final String getId() {
            return id;
        }

        public final void setId(String id) {
            this.id = id;
        }

        @Override
        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Collection<String> getAllowedHeaders() {
            if (allowedHeaders instanceof SdkAutoConstructList) {
                return null;
            }
            return allowedHeaders;
        }

        public final void setAllowedHeaders(Collection<String> allowedHeaders) {
            this.allowedHeaders = AllowedHeadersCopier.copy(allowedHeaders);
        }

        @Override
        public final Builder allowedHeaders(Collection<String> allowedHeaders) {
            this.allowedHeaders = AllowedHeadersCopier.copy(allowedHeaders);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder allowedHeaders(String... allowedHeaders) {
            allowedHeaders(Arrays.asList(allowedHeaders));
            return this;
        }

        public final Collection<String> getAllowedMethods() {
            if (allowedMethods instanceof SdkAutoConstructList) {
                return null;
            }
            return allowedMethods;
        }

        public final void setAllowedMethods(Collection<String> allowedMethods) {
            this.allowedMethods = AllowedMethodsCopier.copy(allowedMethods);
        }

        @Override
        public final Builder allowedMethods(Collection<String> allowedMethods) {
            this.allowedMethods = AllowedMethodsCopier.copy(allowedMethods);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder allowedMethods(String... allowedMethods) {
            allowedMethods(Arrays.asList(allowedMethods));
            return this;
        }

        public final Collection<String> getAllowedOrigins() {
            if (allowedOrigins instanceof SdkAutoConstructList) {
                return null;
            }
            return allowedOrigins;
        }

        public final void setAllowedOrigins(Collection<String> allowedOrigins) {
            this.allowedOrigins = AllowedOriginsCopier.copy(allowedOrigins);
        }

        @Override
        public final Builder allowedOrigins(Collection<String> allowedOrigins) {
            this.allowedOrigins = AllowedOriginsCopier.copy(allowedOrigins);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder allowedOrigins(String... allowedOrigins) {
            allowedOrigins(Arrays.asList(allowedOrigins));
            return this;
        }

        public final Collection<String> getExposeHeaders() {
            if (exposeHeaders instanceof SdkAutoConstructList) {
                return null;
            }
            return exposeHeaders;
        }

        public final void setExposeHeaders(Collection<String> exposeHeaders) {
            this.exposeHeaders = ExposeHeadersCopier.copy(exposeHeaders);
        }

        @Override
        public final Builder exposeHeaders(Collection<String> exposeHeaders) {
            this.exposeHeaders = ExposeHeadersCopier.copy(exposeHeaders);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder exposeHeaders(String... exposeHeaders) {
            exposeHeaders(Arrays.asList(exposeHeaders));
            return this;
        }

        public final Integer getMaxAgeSeconds() {
            return maxAgeSeconds;
        }

        public final void setMaxAgeSeconds(Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
        }

        @Override
        public final Builder maxAgeSeconds(Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        @Override
        public CORSRule build() {
            return new CORSRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
