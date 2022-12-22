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
 * Container for elements related to a part.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Part implements SdkPojo, Serializable, ToCopyableBuilder<Part.Builder, Part> {
    private static final SdkField<Integer> PART_NUMBER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartNumber")
            .getter(getter(Part::partNumber))
            .setter(setter(Builder::partNumber))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PartNumber")
                    .unmarshallLocationName("PartNumber").build()).build();

    private static final SdkField<Instant> LAST_MODIFIED_FIELD = SdkField
            .<Instant> builder(MarshallingType.INSTANT)
            .memberName("LastModified")
            .getter(getter(Part::lastModified))
            .setter(setter(Builder::lastModified))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("LastModified")
                    .unmarshallLocationName("LastModified").build()).build();

    private static final SdkField<String> E_TAG_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ETag")
            .getter(getter(Part::eTag))
            .setter(setter(Builder::eTag))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ETag")
                    .unmarshallLocationName("ETag").build()).build();

    private static final SdkField<Long> SIZE_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("Size")
            .getter(getter(Part::size))
            .setter(setter(Builder::size))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Size")
                    .unmarshallLocationName("Size").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32")
            .getter(getter(Part::checksumCRC32))
            .setter(setter(Builder::checksumCRC32))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumCRC32")
                    .unmarshallLocationName("ChecksumCRC32").build()).build();

    private static final SdkField<String> CHECKSUM_CRC32_C_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumCRC32C")
            .getter(getter(Part::checksumCRC32C))
            .setter(setter(Builder::checksumCRC32C))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumCRC32C")
                    .unmarshallLocationName("ChecksumCRC32C").build()).build();

    private static final SdkField<String> CHECKSUM_SHA1_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA1")
            .getter(getter(Part::checksumSHA1))
            .setter(setter(Builder::checksumSHA1))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumSHA1")
                    .unmarshallLocationName("ChecksumSHA1").build()).build();

    private static final SdkField<String> CHECKSUM_SHA256_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ChecksumSHA256")
            .getter(getter(Part::checksumSHA256))
            .setter(setter(Builder::checksumSHA256))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ChecksumSHA256")
                    .unmarshallLocationName("ChecksumSHA256").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PART_NUMBER_FIELD,
            LAST_MODIFIED_FIELD, E_TAG_FIELD, SIZE_FIELD, CHECKSUM_CRC32_FIELD, CHECKSUM_CRC32_C_FIELD, CHECKSUM_SHA1_FIELD,
            CHECKSUM_SHA256_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer partNumber;

    private final Instant lastModified;

    private final String eTag;

    private final Long size;

    private final String checksumCRC32;

    private final String checksumCRC32C;

    private final String checksumSHA1;

    private final String checksumSHA256;

    private Part(BuilderImpl builder) {
        this.partNumber = builder.partNumber;
        this.lastModified = builder.lastModified;
        this.eTag = builder.eTag;
        this.size = builder.size;
        this.checksumCRC32 = builder.checksumCRC32;
        this.checksumCRC32C = builder.checksumCRC32C;
        this.checksumSHA1 = builder.checksumSHA1;
        this.checksumSHA256 = builder.checksumSHA256;
    }

    /**
     * <p>
     * Part number identifying the part. This is a positive integer between 1 and 10,000.
     * </p>
     * 
     * @return Part number identifying the part. This is a positive integer between 1 and 10,000.
     */
    public final Integer partNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Date and time at which the part was uploaded.
     * </p>
     * 
     * @return Date and time at which the part was uploaded.
     */
    public final Instant lastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Entity tag returned when the part was uploaded.
     * </p>
     * 
     * @return Entity tag returned when the part was uploaded.
     */
    public final String eTag() {
        return eTag;
    }

    /**
     * <p>
     * Size in bytes of the uploaded part data.
     * </p>
     * 
     * @return Size in bytes of the uploaded part data.
     */
    public final Long size() {
        return size;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32() {
        return checksumCRC32;
    }

    /**
     * <p>
     * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded
     *         with the object. With multipart uploads, this may not be a checksum value of the object. For more
     *         information about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumCRC32C() {
        return checksumCRC32C;
    }

    /**
     * <p>
     * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the
     * object. With multipart uploads, this may not be a checksum value of the object. For more information about how
     * checksums are calculated with multipart uploads, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums">
     * Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with
     *         the object. With multipart uploads, this may not be a checksum value of the object. For more information
     *         about how checksums are calculated with multipart uploads, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
     *         > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA1() {
        return checksumSHA1;
    }

    /**
     * <p>
     * This header can be used as a data integrity check to verify that the data received is the same data that was
     * originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
     * integrity</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return This header can be used as a data integrity check to verify that the data received is the same data that
     *         was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
     *         object integrity</a> in the <i>Amazon S3 User Guide</i>.
     */
    public final String checksumSHA256() {
        return checksumSHA256;
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
        hashCode = 31 * hashCode + Objects.hashCode(partNumber());
        hashCode = 31 * hashCode + Objects.hashCode(lastModified());
        hashCode = 31 * hashCode + Objects.hashCode(eTag());
        hashCode = 31 * hashCode + Objects.hashCode(size());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32());
        hashCode = 31 * hashCode + Objects.hashCode(checksumCRC32C());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA1());
        hashCode = 31 * hashCode + Objects.hashCode(checksumSHA256());
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
        if (!(obj instanceof Part)) {
            return false;
        }
        Part other = (Part) obj;
        return Objects.equals(partNumber(), other.partNumber()) && Objects.equals(lastModified(), other.lastModified())
                && Objects.equals(eTag(), other.eTag()) && Objects.equals(size(), other.size())
                && Objects.equals(checksumCRC32(), other.checksumCRC32())
                && Objects.equals(checksumCRC32C(), other.checksumCRC32C())
                && Objects.equals(checksumSHA1(), other.checksumSHA1())
                && Objects.equals(checksumSHA256(), other.checksumSHA256());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Part").add("PartNumber", partNumber()).add("LastModified", lastModified()).add("ETag", eTag())
                .add("Size", size()).add("ChecksumCRC32", checksumCRC32()).add("ChecksumCRC32C", checksumCRC32C())
                .add("ChecksumSHA1", checksumSHA1()).add("ChecksumSHA256", checksumSHA256()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "PartNumber":
            return Optional.ofNullable(clazz.cast(partNumber()));
        case "LastModified":
            return Optional.ofNullable(clazz.cast(lastModified()));
        case "ETag":
            return Optional.ofNullable(clazz.cast(eTag()));
        case "Size":
            return Optional.ofNullable(clazz.cast(size()));
        case "ChecksumCRC32":
            return Optional.ofNullable(clazz.cast(checksumCRC32()));
        case "ChecksumCRC32C":
            return Optional.ofNullable(clazz.cast(checksumCRC32C()));
        case "ChecksumSHA1":
            return Optional.ofNullable(clazz.cast(checksumSHA1()));
        case "ChecksumSHA256":
            return Optional.ofNullable(clazz.cast(checksumSHA256()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Part, T> g) {
        return obj -> g.apply((Part) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Part> {
        /**
         * <p>
         * Part number identifying the part. This is a positive integer between 1 and 10,000.
         * </p>
         * 
         * @param partNumber
         *        Part number identifying the part. This is a positive integer between 1 and 10,000.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partNumber(Integer partNumber);

        /**
         * <p>
         * Date and time at which the part was uploaded.
         * </p>
         * 
         * @param lastModified
         *        Date and time at which the part was uploaded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lastModified(Instant lastModified);

        /**
         * <p>
         * Entity tag returned when the part was uploaded.
         * </p>
         * 
         * @param eTag
         *        Entity tag returned when the part was uploaded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eTag(String eTag);

        /**
         * <p>
         * Size in bytes of the uploaded part data.
         * </p>
         * 
         * @param size
         *        Size in bytes of the uploaded part data.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder size(Long size);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32(String checksumCRC32);

        /**
         * <p>
         * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with
         * the object. With multipart uploads, this may not be a checksum value of the object. For more information
         * about how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumCRC32C
         *        The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumCRC32C(String checksumCRC32C);

        /**
         * <p>
         * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the
         * object. With multipart uploads, this may not be a checksum value of the object. For more information about
         * how checksums are calculated with multipart uploads, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         * > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA1
         *        The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded
         *        with the object. With multipart uploads, this may not be a checksum value of the object. For more
         *        information about how checksums are calculated with multipart uploads, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html#large-object-checksums"
         *        > Checking object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA1(String checksumSHA1);

        /**
         * <p>
         * This header can be used as a data integrity check to verify that the data received is the same data that was
         * originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more
         * information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking object
         * integrity</a> in the <i>Amazon S3 User Guide</i>.
         * </p>
         * 
         * @param checksumSHA256
         *        This header can be used as a data integrity check to verify that the data received is the same data
         *        that was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the
         *        object. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/checking-object-integrity.html">Checking
         *        object integrity</a> in the <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder checksumSHA256(String checksumSHA256);
    }

    static final class BuilderImpl implements Builder {
        private Integer partNumber;

        private Instant lastModified;

        private String eTag;

        private Long size;

        private String checksumCRC32;

        private String checksumCRC32C;

        private String checksumSHA1;

        private String checksumSHA256;

        private BuilderImpl() {
        }

        private BuilderImpl(Part model) {
            partNumber(model.partNumber);
            lastModified(model.lastModified);
            eTag(model.eTag);
            size(model.size);
            checksumCRC32(model.checksumCRC32);
            checksumCRC32C(model.checksumCRC32C);
            checksumSHA1(model.checksumSHA1);
            checksumSHA256(model.checksumSHA256);
        }

        public final Integer getPartNumber() {
            return partNumber;
        }

        public final void setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
        }

        @Override
        public final Builder partNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public final Instant getLastModified() {
            return lastModified;
        }

        public final void setLastModified(Instant lastModified) {
            this.lastModified = lastModified;
        }

        @Override
        public final Builder lastModified(Instant lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public final String getETag() {
            return eTag;
        }

        public final void setETag(String eTag) {
            this.eTag = eTag;
        }

        @Override
        public final Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        public final Long getSize() {
            return size;
        }

        public final void setSize(Long size) {
            this.size = size;
        }

        @Override
        public final Builder size(Long size) {
            this.size = size;
            return this;
        }

        public final String getChecksumCRC32() {
            return checksumCRC32;
        }

        public final void setChecksumCRC32(String checksumCRC32) {
            this.checksumCRC32 = checksumCRC32;
        }

        @Override
        public final Builder checksumCRC32(String checksumCRC32) {
            this.checksumCRC32 = checksumCRC32;
            return this;
        }

        public final String getChecksumCRC32C() {
            return checksumCRC32C;
        }

        public final void setChecksumCRC32C(String checksumCRC32C) {
            this.checksumCRC32C = checksumCRC32C;
        }

        @Override
        public final Builder checksumCRC32C(String checksumCRC32C) {
            this.checksumCRC32C = checksumCRC32C;
            return this;
        }

        public final String getChecksumSHA1() {
            return checksumSHA1;
        }

        public final void setChecksumSHA1(String checksumSHA1) {
            this.checksumSHA1 = checksumSHA1;
        }

        @Override
        public final Builder checksumSHA1(String checksumSHA1) {
            this.checksumSHA1 = checksumSHA1;
            return this;
        }

        public final String getChecksumSHA256() {
            return checksumSHA256;
        }

        public final void setChecksumSHA256(String checksumSHA256) {
            this.checksumSHA256 = checksumSHA256;
        }

        @Override
        public final Builder checksumSHA256(String checksumSHA256) {
            this.checksumSHA256 = checksumSHA256;
            return this;
        }

        @Override
        public Part build() {
            return new Part(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
