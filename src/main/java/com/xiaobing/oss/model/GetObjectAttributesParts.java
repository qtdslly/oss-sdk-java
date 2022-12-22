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
 * <p>
 * A collection of parts associated with a multipart upload.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class GetObjectAttributesParts implements SdkPojo, Serializable,
        ToCopyableBuilder<GetObjectAttributesParts.Builder, GetObjectAttributesParts> {
    private static final SdkField<Integer> TOTAL_PARTS_COUNT_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("TotalPartsCount")
            .getter(getter(GetObjectAttributesParts::totalPartsCount))
            .setter(setter(Builder::totalPartsCount))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PartsCount")
                    .unmarshallLocationName("PartsCount").build()).build();

    private static final SdkField<Integer> PART_NUMBER_MARKER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("PartNumberMarker")
            .getter(getter(GetObjectAttributesParts::partNumberMarker))
            .setter(setter(Builder::partNumberMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PartNumberMarker")
                    .unmarshallLocationName("PartNumberMarker").build()).build();

    private static final SdkField<Integer> NEXT_PART_NUMBER_MARKER_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("NextPartNumberMarker")
            .getter(getter(GetObjectAttributesParts::nextPartNumberMarker))
            .setter(setter(Builder::nextPartNumberMarker))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NextPartNumberMarker")
                    .unmarshallLocationName("NextPartNumberMarker").build()).build();

    private static final SdkField<Integer> MAX_PARTS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("MaxParts")
            .getter(getter(GetObjectAttributesParts::maxParts))
            .setter(setter(Builder::maxParts))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("MaxParts")
                    .unmarshallLocationName("MaxParts").build()).build();

    private static final SdkField<Boolean> IS_TRUNCATED_FIELD = SdkField
            .<Boolean> builder(MarshallingType.BOOLEAN)
            .memberName("IsTruncated")
            .getter(getter(GetObjectAttributesParts::isTruncated))
            .setter(setter(Builder::isTruncated))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IsTruncated")
                    .unmarshallLocationName("IsTruncated").build()).build();

    private static final SdkField<List<ObjectPart>> PARTS_FIELD = SdkField
            .<List<ObjectPart>> builder(MarshallingType.LIST)
            .memberName("Parts")
            .getter(getter(GetObjectAttributesParts::parts))
            .setter(setter(Builder::parts))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Part")
                    .unmarshallLocationName("Part").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<ObjectPart> builder(MarshallingType.SDK_POJO)
                                            .constructor(ObjectPart::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(TOTAL_PARTS_COUNT_FIELD,
            PART_NUMBER_MARKER_FIELD, NEXT_PART_NUMBER_MARKER_FIELD, MAX_PARTS_FIELD, IS_TRUNCATED_FIELD, PARTS_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer totalPartsCount;

    private final Integer partNumberMarker;

    private final Integer nextPartNumberMarker;

    private final Integer maxParts;

    private final Boolean isTruncated;

    private final List<ObjectPart> parts;

    private GetObjectAttributesParts(BuilderImpl builder) {
        this.totalPartsCount = builder.totalPartsCount;
        this.partNumberMarker = builder.partNumberMarker;
        this.nextPartNumberMarker = builder.nextPartNumberMarker;
        this.maxParts = builder.maxParts;
        this.isTruncated = builder.isTruncated;
        this.parts = builder.parts;
    }

    /**
     * <p>
     * The total number of parts.
     * </p>
     * 
     * @return The total number of parts.
     */
    public final Integer totalPartsCount() {
        return totalPartsCount;
    }

    /**
     * <p>
     * The marker for the current part.
     * </p>
     * 
     * @return The marker for the current part.
     */
    public final Integer partNumberMarker() {
        return partNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the
     * <code>PartNumberMarker</code> request parameter in a subsequent request.
     * </p>
     * 
     * @return When a list is truncated, this element specifies the last part in the list, as well as the value to use
     *         for the <code>PartNumberMarker</code> request parameter in a subsequent request.
     */
    public final Integer nextPartNumberMarker() {
        return nextPartNumberMarker;
    }

    /**
     * <p>
     * The maximum number of parts allowed in the response.
     * </p>
     * 
     * @return The maximum number of parts allowed in the response.
     */
    public final Integer maxParts() {
        return maxParts;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A value of <code>true</code> indicates that the list
     * was truncated. A list can be truncated if the number of parts exceeds the limit returned in the
     * <code>MaxParts</code> element.
     * </p>
     * 
     * @return Indicates whether the returned list of parts is truncated. A value of <code>true</code> indicates that
     *         the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the
     *         <code>MaxParts</code> element.
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
     * A container for elements related to a particular part. A response can contain zero or more <code>Parts</code>
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
     * @return A container for elements related to a particular part. A response can contain zero or more
     *         <code>Parts</code> elements.
     */
    public final List<ObjectPart> parts() {
        return parts;
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
        hashCode = 31 * hashCode + Objects.hashCode(totalPartsCount());
        hashCode = 31 * hashCode + Objects.hashCode(partNumberMarker());
        hashCode = 31 * hashCode + Objects.hashCode(nextPartNumberMarker());
        hashCode = 31 * hashCode + Objects.hashCode(maxParts());
        hashCode = 31 * hashCode + Objects.hashCode(isTruncated());
        hashCode = 31 * hashCode + Objects.hashCode(hasParts() ? parts() : null);
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
        if (!(obj instanceof GetObjectAttributesParts)) {
            return false;
        }
        GetObjectAttributesParts other = (GetObjectAttributesParts) obj;
        return Objects.equals(totalPartsCount(), other.totalPartsCount())
                && Objects.equals(partNumberMarker(), other.partNumberMarker())
                && Objects.equals(nextPartNumberMarker(), other.nextPartNumberMarker())
                && Objects.equals(maxParts(), other.maxParts()) && Objects.equals(isTruncated(), other.isTruncated())
                && hasParts() == other.hasParts() && Objects.equals(parts(), other.parts());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetObjectAttributesParts").add("TotalPartsCount", totalPartsCount())
                .add("PartNumberMarker", partNumberMarker()).add("NextPartNumberMarker", nextPartNumberMarker())
                .add("MaxParts", maxParts()).add("IsTruncated", isTruncated()).add("Parts", hasParts() ? parts() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "TotalPartsCount":
            return Optional.ofNullable(clazz.cast(totalPartsCount()));
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
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetObjectAttributesParts, T> g) {
        return obj -> g.apply((GetObjectAttributesParts) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, GetObjectAttributesParts> {
        /**
         * <p>
         * The total number of parts.
         * </p>
         * 
         * @param totalPartsCount
         *        The total number of parts.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder totalPartsCount(Integer totalPartsCount);

        /**
         * <p>
         * The marker for the current part.
         * </p>
         * 
         * @param partNumberMarker
         *        The marker for the current part.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder partNumberMarker(Integer partNumberMarker);

        /**
         * <p>
         * When a list is truncated, this element specifies the last part in the list, as well as the value to use for
         * the <code>PartNumberMarker</code> request parameter in a subsequent request.
         * </p>
         * 
         * @param nextPartNumberMarker
         *        When a list is truncated, this element specifies the last part in the list, as well as the value to
         *        use for the <code>PartNumberMarker</code> request parameter in a subsequent request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder nextPartNumberMarker(Integer nextPartNumberMarker);

        /**
         * <p>
         * The maximum number of parts allowed in the response.
         * </p>
         * 
         * @param maxParts
         *        The maximum number of parts allowed in the response.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder maxParts(Integer maxParts);

        /**
         * <p>
         * Indicates whether the returned list of parts is truncated. A value of <code>true</code> indicates that the
         * list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the
         * <code>MaxParts</code> element.
         * </p>
         * 
         * @param isTruncated
         *        Indicates whether the returned list of parts is truncated. A value of <code>true</code> indicates that
         *        the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in
         *        the <code>MaxParts</code> element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder isTruncated(Boolean isTruncated);

        /**
         * <p>
         * A container for elements related to a particular part. A response can contain zero or more <code>Parts</code>
         * elements.
         * </p>
         * 
         * @param parts
         *        A container for elements related to a particular part. A response can contain zero or more
         *        <code>Parts</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(Collection<ObjectPart> parts);

        /**
         * <p>
         * A container for elements related to a particular part. A response can contain zero or more <code>Parts</code>
         * elements.
         * </p>
         * 
         * @param parts
         *        A container for elements related to a particular part. A response can contain zero or more
         *        <code>Parts</code> elements.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parts(ObjectPart... parts);

        /**
         * <p>
         * A container for elements related to a particular part. A response can contain zero or more <code>Parts</code>
         * elements.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link ObjectPart.Builder} avoiding the need to create one manually
         * via {@link ObjectPart#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link ObjectPart.Builder#build()} is called immediately and its
         * result is passed to {@link #parts(List<ObjectPart>)}.
         * 
         * @param parts
         *        a consumer that will call methods on
         *        {@link ObjectPart.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #parts(Collection<ObjectPart>)
         */
        Builder parts(Consumer<ObjectPart.Builder>... parts);
    }

    static final class BuilderImpl implements Builder {
        private Integer totalPartsCount;

        private Integer partNumberMarker;

        private Integer nextPartNumberMarker;

        private Integer maxParts;

        private Boolean isTruncated;

        private List<ObjectPart> parts = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(GetObjectAttributesParts model) {
            totalPartsCount(model.totalPartsCount);
            partNumberMarker(model.partNumberMarker);
            nextPartNumberMarker(model.nextPartNumberMarker);
            maxParts(model.maxParts);
            isTruncated(model.isTruncated);
            parts(model.parts);
        }

        public final Integer getTotalPartsCount() {
            return totalPartsCount;
        }

        public final void setTotalPartsCount(Integer totalPartsCount) {
            this.totalPartsCount = totalPartsCount;
        }

        @Override
        public final Builder totalPartsCount(Integer totalPartsCount) {
            this.totalPartsCount = totalPartsCount;
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

        public final List<ObjectPart.Builder> getParts() {
            List<ObjectPart.Builder> result = PartsListCopier.copyToBuilder(this.parts);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setParts(Collection<ObjectPart.BuilderImpl> parts) {
            this.parts = PartsListCopier.copyFromBuilder(parts);
        }

        @Override
        public final Builder parts(Collection<ObjectPart> parts) {
            this.parts = PartsListCopier.copy(parts);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(ObjectPart... parts) {
            parts(Arrays.asList(parts));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder parts(Consumer<ObjectPart.Builder>... parts) {
            parts(Stream.of(parts).map(c -> ObjectPart.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public GetObjectAttributesParts build() {
            return new GetObjectAttributesParts(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
