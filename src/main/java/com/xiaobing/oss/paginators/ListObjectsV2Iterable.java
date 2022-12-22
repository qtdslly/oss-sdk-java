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
import java.util.function.Function;

import com.xiaobing.oss.S3Client;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.pagination.sync.PaginatedItemsIterable;
import software.amazon.awssdk.core.pagination.sync.PaginatedResponsesIterator;
import software.amazon.awssdk.core.pagination.sync.SdkIterable;
import software.amazon.awssdk.core.pagination.sync.SyncPageFetcher;
import software.amazon.awssdk.core.util.PaginatorUtils;
import com.xiaobing.oss.model.CommonPrefix;
import com.xiaobing.oss.model.ListObjectsV2Request;
import com.xiaobing.oss.model.ListObjectsV2Response;
import com.xiaobing.oss.model.S3Object;

/**
 * <p>
 * Represents the output for the
 * {@link S3Client#listObjectsV2Paginator(ListObjectsV2Request)}
 * operation which is a paginated operation. This class is an iterable of
 * {@link ListObjectsV2Response} that can be used to iterate through all the
 * response pages of the operation.
 * </p>
 * <p>
 * When the operation is called, an instance of this class is returned. At this point, no service calls are made yet and
 * so there is no guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily
 * loading response pages by making service calls until there are no pages left or your iteration stops. If there are
 * errors in your request, you will see the failures only after you start iterating through the iterable.
 * </p>
 *
 * <p>
 * The following are few ways to iterate through the response pages:
 * </p>
 * 1) Using a Stream
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable responses = client.listObjectsV2Paginator(request);
 * responses.stream().forEach(....);
 * }
 * </pre>
 *
 * 2) Using For loop
 * 
 * <pre>
 * {
 *     &#064;code
 *     software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable responses = client.listObjectsV2Paginator(request);
 *     for (software.amazon.awssdk.services.s3.model.ListObjectsV2Response response : responses) {
 *         // do something;
 *     }
 * }
 * </pre>
 *
 * 3) Use iterator directly
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable responses = client.listObjectsV2Paginator(request);
 * responses.iterator().forEachRemaining(....);
 * }
 * </pre>
 * <p>
 * <b>Please notice that the configuration of MaxKeys won't limit the number of results you get with the paginator. It
 * only limits the number of results in each page.</b>
 * </p>
 * <p>
 * <b>Note: If you prefer to have control on service calls, use the
 * {@link #listObjectsV2(ListObjectsV2Request)} operation.</b>
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class ListObjectsV2Iterable implements SdkIterable<ListObjectsV2Response> {
    private final S3Client client;

    private final ListObjectsV2Request firstRequest;

    private final SyncPageFetcher nextPageFetcher;

    public ListObjectsV2Iterable(S3Client client, ListObjectsV2Request firstRequest) {
        this.client = client;
        this.firstRequest = firstRequest;
        this.nextPageFetcher = new ListObjectsV2ResponseFetcher();
    }

    @Override
    public Iterator<ListObjectsV2Response> iterator() {
        return PaginatedResponsesIterator.builder().nextPageFetcher(nextPageFetcher).build();
    }

    /**
     * Returns an iterable to iterate through the paginated {@link ListObjectsV2Response#contents()} member. The
     * returned iterable is used to iterate through the results across all response pages and not a single page.
     *
     * This method is useful if you are interested in iterating over the paginated member in the response pages instead
     * of the top level pages. Similar to iteration over pages, this method internally makes service calls to get the
     * next list of results until the iteration stops or there are no more results.
     */
    public final SdkIterable<S3Object> contents() {
        Function<ListObjectsV2Response, Iterator<S3Object>> getIterator = response -> {
            if (response != null && response.contents() != null) {
                return response.contents().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsIterable.<ListObjectsV2Response, S3Object> builder().pagesIterable(this)
                .itemIteratorFunction(getIterator).build();
    }

    /**
     * Returns an iterable to iterate through the paginated {@link ListObjectsV2Response#commonPrefixes()} member. The
     * returned iterable is used to iterate through the results across all response pages and not a single page.
     *
     * This method is useful if you are interested in iterating over the paginated member in the response pages instead
     * of the top level pages. Similar to iteration over pages, this method internally makes service calls to get the
     * next list of results until the iteration stops or there are no more results.
     */
    public final SdkIterable<CommonPrefix> commonPrefixes() {
        Function<ListObjectsV2Response, Iterator<CommonPrefix>> getIterator = response -> {
            if (response != null && response.commonPrefixes() != null) {
                return response.commonPrefixes().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsIterable.<ListObjectsV2Response, CommonPrefix> builder().pagesIterable(this)
                .itemIteratorFunction(getIterator).build();
    }

    private class ListObjectsV2ResponseFetcher implements SyncPageFetcher<ListObjectsV2Response> {
        @Override
        public boolean hasNextPage(ListObjectsV2Response previousPage) {
            return PaginatorUtils.isOutputTokenAvailable(previousPage.nextContinuationToken());
        }

        @Override
        public ListObjectsV2Response nextPage(ListObjectsV2Response previousPage) {
            if (previousPage == null) {
                return client.listObjectsV2(firstRequest);
            }
            return client.listObjectsV2(firstRequest.toBuilder().continuationToken(previousPage.nextContinuationToken()).build());
        }
    }
}
