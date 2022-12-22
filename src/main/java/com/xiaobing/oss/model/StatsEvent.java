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
import software.amazon.awssdk.core.traits.PayloadTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Container for the Stats Event.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class StatsEvent implements SdkPojo, Serializable, ToCopyableBuilder<StatsEvent.Builder, StatsEvent>,
        SelectObjectContentEventStream {
    private static final SdkField<Stats> DETAILS_FIELD = SdkField
            .<Stats> builder(MarshallingType.SDK_POJO)
            .memberName("Details")
            .getter(getter(StatsEvent::details))
            .setter(setter(Builder::details))
            .constructor(Stats::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Details")
                    .unmarshallLocationName("Details").build(), PayloadTrait.create()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DETAILS_FIELD));

    private static final long serialVersionUID = 1L;

    private final Stats details;

    protected StatsEvent(BuilderImpl builder) {
        this.details = builder.details;
    }

    /**
     * <p>
     * The Stats event details.
     * </p>
     * 
     * @return The Stats event details.
     */
    public final Stats details() {
        return details;
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
        hashCode = 31 * hashCode + Objects.hashCode(details());
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
        if (!(obj instanceof StatsEvent)) {
            return false;
        }
        StatsEvent other = (StatsEvent) obj;
        return Objects.equals(details(), other.details());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("StatsEvent").add("Details", details()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Details":
            return Optional.ofNullable(clazz.cast(details()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final StatsEvent copy(Consumer<? super Builder> modifier) {
        return ToCopyableBuilder.super.copy(modifier);
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<StatsEvent, T> g) {
        return obj -> g.apply((StatsEvent) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    /**
     * Calls the appropriate visit method depending on the subtype of {@link StatsEvent}.
     *
     * @param visitor
     *        Visitor to invoke.
     */
    @Override
    public void accept(SelectObjectContentResponseHandler.Visitor visitor) {
        throw new UnsupportedOperationException();
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, StatsEvent> {
        /**
         * <p>
         * The Stats event details.
         * </p>
         * 
         * @param details
         *        The Stats event details.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder details(Stats details);

        /**
         * <p>
         * The Stats event details.
         * </p>
         * This is a convenience method that creates an instance of the {@link Stats.Builder} avoiding the need to
         * create one manually via {@link Stats#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Stats.Builder#build()} is called immediately and its result is
         * passed to {@link #details(Stats)}.
         * 
         * @param details
         *        a consumer that will call methods on {@link Stats.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #details(Stats)
         */
        default Builder details(Consumer<Stats.Builder> details) {
            return details(Stats.builder().applyMutation(details).build());
        }
    }

    protected static class BuilderImpl implements Builder {
        private Stats details;

        protected BuilderImpl() {
        }

        protected BuilderImpl(StatsEvent model) {
            details(model.details);
        }

        public final Stats.Builder getDetails() {
            return details != null ? details.toBuilder() : null;
        }

        public final void setDetails(Stats.BuilderImpl details) {
            this.details = details != null ? details.build() : null;
        }

        @Override
        public final Builder details(Stats details) {
            this.details = details;
            return this;
        }

        @Override
        public StatsEvent build() {
            return new StatsEvent(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
