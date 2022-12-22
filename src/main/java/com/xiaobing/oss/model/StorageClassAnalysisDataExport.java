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
 * Container for data related to the storage class analysis for an Amazon S3 bucket for export.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class StorageClassAnalysisDataExport implements SdkPojo, Serializable,
        ToCopyableBuilder<StorageClassAnalysisDataExport.Builder, StorageClassAnalysisDataExport> {
    private static final SdkField<String> OUTPUT_SCHEMA_VERSION_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("OutputSchemaVersion")
            .getter(getter(StorageClassAnalysisDataExport::outputSchemaVersionAsString))
            .setter(setter(Builder::outputSchemaVersion))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("OutputSchemaVersion")
                    .unmarshallLocationName("OutputSchemaVersion").build()).build();

    private static final SdkField<AnalyticsExportDestination> DESTINATION_FIELD = SdkField
            .<AnalyticsExportDestination> builder(MarshallingType.SDK_POJO)
            .memberName("Destination")
            .getter(getter(StorageClassAnalysisDataExport::destination))
            .setter(setter(Builder::destination))
            .constructor(AnalyticsExportDestination::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Destination")
                    .unmarshallLocationName("Destination").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(OUTPUT_SCHEMA_VERSION_FIELD,
            DESTINATION_FIELD));

    private static final long serialVersionUID = 1L;

    private final String outputSchemaVersion;

    private final AnalyticsExportDestination destination;

    private StorageClassAnalysisDataExport(BuilderImpl builder) {
        this.outputSchemaVersion = builder.outputSchemaVersion;
        this.destination = builder.destination;
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be <code>V_1</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #outputSchemaVersion} will return {@link StorageClassAnalysisSchemaVersion#UNKNOWN_TO_SDK_VERSION}. The
     * raw value returned by the service is available from {@link #outputSchemaVersionAsString}.
     * </p>
     * 
     * @return The version of the output schema to use when exporting data. Must be <code>V_1</code>.
     * @see StorageClassAnalysisSchemaVersion
     */
    public final StorageClassAnalysisSchemaVersion outputSchemaVersion() {
        return StorageClassAnalysisSchemaVersion.fromValue(outputSchemaVersion);
    }

    /**
     * <p>
     * The version of the output schema to use when exporting data. Must be <code>V_1</code>.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version,
     * {@link #outputSchemaVersion} will return {@link StorageClassAnalysisSchemaVersion#UNKNOWN_TO_SDK_VERSION}. The
     * raw value returned by the service is available from {@link #outputSchemaVersionAsString}.
     * </p>
     * 
     * @return The version of the output schema to use when exporting data. Must be <code>V_1</code>.
     * @see StorageClassAnalysisSchemaVersion
     */
    public final String outputSchemaVersionAsString() {
        return outputSchemaVersion;
    }

    /**
     * <p>
     * The place to store the data for an analysis.
     * </p>
     * 
     * @return The place to store the data for an analysis.
     */
    public final AnalyticsExportDestination destination() {
        return destination;
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
        hashCode = 31 * hashCode + Objects.hashCode(outputSchemaVersionAsString());
        hashCode = 31 * hashCode + Objects.hashCode(destination());
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
        if (!(obj instanceof StorageClassAnalysisDataExport)) {
            return false;
        }
        StorageClassAnalysisDataExport other = (StorageClassAnalysisDataExport) obj;
        return Objects.equals(outputSchemaVersionAsString(), other.outputSchemaVersionAsString())
                && Objects.equals(destination(), other.destination());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("StorageClassAnalysisDataExport").add("OutputSchemaVersion", outputSchemaVersionAsString())
                .add("Destination", destination()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "OutputSchemaVersion":
            return Optional.ofNullable(clazz.cast(outputSchemaVersionAsString()));
        case "Destination":
            return Optional.ofNullable(clazz.cast(destination()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<StorageClassAnalysisDataExport, T> g) {
        return obj -> g.apply((StorageClassAnalysisDataExport) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, StorageClassAnalysisDataExport> {
        /**
         * <p>
         * The version of the output schema to use when exporting data. Must be <code>V_1</code>.
         * </p>
         * 
         * @param outputSchemaVersion
         *        The version of the output schema to use when exporting data. Must be <code>V_1</code>.
         * @see StorageClassAnalysisSchemaVersion
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClassAnalysisSchemaVersion
         */
        Builder outputSchemaVersion(String outputSchemaVersion);

        /**
         * <p>
         * The version of the output schema to use when exporting data. Must be <code>V_1</code>.
         * </p>
         * 
         * @param outputSchemaVersion
         *        The version of the output schema to use when exporting data. Must be <code>V_1</code>.
         * @see StorageClassAnalysisSchemaVersion
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see StorageClassAnalysisSchemaVersion
         */
        Builder outputSchemaVersion(StorageClassAnalysisSchemaVersion outputSchemaVersion);

        /**
         * <p>
         * The place to store the data for an analysis.
         * </p>
         * 
         * @param destination
         *        The place to store the data for an analysis.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder destination(AnalyticsExportDestination destination);

        /**
         * <p>
         * The place to store the data for an analysis.
         * </p>
         * This is a convenience method that creates an instance of the {@link AnalyticsExportDestination.Builder}
         * avoiding the need to create one manually via {@link AnalyticsExportDestination#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link AnalyticsExportDestination.Builder#build()} is called immediately
         * and its result is passed to {@link #destination(AnalyticsExportDestination)}.
         * 
         * @param destination
         *        a consumer that will call methods on {@link AnalyticsExportDestination.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #destination(AnalyticsExportDestination)
         */
        default Builder destination(Consumer<AnalyticsExportDestination.Builder> destination) {
            return destination(AnalyticsExportDestination.builder().applyMutation(destination).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private String outputSchemaVersion;

        private AnalyticsExportDestination destination;

        private BuilderImpl() {
        }

        private BuilderImpl(StorageClassAnalysisDataExport model) {
            outputSchemaVersion(model.outputSchemaVersion);
            destination(model.destination);
        }

        public final String getOutputSchemaVersion() {
            return outputSchemaVersion;
        }

        public final void setOutputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
        }

        @Override
        public final Builder outputSchemaVersion(String outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
            return this;
        }

        @Override
        public final Builder outputSchemaVersion(StorageClassAnalysisSchemaVersion outputSchemaVersion) {
            this.outputSchemaVersion(outputSchemaVersion == null ? null : outputSchemaVersion.toString());
            return this;
        }

        public final AnalyticsExportDestination.Builder getDestination() {
            return destination != null ? destination.toBuilder() : null;
        }

        public final void setDestination(AnalyticsExportDestination.BuilderImpl destination) {
            this.destination = destination != null ? destination.build() : null;
        }

        @Override
        public final Builder destination(AnalyticsExportDestination destination) {
            this.destination = destination;
            return this;
        }

        @Override
        public StorageClassAnalysisDataExport build() {
            return new StorageClassAnalysisDataExport(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
