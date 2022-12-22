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
 * A container for specifying the notification configuration of the bucket. If this element is empty, notifications are
 * turned off for the bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class NotificationConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<NotificationConfiguration.Builder, NotificationConfiguration> {
    private static final SdkField<List<TopicConfiguration>> TOPIC_CONFIGURATIONS_FIELD = SdkField
            .<List<TopicConfiguration>> builder(MarshallingType.LIST)
            .memberName("TopicConfigurations")
            .getter(getter(NotificationConfiguration::topicConfigurations))
            .setter(setter(Builder::topicConfigurations))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("TopicConfiguration")
                    .unmarshallLocationName("TopicConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<TopicConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(TopicConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<QueueConfiguration>> QUEUE_CONFIGURATIONS_FIELD = SdkField
            .<List<QueueConfiguration>> builder(MarshallingType.LIST)
            .memberName("QueueConfigurations")
            .getter(getter(NotificationConfiguration::queueConfigurations))
            .setter(setter(Builder::queueConfigurations))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("QueueConfiguration")
                    .unmarshallLocationName("QueueConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<QueueConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(QueueConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<LambdaFunctionConfiguration>> LAMBDA_FUNCTION_CONFIGURATIONS_FIELD = SdkField
            .<List<LambdaFunctionConfiguration>> builder(MarshallingType.LIST)
            .memberName("LambdaFunctionConfigurations")
            .getter(getter(NotificationConfiguration::lambdaFunctionConfigurations))
            .setter(setter(Builder::lambdaFunctionConfigurations))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("CloudFunctionConfiguration")
                    .unmarshallLocationName("CloudFunctionConfiguration").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<LambdaFunctionConfiguration> builder(MarshallingType.SDK_POJO)
                                            .constructor(LambdaFunctionConfiguration::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<EventBridgeConfiguration> EVENT_BRIDGE_CONFIGURATION_FIELD = SdkField
            .<EventBridgeConfiguration> builder(MarshallingType.SDK_POJO)
            .memberName("EventBridgeConfiguration")
            .getter(getter(NotificationConfiguration::eventBridgeConfiguration))
            .setter(setter(Builder::eventBridgeConfiguration))
            .constructor(EventBridgeConfiguration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("EventBridgeConfiguration")
                    .unmarshallLocationName("EventBridgeConfiguration").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(TOPIC_CONFIGURATIONS_FIELD,
            QUEUE_CONFIGURATIONS_FIELD, LAMBDA_FUNCTION_CONFIGURATIONS_FIELD, EVENT_BRIDGE_CONFIGURATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final List<TopicConfiguration> topicConfigurations;

    private final List<QueueConfiguration> queueConfigurations;

    private final List<LambdaFunctionConfiguration> lambdaFunctionConfigurations;

    private final EventBridgeConfiguration eventBridgeConfiguration;

    private NotificationConfiguration(BuilderImpl builder) {
        this.topicConfigurations = builder.topicConfigurations;
        this.queueConfigurations = builder.queueConfigurations;
        this.lambdaFunctionConfigurations = builder.lambdaFunctionConfigurations;
        this.eventBridgeConfiguration = builder.eventBridgeConfiguration;
    }

    /**
     * For responses, this returns true if the service returned a value for the TopicConfigurations property. This DOES
     * NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasTopicConfigurations() {
        return topicConfigurations != null && !(topicConfigurations instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The topic to which notifications are sent and the events for which notifications are generated.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTopicConfigurations} method.
     * </p>
     * 
     * @return The topic to which notifications are sent and the events for which notifications are generated.
     */
    public final List<TopicConfiguration> topicConfigurations() {
        return topicConfigurations;
    }

    /**
     * For responses, this returns true if the service returned a value for the QueueConfigurations property. This DOES
     * NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasQueueConfigurations() {
        return queueConfigurations != null && !(queueConfigurations instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasQueueConfigurations} method.
     * </p>
     * 
     * @return The Amazon Simple Queue Service queues to publish messages to and the events for which to publish
     *         messages.
     */
    public final List<QueueConfiguration> queueConfigurations() {
        return queueConfigurations;
    }

    /**
     * For responses, this returns true if the service returned a value for the LambdaFunctionConfigurations property.
     * This DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the
     * property). This is useful because the SDK will never return a null collection or map, but you may need to
     * differentiate between the service returning nothing (or null) and the service returning an empty collection or
     * map. For requests, this returns true if a value for the property was specified in the request builder, and false
     * if a value was not specified.
     */
    public final boolean hasLambdaFunctionConfigurations() {
        return lambdaFunctionConfigurations != null && !(lambdaFunctionConfigurations instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Describes the Lambda functions to invoke and the events for which to invoke them.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasLambdaFunctionConfigurations} method.
     * </p>
     * 
     * @return Describes the Lambda functions to invoke and the events for which to invoke them.
     */
    public final List<LambdaFunctionConfiguration> lambdaFunctionConfigurations() {
        return lambdaFunctionConfigurations;
    }

    /**
     * <p>
     * Enables delivery of events to Amazon EventBridge.
     * </p>
     * 
     * @return Enables delivery of events to Amazon EventBridge.
     */
    public final EventBridgeConfiguration eventBridgeConfiguration() {
        return eventBridgeConfiguration;
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
        hashCode = 31 * hashCode + Objects.hashCode(hasTopicConfigurations() ? topicConfigurations() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasQueueConfigurations() ? queueConfigurations() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasLambdaFunctionConfigurations() ? lambdaFunctionConfigurations() : null);
        hashCode = 31 * hashCode + Objects.hashCode(eventBridgeConfiguration());
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
        if (!(obj instanceof NotificationConfiguration)) {
            return false;
        }
        NotificationConfiguration other = (NotificationConfiguration) obj;
        return hasTopicConfigurations() == other.hasTopicConfigurations()
                && Objects.equals(topicConfigurations(), other.topicConfigurations())
                && hasQueueConfigurations() == other.hasQueueConfigurations()
                && Objects.equals(queueConfigurations(), other.queueConfigurations())
                && hasLambdaFunctionConfigurations() == other.hasLambdaFunctionConfigurations()
                && Objects.equals(lambdaFunctionConfigurations(), other.lambdaFunctionConfigurations())
                && Objects.equals(eventBridgeConfiguration(), other.eventBridgeConfiguration());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("NotificationConfiguration")
                .add("TopicConfigurations", hasTopicConfigurations() ? topicConfigurations() : null)
                .add("QueueConfigurations", hasQueueConfigurations() ? queueConfigurations() : null)
                .add("LambdaFunctionConfigurations", hasLambdaFunctionConfigurations() ? lambdaFunctionConfigurations() : null)
                .add("EventBridgeConfiguration", eventBridgeConfiguration()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "TopicConfigurations":
            return Optional.ofNullable(clazz.cast(topicConfigurations()));
        case "QueueConfigurations":
            return Optional.ofNullable(clazz.cast(queueConfigurations()));
        case "LambdaFunctionConfigurations":
            return Optional.ofNullable(clazz.cast(lambdaFunctionConfigurations()));
        case "EventBridgeConfiguration":
            return Optional.ofNullable(clazz.cast(eventBridgeConfiguration()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<NotificationConfiguration, T> g) {
        return obj -> g.apply((NotificationConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, NotificationConfiguration> {
        /**
         * <p>
         * The topic to which notifications are sent and the events for which notifications are generated.
         * </p>
         * 
         * @param topicConfigurations
         *        The topic to which notifications are sent and the events for which notifications are generated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder topicConfigurations(Collection<TopicConfiguration> topicConfigurations);

        /**
         * <p>
         * The topic to which notifications are sent and the events for which notifications are generated.
         * </p>
         * 
         * @param topicConfigurations
         *        The topic to which notifications are sent and the events for which notifications are generated.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder topicConfigurations(TopicConfiguration... topicConfigurations);

        /**
         * <p>
         * The topic to which notifications are sent and the events for which notifications are generated.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link TopicConfiguration.Builder} avoiding the need to create one
         * manually via {@link TopicConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link TopicConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #topicConfigurations(List<TopicConfiguration>)}.
         * 
         * @param topicConfigurations
         *        a consumer that will call methods on
         *        {@link TopicConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #topicConfigurations(Collection<TopicConfiguration>)
         */
        Builder topicConfigurations(Consumer<TopicConfiguration.Builder>... topicConfigurations);

        /**
         * <p>
         * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
         * </p>
         * 
         * @param queueConfigurations
         *        The Amazon Simple Queue Service queues to publish messages to and the events for which to publish
         *        messages.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder queueConfigurations(Collection<QueueConfiguration> queueConfigurations);

        /**
         * <p>
         * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
         * </p>
         * 
         * @param queueConfigurations
         *        The Amazon Simple Queue Service queues to publish messages to and the events for which to publish
         *        messages.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder queueConfigurations(QueueConfiguration... queueConfigurations);

        /**
         * <p>
         * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link QueueConfiguration.Builder} avoiding the need to create one
         * manually via {@link QueueConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link QueueConfiguration.Builder#build()} is called immediately and
         * its result is passed to {@link #queueConfigurations(List<QueueConfiguration>)}.
         * 
         * @param queueConfigurations
         *        a consumer that will call methods on
         *        {@link QueueConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #queueConfigurations(Collection<QueueConfiguration>)
         */
        Builder queueConfigurations(Consumer<QueueConfiguration.Builder>... queueConfigurations);

        /**
         * <p>
         * Describes the Lambda functions to invoke and the events for which to invoke them.
         * </p>
         * 
         * @param lambdaFunctionConfigurations
         *        Describes the Lambda functions to invoke and the events for which to invoke them.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lambdaFunctionConfigurations(Collection<LambdaFunctionConfiguration> lambdaFunctionConfigurations);

        /**
         * <p>
         * Describes the Lambda functions to invoke and the events for which to invoke them.
         * </p>
         * 
         * @param lambdaFunctionConfigurations
         *        Describes the Lambda functions to invoke and the events for which to invoke them.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder lambdaFunctionConfigurations(LambdaFunctionConfiguration... lambdaFunctionConfigurations);

        /**
         * <p>
         * Describes the Lambda functions to invoke and the events for which to invoke them.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link LambdaFunctionConfiguration.Builder} avoiding the need to
         * create one manually via
         * {@link LambdaFunctionConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link LambdaFunctionConfiguration.Builder#build()} is called
         * immediately and its result is passed to {@link
         * #lambdaFunctionConfigurations(List<LambdaFunctionConfiguration>)}.
         * 
         * @param lambdaFunctionConfigurations
         *        a consumer that will call methods on
         *        {@link LambdaFunctionConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #lambdaFunctionConfigurations(Collection<LambdaFunctionConfiguration>)
         */
        Builder lambdaFunctionConfigurations(Consumer<LambdaFunctionConfiguration.Builder>... lambdaFunctionConfigurations);

        /**
         * <p>
         * Enables delivery of events to Amazon EventBridge.
         * </p>
         * 
         * @param eventBridgeConfiguration
         *        Enables delivery of events to Amazon EventBridge.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder eventBridgeConfiguration(EventBridgeConfiguration eventBridgeConfiguration);

        /**
         * <p>
         * Enables delivery of events to Amazon EventBridge.
         * </p>
         * This is a convenience method that creates an instance of the {@link EventBridgeConfiguration.Builder}
         * avoiding the need to create one manually via {@link EventBridgeConfiguration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link EventBridgeConfiguration.Builder#build()} is called immediately
         * and its result is passed to {@link #eventBridgeConfiguration(EventBridgeConfiguration)}.
         * 
         * @param eventBridgeConfiguration
         *        a consumer that will call methods on {@link EventBridgeConfiguration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #eventBridgeConfiguration(EventBridgeConfiguration)
         */
        default Builder eventBridgeConfiguration(Consumer<EventBridgeConfiguration.Builder> eventBridgeConfiguration) {
            return eventBridgeConfiguration(EventBridgeConfiguration.builder().applyMutation(eventBridgeConfiguration).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private List<TopicConfiguration> topicConfigurations = DefaultSdkAutoConstructList.getInstance();

        private List<QueueConfiguration> queueConfigurations = DefaultSdkAutoConstructList.getInstance();

        private List<LambdaFunctionConfiguration> lambdaFunctionConfigurations = DefaultSdkAutoConstructList.getInstance();

        private EventBridgeConfiguration eventBridgeConfiguration;

        private BuilderImpl() {
        }

        private BuilderImpl(NotificationConfiguration model) {
            topicConfigurations(model.topicConfigurations);
            queueConfigurations(model.queueConfigurations);
            lambdaFunctionConfigurations(model.lambdaFunctionConfigurations);
            eventBridgeConfiguration(model.eventBridgeConfiguration);
        }

        public final List<TopicConfiguration.Builder> getTopicConfigurations() {
            List<TopicConfiguration.Builder> result = TopicConfigurationListCopier.copyToBuilder(this.topicConfigurations);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setTopicConfigurations(Collection<TopicConfiguration.BuilderImpl> topicConfigurations) {
            this.topicConfigurations = TopicConfigurationListCopier.copyFromBuilder(topicConfigurations);
        }

        @Override
        public final Builder topicConfigurations(Collection<TopicConfiguration> topicConfigurations) {
            this.topicConfigurations = TopicConfigurationListCopier.copy(topicConfigurations);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder topicConfigurations(TopicConfiguration... topicConfigurations) {
            topicConfigurations(Arrays.asList(topicConfigurations));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder topicConfigurations(Consumer<TopicConfiguration.Builder>... topicConfigurations) {
            topicConfigurations(Stream.of(topicConfigurations).map(c -> TopicConfiguration.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        public final List<QueueConfiguration.Builder> getQueueConfigurations() {
            List<QueueConfiguration.Builder> result = QueueConfigurationListCopier.copyToBuilder(this.queueConfigurations);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setQueueConfigurations(Collection<QueueConfiguration.BuilderImpl> queueConfigurations) {
            this.queueConfigurations = QueueConfigurationListCopier.copyFromBuilder(queueConfigurations);
        }

        @Override
        public final Builder queueConfigurations(Collection<QueueConfiguration> queueConfigurations) {
            this.queueConfigurations = QueueConfigurationListCopier.copy(queueConfigurations);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder queueConfigurations(QueueConfiguration... queueConfigurations) {
            queueConfigurations(Arrays.asList(queueConfigurations));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder queueConfigurations(Consumer<QueueConfiguration.Builder>... queueConfigurations) {
            queueConfigurations(Stream.of(queueConfigurations).map(c -> QueueConfiguration.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        public final List<LambdaFunctionConfiguration.Builder> getLambdaFunctionConfigurations() {
            List<LambdaFunctionConfiguration.Builder> result = LambdaFunctionConfigurationListCopier
                    .copyToBuilder(this.lambdaFunctionConfigurations);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setLambdaFunctionConfigurations(
                Collection<LambdaFunctionConfiguration.BuilderImpl> lambdaFunctionConfigurations) {
            this.lambdaFunctionConfigurations = LambdaFunctionConfigurationListCopier
                    .copyFromBuilder(lambdaFunctionConfigurations);
        }

        @Override
        public final Builder lambdaFunctionConfigurations(Collection<LambdaFunctionConfiguration> lambdaFunctionConfigurations) {
            this.lambdaFunctionConfigurations = LambdaFunctionConfigurationListCopier.copy(lambdaFunctionConfigurations);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder lambdaFunctionConfigurations(LambdaFunctionConfiguration... lambdaFunctionConfigurations) {
            lambdaFunctionConfigurations(Arrays.asList(lambdaFunctionConfigurations));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder lambdaFunctionConfigurations(
                Consumer<LambdaFunctionConfiguration.Builder>... lambdaFunctionConfigurations) {
            lambdaFunctionConfigurations(Stream.of(lambdaFunctionConfigurations)
                    .map(c -> LambdaFunctionConfiguration.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final EventBridgeConfiguration.Builder getEventBridgeConfiguration() {
            return eventBridgeConfiguration != null ? eventBridgeConfiguration.toBuilder() : null;
        }

        public final void setEventBridgeConfiguration(EventBridgeConfiguration.BuilderImpl eventBridgeConfiguration) {
            this.eventBridgeConfiguration = eventBridgeConfiguration != null ? eventBridgeConfiguration.build() : null;
        }

        @Override
        public final Builder eventBridgeConfiguration(EventBridgeConfiguration eventBridgeConfiguration) {
            this.eventBridgeConfiguration = eventBridgeConfiguration;
            return this;
        }

        @Override
        public NotificationConfiguration build() {
            return new NotificationConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
