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
 * Contains the elements that set the ACL permissions for an object per grantee.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AccessControlPolicy implements SdkPojo, Serializable,
        ToCopyableBuilder<AccessControlPolicy.Builder, AccessControlPolicy> {
    private static final SdkField<List<Grant>> GRANTS_FIELD = SdkField
            .<List<Grant>> builder(MarshallingType.LIST)
            .memberName("Grants")
            .getter(getter(AccessControlPolicy::grants))
            .setter(setter(Builder::grants))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessControlList")
                    .unmarshallLocationName("AccessControlList").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Grant")
                            .memberFieldInfo(
                                    SdkField.<Grant> builder(MarshallingType.SDK_POJO)
                                            .constructor(Grant::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Grant").unmarshallLocationName("Grant").build()).build())
                            .build()).build();

    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(AccessControlPolicy::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(GRANTS_FIELD, OWNER_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<Grant> grants;

    private final Owner owner;

    private AccessControlPolicy(BuilderImpl builder) {
        this.grants = builder.grants;
        this.owner = builder.owner;
    }

    /**
     * For responses, this returns true if the service returned a value for the Grants property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasGrants() {
        return grants != null && !(grants instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasGrants} method.
     * </p>
     * 
     * @return A list of grants.
     */
    public final List<Grant> grants() {
        return grants;
    }

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     * 
     * @return Container for the bucket owner's display name and ID.
     */
    public final Owner owner() {
        return owner;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasGrants() ? grants() : null);
        hashCode = 31 * hashCode + Objects.hashCode(owner());
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
        if (!(obj instanceof AccessControlPolicy)) {
            return false;
        }
        AccessControlPolicy other = (AccessControlPolicy) obj;
        return hasGrants() == other.hasGrants() && Objects.equals(grants(), other.grants())
                && Objects.equals(owner(), other.owner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AccessControlPolicy").add("Grants", hasGrants() ? grants() : null).add("Owner", owner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Grants":
            return Optional.ofNullable(clazz.cast(grants()));
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AccessControlPolicy, T> g) {
        return obj -> g.apply((AccessControlPolicy) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AccessControlPolicy> {
        /**
         * <p>
         * A list of grants.
         * </p>
         * 
         * @param grants
         *        A list of grants.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grants(Collection<Grant> grants);

        /**
         * <p>
         * A list of grants.
         * </p>
         * 
         * @param grants
         *        A list of grants.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grants(Grant... grants);

        /**
         * <p>
         * A list of grants.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Grant.Builder} avoiding the need to create one manually via
         * {@link Grant#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Grant.Builder#build()}
         * is called immediately and its result is passed to {@link #grants(List<Grant>)}.
         * 
         * @param grants
         *        a consumer that will call methods on {@link Grant.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #grants(Collection<Grant>)
         */
        Builder grants(Consumer<Grant.Builder>... grants);

        /**
         * <p>
         * Container for the bucket owner's display name and ID.
         * </p>
         * 
         * @param owner
         *        Container for the bucket owner's display name and ID.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * Container for the bucket owner's display name and ID.
         * </p>
         * This is a convenience method that creates an instance of the {@link Owner.Builder} avoiding the need to
         * create one manually via {@link Owner#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Owner.Builder#build()} is called immediately and its result is
         * passed to {@link #owner(Owner)}.
         * 
         * @param owner
         *        a consumer that will call methods on {@link Owner.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #owner(Owner)
         */
        default Builder owner(Consumer<Owner.Builder> owner) {
            return owner(Owner.builder().applyMutation(owner).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private List<Grant> grants = DefaultSdkAutoConstructList.getInstance();

        private Owner owner;

        private BuilderImpl() {
        }

        private BuilderImpl(AccessControlPolicy model) {
            grants(model.grants);
            owner(model.owner);
        }

        public final List<Grant.Builder> getGrants() {
            List<Grant.Builder> result = GrantsCopier.copyToBuilder(this.grants);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setGrants(Collection<Grant.BuilderImpl> grants) {
            this.grants = GrantsCopier.copyFromBuilder(grants);
        }

        @Override
        public final Builder grants(Collection<Grant> grants) {
            this.grants = GrantsCopier.copy(grants);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder grants(Grant... grants) {
            grants(Arrays.asList(grants));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder grants(Consumer<Grant.Builder>... grants) {
            grants(Stream.of(grants).map(c -> Grant.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final Owner.Builder getOwner() {
            return owner != null ? owner.toBuilder() : null;
        }

        public final void setOwner(Owner.BuilderImpl owner) {
            this.owner = owner != null ? owner.build() : null;
        }

        @Override
        public final Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        @Override
        public AccessControlPolicy build() {
            return new AccessControlPolicy(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
