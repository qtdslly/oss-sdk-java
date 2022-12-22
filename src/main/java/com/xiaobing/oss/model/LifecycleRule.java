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
 * A lifecycle rule for individual objects in an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class LifecycleRule implements SdkPojo, Serializable, ToCopyableBuilder<LifecycleRule.Builder, LifecycleRule> {
    private static final SdkField<LifecycleExpiration> EXPIRATION_FIELD = SdkField
            .<LifecycleExpiration> builder(MarshallingType.SDK_POJO)
            .memberName("Expiration")
            .getter(getter(LifecycleRule::expiration))
            .setter(setter(Builder::expiration))
            .constructor(LifecycleExpiration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Expiration")
                    .unmarshallLocationName("Expiration").build()).build();

    private static final SdkField<String> ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ID")
            .getter(getter(LifecycleRule::id))
            .setter(setter(Builder::id))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ID").unmarshallLocationName("ID")
                    .build()).build();

    private static final SdkField<String> PREFIX_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Prefix")
            .getter(getter(LifecycleRule::prefix))
            .setter(setter(Builder::prefix))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Prefix")
                    .unmarshallLocationName("Prefix").build()).build();

    private static final SdkField<LifecycleRuleFilter> FILTER_FIELD = SdkField
            .<LifecycleRuleFilter> builder(MarshallingType.SDK_POJO)
            .memberName("Filter")
            .getter(getter(LifecycleRule::filter))
            .setter(setter(Builder::filter))
            .constructor(LifecycleRuleFilter::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Filter")
                    .unmarshallLocationName("Filter").build()).build();

    private static final SdkField<String> STATUS_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Status")
            .getter(getter(LifecycleRule::statusAsString))
            .setter(setter(Builder::status))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Status")
                    .unmarshallLocationName("Status").build()).build();

    private static final SdkField<List<Transition>> TRANSITIONS_FIELD = SdkField
            .<List<Transition>> builder(MarshallingType.LIST)
            .memberName("Transitions")
            .getter(getter(LifecycleRule::transitions))
            .setter(setter(Builder::transitions))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Transition")
                    .unmarshallLocationName("Transition").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<Transition> builder(MarshallingType.SDK_POJO)
                                            .constructor(Transition::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<List<NoncurrentVersionTransition>> NONCURRENT_VERSION_TRANSITIONS_FIELD = SdkField
            .<List<NoncurrentVersionTransition>> builder(MarshallingType.LIST)
            .memberName("NoncurrentVersionTransitions")
            .getter(getter(LifecycleRule::noncurrentVersionTransitions))
            .setter(setter(Builder::noncurrentVersionTransitions))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NoncurrentVersionTransition")
                    .unmarshallLocationName("NoncurrentVersionTransition").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<NoncurrentVersionTransition> builder(MarshallingType.SDK_POJO)
                                            .constructor(NoncurrentVersionTransition::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<NoncurrentVersionExpiration> NONCURRENT_VERSION_EXPIRATION_FIELD = SdkField
            .<NoncurrentVersionExpiration> builder(MarshallingType.SDK_POJO)
            .memberName("NoncurrentVersionExpiration")
            .getter(getter(LifecycleRule::noncurrentVersionExpiration))
            .setter(setter(Builder::noncurrentVersionExpiration))
            .constructor(NoncurrentVersionExpiration::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("NoncurrentVersionExpiration")
                    .unmarshallLocationName("NoncurrentVersionExpiration").build()).build();

    private static final SdkField<AbortIncompleteMultipartUpload> ABORT_INCOMPLETE_MULTIPART_UPLOAD_FIELD = SdkField
            .<AbortIncompleteMultipartUpload> builder(MarshallingType.SDK_POJO)
            .memberName("AbortIncompleteMultipartUpload")
            .getter(getter(LifecycleRule::abortIncompleteMultipartUpload))
            .setter(setter(Builder::abortIncompleteMultipartUpload))
            .constructor(AbortIncompleteMultipartUpload::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AbortIncompleteMultipartUpload")
                    .unmarshallLocationName("AbortIncompleteMultipartUpload").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(EXPIRATION_FIELD, ID_FIELD,
            PREFIX_FIELD, FILTER_FIELD, STATUS_FIELD, TRANSITIONS_FIELD, NONCURRENT_VERSION_TRANSITIONS_FIELD,
            NONCURRENT_VERSION_EXPIRATION_FIELD, ABORT_INCOMPLETE_MULTIPART_UPLOAD_FIELD));

    private static final long serialVersionUID = 1L;

    private final LifecycleExpiration expiration;

    private final String id;

    private final String prefix;

    private final LifecycleRuleFilter filter;

    private final String status;

    private final List<Transition> transitions;

    private final List<NoncurrentVersionTransition> noncurrentVersionTransitions;

    private final NoncurrentVersionExpiration noncurrentVersionExpiration;

    private final AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    private LifecycleRule(BuilderImpl builder) {
        this.expiration = builder.expiration;
        this.id = builder.id;
        this.prefix = builder.prefix;
        this.filter = builder.filter;
        this.status = builder.status;
        this.transitions = builder.transitions;
        this.noncurrentVersionTransitions = builder.noncurrentVersionTransitions;
        this.noncurrentVersionExpiration = builder.noncurrentVersionExpiration;
        this.abortIncompleteMultipartUpload = builder.abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a
     * delete marker.
     * </p>
     * 
     * @return Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the
     *         object has a delete marker.
     */
    public final LifecycleExpiration expiration() {
        return expiration;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255 characters.
     * </p>
     * 
     * @return Unique identifier for the rule. The value cannot be longer than 255 characters.
     */
    public final String id() {
        return id;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies. This is no longer used; use <code>Filter</code>
     * instead.
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
     * @return Prefix identifying one or more objects to which the rule applies. This is no longer used; use
     *         <code>Filter</code> instead.</p> <important>
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
     * <p>
     * The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A <code>Filter</code> must
     * have exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified. <code>Filter</code> is
     * required if the <code>LifecycleRule</code> does not contain a <code>Prefix</code> element.
     * </p>
     * 
     * @return The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A
     *         <code>Filter</code> must have exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code>
     *         specified. <code>Filter</code> is required if the <code>LifecycleRule</code> does not contain a
     *         <code>Prefix</code> element.
     */
    public final LifecycleRuleFilter filter() {
        return filter;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ExpirationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #statusAsString}.
     * </p>
     * 
     * @return If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being
     *         applied.
     * @see ExpirationStatus
     */
    public final ExpirationStatus status() {
        return ExpirationStatus.fromValue(status);
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #status} will
     * return {@link ExpirationStatus#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #statusAsString}.
     * </p>
     * 
     * @return If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being
     *         applied.
     * @see ExpirationStatus
     */
    public final String statusAsString() {
        return status;
    }

    /**
     * For responses, this returns true if the service returned a value for the Transitions property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasTransitions() {
        return transitions != null && !(transitions instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage class.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasTransitions} method.
     * </p>
     * 
     * @return Specifies when an Amazon S3 object transitions to a specified storage class.
     */
    public final List<Transition> transitions() {
        return transitions;
    }

    /**
     * For responses, this returns true if the service returned a value for the NoncurrentVersionTransitions property.
     * This DOES NOT check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the
     * property). This is useful because the SDK will never return a null collection or map, but you may need to
     * differentiate between the service returning nothing (or null) and the service returning an empty collection or
     * map. For requests, this returns true if a value for the property was specified in the request builder, and false
     * if a value was not specified.
     */
    public final boolean hasNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions != null && !(noncurrentVersionTransitions instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
     * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
     * period in the object's lifetime.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasNoncurrentVersionTransitions} method.
     * </p>
     * 
     * @return Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to
     *         a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set
     *         this action to request that Amazon S3 transition noncurrent object versions to a specific storage class
     *         at a set period in the object's lifetime.
     */
    public final List<NoncurrentVersionTransition> noncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * Returns the value of the NoncurrentVersionExpiration property for this object.
     * 
     * @return The value of the NoncurrentVersionExpiration property for this object.
     */
    public final NoncurrentVersionExpiration noncurrentVersionExpiration() {
        return noncurrentVersionExpiration;
    }

    /**
     * Returns the value of the AbortIncompleteMultipartUpload property for this object.
     * 
     * @return The value of the AbortIncompleteMultipartUpload property for this object.
     */
    public final AbortIncompleteMultipartUpload abortIncompleteMultipartUpload() {
        return abortIncompleteMultipartUpload;
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
        hashCode = 31 * hashCode + Objects.hashCode(expiration());
        hashCode = 31 * hashCode + Objects.hashCode(id());
        hashCode = 31 * hashCode + Objects.hashCode(prefix());
        hashCode = 31 * hashCode + Objects.hashCode(filter());
        hashCode = 31 * hashCode + Objects.hashCode(statusAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasTransitions() ? transitions() : null);
        hashCode = 31 * hashCode + Objects.hashCode(hasNoncurrentVersionTransitions() ? noncurrentVersionTransitions() : null);
        hashCode = 31 * hashCode + Objects.hashCode(noncurrentVersionExpiration());
        hashCode = 31 * hashCode + Objects.hashCode(abortIncompleteMultipartUpload());
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
        if (!(obj instanceof LifecycleRule)) {
            return false;
        }
        LifecycleRule other = (LifecycleRule) obj;
        return Objects.equals(expiration(), other.expiration()) && Objects.equals(id(), other.id())
                && Objects.equals(prefix(), other.prefix()) && Objects.equals(filter(), other.filter())
                && Objects.equals(statusAsString(), other.statusAsString()) && hasTransitions() == other.hasTransitions()
                && Objects.equals(transitions(), other.transitions())
                && hasNoncurrentVersionTransitions() == other.hasNoncurrentVersionTransitions()
                && Objects.equals(noncurrentVersionTransitions(), other.noncurrentVersionTransitions())
                && Objects.equals(noncurrentVersionExpiration(), other.noncurrentVersionExpiration())
                && Objects.equals(abortIncompleteMultipartUpload(), other.abortIncompleteMultipartUpload());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("LifecycleRule").add("Expiration", expiration()).add("ID", id()).add("Prefix", prefix())
                .add("Filter", filter()).add("Status", statusAsString())
                .add("Transitions", hasTransitions() ? transitions() : null)
                .add("NoncurrentVersionTransitions", hasNoncurrentVersionTransitions() ? noncurrentVersionTransitions() : null)
                .add("NoncurrentVersionExpiration", noncurrentVersionExpiration())
                .add("AbortIncompleteMultipartUpload", abortIncompleteMultipartUpload()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Expiration":
            return Optional.ofNullable(clazz.cast(expiration()));
        case "ID":
            return Optional.ofNullable(clazz.cast(id()));
        case "Prefix":
            return Optional.ofNullable(clazz.cast(prefix()));
        case "Filter":
            return Optional.ofNullable(clazz.cast(filter()));
        case "Status":
            return Optional.ofNullable(clazz.cast(statusAsString()));
        case "Transitions":
            return Optional.ofNullable(clazz.cast(transitions()));
        case "NoncurrentVersionTransitions":
            return Optional.ofNullable(clazz.cast(noncurrentVersionTransitions()));
        case "NoncurrentVersionExpiration":
            return Optional.ofNullable(clazz.cast(noncurrentVersionExpiration()));
        case "AbortIncompleteMultipartUpload":
            return Optional.ofNullable(clazz.cast(abortIncompleteMultipartUpload()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<LifecycleRule, T> g) {
        return obj -> g.apply((LifecycleRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, LifecycleRule> {
        /**
         * <p>
         * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object
         * has a delete marker.
         * </p>
         * 
         * @param expiration
         *        Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the
         *        object has a delete marker.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expiration(LifecycleExpiration expiration);

        /**
         * <p>
         * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object
         * has a delete marker.
         * </p>
         * This is a convenience method that creates an instance of the {@link LifecycleExpiration.Builder} avoiding the
         * need to create one manually via {@link LifecycleExpiration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link LifecycleExpiration.Builder#build()} is called immediately and
         * its result is passed to {@link #expiration(LifecycleExpiration)}.
         * 
         * @param expiration
         *        a consumer that will call methods on {@link LifecycleExpiration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #expiration(LifecycleExpiration)
         */
        default Builder expiration(Consumer<LifecycleExpiration.Builder> expiration) {
            return expiration(LifecycleExpiration.builder().applyMutation(expiration).build());
        }

        /**
         * <p>
         * Unique identifier for the rule. The value cannot be longer than 255 characters.
         * </p>
         * 
         * @param id
         *        Unique identifier for the rule. The value cannot be longer than 255 characters.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder id(String id);

        /**
         * <p>
         * Prefix identifying one or more objects to which the rule applies. This is no longer used; use
         * <code>Filter</code> instead.
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
         *        Prefix identifying one or more objects to which the rule applies. This is no longer used; use
         *        <code>Filter</code> instead.</p> <important>
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
         * <p>
         * The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A <code>Filter</code>
         * must have exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
         * <code>Filter</code> is required if the <code>LifecycleRule</code> does not contain a <code>Prefix</code>
         * element.
         * </p>
         * 
         * @param filter
         *        The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A
         *        <code>Filter</code> must have exactly one of <code>Prefix</code>, <code>Tag</code>, or
         *        <code>And</code> specified. <code>Filter</code> is required if the <code>LifecycleRule</code> does not
         *        contain a <code>Prefix</code> element.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder filter(LifecycleRuleFilter filter);

        /**
         * <p>
         * The <code>Filter</code> is used to identify objects that a Lifecycle Rule applies to. A <code>Filter</code>
         * must have exactly one of <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
         * <code>Filter</code> is required if the <code>LifecycleRule</code> does not contain a <code>Prefix</code>
         * element.
         * </p>
         * This is a convenience method that creates an instance of the {@link LifecycleRuleFilter.Builder} avoiding the
         * need to create one manually via {@link LifecycleRuleFilter#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link LifecycleRuleFilter.Builder#build()} is called immediately and
         * its result is passed to {@link #filter(LifecycleRuleFilter)}.
         * 
         * @param filter
         *        a consumer that will call methods on {@link LifecycleRuleFilter.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #filter(LifecycleRuleFilter)
         */
        default Builder filter(Consumer<LifecycleRuleFilter.Builder> filter) {
            return filter(LifecycleRuleFilter.builder().applyMutation(filter).build());
        }

        /**
         * <p>
         * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
         * </p>
         * 
         * @param status
         *        If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being
         *        applied.
         * @see ExpirationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpirationStatus
         */
        Builder status(String status);

        /**
         * <p>
         * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
         * </p>
         * 
         * @param status
         *        If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being
         *        applied.
         * @see ExpirationStatus
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpirationStatus
         */
        Builder status(ExpirationStatus status);

        /**
         * <p>
         * Specifies when an Amazon S3 object transitions to a specified storage class.
         * </p>
         * 
         * @param transitions
         *        Specifies when an Amazon S3 object transitions to a specified storage class.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder transitions(Collection<Transition> transitions);

        /**
         * <p>
         * Specifies when an Amazon S3 object transitions to a specified storage class.
         * </p>
         * 
         * @param transitions
         *        Specifies when an Amazon S3 object transitions to a specified storage class.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder transitions(Transition... transitions);

        /**
         * <p>
         * Specifies when an Amazon S3 object transitions to a specified storage class.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link Transition.Builder} avoiding the need to create one manually
         * via {@link Transition#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link Transition.Builder#build()} is called immediately and its
         * result is passed to {@link #transitions(List<Transition>)}.
         * 
         * @param transitions
         *        a consumer that will call methods on
         *        {@link Transition.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #transitions(Collection<Transition>)
         */
        Builder transitions(Consumer<Transition.Builder>... transitions);

        /**
         * <p>
         * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
         * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
         * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
         * period in the object's lifetime.
         * </p>
         * 
         * @param noncurrentVersionTransitions
         *        Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition
         *        to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you
         *        can set this action to request that Amazon S3 transition noncurrent object versions to a specific
         *        storage class at a set period in the object's lifetime.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder noncurrentVersionTransitions(Collection<NoncurrentVersionTransition> noncurrentVersionTransitions);

        /**
         * <p>
         * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
         * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
         * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
         * period in the object's lifetime.
         * </p>
         * 
         * @param noncurrentVersionTransitions
         *        Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition
         *        to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you
         *        can set this action to request that Amazon S3 transition noncurrent object versions to a specific
         *        storage class at a set period in the object's lifetime.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder noncurrentVersionTransitions(NoncurrentVersionTransition... noncurrentVersionTransitions);

        /**
         * <p>
         * Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a
         * specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this
         * action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set
         * period in the object's lifetime.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link NoncurrentVersionTransition.Builder} avoiding the need to
         * create one manually via
         * {@link NoncurrentVersionTransition#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link NoncurrentVersionTransition.Builder#build()} is called
         * immediately and its result is passed to {@link
         * #noncurrentVersionTransitions(List<NoncurrentVersionTransition>)}.
         * 
         * @param noncurrentVersionTransitions
         *        a consumer that will call methods on
         *        {@link NoncurrentVersionTransition.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #noncurrentVersionTransitions(Collection<NoncurrentVersionTransition>)
         */
        Builder noncurrentVersionTransitions(Consumer<NoncurrentVersionTransition.Builder>... noncurrentVersionTransitions);

        /**
         * Sets the value of the NoncurrentVersionExpiration property for this object.
         *
         * @param noncurrentVersionExpiration
         *        The new value for the NoncurrentVersionExpiration property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder noncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration);

        /**
         * Sets the value of the NoncurrentVersionExpiration property for this object.
         *
         * This is a convenience method that creates an instance of the {@link NoncurrentVersionExpiration.Builder}
         * avoiding the need to create one manually via {@link NoncurrentVersionExpiration#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link NoncurrentVersionExpiration.Builder#build()} is called
         * immediately and its result is passed to {@link #noncurrentVersionExpiration(NoncurrentVersionExpiration)}.
         * 
         * @param noncurrentVersionExpiration
         *        a consumer that will call methods on {@link NoncurrentVersionExpiration.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #noncurrentVersionExpiration(NoncurrentVersionExpiration)
         */
        default Builder noncurrentVersionExpiration(Consumer<NoncurrentVersionExpiration.Builder> noncurrentVersionExpiration) {
            return noncurrentVersionExpiration(NoncurrentVersionExpiration.builder().applyMutation(noncurrentVersionExpiration)
                    .build());
        }

        /**
         * Sets the value of the AbortIncompleteMultipartUpload property for this object.
         *
         * @param abortIncompleteMultipartUpload
         *        The new value for the AbortIncompleteMultipartUpload property for this object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder abortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload);

        /**
         * Sets the value of the AbortIncompleteMultipartUpload property for this object.
         *
         * This is a convenience method that creates an instance of the {@link AbortIncompleteMultipartUpload.Builder}
         * avoiding the need to create one manually via {@link AbortIncompleteMultipartUpload#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AbortIncompleteMultipartUpload.Builder#build()} is called
         * immediately and its result is passed to
         * {@link #abortIncompleteMultipartUpload(AbortIncompleteMultipartUpload)}.
         * 
         * @param abortIncompleteMultipartUpload
         *        a consumer that will call methods on {@link AbortIncompleteMultipartUpload.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #abortIncompleteMultipartUpload(AbortIncompleteMultipartUpload)
         */
        default Builder abortIncompleteMultipartUpload(
                Consumer<AbortIncompleteMultipartUpload.Builder> abortIncompleteMultipartUpload) {
            return abortIncompleteMultipartUpload(AbortIncompleteMultipartUpload.builder()
                    .applyMutation(abortIncompleteMultipartUpload).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private LifecycleExpiration expiration;

        private String id;

        private String prefix;

        private LifecycleRuleFilter filter;

        private String status;

        private List<Transition> transitions = DefaultSdkAutoConstructList.getInstance();

        private List<NoncurrentVersionTransition> noncurrentVersionTransitions = DefaultSdkAutoConstructList.getInstance();

        private NoncurrentVersionExpiration noncurrentVersionExpiration;

        private AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

        private BuilderImpl() {
        }

        private BuilderImpl(LifecycleRule model) {
            expiration(model.expiration);
            id(model.id);
            prefix(model.prefix);
            filter(model.filter);
            status(model.status);
            transitions(model.transitions);
            noncurrentVersionTransitions(model.noncurrentVersionTransitions);
            noncurrentVersionExpiration(model.noncurrentVersionExpiration);
            abortIncompleteMultipartUpload(model.abortIncompleteMultipartUpload);
        }

        public final LifecycleExpiration.Builder getExpiration() {
            return expiration != null ? expiration.toBuilder() : null;
        }

        public final void setExpiration(LifecycleExpiration.BuilderImpl expiration) {
            this.expiration = expiration != null ? expiration.build() : null;
        }

        @Override
        public final Builder expiration(LifecycleExpiration expiration) {
            this.expiration = expiration;
            return this;
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

        public final LifecycleRuleFilter.Builder getFilter() {
            return filter != null ? filter.toBuilder() : null;
        }

        public final void setFilter(LifecycleRuleFilter.BuilderImpl filter) {
            this.filter = filter != null ? filter.build() : null;
        }

        @Override
        public final Builder filter(LifecycleRuleFilter filter) {
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
        public final Builder status(ExpirationStatus status) {
            this.status(status == null ? null : status.toString());
            return this;
        }

        public final List<Transition.Builder> getTransitions() {
            List<Transition.Builder> result = TransitionListCopier.copyToBuilder(this.transitions);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setTransitions(Collection<Transition.BuilderImpl> transitions) {
            this.transitions = TransitionListCopier.copyFromBuilder(transitions);
        }

        @Override
        public final Builder transitions(Collection<Transition> transitions) {
            this.transitions = TransitionListCopier.copy(transitions);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder transitions(Transition... transitions) {
            transitions(Arrays.asList(transitions));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder transitions(Consumer<Transition.Builder>... transitions) {
            transitions(Stream.of(transitions).map(c -> Transition.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        public final List<NoncurrentVersionTransition.Builder> getNoncurrentVersionTransitions() {
            List<NoncurrentVersionTransition.Builder> result = NoncurrentVersionTransitionListCopier
                    .copyToBuilder(this.noncurrentVersionTransitions);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setNoncurrentVersionTransitions(
                Collection<NoncurrentVersionTransition.BuilderImpl> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = NoncurrentVersionTransitionListCopier
                    .copyFromBuilder(noncurrentVersionTransitions);
        }

        @Override
        public final Builder noncurrentVersionTransitions(Collection<NoncurrentVersionTransition> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = NoncurrentVersionTransitionListCopier.copy(noncurrentVersionTransitions);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder noncurrentVersionTransitions(NoncurrentVersionTransition... noncurrentVersionTransitions) {
            noncurrentVersionTransitions(Arrays.asList(noncurrentVersionTransitions));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder noncurrentVersionTransitions(
                Consumer<NoncurrentVersionTransition.Builder>... noncurrentVersionTransitions) {
            noncurrentVersionTransitions(Stream.of(noncurrentVersionTransitions)
                    .map(c -> NoncurrentVersionTransition.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final NoncurrentVersionExpiration.Builder getNoncurrentVersionExpiration() {
            return noncurrentVersionExpiration != null ? noncurrentVersionExpiration.toBuilder() : null;
        }

        public final void setNoncurrentVersionExpiration(NoncurrentVersionExpiration.BuilderImpl noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration != null ? noncurrentVersionExpiration.build() : null;
        }

        @Override
        public final Builder noncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }

        public final AbortIncompleteMultipartUpload.Builder getAbortIncompleteMultipartUpload() {
            return abortIncompleteMultipartUpload != null ? abortIncompleteMultipartUpload.toBuilder() : null;
        }

        public final void setAbortIncompleteMultipartUpload(
                AbortIncompleteMultipartUpload.BuilderImpl abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload != null ? abortIncompleteMultipartUpload.build()
                    : null;
        }

        @Override
        public final Builder abortIncompleteMultipartUpload(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        @Override
        public LifecycleRule build() {
            return new LifecycleRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
