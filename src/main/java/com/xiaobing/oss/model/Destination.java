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
 * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3
 * Replication Time Control (S3 RTC).
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Destination implements SdkPojo, Serializable, ToCopyableBuilder<Destination.Builder, Destination> {
    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(Destination::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> ACCOUNT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Account")
            .getter(getter(Destination::account))
            .setter(setter(Builder::account))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Account")
                    .unmarshallLocationName("Account").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(Destination::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<AccessControlTranslation> ACCESS_CONTROL_TRANSLATION_FIELD = SdkField
            .<AccessControlTranslation> builder(MarshallingType.SDK_POJO)
            .memberName("AccessControlTranslation")
            .getter(getter(Destination::accessControlTranslation))
            .setter(setter(Builder::accessControlTranslation))
            .constructor(AccessControlTranslation::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessControlTranslation")
                    .unmarshallLocationName("AccessControlTranslation").build()).build();

    private static final SdkField<EncryptionConfiguration> ENCRYPTION_CONFIGURATION_FIELD = SdkField
            .<EncryptionConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("EncryptionConfiguration")
            .getter(getter(Destination::encryptionConfiguration))
            .setter(setter(Builder::encryptionConfiguration))
            .constructor(EncryptionConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EncryptionConfiguration")
                    .unmarshallLocationName("EncryptionConfiguration").build()).build();

    private static final SdkField<ReplicationTime> REPLICATION_TIME_FIELD = SdkField
            .<ReplicationTime> builder(MarshallingType.SDK_POJO)
            .memberName("ReplicationTime")
            .getter(getter(Destination::replicationTime))
            .setter(setter(Builder::replicationTime))
            .constructor(ReplicationTime::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ReplicationTime")
                    .unmarshallLocationName("ReplicationTime").build()).build();

    private static final SdkField<Metrics> METRICS_FIELD = SdkField
            .<Metrics> builder(MarshallingType.SDK_POJO)
            .memberName("Metrics")
            .getter(getter(Destination::metrics))
            .setter(setter(Builder::metrics))
            .constructor(Metrics::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Metrics")
                    .unmarshallLocationName("Metrics").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(BUCKET_FIELD, ACCOUNT_FIELD,
            STORAGE_CLASS_FIELD, ACCESS_CONTROL_TRANSLATION_FIELD, ENCRYPTION_CONFIGURATION_FIELD, REPLICATION_TIME_FIELD,
            METRICS_FIELD));

    private static final long serialVersionUID = 1L;

    private final String bucket;

    private final String account;

    private final String storageClass;

    private final AccessControlTranslation accessControlTranslation;

    private final EncryptionConfiguration encryptionConfiguration;

    private final ReplicationTime replicationTime;

    private final Metrics metrics;

    private Destination(BuilderImpl builder) {
        this.bucket = builder.bucket;
        this.account = builder.account;
        this.storageClass = builder.storageClass;
        this.accessControlTranslation = builder.accessControlTranslation;
        this.encryptionConfiguration = builder.encryptionConfiguration;
        this.replicationTime = builder.replicationTime;
        this.metrics = builder.metrics;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change replica
     * ownership to the Amazon Web Services account that owns the destination bucket by specifying the
     * <code>AccessControlTranslation</code> property, this is the account ID of the destination bucket owner. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication Additional
     * Configuration: Changing the Replica Owner</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change
     *         replica ownership to the Amazon Web Services account that owns the destination bucket by specifying the
     *         <code>AccessControlTranslation</code> property, this is the account ID of the destination bucket owner.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication
     *         Additional Configuration: Changing the Replica Owner</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String account() {
        return account;
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default, Amazon
     * S3 uses the storage class of the source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket replication</a>
     * action in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default,
     *         Amazon S3 uses the storage class of the source object to create the object replica. </p>
     *         <p>
     *         For valid values, see the <code>StorageClass</code> element of the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
     *         replication</a> action in the <i>Amazon S3 API Reference</i>.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default, Amazon
     * S3 uses the storage class of the source object to create the object replica.
     * </p>
     * <p>
     * For valid values, see the <code>StorageClass</code> element of the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket replication</a>
     * action in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default,
     *         Amazon S3 uses the storage class of the source object to create the object replica. </p>
     *         <p>
     *         For valid values, see the <code>StorageClass</code> element of the <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
     *         replication</a> action in the <i>Amazon S3 API Reference</i>.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
    }

    /**
     * <p>
     * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and
     * you want to change replica ownership to the Amazon Web Services account that owns the destination bucket. If this
     * is not specified in the replication configuration, the replicas are owned by same Amazon Web Services account
     * that owns the source object.
     * </p>
     * 
     * @return Specify this only in a cross-account scenario (where source and destination bucket owners are not the
     *         same), and you want to change replica ownership to the Amazon Web Services account that owns the
     *         destination bucket. If this is not specified in the replication configuration, the replicas are owned by
     *         same Amazon Web Services account that owns the source object.
     */
    public final AccessControlTranslation accessControlTranslation() {
        return accessControlTranslation;
    }

    /**
     * <p>
     * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified, you
     * must specify this element.
     * </p>
     * 
     * @return A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is
     *         specified, you must specify this element.
     */
    public final EncryptionConfiguration encryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * <p>
     * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time
     * when all objects and operations on objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * 
     * @return A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the
     *         time when all objects and operations on objects must be replicated. Must be specified together with a
     *         <code>Metrics</code> block.
     */
    public final ReplicationTime replicationTime() {
        return replicationTime;
    }

    /**
     * <p>
     * A container specifying replication metrics-related settings enabling replication metrics and events.
     * </p>
     * 
     * @return A container specifying replication metrics-related settings enabling replication metrics and events.
     */
    public final Metrics metrics() {
        return metrics;
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
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(account());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(accessControlTranslation());
        hashCode = 31 * hashCode + Objects.hashCode(encryptionConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(replicationTime());
        hashCode = 31 * hashCode + Objects.hashCode(metrics());
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
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination other = (Destination) obj;
        return Objects.equals(bucket(), other.bucket()) && Objects.equals(account(), other.account())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(accessControlTranslation(), other.accessControlTranslation())
                && Objects.equals(encryptionConfiguration(), other.encryptionConfiguration())
                && Objects.equals(replicationTime(), other.replicationTime()) && Objects.equals(metrics(), other.metrics());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Destination").add("Bucket", bucket()).add("Account", account())
                .add("StorageClass", storageClassAsString()).add("AccessControlTranslation", accessControlTranslation())
                .add("EncryptionConfiguration", encryptionConfiguration()).add("ReplicationTime", replicationTime())
                .add("Metrics", metrics()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Account":
            return Optional.ofNullable(clazz.cast(account()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "AccessControlTranslation":
            return Optional.ofNullable(clazz.cast(accessControlTranslation()));
        case "EncryptionConfiguration":
            return Optional.ofNullable(clazz.cast(encryptionConfiguration()));
        case "ReplicationTime":
            return Optional.ofNullable(clazz.cast(replicationTime()));
        case "Metrics":
            return Optional.ofNullable(clazz.cast(metrics()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Destination, T> g) {
        return obj -> g.apply((Destination) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Destination> {
        /**
         * <p>
         * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
         * </p>
         * 
         * @param bucket
         *        The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change replica
         * ownership to the Amazon Web Services account that owns the destination bucket by specifying the
         * <code>AccessControlTranslation</code> property, this is the account ID of the destination bucket owner. For
         * more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication Additional
         * Configuration: Changing the Replica Owner</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param account
         *        Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change
         *        replica ownership to the Amazon Web Services account that owns the destination bucket by specifying
         *        the <code>AccessControlTranslation</code> property, this is the account ID of the destination bucket
         *        owner. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication
         *        Additional Configuration: Changing the Replica Owner</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder account(String account);

        /**
         * <p>
         * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default,
         * Amazon S3 uses the storage class of the source object to create the object replica.
         * </p>
         * <p>
         * For valid values, see the <code>StorageClass</code> element of the <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
         * replication</a> action in the <i>Amazon S3 API Reference</i>.
         * </p>
         * 
         * @param storageClass
         *        The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By
         *        default, Amazon S3 uses the storage class of the source object to create the object replica. </p>
         *        <p>
         *        For valid values, see the <code>StorageClass</code> element of the <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
         *        replication</a> action in the <i>Amazon S3 API Reference</i>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default,
         * Amazon S3 uses the storage class of the source object to create the object replica.
         * </p>
         * <p>
         * For valid values, see the <code>StorageClass</code> element of the <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
         * replication</a> action in the <i>Amazon S3 API Reference</i>.
         * </p>
         * 
         * @param storageClass
         *        The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By
         *        default, Amazon S3 uses the storage class of the source object to create the object replica. </p>
         *        <p>
         *        For valid values, see the <code>StorageClass</code> element of the <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
         *        replication</a> action in the <i>Amazon S3 API Reference</i>.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

        /**
         * <p>
         * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same),
         * and you want to change replica ownership to the Amazon Web Services account that owns the destination bucket.
         * If this is not specified in the replication configuration, the replicas are owned by same Amazon Web Services
         * account that owns the source object.
         * </p>
         * 
         * @param accessControlTranslation
         *        Specify this only in a cross-account scenario (where source and destination bucket owners are not the
         *        same), and you want to change replica ownership to the Amazon Web Services account that owns the
         *        destination bucket. If this is not specified in the replication configuration, the replicas are owned
         *        by same Amazon Web Services account that owns the source object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessControlTranslation(AccessControlTranslation accessControlTranslation);

        /**
         * <p>
         * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same),
         * and you want to change replica ownership to the Amazon Web Services account that owns the destination bucket.
         * If this is not specified in the replication configuration, the replicas are owned by same Amazon Web Services
         * account that owns the source object.
         * </p>
         * This is a convenience method that creates an instance of the {@link AccessControlTranslation.Builder}
         * avoiding the need to create one manually via {@link AccessControlTranslation#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AccessControlTranslation.Builder#build()} is called immediately
         * and its result is passed to {@link #accessControlTranslation(AccessControlTranslation)}.
         * 
         * @param accessControlTranslation
         *        a consumer that will call methods on {@link AccessControlTranslation.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #accessControlTranslation(AccessControlTranslation)
         */
        default Builder accessControlTranslation(Consumer<AccessControlTranslation.Builder> accessControlTranslation) {
            return accessControlTranslation(AccessControlTranslation.builder().applyMutation(accessControlTranslation).build());
        }

        /**
         * <p>
         * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified,
         * you must specify this element.
         * </p>
         * 
         * @param encryptionConfiguration
         *        A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is
         *        specified, you must specify this element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder encryptionConfiguration(EncryptionConfiguration encryptionConfiguration);

        /**
         * <p>
         * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified,
         * you must specify this element.
         * </p>
         * This is a convenience method that creates an instance of the {@link EncryptionConfiguration.Builder} avoiding
         * the need to create one manually via {@link EncryptionConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link EncryptionConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #encryptionConfiguration(EncryptionConfiguration)}.
         * 
         * @param encryptionConfiguration
         *        a consumer that will call methods on {@link EncryptionConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #encryptionConfiguration(EncryptionConfiguration)
         */
        default Builder encryptionConfiguration(Consumer<EncryptionConfiguration.Builder> encryptionConfiguration) {
            return encryptionConfiguration(EncryptionConfiguration.builder().applyMutation(encryptionConfiguration).build());
        }

        /**
         * <p>
         * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time
         * when all objects and operations on objects must be replicated. Must be specified together with a
         * <code>Metrics</code> block.
         * </p>
         * 
         * @param replicationTime
         *        A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and
         *        the time when all objects and operations on objects must be replicated. Must be specified together
         *        with a <code>Metrics</code> block.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder replicationTime(ReplicationTime replicationTime);

        /**
         * <p>
         * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time
         * when all objects and operations on objects must be replicated. Must be specified together with a
         * <code>Metrics</code> block.
         * </p>
         * This is a convenience method that creates an instance of the {@link ReplicationTime.Builder} avoiding the
         * need to create one manually via {@link ReplicationTime#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationTime.Builder#build()} is called immediately and its
         * result is passed to {@link #replicationTime(ReplicationTime)}.
         * 
         * @param replicationTime
         *        a consumer that will call methods on {@link ReplicationTime.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #replicationTime(ReplicationTime)
         */
        default Builder replicationTime(Consumer<ReplicationTime.Builder> replicationTime) {
            return replicationTime(ReplicationTime.builder().applyMutation(replicationTime).build());
        }

        /**
         * <p>
         * A container specifying replication metrics-related settings enabling replication metrics and events.
         * </p>
         * 
         * @param metrics
         *        A container specifying replication metrics-related settings enabling replication metrics and events.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder metrics(Metrics metrics);

        /**
         * <p>
         * A container specifying replication metrics-related settings enabling replication metrics and events.
         * </p>
         * This is a convenience method that creates an instance of the {@link Metrics.Builder} avoiding the need to
         * create one manually via {@link Metrics#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Metrics.Builder#build()} is called immediately and its result is
         * passed to {@link #metrics(Metrics)}.
         * 
         * @param metrics
         *        a consumer that will call methods on {@link Metrics.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #metrics(Metrics)
         */
        default Builder metrics(Consumer<Metrics.Builder> metrics) {
            return metrics(Metrics.builder().applyMutation(metrics).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String bucket;

        private String account;

        private String storageClass;

        private AccessControlTranslation accessControlTranslation;

        private EncryptionConfiguration encryptionConfiguration;

        private ReplicationTime replicationTime;

        private Metrics metrics;

        private BuilderImpl() {
        }

        private BuilderImpl(Destination model) {
            bucket(model.bucket);
            account(model.account);
            storageClass(model.storageClass);
            accessControlTranslation(model.accessControlTranslation);
            encryptionConfiguration(model.encryptionConfiguration);
            replicationTime(model.replicationTime);
            metrics(model.metrics);
        }

        public final String getBucket() {
            return bucket;
        }

        public final void setBucket(String bucket) {
            this.bucket = bucket;
        }

        @Override
        public final Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public final String getAccount() {
            return account;
        }

        public final void setAccount(String account) {
            this.account = account;
        }

        @Override
        public final Builder account(String account) {
            this.account = account;
            return this;
        }

        public final String getStorageClass() {
            return storageClass;
        }

        public final void setStorageClass(String storageClass) {
            this.storageClass = storageClass;
        }

        @Override
        public final Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public final Builder storageClass(StorageClass storageClass) {
            this.storageClass(storageClass == null ? null : storageClass.toString());
            return this;
        }

        public final AccessControlTranslation.Builder getAccessControlTranslation() {
            return accessControlTranslation != null ? accessControlTranslation.toBuilder() : null;
        }

        public final void setAccessControlTranslation(AccessControlTranslation.BuilderImpl accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation != null ? accessControlTranslation.build() : null;
        }

        @Override
        public final Builder accessControlTranslation(AccessControlTranslation accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public final EncryptionConfiguration.Builder getEncryptionConfiguration() {
            return encryptionConfiguration != null ? encryptionConfiguration.toBuilder() : null;
        }

        public final void setEncryptionConfiguration(EncryptionConfiguration.BuilderImpl encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration != null ? encryptionConfiguration.build() : null;
        }

        @Override
        public final Builder encryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public final ReplicationTime.Builder getReplicationTime() {
            return replicationTime != null ? replicationTime.toBuilder() : null;
        }

        public final void setReplicationTime(ReplicationTime.BuilderImpl replicationTime) {
            this.replicationTime = replicationTime != null ? replicationTime.build() : null;
        }

        @Override
        public final Builder replicationTime(ReplicationTime replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public final Metrics.Builder getMetrics() {
            return metrics != null ? metrics.toBuilder() : null;
        }

        public final void setMetrics(Metrics.BuilderImpl metrics) {
            this.metrics = metrics != null ? metrics.build() : null;
        }

        @Override
        public final Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        @Override
        public Destination build() {
            return new Destination(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
