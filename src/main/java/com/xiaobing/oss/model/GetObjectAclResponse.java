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
public final class GetObjectAclResponse extends S3Response implements
        ToCopyableBuilder<GetObjectAclResponse.Builder, GetObjectAclResponse> {
    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(GetObjectAclResponse::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final SdkField<List<Grant>> GRANTS_FIELD = SdkField
            .<List<Grant>> builder(MarshallingType.LIST)
            .memberName("Grants")
            .getter(getter(GetObjectAclResponse::grants))
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

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(GetObjectAclResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OWNER_FIELD, GRANTS_FIELD,
            REQUEST_CHARGED_FIELD));

    private final Owner owner;

    private final List<Grant> grants;

    private final String requestCharged;

    private GetObjectAclResponse(BuilderImpl builder) {
        super(builder);
        this.owner = builder.owner;
        this.grants = builder.grants;
        this.requestCharged = builder.requestCharged;
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
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final RequestCharged requestCharged() {
        return RequestCharged.fromValue(requestCharged);
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final String requestChargedAsString() {
        return requestCharged;
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
        hashCode = 31 * hashCode + Objects.hashCode(owner());
        hashCode = 31 * hashCode + Objects.hashCode(hasGrants() ? grants() : null);
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
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
        if (!(obj instanceof GetObjectAclResponse)) {
            return false;
        }
        GetObjectAclResponse other = (GetObjectAclResponse) obj;
        return Objects.equals(owner(), other.owner()) && hasGrants() == other.hasGrants()
                && Objects.equals(grants(), other.grants())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectAclResponse").add("Owner", owner()).add("Grants", hasGrants() ? grants() : null)
                .add("RequestCharged", requestChargedAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        case "Grants":
            return Optional.ofNullable(clazz.cast(grants()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectAclResponse, T> g) {
        return obj -> g.apply((GetObjectAclResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, GetObjectAclResponse> {
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
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(String requestCharged);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(RequestCharged requestCharged);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Owner owner;

        private List<Grant> grants = DefaultSdkAutoConstructList.getInstance();

        private String requestCharged;

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectAclResponse model) {
            super(model);
            owner(model.owner);
            grants(model.grants);
            requestCharged(model.requestCharged);
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

        public final String getRequestCharged() {
            return requestCharged;
        }

        public final void setRequestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
        }

        @Override
        public final Builder requestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
            return this;
        }

        @Override
        public final Builder requestCharged(RequestCharged requestCharged) {
            this.requestCharged(requestCharged == null ? null : requestCharged.toString());
            return this;
        }

        @Override
        public GetObjectAclResponse build() {
            return new GetObjectAclResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
