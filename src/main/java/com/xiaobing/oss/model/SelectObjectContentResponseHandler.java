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
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.awscore.eventstream.EventStreamResponseHandler;

/**
 * Response handler for the SelectObjectContent API.
 */
@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public interface SelectObjectContentResponseHandler extends
        EventStreamResponseHandler<SelectObjectContentResponse, SelectObjectContentEventStream> {
    /**
     * Create a {@link Builder}, used to create a {@link SelectObjectContentResponseHandler}.
     */
    static Builder builder() {
        return new DefaultSelectObjectContentResponseHandlerBuilder();
    }

    /**
     * Builder for {@link SelectObjectContentResponseHandler}. This can be used to create the
     * {@link SelectObjectContentResponseHandler} in a more functional way, you may also directly implement the
     * {@link SelectObjectContentResponseHandler} interface if preferred.
     */
    @Generated("software.amazon.awssdk:codegen")
    interface Builder extends
            EventStreamResponseHandler.Builder<SelectObjectContentResponse, SelectObjectContentEventStream, Builder> {
        /**
         * Sets the subscriber to the {@link org.reactivestreams.Publisher} of events. The given {@link Visitor} will be
         * called for each event received by the publisher. Events are requested sequentially after each event is
         * processed. If you need more control over the backpressure strategy consider using
         * {@link #subscriber(java.util.function.Supplier)} instead.
         *
         * @param visitor
         *        Visitor that will be invoked for each incoming event.
         * @return This builder for method chaining
         */
        Builder subscriber(Visitor visitor);

        /**
         * @return A {@link SelectObjectContentResponseHandler} implementation that can be used in the
         *         SelectObjectContent API call.
         */
        SelectObjectContentResponseHandler build();
    }

    /**
     * Visitor for subtypes of {@link SelectObjectContentEventStream}.
     */
    @Generated("software.amazon.awssdk:codegen")
    interface Visitor {
        /**
         * @return A new {@link Builder}.
         */
        static Builder builder() {
            return new DefaultSelectObjectContentVisitorBuilder();
        }

        /**
         * A required "else" or "default" block, invoked when no other more-specific "visit" method is appropriate. This
         * is invoked under two circumstances:
         * <ol>
         * <li>The event encountered is newer than the current version of the SDK, so no other more-specific "visit"
         * method could be called. In this case, the provided event will be a generic
         * {@link SelectObjectContentEventStream}. These events can be processed by upgrading the SDK.</li>
         * <li>The event is known by the SDK, but the "visit" was not overridden above. In this case, the provided event
         * will be a specific type of {@link SelectObjectContentEventStream}.</li>
         * </ol>
         *
         * @param event
         *        The event that was not handled by a more-specific "visit" method.
         */
        default void visitDefault(SelectObjectContentEventStream event) {
        }

        /**
         * Invoked when a {@link RecordsEvent} is encountered. If this is not overridden, the event will be given to
         * {@link #visitDefault(SelectObjectContentEventStream)}.
         *
         * @param event
         *        Event being visited
         */
        default void visitRecords(RecordsEvent event) {
            visitDefault(event);
        }

        /**
         * Invoked when a {@link StatsEvent} is encountered. If this is not overridden, the event will be given to
         * {@link #visitDefault(SelectObjectContentEventStream)}.
         *
         * @param event
         *        Event being visited
         */
        default void visitStats(StatsEvent event) {
            visitDefault(event);
        }

        /**
         * Invoked when a {@link ProgressEvent} is encountered. If this is not overridden, the event will be given to
         * {@link #visitDefault(SelectObjectContentEventStream)}.
         *
         * @param event
         *        Event being visited
         */
        default void visitProgress(ProgressEvent event) {
            visitDefault(event);
        }

        /**
         * Invoked when a {@link ContinuationEvent} is encountered. If this is not overridden, the event will be given
         * to {@link #visitDefault(SelectObjectContentEventStream)}.
         *
         * @param event
         *        Event being visited
         */
        default void visitCont(ContinuationEvent event) {
            visitDefault(event);
        }

        /**
         * Invoked when a {@link EndEvent} is encountered. If this is not overridden, the event will be given to
         * {@link #visitDefault(SelectObjectContentEventStream)}.
         *
         * @param event
         *        Event being visited
         */
        default void visitEnd(EndEvent event) {
            visitDefault(event);
        }

        /**
         * Builder for {@link Visitor}. The {@link Visitor} class may also be extended for a more traditional style but
         * this builder allows for a more functional way of creating a visitor will callback methods.
         */
        @Generated("software.amazon.awssdk:codegen")
        interface Builder {
            /**
             * Callback to invoke when either an unknown event is visited or an unhandled event is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onDefault(Consumer<SelectObjectContentEventStream> c);

            /**
             * @return Visitor implementation.
             */
            Visitor build();

            /**
             * Callback to invoke when a {@link RecordsEvent} is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onRecords(Consumer<RecordsEvent> c);

            /**
             * Callback to invoke when a {@link StatsEvent} is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onStats(Consumer<StatsEvent> c);

            /**
             * Callback to invoke when a {@link ProgressEvent} is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onProgress(Consumer<ProgressEvent> c);

            /**
             * Callback to invoke when a {@link ContinuationEvent} is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onCont(Consumer<ContinuationEvent> c);

            /**
             * Callback to invoke when a {@link EndEvent} is visited.
             *
             * @param c
             *        Callback to process the event.
             * @return This builder for method chaining.
             */
            Builder onEnd(Consumer<EndEvent> c);
        }
    }
}
