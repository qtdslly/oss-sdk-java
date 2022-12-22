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
public final class ListBucketsResponse extends S3Response implements
        ToCopyableBuilder<ListBucketsResponse.Builder, ListBucketsResponse> {
    private static final SdkField<List<Bucket>> BUCKETS_FIELD = SdkField
            .<List<Bucket>> builder(MarshallingType.LIST)
            .memberName("Buckets")
            .getter(getter(ListBucketsResponse::buckets))
            .setter(setter(Builder::buckets))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Buckets")
                    .unmarshallLocationName("Buckets").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("Bucket")
                            .memberFieldInfo(
                                    SdkField.<Bucket> builder(MarshallingType.SDK_POJO)
                                            .constructor(Bucket::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("Bucket").unmarshallLocationName("Bucket").build()).build())
                            .build()).build();

    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(ListBucketsResponse::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKETS_FIELD, OWNER_FIELD));

    private final List<Bucket> buckets;

    private final Owner owner;

    private ListBucketsResponse(BuilderImpl builder) {
        super(builder);
        this.buckets = builder.buckets;
        this.owner = builder.owner;
    }

    /**
     * For responses, this returns true if the service returned a value for the Buckets property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasBuckets() {
        return buckets != null && !(buckets instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The list of buckets owned by the requester.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasBuckets} method.
     * </p>
     * 
     * @return The list of buckets owned by the requester.
     */
    public final List<Bucket> buckets() {
        return buckets;
    }

    /**
     * <p>
     * The owner of the buckets listed.
     * </p>
     * 
     * @return The owner of the buckets listed.
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(hasBuckets() ? buckets() : null);
        hashCode = 31 * hashCode + Objects.hashCode(owner());
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
        if (!(obj instanceof ListBucketsResponse)) {
            return false;
        }
        ListBucketsResponse other = (ListBucketsResponse) obj;
        return hasBuckets() == other.hasBuckets() && Objects.equals(buckets(), other.buckets())
                && Objects.equals(owner(), other.owner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListBucketsResponse").add("Buckets", hasBuckets() ? buckets() : null).add("Owner", owner())
                .build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Buckets":
            return Optional.ofNullable(clazz.cast(buckets()));
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

    private static <T> Function<Object, T> getter(Function<ListBucketsResponse, T> g) {
        return obj -> g.apply((ListBucketsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, ListBucketsResponse> {
        /**
         * <p>
         * The list of buckets owned by the requester.
         * </p>
         * 
         * @param buckets
         *        The list of buckets owned by the requester.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder buckets(Collection<Bucket> buckets);

        /**
         * <p>
         * The list of buckets owned by the requester.
         * </p>
         * 
         * @param buckets
         *        The list of buckets owned by the requester.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder buckets(Bucket... buckets);

        /**
         * <p>
         * The list of buckets owned by the requester.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Bucket.Builder} avoiding the need to create one manually via
         * {@link Bucket#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Bucket.Builder#build()}
         * is called immediately and its result is passed to {@link #buckets(List<Bucket>)}.
         * 
         * @param buckets
         *        a consumer that will call methods on {@link Bucket.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #buckets(Collection<Bucket>)
         */
        Builder buckets(Consumer<Bucket.Builder>... buckets);

        /**
         * <p>
         * The owner of the buckets listed.
         * </p>
         * 
         * @param owner
         *        The owner of the buckets listed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * The owner of the buckets listed.
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

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private List<Bucket> buckets = DefaultSdkAutoConstructList.getInstance();

        private Owner owner;

        private BuilderImpl() {
        }

        private BuilderImpl(ListBucketsResponse model) {
            super(model);
            buckets(model.buckets);
            owner(model.owner);
        }

        public final List<Bucket.Builder> getBuckets() {
            List<Bucket.Builder> result = BucketsCopier.copyToBuilder(this.buckets);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setBuckets(Collection<Bucket.BuilderImpl> buckets) {
            this.buckets = BucketsCopier.copyFromBuilder(buckets);
        }

        @Override
        public final Builder buckets(Collection<Bucket> buckets) {
            this.buckets = BucketsCopier.copy(buckets);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder buckets(Bucket... buckets) {
            buckets(Arrays.asList(buckets));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder buckets(Consumer<Bucket.Builder>... buckets) {
            buckets(Stream.of(buckets).map(c -> Bucket.builder().applyMutation(c).build()).collect(Collectors.toList()));
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
        public ListBucketsResponse build() {
            return new ListBucketsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
