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
 * Specifies data related to access patterns to be collected and made available to analyze the tradeoffs between
 * different storage classes for an Amazon S3 bucket.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class StorageClassAnalysis implements SdkPojo, Serializable,
        ToCopyableBuilder<StorageClassAnalysis.Builder, StorageClassAnalysis> {
    private static final SdkField<StorageClassAnalysisDataExport> DATA_EXPORT_FIELD = SdkField
            .<StorageClassAnalysisDataExport> builder(MarshallingType.SDK_POJO)
            .memberName("DataExport")
            .getter(getter(StorageClassAnalysis::dataExport))
            .setter(setter(Builder::dataExport))
            .constructor(StorageClassAnalysisDataExport::builder)
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("DataExport")
                    .unmarshallLocationName("DataExport").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(DATA_EXPORT_FIELD));

    private static final long serialVersionUID = 1L;

    private final StorageClassAnalysisDataExport dataExport;

    private StorageClassAnalysis(BuilderImpl builder) {
        this.dataExport = builder.dataExport;
    }

    /**
     * <p>
     * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
     * </p>
     * 
     * @return Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
     */
    public final StorageClassAnalysisDataExport dataExport() {
        return dataExport;
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
        hashCode = 31 * hashCode + Objects.hashCode(dataExport());
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
        if (!(obj instanceof StorageClassAnalysis)) {
            return false;
        }
        StorageClassAnalysis other = (StorageClassAnalysis) obj;
        return Objects.equals(dataExport(), other.dataExport());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("StorageClassAnalysis").add("DataExport", dataExport()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "DataExport":
            return Optional.ofNullable(clazz.cast(dataExport()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<StorageClassAnalysis, T> g) {
        return obj -> g.apply((StorageClassAnalysis) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, StorageClassAnalysis> {
        /**
         * <p>
         * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
         * </p>
         * 
         * @param dataExport
         *        Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder dataExport(StorageClassAnalysisDataExport dataExport);

        /**
         * <p>
         * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
         * </p>
         * This is a convenience method that creates an instance of the {@link StorageClassAnalysisDataExport.Builder}
         * avoiding the need to create one manually via {@link StorageClassAnalysisDataExport#builder()}.
         *
         * <p>
         * When the {@link Consumer} completes, {@link StorageClassAnalysisDataExport.Builder#build()} is called
         * immediately and its result is passed to {@link #dataExport(StorageClassAnalysisDataExport)}.
         * 
         * @param dataExport
         *        a consumer that will call methods on {@link StorageClassAnalysisDataExport.Builder}
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see #dataExport(StorageClassAnalysisDataExport)
         */
        default Builder dataExport(Consumer<StorageClassAnalysisDataExport.Builder> dataExport) {
            return dataExport(StorageClassAnalysisDataExport.builder().applyMutation(dataExport).build());
        }
    }

    static final class BuilderImpl implements Builder {
        private StorageClassAnalysisDataExport dataExport;

        private BuilderImpl() {
        }

        private BuilderImpl(StorageClassAnalysis model) {
            dataExport(model.dataExport);
        }

        public final StorageClassAnalysisDataExport.Builder getDataExport() {
            return dataExport != null ? dataExport.toBuilder() : null;
        }

        public final void setDataExport(StorageClassAnalysisDataExport.BuilderImpl dataExport) {
            this.dataExport = dataExport != null ? dataExport.build() : null;
        }

        @Override
        public final Builder dataExport(StorageClassAnalysisDataExport dataExport) {
            this.dataExport = dataExport;
            return this;
        }

        @Override
        public StorageClassAnalysis build() {
            return new StorageClassAnalysis(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
