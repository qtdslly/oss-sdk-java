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

import java.time.Instant;
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
public final class ListPartsResponse extends S3Response implements
        ToCopyableBuilder<ListPartsResponse.Builder, ListPartsResponse> {
    private static final SdkField<Instant> ABORT_DATE_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("AbortDate")
            .getter(getter(ListPartsResponse::abortDate))
            .setter(setter(Builder::abortDate))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-abort-date")
                    .unmarshallLocationName("x-amz-abort-date").build()).build();

    private static final SdkField<String> ABORT_RULE_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("AbortRuleId")
            .getter(getter(ListPartsResponse::abortRuleId))
            .setter(setter(Builder::abortRuleId))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-abort-rule-id")
                    .unmarshallLocationName("x-amz-abort-rule-id").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(ListPartsResponse::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(ListPartsResponse::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<String> UPLOAD_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("UploadId")
            .getter(getter(ListPartsResponse::uploadId))
            .setter(setter(Builder::uploadId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("UploadId")
                    .unmarshallLocationName("UploadId").build()).build();

    private static final SdkField<Integer> PART_NUMBER_MARKER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartNumberMarker")
            .getter(getter(ListPartsResponse::partNumberMarker))
            .setter(setter(Builder::partNumberMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PartNumberMarker")
                    .unmarshallLocationName("PartNumberMarker").build()).build();

    private static final SdkField<Integer> NEXT_PART_NUMBER_MARKER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("NextPartNumberMarker")
            .getter(getter(ListPartsResponse::nextPartNumberMarker))
            .setter(setter(Builder::nextPartNumberMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextPartNumberMarker")
                    .unmarshallLocationName("NextPartNumberMarker").build()).build();

    private static final SdkField<Integer> MAX_PARTS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxParts")
            .getter(getter(ListPartsResponse::maxParts))
            .setter(setter(Builder::maxParts))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxParts")
                    .unmarshallLocationName("MaxParts").build()).build();

    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(ListPartsResponse::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<List<Part>> PARTS_FIELD = SdkField
            .<List<Part>> builder(MarshallingType.LIST)
            .memberName("Parts")
            .getter(getter(ListPartsResponse::parts))
            .setter(setter(Builder::parts))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Part")
                    .unmarshallLocationName("Part").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<Part> builder(MarshallingType.SDK_POJO)
                                            .constructor(Part::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<Initiator> INITIATOR_FIELD = SdkField
            .<Initiator> builder(MarshallingType.SDK_POJO)
            .memberName("Initiator")
            .getter(getter(ListPartsResponse::initiator))
            .setter(setter(Builder::initiator))
            .constructor(Initiator::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Initiator")
                    .unmarshallLocationName("Initiator").build()).build();

    private static final SdkField<Owner> OWNER_FIELD = SdkField
            .<Owner> builder(MarshallingType.SDK_POJO)
            .memberName("Owner")
            .getter(getter(ListPartsResponse::owner))
            .setter(setter(Builder::owner))
            .constructor(Owner::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Owner")
                    .unmarshallLocationName("Owner").build()).build();

    private static final SdkField<String> STORAGE_CLASS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("StorageClass")
            .getter(getter(ListPartsResponse::storageClassAsString))
            .setter(setter(Builder::storageClass))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("StorageClass")
                    .unmarshallLocationName("StorageClass").build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(ListPartsResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<String> CHECKSUM_ALGORITHM_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumAlgorithm")
            .getter(getter(ListPartsResponse::checksumAlgorithmAsString))
            .setter(setter(Builder::checksumAlgorithm))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumAlgorithm")
                    .unmarshallLocationName("ChecksumAlgorithm").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ABORT_DATE_FIELD,
            ABORT_RULE_ID_FIELD, BUCKET_FIELD, KEY_FIELD, UPLOAD_ID_FIELD, PART_NUMBER_MARKER_FIELD,
            NEXT_PART_NUMBER_MARKER_FIELD, MAX_PARTS_FIELD, IS_TRUNCATED_FIELD, PARTS_FIELD, INITIATOR_FIELD, OWNER_FIELD,
            STORAGE_CLASS_FIELD, REQUEST_CHARGED_FIELD, CHECKSUM_ALGORITHM_FIELD));

    private final Instant abortDate;

    private final String abortRuleId;

    private final String bucket;

    private final String key;

    private final String uploadId;

    private final Integer partNumberMarker;

    private final Integer nextPartNumberMarker;

    private final Integer maxParts;

    private final Boolean isTruncated;

    private final List<Part> parts;

    private final Initiator initiator;

    private final Owner owner;

    private final String storageClass;

    private final String requestCharged;

    private final String checksumAlgorithm;

    private ListPartsResponse(BuilderImpl builder) {
        super(builder);
        this.abortDate = builder.abortDate;
        this.abortRuleId = builder.abortRuleId;
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.partNumberMarker = builder.partNumberMarker;
        this.nextPartNumberMarker = builder.nextPartNumberMarker;
        this.maxParts = builder.maxParts;
        this.isTruncated = builder.isTruncated;
        this.parts = builder.parts;
        this.initiator = builder.initiator;
        this.owner = builder.owner;
        this.storageClass = builder.storageClass;
        this.requestCharged = builder.requestCharged;
        this.checksumAlgorithm = builder.checksumAlgorithm;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix
     * in the lifecycle rule matches the object name in the request, then the response includes this header indicating
     * when the initiated multipart upload will become eligible for abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
     * </p>
     * <p>
     * The response will also include the <code>x-amz-abort-rule-id</code> header that will provide the ID of the
     * lifecycle configuration rule that defines this action.
     * </p>
     * 
     * @return If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and
     *         the prefix in the lifecycle rule matches the object name in the request, then the response includes this
     *         header indicating when the initiated multipart upload will become eligible for abort operation. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.</p>
     *         <p>
     *         The response will also include the <code>x-amz-abort-rule-id</code> header that will provide the ID of
     *         the lifecycle configuration rule that defines this action.
     */
    public final Instant abortDate() {
        return abortDate;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code> header. It identifies applicable lifecycle
     * configuration rule that defines the action to abort incomplete multipart uploads.
     * </p>
     * 
     * @return This header is returned along with the <code>x-amz-abort-date</code> header. It identifies applicable
     *         lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
     */
    public final String abortRuleId() {
        return abortRuleId;
    }

    /**
     * <p>
     * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
     * access point alias if used.
     * </p>
     * 
     * @return The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN
     *         or access point alias if used.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * 
     * @return Object key for which the multipart upload was initiated.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose parts are being listed.
     * </p>
     * 
     * @return Upload ID identifying the multipart upload whose parts are being listed.
     */
    public final String uploadId() {
        return uploadId;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the
     * part-number-marker request parameter in a subsequent request.
     * </p>
     * 
     * @return When a list is truncated, this element specifies the last part in the list, as well as the value to use
     *         for the part-number-marker request parameter in a subsequent request.
     */
    public final Integer partNumberMarker() {
        return partNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the
     * part-number-marker request parameter in a subsequent request.
     * </p>
     * 
     * @return When a list is truncated, this element specifies the last part in the list, as well as the value to use
     *         for the part-number-marker request parameter in a subsequent request.
     */
    public final Integer nextPartNumberMarker() {
        return nextPartNumberMarker;
    }

    /**
     * <p>
     * Maximum number of parts that were allowed in the response.
     * </p>
     * 
     * @return Maximum number of parts that were allowed in the response.
     */
    public final Integer maxParts() {
        return maxParts;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value indicates that the list was truncated. A
     * list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     * 
     * @return Indicates whether the returned list of parts is truncated. A true value indicates that the list was
     *         truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts
     *         element.
     */
    public final Boolean isTruncated() {
        return isTruncated;
    }

    /**
     * For responses, this returns true if the service returned a value for the Parts property. This DOES NOT check that
     * the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is useful
     * because the SDK will never return a null collection or map, but you may need to differentiate between the service
     * returning nothing (or null) and the service returning an empty collection or map. For requests, this returns true
     * if a value for the property was specified in the request builder, and false if a value was not specified.
     */
    public final boolean hasParts() {
        return parts != null && !(parts instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for elements related to a particular part. A response can contain zero or more <code>Part</code>
     * elements.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasParts} method.
     * </p>
     * 
     * @return Container for elements related to a particular part. A response can contain zero or more
     *         <code>Part</code> elements.
     */
    public final List<Part> parts() {
        return parts;
    }

    /**
     * <p>
     * Container element that identifies who initiated the multipart upload. If the initiator is an Amazon Web Services
     * account, this element provides the same information as the <code>Owner</code> element. If the initiator is an IAM
     * User, this element provides the user ARN and display name.
     * </p>
     * 
     * @return Container element that identifies who initiated the multipart upload. If the initiator is an Amazon Web
     *         Services account, this element provides the same information as the <code>Owner</code> element. If the
     *         initiator is an IAM User, this element provides the user ARN and display name.
     */
    public final Initiator initiator() {
        return initiator;
    }

    /**
     * <p>
     * Container element that identifies the object owner, after the object is created. If multipart upload is initiated
     * by an IAM user, this element provides the parent account ID and display name.
     * </p>
     * 
     * @return Container element that identifies the object owner, after the object is created. If multipart upload is
     *         initiated by an IAM user, this element provides the parent account ID and display name.
     */
    public final Owner owner() {
        return owner;
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
     * @see StorageClass
     */
    public final StorageClass storageClass() {
        return StorageClass.fromValue(storageClass);
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #storageClass} will
     * return {@link StorageClass#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #storageClassAsString}.
     * </p>
     * 
     * @return Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
     * @see StorageClass
     */
    public final String storageClassAsString() {
        return storageClass;
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

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     * @see ChecksumAlgorithm
     */
    public final ChecksumAlgorithm checksumAlgorithm() {
        return ChecksumAlgorithm.fromValue(checksumAlgorithm);
    }

    /**
     * <p>
     * The algorithm that was used to create a checksum of the object.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #checksumAlgorithm}
     * will return {@link ChecksumAlgorithm#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #checksumAlgorithmAsString}.
     * </p>
     * 
     * @return The algorithm that was used to create a checksum of the object.
     * @see ChecksumAlgorithm
     */
    public final String checksumAlgorithmAsString() {
        return checksumAlgorithm;
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
        hashCode = 31 * hashCode + Objects.hashCode(abortDate());
        hashCode = 31 * hashCode + Objects.hashCode(abortRuleId());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(uploadId());
        hashCode = 31 * hashCode + Objects.hashCode(partNumberMarker());
        hashCode = 31 * hashCode + Objects.hashCode(nextPartNumberMarker());
        hashCode = 31 * hashCode + Objects.hashCode(maxParts());
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(hasParts() ? parts() : null);
        hashCode = 31 * hashCode + Objects.hashCode(initiator());
        hashCode = 31 * hashCode + Objects.hashCode(owner());
        hashCode = 31 * hashCode + Objects.hashCode(storageClassAsString());
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(checksumAlgorithmAsString());
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
        if (!(obj instanceof ListPartsResponse)) {
            return false;
        }
        ListPartsResponse other = (ListPartsResponse) obj;
        return Objects.equals(abortDate(), other.abortDate()) && Objects.equals(abortRuleId(), other.abortRuleId())
                && Objects.equals(bucket(), other.bucket()) && Objects.equals(key(), other.key())
                && Objects.equals(uploadId(), other.uploadId()) && Objects.equals(partNumberMarker(), other.partNumberMarker())
                && Objects.equals(nextPartNumberMarker(), other.nextPartNumberMarker())
                && Objects.equals(maxParts(), other.maxParts()) && Objects.equals(isTruncated(), other.isTruncated())
                && hasParts() == other.hasParts() && Objects.equals(parts(), other.parts())
                && Objects.equals(initiator(), other.initiator()) && Objects.equals(owner(), other.owner())
                && Objects.equals(storageClassAsString(), other.storageClassAsString())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString())
                && Objects.equals(checksumAlgorithmAsString(), other.checksumAlgorithmAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ListPartsResponse").add("AbortDate", abortDate()).add("AbortRuleId", abortRuleId())
                .add("Bucket", bucket()).add("Key", key()).add("UploadId", uploadId())
                .add("PartNumberMarker", partNumberMarker()).add("NextPartNumberMarker", nextPartNumberMarker())
                .add("MaxParts", maxParts()).add("IsTruncated", isTruncated()).add("Parts", hasParts() ? parts() : null)
                .add("Initiator", initiator()).add("Owner", owner()).add("StorageClass", storageClassAsString())
                .add("RequestCharged", requestChargedAsString()).add("ChecksumAlgorithm", checksumAlgorithmAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "AbortDate":
            return Optional.ofNullable(clazz.cast(abortDate()));
        case "AbortRuleId":
            return Optional.ofNullable(clazz.cast(abortRuleId()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "UploadId":
            return Optional.ofNullable(clazz.cast(uploadId()));
        case "PartNumberMarker":
            return Optional.ofNullable(clazz.cast(partNumberMarker()));
        case "NextPartNumberMarker":
            return Optional.ofNullable(clazz.cast(nextPartNumberMarker()));
        case "MaxParts":
            return Optional.ofNullable(clazz.cast(maxParts()));
        case "IsTruncated":
            return Optional.ofNullable(clazz.cast(isTruncated()));
        case "Parts":
            return Optional.ofNullable(clazz.cast(parts()));
        case "Initiator":
            return Optional.ofNullable(clazz.cast(initiator()));
        case "Owner":
            return Optional.ofNullable(clazz.cast(owner()));
        case "StorageClass":
            return Optional.ofNullable(clazz.cast(storageClassAsString()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "ChecksumAlgorithm":
            return Optional.ofNullable(clazz.cast(checksumAlgorithmAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ListPartsResponse, T> g) {
        return obj -> g.apply((ListPartsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, ListPartsResponse> {
        /**
         * <p>
         * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the
         * prefix in the lifecycle rule matches the object name in the request, then the response includes this header
         * indicating when the initiated multipart upload will become eligible for abort operation. For more
         * information, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
         * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
         * </p>
         * <p>
         * The response will also include the <code>x-amz-abort-rule-id</code> header that will provide the ID of the
         * lifecycle configuration rule that defines this action.
         * </p>
         * 
         * @param abortDate
         *        If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and
         *        the prefix in the lifecycle rule matches the object name in the request, then the response includes
         *        this header indicating when the initiated multipart upload will become eligible for abort operation.
         *        For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
         *        >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.</p>
         *        <p>
         *        The response will also include the <code>x-amz-abort-rule-id</code> header that will provide the ID of
         *        the lifecycle configuration rule that defines this action.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder abortDate(Instant abortDate);

        /**
         * <p>
         * This header is returned along with the <code>x-amz-abort-date</code> header. It identifies applicable
         * lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
         * </p>
         * 
         * @param abortRuleId
         *        This header is returned along with the <code>x-amz-abort-date</code> header. It identifies applicable
         *        lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder abortRuleId(String abortRuleId);

        /**
         * <p>
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or
         * access point alias if used.
         * </p>
         * 
         * @param bucket
         *        The name of the bucket to which the multipart upload was initiated. Does not return the access point
         *        ARN or access point alias if used.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * Object key for which the multipart upload was initiated.
         * </p>
         * 
         * @param key
         *        Object key for which the multipart upload was initiated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * Upload ID identifying the multipart upload whose parts are being listed.
         * </p>
         * 
         * @param uploadId
         *        Upload ID identifying the multipart upload whose parts are being listed.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder uploadId(String uploadId);

        /**
         * <p>
         * When a list is truncated, this element specifies the last part in the list, as well as the value to use for
         * the part-number-marker request parameter in a subsequent request.
         * </p>
         * 
         * @param partNumberMarker
         *        When a list is truncated, this element specifies the last part in the list, as well as the value to
         *        use for the part-number-marker request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partNumberMarker(Integer partNumberMarker);

        /**
         * <p>
         * When a list is truncated, this element specifies the last part in the list, as well as the value to use for
         * the part-number-marker request parameter in a subsequent request.
         * </p>
         * 
         * @param nextPartNumberMarker
         *        When a list is truncated, this element specifies the last part in the list, as well as the value to
         *        use for the part-number-marker request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextPartNumberMarker(Integer nextPartNumberMarker);

        /**
         * <p>
         * Maximum number of parts that were allowed in the response.
         * </p>
         * 
         * @param maxParts
         *        Maximum number of parts that were allowed in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxParts(Integer maxParts);

        /**
         * <p>
         * Indicates whether the returned list of parts is truncated. A true value indicates that the list was
         * truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of parts is truncated. A true value indicates that the list was
         *        truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts
         *        element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * Container for elements related to a particular part. A response can contain zero or more <code>Part</code>
         * elements.
         * </p>
         * 
         * @param parts
         *        Container for elements related to a particular part. A response can contain zero or more
         *        <code>Part</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(Collection<Part> parts);

        /**
         * <p>
         * Container for elements related to a particular part. A response can contain zero or more <code>Part</code>
         * elements.
         * </p>
         * 
         * @param parts
         *        Container for elements related to a particular part. A response can contain zero or more
         *        <code>Part</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(Part... parts);

        /**
         * <p>
         * Container for elements related to a particular part. A response can contain zero or more <code>Part</code>
         * elements.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Part.Builder} avoiding the need to create one manually via
         * {@link Part#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Part.Builder#build()} is
         * called immediately and its result is passed to {@link #parts(List<Part>)}.
         * 
         * @param parts
         *        a consumer that will call methods on {@link Part.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #parts(Collection<Part>)
         */
        Builder parts(Consumer<Part.Builder>... parts);

        /**
         * <p>
         * Container element that identifies who initiated the multipart upload. If the initiator is an Amazon Web
         * Services account, this element provides the same information as the <code>Owner</code> element. If the
         * initiator is an IAM User, this element provides the user ARN and display name.
         * </p>
         * 
         * @param initiator
         *        Container element that identifies who initiated the multipart upload. If the initiator is an Amazon
         *        Web Services account, this element provides the same information as the <code>Owner</code> element. If
         *        the initiator is an IAM User, this element provides the user ARN and display name.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder initiator(Initiator initiator);

        /**
         * <p>
         * Container element that identifies who initiated the multipart upload. If the initiator is an Amazon Web
         * Services account, this element provides the same information as the <code>Owner</code> element. If the
         * initiator is an IAM User, this element provides the user ARN and display name.
         * </p>
         * This is a convenience method that creates an instance of the {@link Initiator.Builder} avoiding the need to
         * create one manually via {@link Initiator#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Initiator.Builder#build()} is called immediately and its result
         * is passed to {@link #initiator(Initiator)}.
         * 
         * @param initiator
         *        a consumer that will call methods on {@link Initiator.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #initiator(Initiator)
         */
        default Builder initiator(Consumer<Initiator.Builder> initiator) {
            return initiator(Initiator.builder().applyMutation(initiator).build());
        }

        /**
         * <p>
         * Container element that identifies the object owner, after the object is created. If multipart upload is
         * initiated by an IAM user, this element provides the parent account ID and display name.
         * </p>
         * 
         * @param owner
         *        Container element that identifies the object owner, after the object is created. If multipart upload
         *        is initiated by an IAM user, this element provides the parent account ID and display name.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder owner(Owner owner);

        /**
         * <p>
         * Container element that identifies the object owner, after the object is created. If multipart upload is
         * initiated by an IAM user, this element provides the parent account ID and display name.
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
         * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
         * </p>
         * 
         * @param storageClass
         *        Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(String storageClass);

        /**
         * <p>
         * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
         * </p>
         * 
         * @param storageClass
         *        Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
         * @see StorageClass
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClass
         */
        Builder storageClass(StorageClass storageClass);

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

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(String checksumAlgorithm);

        /**
         * <p>
         * The algorithm that was used to create a checksum of the object.
         * </p>
         * 
         * @param checksumAlgorithm
         *        The algorithm that was used to create a checksum of the object.
         * @see ChecksumAlgorithm
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ChecksumAlgorithm
         */
        Builder checksumAlgorithm(ChecksumAlgorithm checksumAlgorithm);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private Instant abortDate;

        private String abortRuleId;

        private String bucket;

        private String key;

        private String uploadId;

        private Integer partNumberMarker;

        private Integer nextPartNumberMarker;

        private Integer maxParts;

        private Boolean isTruncated;

        private List<Part> parts = DefaultSdkAutoConstructList.getInstance();

        private Initiator initiator;

        private Owner owner;

        private String storageClass;

        private String requestCharged;

        private String checksumAlgorithm;

        private BuilderImpl() {
        }

        private BuilderImpl(ListPartsResponse model) {
            super(model);
            abortDate(model.abortDate);
            abortRuleId(model.abortRuleId);
            bucket(model.bucket);
            key(model.key);
            uploadId(model.uploadId);
            partNumberMarker(model.partNumberMarker);
            nextPartNumberMarker(model.nextPartNumberMarker);
            maxParts(model.maxParts);
            isTruncated(model.isTruncated);
            parts(model.parts);
            initiator(model.initiator);
            owner(model.owner);
            storageClass(model.storageClass);
            requestCharged(model.requestCharged);
            checksumAlgorithm(model.checksumAlgorithm);
        }

        public final Instant getAbortDate() {
            return abortDate;
        }

        public final void setAbortDate(Instant abortDate) {
            this.abortDate = abortDate;
        }

        @Override
        public final Builder abortDate(Instant abortDate) {
            this.abortDate = abortDate;
            return this;
        }

        public final String getAbortRuleId() {
            return abortRuleId;
        }

        public final void setAbortRuleId(String abortRuleId) {
            this.abortRuleId = abortRuleId;
        }

        @Override
        public final Builder abortRuleId(String abortRuleId) {
            this.abortRuleId = abortRuleId;
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

        public final String getKey() {
            return key;
        }

        public final void setKey(String key) {
            this.key = key;
        }

        @Override
        public final Builder key(String key) {
            this.key = key;
            return this;
        }

        public final String getUploadId() {
            return uploadId;
        }

        public final void setUploadId(String uploadId) {
            this.uploadId = uploadId;
        }

        @Override
        public final Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public final Integer getPartNumberMarker() {
            return partNumberMarker;
        }

        public final void setPartNumberMarker(Integer partNumberMarker) {
            this.partNumberMarker = partNumberMarker;
        }

        @Override
        public final Builder partNumberMarker(Integer partNumberMarker) {
            this.partNumberMarker = partNumberMarker;
            return this;
        }

        public final Integer getNextPartNumberMarker() {
            return nextPartNumberMarker;
        }

        public final void setNextPartNumberMarker(Integer nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
        }

        @Override
        public final Builder nextPartNumberMarker(Integer nextPartNumberMarker) {
            this.nextPartNumberMarker = nextPartNumberMarker;
            return this;
        }

        public final Integer getMaxParts() {
            return maxParts;
        }

        public final void setMaxParts(Integer maxParts) {
            this.maxParts = maxParts;
        }

        @Override
        public final Builder maxParts(Integer maxParts) {
            this.maxParts = maxParts;
            return this;
        }

        public final Boolean getIsTruncated() {
            return isTruncated;
        }

        public final void setIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
        }

        @Override
        public final Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        public final List<Part.Builder> getParts() {
            List<Part.Builder> result = PartsCopier.copyToBuilder(this.parts);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setParts(Collection<Part.BuilderImpl> parts) {
            this.parts = PartsCopier.copyFromBuilder(parts);
        }

        @Override
        public final Builder parts(Collection<Part> parts) {
            this.parts = PartsCopier.copy(parts);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(Part... parts) {
            parts(Arrays.asList(parts));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(Consumer<Part.Builder>... parts) {
            parts(Stream.of(parts).map(c -> Part.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final Initiator.Builder getInitiator() {
            return initiator != null ? initiator.toBuilder() : null;
        }

        public final void setInitiator(Initiator.BuilderImpl initiator) {
            this.initiator = initiator != null ? initiator.build() : null;
        }

        @Override
        public final Builder initiator(Initiator initiator) {
            this.initiator = initiator;
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

        @Override
        public ListPartsResponse build() {
            return new ListPartsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
