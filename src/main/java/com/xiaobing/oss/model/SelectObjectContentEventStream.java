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

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import com.xiaobing.oss.model.selectobjectcontenteventstream.DefaultCont;
import com.xiaobing.oss.model.selectobjectcontenteventstream.DefaultEnd;
import com.xiaobing.oss.model.selectobjectcontenteventstream.DefaultProgress;
import com.xiaobing.oss.model.selectobjectcontenteventstream.DefaultRecords;
import com.xiaobing.oss.model.selectobjectcontenteventstream.DefaultStats;
import software.amazon.awssdk.utils.internal.EnumUtils;

/**
 * Base interface for all event types in SelectObjectContentEventStream.
 */
@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public interface SelectObjectContentEventStream extends SdkPojo {
    /**
     * Special type of {@link SelectObjectContentEventStream} for unknown types of events that this version of the SDK
     * does not know about
     */
    SelectObjectContentEventStream UNKNOWN = new SelectObjectContentEventStream() {
        @Override
        public List<SdkField<?>> sdkFields() {
            return Collections.emptyList();
        }

        @Override
        public void accept(SelectObjectContentResponseHandler.Visitor visitor) {
            visitor.visitDefault(this);
        }
    };

    /**
     * Create a builder for the {@code Records} event type for this stream.
     */
    static RecordsEvent.Builder recordsBuilder() {
        return DefaultRecords.builder();
    }

    /**
     * Create a builder for the {@code Stats} event type for this stream.
     */
    static StatsEvent.Builder statsBuilder() {
        return DefaultStats.builder();
    }

    /**
     * Create a builder for the {@code Progress} event type for this stream.
     */
    static ProgressEvent.Builder progressBuilder() {
        return DefaultProgress.builder();
    }

    /**
     * Create a builder for the {@code Cont} event type for this stream.
     */
    static ContinuationEvent.Builder contBuilder() {
        return DefaultCont.builder();
    }

    /**
     * Create a builder for the {@code End} event type for this stream.
     */
    static EndEvent.Builder endBuilder() {
        return DefaultEnd.builder();
    }

    /**
     * The type of this event. Corresponds to the {@code :event-type} header on the Message.
     */
    default EventType sdkEventType() {
        return EventType.UNKNOWN_TO_SDK_VERSION;
    }

    /**
     * Calls the appropriate visit method depending on the subtype of {@link SelectObjectContentEventStream}.
     *
     * @param visitor
     *        Visitor to invoke.
     */
    void accept(SelectObjectContentResponseHandler.Visitor visitor);

    /**
     * The known possible types of events for {@code SelectObjectContentEventStream}.
     */
    @Generated("software.amazon.awssdk:codegen")
    enum EventType {
        RECORDS("Records"),

        STATS("Stats"),

        PROGRESS("Progress"),

        CONT("Cont"),

        END("End"),

        UNKNOWN_TO_SDK_VERSION(null);

        private static final Map<String, EventType> VALUE_MAP = EnumUtils.uniqueIndex(EventType.class, EventType::toString);

        private final String value;

        private EventType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        /**
         * Use this in place of valueOf to convert the raw string returned by the service into the enum value.
         *
         * @param value
         *        real value
         * @return EventType corresponding to the value
         */
        public static EventType fromValue(String value) {
            if (value == null) {
                return null;
            }
            return VALUE_MAP.getOrDefault(value, UNKNOWN_TO_SDK_VERSION);
        }

        /**
         * Use this in place of {@link #values()} to return a {@link Set} of all values known to the SDK. This will
         * return all known enum values except {@link #UNKNOWN_TO_SDK_VERSION}.
         *
         * @return a {@link Set} of known {@link EventType}s
         */
        public static Set<EventType> knownValues() {
            Set<EventType> knownValues = EnumSet.allOf(EventType.class);
            knownValues.remove(UNKNOWN_TO_SDK_VERSION);
            return knownValues;
        }
    }
}
