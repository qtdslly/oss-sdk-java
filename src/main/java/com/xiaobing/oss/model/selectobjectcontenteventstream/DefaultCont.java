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
import com.xiaobing.oss.model.ContinuationEvent;

/**
 * A specialization of {@code software.amazon.awssdk.services.s3.model.ContinuationEvent} that represents the
 * {@code SelectObjectContentEventStream$Cont} event. Do not use this class directly. Instead, use the static builder
 * methods on {@link SelectObjectContentEventStream}.
 */
@SdkInternalApi
@Generated("software.amazon.awssdk:codegen")
public final class DefaultCont extends ContinuationEvent {
    private static final long serialVersionUID = 1L;

    DefaultCont(BuilderImpl builderImpl) {
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
        visitor.visitCont(this);
    }

    @Override
    public EventType sdkEventType() {
        return EventType.CONT;
    }

    public interface Builder extends ContinuationEvent.Builder {
        @Override
        DefaultCont build();
    }

    private static final class BuilderImpl extends ContinuationEvent.BuilderImpl implements Builder {
        private BuilderImpl() {
        }

        private BuilderImpl(DefaultCont event) {
            super(event);
        }

        @Override
        public DefaultCont build() {
            return new DefaultCont(this);
        }
    }
}
