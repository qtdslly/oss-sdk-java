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

package com.xiaobing.oss.paginators;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.xiaobing.oss.S3AsyncClient;
import org.reactivestreams.Subscriber;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.async.SdkPublisher;
import software.amazon.awssdk.core.pagination.async.AsyncPageFetcher;
import software.amazon.awssdk.core.pagination.async.PaginatedItemsPublisher;
import software.amazon.awssdk.core.pagination.async.ResponsesSubscription;
import com.xiaobing.oss.model.CommonPrefix;
import com.xiaobing.oss.model.ListMultipartUploadsRequest;
import com.xiaobing.oss.model.ListMultipartUploadsResponse;
import com.xiaobing.oss.model.MultipartUpload;

/**
 * <p>
 * Represents the output for the
 * {@link S3AsyncClient#listMultipartUploadsPaginator(ListMultipartUploadsRequest)}
 * operation which is a paginated operation. This class is a type of {@link org.reactivestreams.Publisher} which can be
 * used to provide a sequence of {@link ListMultipartUploadsResponse} response
 * pages as per demand from the subscriber.
 * </p>
 * <p>
 * When the operation is called, an instance of this class is returned. At this point, no service calls are made yet and
 * so there is no guarantee that the request is valid. If there are errors in your request, you will see the failures
 * only after you start streaming the data. The subscribe method should be called as a request to start streaming data.
 * For more info, see {@link org.reactivestreams.Publisher#subscribe(org.reactivestreams.Subscriber)}. Each call to the
 * subscribe method will result in a new {@link org.reactivestreams.Subscription} i.e., a new contract to stream data
 * from the starting request.
 * </p>
 *
 * <p>
 * The following are few ways to use the response class:
 * </p>
 * 1) Using the subscribe helper method
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsPublisher publisher = client.listMultipartUploadsPaginator(request);
 * CompletableFuture<Void> future = publisher.subscribe(res -> { // Do something with the response });
 * future.get();
 * }
 * </pre>
 *
 * 2) Using a custom subscriber
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsPublisher publisher = client.listMultipartUploadsPaginator(request);
 * publisher.subscribe(new Subscriber<software.amazon.awssdk.services.s3.model.ListMultipartUploadsResponse>() {
 * 
 * public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
 * 
 * 
 * public void onNext(software.amazon.awssdk.services.s3.model.ListMultipartUploadsResponse response) { //... };
 * });}
 * </pre>
 * 
 * As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
 * <p>
 * <b>Please notice that the configuration of MaxUploads won't limit the number of results you get with the paginator.
 * It only limits the number of results in each page.</b>
 * </p>
 * <p>
 * <b>Note: If you prefer to have control on service calls, use the
 * {@link #listMultipartUploads(ListMultipartUploadsRequest)} operation.</b>
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class ListMultipartUploadsPublisher implements SdkPublisher<ListMultipartUploadsResponse> {
    private final S3AsyncClient client;

    private final ListMultipartUploadsRequest firstRequest;

    private final AsyncPageFetcher nextPageFetcher;

    private boolean isLastPage;

    public ListMultipartUploadsPublisher(S3AsyncClient client, ListMultipartUploadsRequest firstRequest) {
        this(client, firstRequest, false);
    }

    private ListMultipartUploadsPublisher(S3AsyncClient client, ListMultipartUploadsRequest firstRequest, boolean isLastPage) {
        this.client = client;
        this.firstRequest = firstRequest;
        this.isLastPage = isLastPage;
        this.nextPageFetcher = new ListMultipartUploadsResponseFetcher();
    }

    @Override
    public void subscribe(Subscriber<? super ListMultipartUploadsResponse> subscriber) {
        subscriber.onSubscribe(ResponsesSubscription.builder().subscriber(subscriber).nextPageFetcher(nextPageFetcher).build());
    }

    /**
     * Returns a publisher that can be used to get a stream of data. You need to subscribe to the publisher to request
     * the stream of data. The publisher has a helper forEach method that takes in a {@link java.util.function.Consumer}
     * and then applies that consumer to each response returned by the service.
     */
    public final SdkPublisher<MultipartUpload> uploads() {
        Function<ListMultipartUploadsResponse, Iterator<MultipartUpload>> getIterator = response -> {
            if (response != null && response.uploads() != null) {
                return response.uploads().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsPublisher.builder().nextPageFetcher(new ListMultipartUploadsResponseFetcher())
                .iteratorFunction(getIterator).isLastPage(isLastPage).build();
    }

    /**
     * Returns a publisher that can be used to get a stream of data. You need to subscribe to the publisher to request
     * the stream of data. The publisher has a helper forEach method that takes in a {@link java.util.function.Consumer}
     * and then applies that consumer to each response returned by the service.
     */
    public final SdkPublisher<CommonPrefix> commonPrefixes() {
        Function<ListMultipartUploadsResponse, Iterator<CommonPrefix>> getIterator = response -> {
            if (response != null && response.commonPrefixes() != null) {
                return response.commonPrefixes().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsPublisher.builder().nextPageFetcher(new ListMultipartUploadsResponseFetcher())
                .iteratorFunction(getIterator).isLastPage(isLastPage).build();
    }

    private class ListMultipartUploadsResponseFetcher implements AsyncPageFetcher<ListMultipartUploadsResponse> {
        @Override
        public boolean hasNextPage(final ListMultipartUploadsResponse previousPage) {
            return previousPage.isTruncated().booleanValue();
        }

        @Override
        public CompletableFuture<ListMultipartUploadsResponse> nextPage(final ListMultipartUploadsResponse previousPage) {
            if (previousPage == null) {
                return client.listMultipartUploads(firstRequest);
            }
            return client.listMultipartUploads(firstRequest.toBuilder().keyMarker(previousPage.nextKeyMarker())
                    .uploadIdMarker(previousPage.nextUploadIdMarker()).build());
        }
    }
}
