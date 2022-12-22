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
import java.time.Instant;
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
 * In terms of implementation, a Bucket is a resource. An Amazon S3 bucket name is globally unique, and the namespace is
 * shared by all Amazon Web Services accounts.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Bucket implements SdkPojo, Serializable, ToCopyableBuilder<Bucket.Builder, Bucket> {
    private static final SdkField<String> NAME_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Name")
            .getter(getter(Bucket::name))
            .setter(setter(Builder::name))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Name")
                    .unmarshallLocationName("Name").build()).build();

    private static final SdkField<Instant> CREATION_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("CreationDate")
            .getter(getter(Bucket::creationDate))
            .setter(setter(Builder::creationDate))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CreationDate")
                    .unmarshallLocationName("CreationDate").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(NAME_FIELD,
            CREATION_DATE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String name;

    private final Instant creationDate;

    private Bucket(BuilderImpl builder) {
        this.name = builder.name;
        this.creationDate = builder.creationDate;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */
    public final String name() {
        return name;
    }

    /**
     * <p>
     * Date the bucket was created. This date can change when making changes to your bucket, such as editing its bucket
     * policy.
     * </p>
     * 
     * @return Date the bucket was created. This date can change when making changes to your bucket, such as editing its
     *         bucket policy.
     */
    public final Instant creationDate() {
        return creationDate;
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
        hashCode = 31 * hashCode + Objects.hashCode(name());
        hashCode = 31 * hashCode + Objects.hashCode(creationDate());
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
        if (!(obj instanceof Bucket)) {
            return false;
        }
        Bucket other = (Bucket) obj;
        return Objects.equals(name(), other.name()) && Objects.equals(creationDate(), other.creationDate());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Bucket").add("Name", name()).add("CreationDate", creationDate()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Name":
            return Optional.ofNullable(clazz.cast(name()));
        case "CreationDate":
            return Optional.ofNullable(clazz.cast(creationDate()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Bucket, T> g) {
        return obj -> g.apply((Bucket) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Bucket> {
        /**
         * <p>
         * The name of the bucket.
         * </p>
         * 
         * @param name
         *        The name of the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder name(String name);

        /**
         * <p>
         * Date the bucket was created. This date can change when making changes to your bucket, such as editing its
         * bucket policy.
         * </p>
         * 
         * @param creationDate
         *        Date the bucket was created. This date can change when making changes to your bucket, such as editing
         *        its bucket policy.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder creationDate(Instant creationDate);
    }

    static final class BuilderImpl implements Builder {
        private String name;

        private Instant creationDate;

        private BuilderImpl() {
        }

        private BuilderImpl(Bucket model) {
            name(model.name);
            creationDate(model.creationDate);
        }

        public final String getName() {
            return name;
        }

        public final void setName(String name) {
            this.name = name;
        }

        @Override
        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Instant getCreationDate() {
            return creationDate;
        }

        public final void setCreationDate(Instant creationDate) {
            this.creationDate = creationDate;
        }

        @Override
        public final Builder creationDate(Instant creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        @Override
        public Bucket build() {
            return new Bucket(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
