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
 * Specifies the redirect behavior and when a redirect is applied. For more information about routing rules, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html#advanced-conditional-redirects">
 * Configuring advanced conditional redirects</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class RoutingRule implements SdkPojo, Serializable, ToCopyableBuilder<RoutingRule.Builder, RoutingRule> {
    private static final SdkField<Condition> CONDITION_FIELD = SdkField
            .<Condition> builder(MarshallingType.SDK_POJO)
            .memberName("Condition")
            .getter(getter(RoutingRule::condition))
            .setter(setter(Builder::condition))
            .constructor(Condition::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Condition")
                    .unmarshallLocationName("Condition").build()).build();

    private static final SdkField<Redirect> REDIRECT_FIELD = SdkField
            .<Redirect> builder(MarshallingType.SDK_POJO)
            .memberName("Redirect")
            .getter(getter(RoutingRule::redirect))
            .setter(setter(Builder::redirect))
            .constructor(Redirect::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Redirect")
                    .unmarshallLocationName("Redirect").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(CONDITION_FIELD,
            REDIRECT_FIELD));

    private static final long serialVersionUID = 1L;

    private final Condition condition;

    private final Redirect redirect;

    private RoutingRule(BuilderImpl builder) {
        this.condition = builder.condition;
        this.redirect = builder.redirect;
    }

    /**
     * <p>
     * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If
     * request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2. If
     * request results in HTTP error 4xx, redirect request to another host where you might process the error.
     * </p>
     * 
     * @return A container for describing a condition that must be met for the specified redirect to apply. For example,
     *         1. If request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code>
     *         folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process
     *         the error.
     */
    public final Condition condition() {
        return condition;
    }

    /**
     * <p>
     * Container for redirect information. You can redirect requests to another host, to another page, or with another
     * protocol. In the event of an error, you can specify a different error code to return.
     * </p>
     * 
     * @return Container for redirect information. You can redirect requests to another host, to another page, or with
     *         another protocol. In the event of an error, you can specify a different error code to return.
     */
    public final Redirect redirect() {
        return redirect;
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
        hashCode = 31 * hashCode + Objects.hashCode(condition());
        hashCode = 31 * hashCode + Objects.hashCode(redirect());
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
        if (!(obj instanceof RoutingRule)) {
            return false;
        }
        RoutingRule other = (RoutingRule) obj;
        return Objects.equals(condition(), other.condition()) && Objects.equals(redirect(), other.redirect());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("RoutingRule").add("Condition", condition()).add("Redirect", redirect()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Condition":
            return Optional.ofNullable(clazz.cast(condition()));
        case "Redirect":
            return Optional.ofNullable(clazz.cast(redirect()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<RoutingRule, T> g) {
        return obj -> g.apply((RoutingRule) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, RoutingRule> {
        /**
         * <p>
         * A container for describing a condition that must be met for the specified redirect to apply. For example, 1.
         * If request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2.
         * If request results in HTTP error 4xx, redirect request to another host where you might process the error.
         * </p>
         * 
         * @param condition
         *        A container for describing a condition that must be met for the specified redirect to apply. For
         *        example, 1. If request is for pages in the <code>/docs</code> folder, redirect to the
         *        <code>/documents</code> folder. 2. If request results in HTTP error 4xx, redirect request to another
         *        host where you might process the error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder condition(Condition condition);

        /**
         * <p>
         * A container for describing a condition that must be met for the specified redirect to apply. For example, 1.
         * If request is for pages in the <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2.
         * If request results in HTTP error 4xx, redirect request to another host where you might process the error.
         * </p>
         * This is a convenience method that creates an instance of the {@link Condition.Builder} avoiding the need to
         * create one manually via {@link Condition#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Condition.Builder#build()} is called immediately and its result
         * is passed to {@link #condition(Condition)}.
         * 
         * @param condition
         *        a consumer that will call methods on {@link Condition.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #condition(Condition)
         */
        default Builder condition(Consumer<Condition.Builder> condition) {
            return condition(Condition.builder().applyMutation(condition).build());
        }

        /**
         * <p>
         * Container for redirect information. You can redirect requests to another host, to another page, or with
         * another protocol. In the event of an error, you can specify a different error code to return.
         * </p>
         * 
         * @param redirect
         *        Container for redirect information. You can redirect requests to another host, to another page, or
         *        with another protocol. In the event of an error, you can specify a different error code to return.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder redirect(Redirect redirect);

        /**
         * <p>
         * Container for redirect information. You can redirect requests to another host, to another page, or with
         * another protocol. In the event of an error, you can specify a different error code to return.
         * </p>
         * This is a convenience method that creates an instance of the {@link Redirect.Builder} avoiding the need to
         * create one manually via {@link Redirect#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link Redirect.Builder#build()} is called immediately and its result is
         * passed to {@link #redirect(Redirect)}.
         * 
         * @param redirect
         *        a consumer that will call methods on {@link Redirect.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #redirect(Redirect)
         */
        default Builder redirect(Consumer<Redirect.Builder> redirect) {
            return redirect(Redirect.builder().applyMutation(redirect).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private Condition condition;

        private Redirect redirect;

        private BuilderImpl() {
        }

        private BuilderImpl(RoutingRule model) {
            condition(model.condition);
            redirect(model.redirect);
        }

        public final Condition.Builder getCondition() {
            return condition != null ? condition.toBuilder() : null;
        }

        public final void setCondition(Condition.BuilderImpl condition) {
            this.condition = condition != null ? condition.build() : null;
        }

        @Override
        public final Builder condition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public final Redirect.Builder getRedirect() {
            return redirect != null ? redirect.toBuilder() : null;
        }

        public final void setRedirect(Redirect.BuilderImpl redirect) {
            this.redirect = redirect != null ? redirect.build() : null;
        }

        @Override
        public final Builder redirect(Redirect redirect) {
            this.redirect = redirect;
            return this;
        }

        @Override
        public RoutingRule build() {
            return new RoutingRule(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
