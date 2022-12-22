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
 * Contains information about where to publish the analytics results.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class AnalyticsS3BucketDestination implements SdkPojo, Serializable,
        ToCopyableBuilder<AnalyticsS3BucketDestination.Builder, AnalyticsS3BucketDestination> {
    private static final SdkField<String> FORMAT_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Format")
            .getter(getter(AnalyticsS3BucketDestination::formatAsString))
            .setter(setter(Builder::format))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Format")
                    .unmarshallLocationName("Format").build()).build();

    private static final SdkField<String> BUCKET_ACCOUNT_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("BucketAccountId")
            .getter(getter(AnalyticsS3BucketDestination::bucketAccountId))
            .setter(setter(Builder::bucketAccountId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("BucketAccountId")
                    .unmarshallLocationName("BucketAccountId").build()).build();

    private static final SdkField<String> BUCKET_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Bucket")
            .getter(getter(AnalyticsS3BucketDestination::bucket))
            .setter(setter(Builder::bucket))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Bucket")
                    .unmarshallLocationName("Bucket").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(AnalyticsS3BucketDestination::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(FORMAT_FIELD,
            BUCKET_ACCOUNT_ID_FIELD, BUCKET_FIELD, PREFIX_FIELD));

    private static final long serialVersionUID = 1L;

    private final String format;

    private final String bucketAccountId;

    private final String bucket;

    private final String prefix;

    private AnalyticsS3BucketDestination(BuilderImpl builder) {
        this.format = builder.format;
        this.bucketAccountId = builder.bucketAccountId;
        this.bucket = builder.bucket;
        this.prefix = builder.prefix;
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #format} will
     * return {@link AnalyticsS3ExportFileFormat#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #formatAsString}.
     * </p>
     * 
     * @return Specifies the file format used when exporting data to Amazon S3.
     * @see AnalyticsS3ExportFileFormat
     */
    public final AnalyticsS3ExportFileFormat format() {
        return AnalyticsS3ExportFileFormat.fromValue(format);
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #format} will
     * return {@link AnalyticsS3ExportFileFormat#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is
     * available from {@link #formatAsString}.
     * </p>
     * 
     * @return Specifies the file format used when exporting data to Amazon S3.
     * @see AnalyticsS3ExportFileFormat
     */
    public final String formatAsString() {
        return format;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated
     * before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to help prevent problems if the
     * destination bucket ownership changes.
     * </p>
     * </note>
     * 
     * @return The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not
     *         validated before exporting data.</p> <note>
     *         <p>
     *         Although this value is optional, we strongly recommend that you set it to help prevent problems if the
     *         destination bucket ownership changes.
     *         </p>
     */
    public final String bucketAccountId() {
        return bucketAccountId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket to which data is exported.
     */
    public final String bucket() {
        return bucket;
    }

    /**
     * <p>
     * The prefix to use when exporting data. The prefix is prepended to all results.
     * </p>
     * 
     * @return The prefix to use when exporting data. The prefix is prepended to all results.
     */
    public final String prefix() {
        return prefix;
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
        hashCode = 31 * hashCode + Objects.hashCode(formatAsString());
        hashCode = 31 * hashCode + Objects.hashCode(bucketAccountId());
        hashCode = 31 * hashCode + Objects.hashCode(bucket());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
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
        if (!(obj instanceof AnalyticsS3BucketDestination)) {
            return false;
        }
        AnalyticsS3BucketDestination other = (AnalyticsS3BucketDestination) obj;
        return Objects.equals(formatAsString(), other.formatAsString())
                && Objects.equals(bucketAccountId(), other.bucketAccountId()) && Objects.equals(bucket(), other.bucket())
                && Objects.equals(prefix(), other.prefix());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("AnalyticsS3BucketDestination").add("Format", formatAsString())
                .add("BucketAccountId", bucketAccountId()).add("Bucket", bucket()).add("Prefix", prefix()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Format":
            return Optional.ofNullable(clazz.cast(formatAsString()));
        case "BucketAccountId":
            return Optional.ofNullable(clazz.cast(bucketAccountId()));
        case "Bucket":
            return Optional.ofNullable(clazz.cast(bucket()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<AnalyticsS3BucketDestination, T> g) {
        return obj -> g.apply((AnalyticsS3BucketDestination) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, AnalyticsS3BucketDestination> {
        /**
         * <p>
         * Specifies the file format used when exporting data to Amazon S3.
         * </p>
         * 
         * @param format
         *        Specifies the file format used when exporting data to Amazon S3.
         * @see AnalyticsS3ExportFileFormat
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see AnalyticsS3ExportFileFormat
         */
        Builder format(String format);

        /**
         * <p>
         * Specifies the file format used when exporting data to Amazon S3.
         * </p>
         * 
         * @param format
         *        Specifies the file format used when exporting data to Amazon S3.
         * @see AnalyticsS3ExportFileFormat
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see AnalyticsS3ExportFileFormat
         */
        Builder format(AnalyticsS3ExportFileFormat format);

        /**
         * <p>
         * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated
         * before exporting data.
         * </p>
         * <note>
         * <p>
         * Although this value is optional, we strongly recommend that you set it to help prevent problems if the
         * destination bucket ownership changes.
         * </p>
         * </note>
         * 
         * @param bucketAccountId
         *        The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not
         *        validated before exporting data.</p> <note>
         *        <p>
         *        Although this value is optional, we strongly recommend that you set it to help prevent problems if the
         *        destination bucket ownership changes.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucketAccountId(String bucketAccountId);

        /**
         * <p>
         * The Amazon Resource Name (ARN) of the bucket to which data is exported.
         * </p>
         * 
         * @param bucket
         *        The Amazon Resource Name (ARN) of the bucket to which data is exported.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder bucket(String bucket);

        /**
         * <p>
         * The prefix to use when exporting data. The prefix is prepended to all results.
         * </p>
         * 
         * @param prefix
         *        The prefix to use when exporting data. The prefix is prepended to all results.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder prefix(String prefix);
    }

    static final class BuilderImpl implements Builder {
        private String format;

        private String bucketAccountId;

        private String bucket;

        private String prefix;

        private BuilderImpl() {
        }

        private BuilderImpl(AnalyticsS3BucketDestination model) {
            format(model.format);
            bucketAccountId(model.bucketAccountId);
            bucket(model.bucket);
            prefix(model.prefix);
        }

        public final String getFormat() {
            return format;
        }

        public final void setFormat(String format) {
            this.format = format;
        }

        @Override
        public final Builder format(String format) {
            this.format = format;
            return this;
        }

        @Override
        public final Builder format(AnalyticsS3ExportFileFormat format) {
            this.format(format == null ? null : format.toString());
            return this;
        }

        public final String getBucketAccountId() {
            return bucketAccountId;
        }

        public final void setBucketAccountId(String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
        }

        @Override
        public final Builder bucketAccountId(String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
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

        public final String getPrefix() {
            return prefix;
        }

        public final void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public final Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        @Override
        public AnalyticsS3BucketDestination build() {
            return new AnalyticsS3BucketDestination(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
