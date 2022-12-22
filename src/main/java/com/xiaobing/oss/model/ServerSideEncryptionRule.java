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
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Specifies the default server-side encryption configuration.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ServerSideEncryptionRule implements SdkPojo, Serializable,
        ToCopyableBuilder<ServerSideEncryptionRule.Builder, ServerSideEncryptionRule> {
    private static final SdkField<ServerSideEncryptionByDefault> APPLY_SERVER_SIDE_ENCRYPTION_BY_DEFAULT_FIELD = SdkField
            .<ServerSideEncryptionByDefault> builder(MarshallingType.SDK_POJO)
            .memberName("ApplyServerSideEncryptionByDefault")
            .getter(getter(ServerSideEncryptionRule::applyServerSideEncryptionByDefault))
            .setter(setter(Builder::applyServerSideEncryptionByDefault))
            .constructor(ServerSideEncryptionByDefault::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ApplyServerSideEncryptionByDefault")
                    .unmarshallLocationName("ApplyServerSideEncryptionByDefault").build()).build();

    private static final SdkField<Boolean> BUCKET_KEY_ENABLED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("BucketKeyEnabled")
            .getter(getter(ServerSideEncryptionRule::bucketKeyEnabled))
            .setter(setter(Builder::bucketKeyEnabled))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BucketKeyEnabled")
                    .unmarshallLocationName("BucketKeyEnabled").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(
            APPLY_SERVER_SIDE_ENCRYPTION_BY_DEFAULT_FIELD, BUCKET_KEY_ENABLED_FIELD));

    private static final long serialVersionUID = 1L;

    private final ServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    private final Boolean bucketKeyEnabled;

    private ServerSideEncryptionRule(BuilderImpl builder) {
        this.applyServerSideEncryptionByDefault = builder.applyServerSideEncryptionByDefault;
        this.bucketKeyEnabled = builder.bucketKeyEnabled;
    }

    /**
     * <p>
     * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request
     * doesn't specify any server-side encryption, this default encryption will be applied.
     * </p>
     * 
     * @return Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object
     *         request doesn't specify any server-side encryption, this default encryption will be applied.
     */
    public final ServerSideEncryptionByDefault applyServerSideEncryptionByDefault() {
        return applyServerSideEncryptionByDefault;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for new
     * objects in the bucket. Existing objects are not affected. Setting the <code>BucketKeyEnabled</code> element to
     * <code>true</code> causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3
     * Bucket Keys</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS)
     *         for new objects in the bucket. Existing objects are not affected. Setting the
     *         <code>BucketKeyEnabled</code> element to <code>true</code> causes Amazon S3 to use an S3 Bucket Key. By
     *         default, S3 Bucket Key is not enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the
     *         <i>Amazon S3 User Guide</i>.
     */
    public final Boolean bucketKeyEnabled() {
        return bucketKeyEnabled;
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
        hashCode = 31 * hashCode + Objects.hashCode(applyServerSideEncryptionByDefault());
        hashCode = 31 * hashCode + Objects.hashCode(bucketKeyEnabled());
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
        if (!(obj instanceof ServerSideEncryptionRule)) {
            return false;
        }
        ServerSideEncryptionRule other = (ServerSideEncryptionRule) obj;
        return Objects.equals(applyServerSideEncryptionByDefault(), other.applyServerSideEncryptionByDefault())
                && Objects.equals(bucketKeyEnabled(), other.bucketKeyEnabled());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ServerSideEncryptionRule")
                .add("ApplyServerSideEncryptionByDefault", applyServerSideEncryptionByDefault())
                .add("BucketKeyEnabled", bucketKeyEnabled()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ApplyServerSideEncryptionByDefault":
            return Optional.ofNullable(clazz.cast(applyServerSideEncryptionByDefault()));
        case "BucketKeyEnabled":
            return Optional.ofNullable(clazz.cast(bucketKeyEnabled()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ServerSideEncryptionRule, T> g) {
        return obj -> g.apply((ServerSideEncryptionRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ServerSideEncryptionRule> {
        /**
         * <p>
         * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request
         * doesn't specify any server-side encryption, this default encryption will be applied.
         * </p>
         * 
         * @param applyServerSideEncryptionByDefault
         *        Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object
         *        request doesn't specify any server-side encryption, this default encryption will be applied.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder applyServerSideEncryptionByDefault(ServerSideEncryptionByDefault applyServerSideEncryptionByDefault);

        /**
         * <p>
         * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request
         * doesn't specify any server-side encryption, this default encryption will be applied.
         * </p>
         * This is a convenience method that creates an instance of the {@link ServerSideEncryptionByDefault.Builder}
         * avoiding the need to create one manually via {@link ServerSideEncryptionByDefault#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ServerSideEncryptionByDefault.Builder#build()} is called
         * immediately and its result is passed to
         * {@link #applyServerSideEncryptionByDefault(ServerSideEncryptionByDefault)}.
         * 
         * @param applyServerSideEncryptionByDefault
         *        a consumer that will call methods on {@link ServerSideEncryptionByDefault.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #applyServerSideEncryptionByDefault(ServerSideEncryptionByDefault)
         */
        default Builder applyServerSideEncryptionByDefault(
                Consumer<ServerSideEncryptionByDefault.Builder> applyServerSideEncryptionByDefault) {
            return applyServerSideEncryptionByDefault(ServerSideEncryptionByDefault.builder()
                    .applyMutation(applyServerSideEncryptionByDefault).build());
        }

        /**
         * <p>
         * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS (SSE-KMS) for
         * new objects in the bucket. Existing objects are not affected. Setting the <code>BucketKeyEnabled</code>
         * element to <code>true</code> causes Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not
         * enabled.
         * </p>
         * <p>
         * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3
         * Bucket Keys</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param bucketKeyEnabled
         *        Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS
         *        (SSE-KMS) for new objects in the bucket. Existing objects are not affected. Setting the
         *        <code>BucketKeyEnabled</code> element to <code>true</code> causes Amazon S3 to use an S3 Bucket Key.
         *        By default, S3 Bucket Key is not enabled.</p>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in
         *        the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketKeyEnabled(Boolean bucketKeyEnabled);
    }

    static final class BuilderImpl implements Builder {
        private ServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

        private Boolean bucketKeyEnabled;

        private BuilderImpl() {
        }

        private BuilderImpl(ServerSideEncryptionRule model) {
            applyServerSideEncryptionByDefault(model.applyServerSideEncryptionByDefault);
            bucketKeyEnabled(model.bucketKeyEnabled);
        }

        public final ServerSideEncryptionByDefault.Builder getApplyServerSideEncryptionByDefault() {
            return applyServerSideEncryptionByDefault != null ? applyServerSideEncryptionByDefault.toBuilder() : null;
        }

        public final void setApplyServerSideEncryptionByDefault(
                ServerSideEncryptionByDefault.BuilderImpl applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault != null ? applyServerSideEncryptionByDefault
                    .build() : null;
        }

        @Override
        public final Builder applyServerSideEncryptionByDefault(ServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            return this;
        }

        public final Boolean getBucketKeyEnabled() {
            return bucketKeyEnabled;
        }

        public final void setBucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
        }

        @Override
        public final Builder bucketKeyEnabled(Boolean bucketKeyEnabled) {
            this.bucketKeyEnabled = bucketKeyEnabled;
            return this;
        }

        @Override
        public ServerSideEncryptionRule build() {
            return new ServerSideEncryptionRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
