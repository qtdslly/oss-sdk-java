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
import java.util.Optional;
import java.util.function.Consumer;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * A message that indicates the request is complete and no more messages will be sent. You should not assume that the
 * request is complete until the client receives an <code>EndEvent</code>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class EndEvent implements SdkPojo, Serializable, ToCopyableBuilder<EndEvent.Builder, EndEvent>,
        SelectObjectContentEventStream {
    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList());

    private static final long serialVersionUID = 1L;

    protected EndEvent(BuilderImpl builder) {
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
        if (!(obj instanceof EndEvent)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("EndEvent").build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        return Optional.empty();
    }

    @Override
    public final EndEvent copy(Consumer<? super Builder> modifier) {
        return ToCopyableBuilder.super.copy(modifier);
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    /**
     * Calls the appropriate visit method depending on the subtype of {@link EndEvent}.
     *
     * @param visitor
     *        Visitor to invoke.
     */
    @Override
    public void accept(SelectObjectContentResponseHandler.Visitor visitor) {
        throw new UnsupportedOperationException();
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, EndEvent> {
    }

    protected static class BuilderImpl implements Builder {
        protected BuilderImpl() {
        }

        protected BuilderImpl(EndEvent model) {
        }

        @Override
        public EndEvent build() {
            return new EndEvent(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
