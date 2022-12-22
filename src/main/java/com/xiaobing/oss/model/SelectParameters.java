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
 * Describes the parameters for Select job types.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class SelectParameters implements SdkPojo, Serializable,
        ToCopyableBuilder<SelectParameters.Builder, SelectParameters> {
    private static final SdkField<InputSerialization> INPUT_SERIALIZATION_FIELD = SdkField
            .<InputSerialization> builder(MarshallingType.SDK_POJO)
            .memberName("InputSerialization")
            .getter(getter(SelectParameters::inputSerialization))
            .setter(setter(Builder::inputSerialization))
            .constructor(InputSerialization::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("InputSerialization")
                    .unmarshallLocationName("InputSerialization").build()).build();

    private static final SdkField<String> EXPRESSION_TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("ExpressionType")
            .getter(getter(SelectParameters::expressionTypeAsString))
            .setter(setter(Builder::expressionType))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ExpressionType")
                    .unmarshallLocationName("ExpressionType").build()).build();

    private static final SdkField<String> EXPRESSION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Expression")
            .getter(getter(SelectParameters::expression))
            .setter(setter(Builder::expression))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Expression")
                    .unmarshallLocationName("Expression").build()).build();

    private static final SdkField<OutputSerialization> OUTPUT_SERIALIZATION_FIELD = SdkField
            .<OutputSerialization> builder(MarshallingType.SDK_POJO)
            .memberName("OutputSerialization")
            .getter(getter(SelectParameters::outputSerialization))
            .setter(setter(Builder::outputSerialization))
            .constructor(OutputSerialization::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OutputSerialization")
                    .unmarshallLocationName("OutputSerialization").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(INPUT_SERIALIZATION_FIELD,
            EXPRESSION_TYPE_FIELD, EXPRESSION_FIELD, OUTPUT_SERIALIZATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final InputSerialization inputSerialization;

    private final String expressionType;

    private final String expression;

    private final OutputSerialization outputSerialization;

    private SelectParameters(BuilderImpl builder) {
        this.inputSerialization = builder.inputSerialization;
        this.expressionType = builder.expressionType;
        this.expression = builder.expression;
        this.outputSerialization = builder.outputSerialization;
    }

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     * 
     * @return Describes the serialization format of the object.
     */
    public final InputSerialization inputSerialization() {
        return inputSerialization;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #expressionType}
     * will return {@link ExpressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #expressionTypeAsString}.
     * </p>
     * 
     * @return The type of the provided expression (for example, SQL).
     * @see ExpressionType
     */
    public final ExpressionType expressionType() {
        return ExpressionType.fromValue(expressionType);
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #expressionType}
     * will return {@link ExpressionType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available
     * from {@link #expressionTypeAsString}.
     * </p>
     * 
     * @return The type of the provided expression (for example, SQL).
     * @see ExpressionType
     */
    public final String expressionTypeAsString() {
        return expressionType;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     * 
     * @return The expression that is used to query the object.
     */
    public final String expression() {
        return expression;
    }

    /**
     * <p>
     * Describes how the results of the Select job are serialized.
     * </p>
     * 
     * @return Describes how the results of the Select job are serialized.
     */
    public final OutputSerialization outputSerialization() {
        return outputSerialization;
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
        hashCode = 31 * hashCode + Objects.hashCode(inputSerialization());
        hashCode = 31 * hashCode + Objects.hashCode(expressionTypeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(expression());
        hashCode = 31 * hashCode + Objects.hashCode(outputSerialization());
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
        if (!(obj instanceof SelectParameters)) {
            return false;
        }
        SelectParameters other = (SelectParameters) obj;
        return Objects.equals(inputSerialization(), other.inputSerialization())
                && Objects.equals(expressionTypeAsString(), other.expressionTypeAsString())
                && Objects.equals(expression(), other.expression())
                && Objects.equals(outputSerialization(), other.outputSerialization());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("SelectParameters").add("InputSerialization", inputSerialization())
                .add("ExpressionType", expressionTypeAsString()).add("Expression", expression())
                .add("OutputSerialization", outputSerialization()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "InputSerialization":
            return Optional.ofNullable(clazz.cast(inputSerialization()));
        case "ExpressionType":
            return Optional.ofNullable(clazz.cast(expressionTypeAsString()));
        case "Expression":
            return Optional.ofNullable(clazz.cast(expression()));
        case "OutputSerialization":
            return Optional.ofNullable(clazz.cast(outputSerialization()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<SelectParameters, T> g) {
        return obj -> g.apply((SelectParameters) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, SelectParameters> {
        /**
         * <p>
         * Describes the serialization format of the object.
         * </p>
         * 
         * @param inputSerialization
         *        Describes the serialization format of the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder inputSerialization(InputSerialization inputSerialization);

        /**
         * <p>
         * Describes the serialization format of the object.
         * </p>
         * This is a convenience method that creates an instance of the {@link InputSerialization.Builder} avoiding the
         * need to create one manually via {@link InputSerialization#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link InputSerialization.Builder#build()} is called immediately and its
         * result is passed to {@link #inputSerialization(InputSerialization)}.
         * 
         * @param inputSerialization
         *        a consumer that will call methods on {@link InputSerialization.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #inputSerialization(InputSerialization)
         */
        default Builder inputSerialization(Consumer<InputSerialization.Builder> inputSerialization) {
            return inputSerialization(InputSerialization.builder().applyMutation(inputSerialization).build());
        }

        /**
         * <p>
         * The type of the provided expression (for example, SQL).
         * </p>
         * 
         * @param expressionType
         *        The type of the provided expression (for example, SQL).
         * @see ExpressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpressionType
         */
        Builder expressionType(String expressionType);

        /**
         * <p>
         * The type of the provided expression (for example, SQL).
         * </p>
         * 
         * @param expressionType
         *        The type of the provided expression (for example, SQL).
         * @see ExpressionType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see ExpressionType
         */
        Builder expressionType(ExpressionType expressionType);

        /**
         * <p>
         * The expression that is used to query the object.
         * </p>
         * 
         * @param expression
         *        The expression that is used to query the object.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder expression(String expression);

        /**
         * <p>
         * Describes how the results of the Select job are serialized.
         * </p>
         * 
         * @param outputSerialization
         *        Describes how the results of the Select job are serialized.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder outputSerialization(OutputSerialization outputSerialization);

        /**
         * <p>
         * Describes how the results of the Select job are serialized.
         * </p>
         * This is a convenience method that creates an instance of the {@link OutputSerialization.Builder} avoiding the
         * need to create one manually via {@link OutputSerialization#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link OutputSerialization.Builder#build()} is called immediately and
         * its result is passed to {@link #outputSerialization(OutputSerialization)}.
         * 
         * @param outputSerialization
         *        a consumer that will call methods on {@link OutputSerialization.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #outputSerialization(OutputSerialization)
         */
        default Builder outputSerialization(Consumer<OutputSerialization.Builder> outputSerialization) {
            return outputSerialization(OutputSerialization.builder().applyMutation(outputSerialization).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private InputSerialization inputSerialization;

        private String expressionType;

        private String expression;

        private OutputSerialization outputSerialization;

        private BuilderImpl() {
        }

        private BuilderImpl(SelectParameters model) {
            inputSerialization(model.inputSerialization);
            expressionType(model.expressionType);
            expression(model.expression);
            outputSerialization(model.outputSerialization);
        }

        public final InputSerialization.Builder getInputSerialization() {
            return inputSerialization != null ? inputSerialization.toBuilder() : null;
        }

        public final void setInputSerialization(InputSerialization.BuilderImpl inputSerialization) {
            this.inputSerialization = inputSerialization != null ? inputSerialization.build() : null;
        }

        @Override
        public final Builder inputSerialization(InputSerialization inputSerialization) {
            this.inputSerialization = inputSerialization;
            return this;
        }

        public final String getExpressionType() {
            return expressionType;
        }

        public final void setExpressionType(String expressionType) {
            this.expressionType = expressionType;
        }

        @Override
        public final Builder expressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        @Override
        public final Builder expressionType(ExpressionType expressionType) {
            this.expressionType(expressionType == null ? null : expressionType.toString());
            return this;
        }

        public final String getExpression() {
            return expression;
        }

        public final void setExpression(String expression) {
            this.expression = expression;
        }

        @Override
        public final Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public final OutputSerialization.Builder getOutputSerialization() {
            return outputSerialization != null ? outputSerialization.toBuilder() : null;
        }

        public final void setOutputSerialization(OutputSerialization.BuilderImpl outputSerialization) {
            this.outputSerialization = outputSerialization != null ? outputSerialization.build() : null;
        }

        @Override
        public final Builder outputSerialization(OutputSerialization outputSerialization) {
            this.outputSerialization = outputSerialization;
            return this;
        }

        @Override
        public SelectParameters build() {
            return new SelectParameters(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
