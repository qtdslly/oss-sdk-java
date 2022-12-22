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
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.XmlAttributesTrait;
import software.amazon.awssdk.utils.Pair;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Container for granting information.
 * </p>
 * <p>
 * Buckets that use the bucket owner enforced setting for Object Ownership don't support target grants. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/enable-server-access-logging.html#grant-log-delivery-permissions-general"
 * >Permissions server access log delivery</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class TargetGrant implements SdkPojo, Serializable, ToCopyableBuilder<TargetGrant.Builder, TargetGrant> {
    private static final SdkField<Grantee> GRANTEE_FIELD = SdkField
            .<Grantee> builder(MarshallingType.SDK_POJO)
            .memberName("Grantee")
            .getter(getter(TargetGrant::grantee))
            .setter(setter(Builder::grantee))
            .constructor(Grantee::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Grantee")
                    .unmarshallLocationName("Grantee").build(),
                    XmlAttributesTrait.create(
                            Pair.of("xmlns:xsi",
                                    XmlAttributesTrait.AttributeAccessors.builder()
                                            .attributeGetter((ignore) -> "http://www.w3.org/2001/XMLSchema-instance").build()),
                            Pair.of("xsi:type",
                                    XmlAttributesTrait.AttributeAccessors.builder()
                                            .attributeGetter(t -> ((Grantee) t).typeAsString()).build()))).build();

    private static final SdkField<String> PERMISSION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Permission")
            .getter(getter(TargetGrant::permissionAsString))
            .setter(setter(Builder::permission))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Permission")
                    .unmarshallLocationName("Permission").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(GRANTEE_FIELD,
            PERMISSION_FIELD));

    private static final long serialVersionUID = 1L;

    private final Grantee grantee;

    private final String permission;

    private TargetGrant(BuilderImpl builder) {
        this.grantee = builder.grantee;
        this.permission = builder.permission;
    }

    /**
     * <p>
     * Container for the person being granted permissions.
     * </p>
     * 
     * @return Container for the person being granted permissions.
     */
    public final Grantee grantee() {
        return grantee;
    }

    /**
     * <p>
     * Logging permissions assigned to the grantee for the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #permission} will
     * return {@link BucketLogsPermission#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #permissionAsString}.
     * </p>
     * 
     * @return Logging permissions assigned to the grantee for the bucket.
     * @see BucketLogsPermission
     */
    public final BucketLogsPermission permission() {
        return BucketLogsPermission.fromValue(permission);
    }

    /**
     * <p>
     * Logging permissions assigned to the grantee for the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #permission} will
     * return {@link BucketLogsPermission#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #permissionAsString}.
     * </p>
     * 
     * @return Logging permissions assigned to the grantee for the bucket.
     * @see BucketLogsPermission
     */
    public final String permissionAsString() {
        return permission;
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
        hashCode = 31 * hashCode + Objects.hashCode(grantee());
        hashCode = 31 * hashCode + Objects.hashCode(permissionAsString());
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
        if (!(obj instanceof TargetGrant)) {
            return false;
        }
        TargetGrant other = (TargetGrant) obj;
        return Objects.equals(grantee(), other.grantee()) && Objects.equals(permissionAsString(), other.permissionAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("TargetGrant").add("Grantee", grantee()).add("Permission", permissionAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Grantee":
            return Optional.ofNullable(clazz.cast(grantee()));
        case "Permission":
            return Optional.ofNullable(clazz.cast(permissionAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<TargetGrant, T> g) {
        return obj -> g.apply((TargetGrant) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, TargetGrant> {
        /**
         * <p>
         * Container for the person being granted permissions.
         * </p>
         * 
         * @param grantee
         *        Container for the person being granted permissions.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantee(Grantee grantee);

        /**
         * <p>
         * Container for the person being granted permissions.
         * </p>
         * This is a convenience method that creates an instance of the {@link Grantee.Builder} avoiding the need to
         * create one manually via {@link Grantee#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Grantee.Builder#build()} is called immediately and its result is
         * passed to {@link #grantee(Grantee)}.
         * 
         * @param grantee
         *        a consumer that will call methods on {@link Grantee.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #grantee(Grantee)
         */
        default Builder grantee(Consumer<Grantee.Builder> grantee) {
            return grantee(Grantee.builder().applyMutation(grantee).build());
        }

        /**
         * <p>
         * Logging permissions assigned to the grantee for the bucket.
         * </p>
         * 
         * @param permission
         *        Logging permissions assigned to the grantee for the bucket.
         * @see BucketLogsPermission
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLogsPermission
         */
        Builder permission(String permission);

        /**
         * <p>
         * Logging permissions assigned to the grantee for the bucket.
         * </p>
         * 
         * @param permission
         *        Logging permissions assigned to the grantee for the bucket.
         * @see BucketLogsPermission
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketLogsPermission
         */
        Builder permission(BucketLogsPermission permission);
    }

    static final class BuilderImpl implements Builder {
        private Grantee grantee;

        private String permission;

        private BuilderImpl() {
        }

        private BuilderImpl(TargetGrant model) {
            grantee(model.grantee);
            permission(model.permission);
        }

        public final Grantee.Builder getGrantee() {
            return grantee != null ? grantee.toBuilder() : null;
        }

        public final void setGrantee(Grantee.BuilderImpl grantee) {
            this.grantee = grantee != null ? grantee.build() : null;
        }

        @Override
        public final Builder grantee(Grantee grantee) {
            this.grantee = grantee;
            return this;
        }

        public final String getPermission() {
            return permission;
        }

        public final void setPermission(String permission) {
            this.permission = permission;
        }

        @Override
        public final Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        @Override
        public final Builder permission(BucketLogsPermission permission) {
            this.permission(permission == null ? null : permission.toString());
            return this;
        }

        @Override
        public TargetGrant build() {
            return new TargetGrant(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
