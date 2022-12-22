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

import java.util.function.Consumer;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;

@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
final class DefaultSelectObjectContentVisitorBuilder implements SelectObjectContentResponseHandler.Visitor.Builder {
    private Consumer<SelectObjectContentEventStream> onDefault;

    private Consumer<RecordsEvent> onRecords;

    private Consumer<StatsEvent> onStats;

    private Consumer<ProgressEvent> onProgress;

    private Consumer<ContinuationEvent> onCont;

    private Consumer<EndEvent> onEnd;

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onDefault(Consumer<SelectObjectContentEventStream> c) {
        this.onDefault = c;
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor build() {
        return new VisitorFromBuilder(this);
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onRecords(Consumer<RecordsEvent> c) {
        this.onRecords = c;
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onStats(Consumer<StatsEvent> c) {
        this.onStats = c;
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onProgress(Consumer<ProgressEvent> c) {
        this.onProgress = c;
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onCont(Consumer<ContinuationEvent> c) {
        this.onCont = c;
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler.Visitor.Builder onEnd(Consumer<EndEvent> c) {
        this.onEnd = c;
        return this;
    }

    @Generated("software.amazon.awssdk:codegen")
    static class VisitorFromBuilder implements SelectObjectContentResponseHandler.Visitor {
        private final Consumer<SelectObjectContentEventStream> onDefault;

        private final Consumer<RecordsEvent> onRecords;

        private final Consumer<StatsEvent> onStats;

        private final Consumer<ProgressEvent> onProgress;

        private final Consumer<ContinuationEvent> onCont;

        private final Consumer<EndEvent> onEnd;

        VisitorFromBuilder(DefaultSelectObjectContentVisitorBuilder builder) {
            this.onDefault = builder.onDefault != null ? builder.onDefault
                    : SelectObjectContentResponseHandler.Visitor.super::visitDefault;
            this.onRecords = builder.onRecords != null ? builder.onRecords
                    : SelectObjectContentResponseHandler.Visitor.super::visitRecords;
            this.onStats = builder.onStats != null ? builder.onStats
                    : SelectObjectContentResponseHandler.Visitor.super::visitStats;
            this.onProgress = builder.onProgress != null ? builder.onProgress
                    : SelectObjectContentResponseHandler.Visitor.super::visitProgress;
            this.onCont = builder.onCont != null ? builder.onCont : SelectObjectContentResponseHandler.Visitor.super::visitCont;
            this.onEnd = builder.onEnd != null ? builder.onEnd : SelectObjectContentResponseHandler.Visitor.super::visitEnd;
        }

        @Override
        public void visitDefault(SelectObjectContentEventStream event) {
            onDefault.accept(event);
        }

        @Override
        public void visitRecords(RecordsEvent event) {
            onRecords.accept(event);
        }

        @Override
        public void visitStats(StatsEvent event) {
            onStats.accept(event);
        }

        @Override
        public void visitProgress(ProgressEvent event) {
            onProgress.accept(event);
        }

        @Override
        public void visitCont(ContinuationEvent event) {
            onCont.accept(event);
        }

        @Override
        public void visitEnd(EndEvent event) {
            onEnd.accept(event);
        }
    }
}
