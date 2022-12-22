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
 * Container for restore job parameters.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class RestoreRequest implements SdkPojo, Serializable, ToCopyableBuilder<RestoreRequest.Builder, RestoreRequest> {
    private static final SdkField<Integer> DAYS_FIELD = SdkField
            .<Integer> builder(MarshallingType.INTEGER)
            .memberName("Days")
            .getter(getter(RestoreRequest::days))
            .setter(setter(Builder::days))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Days")
                    .unmarshallLocationName("Days").build()).build();

    private static final SdkField<GlacierJobParameters> GLACIER_JOB_PARAMETERS_FIELD = SdkField
            .<GlacierJobParameters> builder(MarshallingType.SDK_POJO)
            .memberName("GlacierJobParameters")
            .getter(getter(RestoreRequest::glacierJobParameters))
            .setter(setter(Builder::glacierJobParameters))
            .constructor(GlacierJobParameters::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("GlacierJobParameters")
                    .unmarshallLocationName("GlacierJobParameters").build()).build();

    private static final SdkField<String> TYPE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Type")
            .getter(getter(RestoreRequest::typeAsString))
            .setter(setter(Builder::type))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Type")
                    .unmarshallLocationName("Type").build()).build();

    private static final SdkField<String> TIER_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Tier")
            .getter(getter(RestoreRequest::tierAsString))
            .setter(setter(Builder::tier))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Tier")
                    .unmarshallLocationName("Tier").build()).build();

    private static final SdkField<String> DESCRIPTION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Description")
            .getter(getter(RestoreRequest::description))
            .setter(setter(Builder::description))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Description")
                    .unmarshallLocationName("Description").build()).build();

    private static final SdkField<SelectParameters> SELECT_PARAMETERS_FIELD = SdkField
            .<SelectParameters> builder(MarshallingType.SDK_POJO)
            .memberName("SelectParameters")
            .getter(getter(RestoreRequest::selectParameters))
            .setter(setter(Builder::selectParameters))
            .constructor(SelectParameters::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("SelectParameters")
                    .unmarshallLocationName("SelectParameters").build()).build();

    private static final SdkField<OutputLocation> OUTPUT_LOCATION_FIELD = SdkField
            .<OutputLocation> builder(MarshallingType.SDK_POJO)
            .memberName("OutputLocation")
            .getter(getter(RestoreRequest::outputLocation))
            .setter(setter(Builder::outputLocation))
            .constructor(OutputLocation::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OutputLocation")
                    .unmarshallLocationName("OutputLocation").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DAYS_FIELD,
            GLACIER_JOB_PARAMETERS_FIELD, TYPE_FIELD, TIER_FIELD, DESCRIPTION_FIELD, SELECT_PARAMETERS_FIELD,
            OUTPUT_LOCATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final Integer days;

    private final GlacierJobParameters glacierJobParameters;

    private final String type;

    private final String tier;

    private final String description;

    private final SelectParameters selectParameters;

    private final OutputLocation outputLocation;

    private RestoreRequest(BuilderImpl builder) {
        this.days = builder.days;
        this.glacierJobParameters = builder.glacierJobParameters;
        this.type = builder.type;
        this.tier = builder.tier;
        this.description = builder.description;
        this.selectParameters = builder.selectParameters;
        this.outputLocation = builder.outputLocation;
    }

    /**
     * <p>
     * Lifetime of the active copy in days. Do not use with restores that specify <code>OutputLocation</code>.
     * </p>
     * <p>
     * The Days element is required for regular restores, and must not be provided for select requests.
     * </p>
     * 
     * @return Lifetime of the active copy in days. Do not use with restores that specify <code>OutputLocation</code>
     *         .</p>
     *         <p>
     *         The Days element is required for regular restores, and must not be provided for select requests.
     */
    public final Integer days() {
        return days;
    }

    /**
     * <p>
     * S3 Glacier related parameters pertaining to this job. Do not use with restores that specify
     * <code>OutputLocation</code>.
     * </p>
     * 
     * @return S3 Glacier related parameters pertaining to this job. Do not use with restores that specify
     *         <code>OutputLocation</code>.
     */
    public final GlacierJobParameters glacierJobParameters() {
        return glacierJobParameters;
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link RestoreRequestType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return Type of restore request.
     * @see RestoreRequestType
     */
    public final RestoreRequestType type() {
        return RestoreRequestType.fromValue(type);
    }

    /**
     * <p>
     * Type of restore request.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #type} will return
     * {@link RestoreRequestType#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #typeAsString}.
     * </p>
     * 
     * @return Type of restore request.
     * @see RestoreRequestType
     */
    public final String typeAsString() {
        return type;
    }

    /**
     * <p>
     * Retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #tier} will return
     * {@link Tier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #tierAsString}.
     * </p>
     * 
     * @return Retrieval tier at which the restore will be processed.
     * @see Tier
     */
    public final Tier tier() {
        return Tier.fromValue(tier);
    }

    /**
     * <p>
     * Retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #tier} will return
     * {@link Tier#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #tierAsString}.
     * </p>
     * 
     * @return Retrieval tier at which the restore will be processed.
     * @see Tier
     */
    public final String tierAsString() {
        return tier;
    }

    /**
     * <p>
     * The optional description for the job.
     * </p>
     * 
     * @return The optional description for the job.
     */
    public final String description() {
        return description;
    }

    /**
     * <p>
     * Describes the parameters for Select job types.
     * </p>
     * 
     * @return Describes the parameters for Select job types.
     */
    public final SelectParameters selectParameters() {
        return selectParameters;
    }

    /**
     * <p>
     * Describes the location where the restore job's output is stored.
     * </p>
     * 
     * @return Describes the location where the restore job's output is stored.
     */
    public final OutputLocation outputLocation() {
        return outputLocation;
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
        hashCode = 31 * hashCode + Objects.hashCode(days());
        hashCode = 31 * hashCode + Objects.hashCode(glacierJobParameters());
        hashCode = 31 * hashCode + Objects.hashCode(typeAsString());
        hashCode = 31 * hashCode + Objects.hashCode(tierAsString());
        hashCode = 31 * hashCode + Objects.hashCode(description());
        hashCode = 31 * hashCode + Objects.hashCode(selectParameters());
        hashCode = 31 * hashCode + Objects.hashCode(outputLocation());
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
        if (!(obj instanceof RestoreRequest)) {
            return false;
        }
        RestoreRequest other = (RestoreRequest) obj;
        return Objects.equals(days(), other.days()) && Objects.equals(glacierJobParameters(), other.glacierJobParameters())
                && Objects.equals(typeAsString(), other.typeAsString()) && Objects.equals(tierAsString(), other.tierAsString())
                && Objects.equals(description(), other.description())
                && Objects.equals(selectParameters(), other.selectParameters())
                && Objects.equals(outputLocation(), other.outputLocation());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("RestoreRequest").add("Days", days()).add("GlacierJobParameters", glacierJobParameters())
                .add("Type", typeAsString()).add("Tier", tierAsString()).add("Description", description())
                .add("SelectParameters", selectParameters()).add("OutputLocation", outputLocation()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Days":
            return Optional.ofNullable(clazz.cast(days()));
        case "GlacierJobParameters":
            return Optional.ofNullable(clazz.cast(glacierJobParameters()));
        case "Type":
            return Optional.ofNullable(clazz.cast(typeAsString()));
        case "Tier":
            return Optional.ofNullable(clazz.cast(tierAsString()));
        case "Description":
            return Optional.ofNullable(clazz.cast(description()));
        case "SelectParameters":
            return Optional.ofNullable(clazz.cast(selectParameters()));
        case "OutputLocation":
            return Optional.ofNullable(clazz.cast(outputLocation()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<RestoreRequest, T> g) {
        return obj -> g.apply((RestoreRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, RestoreRequest> {
        /**
         * <p>
         * Lifetime of the active copy in days. Do not use with restores that specify <code>OutputLocation</code>.
         * </p>
         * <p>
         * The Days element is required for regular restores, and must not be provided for select requests.
         * </p>
         * 
         * @param days
         *        Lifetime of the active copy in days. Do not use with restores that specify <code>OutputLocation</code>
         *        .</p>
         *        <p>
         *        The Days element is required for regular restores, and must not be provided for select requests.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder days(Integer days);

        /**
         * <p>
         * S3 Glacier related parameters pertaining to this job. Do not use with restores that specify
         * <code>OutputLocation</code>.
         * </p>
         * 
         * @param glacierJobParameters
         *        S3 Glacier related parameters pertaining to this job. Do not use with restores that specify
         *        <code>OutputLocation</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder glacierJobParameters(GlacierJobParameters glacierJobParameters);

        /**
         * <p>
         * S3 Glacier related parameters pertaining to this job. Do not use with restores that specify
         * <code>OutputLocation</code>.
         * </p>
         * This is a convenience method that creates an instance of the {@link GlacierJobParameters.Builder} avoiding
         * the need to create one manually via {@link GlacierJobParameters#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link GlacierJobParameters.Builder#build()} is called immediately and
         * its result is passed to {@link #glacierJobParameters(GlacierJobParameters)}.
         * 
         * @param glacierJobParameters
         *        a consumer that will call methods on {@link GlacierJobParameters.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #glacierJobParameters(GlacierJobParameters)
         */
        default Builder glacierJobParameters(Consumer<GlacierJobParameters.Builder> glacierJobParameters) {
            return glacierJobParameters(GlacierJobParameters.builder().applyMutation(glacierJobParameters).build());
        }

        /**
         * <p>
         * Type of restore request.
         * </p>
         * 
         * @param type
         *        Type of restore request.
         * @see RestoreRequestType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RestoreRequestType
         */
        Builder type(String type);

        /**
         * <p>
         * Type of restore request.
         * </p>
         * 
         * @param type
         *        Type of restore request.
         * @see RestoreRequestType
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see RestoreRequestType
         */
        Builder type(RestoreRequestType type);

        /**
         * <p>
         * Retrieval tier at which the restore will be processed.
         * </p>
         * 
         * @param tier
         *        Retrieval tier at which the restore will be processed.
         * @see Tier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Tier
         */
        Builder tier(String tier);

        /**
         * <p>
         * Retrieval tier at which the restore will be processed.
         * </p>
         * 
         * @param tier
         *        Retrieval tier at which the restore will be processed.
         * @see Tier
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see Tier
         */
        Builder tier(Tier tier);

        /**
         * <p>
         * The optional description for the job.
         * </p>
         * 
         * @param description
         *        The optional description for the job.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder description(String description);

        /**
         * <p>
         * Describes the parameters for Select job types.
         * </p>
         * 
         * @param selectParameters
         *        Describes the parameters for Select job types.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder selectParameters(SelectParameters selectParameters);

        /**
         * <p>
         * Describes the parameters for Select job types.
         * </p>
         * This is a convenience method that creates an instance of the {@link SelectParameters.Builder} avoiding the
         * need to create one manually via {@link SelectParameters#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link SelectParameters.Builder#build()} is called immediately and its
         * result is passed to {@link #selectParameters(SelectParameters)}.
         * 
         * @param selectParameters
         *        a consumer that will call methods on {@link SelectParameters.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #selectParameters(SelectParameters)
         */
        default Builder selectParameters(Consumer<SelectParameters.Builder> selectParameters) {
            return selectParameters(SelectParameters.builder().applyMutation(selectParameters).build());
        }

        /**
         * <p>
         * Describes the location where the restore job's output is stored.
         * </p>
         * 
         * @param outputLocation
         *        Describes the location where the restore job's output is stored.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder outputLocation(OutputLocation outputLocation);

        /**
         * <p>
         * Describes the location where the restore job's output is stored.
         * </p>
         * This is a convenience method that creates an instance of the {@link OutputLocation.Builder} avoiding the need
         * to create one manually via {@link OutputLocation#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link OutputLocation.Builder#build()} is called immediately and its
         * result is passed to {@link #outputLocation(OutputLocation)}.
         * 
         * @param outputLocation
         *        a consumer that will call methods on {@link OutputLocation.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #outputLocation(OutputLocation)
         */
        default Builder outputLocation(Consumer<OutputLocation.Builder> outputLocation) {
            return outputLocation(OutputLocation.builder().applyMutation(outputLocation).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private Integer days;

        private GlacierJobParameters glacierJobParameters;

        private String type;

        private String tier;

        private String description;

        private SelectParameters selectParameters;

        private OutputLocation outputLocation;

        private BuilderImpl() {
        }

        private BuilderImpl(RestoreRequest model) {
            days(model.days);
            glacierJobParameters(model.glacierJobParameters);
            type(model.type);
            tier(model.tier);
            description(model.description);
            selectParameters(model.selectParameters);
            outputLocation(model.outputLocation);
        }

        public final Integer getDays() {
            return days;
        }

        public final void setDays(Integer days) {
            this.days = days;
        }

        @Override
        public final Builder days(Integer days) {
            this.days = days;
            return this;
        }

        public final GlacierJobParameters.Builder getGlacierJobParameters() {
            return glacierJobParameters != null ? glacierJobParameters.toBuilder() : null;
        }

        public final void setGlacierJobParameters(GlacierJobParameters.BuilderImpl glacierJobParameters) {
            this.glacierJobParameters = glacierJobParameters != null ? glacierJobParameters.build() : null;
        }

        @Override
        public final Builder glacierJobParameters(GlacierJobParameters glacierJobParameters) {
            this.glacierJobParameters = glacierJobParameters;
            return this;
        }

        public final String getType() {
            return type;
        }

        public final void setType(String type) {
            this.type = type;
        }

        @Override
        public final Builder type(String type) {
            this.type = type;
            return this;
        }

        @Override
        public final Builder type(RestoreRequestType type) {
            this.type(type == null ? null : type.toString());
            return this;
        }

        public final String getTier() {
            return tier;
        }

        public final void setTier(String tier) {
            this.tier = tier;
        }

        @Override
        public final Builder tier(String tier) {
            this.tier = tier;
            return this;
        }

        @Override
        public final Builder tier(Tier tier) {
            this.tier(tier == null ? null : tier.toString());
            return this;
        }

        public final String getDescription() {
            return description;
        }

        public final void setDescription(String description) {
            this.description = description;
        }

        @Override
        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        public final SelectParameters.Builder getSelectParameters() {
            return selectParameters != null ? selectParameters.toBuilder() : null;
        }

        public final void setSelectParameters(SelectParameters.BuilderImpl selectParameters) {
            this.selectParameters = selectParameters != null ? selectParameters.build() : null;
        }

        @Override
        public final Builder selectParameters(SelectParameters selectParameters) {
            this.selectParameters = selectParameters;
            return this;
        }

        public final OutputLocation.Builder getOutputLocation() {
            return outputLocation != null ? outputLocation.toBuilder() : null;
        }

        public final void setOutputLocation(OutputLocation.BuilderImpl outputLocation) {
            this.outputLocation = outputLocation != null ? outputLocation.build() : null;
        }

        @Override
        public final Builder outputLocation(OutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        @Override
        public RestoreRequest build() {
            return new RestoreRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
