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

package com.xiaobing.oss.model.selectobjectcontenteventstream;

import com.xiaobing.oss.model.SelectObjectContentEventStream;
import com.xiaobing.oss.model.SelectObjectContentResponseHandler;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import com.xiaobing.oss.model.ProgressEvent;

/**
 * A specialization of {@code software.amazon.awssdk.services.s3.model.ProgressEvent} that represents the
 * {@code SelectObjectContentEventStream$Progress} event. Do not use this class directly. Instead, use the static
 * builder methods on {@link SelectObjectContentEventStream}.
 */
@SdkInternalApi
@Generated("software.amazon.awssdk:codegen")
public final class DefaultProgress extends ProgressEvent {
    private static final long serialVersionUID = 1L;

    DefaultProgress(BuilderImpl builderImpl) {
        super(builderImpl);
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    @Override
    public void accept(SelectObjectContentResponseHandler.Visitor visitor) {
        visitor.visitProgress(this);
    }

    @Override
    public EventType sdkEventType() {
        return EventType.PROGRESS;
    }

    public interface Builder extends ProgressEvent.Builder {
        @Override
        DefaultProgress build();
    }

    private static final class BuilderImpl extends ProgressEvent.BuilderImpl implements Builder {
        private BuilderImpl() {
        }

        private BuilderImpl(DefaultProgress event) {
            super(event);
        }

        @Override
        public DefaultProgress build() {
            return new DefaultProgress(this);
        }
    }
}
