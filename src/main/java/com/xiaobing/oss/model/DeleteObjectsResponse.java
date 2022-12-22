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
 */
@Generated("software.amazon.awssdk:codegen")
public final class DeleteObjectsResponse extends S3Response implements
        ToCopyableBuilder<DeleteObjectsResponse.Builder, DeleteObjectsResponse> {
    private static final SdkField<List<DeletedObject>> DELETED_FIELD = SdkField
            .<List<DeletedObject>> builder(MarshallingType.LIST)
            .memberName("Deleted")
            .getter(getter(DeleteObjectsResponse::deleted))
            .setter(setter(Builder::deleted))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Deleted")
                    .unmarshallLocationName("Deleted").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<DeletedObject> builder(MarshallingType.SDK_POJO)
                                            .constructor(DeletedObject::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final SdkField<String> REQUEST_CHARGED_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("RequestCharged")
            .getter(getter(DeleteObjectsResponse::requestChargedAsString))
            .setter(setter(Builder::requestCharged))
            .traits(LocationTrait.builder().location(MarshallLocation.HEADER).locationName("x-amz-request-charged")
                    .unmarshallLocationName("x-amz-request-charged").build()).build();

    private static final SdkField<List<S3Error>> ERRORS_FIELD = SdkField
            .<List<S3Error>> builder(MarshallingType.LIST)
            .memberName("Errors")
            .getter(getter(DeleteObjectsResponse::errors))
            .setter(setter(Builder::errors))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Error")
                    .unmarshallLocationName("Error").build(),
                    ListTrait
                            .builder()
                            .memberLocationName(null)
                            .memberFieldInfo(
                                    SdkField.<S3Error> builder(MarshallingType.SDK_POJO)
                                            .constructor(S3Error::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("member").unmarshallLocationName("member").build()).build())
                            .isFlattened(true).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DELETED_FIELD,
            REQUEST_CHARGED_FIELD, ERRORS_FIELD));

    private final List<DeletedObject> deleted;

    private final String requestCharged;

    private final List<S3Error> errors;

    private DeleteObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.deleted = builder.deleted;
        this.requestCharged = builder.requestCharged;
        this.errors = builder.errors;
    }

    /**
     * For responses, this returns true if the service returned a value for the Deleted property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasDeleted() {
        return deleted != null && !(deleted instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container element for a successful delete. It identifies the object that was successfully deleted.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasDeleted} method.
     * </p>
     * 
     * @return Container element for a successful delete. It identifies the object that was successfully deleted.
     */
    public final List<DeletedObject> deleted() {
        return deleted;
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final RequestCharged requestCharged() {
        return RequestCharged.fromValue(requestCharged);
    }

    /**
     * Returns the value of the RequestCharged property for this object.
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #requestCharged}
     * will return {@link RequestCharged#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #requestChargedAsString}.
     * </p>
     * 
     * @return The value of the RequestCharged property for this object.
     * @see RequestCharged
     */
    public final String requestChargedAsString() {
        return requestCharged;
    }

    /**
     * For responses, this returns true if the service returned a value for the Errors property. This DOES NOT check
     * that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property). This is
     * useful because the SDK will never return a null collection or map, but you may need to differentiate between the
     * service returning nothing (or null) and the service returning an empty collection or map. For requests, this
     * returns true if a value for the property was specified in the request builder, and false if a value was not
     * specified.
     */
    public final boolean hasErrors() {
        return errors != null && !(errors instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the error
     * it encountered.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasErrors} method.
     * </p>
     * 
     * @return Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the
     *         error it encountered.
     */
    public final List<S3Error> errors() {
        return errors;
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
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(hasDeleted() ? deleted() : null);
        hashCode = 31 * hashCode + Objects.hashCode(requestChargedAsString());
        hashCode = 31 * hashCode + Objects.hashCode(hasErrors() ? errors() : null);
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DeleteObjectsResponse)) {
            return false;
        }
        DeleteObjectsResponse other = (DeleteObjectsResponse) obj;
        return hasDeleted() == other.hasDeleted() && Objects.equals(deleted(), other.deleted())
                && Objects.equals(requestChargedAsString(), other.requestChargedAsString()) && hasErrors() == other.hasErrors()
                && Objects.equals(errors(), other.errors());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DeleteObjectsResponse").add("Deleted", hasDeleted() ? deleted() : null)
                .add("RequestCharged", requestChargedAsString()).add("Errors", hasErrors() ? errors() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Deleted":
            return Optional.ofNullable(clazz.cast(deleted()));
        case "RequestCharged":
            return Optional.ofNullable(clazz.cast(requestChargedAsString()));
        case "Errors":
            return Optional.ofNullable(clazz.cast(errors()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DeleteObjectsResponse, T> g) {
        return obj -> g.apply((DeleteObjectsResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends S3Response.Builder, SdkPojo, CopyableBuilder<Builder, DeleteObjectsResponse> {
        /**
         * <p>
         * Container element for a successful delete. It identifies the object that was successfully deleted.
         * </p>
         * 
         * @param deleted
         *        Container element for a successful delete. It identifies the object that was successfully deleted.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleted(Collection<DeletedObject> deleted);

        /**
         * <p>
         * Container element for a successful delete. It identifies the object that was successfully deleted.
         * </p>
         * 
         * @param deleted
         *        Container element for a successful delete. It identifies the object that was successfully deleted.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder deleted(DeletedObject... deleted);

        /**
         * <p>
         * Container element for a successful delete. It identifies the object that was successfully deleted.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link DeletedObject.Builder} avoiding the need to create one
         * manually via {@link DeletedObject#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link DeletedObject.Builder#build()} is called immediately and its
         * result is passed to {@link #deleted(List<DeletedObject>)}.
         * 
         * @param deleted
         *        a consumer that will call methods on
         *        {@link DeletedObject.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #deleted(Collection<DeletedObject>)
         */
        Builder deleted(Consumer<DeletedObject.Builder>... deleted);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(String requestCharged);

        /**
         * Sets the value of the RequestCharged property for this object.
         *
         * @param requestCharged
         *        The new value for the RequestCharged property for this object.
         * @see RequestCharged
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RequestCharged
         */
        Builder requestCharged(RequestCharged requestCharged);

        /**
         * <p>
         * Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the
         * error it encountered.
         * </p>
         * 
         * @param errors
         *        Container for a failed delete action that describes the object that Amazon S3 attempted to delete and
         *        the error it encountered.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder errors(Collection<S3Error> errors);

        /**
         * <p>
         * Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the
         * error it encountered.
         * </p>
         * 
         * @param errors
         *        Container for a failed delete action that describes the object that Amazon S3 attempted to delete and
         *        the error it encountered.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder errors(S3Error... errors);

        /**
         * <p>
         * Container for a failed delete action that describes the object that Amazon S3 attempted to delete and the
         * error it encountered.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link S3Error.Builder} avoiding the need to create one manually via
         * {@link S3Error#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link S3Error.Builder#build()}
         * is called immediately and its result is passed to {@link #errors(List<S3Error>)}.
         * 
         * @param errors
         *        a consumer that will call methods on {@link S3Error.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #errors(Collection<S3Error>)
         */
        Builder errors(Consumer<S3Error.Builder>... errors);
    }

    static final class BuilderImpl extends S3Response.BuilderImpl implements Builder {
        private List<DeletedObject> deleted = DefaultSdkAutoConstructList.getInstance();

        private String requestCharged;

        private List<S3Error> errors = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(DeleteObjectsResponse model) {
            super(model);
            deleted(model.deleted);
            requestCharged(model.requestCharged);
            errors(model.errors);
        }

        public final List<DeletedObject.Builder> getDeleted() {
            List<DeletedObject.Builder> result = DeletedObjectsCopier.copyToBuilder(this.deleted);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setDeleted(Collection<DeletedObject.BuilderImpl> deleted) {
            this.deleted = DeletedObjectsCopier.copyFromBuilder(deleted);
        }

        @Override
        public final Builder deleted(Collection<DeletedObject> deleted) {
            this.deleted = DeletedObjectsCopier.copy(deleted);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder deleted(DeletedObject... deleted) {
            deleted(Arrays.asList(deleted));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder deleted(Consumer<DeletedObject.Builder>... deleted) {
            deleted(Stream.of(deleted).map(c -> DeletedObject.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        public final String getRequestCharged() {
            return requestCharged;
        }

        public final void setRequestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
        }

        @Override
        public final Builder requestCharged(String requestCharged) {
            this.requestCharged = requestCharged;
            return this;
        }

        @Override
        public final Builder requestCharged(RequestCharged requestCharged) {
            this.requestCharged(requestCharged == null ? null : requestCharged.toString());
            return this;
        }

        public final List<S3Error.Builder> getErrors() {
            List<S3Error.Builder> result = ErrorsCopier.copyToBuilder(this.errors);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setErrors(Collection<S3Error.BuilderImpl> errors) {
            this.errors = ErrorsCopier.copyFromBuilder(errors);
        }

        @Override
        public final Builder errors(Collection<S3Error> errors) {
            this.errors = ErrorsCopier.copy(errors);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder errors(S3Error... errors) {
            errors(Arrays.asList(errors));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder errors(Consumer<S3Error.Builder>... errors) {
            errors(Stream.of(errors).map(c -> S3Error.builder().applyMutation(c).build()).collect(Collectors.toList()));
            return this;
        }

        @Override
        public DeleteObjectsResponse build() {
            return new DeleteObjectsResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
