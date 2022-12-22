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
import software.amazon.awssdk.core.traits.XmlAttributeTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Container for the person being granted permissions.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Grantee implements SdkPojo, Serializable, ToCopyableBuilder<Grantee.Builder, Grantee> {
    private static final SdkField<String> DISPLAY_NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("DisplayName")
            .getter(getter(Grantee::displayName))
            .setter(setter(Builder::displayName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DisplayName")
                    .unmarshallLocationName("DisplayName").build()).build();

    private static final SdkField<String> EMAIL_ADDRESS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("EmailAddress")
            .getter(getter(Grantee::emailAddress))
            .setter(setter(Builder::emailAddress))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EmailAddress")
                    .unmarshallLocationName("EmailAddress").build()).build();

    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ID")
            .getter(getter(Grantee::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ID").unmarshallLocationName("ID")
                    .build()).build();

    private static final SdkField<String> TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Type")
            .getter(getter(Grantee::typeAsString))
            .setter(setter(Builder::type))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("xsi:type")
                    .unmarshallLocationName("xsi:type").build(), XmlAttributeTrait.create()).build();

    private static final SdkField<String> URI_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("URI")
            .getter(getter(Grantee::uri))
            .setter(setter(Builder::uri))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("URI").unmarshallLocationName("URI")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DISPLAY_NAME_FIELD,
            EMAIL_ADDRESS_FIELD, ID_FIELD, TYPE_FIELD, URI_FIELD));

    private static final long serialVersionUID = 1L;

    private final String displayName;

    private final String emailAddress;

    private final String id;

    private final String type;

    private final String uri;

    private Grantee(BuilderImpl builder) {
        this.displayName = builder.displayName;
        this.emailAddress = builder.emailAddress;
        this.id = builder.id;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     * 
     * @return Screen name of the grantee.
     */
    public final String displayName() {
        return displayName;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note>
     * 
     * @return Email address of the grantee.</p> <note>
     *         <p>
     *         Using email addresses to specify a grantee is only supported in the following Amazon Web Services
     *         Regions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (N. California)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Singapore)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Tokyo)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Ireland)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         South America (São Paulo)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of all the Amazon S3 supported Regions and endpoints, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in
     *         the Amazon Web Services General Reference.
     *         </p>
     */
    public final String emailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     * 
     * @return The canonical user ID of the grantee.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link Type#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return Type of grantee
     * @see Type
     */
    public final Type type() {
        return Type.fromValue(type);
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link Type#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return Type of grantee
     * @see Type
     */
    public final String typeAsString() {
        return type;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     * 
     * @return URI of the grantee group.
     */
    public final String uri() {
        return uri;
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
        hashCode = 31 * hashCode + Objects.hashCode(displayName());
        hashCode = 31 * hashCode + Objects.hashCode(emailAddress());
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(typeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(uri());
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
        if (!(obj instanceof Grantee)) {
            return false;
        }
        Grantee other = (Grantee) obj;
        return Objects.equals(displayName(), other.displayName()) && Objects.equals(emailAddress(), other.emailAddress())
                && Objects.equals(id(), other.id()) && Objects.equals(typeAsString(), other.typeAsString())
                && Objects.equals(uri(), other.uri());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Grantee").add("DisplayName", displayName()).add("EmailAddress", emailAddress()).add("ID", id())
                .add("Type", typeAsString()).add("URI", uri()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DisplayName":
            return Optional.ofNullable(clazz.cast(displayName()));
        case "EmailAddress":
            return Optional.ofNullable(clazz.cast(emailAddress()));
        case "ID":
            return Optional.ofNullable(clazz.cast(id()));
        case "Type":
            return Optional.ofNullable(clazz.cast(typeAsString()));
        case "URI":
            return Optional.ofNullable(clazz.cast(uri()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Grantee, T> g) {
        return obj -> g.apply((Grantee) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Grantee> {
        /**
         * <p>
         * Screen name of the grantee.
         * </p>
         * 
         * @param displayName
         *        Screen name of the grantee.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder displayName(String displayName);

        /**
         * <p>
         * Email address of the grantee.
         * </p>
         * <note>
         * <p>
         * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
         * </p>
         * <ul>
         * <li>
         * <p>
         * US East (N. Virginia)
         * </p>
         * </li>
         * <li>
         * <p>
         * US West (N. California)
         * </p>
         * </li>
         * <li>
         * <p>
         * US West (Oregon)
         * </p>
         * </li>
         * <li>
         * <p>
         * Asia Pacific (Singapore)
         * </p>
         * </li>
         * <li>
         * <p>
         * Asia Pacific (Sydney)
         * </p>
         * </li>
         * <li>
         * <p>
         * Asia Pacific (Tokyo)
         * </p>
         * </li>
         * <li>
         * <p>
         * Europe (Ireland)
         * </p>
         * </li>
         * <li>
         * <p>
         * South America (São Paulo)
         * </p>
         * </li>
         * </ul>
         * <p>
         * For a list of all the Amazon S3 supported Regions and endpoints, see <a
         * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the
         * Amazon Web Services General Reference.
         * </p>
         * </note>
         * 
         * @param emailAddress
         *        Email address of the grantee.</p> <note>
         *        <p>
         *        Using email addresses to specify a grantee is only supported in the following Amazon Web Services
         *        Regions:
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        US East (N. Virginia)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        US West (N. California)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        US West (Oregon)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        Asia Pacific (Singapore)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        Asia Pacific (Sydney)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        Asia Pacific (Tokyo)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        Europe (Ireland)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        South America (São Paulo)
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        For a list of all the Amazon S3 supported Regions and endpoints, see <a
         *        href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in
         *        the Amazon Web Services General Reference.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder emailAddress(String emailAddress);

        /**
         * <p>
         * The canonical user ID of the grantee.
         * </p>
         * 
         * @param id
         *        The canonical user ID of the grantee.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Type of grantee
         * </p>
         * 
         * @param type
         *        Type of grantee
         * @see Type
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Type
         */
        Builder type(String type);

        /**
         * <p>
         * Type of grantee
         * </p>
         * 
         * @param type
         *        Type of grantee
         * @see Type
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Type
         */
        Builder type(Type type);

        /**
         * <p>
         * URI of the grantee group.
         * </p>
         * 
         * @param uri
         *        URI of the grantee group.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uri(String uri);
    }

    static final class BuilderImpl implements Builder {
        private String displayName;

        private String emailAddress;

        private String id;

        private String type;

        private String uri;

        private BuilderImpl() {
        }

        private BuilderImpl(Grantee model) {
            displayName(model.displayName);
            emailAddress(model.emailAddress);
            id(model.id);
            type(model.type);
            uri(model.uri);
        }

        public final String getDisplayName() {
            return displayName;
        }

        public final void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public final Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public final String getEmailAddress() {
            return emailAddress;
        }

        public final void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        @Override
        public final Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
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

        public final String getType() {
            return type;
        }

        public final void setType(String type) {
            this.type = type;
        }

        @Override
        public final Builder type(String type) {
            this.type = type;
            return this;
        }

        @Override
        public final Builder type(Type type) {
            this.type(type == null ? null : type.toString());
            return this;
        }

        public final String getUri() {
            return uri;
        }

        public final void setUri(String uri) {
            this.uri = uri;
        }

        @Override
        public final Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        @Override
        public Grantee build() {
            return new Grantee(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
