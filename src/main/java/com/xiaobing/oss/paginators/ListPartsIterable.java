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
import com.xiaobing.oss.model.ListPartsRequest;
import com.xiaobing.oss.model.ListPartsResponse;
import com.xiaobing.oss.model.Part;

/**
 * <p>
 * Represents the output for the
 * {@link S3Client#listPartsPaginator(ListPartsRequest)}
 * operation which is a paginated operation. This class is an iterable of
 * {@link ListPartsResponse} that can be used to iterate through all the
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
 * software.amazon.awssdk.services.s3.paginators.ListPartsIterable responses = client.listPartsPaginator(request);
 * responses.stream().forEach(....);
 * }
 * </pre>
 *
 * 2) Using For loop
 * 
 * <pre>
 * {
 *     &#064;code
 *     software.amazon.awssdk.services.s3.paginators.ListPartsIterable responses = client.listPartsPaginator(request);
 *     for (software.amazon.awssdk.services.s3.model.ListPartsResponse response : responses) {
 *         // do something;
 *     }
 * }
 * </pre>
 *
 * 3) Use iterator directly
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.s3.paginators.ListPartsIterable responses = client.listPartsPaginator(request);
 * responses.iterator().forEachRemaining(....);
 * }
 * </pre>
 * <p>
 * <b>Please notice that the configuration of MaxParts won't limit the number of results you get with the paginator. It
 * only limits the number of results in each page.</b>
 * </p>
 * <p>
 * <b>Note: If you prefer to have control on service calls, use the
 * {@link #listParts(ListPartsRequest)} operation.</b>
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class ListPartsIterable implements SdkIterable<ListPartsResponse> {
    private final S3Client client;

    private final ListPartsRequest firstRequest;

    private final SyncPageFetcher nextPageFetcher;

    public ListPartsIterable(S3Client client, ListPartsRequest firstRequest) {
        this.client = client;
        this.firstRequest = firstRequest;
        this.nextPageFetcher = new ListPartsResponseFetcher();
    }

    @Override
    public Iterator<ListPartsResponse> iterator() {
        return PaginatedResponsesIterator.builder().nextPageFetcher(nextPageFetcher).build();
    }

    /**
     * Returns an iterable to iterate through the paginated {@link ListPartsResponse#parts()} member. The returned
     * iterable is used to iterate through the results across all response pages and not a single page.
     *
     * This method is useful if you are interested in iterating over the paginated member in the response pages instead
     * of the top level pages. Similar to iteration over pages, this method internally makes service calls to get the
     * next list of results until the iteration stops or there are no more results.
     */
    public final SdkIterable<Part> parts() {
        Function<ListPartsResponse, Iterator<Part>> getIterator = response -> {
            if (response != null && response.parts() != null) {
                return response.parts().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsIterable.<ListPartsResponse, Part> builder().pagesIterable(this).itemIteratorFunction(getIterator)
                .build();
    }

    private class ListPartsResponseFetcher implements SyncPageFetcher<ListPartsResponse> {
        @Override
        public boolean hasNextPage(ListPartsResponse previousPage) {
            return previousPage.isTruncated().booleanValue();
        }

        @Override
        public ListPartsResponse nextPage(ListPartsResponse previousPage) {
            if (previousPage == null) {
                return client.listParts(firstRequest);
            }
            return client.listParts(firstRequest.toBuilder().partNumberMarker(previousPage.nextPartNumberMarker()).build());
        }
    }
}
