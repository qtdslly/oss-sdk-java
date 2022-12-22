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
 * Specifies object key name filtering rules. For information about key name filtering, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in
 * the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class NotificationConfigurationFilter implements SdkPojo, Serializable,
        ToCopyableBuilder<NotificationConfigurationFilter.Builder, NotificationConfigurationFilter> {
    private static final SdkField<S3KeyFilter> KEY_FIELD = SdkField
            .<S3KeyFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Key")
            .getter(getter(NotificationConfigurationFilter::key))
            .setter(setter(Builder::key))
            .constructor(S3KeyFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("S3Key")
                    .unmarshallLocationName("S3Key").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(KEY_FIELD));

    private static final long serialVersionUID = 1L;

    private final S3KeyFilter key;

    private NotificationConfigurationFilter(BuilderImpl builder) {
        this.key = builder.key;
    }

    /**
     * Returns the value of the Key property for this object.
     * 
     * @return The value of the Key property for this object.
     */
    public final S3KeyFilter key() {
        return key;
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
        hashCode = 31 * hashCode + Objects.hashCode(key());
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
        if (!(obj instanceof NotificationConfigurationFilter)) {
            return false;
        }
        NotificationConfigurationFilter other = (NotificationConfigurationFilter) obj;
        return Objects.equals(key(), other.key());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("NotificationConfigurationFilter").add("Key", key()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<NotificationConfigurationFilter, T> g) {
        return obj -> g.apply((NotificationConfigurationFilter) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, NotificationConfigurationFilter> {
        /**
         * Sets the value of the Key property for this object.
         *
         * @param key
         *        The new value for the Key property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(S3KeyFilter key);

        /**
         * Sets the value of the Key property for this object.
         *
         * This is a convenience method that creates an instance of the {@link S3KeyFilter.Builder} avoiding the need to
         * create one manually via {@link S3KeyFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link S3KeyFilter.Builder#build()} is called immediately and its result
         * is passed to {@link #key(S3KeyFilter)}.
         * 
         * @param key
         *        a consumer that will call methods on {@link S3KeyFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #key(S3KeyFilter)
         */
        default Builder key(Consumer<S3KeyFilter.Builder> key) {
            return key(S3KeyFilter.builder().applyMutation(key).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private S3KeyFilter key;

        private BuilderImpl() {
        }

        private BuilderImpl(NotificationConfigurationFilter model) {
            key(model.key);
        }

        public final S3KeyFilter.Builder getKey() {
            return key != null ? key.toBuilder() : null;
        }

        public final void setKey(S3KeyFilter.BuilderImpl key) {
            this.key = key != null ? key.build() : null;
        }

        @Override
        public final Builder key(S3KeyFilter key) {
            this.key = key;
            return this;
        }

        @Override
        public NotificationConfigurationFilter build() {
            return new NotificationConfigurationFilter(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
