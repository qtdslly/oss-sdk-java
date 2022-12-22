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
public final class PutBucketAclRequest extends S3Request implements
        ToCopyableBuilder<PutBucketAclRequest.Builder, PutBucketAclRequest> {
    private static final SdkField<String> ACL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ACL")
            .getter(getter(PutBucketAclRequest::aclAsString))
            .setter(setter(Builder::acl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-acl")
                    .unmarshallLocationName("x-amz-acl").build()).build();

    private static final SdkField<AccessControlPolicy> ACCESS_CONTROL_POLICY_FIELD = SdkField
            .<AccessControlPolicy> builder(MarshallingType.SDK_POJO)
            .memberName("AccessControlPolicy")
            .getter(getter(PutBucketAclRequest::accessControlPolicy))
            .setter(setter(Builder::accessControlPolicy))
            .constructor(AccessControlPolicy::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AccessControlPolicy")
                    .unmarshallLocationName("AccessControlPolicy").build(), PayloadTrait.create()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(PutBucketAclRequest::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PATH).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> CONTENT_MD5_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ContentMD5")
            .getter(getter(PutBucketAclRequest::contentMD5))
            .setter(setter(Builder::contentMD5))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("Content-MD5")
                    .unmarshallLocationName("Content-MD5").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(PutBucketAclRequest::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-sdk-checksum-algorithm")
                    .unmarshallLocationName("x-amz-sdk-checksum-algorithm").build()).build();

    private static final SdkField<String> GRANT_FULL_CONTROL_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantFullControl")
            .getter(getter(PutBucketAclRequest::grantFullControl))
            .setter(setter(Builder::grantFullControl))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-full-control")
                    .unmarshallLocationName("x-amz-grant-full-control").build()).build();

    private static final SdkField<String> GRANT_READ_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantRead")
            .getter(getter(PutBucketAclRequest::grantRead))
            .setter(setter(Builder::grantRead))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read")
                    .unmarshallLocationName("x-amz-grant-read").build()).build();

    private static final SdkField<String> GRANT_READ_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantReadACP")
            .getter(getter(PutBucketAclRequest::grantReadACP))
            .setter(setter(Builder::grantReadACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-read-acp")
                    .unmarshallLocationName("x-amz-grant-read-acp").build()).build();

    private static final SdkField<String> GRANT_WRITE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantWrite")
            .getter(getter(PutBucketAclRequest::grantWrite))
            .setter(setter(Builder::grantWrite))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-write")
                    .unmarshallLocationName("x-amz-grant-write").build()).build();

    private static final SdkField<String> GRANT_WRITE_ACP_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("GrantWriteACP")
            .getter(getter(PutBucketAclRequest::grantWriteACP))
            .setter(setter(Builder::grantWriteACP))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-grant-write-acp")
                    .unmarshallLocationName("x-amz-grant-write-acp").build()).build();

    private static final SdkField<String> EXPECTED_BUCKET_OWNER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpectedBucketOwner")
            .getter(getter(PutBucketAclRequest::expectedBucketOwner))
            .setter(setter(Builder::expectedBucketOwner))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-expected-bucket-owner")
                    .unmarshallLocationName("x-amz-expected-bucket-owner").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ACL_FIELD,
            ACCESS_CONTROL_POLICY_FIELD, BUCKET_FIELD, CONTENT_MD5_FIELD, CHECKSUM_ALGORITHM_FIELD, GRANT_FULL_CONTROL_FIELD,
            GRANT_READ_FIELD, GRANT_READ_ACP_FIELD, GRANT_WRITE_FIELD, GRANT_WRITE_ACP_FIELD, EXPECTED_BUCKET_OWNER_FIELD));

    private final String acl;

    private final AccessControlPolicy accessControlPolicy;

    private final String bucket;

    private final String contentMD5;

    private final String checksumAlgorithm;

    private final String grantFullControl;

    private final String grantRead;

    private final String grantReadACP;

    private final String grantWrite;

    private final String grantWriteACP;

    private final String expectedBucketOwner;

    private PutBucketAclRequest(BuilderImpl builder) {
        super(builder);
        this.acl = builder.acl;
        this.accessControlPolicy = builder.accessControlPolicy;
        this.bucket = builder.bucket;
        this.contentMD5 = builder.contentMD5;
        this.checksumAlgorithm = builder.checksumAlgorithm;
        this.grantFullControl = builder.grantFullControl;
        this.grantRead = builder.grantRead;
        this.grantReadACP = builder.grantReadACP;
        this.grantWrite = builder.grantWrite;
        this.grantWriteACP = builder.grantWriteACP;
        this.expectedBucketOwner = builder.expectedBucketOwner;
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
     * Contains the elements that set the ACL permissions for an object per grantee.
     * </p>
     * 
     * @return Contains the elements that set the ACL permissions for an object per grantee.
     */
    public final AccessControlPolicy accessControlPolicy() {
        return accessControlPolicy;
    }

    /**
     * <p>
     * The bucket to which to apply the ACL.
     * </p>
     * 
     * @return The bucket to which to apply the ACL.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to
     * verify that the request body was not corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     * </p>
     * <p>
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this
     * field is calculated automatically.
     * </p>
     * 
     * @return The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check
     *         to verify that the request body was not corrupted in transit. For more information, go to <a
     *         href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a> </p>
     *         <p>
     *         For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
     *         this field is calculated automatically.
     */
    public final String contentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
     * provide any additional functionality if not using the SDK. When sending this header, there must be a
     * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3 fails
     * the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code> parameter.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm used to create the checksum for the object when using the SDK. This header will
     *         not provide any additional functionality if not using the SDK. When sending this header, there must be a
     *         corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
     *         fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
     *         parameter.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
     * provide any additional functionality if not using the SDK. When sending this header, there must be a
     * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3 fails
     * the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code> parameter.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return Indicates the algorithm used to create the checksum for the object when using the SDK. This header will
     *         not provide any additional functionality if not using the SDK. When sending this header, there must be a
     *         corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
     *         fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
     *         <p>
     *         If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
     *         parameter.
     * @see ChecksumAlgorithm
     */
    public final String checksumAlgorithmAsString() {
        return checksumAlgorithm;
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
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
     * with the HTTP status code <code>403 Forbidden</code> (access denied).
     * </p>
     * 
     * @return The account ID of the expected bucket owner. If the bucket is owned by a different account, the request
     *         fails with the HTTP status code <code>403 Forbidden</code> (access denied).
     */
    public final String expectedBucketOwner() {
        return expectedBucketOwner;
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
        hashCode = 31 * hashCode + Objects.hashCode(accessControlPolicy());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(contentMD5());
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
        hashCode = 31 * hashCode + Objects.hashCode(grantFullControl());
        hashCode = 31 * hashCode + Objects.hashCode(grantRead());
        hashCode = 31 * hashCode + Objects.hashCode(grantReadACP());
        hashCode = 31 * hashCode + Objects.hashCode(grantWrite());
        hashCode = 31 * hashCode + Objects.hashCode(grantWriteACP());
        hashCode = 31 * hashCode + Objects.hashCode(expectedBucketOwner());
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
        if (!(obj instanceof PutBucketAclRequest)) {
            return false;
        }
        PutBucketAclRequest other = (PutBucketAclRequest) obj;
        return Objects.equals(aclAsString(), other.aclAsString())
                && Objects.equals(accessControlPolicy(), other.accessControlPolicy()) && Objects.equals(bucket(), other.bucket())
                && Objects.equals(contentMD5(), other.contentMD5())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString())
                && Objects.equals(grantFullControl(), other.grantFullControl()) && Objects.equals(grantRead(), other.grantRead())
                && Objects.equals(grantReadACP(), other.grantReadACP()) && Objects.equals(grantWrite(), other.grantWrite())
                && Objects.equals(grantWriteACP(), other.grantWriteACP())
                && Objects.equals(expectedBucketOwner(), other.expectedBucketOwner());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("PutBucketAclRequest").add("ACL", aclAsString())
                .add("AccessControlPolicy", accessControlPolicy()).add("Bucket", bucket()).add("ContentMD5", contentMD5())
                .add("ChecksumAlgorithm", checksumAlgorithmAsString()).add("GrantFullControl", grantFullControl())
                .add("GrantRead", grantRead()).add("GrantReadACP", grantReadACP()).add("GrantWrite", grantWrite())
                .add("GrantWriteACP", grantWriteACP()).add("ExpectedBucketOwner", expectedBucketOwner()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ACL":
            return Optional.ofNullable(clazz.cast(aclAsString()));
        case "AccessControlPolicy":
            return Optional.ofNullable(clazz.cast(accessControlPolicy()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "ContentMD5":
            return Optional.ofNullable(clazz.cast(contentMD5()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
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
        case "ExpectedBucketOwner":
            return Optional.ofNullable(clazz.cast(expectedBucketOwner()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<PutBucketAclRequest, T> g) {
        return obj -> g.apply((PutBucketAclRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Request.Builder, SdkPojo, CopyableBuilder<Builder, PutBucketAclRequest> {
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
         * Contains the elements that set the ACL permissions for an object per grantee.
         * </p>
         * 
         * @param accessControlPolicy
         *        Contains the elements that set the ACL permissions for an object per grantee.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder accessControlPolicy(AccessControlPolicy accessControlPolicy);

        /**
         * <p>
         * Contains the elements that set the ACL permissions for an object per grantee.
         * </p>
         * This is a convenience method that creates an instance of the {@link AccessControlPolicy.Builder} avoiding the
         * need to create one manually via {@link AccessControlPolicy#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AccessControlPolicy.Builder#build()} is called immediately and
         * its result is passed to {@link #accessControlPolicy(AccessControlPolicy)}.
         * 
         * @param accessControlPolicy
         *        a consumer that will call methods on {@link AccessControlPolicy.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #accessControlPolicy(AccessControlPolicy)
         */
        default Builder accessControlPolicy(Consumer<AccessControlPolicy.Builder> accessControlPolicy) {
            return accessControlPolicy(AccessControlPolicy.builder().applyMutation(accessControlPolicy).build());
        }

        /**
         * <p>
         * The bucket to which to apply the ACL.
         * </p>
         * 
         * @param bucket
         *        The bucket to which to apply the ACL.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to
         * verify that the request body was not corrupted in transit. For more information, go to <a
         * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
         * </p>
         * <p>
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs,
         * this field is calculated automatically.
         * </p>
         * 
         * @param contentMD5
         *        The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity
         *        check to verify that the request body was not corrupted in transit. For more information, go to <a
         *        href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a> </p>
         *        <p>
         *        For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services
         *        SDKs, this field is calculated automatically.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder contentMD5(String contentMD5);

        /**
         * <p>
         * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
         * provide any additional functionality if not using the SDK. When sending this header, there must be a
         * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
         * fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         * parameter.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm used to create the checksum for the object when using the SDK. This header
         *        will not provide any additional functionality if not using the SDK. When sending this header, there
         *        must be a corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent.
         *        Otherwise, Amazon S3 fails the request with the HTTP status code <code>400 Bad Request</code>. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         *        parameter.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not
         * provide any additional functionality if not using the SDK. When sending this header, there must be a
         * corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent. Otherwise, Amazon S3
         * fails the request with the HTTP status code <code>400 Bad Request</code>. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * <p>
         * If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         * parameter.
         * </p>
         * 
         * @param checksumAlgorithm
         *        Indicates the algorithm used to create the checksum for the object when using the SDK. This header
         *        will not provide any additional functionality if not using the SDK. When sending this header, there
         *        must be a corresponding <code>x-amz-checksum</code> or <code>x-amz-trailer</code> header sent.
         *        Otherwise, Amazon S3 fails the request with the HTTP status code <code>400 Bad Request</code>. For
         *        more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.</p>
         *        <p>
         *        If you provide an individual checksum, Amazon S3 ignores any provided <code>ChecksumAlgorithm</code>
         *        parameter.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm);

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
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails
         * with the HTTP status code <code>403 Forbidden</code> (access denied).
         * </p>
         * 
         * @param expectedBucketOwner
         *        The account ID of the expected bucket owner. If the bucket is owned by a different account, the
         *        request fails with the HTTP status code <code>403 Forbidden</code> (access denied).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expectedBucketOwner(String expectedBucketOwner);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends S3Request.BuilderImpl implements Builder {
        private String acl;

        private AccessControlPolicy accessControlPolicy;

        private String bucket;

        private String contentMD5;

        private String checksumAlgorithm;

        private String grantFullControl;

        private String grantRead;

        private String grantReadACP;

        private String grantWrite;

        private String grantWriteACP;

        private String expectedBucketOwner;

        private BuilderImpl() {
        }

        private BuilderImpl(PutBucketAclRequest model) {
            super(model);
            acl(model.acl);
            accessControlPolicy(model.accessControlPolicy);
            bucket(model.bucket);
            contentMD5(model.contentMD5);
            checksumAlgorithm(model.checksumAlgorithm);
            grantFullControl(model.grantFullControl);
            grantRead(model.grantRead);
            grantReadACP(model.grantReadACP);
            grantWrite(model.grantWrite);
            grantWriteACP(model.grantWriteACP);
            expectedBucketOwner(model.expectedBucketOwner);
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

        public final AccessControlPolicy.Builder getAccessControlPolicy() {
            return accessControlPolicy != null ? accessControlPolicy.toBuilder() : null;
        }

        public final void setAccessControlPolicy(AccessControlPolicy.BuilderImpl accessControlPolicy) {
            this.accessControlPolicy = accessControlPolicy != null ? accessControlPolicy.build() : null;
        }

        @Override
        public final Builder accessControlPolicy(AccessControlPolicy accessControlPolicy) {
            this.accessControlPolicy = accessControlPolicy;
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

        public final String getContentMD5() {
            return contentMD5;
        }

        public final void setContentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
        }

        @Override
        public final Builder contentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
            return this;
        }

        public final String getChecksumAlgorithm() {
            return checksumAlgorithm;
        }

        public final void setChecksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
        }

        @Override
        public final Builder checksumAlgorithm(String checksumAlgorithm) {
            this.checksumAlgorithm = checksumAlgorithm;
            return this;
        }

        @Override
        public final Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
            this.checksumAlgorithm(checksumAlgorithm == null ? null : checksumAlgorithm.toString());
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

        public final String getExpectedBucketOwner() {
            return expectedBucketOwner;
        }

        public final void setExpectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
        }

        @Override
        public final Builder expectedBucketOwner(String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
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
        public PutBucketAclRequest build() {
            return new PutBucketAclRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
