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
 * Specifies how requests are redirected. In the event of an error, you can specify a different error code to return.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Redirect implements SdkPojo, Serializable, ToCopyableBuilder<Redirect.Builder, Redirect> {
    private static final SdkField<String> HOST_NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("HostName")
            .getter(getter(Redirect::hostName))
            .setter(setter(Builder::hostName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("HostName")
                    .unmarshallLocationName("HostName").build()).build();

    private static final SdkField<String> HTTP_REDIRECT_CODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("HttpRedirectCode")
            .getter(getter(Redirect::httpRedirectCode))
            .setter(setter(Builder::httpRedirectCode))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("HttpRedirectCode")
                    .unmarshallLocationName("HttpRedirectCode").build()).build();

    private static final SdkField<String> PROTOCOL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Protocol")
            .getter(getter(Redirect::protocolAsString))
            .setter(setter(Builder::protocol))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Protocol")
                    .unmarshallLocationName("Protocol").build()).build();

    private static final SdkField<String> REPLACE_KEY_PREFIX_WITH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ReplaceKeyPrefixWith")
            .getter(getter(Redirect::replaceKeyPrefixWith))
            .setter(setter(Builder::replaceKeyPrefixWith))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplaceKeyPrefixWith")
                    .unmarshallLocationName("ReplaceKeyPrefixWith").build()).build();

    private static final SdkField<String> REPLACE_KEY_WITH_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ReplaceKeyWith")
            .getter(getter(Redirect::replaceKeyWith))
            .setter(setter(Builder::replaceKeyWith))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplaceKeyWith")
                    .unmarshallLocationName("ReplaceKeyWith").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(HOST_NAME_FIELD,
            HTTP_REDIRECT_CODE_FIELD, PROTOCOL_FIELD, REPLACE_KEY_PREFIX_WITH_FIELD, REPLACE_KEY_WITH_FIELD));

    private static final long serialVersionUID = 1L;

    private final String hostName;

    private final String httpRedirectCode;

    private final String protocol;

    private final String replaceKeyPrefixWith;

    private final String replaceKeyWith;

    private Redirect(BuilderImpl builder) {
        this.hostName = builder.hostName;
        this.httpRedirectCode = builder.httpRedirectCode;
        this.protocol = builder.protocol;
        this.replaceKeyPrefixWith = builder.replaceKeyPrefixWith;
        this.replaceKeyWith = builder.replaceKeyWith;
    }

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     * 
     * @return The host name to use in the redirect request.
     */
    public final String hostName() {
        return hostName;
    }

    /**
     * <p>
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * </p>
     * 
     * @return The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     */
    public final String httpRedirectCode() {
        return httpRedirectCode;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #protocol} will
     * return {@link Protocol#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #protocolAsString}.
     * </p>
     * 
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original
     *         request.
     * @see Protocol
     */
    public final Protocol protocol() {
        return Protocol.fromValue(protocol);
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #protocol} will
     * return {@link Protocol#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #protocolAsString}.
     * </p>
     * 
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original
     *         request.
     * @see Protocol
     */
    public final String protocolAsString() {
        return protocol;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix
     * <code>docs/</code> (objects in the <code>docs/</code> folder) to <code>documents/</code>, you can set a condition
     * block with <code>KeyPrefixEquals</code> set to <code>docs/</code> and in the Redirect set
     * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not required if one of the siblings is present. Can
     * be present only if <code>ReplaceKeyWith</code> is not provided.
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
     * @return The object key prefix to use in the redirect request. For example, to redirect requests for all pages
     *         with prefix <code>docs/</code> (objects in the <code>docs/</code> folder) to <code>documents/</code>, you
     *         can set a condition block with <code>KeyPrefixEquals</code> set to <code>docs/</code> and in the Redirect
     *         set <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not required if one of the siblings is
     *         present. Can be present only if <code>ReplaceKeyWith</code> is not provided.</p> <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */
    public final String replaceKeyPrefixWith() {
        return replaceKeyPrefixWith;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request. For example, redirect request to <code>error.html</code>.
     * Not required if one of the siblings is present. Can be present only if <code>ReplaceKeyPrefixWith</code> is not
     * provided.
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
     * @return The specific object key to use in the redirect request. For example, redirect request to
     *         <code>error.html</code>. Not required if one of the siblings is present. Can be present only if
     *         <code>ReplaceKeyPrefixWith</code> is not provided.</p> <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */
    public final String replaceKeyWith() {
        return replaceKeyWith;
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
        hashCode = 31 * hashCode + Objects.hashCode(hostName());
        hashCode = 31 * hashCode + Objects.hashCode(httpRedirectCode());
        hashCode = 31 * hashCode + Objects.hashCode(protocolAsString());
        hashCode = 31 * hashCode + Objects.hashCode(replaceKeyPrefixWith());
        hashCode = 31 * hashCode + Objects.hashCode(replaceKeyWith());
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
        if (!(obj instanceof Redirect)) {
            return false;
        }
        Redirect other = (Redirect) obj;
        return Objects.equals(hostName(), other.hostName()) && Objects.equals(httpRedirectCode(), other.httpRedirectCode())
                && Objects.equals(protocolAsString(), other.protocolAsString())
                && Objects.equals(replaceKeyPrefixWith(), other.replaceKeyPrefixWith())
                && Objects.equals(replaceKeyWith(), other.replaceKeyWith());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Redirect").add("HostName", hostName()).add("HttpRedirectCode", httpRedirectCode())
                .add("Protocol", protocolAsString()).add("ReplaceKeyPrefixWith", replaceKeyPrefixWith())
                .add("ReplaceKeyWith", replaceKeyWith()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "HostName":
            return Optional.ofNullable(clazz.cast(hostName()));
        case "HttpRedirectCode":
            return Optional.ofNullable(clazz.cast(httpRedirectCode()));
        case "Protocol":
            return Optional.ofNullable(clazz.cast(protocolAsString()));
        case "ReplaceKeyPrefixWith":
            return Optional.ofNullable(clazz.cast(replaceKeyPrefixWith()));
        case "ReplaceKeyWith":
            return Optional.ofNullable(clazz.cast(replaceKeyWith()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Redirect, T> g) {
        return obj -> g.apply((Redirect) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Redirect> {
        /**
         * <p>
         * The host name to use in the redirect request.
         * </p>
         * 
         * @param hostName
         *        The host name to use in the redirect request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder hostName(String hostName);

        /**
         * <p>
         * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
         * </p>
         * 
         * @param httpRedirectCode
         *        The HTTP redirect code to use on the response. Not required if one of the siblings is present.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder httpRedirectCode(String httpRedirectCode);

        /**
         * <p>
         * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         * </p>
         * 
         * @param protocol
         *        Protocol to use when redirecting requests. The default is the protocol that is used in the original
         *        request.
         * @see Protocol
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Protocol
         */
        Builder protocol(String protocol);

        /**
         * <p>
         * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         * </p>
         * 
         * @param protocol
         *        Protocol to use when redirecting requests. The default is the protocol that is used in the original
         *        request.
         * @see Protocol
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Protocol
         */
        Builder protocol(Protocol protocol);

        /**
         * <p>
         * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with
         * prefix <code>docs/</code> (objects in the <code>docs/</code> folder) to <code>documents/</code>, you can set
         * a condition block with <code>KeyPrefixEquals</code> set to <code>docs/</code> and in the Redirect set
         * <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not required if one of the siblings is present.
         * Can be present only if <code>ReplaceKeyWith</code> is not provided.
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
         * @param replaceKeyPrefixWith
         *        The object key prefix to use in the redirect request. For example, to redirect requests for all pages
         *        with prefix <code>docs/</code> (objects in the <code>docs/</code> folder) to <code>documents/</code>,
         *        you can set a condition block with <code>KeyPrefixEquals</code> set to <code>docs/</code> and in the
         *        Redirect set <code>ReplaceKeyPrefixWith</code> to <code>/documents</code>. Not required if one of the
         *        siblings is present. Can be present only if <code>ReplaceKeyWith</code> is not provided.</p>
         *        <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replaceKeyPrefixWith(String replaceKeyPrefixWith);

        /**
         * <p>
         * The specific object key to use in the redirect request. For example, redirect request to
         * <code>error.html</code>. Not required if one of the siblings is present. Can be present only if
         * <code>ReplaceKeyPrefixWith</code> is not provided.
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
         * @param replaceKeyWith
         *        The specific object key to use in the redirect request. For example, redirect request to
         *        <code>error.html</code>. Not required if one of the siblings is present. Can be present only if
         *        <code>ReplaceKeyPrefixWith</code> is not provided.</p> <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replaceKeyWith(String replaceKeyWith);
    }

    static final class BuilderImpl implements Builder {
        private String hostName;

        private String httpRedirectCode;

        private String protocol;

        private String replaceKeyPrefixWith;

        private String replaceKeyWith;

        private BuilderImpl() {
        }

        private BuilderImpl(Redirect model) {
            hostName(model.hostName);
            httpRedirectCode(model.httpRedirectCode);
            protocol(model.protocol);
            replaceKeyPrefixWith(model.replaceKeyPrefixWith);
            replaceKeyWith(model.replaceKeyWith);
        }

        public final String getHostName() {
            return hostName;
        }

        public final void setHostName(String hostName) {
            this.hostName = hostName;
        }

        @Override
        public final Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public final String getHttpRedirectCode() {
            return httpRedirectCode;
        }

        public final void setHttpRedirectCode(String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
        }

        @Override
        public final Builder httpRedirectCode(String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }

        public final String getProtocol() {
            return protocol;
        }

        public final void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        @Override
        public final Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        @Override
        public final Builder protocol(Protocol protocol) {
            this.protocol(protocol == null ? null : protocol.toString());
            return this;
        }

        public final String getReplaceKeyPrefixWith() {
            return replaceKeyPrefixWith;
        }

        public final void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        }

        @Override
        public final Builder replaceKeyPrefixWith(String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }

        public final String getReplaceKeyWith() {
            return replaceKeyWith;
        }

        public final void setReplaceKeyWith(String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
        }

        @Override
        public final Builder replaceKeyWith(String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }

        @Override
        public Redirect build() {
            return new Redirect(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
