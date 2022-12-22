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
 * Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent
 * object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended)
 * to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class NoncurrentVersionExpiration implements SdkPojo, Serializable,
        ToCopyableBuilder<NoncurrentVersionExpiration.Builder, NoncurrentVersionExpiration> {
    private static final SdkField<Integer> NONCURRENT_DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("NoncurrentDays")
            .getter(getter(NoncurrentVersionExpiration::noncurrentDays))
            .setter(setter(Builder::noncurrentDays))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NoncurrentDays")
                    .unmarshallLocationName("NoncurrentDays").build()).build();

    private static final SdkField<Integer> NEWER_NONCURRENT_VERSIONS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("NewerNoncurrentVersions")
            .getter(getter(NoncurrentVersionExpiration::newerNoncurrentVersions))
            .setter(setter(Builder::newerNoncurrentVersions))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NewerNoncurrentVersions")
                    .unmarshallLocationName("NewerNoncurrentVersions").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(NONCURRENT_DAYS_FIELD,
            NEWER_NONCURRENT_VERSIONS_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer noncurrentDays;

    private final Integer newerNoncurrentVersions;

    private NoncurrentVersionExpiration(BuilderImpl builder) {
        this.noncurrentDays = builder.noncurrentDays;
        this.newerNoncurrentVersions = builder.newerNoncurrentVersions;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. The
     * value must be a non-zero positive integer. For information about the noncurrent days calculations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action.
     *         The value must be a non-zero positive integer. For information about the noncurrent days calculations,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *         >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final Integer noncurrentDays() {
        return noncurrentDays;
    }

    /**
     * <p>
     * Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent noncurrent
     * versions, Amazon S3 will take the associated action. For more information about noncurrent versions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle configuration
     * elements</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent
     *         noncurrent versions, Amazon S3 will take the associated action. For more information about noncurrent
     *         versions, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle
     *         configuration elements</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final Integer newerNoncurrentVersions() {
        return newerNoncurrentVersions;
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
        hashCode = 31 * hashCode + Objects.hashCode(noncurrentDays());
        hashCode = 31 * hashCode + Objects.hashCode(newerNoncurrentVersions());
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
        if (!(obj instanceof NoncurrentVersionExpiration)) {
            return false;
        }
        NoncurrentVersionExpiration other = (NoncurrentVersionExpiration) obj;
        return Objects.equals(noncurrentDays(), other.noncurrentDays())
                && Objects.equals(newerNoncurrentVersions(), other.newerNoncurrentVersions());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("NoncurrentVersionExpiration").add("NoncurrentDays", noncurrentDays())
                .add("NewerNoncurrentVersions", newerNoncurrentVersions()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "NoncurrentDays":
            return Optional.ofNullable(clazz.cast(noncurrentDays()));
        case "NewerNoncurrentVersions":
            return Optional.ofNullable(clazz.cast(newerNoncurrentVersions()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<NoncurrentVersionExpiration, T> g) {
        return obj -> g.apply((NoncurrentVersionExpiration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, NoncurrentVersionExpiration> {
        /**
         * <p>
         * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. The
         * value must be a non-zero positive integer. For information about the noncurrent days calculations, see <a
         * href
         * ="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
         * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param noncurrentDays
         *        Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated
         *        action. The value must be a non-zero positive integer. For information about the noncurrent days
         *        calculations, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
         *        >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder noncurrentDays(Integer noncurrentDays);

        /**
         * <p>
         * Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent noncurrent
         * versions, Amazon S3 will take the associated action. For more information about noncurrent versions, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle
         * configuration elements</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param newerNoncurrentVersions
         *        Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent
         *        noncurrent versions, Amazon S3 will take the associated action. For more information about noncurrent
         *        versions, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle
         *        configuration elements</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder newerNoncurrentVersions(Integer newerNoncurrentVersions);
    }

    static final class BuilderImpl implements Builder {
        private Integer noncurrentDays;

        private Integer newerNoncurrentVersions;

        private BuilderImpl() {
        }

        private BuilderImpl(NoncurrentVersionExpiration model) {
            noncurrentDays(model.noncurrentDays);
            newerNoncurrentVersions(model.newerNoncurrentVersions);
        }

        public final Integer getNoncurrentDays() {
            return noncurrentDays;
        }

        public final void setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
        }

        @Override
        public final Builder noncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }

        public final Integer getNewerNoncurrentVersions() {
            return newerNoncurrentVersions;
        }

        public final void setNewerNoncurrentVersions(Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
        }

        @Override
        public final Builder newerNoncurrentVersions(Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }

        @Override
        public NoncurrentVersionExpiration build() {
            return new NoncurrentVersionExpiration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
