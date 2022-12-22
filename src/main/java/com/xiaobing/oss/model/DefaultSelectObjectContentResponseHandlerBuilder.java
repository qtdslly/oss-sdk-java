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

import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.awscore.eventstream.DefaultEventStreamResponseHandlerBuilder;
import software.amazon.awssdk.awscore.eventstream.EventStreamResponseHandlerFromBuilder;

@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
final class DefaultSelectObjectContentResponseHandlerBuilder
        extends
        DefaultEventStreamResponseHandlerBuilder<SelectObjectContentResponse, SelectObjectContentEventStream, SelectObjectContentResponseHandler.Builder>
        implements SelectObjectContentResponseHandler.Builder {
    @Override
    public SelectObjectContentResponseHandler.Builder subscriber(SelectObjectContentResponseHandler.Visitor visitor) {
        subscriber(e -> e.accept(visitor));
        return this;
    }

    @Override
    public SelectObjectContentResponseHandler build() {
        return new Impl(this);
    }

    @Generated("software.amazon.awssdk:codegen")
    private static final class Impl extends
            EventStreamResponseHandlerFromBuilder<SelectObjectContentResponse, SelectObjectContentEventStream> implements
            SelectObjectContentResponseHandler {
        private Impl(DefaultSelectObjectContentResponseHandlerBuilder builder) {
            super(builder);
        }
    }
}
