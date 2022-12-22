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
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkBytes;
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
 * <p>
 * The container for the records event.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class RecordsEvent implements SdkPojo, Serializable, ToCopyableBuilder<RecordsEvent.Builder, RecordsEvent>,
        SelectObjectContentEventStream {
    private static final SdkField<SdkBytes> PAYLOAD_FIELD = SdkField
            .<SdkBytes> builder(MarshallingType.SDK_BYTES)
            .memberName("Payload")
            .getter(getter(RecordsEvent::payload))
            .setter(setter(Builder::payload))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Payload")
                    .unmarshallLocationName("Payload").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(PAYLOAD_FIELD));

    private static final long serialVersionUID = 1L;

    private final SdkBytes payload;

    protected RecordsEvent(BuilderImpl builder) {
        this.payload = builder.payload;
    }

    /**
     * <p>
     * The byte array of partial, one or more result records.
     * </p>
     * 
     * @return The byte array of partial, one or more result records.
     */
    public final SdkBytes payload() {
        return payload;
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
        hashCode = 31 * hashCode + Objects.hashCode(payload());
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
        if (!(obj instanceof RecordsEvent)) {
            return false;
        }
        RecordsEvent other = (RecordsEvent) obj;
        return Objects.equals(payload(), other.payload());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("RecordsEvent").add("Payload", payload()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Payload":
            return Optional.ofNullable(clazz.cast(payload()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final RecordsEvent copy(Consumer<? super Builder> modifier) {
        return ToCopyableBuilder.super.copy(modifier);
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<RecordsEvent, T> g) {
        return obj -> g.apply((RecordsEvent) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    /**
     * Calls the appropriate visit method depending on the subtype of {@link RecordsEvent}.
     *
     * @param visitor
     *        Visitor to invoke.
     */
    @Override
    public void accept(SelectObjectContentResponseHandler.Visitor visitor) {
        throw new UnsupportedOperationException();
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, RecordsEvent> {
        /**
         * <p>
         * The byte array of partial, one or more result records.
         * </p>
         * 
         * @param payload
         *        The byte array of partial, one or more result records.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder payload(SdkBytes payload);
    }

    protected static class BuilderImpl implements Builder {
        private SdkBytes payload;

        protected BuilderImpl() {
        }

        protected BuilderImpl(RecordsEvent model) {
            payload(model.payload);
        }

        public final ByteBuffer getPayload() {
            return payload == null ? null : payload.asByteBuffer();
        }

        public final void setPayload(ByteBuffer payload) {
            payload(payload == null ? null : SdkBytes.fromByteBuffer(payload));
        }

        @Override
        public final Builder payload(SdkBytes payload) {
            this.payload = payload;
            return this;
        }

        @Override
        public RecordsEvent build() {
            return new RecordsEvent(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
