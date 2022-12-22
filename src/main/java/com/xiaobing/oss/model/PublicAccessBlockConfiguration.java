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
 * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration
 * options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class PublicAccessBlockConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<PublicAccessBlockConfiguration.Builder, PublicAccessBlockConfiguration> {
    private static final SdkField<Boolean> BLOCK_PUBLIC_ACLS_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BlockPublicAcls")
            .getter(getter(PublicAccessBlockConfiguration::blockPublicAcls))
            .setter(setter(Builder::blockPublicAcls))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BlockPublicAcls")
                    .unmarshallLocationName("BlockPublicAcls").build()).build();

    private static final SdkField<Boolean> IGNORE_PUBLIC_ACLS_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IgnorePublicAcls")
            .getter(getter(PublicAccessBlockConfiguration::ignorePublicAcls))
            .setter(setter(Builder::ignorePublicAcls))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IgnorePublicAcls")
                    .unmarshallLocationName("IgnorePublicAcls").build()).build();

    private static final SdkField<Boolean> BLOCK_PUBLIC_POLICY_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BlockPublicPolicy")
            .getter(getter(PublicAccessBlockConfiguration::blockPublicPolicy))
            .setter(setter(Builder::blockPublicPolicy))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BlockPublicPolicy")
                    .unmarshallLocationName("BlockPublicPolicy").build()).build();

    private static final SdkField<Boolean> RESTRICT_PUBLIC_BUCKETS_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("RestrictPublicBuckets")
            .getter(getter(PublicAccessBlockConfiguration::restrictPublicBuckets))
            .setter(setter(Builder::restrictPublicBuckets))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RestrictPublicBuckets")
                    .unmarshallLocationName("RestrictPublicBuckets").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BLOCK_PUBLIC_ACLS_FIELD,
            IGNORE_PUBLIC_ACLS_FIELD, BLOCK_PUBLIC_POLICY_FIELD, RESTRICT_PUBLIC_BUCKETS_FIELD));

    private static final long serialVersionUID = 1L;

    private final Boolean blockPublicAcls;

    private final Boolean ignorePublicAcls;

    private final Boolean blockPublicPolicy;

    private final Boolean restrictPublicBuckets;

    private PublicAccessBlockConfiguration(BuilderImpl builder) {
        this.blockPublicAcls = builder.blockPublicAcls;
        this.ignorePublicAcls = builder.ignorePublicAcls;
        this.blockPublicPolicy = builder.blockPublicPolicy;
        this.restrictPublicBuckets = builder.restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this
     * bucket. Setting this element to <code>TRUE</code> causes the following behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Object calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * PUT Bucket calls fail if the request includes a public ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Enabling this setting doesn't affect existing policies or ACLs.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects
     *         in this bucket. Setting this element to <code>TRUE</code> causes the following behavior:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Object calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PUT Bucket calls fail if the request includes a public ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Enabling this setting doesn't affect existing policies or ACLs.
     */
    public final Boolean blockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this
     * element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects in this
     * bucket.
     * </p>
     * <p>
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
     * from being set.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting
     *         this element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects
     *         in this bucket.</p>
     *         <p>
     *         Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public
     *         ACLs from being set.
     */
    public final Boolean ignorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
     * public access.
     * </p>
     * <p>
     * Enabling this setting doesn't affect existing bucket policies.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
     *         <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy
     *         allows public access. </p>
     *         <p>
     *         Enabling this setting doesn't affect existing bucket policies.
     */
    public final Boolean blockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to
     * <code>TRUE</code> restricts access to this bucket to only Amazon Web Service principals and authorized users
     * within this account if the bucket has a public policy.
     * </p>
     * <p>
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
     * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element
     *         to <code>TRUE</code> restricts access to this bucket to only Amazon Web Service principals and authorized
     *         users within this account if the bucket has a public policy.</p>
     *         <p>
     *         Enabling this setting doesn't affect previously stored bucket policies, except that public and
     *         cross-account access within any public bucket policy, including non-public delegation to specific
     *         accounts, is blocked.
     */
    public final Boolean restrictPublicBuckets() {
        return restrictPublicBuckets;
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
        hashCode = 31 * hashCode + Objects.hashCode(blockPublicAcls());
        hashCode = 31 * hashCode + Objects.hashCode(ignorePublicAcls());
        hashCode = 31 * hashCode + Objects.hashCode(blockPublicPolicy());
        hashCode = 31 * hashCode + Objects.hashCode(restrictPublicBuckets());
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
        if (!(obj instanceof PublicAccessBlockConfiguration)) {
            return false;
        }
        PublicAccessBlockConfiguration other = (PublicAccessBlockConfiguration) obj;
        return Objects.equals(blockPublicAcls(), other.blockPublicAcls())
                && Objects.equals(ignorePublicAcls(), other.ignorePublicAcls())
                && Objects.equals(blockPublicPolicy(), other.blockPublicPolicy())
                && Objects.equals(restrictPublicBuckets(), other.restrictPublicBuckets());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PublicAccessBlockConfiguration").add("BlockPublicAcls", blockPublicAcls())
                .add("IgnorePublicAcls", ignorePublicAcls()).add("BlockPublicPolicy", blockPublicPolicy())
                .add("RestrictPublicBuckets", restrictPublicBuckets()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "BlockPublicAcls":
            return Optional.ofNullable(clazz.cast(blockPublicAcls()));
        case "IgnorePublicAcls":
            return Optional.ofNullable(clazz.cast(ignorePublicAcls()));
        case "BlockPublicPolicy":
            return Optional.ofNullable(clazz.cast(blockPublicPolicy()));
        case "RestrictPublicBuckets":
            return Optional.ofNullable(clazz.cast(restrictPublicBuckets()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PublicAccessBlockConfiguration, T> g) {
        return obj -> g.apply((PublicAccessBlockConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, PublicAccessBlockConfiguration> {
        /**
         * <p>
         * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in
         * this bucket. Setting this element to <code>TRUE</code> causes the following behavior:
         * </p>
         * <ul>
         * <li>
         * <p>
         * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
         * </p>
         * </li>
         * <li>
         * <p>
         * PUT Object calls fail if the request includes a public ACL.
         * </p>
         * </li>
         * <li>
         * <p>
         * PUT Bucket calls fail if the request includes a public ACL.
         * </p>
         * </li>
         * </ul>
         * <p>
         * Enabling this setting doesn't affect existing policies or ACLs.
         * </p>
         * 
         * @param blockPublicAcls
         *        Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and
         *        objects in this bucket. Setting this element to <code>TRUE</code> causes the following behavior:</p>
         *        <ul>
         *        <li>
         *        <p>
         *        PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        PUT Object calls fail if the request includes a public ACL.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        PUT Bucket calls fail if the request includes a public ACL.
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        Enabling this setting doesn't affect existing policies or ACLs.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder blockPublicAcls(Boolean blockPublicAcls);

        /**
         * <p>
         * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting
         * this element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket and objects in
         * this bucket.
         * </p>
         * <p>
         * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs
         * from being set.
         * </p>
         * 
         * @param ignorePublicAcls
         *        Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
         *        Setting this element to <code>TRUE</code> causes Amazon S3 to ignore all public ACLs on this bucket
         *        and objects in this bucket.</p>
         *        <p>
         *        Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new
         *        public ACLs from being set.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder ignorePublicAcls(Boolean ignorePublicAcls);

        /**
         * <p>
         * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to
         * <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows
         * public access.
         * </p>
         * <p>
         * Enabling this setting doesn't affect existing bucket policies.
         * </p>
         * 
         * @param blockPublicPolicy
         *        Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element
         *        to <code>TRUE</code> causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket
         *        policy allows public access. </p>
         *        <p>
         *        Enabling this setting doesn't affect existing bucket policies.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder blockPublicPolicy(Boolean blockPublicPolicy);

        /**
         * <p>
         * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to
         * <code>TRUE</code> restricts access to this bucket to only Amazon Web Service principals and authorized users
         * within this account if the bucket has a public policy.
         * </p>
         * <p>
         * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account
         * access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
         * </p>
         * 
         * @param restrictPublicBuckets
         *        Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this
         *        element to <code>TRUE</code> restricts access to this bucket to only Amazon Web Service principals and
         *        authorized users within this account if the bucket has a public policy.</p>
         *        <p>
         *        Enabling this setting doesn't affect previously stored bucket policies, except that public and
         *        cross-account access within any public bucket policy, including non-public delegation to specific
         *        accounts, is blocked.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder restrictPublicBuckets(Boolean restrictPublicBuckets);
    }

    static final class BuilderImpl implements Builder {
        private Boolean blockPublicAcls;

        private Boolean ignorePublicAcls;

        private Boolean blockPublicPolicy;

        private Boolean restrictPublicBuckets;

        private BuilderImpl() {
        }

        private BuilderImpl(PublicAccessBlockConfiguration model) {
            blockPublicAcls(model.blockPublicAcls);
            ignorePublicAcls(model.ignorePublicAcls);
            blockPublicPolicy(model.blockPublicPolicy);
            restrictPublicBuckets(model.restrictPublicBuckets);
        }

        public final Boolean getBlockPublicAcls() {
            return blockPublicAcls;
        }

        public final void setBlockPublicAcls(Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
        }

        @Override
        public final Builder blockPublicAcls(Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public final Boolean getIgnorePublicAcls() {
            return ignorePublicAcls;
        }

        public final void setIgnorePublicAcls(Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
        }

        @Override
        public final Builder ignorePublicAcls(Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public final Boolean getBlockPublicPolicy() {
            return blockPublicPolicy;
        }

        public final void setBlockPublicPolicy(Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
        }

        @Override
        public final Builder blockPublicPolicy(Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public final Boolean getRestrictPublicBuckets() {
            return restrictPublicBuckets;
        }

        public final void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
        }

        @Override
        public final Builder restrictPublicBuckets(Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        @Override
        public PublicAccessBlockConfiguration build() {
            return new PublicAccessBlockConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
