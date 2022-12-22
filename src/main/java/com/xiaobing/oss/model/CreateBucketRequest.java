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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class CreateBucketRequest extends S3Request implements
        ToCopyableBuilder<CreateBucketRequest.Builder, CreateBucketRequest> {
    private static final SdkField<String> ACL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ACL")
            .getter(getter(CreateBucketRequest::aclAsString))
            .setter(setter(Builder::acl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-acl")
                    .unmarshallLocationName("x-amz-acl").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(CreateBucketRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<CreateBucketConfiguration> CREATE_BUCKET_CONFIGURATION_FIELD = SdkField
            .<CreateBucketConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("CreateBucketConfiguration")
            .getter(getter(CreateBucketRequest::createBucketConfiguration))
            .setter(setter(Builder::createBucketConfiguration))
            .constructor(CreateBucketConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CreateBucketConfiguration")
                    .unmarshallLocationName("CreateBucketConfiguration").build(), PayloadTrait.create()).build();

    private static final SdkField<String> GRANT_FULL_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantFullControl")
            .getter(getter(CreateBucketRequest::grantFullControl))
            .setter(setter(Builder::grantFullControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-full-control")
                    .unmarshallLocationName("x-amz-grant-full-control").build()).build();

    private static final SdkField<String> GRANT_READ_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantRead")
            .getter(getter(CreateBucketRequest::grantRead))
            .setter(setter(Builder::grantRead))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read")
                    .unmarshallLocationName("x-amz-grant-read").build()).build();

    private static final SdkField<String> GRANT_READ_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantReadACP")
            .getter(getter(CreateBucketRequest::grantReadACP))
            .setter(setter(Builder::grantReadACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read-acp")
                    .unmarshallLocationName("x-amz-grant-read-acp").build()).build();

    private static final SdkField<String> GRANT_WRITE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantWrite")
            .getter(getter(CreateBucketRequest::grantWrite))
            .setter(setter(Builder::grantWrite))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-write")
                    .unmarshallLocationName("x-amz-grant-write").build()).build();

    private static final SdkField<String> GRANT_WRITE_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantWriteACP")
            .getter(getter(CreateBucketRequest::grantWriteACP))
            .setter(setter(Builder::grantWriteACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-write-acp")
                    .unmarshallLocationName("x-amz-grant-write-acp").build()).build();

    private static final SdkField<Boolean> OBJECT_LOCK_ENABLED_FOR_BUCKET_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("ObjectLockEnabledForBucket")
            .getter(getter(CreateBucketRequest::objectLockEnabledForBucket))
            .setter(setter(Builder::objectLockEnabledForBucket))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-bucket-object-lock-enabled")
                    .unmarshallLocationName("x-amz-bucket-object-lock-enabled").build()).build();

    private static final SdkField<String> OBJECT_OWNERSHIP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ObjectOwnership")
            .getter(getter(CreateBucketRequest::objectOwnershipAsString))
            .setter(setter(Builder::objectOwnership))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-object-ownership")
                    .unmarshallLocationName("x-amz-object-ownership").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ACL_FIELD, BUCKET_FIELD,
            CREATE_BUCKET_CONFIGURATION_FIELD, GRANT_FULL_CONTROL_FIELD, GRANT_READ_FIELD, GRANT_READ_ACP_FIELD,
            GRANT_WRITE_FIELD, GRANT_WRITE_ACP_FIELD, OBJECT_LOCK_ENABLED_FOR_BUCKET_FIELD, OBJECT_OWNERSHIP_FIELD));

    private final String acl;

    private final String bucket;

    private final CreateBucketConfiguration createBucketConfiguration;

    private final String grantFullControl;

    private final String grantRead;

    private final String grantReadACP;

    private final String grantWrite;

    private final String grantWriteACP;

    private final Boolean objectLockEnabledForBucket;

    private final String objectOwnership;

    private CreateBucketRequest(BuilderImpl builder) {
        super(builder);
        this.acl = builder.acl;
        this.bucket = builder.bucket;
        this.createBucketConfiguration = builder.createBucketConfiguration;
        this.grantFullControl = builder.grantFullControl;
        this.grantRead = builder.grantRead;
        this.grantReadACP = builder.grantReadACP;
        this.grantWrite = builder.grantWrite;
        this.grantWriteACP = builder.grantWriteACP;
        this.objectLockEnabledForBucket = builder.objectLockEnabledForBucket;
        this.objectOwnership = builder.objectOwnership;
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #acl} will return
     * {@link BucketCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #aclAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the bucket.
     * @see BucketCannedACL
     */
    public final BucketCannedACL acl() {
        return BucketCannedACL.fromValue(acl);
    }

    /**
     * <p>
     * The canned ACL to apply to the bucket.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #acl} will return
     * {@link BucketCannedACL#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #aclAsString}.
     * </p>
     * 
     * @return The canned ACL to apply to the bucket.
     * @see BucketCannedACL
     */
    public final String aclAsString() {
        return acl;
    }

    /**
     * <p>
     * The name of the bucket to create.
     * </p>
     * 
     * @return The name of the bucket to create.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The configuration information for the bucket.
     * </p>
     * 
     * @return The configuration information for the bucket.
     */
    public final CreateBucketConfiguration createBucketConfiguration() {
        return createBucketConfiguration;
    }

    /**
     * <p>
     * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     * </p>
     * 
     * @return Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
     */
    public final String grantFullControl() {
        return grantFullControl;
    }

    /**
     * <p>
     * Allows grantee to list the objects in the bucket.
     * </p>
     * 
     * @return Allows grantee to list the objects in the bucket.
     */
    public final String grantRead() {
        return grantRead;
    }

    /**
     * <p>
     * Allows grantee to read the bucket ACL.
     * </p>
     * 
     * @return Allows grantee to read the bucket ACL.
     */
    public final String grantReadACP() {
        return grantReadACP;
    }

    /**
     * <p>
     * Allows grantee to create new objects in the bucket.
     * </p>
     * <p>
     * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
     * </p>
     * 
     * @return Allows grantee to create new objects in the bucket.</p>
     *         <p>
     *         For the bucket and object owners of existing objects, also allows deletions and overwrites of those
     *         objects.
     */
    public final String grantWrite() {
        return grantWrite;
    }

    /**
     * <p>
     * Allows grantee to write the ACL for the applicable bucket.
     * </p>
     * 
     * @return Allows grantee to write the ACL for the applicable bucket.
     */
    public final String grantWriteACP() {
        return grantWriteACP;
    }

    /**
     * <p>
     * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     * </p>
     * 
     * @return Specifies whether you want S3 Object Lock to be enabled for the new bucket.
     */
    public final Boolean objectLockEnabledForBucket() {
        return objectLockEnabledForBucket;
    }

    /**
     * Returns the value of the ObjectOwnership property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectOwnership}
     * will return {@link ObjectOwnership#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectOwnershipAsString}.
     * </p>
     * 
     * @return The value of the ObjectOwnership property for this object.
     * @see ObjectOwnership
     */
    public final ObjectOwnership objectOwnership() {
        return ObjectOwnership.fromValue(objectOwnership);
    }

    /**
     * Returns the value of the ObjectOwnership property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #objectOwnership}
     * will return {@link ObjectOwnership#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #objectOwnershipAsString}.
     * </p>
     * 
     * @return The value of the ObjectOwnership property for this object.
     * @see ObjectOwnership
     */
    public final String objectOwnershipAsString() {
        return objectOwnership;
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
        hashCode = 31 * hashCode + Objects.hashCode(aclAsString());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(createBucketConfiguration());
        hashCode = 31 * hashCode + Objects.hashCode(grantFullControl());
        hashCode = 31 * hashCode + Objects.hashCode(grantRead());
        hashCode = 31 * hashCode + Objects.hashCode(grantReadACP());
        hashCode = 31 * hashCode + Objects.hashCode(grantWrite());
        hashCode = 31 * hashCode + Objects.hashCode(grantWriteACP());
        hashCode = 31 * hashCode + Objects.hashCode(objectLockEnabledForBucket());
        hashCode = 31 * hashCode + Objects.hashCode(objectOwnershipAsString());
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
        if (!(obj instanceof CreateBucketRequest)) {
            return false;
        }
        CreateBucketRequest other = (CreateBucketRequest) obj;
        return Objects.equals(aclAsString(), other.aclAsString()) && Objects.equals(bucket(), other.bucket())
                && Objects.equals(createBucketConfiguration(), other.createBucketConfiguration())
                && Objects.equals(grantFullControl(), other.grantFullControl()) && Objects.equals(grantRead(), other.grantRead())
                && Objects.equals(grantReadACP(), other.grantReadACP()) && Objects.equals(grantWrite(), other.grantWrite())
                && Objects.equals(grantWriteACP(), other.grantWriteACP())
                && Objects.equals(objectLockEnabledForBucket(), other.objectLockEnabledForBucket())
                && Objects.equals(objectOwnershipAsString(), other.objectOwnershipAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("CreateBucketRequest").add("ACL", aclAsString()).add("Bucket", bucket())
                .add("CreateBucketConfiguration", createBucketConfiguration()).add("GrantFullControl", grantFullControl())
                .add("GrantRead", grantRead()).add("GrantReadACP", grantReadACP()).add("GrantWrite", grantWrite())
                .add("GrantWriteACP", grantWriteACP()).add("ObjectLockEnabledForBucket", objectLockEnabledForBucket())
                .add("ObjectOwnership", objectOwnershipAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ACL":
            return Optional.ofNullable(clazz.cast(aclAsString()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "CreateBucketConfiguration":
            return Optional.ofNullable(clazz.cast(createBucketConfiguration()));
        case "GrantFullControl":
            return Optional.ofNullable(clazz.cast(grantFullControl()));
        case "GrantRead":
            return Optional.ofNullable(clazz.cast(grantRead()));
        case "GrantReadACP":
            return Optional.ofNullable(clazz.cast(grantReadACP()));
        case "GrantWrite":
            return Optional.ofNullable(clazz.cast(grantWrite()));
        case "GrantWriteACP":
            return Optional.ofNullable(clazz.cast(grantWriteACP()));
        case "ObjectLockEnabledForBucket":
            return Optional.ofNullable(clazz.cast(objectLockEnabledForBucket()));
        case "ObjectOwnership":
            return Optional.ofNullable(clazz.cast(objectOwnershipAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<CreateBucketRequest, T> g) {
        return obj -> g.apply((CreateBucketRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, CreateBucketRequest> {
        /**
         * <p>
         * The canned ACL to apply to the bucket.
         * </p>
         * 
         * @param acl
         *        The canned ACL to apply to the bucket.
         * @see BucketCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketCannedACL
         */
        Builder acl(String acl);

        /**
         * <p>
         * The canned ACL to apply to the bucket.
         * </p>
         * 
         * @param acl
         *        The canned ACL to apply to the bucket.
         * @see BucketCannedACL
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see BucketCannedACL
         */
        Builder acl(BucketCannedACL acl);

        /**
         * <p>
         * The name of the bucket to create.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket to create.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The configuration information for the bucket.
         * </p>
         * 
         * @param createBucketConfiguration
         *        The configuration information for the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder createBucketConfiguration(CreateBucketConfiguration createBucketConfiguration);

        /**
         * <p>
         * The configuration information for the bucket.
         * </p>
         * This is a convenience method that creates an instance of the {@link CreateBucketConfiguration.Builder}
         * avoiding the need to create one manually via {@link CreateBucketConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link CreateBucketConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #createBucketConfiguration(CreateBucketConfiguration)}.
         * 
         * @param createBucketConfiguration
         *        a consumer that will call methods on {@link CreateBucketConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #createBucketConfiguration(CreateBucketConfiguration)
         */
        default Builder createBucketConfiguration(Consumer<CreateBucketConfiguration.Builder> createBucketConfiguration) {
            return createBucketConfiguration(CreateBucketConfiguration.builder().applyMutation(createBucketConfiguration).build());
        }

        /**
         * <p>
         * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
         * </p>
         * 
         * @param grantFullControl
         *        Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantFullControl(String grantFullControl);

        /**
         * <p>
         * Allows grantee to list the objects in the bucket.
         * </p>
         * 
         * @param grantRead
         *        Allows grantee to list the objects in the bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantRead(String grantRead);

        /**
         * <p>
         * Allows grantee to read the bucket ACL.
         * </p>
         * 
         * @param grantReadACP
         *        Allows grantee to read the bucket ACL.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantReadACP(String grantReadACP);

        /**
         * <p>
         * Allows grantee to create new objects in the bucket.
         * </p>
         * <p>
         * For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
         * </p>
         * 
         * @param grantWrite
         *        Allows grantee to create new objects in the bucket.</p>
         *        <p>
         *        For the bucket and object owners of existing objects, also allows deletions and overwrites of those
         *        objects.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantWrite(String grantWrite);

        /**
         * <p>
         * Allows grantee to write the ACL for the applicable bucket.
         * </p>
         * 
         * @param grantWriteACP
         *        Allows grantee to write the ACL for the applicable bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder grantWriteACP(String grantWriteACP);

        /**
         * <p>
         * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
         * </p>
         * 
         * @param objectLockEnabledForBucket
         *        Specifies whether you want S3 Object Lock to be enabled for the new bucket.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder objectLockEnabledForBucket(Boolean objectLockEnabledForBucket);

        /**
         * Sets the value of the ObjectOwnership property for this object.
         *
         * @param objectOwnership
         *        The new value for the ObjectOwnership property for this object.
         * @see ObjectOwnership
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectOwnership
         */
        Builder objectOwnership(String objectOwnership);

        /**
         * Sets the value of the ObjectOwnership property for this object.
         *
         * @param objectOwnership
         *        The new value for the ObjectOwnership property for this object.
         * @see ObjectOwnership
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ObjectOwnership
         */
        Builder objectOwnership(ObjectOwnership objectOwnership);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String acl;

        private String bucket;

        private CreateBucketConfiguration createBucketConfiguration;

        private String grantFullControl;

        private String grantRead;

        private String grantReadACP;

        private String grantWrite;

        private String grantWriteACP;

        private Boolean objectLockEnabledForBucket;

        private String objectOwnership;

        private BuilderImpl() {
        }

        private BuilderImpl(CreateBucketRequest model) {
            super(model);
            acl(model.acl);
            bucket(model.bucket);
            createBucketConfiguration(model.createBucketConfiguration);
            grantFullControl(model.grantFullControl);
            grantRead(model.grantRead);
            grantReadACP(model.grantReadACP);
            grantWrite(model.grantWrite);
            grantWriteACP(model.grantWriteACP);
            objectLockEnabledForBucket(model.objectLockEnabledForBucket);
            objectOwnership(model.objectOwnership);
        }

        public final String getAcl() {
            return acl;
        }

        public final void setAcl(String acl) {
            this.acl = acl;
        }

        @Override
        public final Builder acl(String acl) {
            this.acl = acl;
            return this;
        }

        @Override
        public final Builder acl(BucketCannedACL acl) {
            this.acl(acl == null ? null : acl.toString());
            return this;
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

        public final CreateBucketConfiguration.Builder getCreateBucketConfiguration() {
            return createBucketConfiguration != null ? createBucketConfiguration.toBuilder() : null;
        }

        public final void setCreateBucketConfiguration(CreateBucketConfiguration.BuilderImpl createBucketConfiguration) {
            this.createBucketConfiguration = createBucketConfiguration != null ? createBucketConfiguration.build() : null;
        }

        @Override
        public final Builder createBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
            this.createBucketConfiguration = createBucketConfiguration;
            return this;
        }

        public final String getGrantFullControl() {
            return grantFullControl;
        }

        public final void setGrantFullControl(String grantFullControl) {
            this.grantFullControl = grantFullControl;
        }

        @Override
        public final Builder grantFullControl(String grantFullControl) {
            this.grantFullControl = grantFullControl;
            return this;
        }

        public final String getGrantRead() {
            return grantRead;
        }

        public final void setGrantRead(String grantRead) {
            this.grantRead = grantRead;
        }

        @Override
        public final Builder grantRead(String grantRead) {
            this.grantRead = grantRead;
            return this;
        }

        public final String getGrantReadACP() {
            return grantReadACP;
        }

        public final void setGrantReadACP(String grantReadACP) {
            this.grantReadACP = grantReadACP;
        }

        @Override
        public final Builder grantReadACP(String grantReadACP) {
            this.grantReadACP = grantReadACP;
            return this;
        }

        public final String getGrantWrite() {
            return grantWrite;
        }

        public final void setGrantWrite(String grantWrite) {
            this.grantWrite = grantWrite;
        }

        @Override
        public final Builder grantWrite(String grantWrite) {
            this.grantWrite = grantWrite;
            return this;
        }

        public final String getGrantWriteACP() {
            return grantWriteACP;
        }

        public final void setGrantWriteACP(String grantWriteACP) {
            this.grantWriteACP = grantWriteACP;
        }

        @Override
        public final Builder grantWriteACP(String grantWriteACP) {
            this.grantWriteACP = grantWriteACP;
            return this;
        }

        public final Boolean getObjectLockEnabledForBucket() {
            return objectLockEnabledForBucket;
        }

        public final void setObjectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
            this.objectLockEnabledForBucket = objectLockEnabledForBucket;
        }

        @Override
        public final Builder objectLockEnabledForBucket(Boolean objectLockEnabledForBucket) {
            this.objectLockEnabledForBucket = objectLockEnabledForBucket;
            return this;
        }

        public final String getObjectOwnership() {
            return objectOwnership;
        }

        public final void setObjectOwnership(String objectOwnership) {
            this.objectOwnership = objectOwnership;
        }

        @Override
        public final Builder objectOwnership(String objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        @Override
        public final Builder objectOwnership(ObjectOwnership objectOwnership) {
            this.objectOwnership(objectOwnership == null ? null : objectOwnership.toString());
            return this;
        }

        @Override
        public Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration) {
            super.overrideConfiguration(overrideConfiguration);
            return this;
        }

        @Override
        public Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer) {
            super.overrideConfiguration(builderConsumer);
            return this;
        }

        @Override
        public CreateBucketRequest build() {
            return new CreateBucketRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
