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
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class RedirectAllRequestsTo implements SdkPojo, Serializable,
        ToCopyableBuilder<RedirectAllRequestsTo.Builder, RedirectAllRequestsTo> {
    private static final SdkField<String> HOST_NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("HostName")
            .getter(getter(RedirectAllRequestsTo::hostName))
            .setter(setter(Builder::hostName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("HostName")
                    .unmarshallLocationName("HostName").build()).build();

    private static final SdkField<String> PROTOCOL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Protocol")
            .getter(getter(RedirectAllRequestsTo::protocolAsString))
            .setter(setter(Builder::protocol))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Protocol")
                    .unmarshallLocationName("Protocol").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(HOST_NAME_FIELD,
            PROTOCOL_FIELD));

    private static final long serialVersionUID = 1L;

    private final String hostName;

    private final String protocol;

    private RedirectAllRequestsTo(BuilderImpl builder) {
        this.hostName = builder.hostName;
        this.protocol = builder.protocol;
    }

    /**
     * <p>
     * Name of the host where requests are redirected.
     * </p>
     * 
     * @return Name of the host where requests are redirected.
     */
    public final String hostName() {
        return hostName;
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
        hashCode = 31 * hashCode + Objects.hashCode(protocolAsString());
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
        if (!(obj instanceof RedirectAllRequestsTo)) {
            return false;
        }
        RedirectAllRequestsTo other = (RedirectAllRequestsTo) obj;
        return Objects.equals(hostName(), other.hostName()) && Objects.equals(protocolAsString(), other.protocolAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("RedirectAllRequestsTo").add("HostName", hostName()).add("Protocol", protocolAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "HostName":
            return Optional.ofNullable(clazz.cast(hostName()));
        case "Protocol":
            return Optional.ofNullable(clazz.cast(protocolAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<RedirectAllRequestsTo, T> g) {
        return obj -> g.apply((RedirectAllRequestsTo) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, RedirectAllRequestsTo> {
        /**
         * <p>
         * Name of the host where requests are redirected.
         * </p>
         * 
         * @param hostName
         *        Name of the host where requests are redirected.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder hostName(String hostName);

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
    }

    static final class BuilderImpl implements Builder {
        private String hostName;

        private String protocol;

        private BuilderImpl() {
        }

        private BuilderImpl(RedirectAllRequestsTo model) {
            hostName(model.hostName);
            protocol(model.protocol);
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

        @Override
        public RedirectAllRequestsTo build() {
            return new RedirectAllRequestsTo(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
