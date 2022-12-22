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
 * Specifies website configuration parameters for an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class WebsiteConfiguration implements SdkPojo, Serializable,
        ToCopyableBuilder<WebsiteConfiguration.Builder, WebsiteConfiguration> {
    private static final SdkField<ErrorDocument> ERROR_DOCUMENT_FIELD = SdkField
            .<ErrorDocument> builder(MarshallingType.SDK_POJO)
            .memberName("ErrorDocument")
            .getter(getter(WebsiteConfiguration::errorDocument))
            .setter(setter(Builder::errorDocument))
            .constructor(ErrorDocument::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ErrorDocument")
                    .unmarshallLocationName("ErrorDocument").build()).build();

    private static final SdkField<IndexDocument> INDEX_DOCUMENT_FIELD = SdkField
            .<IndexDocument> builder(MarshallingType.SDK_POJO)
            .memberName("IndexDocument")
            .getter(getter(WebsiteConfiguration::indexDocument))
            .setter(setter(Builder::indexDocument))
            .constructor(IndexDocument::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("IndexDocument")
                    .unmarshallLocationName("IndexDocument").build()).build();

    private static final SdkField<RedirectAllRequestsTo> REDIRECT_ALL_REQUESTS_TO_FIELD = SdkField
            .<RedirectAllRequestsTo> builder(MarshallingType.SDK_POJO)
            .memberName("RedirectAllRequestsTo")
            .getter(getter(WebsiteConfiguration::redirectAllRequestsTo))
            .setter(setter(Builder::redirectAllRequestsTo))
            .constructor(RedirectAllRequestsTo::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RedirectAllRequestsTo")
                    .unmarshallLocationName("RedirectAllRequestsTo").build()).build();

    private static final SdkField<List<RoutingRule>> ROUTING_RULES_FIELD = SdkField
            .<List<RoutingRule>> builder(MarshallingType.LIST)
            .memberName("RoutingRules")
            .getter(getter(WebsiteConfiguration::routingRules))
            .setter(setter(Builder::routingRules))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("RoutingRules")
                    .unmarshallLocationName("RoutingRules").build(),
                    ListTrait
                            .builder()
                            .memberLocationName("RoutingRule")
                            .memberFieldInfo(
                                    SdkField.<RoutingRule> builder(MarshallingType.SDK_POJO)
                                            .constructor(RoutingRule::builder)
                                            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD)
                                                    .locationName("RoutingRule").unmarshallLocationName("RoutingRule").build())
                                            .build()).build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ERROR_DOCUMENT_FIELD,
            INDEX_DOCUMENT_FIELD, REDIRECT_ALL_REQUESTS_TO_FIELD, ROUTING_RULES_FIELD));

    private static final long serialVersionUID = 1L;

    private final ErrorDocument errorDocument;

    private final IndexDocument indexDocument;

    private final RedirectAllRequestsTo redirectAllRequestsTo;

    private final List<RoutingRule> routingRules;

    private WebsiteConfiguration(BuilderImpl builder) {
        this.errorDocument = builder.errorDocument;
        this.indexDocument = builder.indexDocument;
        this.redirectAllRequestsTo = builder.redirectAllRequestsTo;
        this.routingRules = builder.routingRules;
    }

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     * 
     * @return The name of the error document for the website.
     */
    public final ErrorDocument errorDocument() {
        return errorDocument;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     * 
     * @return The name of the index document for the website.
     */
    public final IndexDocument indexDocument() {
        return indexDocument;
    }

    /**
     * <p>
     * The redirect behavior for every request to this bucket's website endpoint.
     * </p>
     * <important>
     * <p>
     * If you specify this property, you can't specify any other property.
     * </p>
     * </important>
     * 
     * @return The redirect behavior for every request to this bucket's website endpoint.</p> <important>
     *         <p>
     *         If you specify this property, you can't specify any other property.
     *         </p>
     */
    public final RedirectAllRequestsTo redirectAllRequestsTo() {
        return redirectAllRequestsTo;
    }

    /**
     * For responses, this returns true if the service returned a value for the RoutingRules property. This DOES NOT
     * check that the value is non-empty (for which, you should check the {@code isEmpty()} method on the property).
     * This is useful because the SDK will never return a null collection or map, but you may need to differentiate
     * between the service returning nothing (or null) and the service returning an empty collection or map. For
     * requests, this returns true if a value for the property was specified in the request builder, and false if a
     * value was not specified.
     */
    public final boolean hasRoutingRules() {
        return routingRules != null && !(routingRules instanceof SdkAutoConstructList);
    }

    /**
     * <p>
     * Rules that define when a redirect is applied and the redirect behavior.
     * </p>
     * <p>
     * Attempts to modify the collection returned by this method will result in an UnsupportedOperationException.
     * </p>
     * <p>
     * This method will never return null. If you would like to know whether the service returned this field (so that
     * you can differentiate between null and empty), you can use the {@link #hasRoutingRules} method.
     * </p>
     * 
     * @return Rules that define when a redirect is applied and the redirect behavior.
     */
    public final List<RoutingRule> routingRules() {
        return routingRules;
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
        hashCode = 31 * hashCode + Objects.hashCode(errorDocument());
        hashCode = 31 * hashCode + Objects.hashCode(indexDocument());
        hashCode = 31 * hashCode + Objects.hashCode(redirectAllRequestsTo());
        hashCode = 31 * hashCode + Objects.hashCode(hasRoutingRules() ? routingRules() : null);
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
        if (!(obj instanceof WebsiteConfiguration)) {
            return false;
        }
        WebsiteConfiguration other = (WebsiteConfiguration) obj;
        return Objects.equals(errorDocument(), other.errorDocument()) && Objects.equals(indexDocument(), other.indexDocument())
                && Objects.equals(redirectAllRequestsTo(), other.redirectAllRequestsTo())
                && hasRoutingRules() == other.hasRoutingRules() && Objects.equals(routingRules(), other.routingRules());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("WebsiteConfiguration").add("ErrorDocument", errorDocument())
                .add("IndexDocument", indexDocument()).add("RedirectAllRequestsTo", redirectAllRequestsTo())
                .add("RoutingRules", hasRoutingRules() ? routingRules() : null).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "ErrorDocument":
            return Optional.ofNullable(clazz.cast(errorDocument()));
        case "IndexDocument":
            return Optional.ofNullable(clazz.cast(indexDocument()));
        case "RedirectAllRequestsTo":
            return Optional.ofNullable(clazz.cast(redirectAllRequestsTo()));
        case "RoutingRules":
            return Optional.ofNullable(clazz.cast(routingRules()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<WebsiteConfiguration, T> g) {
        return obj -> g.apply((WebsiteConfiguration) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, WebsiteConfiguration> {
        /**
         * <p>
         * The name of the error document for the website.
         * </p>
         * 
         * @param errorDocument
         *        The name of the error document for the website.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder errorDocument(ErrorDocument errorDocument);

        /**
         * <p>
         * The name of the error document for the website.
         * </p>
         * This is a convenience method that creates an instance of the {@link ErrorDocument.Builder} avoiding the need
         * to create one manually via {@link ErrorDocument#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link ErrorDocument.Builder#build()} is called immediately and its
         * result is passed to {@link #errorDocument(ErrorDocument)}.
         * 
         * @param errorDocument
         *        a consumer that will call methods on {@link ErrorDocument.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #errorDocument(ErrorDocument)
         */
        default Builder errorDocument(Consumer<ErrorDocument.Builder> errorDocument) {
            return errorDocument(ErrorDocument.builder().applyMutation(errorDocument).build());
        }

        /**
         * <p>
         * The name of the index document for the website.
         * </p>
         * 
         * @param indexDocument
         *        The name of the index document for the website.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder indexDocument(IndexDocument indexDocument);

        /**
         * <p>
         * The name of the index document for the website.
         * </p>
         * This is a convenience method that creates an instance of the {@link IndexDocument.Builder} avoiding the need
         * to create one manually via {@link IndexDocument#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link IndexDocument.Builder#build()} is called immediately and its
         * result is passed to {@link #indexDocument(IndexDocument)}.
         * 
         * @param indexDocument
         *        a consumer that will call methods on {@link IndexDocument.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #indexDocument(IndexDocument)
         */
        default Builder indexDocument(Consumer<IndexDocument.Builder> indexDocument) {
            return indexDocument(IndexDocument.builder().applyMutation(indexDocument).build());
        }

        /**
         * <p>
         * The redirect behavior for every request to this bucket's website endpoint.
         * </p>
         * <important>
         * <p>
         * If you specify this property, you can't specify any other property.
         * </p>
         * </important>
         * 
         * @param redirectAllRequestsTo
         *        The redirect behavior for every request to this bucket's website endpoint.</p> <important>
         *        <p>
         *        If you specify this property, you can't specify any other property.
         *        </p>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder redirectAllRequestsTo(RedirectAllRequestsTo redirectAllRequestsTo);

        /**
         * <p>
         * The redirect behavior for every request to this bucket's website endpoint.
         * </p>
         * <important>
         * <p>
         * If you specify this property, you can't specify any other property.
         * </p>
         * </important> This is a convenience method that creates an instance of the
         * {@link RedirectAllRequestsTo.Builder} avoiding the need to create one manually via
         * {@link RedirectAllRequestsTo#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link RedirectAllRequestsTo.Builder#build()} is called immediately and
         * its result is passed to {@link #redirectAllRequestsTo(RedirectAllRequestsTo)}.
         * 
         * @param redirectAllRequestsTo
         *        a consumer that will call methods on {@link RedirectAllRequestsTo.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #redirectAllRequestsTo(RedirectAllRequestsTo)
         */
        default Builder redirectAllRequestsTo(Consumer<RedirectAllRequestsTo.Builder> redirectAllRequestsTo) {
            return redirectAllRequestsTo(RedirectAllRequestsTo.builder().applyMutation(redirectAllRequestsTo).build());
        }

        /**
         * <p>
         * Rules that define when a redirect is applied and the redirect behavior.
         * </p>
         * 
         * @param routingRules
         *        Rules that define when a redirect is applied and the redirect behavior.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder routingRules(Collection<RoutingRule> routingRules);

        /**
         * <p>
         * Rules that define when a redirect is applied and the redirect behavior.
         * </p>
         * 
         * @param routingRules
         *        Rules that define when a redirect is applied and the redirect behavior.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder routingRules(RoutingRule... routingRules);

        /**
         * <p>
         * Rules that define when a redirect is applied and the redirect behavior.
         * </p>
         * This is a convenience method that creates an instance of the
         * {@link RoutingRule.Builder} avoiding the need to create one manually
         * via {@link RoutingRule#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes,
         * {@link RoutingRule.Builder#build()} is called immediately and its
         * result is passed to {@link #routingRules(List<RoutingRule>)}.
         * 
         * @param routingRules
         *        a consumer that will call methods on
         *        {@link RoutingRule.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #routingRules(Collection<RoutingRule>)
         */
        Builder routingRules(Consumer<RoutingRule.Builder>... routingRules);
    }

    static final class BuilderImpl implements Builder {
        private ErrorDocument errorDocument;

        private IndexDocument indexDocument;

        private RedirectAllRequestsTo redirectAllRequestsTo;

        private List<RoutingRule> routingRules = DefaultSdkAutoConstructList.getInstance();

        private BuilderImpl() {
        }

        private BuilderImpl(WebsiteConfiguration model) {
            errorDocument(model.errorDocument);
            indexDocument(model.indexDocument);
            redirectAllRequestsTo(model.redirectAllRequestsTo);
            routingRules(model.routingRules);
        }

        public final ErrorDocument.Builder getErrorDocument() {
            return errorDocument != null ? errorDocument.toBuilder() : null;
        }

        public final void setErrorDocument(ErrorDocument.BuilderImpl errorDocument) {
            this.errorDocument = errorDocument != null ? errorDocument.build() : null;
        }

        @Override
        public final Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        public final IndexDocument.Builder getIndexDocument() {
            return indexDocument != null ? indexDocument.toBuilder() : null;
        }

        public final void setIndexDocument(IndexDocument.BuilderImpl indexDocument) {
            this.indexDocument = indexDocument != null ? indexDocument.build() : null;
        }

        @Override
        public final Builder indexDocument(IndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        public final RedirectAllRequestsTo.Builder getRedirectAllRequestsTo() {
            return redirectAllRequestsTo != null ? redirectAllRequestsTo.toBuilder() : null;
        }

        public final void setRedirectAllRequestsTo(RedirectAllRequestsTo.BuilderImpl redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo != null ? redirectAllRequestsTo.build() : null;
        }

        @Override
        public final Builder redirectAllRequestsTo(RedirectAllRequestsTo redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            return this;
        }

        public final List<RoutingRule.Builder> getRoutingRules() {
            List<RoutingRule.Builder> result = RoutingRulesCopier.copyToBuilder(this.routingRules);
            if (result instanceof SdkAutoConstructList) {
                return null;
            }
            return result;
        }

        public final void setRoutingRules(Collection<RoutingRule.BuilderImpl> routingRules) {
            this.routingRules = RoutingRulesCopier.copyFromBuilder(routingRules);
        }

        @Override
        public final Builder routingRules(Collection<RoutingRule> routingRules) {
            this.routingRules = RoutingRulesCopier.copy(routingRules);
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder routingRules(RoutingRule... routingRules) {
            routingRules(Arrays.asList(routingRules));
            return this;
        }

        @Override
        @SafeVarargs
        public final Builder routingRules(Consumer<RoutingRule.Builder>... routingRules) {
            routingRules(Stream.of(routingRules).map(c -> RoutingRule.builder().applyMutation(c).build())
                    .collect(Collectors.toList()));
            return this;
        }

        @Override
        public WebsiteConfiguration build() {
            return new WebsiteConfiguration(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
