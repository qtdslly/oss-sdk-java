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
 * Specifies the byte range of the object to get the records from. A record is processed when its first byte is
 * contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616, Section
 * 14.35.1 about how to specify the start and end of the range.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ScanRange implements SdkPojo, Serializable, ToCopyableBuilder<ScanRange.Builder, ScanRange> {
    private static final SdkField<Long> START_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("Start")
            .getter(getter(ScanRange::start))
            .setter(setter(Builder::start))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Start")
                    .unmarshallLocationName("Start").build()).build();

    private static final SdkField<Long> END_FIELD = SdkField
            .<Long> builder(MarshallingType.LONG)
            .memberName("End")
            .getter(getter(ScanRange::end))
            .setter(setter(Builder::end))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("End").unmarshallLocationName("End")
                    .build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(START_FIELD, END_FIELD));

    private static final long serialVersionUID = 1L;

    private final Long start;

    private final Long end;

    private ScanRange(BuilderImpl builder) {
        this.start = builder.start;
        this.end = builder.end;
    }

    /**
     * <p>
     * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The
     * default value is 0. If only <code>start</code> is supplied, it means scan from that point to the end of the file.
     * For example, <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> means scan from byte
     * 50 until the end of the file.
     * </p>
     * 
     * @return Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers.
     *         The default value is 0. If only <code>start</code> is supplied, it means scan from that point to the end
     *         of the file. For example, <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *         means scan from byte 50 until the end of the file.
     */
    public final Long start() {
        return start;
    }

    /**
     * <p>
     * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The default
     * value is one less than the size of the object being queried. If only the End parameter is supplied, it is
     * interpreted to mean scan the last N bytes of the file. For example,
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> means scan the last 50 bytes.
     * </p>
     * 
     * @return Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The
     *         default value is one less than the size of the object being queried. If only the End parameter is
     *         supplied, it is interpreted to mean scan the last N bytes of the file. For example,
     *         <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> means scan the last 50 bytes.
     */
    public final Long end() {
        return end;
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
        hashCode = 31 * hashCode + Objects.hashCode(start());
        hashCode = 31 * hashCode + Objects.hashCode(end());
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
        if (!(obj instanceof ScanRange)) {
            return false;
        }
        ScanRange other = (ScanRange) obj;
        return Objects.equals(start(), other.start()) && Objects.equals(end(), other.end());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ScanRange").add("Start", start()).add("End", end()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Start":
            return Optional.ofNullable(clazz.cast(start()));
        case "End":
            return Optional.ofNullable(clazz.cast(end()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ScanRange, T> g) {
        return obj -> g.apply((ScanRange) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ScanRange> {
        /**
         * <p>
         * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The
         * default value is 0. If only <code>start</code> is supplied, it means scan from that point to the end of the
         * file. For example, <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> means scan
         * from byte 50 until the end of the file.
         * </p>
         * 
         * @param start
         *        Specifies the start of the byte range. This parameter is optional. Valid values: non-negative
         *        integers. The default value is 0. If only <code>start</code> is supplied, it means scan from that
         *        point to the end of the file. For example,
         *        <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code> means scan from byte 50
         *        until the end of the file.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder start(Long start);

        /**
         * <p>
         * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The
         * default value is one less than the size of the object being queried. If only the End parameter is supplied,
         * it is interpreted to mean scan the last N bytes of the file. For example,
         * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> means scan the last 50 bytes.
         * </p>
         * 
         * @param end
         *        Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers.
         *        The default value is one less than the size of the object being queried. If only the End parameter is
         *        supplied, it is interpreted to mean scan the last N bytes of the file. For example,
         *        <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code> means scan the last 50
         *        bytes.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder end(Long end);
    }

    static final class BuilderImpl implements Builder {
        private Long start;

        private Long end;

        private BuilderImpl() {
        }

        private BuilderImpl(ScanRange model) {
            start(model.start);
            end(model.end);
        }

        public final Long getStart() {
            return start;
        }

        public final void setStart(Long start) {
            this.start = start;
        }

        @Override
        public final Builder start(Long start) {
            this.start = start;
            return this;
        }

        public final Long getEnd() {
            return end;
        }

        public final void setEnd(Long end) {
            this.end = end;
        }

        @Override
        public final Builder end(Long end) {
            this.end = end;
            return this;
        }

        @Override
        public ScanRange build() {
            return new ScanRange(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
