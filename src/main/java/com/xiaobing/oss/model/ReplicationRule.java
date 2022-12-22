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
 * Specifies which Amazon S3 objects to replicate and where to store the replicas.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class ReplicationRule implements SdkPojo, Serializable, ToCopyableBuilder<ReplicationRule.Builder, ReplicationRule> {
    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ID")
            .getter(getter(ReplicationRule::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ID").unmarshallLocationName("ID")
                    .build()).build();

    private static final SdkField<Integer> PRIORITY_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Priority")
            .getter(getter(ReplicationRule::priority))
            .setter(setter(Builder::priority))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Priority")
                    .unmarshallLocationName("Priority").build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(ReplicationRule::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<ReplicationRuleFilter> FILTER_FIELD = SdkField
            .<ReplicationRuleFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(ReplicationRule::filter))
            .setter(setter(Builder::filter))
            .constructor(ReplicationRuleFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(ReplicationRule::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<SourceSelectionCriteria> SOURCE_SELECTION_CRITERIA_FIELD = SdkField
            .<SourceSelectionCriteria> builder(MarshallingType.SDK_POJO)
            .memberName("SourceSelectionCriteria")
            .getter(getter(ReplicationRule::sourceSelectionCriteria))
            .setter(setter(Builder::sourceSelectionCriteria))
            .constructor(SourceSelectionCriteria::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SourceSelectionCriteria")
                    .unmarshallLocationName("SourceSelectionCriteria").build()).build();

    private static final SdkField<ExistingObjectReplication> EXISTING_OBJECT_REPLICATION_FIELD = SdkField
            .<ExistingObjectReplication> builder(MarshallingType.SDK_POJO)
            .memberName("ExistingObjectReplication")
            .getter(getter(ReplicationRule::existingObjectReplication))
            .setter(setter(Builder::existingObjectReplication))
            .constructor(ExistingObjectReplication::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ExistingObjectReplication")
                    .unmarshallLocationName("ExistingObjectReplication").build()).build();

    private static final SdkField<Destination> DESTINATION_FIELD = SdkField
            .<Destination> builder(MarshallingType.SDK_POJO)
            .memberName("Destination")
            .getter(getter(ReplicationRule::destination))
            .setter(setter(Builder::destination))
            .constructor(Destination::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Destination")
                    .unmarshallLocationName("Destination").build()).build();

    private static final SdkField<DeleteMarkerReplication> DELETE_MARKER_REPLICATION_FIELD = SdkField
            .<DeleteMarkerReplication> builder(MarshallingType.SDK_POJO)
            .memberName("DeleteMarkerReplication")
            .getter(getter(ReplicationRule::deleteMarkerReplication))
            .setter(setter(Builder::deleteMarkerReplication))
            .constructor(DeleteMarkerReplication::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DeleteMarkerReplication")
                    .unmarshallLocationName("DeleteMarkerReplication").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ID_FIELD, PRIORITY_FIELD,
            PREFIX_FIELD, FILTER_FIELD, STATUS_FIELD, SOURCE_SELECTION_CRITERIA_FIELD, EXISTING_OBJECT_REPLICATION_FIELD,
            DESTINATION_FIELD, DELETE_MARKER_REPLICATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final String id;

    private final Integer priority;

    private final String prefix;

    private final ReplicationRuleFilter filter;

    private final String status;

    private final SourceSelectionCriteria sourceSelectionCriteria;

    private final ExistingObjectReplication existingObjectReplication;

    private final Destination destination;

    private final DeleteMarkerReplication deleteMarkerReplication;

    private ReplicationRule(BuilderImpl builder) {
        this.id = builder.id;
        this.priority = builder.priority;
        this.prefix = builder.prefix;
        this.filter = builder.filter;
        this.status = builder.status;
        this.sourceSelectionCriteria = builder.sourceSelectionCriteria;
        this.existingObjectReplication = builder.existingObjectReplication;
        this.destination = builder.destination;
        this.deleteMarkerReplication = builder.deleteMarkerReplication;
    }

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     * 
     * @return A unique identifier for the rule. The maximum value is 255 characters.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * The priority indicates which rule has precedence whenever two or more replication rules conflict. Amazon S3 will
     * attempt to replicate objects according to all replication rules. However, if there are two or more rules with the
     * same destination bucket, then objects will be replicated according to the rule with the highest priority. The
     * higher the number, the higher the priority.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * 
     * @return The priority indicates which rule has precedence whenever two or more replication rules conflict. Amazon
     *         S3 will attempt to replicate objects according to all replication rules. However, if there are two or
     *         more rules with the same destination bucket, then objects will be replicated according to the rule with
     *         the highest priority. The higher the number, the higher the priority. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon
     *         S3 User Guide</i>.
     */
    public final Integer priority() {
        return priority;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
     * length is 1,024 characters. To include all objects in a bucket, specify an empty string.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @return An object key name prefix that identifies the object or objects to which the rule applies. The maximum
     *         prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string. </p>
     *         <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     * @deprecated
     */
    @Deprecated
    public final String prefix() {
        return prefix;
    }

    /**
     * Returns the value of the Filter property for this object.
     * 
     * @return The value of the Filter property for this object.
     */
    public final ReplicationRuleFilter filter() {
        return filter;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicationRuleStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the rule is enabled.
     * @see ReplicationRuleStatus
     */
    public final ReplicationRuleStatus status() {
        return ReplicationRuleStatus.fromValue(status);
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ReplicationRuleStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #statusAsString}.
     * </p>
     * 
     * @return Specifies whether the rule is enabled.
     * @see ReplicationRuleStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source objects that you want to replicate. You
     * can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter
     * that you can specify for objects created with server-side encryption using a customer managed key stored in
     * Amazon Web Services Key Management Service (SSE-KMS).
     * </p>
     * 
     * @return A container that describes additional filters for identifying the source objects that you want to
     *         replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3
     *         supports only the filter that you can specify for objects created with server-side encryption using a
     *         customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
     */
    public final SourceSelectionCriteria sourceSelectionCriteria() {
        return sourceSelectionCriteria;
    }

    /**
     * <p/>
     * 
     * @return
     */
    public final ExistingObjectReplication existingObjectReplication() {
        return existingObjectReplication;
    }

    /**
     * <p>
     * A container for information about the replication destination and its configurations including enabling the S3
     * Replication Time Control (S3 RTC).
     * </p>
     * 
     * @return A container for information about the replication destination and its configurations including enabling
     *         the S3 Replication Time Control (S3 RTC).
     */
    public final Destination destination() {
        return destination;
    }

    /**
     * Returns the value of the DeleteMarkerReplication property for this object.
     * 
     * @return The value of the DeleteMarkerReplication property for this object.
     */
    public final DeleteMarkerReplication deleteMarkerReplication() {
        return deleteMarkerReplication;
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
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(priority());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(filter());
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(sourceSelectionCriteria());
        hashCode = 31 * hashCode + Objects.hashCode(existingObjectReplication());
        hashCode = 31 * hashCode + Objects.hashCode(destination());
        hashCode = 31 * hashCode + Objects.hashCode(deleteMarkerReplication());
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
        if (!(obj instanceof ReplicationRule)) {
            return false;
        }
        ReplicationRule other = (ReplicationRule) obj;
        return Objects.equals(id(), other.id()) && Objects.equals(priority(), other.priority())
                && Objects.equals(prefix(), other.prefix()) && Objects.equals(filter(), other.filter())
                && Objects.equals(statusAsString(), other.statusAsString())
                && Objects.equals(sourceSelectionCriteria(), other.sourceSelectionCriteria())
                && Objects.equals(existingObjectReplication(), other.existingObjectReplication())
                && Objects.equals(destination(), other.destination())
                && Objects.equals(deleteMarkerReplication(), other.deleteMarkerReplication());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ReplicationRule").add("ID", id()).add("Priority", priority()).add("Prefix", prefix())
                .add("Filter", filter()).add("Status", statusAsString())
                .add("SourceSelectionCriteria", sourceSelectionCriteria())
                .add("ExistingObjectReplication", existingObjectReplication()).add("Destination", destination())
                .add("DeleteMarkerReplication", deleteMarkerReplication()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ID":
            return Optional.ofNullable(clazz.cast(id()));
        case "Priority":
            return Optional.ofNullable(clazz.cast(priority()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "SourceSelectionCriteria":
            return Optional.ofNullable(clazz.cast(sourceSelectionCriteria()));
        case "ExistingObjectReplication":
            return Optional.ofNullable(clazz.cast(existingObjectReplication()));
        case "Destination":
            return Optional.ofNullable(clazz.cast(destination()));
        case "DeleteMarkerReplication":
            return Optional.ofNullable(clazz.cast(deleteMarkerReplication()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ReplicationRule, T> g) {
        return obj -> g.apply((ReplicationRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, ReplicationRule> {
        /**
         * <p>
         * A unique identifier for the rule. The maximum value is 255 characters.
         * </p>
         * 
         * @param id
         *        A unique identifier for the rule. The maximum value is 255 characters.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * The priority indicates which rule has precedence whenever two or more replication rules conflict. Amazon S3
         * will attempt to replicate objects according to all replication rules. However, if there are two or more rules
         * with the same destination bucket, then objects will be replicated according to the rule with the highest
         * priority. The higher the number, the higher the priority.
         * </p>
         * <p>
         * For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3
         * User Guide</i>.
         * </p>
         * 
         * @param priority
         *        The priority indicates which rule has precedence whenever two or more replication rules conflict.
         *        Amazon S3 will attempt to replicate objects according to all replication rules. However, if there are
         *        two or more rules with the same destination bucket, then objects will be replicated according to the
         *        rule with the highest priority. The higher the number, the higher the priority. </p>
         *        <p>
         *        For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the
         *        <i>Amazon S3 User Guide</i>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder priority(Integer priority);

        /**
         * <p>
         * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix
         * length is 1,024 characters. To include all objects in a bucket, specify an empty string.
         * </p>
         * <important>
         * <p>
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href=
         * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints</a>.
         * </p>
         * </important>
         * 
         * @param prefix
         *        An object key name prefix that identifies the object or objects to which the rule applies. The maximum
         *        prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string. </p>
         *        <important>
         *        <p>
         *        Replacement must be made for object keys containing special characters (such as carriage returns) when
         *        using XML requests. For more information, see <a href=
         *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
         *        > XML related object key constraints</a>.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         * @deprecated
         */
        @Deprecated
        Builder prefix(String prefix);

        /**
         * Sets the value of the Filter property for this object.
         *
         * @param filter
         *        The new value for the Filter property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(ReplicationRuleFilter filter);

        /**
         * Sets the value of the Filter property for this object.
         *
         * This is a convenience method that creates an instance of the {@link ReplicationRuleFilter.Builder} avoiding
         * the need to create one manually via {@link ReplicationRuleFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ReplicationRuleFilter.Builder#build()} is called immediately and
         * its result is passed to {@link #filter(ReplicationRuleFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link ReplicationRuleFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(ReplicationRuleFilter)
         */
        default Builder filter(Consumer<ReplicationRuleFilter.Builder> filter) {
            return filter(ReplicationRuleFilter.builder().applyMutation(filter).build());
        }

        /**
         * <p>
         * Specifies whether the rule is enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the rule is enabled.
         * @see ReplicationRuleStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationRuleStatus
         */
        Builder status(String status);

        /**
         * <p>
         * Specifies whether the rule is enabled.
         * </p>
         * 
         * @param status
         *        Specifies whether the rule is enabled.
         * @see ReplicationRuleStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ReplicationRuleStatus
         */
        Builder status(ReplicationRuleStatus status);

        /**
         * <p>
         * A container that describes additional filters for identifying the source objects that you want to replicate.
         * You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the
         * filter that you can specify for objects created with server-side encryption using a customer managed key
         * stored in Amazon Web Services Key Management Service (SSE-KMS).
         * </p>
         * 
         * @param sourceSelectionCriteria
         *        A container that describes additional filters for identifying the source objects that you want to
         *        replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3
         *        supports only the filter that you can specify for objects created with server-side encryption using a
         *        customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder sourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria);

        /**
         * <p>
         * A container that describes additional filters for identifying the source objects that you want to replicate.
         * You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the
         * filter that you can specify for objects created with server-side encryption using a customer managed key
         * stored in Amazon Web Services Key Management Service (SSE-KMS).
         * </p>
         * This is a convenience method that creates an instance of the {@link SourceSelectionCriteria.Builder} avoiding
         * the need to create one manually via {@link SourceSelectionCriteria#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link SourceSelectionCriteria.Builder#build()} is called immediately
         * and its result is passed to {@link #sourceSelectionCriteria(SourceSelectionCriteria)}.
         * 
         * @param sourceSelectionCriteria
         *        a consumer that will call methods on {@link SourceSelectionCriteria.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #sourceSelectionCriteria(SourceSelectionCriteria)
         */
        default Builder sourceSelectionCriteria(Consumer<SourceSelectionCriteria.Builder> sourceSelectionCriteria) {
            return sourceSelectionCriteria(SourceSelectionCriteria.builder().applyMutation(sourceSelectionCriteria).build());
        }

        /**
         * <p/>
         * 
         * @param existingObjectReplication
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder existingObjectReplication(ExistingObjectReplication existingObjectReplication);

        /**
         * <p/>
         * This is a convenience method that creates an instance of the {@link ExistingObjectReplication.Builder}
         * avoiding the need to create one manually via {@link ExistingObjectReplication#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ExistingObjectReplication.Builder#build()} is called immediately
         * and its result is passed to {@link #existingObjectReplication(ExistingObjectReplication)}.
         * 
         * @param existingObjectReplication
         *        a consumer that will call methods on {@link ExistingObjectReplication.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #existingObjectReplication(ExistingObjectReplication)
         */
        default Builder existingObjectReplication(Consumer<ExistingObjectReplication.Builder> existingObjectReplication) {
            return existingObjectReplication(ExistingObjectReplication.builder().applyMutation(existingObjectReplication).build());
        }

        /**
         * <p>
         * A container for information about the replication destination and its configurations including enabling the
         * S3 Replication Time Control (S3 RTC).
         * </p>
         * 
         * @param destination
         *        A container for information about the replication destination and its configurations including
         *        enabling the S3 Replication Time Control (S3 RTC).
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder destination(Destination destination);

        /**
         * <p>
         * A container for information about the replication destination and its configurations including enabling the
         * S3 Replication Time Control (S3 RTC).
         * </p>
         * This is a convenience method that creates an instance of the {@link Destination.Builder} avoiding the need to
         * create one manually via {@link Destination#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Destination.Builder#build()} is called immediately and its result
         * is passed to {@link #destination(Destination)}.
         * 
         * @param destination
         *        a consumer that will call methods on {@link Destination.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #destination(Destination)
         */
        default Builder destination(Consumer<Destination.Builder> destination) {
            return destination(Destination.builder().applyMutation(destination).build());
        }

        /**
         * Sets the value of the DeleteMarkerReplication property for this object.
         *
         * @param deleteMarkerReplication
         *        The new value for the DeleteMarkerReplication property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication);

        /**
         * Sets the value of the DeleteMarkerReplication property for this object.
         *
         * This is a convenience method that creates an instance of the {@link DeleteMarkerReplication.Builder} avoiding
         * the need to create one manually via {@link DeleteMarkerReplication#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link DeleteMarkerReplication.Builder#build()} is called immediately
         * and its result is passed to {@link #deleteMarkerReplication(DeleteMarkerReplication)}.
         * 
         * @param deleteMarkerReplication
         *        a consumer that will call methods on {@link DeleteMarkerReplication.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #deleteMarkerReplication(DeleteMarkerReplication)
         */
        default Builder deleteMarkerReplication(Consumer<DeleteMarkerReplication.Builder> deleteMarkerReplication) {
            return deleteMarkerReplication(DeleteMarkerReplication.builder().applyMutation(deleteMarkerReplication).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String id;

        private Integer priority;

        private String prefix;

        private ReplicationRuleFilter filter;

        private String status;

        private SourceSelectionCriteria sourceSelectionCriteria;

        private ExistingObjectReplication existingObjectReplication;

        private Destination destination;

        private DeleteMarkerReplication deleteMarkerReplication;

        private BuilderImpl() {
        }

        private BuilderImpl(ReplicationRule model) {
            id(model.id);
            priority(model.priority);
            prefix(model.prefix);
            filter(model.filter);
            status(model.status);
            sourceSelectionCriteria(model.sourceSelectionCriteria);
            existingObjectReplication(model.existingObjectReplication);
            destination(model.destination);
            deleteMarkerReplication(model.deleteMarkerReplication);
        }

        public final String getId() {
            return id;
        }

        public final void setId(String id) {
            this.id = id;
        }

        @Override
        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Integer getPriority() {
            return priority;
        }

        public final void setPriority(Integer priority) {
            this.priority = priority;
        }

        @Override
        public final Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        @Deprecated
        public final String getPrefix() {
            return prefix;
        }

        @Deprecated
        public final void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Override
        @Deprecated
        public final Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public final ReplicationRuleFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(ReplicationRuleFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(ReplicationRuleFilter filter) {
            this.filter = filter;
            return this;
        }

        public final String getStatus() {
            return status;
        }

        public final void setStatus(String status) {
            this.status = status;
        }

        @Override
        public final Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public final Builder status(ReplicationRuleStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final SourceSelectionCriteria.Builder getSourceSelectionCriteria() {
            return sourceSelectionCriteria != null ? sourceSelectionCriteria.toBuilder() : null;
        }

        public final void setSourceSelectionCriteria(SourceSelectionCriteria.BuilderImpl sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria != null ? sourceSelectionCriteria.build() : null;
        }

        @Override
        public final Builder sourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public final ExistingObjectReplication.Builder getExistingObjectReplication() {
            return existingObjectReplication != null ? existingObjectReplication.toBuilder() : null;
        }

        public final void setExistingObjectReplication(ExistingObjectReplication.BuilderImpl existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication != null ? existingObjectReplication.build() : null;
        }

        @Override
        public final Builder existingObjectReplication(ExistingObjectReplication existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication;
            return this;
        }

        public final Destination.Builder getDestination() {
            return destination != null ? destination.toBuilder() : null;
        }

        public final void setDestination(Destination.BuilderImpl destination) {
            this.destination = destination != null ? destination.build() : null;
        }

        @Override
        public final Builder destination(Destination destination) {
            this.destination = destination;
            return this;
        }

        public final DeleteMarkerReplication.Builder getDeleteMarkerReplication() {
            return deleteMarkerReplication != null ? deleteMarkerReplication.toBuilder() : null;
        }

        public final void setDeleteMarkerReplication(DeleteMarkerReplication.BuilderImpl deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication != null ? deleteMarkerReplication.build() : null;
        }

        @Override
        public final Builder deleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        @Override
        public ReplicationRule build() {
            return new ReplicationRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
