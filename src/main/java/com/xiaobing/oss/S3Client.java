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

package com.xiaobing.oss;

import java.nio.file.Path;
import java.util.function.Consumer;

import com.xiaobing.oss.paginators.ListMultipartUploadsIterable;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.annotations.ThreadSafe;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.core.SdkClient;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.core.sync.ResponseTransformer;
import software.amazon.awssdk.regions.ServiceMetadata;
import com.xiaobing.oss.model.AbortMultipartUploadRequest;
import com.xiaobing.oss.model.AbortMultipartUploadResponse;
import com.xiaobing.oss.model.BucketAlreadyExistsException;
import com.xiaobing.oss.model.BucketAlreadyOwnedByYouException;
import com.xiaobing.oss.model.CompleteMultipartUploadRequest;
import com.xiaobing.oss.model.CompleteMultipartUploadResponse;
import com.xiaobing.oss.model.CopyObjectRequest;
import com.xiaobing.oss.model.CopyObjectResponse;
import com.xiaobing.oss.model.CreateBucketRequest;
import com.xiaobing.oss.model.CreateBucketResponse;
import com.xiaobing.oss.model.CreateMultipartUploadRequest;
import com.xiaobing.oss.model.CreateMultipartUploadResponse;
import com.xiaobing.oss.model.DeleteBucketAnalyticsConfigurationRequest;
import com.xiaobing.oss.model.DeleteBucketAnalyticsConfigurationResponse;
import com.xiaobing.oss.model.DeleteBucketCorsRequest;
import com.xiaobing.oss.model.DeleteBucketCorsResponse;
import com.xiaobing.oss.model.DeleteBucketEncryptionRequest;
import com.xiaobing.oss.model.DeleteBucketEncryptionResponse;
import com.xiaobing.oss.model.DeleteBucketIntelligentTieringConfigurationRequest;
import com.xiaobing.oss.model.DeleteBucketIntelligentTieringConfigurationResponse;
import com.xiaobing.oss.model.DeleteBucketInventoryConfigurationRequest;
import com.xiaobing.oss.model.DeleteBucketInventoryConfigurationResponse;
import com.xiaobing.oss.model.DeleteBucketLifecycleRequest;
import com.xiaobing.oss.model.DeleteBucketLifecycleResponse;
import com.xiaobing.oss.model.DeleteBucketMetricsConfigurationRequest;
import com.xiaobing.oss.model.DeleteBucketMetricsConfigurationResponse;
import com.xiaobing.oss.model.DeleteBucketOwnershipControlsRequest;
import com.xiaobing.oss.model.DeleteBucketOwnershipControlsResponse;
import com.xiaobing.oss.model.DeleteBucketPolicyRequest;
import com.xiaobing.oss.model.DeleteBucketPolicyResponse;
import com.xiaobing.oss.model.DeleteBucketReplicationRequest;
import com.xiaobing.oss.model.DeleteBucketReplicationResponse;
import com.xiaobing.oss.model.DeleteBucketRequest;
import com.xiaobing.oss.model.DeleteBucketResponse;
import com.xiaobing.oss.model.DeleteBucketTaggingRequest;
import com.xiaobing.oss.model.DeleteBucketTaggingResponse;
import com.xiaobing.oss.model.DeleteBucketWebsiteRequest;
import com.xiaobing.oss.model.DeleteBucketWebsiteResponse;
import com.xiaobing.oss.model.DeleteObjectRequest;
import com.xiaobing.oss.model.DeleteObjectResponse;
import com.xiaobing.oss.model.DeleteObjectTaggingRequest;
import com.xiaobing.oss.model.DeleteObjectTaggingResponse;
import com.xiaobing.oss.model.DeleteObjectsRequest;
import com.xiaobing.oss.model.DeleteObjectsResponse;
import com.xiaobing.oss.model.DeletePublicAccessBlockRequest;
import com.xiaobing.oss.model.DeletePublicAccessBlockResponse;
import com.xiaobing.oss.model.GetBucketAccelerateConfigurationRequest;
import com.xiaobing.oss.model.GetBucketAccelerateConfigurationResponse;
import com.xiaobing.oss.model.GetBucketAclRequest;
import com.xiaobing.oss.model.GetBucketAclResponse;
import com.xiaobing.oss.model.GetBucketAnalyticsConfigurationRequest;
import com.xiaobing.oss.model.GetBucketAnalyticsConfigurationResponse;
import com.xiaobing.oss.model.GetBucketCorsRequest;
import com.xiaobing.oss.model.GetBucketCorsResponse;
import com.xiaobing.oss.model.GetBucketEncryptionRequest;
import com.xiaobing.oss.model.GetBucketEncryptionResponse;
import com.xiaobing.oss.model.GetBucketIntelligentTieringConfigurationRequest;
import com.xiaobing.oss.model.GetBucketIntelligentTieringConfigurationResponse;
import com.xiaobing.oss.model.GetBucketInventoryConfigurationRequest;
import com.xiaobing.oss.model.GetBucketInventoryConfigurationResponse;
import com.xiaobing.oss.model.GetBucketLifecycleConfigurationRequest;
import com.xiaobing.oss.model.GetBucketLifecycleConfigurationResponse;
import com.xiaobing.oss.model.GetBucketLocationRequest;
import com.xiaobing.oss.model.GetBucketLocationResponse;
import com.xiaobing.oss.model.GetBucketLoggingRequest;
import com.xiaobing.oss.model.GetBucketLoggingResponse;
import com.xiaobing.oss.model.GetBucketMetricsConfigurationRequest;
import com.xiaobing.oss.model.GetBucketMetricsConfigurationResponse;
import com.xiaobing.oss.model.GetBucketNotificationConfigurationRequest;
import com.xiaobing.oss.model.GetBucketNotificationConfigurationResponse;
import com.xiaobing.oss.model.GetBucketOwnershipControlsRequest;
import com.xiaobing.oss.model.GetBucketOwnershipControlsResponse;
import com.xiaobing.oss.model.GetBucketPolicyRequest;
import com.xiaobing.oss.model.GetBucketPolicyResponse;
import com.xiaobing.oss.model.GetBucketPolicyStatusRequest;
import com.xiaobing.oss.model.GetBucketPolicyStatusResponse;
import com.xiaobing.oss.model.GetBucketReplicationRequest;
import com.xiaobing.oss.model.GetBucketReplicationResponse;
import com.xiaobing.oss.model.GetBucketRequestPaymentRequest;
import com.xiaobing.oss.model.GetBucketRequestPaymentResponse;
import com.xiaobing.oss.model.GetBucketTaggingRequest;
import com.xiaobing.oss.model.GetBucketTaggingResponse;
import com.xiaobing.oss.model.GetBucketVersioningRequest;
import com.xiaobing.oss.model.GetBucketVersioningResponse;
import com.xiaobing.oss.model.GetBucketWebsiteRequest;
import com.xiaobing.oss.model.GetBucketWebsiteResponse;
import com.xiaobing.oss.model.GetObjectAclRequest;
import com.xiaobing.oss.model.GetObjectAclResponse;
import com.xiaobing.oss.model.GetObjectAttributesRequest;
import com.xiaobing.oss.model.GetObjectAttributesResponse;
import com.xiaobing.oss.model.GetObjectLegalHoldRequest;
import com.xiaobing.oss.model.GetObjectLegalHoldResponse;
import com.xiaobing.oss.model.GetObjectLockConfigurationRequest;
import com.xiaobing.oss.model.GetObjectLockConfigurationResponse;
import com.xiaobing.oss.model.GetObjectRequest;
import com.xiaobing.oss.model.GetObjectResponse;
import com.xiaobing.oss.model.GetObjectRetentionRequest;
import com.xiaobing.oss.model.GetObjectRetentionResponse;
import com.xiaobing.oss.model.GetObjectTaggingRequest;
import com.xiaobing.oss.model.GetObjectTaggingResponse;
import com.xiaobing.oss.model.GetObjectTorrentRequest;
import com.xiaobing.oss.model.GetObjectTorrentResponse;
import com.xiaobing.oss.model.GetPublicAccessBlockRequest;
import com.xiaobing.oss.model.GetPublicAccessBlockResponse;
import com.xiaobing.oss.model.HeadBucketRequest;
import com.xiaobing.oss.model.HeadBucketResponse;
import com.xiaobing.oss.model.HeadObjectRequest;
import com.xiaobing.oss.model.HeadObjectResponse;
import com.xiaobing.oss.model.InvalidObjectStateException;
import com.xiaobing.oss.model.ListBucketAnalyticsConfigurationsRequest;
import com.xiaobing.oss.model.ListBucketAnalyticsConfigurationsResponse;
import com.xiaobing.oss.model.ListBucketIntelligentTieringConfigurationsRequest;
import com.xiaobing.oss.model.ListBucketIntelligentTieringConfigurationsResponse;
import com.xiaobing.oss.model.ListBucketInventoryConfigurationsRequest;
import com.xiaobing.oss.model.ListBucketInventoryConfigurationsResponse;
import com.xiaobing.oss.model.ListBucketMetricsConfigurationsRequest;
import com.xiaobing.oss.model.ListBucketMetricsConfigurationsResponse;
import com.xiaobing.oss.model.ListBucketsRequest;
import com.xiaobing.oss.model.ListBucketsResponse;
import com.xiaobing.oss.model.ListMultipartUploadsRequest;
import com.xiaobing.oss.model.ListMultipartUploadsResponse;
import com.xiaobing.oss.model.ListObjectVersionsRequest;
import com.xiaobing.oss.model.ListObjectVersionsResponse;
import com.xiaobing.oss.model.ListObjectsRequest;
import com.xiaobing.oss.model.ListObjectsResponse;
import com.xiaobing.oss.model.ListObjectsV2Request;
import com.xiaobing.oss.model.ListObjectsV2Response;
import com.xiaobing.oss.model.ListPartsRequest;
import com.xiaobing.oss.model.ListPartsResponse;
import com.xiaobing.oss.model.NoSuchBucketException;
import com.xiaobing.oss.model.NoSuchKeyException;
import com.xiaobing.oss.model.NoSuchUploadException;
import com.xiaobing.oss.model.ObjectAlreadyInActiveTierErrorException;
import com.xiaobing.oss.model.ObjectNotInActiveTierErrorException;
import com.xiaobing.oss.model.PutBucketAccelerateConfigurationRequest;
import com.xiaobing.oss.model.PutBucketAccelerateConfigurationResponse;
import com.xiaobing.oss.model.PutBucketAclRequest;
import com.xiaobing.oss.model.PutBucketAclResponse;
import com.xiaobing.oss.model.PutBucketAnalyticsConfigurationRequest;
import com.xiaobing.oss.model.PutBucketAnalyticsConfigurationResponse;
import com.xiaobing.oss.model.PutBucketCorsRequest;
import com.xiaobing.oss.model.PutBucketCorsResponse;
import com.xiaobing.oss.model.PutBucketEncryptionRequest;
import com.xiaobing.oss.model.PutBucketEncryptionResponse;
import com.xiaobing.oss.model.PutBucketIntelligentTieringConfigurationRequest;
import com.xiaobing.oss.model.PutBucketIntelligentTieringConfigurationResponse;
import com.xiaobing.oss.model.PutBucketInventoryConfigurationRequest;
import com.xiaobing.oss.model.PutBucketInventoryConfigurationResponse;
import com.xiaobing.oss.model.PutBucketLifecycleConfigurationRequest;
import com.xiaobing.oss.model.PutBucketLifecycleConfigurationResponse;
import com.xiaobing.oss.model.PutBucketLoggingRequest;
import com.xiaobing.oss.model.PutBucketLoggingResponse;
import com.xiaobing.oss.model.PutBucketMetricsConfigurationRequest;
import com.xiaobing.oss.model.PutBucketMetricsConfigurationResponse;
import com.xiaobing.oss.model.PutBucketNotificationConfigurationRequest;
import com.xiaobing.oss.model.PutBucketNotificationConfigurationResponse;
import com.xiaobing.oss.model.PutBucketOwnershipControlsRequest;
import com.xiaobing.oss.model.PutBucketOwnershipControlsResponse;
import com.xiaobing.oss.model.PutBucketPolicyRequest;
import com.xiaobing.oss.model.PutBucketPolicyResponse;
import com.xiaobing.oss.model.PutBucketReplicationRequest;
import com.xiaobing.oss.model.PutBucketReplicationResponse;
import com.xiaobing.oss.model.PutBucketRequestPaymentRequest;
import com.xiaobing.oss.model.PutBucketRequestPaymentResponse;
import com.xiaobing.oss.model.PutBucketTaggingRequest;
import com.xiaobing.oss.model.PutBucketTaggingResponse;
import com.xiaobing.oss.model.PutBucketVersioningRequest;
import com.xiaobing.oss.model.PutBucketVersioningResponse;
import com.xiaobing.oss.model.PutBucketWebsiteRequest;
import com.xiaobing.oss.model.PutBucketWebsiteResponse;
import com.xiaobing.oss.model.PutObjectAclRequest;
import com.xiaobing.oss.model.PutObjectAclResponse;
import com.xiaobing.oss.model.PutObjectLegalHoldRequest;
import com.xiaobing.oss.model.PutObjectLegalHoldResponse;
import com.xiaobing.oss.model.PutObjectLockConfigurationRequest;
import com.xiaobing.oss.model.PutObjectLockConfigurationResponse;
import com.xiaobing.oss.model.PutObjectRequest;
import com.xiaobing.oss.model.PutObjectResponse;
import com.xiaobing.oss.model.PutObjectRetentionRequest;
import com.xiaobing.oss.model.PutObjectRetentionResponse;
import com.xiaobing.oss.model.PutObjectTaggingRequest;
import com.xiaobing.oss.model.PutObjectTaggingResponse;
import com.xiaobing.oss.model.PutPublicAccessBlockRequest;
import com.xiaobing.oss.model.PutPublicAccessBlockResponse;
import com.xiaobing.oss.model.RestoreObjectRequest;
import com.xiaobing.oss.model.RestoreObjectResponse;
import com.xiaobing.oss.model.S3Exception;
import com.xiaobing.oss.model.UploadPartCopyRequest;
import com.xiaobing.oss.model.UploadPartCopyResponse;
import com.xiaobing.oss.model.UploadPartRequest;
import com.xiaobing.oss.model.UploadPartResponse;
import com.xiaobing.oss.model.WriteGetObjectResponseRequest;
import com.xiaobing.oss.model.WriteGetObjectResponseResponse;
import com.xiaobing.oss.paginators.ListObjectVersionsIterable;
import com.xiaobing.oss.paginators.ListObjectsV2Iterable;
import com.xiaobing.oss.paginators.ListPartsIterable;
import com.xiaobing.oss.waiters.S3Waiter;

/**
 * Service client for accessing Amazon S3. This can be created using the static {@link #builder()} method.
 *
 * <p/>
 */
@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
@ThreadSafe
public interface S3Client extends SdkClient {
    String SERVICE_NAME = "s3";

    /**
     * Value for looking up the service's metadata from the
     * {@link software.amazon.awssdk.regions.ServiceMetadataProvider}.
     */
    String SERVICE_METADATA_ID = "s3";

    /**
     * Create a {@link S3Client} with the region loaded from the
     * {@link software.amazon.awssdk.regions.providers.DefaultAwsRegionProviderChain} and credentials loaded from the
     * {@link software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider}.
     */
    static S3Client create() {
        return builder().build();
    }

    /**
     * Create a builder that can be used to configure and create a {@link S3Client}.
     */
    static S3ClientBuilder builder() {
        return new DefaultS3ClientBuilder();
    }

    /**
     * <p>
     * This action aborts a multipart upload. After a multipart upload is aborted, no additional parts can be uploaded
     * using that upload ID. The storage consumed by any previously uploaded parts will be freed. However, if any part
     * uploads are currently in progress, those part uploads might or might not succeed. As a result, it might be
     * necessary to abort a given multipart upload multiple times in order to completely free all storage consumed by
     * all parts.
     * </p>
     * <p>
     * To verify that all parts have been removed, so you don't get charged for the part storage, you should call the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a> action and ensure that
     * the parts list is empty.
     * </p>
     * <p>
     * For information about permissions required to use the multipart upload, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>AbortMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param abortMultipartUploadRequest
     * @return Result of the AbortMultipartUpload operation returned by the service.
     * @throws NoSuchUploadException
     *         The specified multipart upload does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.AbortMultipartUpload
     */
    default AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest)
            throws NoSuchUploadException, AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action aborts a multipart upload. After a multipart upload is aborted, no additional parts can be uploaded
     * using that upload ID. The storage consumed by any previously uploaded parts will be freed. However, if any part
     * uploads are currently in progress, those part uploads might or might not succeed. As a result, it might be
     * necessary to abort a given multipart upload multiple times in order to completely free all storage consumed by
     * all parts.
     * </p>
     * <p>
     * To verify that all parts have been removed, so you don't get charged for the part storage, you should call the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a> action and ensure that
     * the parts list is empty.
     * </p>
     * <p>
     * For information about permissions required to use the multipart upload, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>AbortMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link AbortMultipartUploadRequest.Builder} avoiding the
     * need to create one manually via {@link AbortMultipartUploadRequest#builder()}
     * </p>
     *
     * @param abortMultipartUploadRequest
     *        A {@link Consumer} that will call methods on {@link AbortMultipartUploadRequest.Builder} to create a
     *        request.
     * @return Result of the AbortMultipartUpload operation returned by the service.
     * @throws NoSuchUploadException
     *         The specified multipart upload does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.AbortMultipartUpload
     */
    default AbortMultipartUploadResponse abortMultipartUpload(
            Consumer<AbortMultipartUploadRequest.Builder> abortMultipartUploadRequest) throws NoSuchUploadException,
            AwsServiceException, SdkClientException, S3Exception {
        return abortMultipartUpload(AbortMultipartUploadRequest.builder().applyMutation(abortMultipartUploadRequest).build());
    }

    /**
     * <p>
     * Completes a multipart upload by assembling previously uploaded parts.
     * </p>
     * <p>
     * You first initiate the multipart upload and then upload all parts using the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> operation. After
     * successfully uploading all relevant parts of an upload, you call this action to complete the upload. Upon
     * receiving this request, Amazon S3 concatenates all the parts in ascending order by part number to create a new
     * object. In the Complete Multipart Upload request, you must provide the parts list. You must ensure that the parts
     * list is complete. This action concatenates the parts that you provide in the list. For each part in the list, you
     * must provide the part number and the <code>ETag</code> value, returned after that part was uploaded.
     * </p>
     * <p>
     * Processing of a Complete Multipart Upload request could take several minutes to complete. After Amazon S3 begins
     * processing the request, it sends an HTTP response header that specifies a 200 OK response. While processing is in
     * progress, Amazon S3 periodically sends white space characters to keep the connection from timing out. Because a
     * request could fail after the initial 200 OK response has been sent, it is important that you check the response
     * body to determine whether the request succeeded.
     * </p>
     * <p>
     * Note that if <code>CompleteMultipartUpload</code> fails, applications should be prepared to retry the failed
     * requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ErrorBestPractices.html">Amazon S3 Error Best
     * Practices</a>.
     * </p>
     * <important>
     * <p>
     * You cannot use <code>Content-Type: application/x-www-form-urlencoded</code> with Complete Multipart Upload
     * requests. Also, if you do not provide a <code>Content-Type</code> header, <code>CompleteMultipartUpload</code>
     * returns a 200 OK response.
     * </p>
     * </important>
     * <p>
     * For more information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information about permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * <code>CompleteMultipartUpload</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>EntityTooSmall</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: Your proposed upload is smaller than the minimum allowed object size. Each part must be at least 5
     * MB in size, except the last part.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InvalidPart</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: One or more of the specified parts could not be found. The part might not have been uploaded, or the
     * specified entity tag might not have matched the part's entity tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InvalidPartOrder</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The list of parts was not in ascending order. The parts list must be specified in order by part
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>NoSuchUpload</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart
     * upload might have been aborted or completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 404 Not Found
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>CompleteMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param completeMultipartUploadRequest
     * @return Result of the CompleteMultipartUpload operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CompleteMultipartUpload
     */
    default CompleteMultipartUploadResponse completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Completes a multipart upload by assembling previously uploaded parts.
     * </p>
     * <p>
     * You first initiate the multipart upload and then upload all parts using the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> operation. After
     * successfully uploading all relevant parts of an upload, you call this action to complete the upload. Upon
     * receiving this request, Amazon S3 concatenates all the parts in ascending order by part number to create a new
     * object. In the Complete Multipart Upload request, you must provide the parts list. You must ensure that the parts
     * list is complete. This action concatenates the parts that you provide in the list. For each part in the list, you
     * must provide the part number and the <code>ETag</code> value, returned after that part was uploaded.
     * </p>
     * <p>
     * Processing of a Complete Multipart Upload request could take several minutes to complete. After Amazon S3 begins
     * processing the request, it sends an HTTP response header that specifies a 200 OK response. While processing is in
     * progress, Amazon S3 periodically sends white space characters to keep the connection from timing out. Because a
     * request could fail after the initial 200 OK response has been sent, it is important that you check the response
     * body to determine whether the request succeeded.
     * </p>
     * <p>
     * Note that if <code>CompleteMultipartUpload</code> fails, applications should be prepared to retry the failed
     * requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ErrorBestPractices.html">Amazon S3 Error Best
     * Practices</a>.
     * </p>
     * <important>
     * <p>
     * You cannot use <code>Content-Type: application/x-www-form-urlencoded</code> with Complete Multipart Upload
     * requests. Also, if you do not provide a <code>Content-Type</code> header, <code>CompleteMultipartUpload</code>
     * returns a 200 OK response.
     * </p>
     * </important>
     * <p>
     * For more information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information about permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * <code>CompleteMultipartUpload</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>EntityTooSmall</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: Your proposed upload is smaller than the minimum allowed object size. Each part must be at least 5
     * MB in size, except the last part.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InvalidPart</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: One or more of the specified parts could not be found. The part might not have been uploaded, or the
     * specified entity tag might not have matched the part's entity tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InvalidPartOrder</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The list of parts was not in ascending order. The parts list must be specified in order by part
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>NoSuchUpload</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart
     * upload might have been aborted or completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 404 Not Found
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>CompleteMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link CompleteMultipartUploadRequest.Builder} avoiding
     * the need to create one manually via {@link CompleteMultipartUploadRequest#builder()}
     * </p>
     *
     * @param completeMultipartUploadRequest
     *        A {@link Consumer} that will call methods on {@link CompleteMultipartUploadRequest.Builder} to create a
     *        request.
     * @return Result of the CompleteMultipartUpload operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CompleteMultipartUpload
     */
    default CompleteMultipartUploadResponse completeMultipartUpload(
            Consumer<CompleteMultipartUploadRequest.Builder> completeMultipartUploadRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return completeMultipartUpload(CompleteMultipartUploadRequest.builder().applyMutation(completeMultipartUploadRequest)
                .build());
    }

    /**
     * <p>
     * Creates a copy of an object that is already stored in Amazon S3.
     * </p>
     * <note>
     * <p>
     * You can store individual objects of up to 5 TB in Amazon S3. You create a copy of your object up to 5 GB in size
     * in a single atomic action using this API. However, to copy an object greater than 5 GB, you must use the
     * multipart upload Upload Part - Copy (UploadPartCopy) API. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjctsUsingRESTMPUapi.html">Copy Object Using the
     * REST Multipart Upload API</a>.
     * </p>
     * </note>
     * <p>
     * All copy requests must be authenticated. Additionally, you must have <i>read</i> access to the source object and
     * <i>write</i> access to the destination bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a>. Both the
     * Region that you want to copy the object from and the Region that you want to copy the object to must be enabled
     * for your account.
     * </p>
     * <p>
     * A copy request might return an error when Amazon S3 receives the copy request or while Amazon S3 is copying the
     * files. If the error occurs before the copy action starts, you receive a standard Amazon S3 error. If the error
     * occurs during the copy operation, the error response is embedded in the <code>200 OK</code> response. This means
     * that a <code>200 OK</code> response can contain either a success or an error. Design your application to parse
     * the contents of the response and handle it appropriately.
     * </p>
     * <p>
     * If the copy is successful, you receive a response with information about the copied object.
     * </p>
     * <note>
     * <p>
     * If the request is an HTTP 1.1 request, the response is chunk encoded. If it were not, it would not contain the
     * content-length, and you would need to read the entire body.
     * </p>
     * </note>
     * <p>
     * The copy request charge is based on the storage class and Region that you specify for the destination object. For
     * pricing information, see <a href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * <important>
     * <p>
     * Amazon S3 transfer acceleration does not support cross-Region copies. If you request a cross-Region copy using a
     * transfer acceleration endpoint, you get a 400 <code>Bad Request</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a>.
     * </p>
     * </important>
     * <p>
     * <b>Metadata</b>
     * </p>
     * <p>
     * When copying an object, you can preserve all metadata (default) or specify new metadata. However, the ACL is not
     * preserved and is set to private for the user making the request. To override the default ACL setting, specify a
     * new ACL when generating a copy request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>.
     * </p>
     * <p>
     * To specify whether you want the object metadata copied from the source object or replaced with metadata provided
     * in the request, you can optionally add the <code>x-amz-metadata-directive</code> header. When you grant
     * permissions, you can use the <code>s3:x-amz-metadata-directive</code> condition key to enforce certain metadata
     * behavior when objects are uploaded. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/amazon-s3-policy-keys.html">Specifying Conditions in a
     * Policy</a> in the <i>Amazon S3 User Guide</i>. For a complete list of Amazon S3-specific condition keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a>.
     * </p>
     * <p>
     * <b>x-amz-copy-source-if Headers</b>
     * </p>
     * <p>
     * To only copy an object under certain conditions, such as whether the <code>Etag</code> matches or whether the
     * object was modified before or after a specified date, use the following request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-match</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If both the <code>x-amz-copy-source-if-match</code> and <code>x-amz-copy-source-if-unmodified-since</code>
     * headers are present in the request and evaluate as follows, Amazon S3 returns <code>200 OK</code> and copies the
     * data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-match</code> condition evaluates to true
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If both the <code>x-amz-copy-source-if-none-match</code> and <code>x-amz-copy-source-if-modified-since</code>
     * headers are present in the request and evaluate as follows, Amazon S3 returns the
     * <code>412 Precondition Failed</code> response code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code> condition evaluates to false
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to true
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * All headers with the <code>x-amz-</code> prefix, including <code>x-amz-copy-source</code>, must be signed.
     * </p>
     * </note>
     * <p>
     * <b>Server-side encryption</b>
     * </p>
     * <p>
     * When you perform a CopyObject operation, you can optionally use the appropriate encryption-related headers to
     * encrypt the object using server-side encryption with Amazon Web Services managed encryption keys (SSE-S3 or
     * SSE-KMS) or a customer-provided encryption key. With server-side encryption, Amazon S3 encrypts your data as it
     * writes it to disks in its data centers and decrypts the data when you access it. For more information about
     * server-side encryption, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Using Server-Side
     * Encryption</a>.
     * </p>
     * <p>
     * If a target object uses SSE-KMS, you can enable an S3 Bucket Key for the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * When copying an object, you can optionally use headers to grant ACL-based permissions. By default, all objects
     * are private. Only the owner has full access control. When adding a new object, you can grant permissions to
     * individual Amazon Web Services accounts or to predefined groups defined by Amazon S3. These permissions are then
     * added to the ACL on the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing ACLs Using the
     * REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're copying objects to uses the bucket owner enforced setting for S3 Object Ownership, ACLs
     * are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that don't
     * specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Checksums</b>
     * </p>
     * <p>
     * When copying an object, if it has a checksum, that checksum will be copied to the new object by default. When you
     * copy the object over, you may optionally specify a different checksum algorithm to use with the
     * <code>x-amz-checksum-algorithm</code> header.
     * </p>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * You can use the <code>CopyObject</code> action to change the storage class of an object that is already stored in
     * Amazon S3 using the <code>StorageClass</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, <code>x-amz-copy-source</code> identifies the current version of an object to copy. If the current
     * version is a delete marker, Amazon S3 behaves as if the object was deleted. To copy a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <p>
     * If you enable versioning on the target bucket, Amazon S3 generates a unique version ID for the object being
     * copied. This version ID is different from the version ID of the source object. Amazon S3 returns the version ID
     * of the copied object in the <code>x-amz-version-id</code> response header in the response.
     * </p>
     * <p>
     * If you do not enable versioning or suspend it on the target bucket, the version ID that Amazon S3 generates is
     * always null.
     * </p>
     * <p>
     * If the source object's storage class is GLACIER, you must restore a copy of this object before you can use it as
     * a source object for the copy operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>.
     * </p>
     * <p>
     * The following operations are related to <code>CopyObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjectsExamples.html">Copying Objects</a>.
     * </p>
     *
     * @param copyObjectRequest
     * @return Result of the CopyObject operation returned by the service.
     * @throws ObjectNotInActiveTierErrorException
     *         The source object of the COPY action is not in the active tier and is only stored in Amazon S3 Glacier.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CopyObject
     */
    default CopyObjectResponse copyObject(CopyObjectRequest copyObjectRequest) throws ObjectNotInActiveTierErrorException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates a copy of an object that is already stored in Amazon S3.
     * </p>
     * <note>
     * <p>
     * You can store individual objects of up to 5 TB in Amazon S3. You create a copy of your object up to 5 GB in size
     * in a single atomic action using this API. However, to copy an object greater than 5 GB, you must use the
     * multipart upload Upload Part - Copy (UploadPartCopy) API. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjctsUsingRESTMPUapi.html">Copy Object Using the
     * REST Multipart Upload API</a>.
     * </p>
     * </note>
     * <p>
     * All copy requests must be authenticated. Additionally, you must have <i>read</i> access to the source object and
     * <i>write</i> access to the destination bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a>. Both the
     * Region that you want to copy the object from and the Region that you want to copy the object to must be enabled
     * for your account.
     * </p>
     * <p>
     * A copy request might return an error when Amazon S3 receives the copy request or while Amazon S3 is copying the
     * files. If the error occurs before the copy action starts, you receive a standard Amazon S3 error. If the error
     * occurs during the copy operation, the error response is embedded in the <code>200 OK</code> response. This means
     * that a <code>200 OK</code> response can contain either a success or an error. Design your application to parse
     * the contents of the response and handle it appropriately.
     * </p>
     * <p>
     * If the copy is successful, you receive a response with information about the copied object.
     * </p>
     * <note>
     * <p>
     * If the request is an HTTP 1.1 request, the response is chunk encoded. If it were not, it would not contain the
     * content-length, and you would need to read the entire body.
     * </p>
     * </note>
     * <p>
     * The copy request charge is based on the storage class and Region that you specify for the destination object. For
     * pricing information, see <a href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * <important>
     * <p>
     * Amazon S3 transfer acceleration does not support cross-Region copies. If you request a cross-Region copy using a
     * transfer acceleration endpoint, you get a 400 <code>Bad Request</code> error. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a>.
     * </p>
     * </important>
     * <p>
     * <b>Metadata</b>
     * </p>
     * <p>
     * When copying an object, you can preserve all metadata (default) or specify new metadata. However, the ACL is not
     * preserved and is set to private for the user making the request. To override the default ACL setting, specify a
     * new ACL when generating a copy request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>.
     * </p>
     * <p>
     * To specify whether you want the object metadata copied from the source object or replaced with metadata provided
     * in the request, you can optionally add the <code>x-amz-metadata-directive</code> header. When you grant
     * permissions, you can use the <code>s3:x-amz-metadata-directive</code> condition key to enforce certain metadata
     * behavior when objects are uploaded. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/amazon-s3-policy-keys.html">Specifying Conditions in a
     * Policy</a> in the <i>Amazon S3 User Guide</i>. For a complete list of Amazon S3-specific condition keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html">Actions, Resources, and Condition Keys
     * for Amazon S3</a>.
     * </p>
     * <p>
     * <b>x-amz-copy-source-if Headers</b>
     * </p>
     * <p>
     * To only copy an object under certain conditions, such as whether the <code>Etag</code> matches or whether the
     * object was modified before or after a specified date, use the following request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-match</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If both the <code>x-amz-copy-source-if-match</code> and <code>x-amz-copy-source-if-unmodified-since</code>
     * headers are present in the request and evaluate as follows, Amazon S3 returns <code>200 OK</code> and copies the
     * data:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-match</code> condition evaluates to true
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If both the <code>x-amz-copy-source-if-none-match</code> and <code>x-amz-copy-source-if-modified-since</code>
     * headers are present in the request and evaluate as follows, Amazon S3 returns the
     * <code>412 Precondition Failed</code> response code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code> condition evaluates to false
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to true
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * All headers with the <code>x-amz-</code> prefix, including <code>x-amz-copy-source</code>, must be signed.
     * </p>
     * </note>
     * <p>
     * <b>Server-side encryption</b>
     * </p>
     * <p>
     * When you perform a CopyObject operation, you can optionally use the appropriate encryption-related headers to
     * encrypt the object using server-side encryption with Amazon Web Services managed encryption keys (SSE-S3 or
     * SSE-KMS) or a customer-provided encryption key. With server-side encryption, Amazon S3 encrypts your data as it
     * writes it to disks in its data centers and decrypts the data when you access it. For more information about
     * server-side encryption, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Using Server-Side
     * Encryption</a>.
     * </p>
     * <p>
     * If a target object uses SSE-KMS, you can enable an S3 Bucket Key for the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * When copying an object, you can optionally use headers to grant ACL-based permissions. By default, all objects
     * are private. Only the owner has full access control. When adding a new object, you can grant permissions to
     * individual Amazon Web Services accounts or to predefined groups defined by Amazon S3. These permissions are then
     * added to the ACL on the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing ACLs Using the
     * REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're copying objects to uses the bucket owner enforced setting for S3 Object Ownership, ACLs
     * are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that don't
     * specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Checksums</b>
     * </p>
     * <p>
     * When copying an object, if it has a checksum, that checksum will be copied to the new object by default. When you
     * copy the object over, you may optionally specify a different checksum algorithm to use with the
     * <code>x-amz-checksum-algorithm</code> header.
     * </p>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * You can use the <code>CopyObject</code> action to change the storage class of an object that is already stored in
     * Amazon S3 using the <code>StorageClass</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, <code>x-amz-copy-source</code> identifies the current version of an object to copy. If the current
     * version is a delete marker, Amazon S3 behaves as if the object was deleted. To copy a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <p>
     * If you enable versioning on the target bucket, Amazon S3 generates a unique version ID for the object being
     * copied. This version ID is different from the version ID of the source object. Amazon S3 returns the version ID
     * of the copied object in the <code>x-amz-version-id</code> response header in the response.
     * </p>
     * <p>
     * If you do not enable versioning or suspend it on the target bucket, the version ID that Amazon S3 generates is
     * always null.
     * </p>
     * <p>
     * If the source object's storage class is GLACIER, you must restore a copy of this object before you can use it as
     * a source object for the copy operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>.
     * </p>
     * <p>
     * The following operations are related to <code>CopyObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CopyingObjectsExamples.html">Copying Objects</a>.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link CopyObjectRequest.Builder} avoiding the need to
     * create one manually via {@link CopyObjectRequest#builder()}
     * </p>
     *
     * @param copyObjectRequest
     *        A {@link Consumer} that will call methods on {@link CopyObjectRequest.Builder} to create a request.
     * @return Result of the CopyObject operation returned by the service.
     * @throws ObjectNotInActiveTierErrorException
     *         The source object of the COPY action is not in the active tier and is only stored in Amazon S3 Glacier.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CopyObject
     */
    default CopyObjectResponse copyObject(Consumer<CopyObjectRequest.Builder> copyObjectRequest)
            throws ObjectNotInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return copyObject(CopyObjectRequest.builder().applyMutation(copyObjectRequest).build());
    }

    /**
     * <p>
     * Creates a new S3 bucket. To create a bucket, you must register with Amazon S3 and have a valid Amazon Web
     * Services Access Key ID to authenticate requests. Anonymous requests are never allowed to create buckets. By
     * creating the bucket, you become the bucket owner.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information about bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html">Bucket naming rules</a>.
     * </p>
     * <p>
     * If you want to create an Amazon S3 on Outposts bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">Create Bucket</a>.
     * </p>
     * <p>
     * By default, the bucket is created in the US East (N. Virginia) Region. You can optionally specify a Region in the
     * request body. You might choose a Region to optimize latency, minimize costs, or address regulatory requirements.
     * For example, if you reside in Europe, you will probably find it advantageous to create buckets in the Europe
     * (Ireland) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">Accessing a
     * bucket</a>.
     * </p>
     * <note>
     * <p>
     * If you send your create bucket request to the <code>s3.amazonaws.com</code> endpoint, the request goes to the
     * us-east-1 Region. Accordingly, the signature calculations in Signature Version 4 must use us-east-1 as the
     * Region, even if the location constraint in the request specifies another Region where the bucket is to be
     * created. If you create a bucket in a Region other than US East (N. Virginia), your application must be able to
     * handle 307 redirect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html">Virtual hosting of buckets</a>.
     * </p>
     * </note>
     * <p>
     * <b>Access control lists (ACLs)</b>
     * </p>
     * <p>
     * When creating a bucket using this operation, you can optionally configure the bucket ACL to specify the accounts
     * or groups that should be granted specific permissions on the bucket.
     * </p>
     * <important>
     * <p>
     * If your CreateBucket request sets bucket owner enforced for S3 Object Ownership and specifies a bucket ACL that
     * provides access to an external Amazon Web Services account, your request fails with a <code>400</code> error and
     * returns the <code>InvalidBucketAclWithObjectOwnership</code> error code. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * There are two ways to grant the appropriate permissions using the request headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL using the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined
     * ACLs, known as <i>canned ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned
     * ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly using the <code>x-amz-grant-read</code>, <code>x-amz-grant-write</code>,
     * <code>x-amz-grant-read-acp</code>, <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code>
     * headers. These headers map to the set of permissions Amazon S3 supports in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html">Access control list (ACL)
     * overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants the Amazon Web Services accounts
     * identified by account IDs permissions to read object data and its metadata:
     * </p>
     * <p>
     * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * </note>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * In addition to <code>s3:CreateBucket</code>, the following permissions are required when your CreateBucket
     * includes specific headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACLs</b> - If your <code>CreateBucket</code> request specifies ACL permissions and the ACL is public-read,
     * public-read-write, authenticated-read, or if you specify access permissions explicitly through any other ACL,
     * both <code>s3:CreateBucket</code> and <code>s3:PutBucketAcl</code> permissions are needed. If the ACL the
     * <code>CreateBucket</code> request is private or doesn't specify any ACLs, only <code>s3:CreateBucket</code>
     * permission is needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Object Lock</b> - If <code>ObjectLockEnabledForBucket</code> is set to true in your <code>CreateBucket</code>
     * request, <code>s3:PutBucketObjectLockConfiguration</code> and <code>s3:PutBucketVersioning</code> permissions are
     * required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 Object Ownership</b> - If your CreateBucket request includes the the <code>x-amz-object-ownership</code>
     * header, <code>s3:PutBucketOwnershipControls</code> permission is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>CreateBucket</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param createBucketRequest
     * @return Result of the CreateBucket operation returned by the service.
     * @throws BucketAlreadyExistsException
     *         The requested bucket name is not available. The bucket namespace is shared by all users of the system.
     *         Select a different name and try again.
     * @throws BucketAlreadyOwnedByYouException
     *         The bucket you tried to create already exists, and you own it. Amazon S3 returns this error in all Amazon
     *         Web Services Regions except in the North Virginia Region. For legacy compatibility, if you re-create an
     *         existing bucket that you already own in the North Virginia Region, Amazon S3 returns 200 OK and resets
     *         the bucket access control lists (ACLs).
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CreateBucket
     */
    default CreateBucketResponse createBucket(CreateBucketRequest createBucketRequest) throws BucketAlreadyExistsException,
            BucketAlreadyOwnedByYouException, AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates a new S3 bucket. To create a bucket, you must register with Amazon S3 and have a valid Amazon Web
     * Services Access Key ID to authenticate requests. Anonymous requests are never allowed to create buckets. By
     * creating the bucket, you become the bucket owner.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information about bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html">Bucket naming rules</a>.
     * </p>
     * <p>
     * If you want to create an Amazon S3 on Outposts bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">Create Bucket</a>.
     * </p>
     * <p>
     * By default, the bucket is created in the US East (N. Virginia) Region. You can optionally specify a Region in the
     * request body. You might choose a Region to optimize latency, minimize costs, or address regulatory requirements.
     * For example, if you reside in Europe, you will probably find it advantageous to create buckets in the Europe
     * (Ireland) Region. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">Accessing a
     * bucket</a>.
     * </p>
     * <note>
     * <p>
     * If you send your create bucket request to the <code>s3.amazonaws.com</code> endpoint, the request goes to the
     * us-east-1 Region. Accordingly, the signature calculations in Signature Version 4 must use us-east-1 as the
     * Region, even if the location constraint in the request specifies another Region where the bucket is to be
     * created. If you create a bucket in a Region other than US East (N. Virginia), your application must be able to
     * handle 307 redirect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html">Virtual hosting of buckets</a>.
     * </p>
     * </note>
     * <p>
     * <b>Access control lists (ACLs)</b>
     * </p>
     * <p>
     * When creating a bucket using this operation, you can optionally configure the bucket ACL to specify the accounts
     * or groups that should be granted specific permissions on the bucket.
     * </p>
     * <important>
     * <p>
     * If your CreateBucket request sets bucket owner enforced for S3 Object Ownership and specifies a bucket ACL that
     * provides access to an external Amazon Web Services account, your request fails with a <code>400</code> error and
     * returns the <code>InvalidBucketAclWithObjectOwnership</code> error code. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * There are two ways to grant the appropriate permissions using the request headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL using the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined
     * ACLs, known as <i>canned ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned
     * ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly using the <code>x-amz-grant-read</code>, <code>x-amz-grant-write</code>,
     * <code>x-amz-grant-read-acp</code>, <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code>
     * headers. These headers map to the set of permissions Amazon S3 supports in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html">Access control list (ACL)
     * overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants the Amazon Web Services accounts
     * identified by account IDs permissions to read object data and its metadata:
     * </p>
     * <p>
     * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * </note>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * In addition to <code>s3:CreateBucket</code>, the following permissions are required when your CreateBucket
     * includes specific headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACLs</b> - If your <code>CreateBucket</code> request specifies ACL permissions and the ACL is public-read,
     * public-read-write, authenticated-read, or if you specify access permissions explicitly through any other ACL,
     * both <code>s3:CreateBucket</code> and <code>s3:PutBucketAcl</code> permissions are needed. If the ACL the
     * <code>CreateBucket</code> request is private or doesn't specify any ACLs, only <code>s3:CreateBucket</code>
     * permission is needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Object Lock</b> - If <code>ObjectLockEnabledForBucket</code> is set to true in your <code>CreateBucket</code>
     * request, <code>s3:PutBucketObjectLockConfiguration</code> and <code>s3:PutBucketVersioning</code> permissions are
     * required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>S3 Object Ownership</b> - If your CreateBucket request includes the the <code>x-amz-object-ownership</code>
     * header, <code>s3:PutBucketOwnershipControls</code> permission is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>CreateBucket</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link CreateBucketRequest.Builder} avoiding the need to
     * create one manually via {@link CreateBucketRequest#builder()}
     * </p>
     *
     * @param createBucketRequest
     *        A {@link Consumer} that will call methods on {@link CreateBucketRequest.Builder} to create a request.
     * @return Result of the CreateBucket operation returned by the service.
     * @throws BucketAlreadyExistsException
     *         The requested bucket name is not available. The bucket namespace is shared by all users of the system.
     *         Select a different name and try again.
     * @throws BucketAlreadyOwnedByYouException
     *         The bucket you tried to create already exists, and you own it. Amazon S3 returns this error in all Amazon
     *         Web Services Regions except in the North Virginia Region. For legacy compatibility, if you re-create an
     *         existing bucket that you already own in the North Virginia Region, Amazon S3 returns 200 OK and resets
     *         the bucket access control lists (ACLs).
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CreateBucket
     */
    default CreateBucketResponse createBucket(Consumer<CreateBucketRequest.Builder> createBucketRequest)
            throws BucketAlreadyExistsException, BucketAlreadyOwnedByYouException, AwsServiceException, SdkClientException,
            S3Exception {
        return createBucket(CreateBucketRequest.builder().applyMutation(createBucketRequest).build());
    }

    /**
     * <p>
     * This action initiates a multipart upload and returns an upload ID. This upload ID is used to associate all of the
     * parts in the specific multipart upload. You specify this upload ID in each of your subsequent upload part
     * requests (see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>). You
     * also include this upload ID in the final request to either complete or abort the multipart upload request.
     * </p>
     * <p>
     * For more information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a>.
     * </p>
     * <p>
     * If you have configured a lifecycle rule to abort incomplete multipart uploads, the upload must complete within
     * the number of days specified in the bucket lifecycle configuration. Otherwise, the incomplete multipart upload
     * becomes eligible for an abort action and Amazon S3 aborts the multipart upload. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
     * </p>
     * <p>
     * For information about the permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * For request signing, multipart upload is just a series of regular requests. You initiate a multipart upload, send
     * one or more requests to upload parts, and then complete the multipart upload process. You sign each request
     * individually. There is nothing special about signing multipart upload requests. For more information about
     * signing, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <note>
     * <p>
     * After you initiate a multipart upload and upload one or more parts, to stop being charged for storing the
     * uploaded parts, you must either complete or abort the multipart upload. Amazon S3 frees up the space used to
     * store the parts and stop charging you for storing them only after you either complete or abort a multipart
     * upload.
     * </p>
     * </note>
     * <p>
     * You can optionally request server-side encryption. For server-side encryption, Amazon S3 encrypts your data as it
     * writes it to disks in its data centers and decrypts it when you access it. You can provide your own encryption
     * key, or use Amazon Web Services KMS keys or Amazon S3-managed encryption keys. If you choose to provide your own
     * encryption key, the request headers you provide in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a> requests must
     * match the headers you used in the request to initiate the upload by using <code>CreateMultipartUpload</code>.
     * </p>
     * <p>
     * To perform a multipart upload with encryption using an Amazon Web Services KMS key, the requester must have
     * permission to the <code>kms:Decrypt</code> and <code>kms:GenerateDataKey*</code> actions on the key. These
     * permissions are required because Amazon S3 must decrypt and read data from the encrypted file parts before it
     * completes the multipart upload. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/mpuoverview.html#mpuAndPermissions">Multipart upload
     * API and permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If your Identity and Access Management (IAM) user or role is in the same Amazon Web Services account as the KMS
     * key, then you must have these permissions on the key policy. If your IAM user or role belongs to a different
     * account than the key, then you must have the permissions on both the key policy and your IAM user or role.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a>.
     * </p>
     * <dl>
     * <dt>Access Permissions</dt>
     * <dd>
     * <p>
     * When copying an object, you can optionally specify the accounts or groups that should be granted specific
     * permissions on the new object. There are two ways to grant the permissions using the request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. These parameters map to
     * the set of permissions that Amazon S3 supports in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * </dd>
     * <dt>Server-Side- Encryption-Specific Request Headers</dt>
     * <dd>
     * <p>
     * You can optionally tell Amazon S3 to encrypt data at rest using server-side encryption. Server-side encryption is
     * for data encryption at rest. Amazon S3 encrypts your data as it writes it to disks in its data centers and
     * decrypts it when you access it. The option you use depends on whether you want to use Amazon Web Services managed
     * encryption keys or provide your own encryption key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use encryption keys managed by Amazon S3 or customer managed key stored in Amazon Web Services Key Management
     * Service (Amazon Web Services KMS) – If you want Amazon Web Services to manage the keys used to encrypt data,
     * specify the following headers in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-aws-kms-key-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-context</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify <code>x-amz-server-side-encryption:aws:kms</code>, but don't provide
     * <code>x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon S3 uses the Amazon Web Services managed key in
     * Amazon Web Services KMS to protect the data.
     * </p>
     * </note> <important>
     * <p>
     * All GET and PUT requests for an object protected by Amazon Web Services KMS fail if you don't make them with SSL
     * or by using SigV4.
     * </p>
     * </important>
     * <p>
     * For more information about server-side encryption with KMS key (SSE-KMS), see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with KMS keys</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use customer-provided encryption keys – If you want to manage your own encryption keys, provide all the following
     * headers in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-algorithm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key-MD5</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about server-side encryption with KMS keys (SSE-KMS), see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with KMS keys</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Access-Control-List (ACL)-Specific Request Headers</dt>
     * <dd>
     * <p>
     * You also can use the following access control–related headers with this operation. By default, all objects are
     * private. Only the owner has full access control. When adding a new object, you can grant permissions to
     * individual Amazon Web Services accounts or to predefined groups defined by Amazon S3. These permissions are then
     * added to the access control list (ACL) on the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>. With this
     * operation, you can grant access permissions using one of the following two methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL (<code>x-amz-acl</code>) — Amazon S3 supports a set of predefined ACLs, known as <i>canned
     * ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly — To explicitly grant access permissions to specific Amazon Web Services
     * accounts or groups, use the following headers. Each header maps to specific permissions that Amazon S3 supports
     * in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>.
     * In the header, you specify a list of grantees who get the specific permission. To grant permissions explicitly,
     * use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-grant-read</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-write</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-read-acp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-write-acp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-full-control</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants the Amazon Web Services accounts
     * identified by account IDs permissions to read object data and its metadata:
     * </p>
     * <p>
     * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * The following operations are related to <code>CreateMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param createMultipartUploadRequest
     * @return Result of the CreateMultipartUpload operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CreateMultipartUpload
     */
    default CreateMultipartUploadResponse createMultipartUpload(CreateMultipartUploadRequest createMultipartUploadRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action initiates a multipart upload and returns an upload ID. This upload ID is used to associate all of the
     * parts in the specific multipart upload. You specify this upload ID in each of your subsequent upload part
     * requests (see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>). You
     * also include this upload ID in the final request to either complete or abort the multipart upload request.
     * </p>
     * <p>
     * For more information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a>.
     * </p>
     * <p>
     * If you have configured a lifecycle rule to abort incomplete multipart uploads, the upload must complete within
     * the number of days specified in the bucket lifecycle configuration. Otherwise, the incomplete multipart upload
     * becomes eligible for an abort action and Amazon S3 aborts the multipart upload. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>.
     * </p>
     * <p>
     * For information about the permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * For request signing, multipart upload is just a series of regular requests. You initiate a multipart upload, send
     * one or more requests to upload parts, and then complete the multipart upload process. You sign each request
     * individually. There is nothing special about signing multipart upload requests. For more information about
     * signing, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <note>
     * <p>
     * After you initiate a multipart upload and upload one or more parts, to stop being charged for storing the
     * uploaded parts, you must either complete or abort the multipart upload. Amazon S3 frees up the space used to
     * store the parts and stop charging you for storing them only after you either complete or abort a multipart
     * upload.
     * </p>
     * </note>
     * <p>
     * You can optionally request server-side encryption. For server-side encryption, Amazon S3 encrypts your data as it
     * writes it to disks in its data centers and decrypts it when you access it. You can provide your own encryption
     * key, or use Amazon Web Services KMS keys or Amazon S3-managed encryption keys. If you choose to provide your own
     * encryption key, the request headers you provide in <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a> requests must
     * match the headers you used in the request to initiate the upload by using <code>CreateMultipartUpload</code>.
     * </p>
     * <p>
     * To perform a multipart upload with encryption using an Amazon Web Services KMS key, the requester must have
     * permission to the <code>kms:Decrypt</code> and <code>kms:GenerateDataKey*</code> actions on the key. These
     * permissions are required because Amazon S3 must decrypt and read data from the encrypted file parts before it
     * completes the multipart upload. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/mpuoverview.html#mpuAndPermissions">Multipart upload
     * API and permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If your Identity and Access Management (IAM) user or role is in the same Amazon Web Services account as the KMS
     * key, then you must have these permissions on the key policy. If your IAM user or role belongs to a different
     * account than the key, then you must have the permissions on both the key policy and your IAM user or role.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a>.
     * </p>
     * <dl>
     * <dt>Access Permissions</dt>
     * <dd>
     * <p>
     * When copying an object, you can optionally specify the accounts or groups that should be granted specific
     * permissions on the new object. There are two ways to grant the permissions using the request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. These parameters map to
     * the set of permissions that Amazon S3 supports in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * </dd>
     * <dt>Server-Side- Encryption-Specific Request Headers</dt>
     * <dd>
     * <p>
     * You can optionally tell Amazon S3 to encrypt data at rest using server-side encryption. Server-side encryption is
     * for data encryption at rest. Amazon S3 encrypts your data as it writes it to disks in its data centers and
     * decrypts it when you access it. The option you use depends on whether you want to use Amazon Web Services managed
     * encryption keys or provide your own encryption key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use encryption keys managed by Amazon S3 or customer managed key stored in Amazon Web Services Key Management
     * Service (Amazon Web Services KMS) – If you want Amazon Web Services to manage the keys used to encrypt data,
     * specify the following headers in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-aws-kms-key-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-context</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you specify <code>x-amz-server-side-encryption:aws:kms</code>, but don't provide
     * <code>x-amz-server-side-encryption-aws-kms-key-id</code>, Amazon S3 uses the Amazon Web Services managed key in
     * Amazon Web Services KMS to protect the data.
     * </p>
     * </note> <important>
     * <p>
     * All GET and PUT requests for an object protected by Amazon Web Services KMS fail if you don't make them with SSL
     * or by using SigV4.
     * </p>
     * </important>
     * <p>
     * For more information about server-side encryption with KMS key (SSE-KMS), see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with KMS keys</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use customer-provided encryption keys – If you want to manage your own encryption keys, provide all the following
     * headers in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-algorithm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key-MD5</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about server-side encryption with KMS keys (SSE-KMS), see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with KMS keys</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Access-Control-List (ACL)-Specific Request Headers</dt>
     * <dd>
     * <p>
     * You also can use the following access control–related headers with this operation. By default, all objects are
     * private. Only the owner has full access control. When adding a new object, you can grant permissions to
     * individual Amazon Web Services accounts or to predefined groups defined by Amazon S3. These permissions are then
     * added to the access control list (ACL) on the object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>. With this
     * operation, you can grant access permissions using one of the following two methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL (<code>x-amz-acl</code>) — Amazon S3 supports a set of predefined ACLs, known as <i>canned
     * ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly — To explicitly grant access permissions to specific Amazon Web Services
     * accounts or groups, use the following headers. Each header maps to specific permissions that Amazon S3 supports
     * in an ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>.
     * In the header, you specify a list of grantees who get the specific permission. To grant permissions explicitly,
     * use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-grant-read</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-write</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-read-acp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-write-acp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-grant-full-control</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants the Amazon Web Services accounts
     * identified by account IDs permissions to read object data and its metadata:
     * </p>
     * <p>
     * <code>x-amz-grant-read: id="11112222333", id="444455556666" </code>
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * The following operations are related to <code>CreateMultipartUpload</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link CreateMultipartUploadRequest.Builder} avoiding the
     * need to create one manually via {@link CreateMultipartUploadRequest#builder()}
     * </p>
     *
     * @param createMultipartUploadRequest
     *        A {@link Consumer} that will call methods on {@link CreateMultipartUploadRequest.Builder} to create a
     *        request.
     * @return Result of the CreateMultipartUpload operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.CreateMultipartUpload
     */
    default CreateMultipartUploadResponse createMultipartUpload(
            Consumer<CreateMultipartUploadRequest.Builder> createMultipartUploadRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return createMultipartUpload(CreateMultipartUploadRequest.builder().applyMutation(createMultipartUploadRequest).build());
    }

    /**
     * <p>
     * Deletes the S3 bucket. All objects (including all object versions and delete markers) in the bucket must be
     * deleted before the bucket itself can be deleted.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketRequest
     * @return Result of the DeleteBucket operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucket
     */
    default DeleteBucketResponse deleteBucket(DeleteBucketRequest deleteBucketRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the S3 bucket. All objects (including all object versions and delete markers) in the bucket must be
     * deleted before the bucket itself can be deleted.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketRequest.Builder} avoiding the need to
     * create one manually via {@link DeleteBucketRequest#builder()}
     * </p>
     *
     * @param deleteBucketRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketRequest.Builder} to create a request.
     * @return Result of the DeleteBucket operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucket
     */
    default DeleteBucketResponse deleteBucket(Consumer<DeleteBucketRequest.Builder> deleteBucketRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucket(DeleteBucketRequest.builder().applyMutation(deleteBucketRequest).build());
    }

    /**
     * <p>
     * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketAnalyticsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketAnalyticsConfigurationRequest
     * @return Result of the DeleteBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketAnalyticsConfiguration
     */
    default DeleteBucketAnalyticsConfigurationResponse deleteBucketAnalyticsConfiguration(
            DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketAnalyticsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketAnalyticsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link DeleteBucketAnalyticsConfigurationRequest#builder()}
     * </p>
     *
     * @param deleteBucketAnalyticsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketAnalyticsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the DeleteBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketAnalyticsConfiguration
     */
    default DeleteBucketAnalyticsConfigurationResponse deleteBucketAnalyticsConfiguration(
            Consumer<DeleteBucketAnalyticsConfigurationRequest.Builder> deleteBucketAnalyticsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketAnalyticsConfiguration(DeleteBucketAnalyticsConfigurationRequest.builder()
                .applyMutation(deleteBucketAnalyticsConfigurationRequest).build());
    }

    /**
     * <p>
     * Deletes the <code>cors</code> configuration information set for the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutBucketCORS</code> action. The bucket
     * owner has this permission by default and can grant this permission to others.
     * </p>
     * <p>
     * For information about <code>cors</code>, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling Cross-Origin Resource Sharing</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketCors.html">PutBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTOPTIONSobject.html">RESTOPTIONSobject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketCorsRequest
     * @return Result of the DeleteBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketCors
     */
    default DeleteBucketCorsResponse deleteBucketCors(DeleteBucketCorsRequest deleteBucketCorsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the <code>cors</code> configuration information set for the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutBucketCORS</code> action. The bucket
     * owner has this permission by default and can grant this permission to others.
     * </p>
     * <p>
     * For information about <code>cors</code>, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling Cross-Origin Resource Sharing</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketCors.html">PutBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTOPTIONSobject.html">RESTOPTIONSobject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketCorsRequest.Builder} avoiding the need
     * to create one manually via {@link DeleteBucketCorsRequest#builder()}
     * </p>
     *
     * @param deleteBucketCorsRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketCorsRequest.Builder} to create a request.
     * @return Result of the DeleteBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketCors
     */
    default DeleteBucketCorsResponse deleteBucketCors(Consumer<DeleteBucketCorsRequest.Builder> deleteBucketCorsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketCors(DeleteBucketCorsRequest.builder().applyMutation(deleteBucketCorsRequest).build());
    }

    /**
     * <p>
     * This implementation of the DELETE action removes default encryption from the bucket. For information about the
     * Amazon S3 default encryption feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutEncryptionConfiguration</code>
     * action. The bucket owner has this permission by default. The bucket owner can grant this permission to others.
     * For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketEncryption.html">PutBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketEncryption.html">GetBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketEncryptionRequest
     * @return Result of the DeleteBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketEncryption
     */
    default DeleteBucketEncryptionResponse deleteBucketEncryption(DeleteBucketEncryptionRequest deleteBucketEncryptionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the DELETE action removes default encryption from the bucket. For information about the
     * Amazon S3 default encryption feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutEncryptionConfiguration</code>
     * action. The bucket owner has this permission by default. The bucket owner can grant this permission to others.
     * For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketEncryption.html">PutBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketEncryption.html">GetBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketEncryptionRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteBucketEncryptionRequest#builder()}
     * </p>
     *
     * @param deleteBucketEncryptionRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketEncryptionRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketEncryption
     */
    default DeleteBucketEncryptionResponse deleteBucketEncryption(
            Consumer<DeleteBucketEncryptionRequest.Builder> deleteBucketEncryptionRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteBucketEncryption(DeleteBucketEncryptionRequest.builder().applyMutation(deleteBucketEncryptionRequest)
                .build());
    }

    /**
     * <p>
     * Deletes the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>DeleteBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketIntelligentTieringConfigurationRequest
     * @return Result of the DeleteBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketIntelligentTieringConfiguration
     */
    default DeleteBucketIntelligentTieringConfigurationResponse deleteBucketIntelligentTieringConfiguration(
            DeleteBucketIntelligentTieringConfigurationRequest deleteBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>DeleteBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the
     * {@link DeleteBucketIntelligentTieringConfigurationRequest.Builder} avoiding the need to create one manually via
     * {@link DeleteBucketIntelligentTieringConfigurationRequest#builder()}
     * </p>
     *
     * @param deleteBucketIntelligentTieringConfigurationRequest
     *        A {@link Consumer} that will call methods on
     *        {@link DeleteBucketIntelligentTieringConfigurationRequest.Builder} to create a request.
     * @return Result of the DeleteBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketIntelligentTieringConfiguration
     */
    default DeleteBucketIntelligentTieringConfigurationResponse deleteBucketIntelligentTieringConfiguration(
            Consumer<DeleteBucketIntelligentTieringConfigurationRequest.Builder> deleteBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketIntelligentTieringConfiguration(DeleteBucketIntelligentTieringConfigurationRequest.builder()
                .applyMutation(deleteBucketIntelligentTieringConfigurationRequest).build());
    }

    /**
     * <p>
     * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutInventoryConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>.
     * </p>
     * <p>
     * Operations related to <code>DeleteBucketInventoryConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketInventoryConfigurationRequest
     * @return Result of the DeleteBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketInventoryConfiguration
     */
    default DeleteBucketInventoryConfigurationResponse deleteBucketInventoryConfiguration(
            DeleteBucketInventoryConfigurationRequest deleteBucketInventoryConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutInventoryConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>.
     * </p>
     * <p>
     * Operations related to <code>DeleteBucketInventoryConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketInventoryConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link DeleteBucketInventoryConfigurationRequest#builder()}
     * </p>
     *
     * @param deleteBucketInventoryConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketInventoryConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the DeleteBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketInventoryConfiguration
     */
    default DeleteBucketInventoryConfigurationResponse deleteBucketInventoryConfiguration(
            Consumer<DeleteBucketInventoryConfigurationRequest.Builder> deleteBucketInventoryConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketInventoryConfiguration(DeleteBucketInventoryConfigurationRequest.builder()
                .applyMutation(deleteBucketInventoryConfigurationRequest).build());
    }

    /**
     * <p>
     * Deletes the lifecycle configuration from the specified bucket. Amazon S3 removes all the lifecycle configuration
     * rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 no longer
     * automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutLifecycleConfiguration</code> action.
     * By default, the bucket owner has this permission and the bucket owner can grant this permission to others.
     * </p>
     * <p>
     * There is usually some time lag before lifecycle configuration deletion is fully propagated to all the Amazon S3
     * systems.
     * </p>
     * <p>
     * For more information about the object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketLifecycleRequest
     * @return Result of the DeleteBucketLifecycle operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketLifecycle
     */
    default DeleteBucketLifecycleResponse deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the lifecycle configuration from the specified bucket. Amazon S3 removes all the lifecycle configuration
     * rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 no longer
     * automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutLifecycleConfiguration</code> action.
     * By default, the bucket owner has this permission and the bucket owner can grant this permission to others.
     * </p>
     * <p>
     * There is usually some time lag before lifecycle configuration deletion is fully propagated to all the Amazon S3
     * systems.
     * </p>
     * <p>
     * For more information about the object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketLifecycleRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteBucketLifecycleRequest#builder()}
     * </p>
     *
     * @param deleteBucketLifecycleRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketLifecycleRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketLifecycle operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketLifecycle
     */
    default DeleteBucketLifecycleResponse deleteBucketLifecycle(
            Consumer<DeleteBucketLifecycleRequest.Builder> deleteBucketLifecycleRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteBucketLifecycle(DeleteBucketLifecycleRequest.builder().applyMutation(deleteBucketLifecycleRequest).build());
    }

    /**
     * <p>
     * Deletes a metrics configuration for the Amazon CloudWatch request metrics (specified by the metrics configuration
     * ID) from the bucket. Note that this doesn't include the daily storage metrics.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with
     * Amazon CloudWatch</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketMetricsConfigurationRequest
     * @return Result of the DeleteBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketMetricsConfiguration
     */
    default DeleteBucketMetricsConfigurationResponse deleteBucketMetricsConfiguration(
            DeleteBucketMetricsConfigurationRequest deleteBucketMetricsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes a metrics configuration for the Amazon CloudWatch request metrics (specified by the metrics configuration
     * ID) from the bucket. Note that this doesn't include the daily storage metrics.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with
     * Amazon CloudWatch</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketMetricsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link DeleteBucketMetricsConfigurationRequest#builder()}
     * </p>
     *
     * @param deleteBucketMetricsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketMetricsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the DeleteBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketMetricsConfiguration
     */
    default DeleteBucketMetricsConfigurationResponse deleteBucketMetricsConfiguration(
            Consumer<DeleteBucketMetricsConfigurationRequest.Builder> deleteBucketMetricsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketMetricsConfiguration(DeleteBucketMetricsConfigurationRequest.builder()
                .applyMutation(deleteBucketMetricsConfigurationRequest).build());
    }

    /**
     * <p>
     * Removes <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have the
     * <code>s3:PutBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html">Using Object Ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketOwnershipControlsRequest
     * @return Result of the DeleteBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketOwnershipControls
     */
    default DeleteBucketOwnershipControlsResponse deleteBucketOwnershipControls(
            DeleteBucketOwnershipControlsRequest deleteBucketOwnershipControlsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Removes <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have the
     * <code>s3:PutBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html">Using Object Ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketOwnershipControlsRequest.Builder}
     * avoiding the need to create one manually via {@link DeleteBucketOwnershipControlsRequest#builder()}
     * </p>
     *
     * @param deleteBucketOwnershipControlsRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketOwnershipControlsRequest.Builder} to
     *        create a request.
     * @return Result of the DeleteBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketOwnershipControls
     */
    default DeleteBucketOwnershipControlsResponse deleteBucketOwnershipControls(
            Consumer<DeleteBucketOwnershipControlsRequest.Builder> deleteBucketOwnershipControlsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketOwnershipControls(DeleteBucketOwnershipControlsRequest.builder()
                .applyMutation(deleteBucketOwnershipControlsRequest).build());
    }

    /**
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified bucket.
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket,
     * the calling identity must have the <code>DeleteBucketPolicy</code> permissions on the specified bucket and belong
     * to the bucket owner's account to use this operation.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and
     * UserPolicies</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketPolicy</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketPolicyRequest
     * @return Result of the DeleteBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketPolicy
     */
    default DeleteBucketPolicyResponse deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified bucket.
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket,
     * the calling identity must have the <code>DeleteBucketPolicy</code> permissions on the specified bucket and belong
     * to the bucket owner's account to use this operation.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and
     * UserPolicies</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketPolicy</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketPolicyRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteBucketPolicyRequest#builder()}
     * </p>
     *
     * @param deleteBucketPolicyRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketPolicyRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketPolicy
     */
    default DeleteBucketPolicyResponse deleteBucketPolicy(Consumer<DeleteBucketPolicyRequest.Builder> deleteBucketPolicyRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteBucketPolicy(DeleteBucketPolicyRequest.builder().applyMutation(deleteBucketPolicyRequest).build());
    }

    /**
     * <p>
     * Deletes the replication configuration from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutReplicationConfiguration</code>
     * action. The bucket owner has these permissions by default and can grant it to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <note>
     * <p>
     * It can take a while for the deletion of a replication configuration to fully propagate.
     * </p>
     * </note>
     * <p>
     * For information about replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketReplicationRequest
     * @return Result of the DeleteBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketReplication
     */
    default DeleteBucketReplicationResponse deleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the replication configuration from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutReplicationConfiguration</code>
     * action. The bucket owner has these permissions by default and can grant it to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <note>
     * <p>
     * It can take a while for the deletion of a replication configuration to fully propagate.
     * </p>
     * </note>
     * <p>
     * For information about replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketReplicationRequest.Builder} avoiding
     * the need to create one manually via {@link DeleteBucketReplicationRequest#builder()}
     * </p>
     *
     * @param deleteBucketReplicationRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketReplicationRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketReplication
     */
    default DeleteBucketReplicationResponse deleteBucketReplication(
            Consumer<DeleteBucketReplicationRequest.Builder> deleteBucketReplicationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteBucketReplication(DeleteBucketReplicationRequest.builder().applyMutation(deleteBucketReplicationRequest)
                .build());
    }

    /**
     * <p>
     * Deletes the tags from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutBucketTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketTaggingRequest
     * @return Result of the DeleteBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketTagging
     */
    default DeleteBucketTaggingResponse deleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Deletes the tags from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutBucketTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketTaggingRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteBucketTaggingRequest#builder()}
     * </p>
     *
     * @param deleteBucketTaggingRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketTaggingRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketTagging
     */
    default DeleteBucketTaggingResponse deleteBucketTagging(
            Consumer<DeleteBucketTaggingRequest.Builder> deleteBucketTaggingRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteBucketTagging(DeleteBucketTaggingRequest.builder().applyMutation(deleteBucketTaggingRequest).build());
    }

    /**
     * <p>
     * This action removes the website configuration for a bucket. Amazon S3 returns a <code>200 OK</code> response upon
     * successfully deleting a website configuration on the specified bucket. You will get a <code>200 OK</code>
     * response if the website configuration you are trying to delete does not exist on the bucket. Amazon S3 returns a
     * <code>404</code> response if the bucket specified in the request does not exist.
     * </p>
     * <p>
     * This DELETE action requires the <code>S3:DeleteBucketWebsite</code> permission. By default, only the bucket owner
     * can delete the website configuration attached to a bucket. However, bucket owners can grant other users
     * permission to delete the website configuration by writing a bucket policy granting them the
     * <code>S3:DeleteBucketWebsite</code> permission.
     * </p>
     * <p>
     * For more information about hosting websites, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketWebsite</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketWebsite.html">GetBucketWebsite</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketWebsite.html">PutBucketWebsite</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteBucketWebsiteRequest
     * @return Result of the DeleteBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketWebsite
     */
    default DeleteBucketWebsiteResponse deleteBucketWebsite(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action removes the website configuration for a bucket. Amazon S3 returns a <code>200 OK</code> response upon
     * successfully deleting a website configuration on the specified bucket. You will get a <code>200 OK</code>
     * response if the website configuration you are trying to delete does not exist on the bucket. Amazon S3 returns a
     * <code>404</code> response if the bucket specified in the request does not exist.
     * </p>
     * <p>
     * This DELETE action requires the <code>S3:DeleteBucketWebsite</code> permission. By default, only the bucket owner
     * can delete the website configuration attached to a bucket. However, bucket owners can grant other users
     * permission to delete the website configuration by writing a bucket policy granting them the
     * <code>S3:DeleteBucketWebsite</code> permission.
     * </p>
     * <p>
     * For more information about hosting websites, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketWebsite</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketWebsite.html">GetBucketWebsite</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketWebsite.html">PutBucketWebsite</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteBucketWebsiteRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteBucketWebsiteRequest#builder()}
     * </p>
     *
     * @param deleteBucketWebsiteRequest
     *        A {@link Consumer} that will call methods on {@link DeleteBucketWebsiteRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteBucketWebsite
     */
    default DeleteBucketWebsiteResponse deleteBucketWebsite(
            Consumer<DeleteBucketWebsiteRequest.Builder> deleteBucketWebsiteRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteBucketWebsite(DeleteBucketWebsiteRequest.builder().applyMutation(deleteBucketWebsiteRequest).build());
    }

    /**
     * <p>
     * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest
     * version of the object. If there isn't a null version, Amazon S3 does not remove any objects but will still
     * respond that the command was successful.
     * </p>
     * <p>
     * To remove a specific version, you must be the bucket owner and you must use the version Id subresource. Using
     * this subresource permanently deletes the version. If the object deleted is a delete marker, Amazon S3 sets the
     * response header, <code>x-amz-delete-marker</code>, to true.
     * </p>
     * <p>
     * If the object you want to delete is in a bucket where the bucket versioning configuration is MFA Delete enabled,
     * you must include the <code>x-amz-mfa</code> request header in the DELETE <code>versionId</code> request. Requests
     * that include <code>x-amz-mfa</code> must use HTTPS.
     * </p>
     * <p>
     * For more information about MFA Delete, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMFADelete.html">Using MFA Delete</a>. To see sample
     * requests that use versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectDELETE.html#ExampleVersionObjectDelete">Sample
     * Request</a>.
     * </p>
     * <p>
     * You can delete objects by explicitly calling DELETE Object or configure its lifecycle (<a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>) to
     * enable Amazon S3 to remove them for you. If you want to block users or accounts from removing or deleting objects
     * from your bucket, you must deny them the <code>s3:DeleteObject</code>, <code>s3:DeleteObjectVersion</code>, and
     * <code>s3:PutLifeCycleConfiguration</code> actions.
     * </p>
     * <p>
     * The following action is related to <code>DeleteObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObject
     */
    default DeleteObjectResponse deleteObject(DeleteObjectRequest deleteObjectRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest
     * version of the object. If there isn't a null version, Amazon S3 does not remove any objects but will still
     * respond that the command was successful.
     * </p>
     * <p>
     * To remove a specific version, you must be the bucket owner and you must use the version Id subresource. Using
     * this subresource permanently deletes the version. If the object deleted is a delete marker, Amazon S3 sets the
     * response header, <code>x-amz-delete-marker</code>, to true.
     * </p>
     * <p>
     * If the object you want to delete is in a bucket where the bucket versioning configuration is MFA Delete enabled,
     * you must include the <code>x-amz-mfa</code> request header in the DELETE <code>versionId</code> request. Requests
     * that include <code>x-amz-mfa</code> must use HTTPS.
     * </p>
     * <p>
     * For more information about MFA Delete, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMFADelete.html">Using MFA Delete</a>. To see sample
     * requests that use versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectDELETE.html#ExampleVersionObjectDelete">Sample
     * Request</a>.
     * </p>
     * <p>
     * You can delete objects by explicitly calling DELETE Object or configure its lifecycle (<a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>) to
     * enable Amazon S3 to remove them for you. If you want to block users or accounts from removing or deleting objects
     * from your bucket, you must deny them the <code>s3:DeleteObject</code>, <code>s3:DeleteObjectVersion</code>, and
     * <code>s3:PutLifeCycleConfiguration</code> actions.
     * </p>
     * <p>
     * The following action is related to <code>DeleteObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteObjectRequest.Builder} avoiding the need to
     * create one manually via {@link DeleteObjectRequest#builder()}
     * </p>
     *
     * @param deleteObjectRequest
     *        A {@link Consumer} that will call methods on {@link DeleteObjectRequest.Builder} to create a request.
     * @return Result of the DeleteObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObject
     */
    default DeleteObjectResponse deleteObject(Consumer<DeleteObjectRequest.Builder> deleteObjectRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteObject(DeleteObjectRequest.builder().applyMutation(deleteObjectRequest).build());
    }

    /**
     * <p>
     * Removes the entire tag set from the specified object. For more information about managing object tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html"> Object Tagging</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:DeleteObjectTagging</code> action.
     * </p>
     * <p>
     * To delete tags of a specific object version, add the <code>versionId</code> query parameter in the request. You
     * will need permission for the <code>s3:DeleteObjectVersionTagging</code> action.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html">PutObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteObjectTaggingRequest
     * @return Result of the DeleteObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObjectTagging
     */
    default DeleteObjectTaggingResponse deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Removes the entire tag set from the specified object. For more information about managing object tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html"> Object Tagging</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:DeleteObjectTagging</code> action.
     * </p>
     * <p>
     * To delete tags of a specific object version, add the <code>versionId</code> query parameter in the request. You
     * will need permission for the <code>s3:DeleteObjectVersionTagging</code> action.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html">PutObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteObjectTaggingRequest.Builder} avoiding the
     * need to create one manually via {@link DeleteObjectTaggingRequest#builder()}
     * </p>
     *
     * @param deleteObjectTaggingRequest
     *        A {@link Consumer} that will call methods on {@link DeleteObjectTaggingRequest.Builder} to create a
     *        request.
     * @return Result of the DeleteObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObjectTagging
     */
    default DeleteObjectTaggingResponse deleteObjectTagging(
            Consumer<DeleteObjectTaggingRequest.Builder> deleteObjectTaggingRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deleteObjectTagging(DeleteObjectTaggingRequest.builder().applyMutation(deleteObjectTaggingRequest).build());
    }

    /**
     * <p>
     * This action enables you to delete multiple objects from a bucket using a single HTTP request. If you know the
     * object keys that you want to delete, then this action provides a suitable alternative to sending individual
     * delete requests, reducing per-request overhead.
     * </p>
     * <p>
     * The request contains a list of up to 1000 keys that you want to delete. In the XML, you provide the object key
     * names, and optionally, version IDs if you want to delete a specific version of the object from a
     * versioning-enabled bucket. For each key, Amazon S3 performs a delete action and returns the result of that
     * delete, success, or failure, in the response. Note that if the object specified in the request is not found,
     * Amazon S3 returns the result as deleted.
     * </p>
     * <p>
     * The action supports two modes for the response: verbose and quiet. By default, the action uses verbose mode in
     * which the response includes the result of deletion of each key in your request. In quiet mode the response
     * includes only keys where the delete action encountered an error. For a successful deletion, the action does not
     * return any information about the delete in the response body.
     * </p>
     * <p>
     * When performing this action on an MFA Delete enabled bucket, that attempts to delete any versioned objects, you
     * must include an MFA token. If you do not provide one, the entire request will fail, even if there are
     * non-versioned objects you are trying to delete. If you provide an invalid token, whether there are versioned keys
     * in the request or not, the entire Multi-Object Delete request will fail. For information about MFA Delete, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html#MultiFactorAuthenticationDelete"> MFA
     * Delete</a>.
     * </p>
     * <p>
     * Finally, the Content-MD5 header is required for all Multi-Object Delete requests. Amazon S3 uses the header value
     * to ensure that your request body has not been altered in transit.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteObjects</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deleteObjectsRequest
     * @return Result of the DeleteObjects operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObjects
     */
    default DeleteObjectsResponse deleteObjects(DeleteObjectsRequest deleteObjectsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action enables you to delete multiple objects from a bucket using a single HTTP request. If you know the
     * object keys that you want to delete, then this action provides a suitable alternative to sending individual
     * delete requests, reducing per-request overhead.
     * </p>
     * <p>
     * The request contains a list of up to 1000 keys that you want to delete. In the XML, you provide the object key
     * names, and optionally, version IDs if you want to delete a specific version of the object from a
     * versioning-enabled bucket. For each key, Amazon S3 performs a delete action and returns the result of that
     * delete, success, or failure, in the response. Note that if the object specified in the request is not found,
     * Amazon S3 returns the result as deleted.
     * </p>
     * <p>
     * The action supports two modes for the response: verbose and quiet. By default, the action uses verbose mode in
     * which the response includes the result of deletion of each key in your request. In quiet mode the response
     * includes only keys where the delete action encountered an error. For a successful deletion, the action does not
     * return any information about the delete in the response body.
     * </p>
     * <p>
     * When performing this action on an MFA Delete enabled bucket, that attempts to delete any versioned objects, you
     * must include an MFA token. If you do not provide one, the entire request will fail, even if there are
     * non-versioned objects you are trying to delete. If you provide an invalid token, whether there are versioned keys
     * in the request or not, the entire Multi-Object Delete request will fail. For information about MFA Delete, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html#MultiFactorAuthenticationDelete"> MFA
     * Delete</a>.
     * </p>
     * <p>
     * Finally, the Content-MD5 header is required for all Multi-Object Delete requests. Amazon S3 uses the header value
     * to ensure that your request body has not been altered in transit.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteObjects</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeleteObjectsRequest.Builder} avoiding the need to
     * create one manually via {@link DeleteObjectsRequest#builder()}
     * </p>
     *
     * @param deleteObjectsRequest
     *        A {@link Consumer} that will call methods on {@link DeleteObjectsRequest.Builder} to create a request.
     * @return Result of the DeleteObjects operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeleteObjects
     */
    default DeleteObjectsResponse deleteObjects(Consumer<DeleteObjectsRequest.Builder> deleteObjectsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return deleteObjects(DeleteObjectsRequest.builder().applyMutation(deleteObjectsRequest).build());
    }

    /**
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this operation, you must
     * have the <code>s3:PutBucketPublicAccessBlock</code> permission. For more information about permissions, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeletePublicAccessBlock</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicyStatus.html">GetBucketPolicyStatus</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param deletePublicAccessBlockRequest
     * @return Result of the DeletePublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeletePublicAccessBlock
     */
    default DeletePublicAccessBlockResponse deletePublicAccessBlock(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this operation, you must
     * have the <code>s3:PutBucketPublicAccessBlock</code> permission. For more information about permissions, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following operations are related to <code>DeletePublicAccessBlock</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicyStatus.html">GetBucketPolicyStatus</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link DeletePublicAccessBlockRequest.Builder} avoiding
     * the need to create one manually via {@link DeletePublicAccessBlockRequest#builder()}
     * </p>
     *
     * @param deletePublicAccessBlockRequest
     *        A {@link Consumer} that will call methods on {@link DeletePublicAccessBlockRequest.Builder} to create a
     *        request.
     * @return Result of the DeletePublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.DeletePublicAccessBlock
     */
    default DeletePublicAccessBlockResponse deletePublicAccessBlock(
            Consumer<DeletePublicAccessBlockRequest.Builder> deletePublicAccessBlockRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return deletePublicAccessBlock(DeletePublicAccessBlockRequest.builder().applyMutation(deletePublicAccessBlockRequest)
                .build());
    }

    /**
     * <p>
     * This implementation of the GET action uses the <code>accelerate</code> subresource to return the Transfer
     * Acceleration state of a bucket, which is either <code>Enabled</code> or <code>Suspended</code>. Amazon S3
     * Transfer Acceleration is a bucket-level feature that enables you to perform faster data transfers to and from
     * Amazon S3.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetAccelerateConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You set the Transfer Acceleration state of an existing bucket to <code>Enabled</code> or <code>Suspended</code>
     * by using the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAccelerateConfiguration.html">
     * PutBucketAccelerateConfiguration</a> operation.
     * </p>
     * <p>
     * A GET <code>accelerate</code> request does not return a state value for a bucket that has no transfer
     * acceleration state. A bucket has no Transfer Acceleration state if a state has never been set on the bucket.
     * </p>
     * <p>
     * For more information about transfer acceleration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a> in
     * the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAccelerateConfiguration.html">
     * PutBucketAccelerateConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketAccelerateConfigurationRequest
     * @return Result of the GetBucketAccelerateConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAccelerateConfiguration
     */
    default GetBucketAccelerateConfigurationResponse getBucketAccelerateConfiguration(
            GetBucketAccelerateConfigurationRequest getBucketAccelerateConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the GET action uses the <code>accelerate</code> subresource to return the Transfer
     * Acceleration state of a bucket, which is either <code>Enabled</code> or <code>Suspended</code>. Amazon S3
     * Transfer Acceleration is a bucket-level feature that enables you to perform faster data transfers to and from
     * Amazon S3.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetAccelerateConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You set the Transfer Acceleration state of an existing bucket to <code>Enabled</code> or <code>Suspended</code>
     * by using the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAccelerateConfiguration.html">
     * PutBucketAccelerateConfiguration</a> operation.
     * </p>
     * <p>
     * A GET <code>accelerate</code> request does not return a state value for a bucket that has no transfer
     * acceleration state. A bucket has no Transfer Acceleration state if a state has never been set on the bucket.
     * </p>
     * <p>
     * For more information about transfer acceleration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a> in
     * the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAccelerateConfiguration.html">
     * PutBucketAccelerateConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketAccelerateConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketAccelerateConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketAccelerateConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketAccelerateConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketAccelerateConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAccelerateConfiguration
     */
    default GetBucketAccelerateConfigurationResponse getBucketAccelerateConfiguration(
            Consumer<GetBucketAccelerateConfigurationRequest.Builder> getBucketAccelerateConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketAccelerateConfiguration(GetBucketAccelerateConfigurationRequest.builder()
                .applyMutation(getBucketAccelerateConfigurationRequest).build());
    }

    /**
     * <p>
     * This implementation of the <code>GET</code> action uses the <code>acl</code> subresource to return the access
     * control list (ACL) of a bucket. To use <code>GET</code> to return the ACL of the bucket, you must have
     * <code>READ_ACP</code> access to the bucket. If <code>READ_ACP</code> permission is granted to the anonymous user,
     * you can return the ACL of the bucket without using an authorization header.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, requests to read ACLs are still
     * supported and return the <code>bucket-owner-full-control</code> ACL with the owner being the account that created
     * the bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling object
     * ownership and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketAclRequest
     * @return Result of the GetBucketAcl operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAcl
     */
    default GetBucketAclResponse getBucketAcl(GetBucketAclRequest getBucketAclRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the <code>GET</code> action uses the <code>acl</code> subresource to return the access
     * control list (ACL) of a bucket. To use <code>GET</code> to return the ACL of the bucket, you must have
     * <code>READ_ACP</code> access to the bucket. If <code>READ_ACP</code> permission is granted to the anonymous user,
     * you can return the ACL of the bucket without using an authorization header.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, requests to read ACLs are still
     * supported and return the <code>bucket-owner-full-control</code> ACL with the owner being the account that created
     * the bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling object
     * ownership and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketAclRequest.Builder} avoiding the need to
     * create one manually via {@link GetBucketAclRequest#builder()}
     * </p>
     *
     * @param getBucketAclRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketAclRequest.Builder} to create a request.
     * @return Result of the GetBucketAcl operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAcl
     */
    default GetBucketAclResponse getBucketAcl(Consumer<GetBucketAclRequest.Builder> getBucketAclRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketAcl(GetBucketAclRequest.builder().applyMutation(getBucketAclRequest).build());
    }

    /**
     * <p>
     * This implementation of the GET action returns an analytics configuration (identified by the analytics
     * configuration ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For information about Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketAnalyticsConfigurationRequest
     * @return Result of the GetBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAnalyticsConfiguration
     */
    default GetBucketAnalyticsConfigurationResponse getBucketAnalyticsConfiguration(
            GetBucketAnalyticsConfigurationRequest getBucketAnalyticsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the GET action returns an analytics configuration (identified by the analytics
     * configuration ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For information about Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketAnalyticsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketAnalyticsConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketAnalyticsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketAnalyticsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketAnalyticsConfiguration
     */
    default GetBucketAnalyticsConfigurationResponse getBucketAnalyticsConfiguration(
            Consumer<GetBucketAnalyticsConfigurationRequest.Builder> getBucketAnalyticsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketAnalyticsConfiguration(GetBucketAnalyticsConfigurationRequest.builder()
                .applyMutation(getBucketAnalyticsConfigurationRequest).build());
    }

    /**
     * <p>
     * Returns the Cross-Origin Resource Sharing (CORS) configuration information set for the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetBucketCORS</code> action. By default,
     * the bucket owner has this permission and can grant it to others.
     * </p>
     * <p>
     * For more information about CORS, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">
     * Enabling Cross-Origin Resource Sharing</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketCors</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketCors.html">PutBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketCors.html">DeleteBucketCors</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketCorsRequest
     * @return Result of the GetBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketCors
     */
    default GetBucketCorsResponse getBucketCors(GetBucketCorsRequest getBucketCorsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the Cross-Origin Resource Sharing (CORS) configuration information set for the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetBucketCORS</code> action. By default,
     * the bucket owner has this permission and can grant it to others.
     * </p>
     * <p>
     * For more information about CORS, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">
     * Enabling Cross-Origin Resource Sharing</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketCors</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketCors.html">PutBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketCors.html">DeleteBucketCors</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketCorsRequest.Builder} avoiding the need to
     * create one manually via {@link GetBucketCorsRequest#builder()}
     * </p>
     *
     * @param getBucketCorsRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketCorsRequest.Builder} to create a request.
     * @return Result of the GetBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketCors
     */
    default GetBucketCorsResponse getBucketCors(Consumer<GetBucketCorsRequest.Builder> getBucketCorsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketCors(GetBucketCorsRequest.builder().applyMutation(getBucketCorsRequest).build());
    }

    /**
     * <p>
     * Returns the default encryption configuration for an Amazon S3 bucket. If the bucket does not have a default
     * encryption configuration, GetBucketEncryption returns <code>ServerSideEncryptionConfigurationNotFoundError</code>
     * .
     * </p>
     * <p>
     * For information about the Amazon S3 default encryption feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket
     * Encryption</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetEncryptionConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketEncryption</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketEncryption.html">PutBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketEncryption.html">DeleteBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketEncryptionRequest
     * @return Result of the GetBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketEncryption
     */
    default GetBucketEncryptionResponse getBucketEncryption(GetBucketEncryptionRequest getBucketEncryptionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the default encryption configuration for an Amazon S3 bucket. If the bucket does not have a default
     * encryption configuration, GetBucketEncryption returns <code>ServerSideEncryptionConfigurationNotFoundError</code>
     * .
     * </p>
     * <p>
     * For information about the Amazon S3 default encryption feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket
     * Encryption</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetEncryptionConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketEncryption</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketEncryption.html">PutBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketEncryption.html">DeleteBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketEncryptionRequest.Builder} avoiding the
     * need to create one manually via {@link GetBucketEncryptionRequest#builder()}
     * </p>
     *
     * @param getBucketEncryptionRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketEncryptionRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketEncryption
     */
    default GetBucketEncryptionResponse getBucketEncryption(
            Consumer<GetBucketEncryptionRequest.Builder> getBucketEncryptionRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketEncryption(GetBucketEncryptionRequest.builder().applyMutation(getBucketEncryptionRequest).build());
    }

    /**
     * <p>
     * Gets the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>GetBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketIntelligentTieringConfigurationRequest
     * @return Result of the GetBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketIntelligentTieringConfiguration
     */
    default GetBucketIntelligentTieringConfigurationResponse getBucketIntelligentTieringConfiguration(
            GetBucketIntelligentTieringConfigurationRequest getBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Gets the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>GetBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the
     * {@link GetBucketIntelligentTieringConfigurationRequest.Builder} avoiding the need to create one manually via
     * {@link GetBucketIntelligentTieringConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketIntelligentTieringConfigurationRequest
     *        A {@link Consumer} that will call methods on
     *        {@link GetBucketIntelligentTieringConfigurationRequest.Builder} to create a request.
     * @return Result of the GetBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketIntelligentTieringConfiguration
     */
    default GetBucketIntelligentTieringConfigurationResponse getBucketIntelligentTieringConfiguration(
            Consumer<GetBucketIntelligentTieringConfigurationRequest.Builder> getBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketIntelligentTieringConfiguration(GetBucketIntelligentTieringConfigurationRequest.builder()
                .applyMutation(getBucketIntelligentTieringConfigurationRequest).build());
    }

    /**
     * <p>
     * Returns an inventory configuration (identified by the inventory configuration ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetInventoryConfiguration</code> action.
     * The bucket owner has this permission by default and can grant this permission to others. For more information
     * about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketInventoryConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketInventoryConfigurationRequest
     * @return Result of the GetBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketInventoryConfiguration
     */
    default GetBucketInventoryConfigurationResponse getBucketInventoryConfiguration(
            GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns an inventory configuration (identified by the inventory configuration ID) from the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetInventoryConfiguration</code> action.
     * The bucket owner has this permission by default and can grant this permission to others. For more information
     * about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketInventoryConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketInventoryConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketInventoryConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketInventoryConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketInventoryConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketInventoryConfiguration
     */
    default GetBucketInventoryConfigurationResponse getBucketInventoryConfiguration(
            Consumer<GetBucketInventoryConfigurationRequest.Builder> getBucketInventoryConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketInventoryConfiguration(GetBucketInventoryConfigurationRequest.builder()
                .applyMutation(getBucketInventoryConfigurationRequest).build());
    }

    /**
     * <note>
     * <p>
     * Bucket lifecycle configuration now supports specifying a lifecycle rule using an object key name prefix, one or
     * more object tags, or a combination of both. Accordingly, this section describes the latest API. The response
     * describes the new filter element that you can use to specify a filter to select a subset of objects to which the
     * rule applies. If you are using a previous version of the lifecycle configuration, it still works. For the earlier
     * action, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycle.html">GetBucketLifecycle</a>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the bucket. For information about lifecycle configuration,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle
     * Management</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetLifecycleConfiguration</code> action.
     * The bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycle.html">GetBucketLifecycle</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketLifecycleConfigurationRequest
     * @return Result of the GetBucketLifecycleConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLifecycleConfiguration
     */
    default GetBucketLifecycleConfigurationResponse getBucketLifecycleConfiguration(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <note>
     * <p>
     * Bucket lifecycle configuration now supports specifying a lifecycle rule using an object key name prefix, one or
     * more object tags, or a combination of both. Accordingly, this section describes the latest API. The response
     * describes the new filter element that you can use to specify a filter to select a subset of objects to which the
     * rule applies. If you are using a previous version of the lifecycle configuration, it still works. For the earlier
     * action, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycle.html">GetBucketLifecycle</a>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the bucket. For information about lifecycle configuration,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle
     * Management</a>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetLifecycleConfiguration</code> action.
     * The bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycle.html">GetBucketLifecycle</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketLifecycleConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketLifecycleConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketLifecycleConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketLifecycleConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketLifecycleConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLifecycleConfiguration
     */
    default GetBucketLifecycleConfigurationResponse getBucketLifecycleConfiguration(
            Consumer<GetBucketLifecycleConfigurationRequest.Builder> getBucketLifecycleConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest.builder()
                .applyMutation(getBucketLifecycleConfigurationRequest).build());
    }

    /**
     * <p>
     * Returns the Region the bucket resides in. You set the bucket's Region using the <code>LocationConstraint</code>
     * request parameter in a <code>CreateBucket</code> request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>.
     * </p>
     * <p>
     * To use this implementation of the operation, you must be the bucket owner.
     * </p>
     * <p>
     * To use this API against an access point, provide the alias of the access point in place of the bucket name.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketLocation</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketLocationRequest
     * @return Result of the GetBucketLocation operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLocation
     */
    default GetBucketLocationResponse getBucketLocation(GetBucketLocationRequest getBucketLocationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the Region the bucket resides in. You set the bucket's Region using the <code>LocationConstraint</code>
     * request parameter in a <code>CreateBucket</code> request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>.
     * </p>
     * <p>
     * To use this implementation of the operation, you must be the bucket owner.
     * </p>
     * <p>
     * To use this API against an access point, provide the alias of the access point in place of the bucket name.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketLocation</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketLocationRequest.Builder} avoiding the need
     * to create one manually via {@link GetBucketLocationRequest#builder()}
     * </p>
     *
     * @param getBucketLocationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketLocationRequest.Builder} to create a request.
     * @return Result of the GetBucketLocation operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLocation
     */
    default GetBucketLocationResponse getBucketLocation(Consumer<GetBucketLocationRequest.Builder> getBucketLocationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketLocation(GetBucketLocationRequest.builder().applyMutation(getBucketLocationRequest).build());
    }

    /**
     * <p>
     * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET,
     * you must be the bucket owner.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketLogging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLogging.html">PutBucketLogging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketLoggingRequest
     * @return Result of the GetBucketLogging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLogging
     */
    default GetBucketLoggingResponse getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET,
     * you must be the bucket owner.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketLogging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLogging.html">PutBucketLogging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketLoggingRequest.Builder} avoiding the need
     * to create one manually via {@link GetBucketLoggingRequest#builder()}
     * </p>
     *
     * @param getBucketLoggingRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketLoggingRequest.Builder} to create a request.
     * @return Result of the GetBucketLogging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketLogging
     */
    default GetBucketLoggingResponse getBucketLogging(Consumer<GetBucketLoggingRequest.Builder> getBucketLoggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketLogging(GetBucketLoggingRequest.builder().applyMutation(getBucketLoggingRequest).build());
    }

    /**
     * <p>
     * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket. Note that this doesn't
     * include the daily storage metrics.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with
     * Amazon CloudWatch</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketMetricsConfigurationRequest
     * @return Result of the GetBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketMetricsConfiguration
     */
    default GetBucketMetricsConfigurationResponse getBucketMetricsConfiguration(
            GetBucketMetricsConfigurationRequest getBucketMetricsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket. Note that this doesn't
     * include the daily storage metrics.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with
     * Amazon CloudWatch</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketMetricsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketMetricsConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketMetricsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketMetricsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketMetricsConfiguration
     */
    default GetBucketMetricsConfigurationResponse getBucketMetricsConfiguration(
            Consumer<GetBucketMetricsConfigurationRequest.Builder> getBucketMetricsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketMetricsConfiguration(GetBucketMetricsConfigurationRequest.builder()
                .applyMutation(getBucketMetricsConfigurationRequest).build());
    }

    /**
     * <p>
     * Returns the notification configuration of a bucket.
     * </p>
     * <p>
     * If notifications are not enabled on the bucket, the action returns an empty
     * <code>NotificationConfiguration</code> element.
     * </p>
     * <p>
     * By default, you must be the bucket owner to read the notification configuration of a bucket. However, the bucket
     * owner can use a bucket policy to grant permission to other users to read this configuration with the
     * <code>s3:GetBucketNotification</code> permission.
     * </p>
     * <p>
     * For more information about setting and reading the notification configuration on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Setting Up Notification of Bucket
     * Events</a>. For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetBucketNotification</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketNotification.html">PutBucketNotification</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketNotificationConfigurationRequest
     * @return Result of the GetBucketNotificationConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketNotificationConfiguration
     */
    default GetBucketNotificationConfigurationResponse getBucketNotificationConfiguration(
            GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the notification configuration of a bucket.
     * </p>
     * <p>
     * If notifications are not enabled on the bucket, the action returns an empty
     * <code>NotificationConfiguration</code> element.
     * </p>
     * <p>
     * By default, you must be the bucket owner to read the notification configuration of a bucket. However, the bucket
     * owner can use a bucket policy to grant permission to other users to read this configuration with the
     * <code>s3:GetBucketNotification</code> permission.
     * </p>
     * <p>
     * For more information about setting and reading the notification configuration on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Setting Up Notification of Bucket
     * Events</a>. For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetBucketNotification</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketNotification.html">PutBucketNotification</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketNotificationConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link GetBucketNotificationConfigurationRequest#builder()}
     * </p>
     *
     * @param getBucketNotificationConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketNotificationConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the GetBucketNotificationConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketNotificationConfiguration
     */
    default GetBucketNotificationConfigurationResponse getBucketNotificationConfiguration(
            Consumer<GetBucketNotificationConfigurationRequest.Builder> getBucketNotificationConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketNotificationConfiguration(GetBucketNotificationConfigurationRequest.builder()
                .applyMutation(getBucketNotificationConfigurationRequest).build());
    }

    /**
     * <p>
     * Retrieves <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have the
     * <code>s3:GetBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html">Specifying permissions in
     * a policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Using Object
     * Ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PutBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketOwnershipControlsRequest
     * @return Result of the GetBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketOwnershipControls
     */
    default GetBucketOwnershipControlsResponse getBucketOwnershipControls(
            GetBucketOwnershipControlsRequest getBucketOwnershipControlsRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have the
     * <code>s3:GetBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html">Specifying permissions in
     * a policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Using Object
     * Ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>PutBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketOwnershipControlsRequest.Builder} avoiding
     * the need to create one manually via {@link GetBucketOwnershipControlsRequest#builder()}
     * </p>
     *
     * @param getBucketOwnershipControlsRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketOwnershipControlsRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketOwnershipControls
     */
    default GetBucketOwnershipControlsResponse getBucketOwnershipControls(
            Consumer<GetBucketOwnershipControlsRequest.Builder> getBucketOwnershipControlsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketOwnershipControls(GetBucketOwnershipControlsRequest.builder()
                .applyMutation(getBucketOwnershipControlsRequest).build());
    }

    /**
     * <p>
     * Returns the policy of a specified bucket. If you are using an identity other than the root user of the Amazon Web
     * Services account that owns the bucket, the calling identity must have the <code>GetBucketPolicy</code>
     * permissions on the specified bucket and belong to the bucket owner's account in order to use this operation.
     * </p>
     * <p>
     * If you don't have <code>GetBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketPolicyRequest
     * @return Result of the GetBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketPolicy
     */
    default GetBucketPolicyResponse getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the policy of a specified bucket. If you are using an identity other than the root user of the Amazon Web
     * Services account that owns the bucket, the calling identity must have the <code>GetBucketPolicy</code>
     * permissions on the specified bucket and belong to the bucket owner's account in order to use this operation.
     * </p>
     * <p>
     * If you don't have <code>GetBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketPolicyRequest.Builder} avoiding the need
     * to create one manually via {@link GetBucketPolicyRequest#builder()}
     * </p>
     *
     * @param getBucketPolicyRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketPolicyRequest.Builder} to create a request.
     * @return Result of the GetBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketPolicy
     */
    default GetBucketPolicyResponse getBucketPolicy(Consumer<GetBucketPolicyRequest.Builder> getBucketPolicyRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketPolicy(GetBucketPolicyRequest.builder().applyMutation(getBucketPolicyRequest).build());
    }

    /**
     * <p>
     * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public. In order to use
     * this operation, you must have the <code>s3:GetBucketPolicyStatus</code> permission. For more information about
     * Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <p>
     * For more information about when Amazon S3 considers a bucket public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketPolicyStatus</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketPolicyStatusRequest
     * @return Result of the GetBucketPolicyStatus operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketPolicyStatus
     */
    default GetBucketPolicyStatusResponse getBucketPolicyStatus(GetBucketPolicyStatusRequest getBucketPolicyStatusRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public. In order to use
     * this operation, you must have the <code>s3:GetBucketPolicyStatus</code> permission. For more information about
     * Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <p>
     * For more information about when Amazon S3 considers a bucket public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketPolicyStatus</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketPolicyStatusRequest.Builder} avoiding the
     * need to create one manually via {@link GetBucketPolicyStatusRequest#builder()}
     * </p>
     *
     * @param getBucketPolicyStatusRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketPolicyStatusRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketPolicyStatus operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketPolicyStatus
     */
    default GetBucketPolicyStatusResponse getBucketPolicyStatus(
            Consumer<GetBucketPolicyStatusRequest.Builder> getBucketPolicyStatusRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketPolicyStatus(GetBucketPolicyStatusRequest.builder().applyMutation(getBucketPolicyStatusRequest).build());
    }

    /**
     * <p>
     * Returns the replication configuration of a bucket.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems.
     * Therefore, a get request soon after put or delete can return a wrong result.
     * </p>
     * </note>
     * <p>
     * For information about replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * This action requires permissions for the <code>s3:GetReplicationConfiguration</code> action. For more information
     * about permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using
     * Bucket Policies and User Policies</a>.
     * </p>
     * <p>
     * If you include the <code>Filter</code> element in a replication configuration, you must also include the
     * <code>DeleteMarkerReplication</code> and <code>Priority</code> elements. The response also returns those
     * elements.
     * </p>
     * <p>
     * For information about <code>GetBucketReplication</code> errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ReplicationErrorCodeList">List of
     * replication-related error codes</a>
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html">DeleteBucketReplication
     * </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketReplicationRequest
     * @return Result of the GetBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketReplication
     */
    default GetBucketReplicationResponse getBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the replication configuration of a bucket.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems.
     * Therefore, a get request soon after put or delete can return a wrong result.
     * </p>
     * </note>
     * <p>
     * For information about replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * This action requires permissions for the <code>s3:GetReplicationConfiguration</code> action. For more information
     * about permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using
     * Bucket Policies and User Policies</a>.
     * </p>
     * <p>
     * If you include the <code>Filter</code> element in a replication configuration, you must also include the
     * <code>DeleteMarkerReplication</code> and <code>Priority</code> elements. The response also returns those
     * elements.
     * </p>
     * <p>
     * For information about <code>GetBucketReplication</code> errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ReplicationErrorCodeList">List of
     * replication-related error codes</a>
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html">DeleteBucketReplication
     * </a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketReplicationRequest.Builder} avoiding the
     * need to create one manually via {@link GetBucketReplicationRequest#builder()}
     * </p>
     *
     * @param getBucketReplicationRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketReplicationRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketReplication
     */
    default GetBucketReplicationResponse getBucketReplication(
            Consumer<GetBucketReplicationRequest.Builder> getBucketReplicationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketReplication(GetBucketReplicationRequest.builder().applyMutation(getBucketReplicationRequest).build());
    }

    /**
     * <p>
     * Returns the request payment configuration of a bucket. To use this version of the operation, you must be the
     * bucket owner. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html">Requester Pays Buckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketRequestPayment</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketRequestPaymentRequest
     * @return Result of the GetBucketRequestPayment operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketRequestPayment
     */
    default GetBucketRequestPaymentResponse getBucketRequestPayment(GetBucketRequestPaymentRequest getBucketRequestPaymentRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the request payment configuration of a bucket. To use this version of the operation, you must be the
     * bucket owner. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html">Requester Pays Buckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketRequestPayment</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketRequestPaymentRequest.Builder} avoiding
     * the need to create one manually via {@link GetBucketRequestPaymentRequest#builder()}
     * </p>
     *
     * @param getBucketRequestPaymentRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketRequestPaymentRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketRequestPayment operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketRequestPayment
     */
    default GetBucketRequestPaymentResponse getBucketRequestPayment(
            Consumer<GetBucketRequestPaymentRequest.Builder> getBucketRequestPaymentRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketRequestPayment(GetBucketRequestPaymentRequest.builder().applyMutation(getBucketRequestPaymentRequest)
                .build());
    }

    /**
     * <p>
     * Returns the tag set associated with the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetBucketTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSet</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketTaggingRequest
     * @return Result of the GetBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketTagging
     */
    default GetBucketTaggingResponse getBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the tag set associated with the bucket.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetBucketTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSet</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketTaggingRequest.Builder} avoiding the need
     * to create one manually via {@link GetBucketTaggingRequest#builder()}
     * </p>
     *
     * @param getBucketTaggingRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketTaggingRequest.Builder} to create a request.
     * @return Result of the GetBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketTagging
     */
    default GetBucketTaggingResponse getBucketTagging(Consumer<GetBucketTaggingRequest.Builder> getBucketTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketTagging(GetBucketTaggingRequest.builder().applyMutation(getBucketTaggingRequest).build());
    }

    /**
     * <p>
     * Returns the versioning state of a bucket.
     * </p>
     * <p>
     * To retrieve the versioning state of a bucket, you must be the bucket owner.
     * </p>
     * <p>
     * This implementation also returns the MFA Delete status of the versioning state. If the MFA Delete status is
     * <code>enabled</code>, the bucket owner must use an authentication device to change the versioning state of the
     * bucket.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketVersioning</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketVersioningRequest
     * @return Result of the GetBucketVersioning operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketVersioning
     */
    default GetBucketVersioningResponse getBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the versioning state of a bucket.
     * </p>
     * <p>
     * To retrieve the versioning state of a bucket, you must be the bucket owner.
     * </p>
     * <p>
     * This implementation also returns the MFA Delete status of the versioning state. If the MFA Delete status is
     * <code>enabled</code>, the bucket owner must use an authentication device to change the versioning state of the
     * bucket.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketVersioning</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketVersioningRequest.Builder} avoiding the
     * need to create one manually via {@link GetBucketVersioningRequest#builder()}
     * </p>
     *
     * @param getBucketVersioningRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketVersioningRequest.Builder} to create a
     *        request.
     * @return Result of the GetBucketVersioning operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketVersioning
     */
    default GetBucketVersioningResponse getBucketVersioning(
            Consumer<GetBucketVersioningRequest.Builder> getBucketVersioningRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getBucketVersioning(GetBucketVersioningRequest.builder().applyMutation(getBucketVersioningRequest).build());
    }

    /**
     * <p>
     * Returns the website configuration for a bucket. To host website on Amazon S3, you can configure a bucket as
     * website by adding a website configuration. For more information about hosting websites, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * This GET action requires the <code>S3:GetBucketWebsite</code> permission. By default, only the bucket owner can
     * read the bucket website configuration. However, bucket owners can allow other users to read the website
     * configuration by writing a bucket policy granting them the <code>S3:GetBucketWebsite</code> permission.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketWebsite</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketWebsite.html">DeleteBucketWebsite</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketWebsite.html">PutBucketWebsite</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getBucketWebsiteRequest
     * @return Result of the GetBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketWebsite
     */
    default GetBucketWebsiteResponse getBucketWebsite(GetBucketWebsiteRequest getBucketWebsiteRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the website configuration for a bucket. To host website on Amazon S3, you can configure a bucket as
     * website by adding a website configuration. For more information about hosting websites, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * This GET action requires the <code>S3:GetBucketWebsite</code> permission. By default, only the bucket owner can
     * read the bucket website configuration. However, bucket owners can allow other users to read the website
     * configuration by writing a bucket policy granting them the <code>S3:GetBucketWebsite</code> permission.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketWebsite</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketWebsite.html">DeleteBucketWebsite</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketWebsite.html">PutBucketWebsite</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetBucketWebsiteRequest.Builder} avoiding the need
     * to create one manually via {@link GetBucketWebsiteRequest#builder()}
     * </p>
     *
     * @param getBucketWebsiteRequest
     *        A {@link Consumer} that will call methods on {@link GetBucketWebsiteRequest.Builder} to create a request.
     * @return Result of the GetBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetBucketWebsite
     */
    default GetBucketWebsiteResponse getBucketWebsite(Consumer<GetBucketWebsiteRequest.Builder> getBucketWebsiteRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getBucketWebsite(GetBucketWebsiteRequest.builder().applyMutation(getBucketWebsiteRequest).build());
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectRequest
     * @param responseTransformer
     *        Functional interface for processing the streamed response content. The unmarshalled GetObjectResponse and
     *        an InputStream to the response content are provided as parameters to the callback. The callback may return
     *        a transformed type which will be the return value of this method. See
     *        {@link software.amazon.awssdk.core.sync.ResponseTransformer} for details on implementing this interface
     *        and for links to pre-canned implementations for common scenarios like downloading to a file. The service
     *        documentation for the response content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     */
    default <ReturnT> ReturnT getObject(GetObjectRequest getObjectRequest,
            ResponseTransformer<GetObjectResponse, ReturnT> responseTransformer) throws NoSuchKeyException,
            InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectRequest.Builder} avoiding the need to
     * create one manually via {@link GetObjectRequest#builder()}
     * </p>
     *
     * @param getObjectRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectRequest.Builder} to create a request.
     * @param responseTransformer
     *        Functional interface for processing the streamed response content. The unmarshalled GetObjectResponse and
     *        an InputStream to the response content are provided as parameters to the callback. The callback may return
     *        a transformed type which will be the return value of this method. See
     *        {@link software.amazon.awssdk.core.sync.ResponseTransformer} for details on implementing this interface
     *        and for links to pre-canned implementations for common scenarios like downloading to a file. The service
     *        documentation for the response content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     */
    default <ReturnT> ReturnT getObject(Consumer<GetObjectRequest.Builder> getObjectRequest,
            ResponseTransformer<GetObjectResponse, ReturnT> responseTransformer) throws NoSuchKeyException,
            InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(GetObjectRequest.builder().applyMutation(getObjectRequest).build(), responseTransformer);
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectRequest
     * @param destinationPath
     *        {@link Path} to file that response contents will be written to. The file must not exist or this method
     *        will throw an exception. If the file is not writable by the current user then an exception will be thrown.
     *        The service documentation for the response content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(GetObjectRequest, ResponseTransformer)
     */
    default GetObjectResponse getObject(GetObjectRequest getObjectRequest, Path destinationPath) throws NoSuchKeyException,
            InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(getObjectRequest, ResponseTransformer.toFile(destinationPath));
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectRequest.Builder} avoiding the need to
     * create one manually via {@link GetObjectRequest#builder()}
     * </p>
     *
     * @param getObjectRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectRequest.Builder} to create a request.
     * @param destinationPath
     *        {@link Path} to file that response contents will be written to. The file must not exist or this method
     *        will throw an exception. If the file is not writable by the current user then an exception will be thrown.
     *        The service documentation for the response content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(GetObjectRequest, ResponseTransformer)
     */
    default GetObjectResponse getObject(Consumer<GetObjectRequest.Builder> getObjectRequest, Path destinationPath)
            throws NoSuchKeyException, InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(GetObjectRequest.builder().applyMutation(getObjectRequest).build(), destinationPath);
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectRequest
     * @return A {@link ResponseInputStream} containing data streamed from service. Note that this is an unmanaged
     *         reference to the underlying HTTP connection so great care must be taken to ensure all data if fully read
     *         from the input stream and that it is properly closed. Failure to do so may result in sub-optimal behavior
     *         and exhausting connections in the connection pool. The unmarshalled response object can be obtained via
     *         {@link ResponseInputStream#response()}. The service documentation for the response content is as follows
     *         '
     *         <p>
     *         Object data.
     *         </p>
     *         '.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(getObject, ResponseTransformer)
     */
    default ResponseInputStream<GetObjectResponse> getObject(GetObjectRequest getObjectRequest) throws NoSuchKeyException,
            InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(getObjectRequest, ResponseTransformer.toInputStream());
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectRequest.Builder} avoiding the need to
     * create one manually via {@link GetObjectRequest#builder()}
     * </p>
     *
     * @param getObjectRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectRequest.Builder} to create a request.
     * @return A {@link ResponseInputStream} containing data streamed from service. Note that this is an unmanaged
     *         reference to the underlying HTTP connection so great care must be taken to ensure all data if fully read
     *         from the input stream and that it is properly closed. Failure to do so may result in sub-optimal behavior
     *         and exhausting connections in the connection pool. The unmarshalled response object can be obtained via
     *         {@link ResponseInputStream#response()}. The service documentation for the response content is as follows
     *         '
     *         <p>
     *         Object data.
     *         </p>
     *         '.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(getObject, ResponseTransformer)
     */
    default ResponseInputStream<GetObjectResponse> getObject(Consumer<GetObjectRequest.Builder> getObjectRequest)
            throws NoSuchKeyException, InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(GetObjectRequest.builder().applyMutation(getObjectRequest).build());
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectRequest
     * @return A {@link ResponseBytes} that loads the data streamed from the service into memory and exposes it in
     *         convenient in-memory representations like a byte buffer or string. The unmarshalled response object can
     *         be obtained via {@link ResponseBytes#response()}. The service documentation for the response content is
     *         as follows '
     *         <p>
     *         Object data.
     *         </p>
     *         '.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(getObject, ResponseTransformer)
     */
    default ResponseBytes<GetObjectResponse> getObjectAsBytes(GetObjectRequest getObjectRequest) throws NoSuchKeyException,
            InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObject(getObjectRequest, ResponseTransformer.toBytes());
    }

    /**
     * <p>
     * Retrieves objects from Amazon S3. To use <code>GET</code>, you must have <code>READ</code> access to the object.
     * If you grant <code>READ</code> access to the anonymous user, you can return the object without using an
     * authorization header.
     * </p>
     * <p>
     * An Amazon S3 bucket has no directory hierarchy such as you would find in a typical computer file system. You can,
     * however, create a logical hierarchy by using object key names that imply a folder structure. For example, instead
     * of naming an object <code>sample.jpg</code>, you can name it <code>photos/2006/February/sample.jpg</code>.
     * </p>
     * <p>
     * To get an object from such a logical hierarchy, specify the full key name for the object in the <code>GET</code>
     * operation. For a virtual hosted-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code>, specify the resource as
     * <code>/photos/2006/February/sample.jpg</code>. For a path-style request example, if you have the object
     * <code>photos/2006/February/sample.jpg</code> in the bucket named <code>examplebucket</code>, specify the resource
     * as <code>/examplebucket/photos/2006/February/sample.jpg</code>. For more information about request types, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingSpecifyBucket">HTTP Host
     * Header Bucket Specification</a>.
     * </p>
     * <p>
     * For more information about returning the ACL of an object, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>.
     * </p>
     * <p>
     * If the object you are retrieving is stored in the S3 Glacier or S3 Glacier Deep Archive storage class, or S3
     * Intelligent-Tiering Archive or S3 Intelligent-Tiering Deep Archive tiers, before you can retrieve the object you
     * must first restore a copy using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_RestoreObject.html">RestoreObject</a>. Otherwise, this
     * action returns an <code>InvalidObjectStateError</code> error. For information about restoring archived objects,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a>.
     * </p>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you GET the object, you must use the following headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <p>
     * Assuming you have the relevant permission to read object tags, the response also returns the
     * <code>x-amz-tagging-count</code> header that provides the count of number of tags associated with the object. You
     * can use <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * to retrieve the tag set associated with an object.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 will return an HTTP status code
     * 404 ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 will return an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, the GET action returns the current version of an object. To return a different version, use the
     * <code>versionId</code> subresource.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you supply a <code>versionId</code>, you need the <code>s3:GetObjectVersion</code> permission to access a
     * specific version of an object. If you request a specific version, you do not need to have the
     * <code>s3:GetObject</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current version of the object is a delete marker, Amazon S3 behaves as if the object was deleted and
     * includes <code>x-amz-delete-marker: true</code> in the response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a>.
     * </p>
     * <p>
     * <b>Overriding Response Header Values</b>
     * </p>
     * <p>
     * There are times when you want to override certain response header values in a GET response. For example, you
     * might override the <code>Content-Disposition</code> response header value in your GET request.
     * </p>
     * <p>
     * You can override values for a set of response headers using the following query parameters. These response header
     * values are sent only on a successful request, that is, when status code 200 OK is returned. The set of headers
     * you can override using these parameters is a subset of the headers that Amazon S3 accepts when you create an
     * object. The response headers that you can override for the GET response are <code>Content-Type</code>,
     * <code>Content-Language</code>, <code>Expires</code>, <code>Cache-Control</code>, <code>Content-Disposition</code>
     * , and <code>Content-Encoding</code>. To override these header values in the GET response, you use the following
     * request parameters.
     * </p>
     * <note>
     * <p>
     * You must sign the request, either using an Authorization header or a presigned URL, when using these parameters.
     * They cannot be used with an unsigned (anonymous) request.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * <code>response-content-type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-language</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-expires</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-cache-control</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-disposition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>response-content-encoding</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Additional Considerations about Request Headers</b>
     * </p>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows: <code>If-Match</code> condition evaluates to <code>true</code>, and; <code>If-Unmodified-Since</code>
     * condition evaluates to <code>false</code>; then, S3 returns 200 OK and the data requested.
     * </p>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows:<code> If-None-Match</code> condition evaluates to <code>false</code>, and;
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>; then, S3 returns 304 Not Modified
     * response code.
     * </p>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectRequest.Builder} avoiding the need to
     * create one manually via {@link GetObjectRequest#builder()}
     * </p>
     *
     * @param getObjectRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectRequest.Builder} to create a request.
     * @return A {@link ResponseBytes} that loads the data streamed from the service into memory and exposes it in
     *         convenient in-memory representations like a byte buffer or string. The unmarshalled response object can
     *         be obtained via {@link ResponseBytes#response()}. The service documentation for the response content is
     *         as follows '
     *         <p>
     *         Object data.
     *         </p>
     *         '.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws InvalidObjectStateException
     *         Object is archived and inaccessible until restored.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObject
     * @see #getObject(getObject, ResponseTransformer)
     */
    default ResponseBytes<GetObjectResponse> getObjectAsBytes(Consumer<GetObjectRequest.Builder> getObjectRequest)
            throws NoSuchKeyException, InvalidObjectStateException, AwsServiceException, SdkClientException, S3Exception {
        return getObjectAsBytes(GetObjectRequest.builder().applyMutation(getObjectRequest).build());
    }

    /**
     * <p>
     * Returns the access control list (ACL) of an object. To use this operation, you must have
     * <code>s3:GetObjectAcl</code> permissions or <code>READ_ACP</code> access to the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#acl-access-policy-permission-mapping"
     * >Mapping of ACL permissions and access policy permissions</a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, GET returns ACL information about the current version of an object. To return ACL information about a
     * different version, use the versionId subresource.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, requests to read ACLs are still
     * supported and return the <code>bucket-owner-full-control</code> ACL with the owner being the account that created
     * the bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling object
     * ownership and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * <p>
     * The following operations are related to <code>GetObjectAcl</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectAclRequest
     * @return Result of the GetObjectAcl operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectAcl
     */
    default GetObjectAclResponse getObjectAcl(GetObjectAclRequest getObjectAclRequest) throws NoSuchKeyException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the access control list (ACL) of an object. To use this operation, you must have
     * <code>s3:GetObjectAcl</code> permissions or <code>READ_ACP</code> access to the object. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#acl-access-policy-permission-mapping"
     * >Mapping of ACL permissions and access policy permissions</a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * By default, GET returns ACL information about the current version of an object. To return ACL information about a
     * different version, use the versionId subresource.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, requests to read ACLs are still
     * supported and return the <code>bucket-owner-full-control</code> ACL with the owner being the account that created
     * the bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling object
     * ownership and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * <p>
     * The following operations are related to <code>GetObjectAcl</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectAclRequest.Builder} avoiding the need to
     * create one manually via {@link GetObjectAclRequest#builder()}
     * </p>
     *
     * @param getObjectAclRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectAclRequest.Builder} to create a request.
     * @return Result of the GetObjectAcl operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectAcl
     */
    default GetObjectAclResponse getObjectAcl(Consumer<GetObjectAclRequest.Builder> getObjectAclRequest)
            throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return getObjectAcl(GetObjectAclRequest.builder().applyMutation(getObjectAclRequest).build());
    }

    /**
     * <p>
     * Retrieves all the metadata from an object without returning the object itself. This action is useful if you're
     * interested only in an object's metadata. To use <code>GetObjectAttributes</code>, you must have READ access to
     * the object.
     * </p>
     * <p>
     * <code>GetObjectAttributes</code> combines the functionality of <code>GetObjectAcl</code>,
     * <code>GetObjectLegalHold</code>, <code>GetObjectLockConfiguration</code>, <code>GetObjectRetention</code>,
     * <code>GetObjectTagging</code>, <code>HeadObject</code>, and <code>ListParts</code>. All of the data returned with
     * each of those individual calls can be returned with a single call to <code>GetObjectAttributes</code>.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you retrieve the metadata from the object, you must use the following
     * headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-algorithm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key-MD5</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Encryption request headers, such as <code>x-amz-server-side-encryption</code>, should not be sent for GET
     * requests if your object uses server-side encryption with Amazon Web Services KMS keys stored in Amazon Web
     * Services Key Management Service (SSE-KMS) or server-side encryption with Amazon S3 managed encryption keys
     * (SSE-S3). If your object does use these types of keys, you'll get an HTTP <code>400 Bad Request</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The last modified property in this case is the creation date of the object.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Consider the following when using request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows, then Amazon S3 returns the HTTP status code <code>200 OK</code> and the data requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-Match</code> condition evaluates to <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Unmodified-Since</code> condition evaluates to <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows, then Amazon S3 returns the HTTP status code <code>304 Not Modified</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-None-Match</code> condition evaluates to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions that you need to use this operation depend on whether the bucket is versioned. If the bucket is
     * versioned, you need both the <code>s3:GetObjectVersion</code> and <code>s3:GetObjectVersionAttributes</code>
     * permissions for this operation. If the bucket is not versioned, you need the <code>s3:GetObject</code> and
     * <code>s3:GetObjectAttributes</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a> in the <i>Amazon S3 User Guide</i>. If the object that you request does not exist, the error Amazon S3
     * returns depends on whether you also have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 returns an HTTP status code
     * <code>404 Not Found</code> ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't have the <code>s3:ListBucket</code> permission, Amazon S3 returns an HTTP status code
     * <code>403 Forbidden</code> ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetObjectAttributes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectLegalHold.html">GetObjectLegalHold</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectLockConfiguration.html">
     * GetObjectLockConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectRetention.html">GetObjectRetention</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html">HeadObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectAttributesRequest
     * @return Result of the GetObjectAttributes operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectAttributes
     */
    default GetObjectAttributesResponse getObjectAttributes(GetObjectAttributesRequest getObjectAttributesRequest)
            throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves all the metadata from an object without returning the object itself. This action is useful if you're
     * interested only in an object's metadata. To use <code>GetObjectAttributes</code>, you must have READ access to
     * the object.
     * </p>
     * <p>
     * <code>GetObjectAttributes</code> combines the functionality of <code>GetObjectAcl</code>,
     * <code>GetObjectLegalHold</code>, <code>GetObjectLockConfiguration</code>, <code>GetObjectRetention</code>,
     * <code>GetObjectTagging</code>, <code>HeadObject</code>, and <code>ListParts</code>. All of the data returned with
     * each of those individual calls can be returned with a single call to <code>GetObjectAttributes</code>.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you retrieve the metadata from the object, you must use the following
     * headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-algorithm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-server-side-encryption-customer-key-MD5</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Encryption request headers, such as <code>x-amz-server-side-encryption</code>, should not be sent for GET
     * requests if your object uses server-side encryption with Amazon Web Services KMS keys stored in Amazon Web
     * Services Key Management Service (SSE-KMS) or server-side encryption with Amazon S3 managed encryption keys
     * (SSE-S3). If your object does use these types of keys, you'll get an HTTP <code>400 Bad Request</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The last modified property in this case is the creation date of the object.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Consider the following when using request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present in the request as
     * follows, then Amazon S3 returns the HTTP status code <code>200 OK</code> and the data requested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-Match</code> condition evaluates to <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Unmodified-Since</code> condition evaluates to <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are present in the request
     * as follows, then Amazon S3 returns the HTTP status code <code>304 Not Modified</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-None-Match</code> condition evaluates to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions that you need to use this operation depend on whether the bucket is versioned. If the bucket is
     * versioned, you need both the <code>s3:GetObjectVersion</code> and <code>s3:GetObjectVersionAttributes</code>
     * permissions for this operation. If the bucket is not versioned, you need the <code>s3:GetObject</code> and
     * <code>s3:GetObjectAttributes</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a> in the <i>Amazon S3 User Guide</i>. If the object that you request does not exist, the error Amazon S3
     * returns depends on whether you also have the <code>s3:ListBucket</code> permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 returns an HTTP status code
     * <code>404 Not Found</code> ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't have the <code>s3:ListBucket</code> permission, Amazon S3 returns an HTTP status code
     * <code>403 Forbidden</code> ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetObjectAttributes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectLegalHold.html">GetObjectLegalHold</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectLockConfiguration.html">
     * GetObjectLockConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectRetention.html">GetObjectRetention</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html">HeadObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectAttributesRequest.Builder} avoiding the
     * need to create one manually via {@link GetObjectAttributesRequest#builder()}
     * </p>
     *
     * @param getObjectAttributesRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectAttributesRequest.Builder} to create a
     *        request.
     * @return Result of the GetObjectAttributes operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectAttributes
     */
    default GetObjectAttributesResponse getObjectAttributes(
            Consumer<GetObjectAttributesRequest.Builder> getObjectAttributesRequest) throws NoSuchKeyException,
            AwsServiceException, SdkClientException, S3Exception {
        return getObjectAttributes(GetObjectAttributesRequest.builder().applyMutation(getObjectAttributesRequest).build());
    }

    /**
     * <p>
     * Gets an object's current legal hold status. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectLegalHold</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectLegalHoldRequest
     * @return Result of the GetObjectLegalHold operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectLegalHold
     */
    default GetObjectLegalHoldResponse getObjectLegalHold(GetObjectLegalHoldRequest getObjectLegalHoldRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Gets an object's current legal hold status. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectLegalHold</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectLegalHoldRequest.Builder} avoiding the
     * need to create one manually via {@link GetObjectLegalHoldRequest#builder()}
     * </p>
     *
     * @param getObjectLegalHoldRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectLegalHoldRequest.Builder} to create a
     *        request.
     * @return Result of the GetObjectLegalHold operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectLegalHold
     */
    default GetObjectLegalHoldResponse getObjectLegalHold(Consumer<GetObjectLegalHoldRequest.Builder> getObjectLegalHoldRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectLegalHold(GetObjectLegalHoldRequest.builder().applyMutation(getObjectLegalHoldRequest).build());
    }

    /**
     * <p>
     * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be
     * applied by default to every new object placed in the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectLockConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectLockConfigurationRequest
     * @return Result of the GetObjectLockConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectLockConfiguration
     */
    default GetObjectLockConfigurationResponse getObjectLockConfiguration(
            GetObjectLockConfigurationRequest getObjectLockConfigurationRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be
     * applied by default to every new object placed in the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectLockConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectLockConfigurationRequest.Builder} avoiding
     * the need to create one manually via {@link GetObjectLockConfigurationRequest#builder()}
     * </p>
     *
     * @param getObjectLockConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectLockConfigurationRequest.Builder} to create a
     *        request.
     * @return Result of the GetObjectLockConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectLockConfiguration
     */
    default GetObjectLockConfigurationResponse getObjectLockConfiguration(
            Consumer<GetObjectLockConfigurationRequest.Builder> getObjectLockConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getObjectLockConfiguration(GetObjectLockConfigurationRequest.builder()
                .applyMutation(getObjectLockConfigurationRequest).build());
    }

    /**
     * <p>
     * Retrieves an object's retention settings. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectRetention</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectRetentionRequest
     * @return Result of the GetObjectRetention operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectRetention
     */
    default GetObjectRetentionResponse getObjectRetention(GetObjectRetentionRequest getObjectRetentionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves an object's retention settings. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectRetention</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectRetentionRequest.Builder} avoiding the
     * need to create one manually via {@link GetObjectRetentionRequest#builder()}
     * </p>
     *
     * @param getObjectRetentionRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectRetentionRequest.Builder} to create a
     *        request.
     * @return Result of the GetObjectRetention operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectRetention
     */
    default GetObjectRetentionResponse getObjectRetention(Consumer<GetObjectRetentionRequest.Builder> getObjectRetentionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectRetention(GetObjectRetentionRequest.builder().applyMutation(getObjectRetentionRequest).build());
    }

    /**
     * <p>
     * Returns the tag-set of an object. You send the GET request against the tagging subresource associated with the
     * object.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetObjectTagging</code> action. By
     * default, the GET action returns information about current version of an object. For a versioned bucket, you can
     * have multiple versions of an object in your bucket. To retrieve tags of any other version, use the versionId
     * query parameter. You also need permission for the <code>s3:GetObjectVersionTagging</code> action.
     * </p>
     * <p>
     * By default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * For information about the Amazon S3 object tagging feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object Tagging</a>.
     * </p>
     * <p>
     * The following actions are related to <code>GetObjectTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html">DeleteObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html">PutObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectTaggingRequest
     * @return Result of the GetObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTagging
     */
    default GetObjectTaggingResponse getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns the tag-set of an object. You send the GET request against the tagging subresource associated with the
     * object.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:GetObjectTagging</code> action. By
     * default, the GET action returns information about current version of an object. For a versioned bucket, you can
     * have multiple versions of an object in your bucket. To retrieve tags of any other version, use the versionId
     * query parameter. You also need permission for the <code>s3:GetObjectVersionTagging</code> action.
     * </p>
     * <p>
     * By default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * For information about the Amazon S3 object tagging feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object Tagging</a>.
     * </p>
     * <p>
     * The following actions are related to <code>GetObjectTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html">DeleteObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObjectTagging.html">PutObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectTaggingRequest.Builder} avoiding the need
     * to create one manually via {@link GetObjectTaggingRequest#builder()}
     * </p>
     *
     * @param getObjectTaggingRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectTaggingRequest.Builder} to create a request.
     * @return Result of the GetObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTagging
     */
    default GetObjectTaggingResponse getObjectTagging(Consumer<GetObjectTaggingRequest.Builder> getObjectTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectTagging(GetObjectTaggingRequest.builder().applyMutation(getObjectTaggingRequest).build());
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectTorrentRequest
     * @param responseTransformer
     *        Functional interface for processing the streamed response content. The unmarshalled
     *        GetObjectTorrentResponse and an InputStream to the response content are provided as parameters to the
     *        callback. The callback may return a transformed type which will be the return value of this method. See
     *        {@link software.amazon.awssdk.core.sync.ResponseTransformer} for details on implementing this interface
     *        and for links to pre-canned implementations for common scenarios like downloading to a file. The service
     *        documentation for the response content is as follows '
     *        <p>
     *        A Bencoded dictionary as defined by the BitTorrent specification
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     */
    default <ReturnT> ReturnT getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest,
            ResponseTransformer<GetObjectTorrentResponse, ReturnT> responseTransformer) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectTorrentRequest.Builder} avoiding the need
     * to create one manually via {@link GetObjectTorrentRequest#builder()}
     * </p>
     *
     * @param getObjectTorrentRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectTorrentRequest.Builder} to create a request.
     * @param responseTransformer
     *        Functional interface for processing the streamed response content. The unmarshalled
     *        GetObjectTorrentResponse and an InputStream to the response content are provided as parameters to the
     *        callback. The callback may return a transformed type which will be the return value of this method. See
     *        {@link software.amazon.awssdk.core.sync.ResponseTransformer} for details on implementing this interface
     *        and for links to pre-canned implementations for common scenarios like downloading to a file. The service
     *        documentation for the response content is as follows '
     *        <p>
     *        A Bencoded dictionary as defined by the BitTorrent specification
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     */
    default <ReturnT> ReturnT getObjectTorrent(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest,
            ResponseTransformer<GetObjectTorrentResponse, ReturnT> responseTransformer) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getObjectTorrent(GetObjectTorrentRequest.builder().applyMutation(getObjectTorrentRequest).build(),
                responseTransformer);
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectTorrentRequest
     * @param destinationPath
     *        {@link Path} to file that response contents will be written to. The file must not exist or this method
     *        will throw an exception. If the file is not writable by the current user then an exception will be thrown.
     *        The service documentation for the response content is as follows '
     *        <p>
     *        A Bencoded dictionary as defined by the BitTorrent specification
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObjectTorrent(GetObjectTorrentRequest, ResponseTransformer)
     */
    default GetObjectTorrentResponse getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest, Path destinationPath)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectTorrent(getObjectTorrentRequest, ResponseTransformer.toFile(destinationPath));
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectTorrentRequest.Builder} avoiding the need
     * to create one manually via {@link GetObjectTorrentRequest#builder()}
     * </p>
     *
     * @param getObjectTorrentRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectTorrentRequest.Builder} to create a request.
     * @param destinationPath
     *        {@link Path} to file that response contents will be written to. The file must not exist or this method
     *        will throw an exception. If the file is not writable by the current user then an exception will be thrown.
     *        The service documentation for the response content is as follows '
     *        <p>
     *        A Bencoded dictionary as defined by the BitTorrent specification
     *        </p>
     *        '.
     * @return The transformed result of the ResponseTransformer.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObjectTorrent(GetObjectTorrentRequest, ResponseTransformer)
     */
    default GetObjectTorrentResponse getObjectTorrent(Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest,
            Path destinationPath) throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectTorrent(GetObjectTorrentRequest.builder().applyMutation(getObjectTorrentRequest).build(), destinationPath);
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectTorrentRequest
     * @return A {@link ResponseInputStream} containing data streamed from service. Note that this is an unmanaged
     *         reference to the underlying HTTP connection so great care must be taken to ensure all data if fully read
     *         from the input stream and that it is properly closed. Failure to do so may result in sub-optimal behavior
     *         and exhausting connections in the connection pool. The unmarshalled response object can be obtained via
     *         {@link ResponseInputStream#response()}. The service documentation for the response content is as follows
     *         '
     *         <p>
     *         A Bencoded dictionary as defined by the BitTorrent specification
     *         </p>
     *         '.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObject(getObjectTorrent, ResponseTransformer)
     */
    default ResponseInputStream<GetObjectTorrentResponse> getObjectTorrent(GetObjectTorrentRequest getObjectTorrentRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectTorrent(getObjectTorrentRequest, ResponseTransformer.toInputStream());
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectTorrentRequest.Builder} avoiding the need
     * to create one manually via {@link GetObjectTorrentRequest#builder()}
     * </p>
     *
     * @param getObjectTorrentRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectTorrentRequest.Builder} to create a request.
     * @return A {@link ResponseInputStream} containing data streamed from service. Note that this is an unmanaged
     *         reference to the underlying HTTP connection so great care must be taken to ensure all data if fully read
     *         from the input stream and that it is properly closed. Failure to do so may result in sub-optimal behavior
     *         and exhausting connections in the connection pool. The unmarshalled response object can be obtained via
     *         {@link ResponseInputStream#response()}. The service documentation for the response content is as follows
     *         '
     *         <p>
     *         A Bencoded dictionary as defined by the BitTorrent specification
     *         </p>
     *         '.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObject(getObjectTorrent, ResponseTransformer)
     */
    default ResponseInputStream<GetObjectTorrentResponse> getObjectTorrent(
            Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        return getObjectTorrent(GetObjectTorrentRequest.builder().applyMutation(getObjectTorrentRequest).build());
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getObjectTorrentRequest
     * @return A {@link ResponseBytes} that loads the data streamed from the service into memory and exposes it in
     *         convenient in-memory representations like a byte buffer or string. The unmarshalled response object can
     *         be obtained via {@link ResponseBytes#response()}. The service documentation for the response content is
     *         as follows '
     *         <p>
     *         A Bencoded dictionary as defined by the BitTorrent specification
     *         </p>
     *         '.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObject(getObjectTorrent, ResponseTransformer)
     */
    default ResponseBytes<GetObjectTorrentResponse> getObjectTorrentAsBytes(GetObjectTorrentRequest getObjectTorrentRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return getObjectTorrent(getObjectTorrentRequest, ResponseTransformer.toBytes());
    }

    /**
     * <p>
     * Returns torrent files from a bucket. BitTorrent can save you bandwidth when you're distributing large files. For
     * more information about BitTorrent, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">Using BitTorrent with Amazon S3</a>.
     * </p>
     * <note>
     * <p>
     * You can get torrent only for objects that are less than 5 GB in size, and that are not encrypted using
     * server-side encryption with a customer-provided encryption key.
     * </p>
     * </note>
     * <p>
     * To use GET, you must have READ access to the object.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following action is related to <code>GetObjectTorrent</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetObjectTorrentRequest.Builder} avoiding the need
     * to create one manually via {@link GetObjectTorrentRequest#builder()}
     * </p>
     *
     * @param getObjectTorrentRequest
     *        A {@link Consumer} that will call methods on {@link GetObjectTorrentRequest.Builder} to create a request.
     * @return A {@link ResponseBytes} that loads the data streamed from the service into memory and exposes it in
     *         convenient in-memory representations like a byte buffer or string. The unmarshalled response object can
     *         be obtained via {@link ResponseBytes#response()}. The service documentation for the response content is
     *         as follows '
     *         <p>
     *         A Bencoded dictionary as defined by the BitTorrent specification
     *         </p>
     *         '.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetObjectTorrent
     * @see #getObject(getObjectTorrent, ResponseTransformer)
     */
    default ResponseBytes<GetObjectTorrentResponse> getObjectTorrentAsBytes(
            Consumer<GetObjectTorrentRequest.Builder> getObjectTorrentRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        return getObjectTorrentAsBytes(GetObjectTorrentRequest.builder().applyMutation(getObjectTorrentRequest).build());
    }

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this operation, you
     * must have the <code>s3:GetBucketPublicAccessBlock</code> permission. For more information about Amazon S3
     * permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying
     * Permissions in a Policy</a>.
     * </p>
     * <important>
     * <p>
     * When Amazon S3 evaluates the <code>PublicAccessBlock</code> configuration for a bucket or an object, it checks
     * the <code>PublicAccessBlock</code> configuration for both the bucket (or the bucket that contains the object) and
     * the bucket owner's account. If the <code>PublicAccessBlock</code> settings are different between the bucket and
     * the account, Amazon S3 uses the most restrictive combination of the bucket-level and account-level settings.
     * </p>
     * </important>
     * <p>
     * For more information about when Amazon S3 considers a bucket or an object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetPublicAccessBlock</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param getPublicAccessBlockRequest
     * @return Result of the GetPublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetPublicAccessBlock
     */
    default GetPublicAccessBlockResponse getPublicAccessBlock(GetPublicAccessBlockRequest getPublicAccessBlockRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this operation, you
     * must have the <code>s3:GetBucketPublicAccessBlock</code> permission. For more information about Amazon S3
     * permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying
     * Permissions in a Policy</a>.
     * </p>
     * <important>
     * <p>
     * When Amazon S3 evaluates the <code>PublicAccessBlock</code> configuration for a bucket or an object, it checks
     * the <code>PublicAccessBlock</code> configuration for both the bucket (or the bucket that contains the object) and
     * the bucket owner's account. If the <code>PublicAccessBlock</code> settings are different between the bucket and
     * the account, Amazon S3 uses the most restrictive combination of the bucket-level and account-level settings.
     * </p>
     * </important>
     * <p>
     * For more information about when Amazon S3 considers a bucket or an object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p>
     * The following operations are related to <code>GetPublicAccessBlock</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutPublicAccessBlock.html">PutPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link GetPublicAccessBlockRequest.Builder} avoiding the
     * need to create one manually via {@link GetPublicAccessBlockRequest#builder()}
     * </p>
     *
     * @param getPublicAccessBlockRequest
     *        A {@link Consumer} that will call methods on {@link GetPublicAccessBlockRequest.Builder} to create a
     *        request.
     * @return Result of the GetPublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.GetPublicAccessBlock
     */
    default GetPublicAccessBlockResponse getPublicAccessBlock(
            Consumer<GetPublicAccessBlockRequest.Builder> getPublicAccessBlockRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return getPublicAccessBlock(GetPublicAccessBlockRequest.builder().applyMutation(getPublicAccessBlockRequest).build());
    }

    /**
     * <p>
     * This action is useful to determine if a bucket exists and you have permission to access it. The action returns a
     * <code>200 OK</code> if the bucket exists and you have permission to access it.
     * </p>
     * <p>
     * If the bucket does not exist or you do not have permission to access it, the <code>HEAD</code> request returns a
     * generic <code>404 Not Found</code> or <code>403 Forbidden</code> code. A message body is not included, so you
     * cannot determine the exception beyond these error codes.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucket</code> action. The bucket
     * owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * To use this API against an access point, you must provide the alias of the access point in place of the bucket
     * name or specify the access point ARN. When using the access point ARN, you must direct requests to the access
     * point hostname. The access point hostname takes the form
     * AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using the Amazon Web Services SDKs, you
     * provide the ARN in place of the bucket name. For more information see, <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>.
     * </p>
     *
     * @param headBucketRequest
     * @return Result of the HeadBucket operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.HeadBucket
     */
    default HeadBucketResponse headBucket(HeadBucketRequest headBucketRequest) throws NoSuchBucketException, AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action is useful to determine if a bucket exists and you have permission to access it. The action returns a
     * <code>200 OK</code> if the bucket exists and you have permission to access it.
     * </p>
     * <p>
     * If the bucket does not exist or you do not have permission to access it, the <code>HEAD</code> request returns a
     * generic <code>404 Not Found</code> or <code>403 Forbidden</code> code. A message body is not included, so you
     * cannot determine the exception beyond these error codes.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucket</code> action. The bucket
     * owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * To use this API against an access point, you must provide the alias of the access point in place of the bucket
     * name or specify the access point ARN. When using the access point ARN, you must direct requests to the access
     * point hostname. The access point hostname takes the form
     * AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using the Amazon Web Services SDKs, you
     * provide the ARN in place of the bucket name. For more information see, <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points</a>.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link HeadBucketRequest.Builder} avoiding the need to
     * create one manually via {@link HeadBucketRequest#builder()}
     * </p>
     *
     * @param headBucketRequest
     *        A {@link Consumer} that will call methods on {@link HeadBucketRequest.Builder} to create a request.
     * @return Result of the HeadBucket operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.HeadBucket
     */
    default HeadBucketResponse headBucket(Consumer<HeadBucketRequest.Builder> headBucketRequest) throws NoSuchBucketException,
            AwsServiceException, SdkClientException, S3Exception {
        return headBucket(HeadBucketRequest.builder().applyMutation(headBucketRequest).build());
    }

    /**
     * <p>
     * The HEAD action retrieves metadata from an object without returning the object itself. This action is useful if
     * you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
     * </p>
     * <p>
     * A <code>HEAD</code> request has the same options as a <code>GET</code> action on an object. The response is
     * identical to the <code>GET</code> response except that there is no response body. Because of this, if the
     * <code>HEAD</code> request generates an error, it returns a generic <code>404 Not Found</code> or
     * <code>403 Forbidden</code> code. It is not possible to retrieve the exact exception beyond these error codes.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you retrieve the metadata from the object, you must use the following
     * headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The last modified property in this case is the creation date of the object.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Request headers are limited to 8 KB in size. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTCommonRequestHeaders.html">Common Request Headers</a>.
     * </p>
     * <p>
     * Consider the following when using request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Consideration 1 – If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present
     * in the request as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-Match</code> condition evaluates to <code>true</code>, and;
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Unmodified-Since</code> condition evaluates to <code>false</code>;
     * </p>
     * </li>
     * </ul>
     * <p>
     * Then Amazon S3 returns <code>200 OK</code> and the data requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * Consideration 2 – If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are
     * present in the request as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-None-Match</code> condition evaluates to <code>false</code>, and;
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>;
     * </p>
     * </li>
     * </ul>
     * <p>
     * Then Amazon S3 returns the <code>304 Not Modified</code> response code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the s3:ListBucket permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 returns an HTTP status code 404
     * ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 returns an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>HeadObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param headObjectRequest
     * @return Result of the HeadObject operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.HeadObject
     */
    default HeadObjectResponse headObject(HeadObjectRequest headObjectRequest) throws NoSuchKeyException, AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * The HEAD action retrieves metadata from an object without returning the object itself. This action is useful if
     * you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
     * </p>
     * <p>
     * A <code>HEAD</code> request has the same options as a <code>GET</code> action on an object. The response is
     * identical to the <code>GET</code> response except that there is no response body. Because of this, if the
     * <code>HEAD</code> request generates an error, it returns a generic <code>404 Not Found</code> or
     * <code>403 Forbidden</code> code. It is not possible to retrieve the exact exception beyond these error codes.
     * </p>
     * <p>
     * If you encrypt an object by using server-side encryption with customer-provided encryption keys (SSE-C) when you
     * store the object in Amazon S3, then when you retrieve the metadata from the object, you must use the following
     * headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about SSE-C, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html">Server-Side
     * Encryption (Using Customer-Provided Encryption Keys)</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Encryption request headers, like <code>x-amz-server-side-encryption</code>, should not be sent for GET requests
     * if your object uses server-side encryption with KMS keys (SSE-KMS) or server-side encryption with Amazon
     * S3–managed encryption keys (SSE-S3). If your object does use these types of keys, you’ll get an HTTP 400
     * BadRequest error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The last modified property in this case is the creation date of the object.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Request headers are limited to 8 KB in size. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTCommonRequestHeaders.html">Common Request Headers</a>.
     * </p>
     * <p>
     * Consider the following when using request headers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Consideration 1 – If both of the <code>If-Match</code> and <code>If-Unmodified-Since</code> headers are present
     * in the request as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-Match</code> condition evaluates to <code>true</code>, and;
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Unmodified-Since</code> condition evaluates to <code>false</code>;
     * </p>
     * </li>
     * </ul>
     * <p>
     * Then Amazon S3 returns <code>200 OK</code> and the data requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * Consideration 2 – If both of the <code>If-None-Match</code> and <code>If-Modified-Since</code> headers are
     * present in the request as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>If-None-Match</code> condition evaluates to <code>false</code>, and;
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>If-Modified-Since</code> condition evaluates to <code>true</code>;
     * </p>
     * </li>
     * </ul>
     * <p>
     * Then Amazon S3 returns the <code>304 Not Modified</code> response code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about conditional requests, see <a href="https://tools.ietf.org/html/rfc7232">RFC 7232</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You need the relevant read object (or version) permission for this operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>. If the object you request does not exist, the error Amazon S3 returns depends on whether you also
     * have the s3:ListBucket permission.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have the <code>s3:ListBucket</code> permission on the bucket, Amazon S3 returns an HTTP status code 404
     * ("no such key") error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don’t have the <code>s3:ListBucket</code> permission, Amazon S3 returns an HTTP status code 403
     * ("access denied") error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>HeadObject</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link HeadObjectRequest.Builder} avoiding the need to
     * create one manually via {@link HeadObjectRequest#builder()}
     * </p>
     *
     * @param headObjectRequest
     *        A {@link Consumer} that will call methods on {@link HeadObjectRequest.Builder} to create a request.
     * @return Result of the HeadObject operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.HeadObject
     */
    default HeadObjectResponse headObject(Consumer<HeadObjectRequest.Builder> headObjectRequest) throws NoSuchKeyException,
            AwsServiceException, SdkClientException, S3Exception {
        return headObject(HeadObjectRequest.builder().applyMutation(headObjectRequest).build());
    }

    /**
     * <p>
     * Lists the analytics configurations for the bucket. You can have up to 1,000 analytics configurations per bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. You should
     * always check the <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there will be a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * continuation-token in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketAnalyticsConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listBucketAnalyticsConfigurationsRequest
     * @return Result of the ListBucketAnalyticsConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketAnalyticsConfigurations
     */
    default ListBucketAnalyticsConfigurationsResponse listBucketAnalyticsConfigurations(
            ListBucketAnalyticsConfigurationsRequest listBucketAnalyticsConfigurationsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Lists the analytics configurations for the bucket. You can have up to 1,000 analytics configurations per bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. You should
     * always check the <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there will be a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * continuation-token in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about Amazon S3 analytics feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketAnalyticsConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAnalyticsConfiguration.html">
     * PutBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListBucketAnalyticsConfigurationsRequest.Builder}
     * avoiding the need to create one manually via {@link ListBucketAnalyticsConfigurationsRequest#builder()}
     * </p>
     *
     * @param listBucketAnalyticsConfigurationsRequest
     *        A {@link Consumer} that will call methods on {@link ListBucketAnalyticsConfigurationsRequest.Builder} to
     *        create a request.
     * @return Result of the ListBucketAnalyticsConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketAnalyticsConfigurations
     */
    default ListBucketAnalyticsConfigurationsResponse listBucketAnalyticsConfigurations(
            Consumer<ListBucketAnalyticsConfigurationsRequest.Builder> listBucketAnalyticsConfigurationsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return listBucketAnalyticsConfigurations(ListBucketAnalyticsConfigurationsRequest.builder()
                .applyMutation(listBucketAnalyticsConfigurationsRequest).build());
    }

    /**
     * <p>
     * Lists the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>ListBucketIntelligentTieringConfigurations</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listBucketIntelligentTieringConfigurationsRequest
     * @return Result of the ListBucketIntelligentTieringConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketIntelligentTieringConfigurations
     */
    default ListBucketIntelligentTieringConfigurationsResponse listBucketIntelligentTieringConfigurations(
            ListBucketIntelligentTieringConfigurationsRequest listBucketIntelligentTieringConfigurationsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Lists the S3 Intelligent-Tiering configuration from the specified bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>ListBucketIntelligentTieringConfigurations</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketIntelligentTieringConfiguration.html">
     * PutBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the
     * {@link ListBucketIntelligentTieringConfigurationsRequest.Builder} avoiding the need to create one manually via
     * {@link ListBucketIntelligentTieringConfigurationsRequest#builder()}
     * </p>
     *
     * @param listBucketIntelligentTieringConfigurationsRequest
     *        A {@link Consumer} that will call methods on
     *        {@link ListBucketIntelligentTieringConfigurationsRequest.Builder} to create a request.
     * @return Result of the ListBucketIntelligentTieringConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketIntelligentTieringConfigurations
     */
    default ListBucketIntelligentTieringConfigurationsResponse listBucketIntelligentTieringConfigurations(
            Consumer<ListBucketIntelligentTieringConfigurationsRequest.Builder> listBucketIntelligentTieringConfigurationsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return listBucketIntelligentTieringConfigurations(ListBucketIntelligentTieringConfigurationsRequest.builder()
                .applyMutation(listBucketIntelligentTieringConfigurationsRequest).build());
    }

    /**
     * <p>
     * Returns a list of inventory configurations for the bucket. You can have up to 1,000 analytics configurations per
     * bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. Always check the
     * <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there is a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * continuation-token in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetInventoryConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketInventoryConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listBucketInventoryConfigurationsRequest
     * @return Result of the ListBucketInventoryConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketInventoryConfigurations
     */
    default ListBucketInventoryConfigurationsResponse listBucketInventoryConfigurations(
            ListBucketInventoryConfigurationsRequest listBucketInventoryConfigurationsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns a list of inventory configurations for the bucket. You can have up to 1,000 analytics configurations per
     * bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. Always check the
     * <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there is a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * continuation-token in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetInventoryConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about the Amazon S3 inventory feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3 Inventory</a>
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketInventoryConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketInventoryConfiguration.html">
     * PutBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListBucketInventoryConfigurationsRequest.Builder}
     * avoiding the need to create one manually via {@link ListBucketInventoryConfigurationsRequest#builder()}
     * </p>
     *
     * @param listBucketInventoryConfigurationsRequest
     *        A {@link Consumer} that will call methods on {@link ListBucketInventoryConfigurationsRequest.Builder} to
     *        create a request.
     * @return Result of the ListBucketInventoryConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketInventoryConfigurations
     */
    default ListBucketInventoryConfigurationsResponse listBucketInventoryConfigurations(
            Consumer<ListBucketInventoryConfigurationsRequest.Builder> listBucketInventoryConfigurationsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return listBucketInventoryConfigurations(ListBucketInventoryConfigurationsRequest.builder()
                .applyMutation(listBucketInventoryConfigurationsRequest).build());
    }

    /**
     * <p>
     * Lists the metrics configurations for the bucket. The metrics configurations are only for the request metrics of
     * the bucket and do not provide information on daily storage metrics. You can have up to 1,000 configurations per
     * bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. Always check the
     * <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there is a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * <code>continuation-token</code> in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For more information about metrics configurations and CloudWatch request metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketMetricsConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listBucketMetricsConfigurationsRequest
     * @return Result of the ListBucketMetricsConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketMetricsConfigurations
     */
    default ListBucketMetricsConfigurationsResponse listBucketMetricsConfigurations(
            ListBucketMetricsConfigurationsRequest listBucketMetricsConfigurationsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Lists the metrics configurations for the bucket. The metrics configurations are only for the request metrics of
     * the bucket and do not provide information on daily storage metrics. You can have up to 1,000 configurations per
     * bucket.
     * </p>
     * <p>
     * This action supports list pagination and does not return more than 100 configurations at a time. Always check the
     * <code>IsTruncated</code> element in the response. If there are no more configurations to list,
     * <code>IsTruncated</code> is set to false. If there are more configurations to list, <code>IsTruncated</code> is
     * set to true, and there is a value in <code>NextContinuationToken</code>. You use the
     * <code>NextContinuationToken</code> value to continue the pagination of the list by passing the value in
     * <code>continuation-token</code> in the request to <code>GET</code> the next page.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:GetMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For more information about metrics configurations and CloudWatch request metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListBucketMetricsConfigurations</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketMetricsConfiguration.html">
     * PutBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListBucketMetricsConfigurationsRequest.Builder}
     * avoiding the need to create one manually via {@link ListBucketMetricsConfigurationsRequest#builder()}
     * </p>
     *
     * @param listBucketMetricsConfigurationsRequest
     *        A {@link Consumer} that will call methods on {@link ListBucketMetricsConfigurationsRequest.Builder} to
     *        create a request.
     * @return Result of the ListBucketMetricsConfigurations operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBucketMetricsConfigurations
     */
    default ListBucketMetricsConfigurationsResponse listBucketMetricsConfigurations(
            Consumer<ListBucketMetricsConfigurationsRequest.Builder> listBucketMetricsConfigurationsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return listBucketMetricsConfigurations(ListBucketMetricsConfigurationsRequest.builder()
                .applyMutation(listBucketMetricsConfigurationsRequest).build());
    }

    /**
     * <p>
     * Returns a list of all buckets owned by the authenticated sender of the request. To use this operation, you must
     * have the <code>s3:ListAllMyBuckets</code> permission.
     * </p>
     *
     * @return Result of the ListBuckets operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBuckets
     * @see #listBuckets(ListBucketsRequest)
     */
    default ListBucketsResponse listBuckets() throws AwsServiceException, SdkClientException, S3Exception {
        return listBuckets(ListBucketsRequest.builder().build());
    }

    /**
     * <p>
     * Returns a list of all buckets owned by the authenticated sender of the request. To use this operation, you must
     * have the <code>s3:ListAllMyBuckets</code> permission.
     * </p>
     *
     * @param listBucketsRequest
     * @return Result of the ListBuckets operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBuckets
     */
    default ListBucketsResponse listBuckets(ListBucketsRequest listBucketsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns a list of all buckets owned by the authenticated sender of the request. To use this operation, you must
     * have the <code>s3:ListAllMyBuckets</code> permission.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListBucketsRequest.Builder} avoiding the need to
     * create one manually via {@link ListBucketsRequest#builder()}
     * </p>
     *
     * @param listBucketsRequest
     *        A {@link Consumer} that will call methods on {@link ListBucketsRequest.Builder} to create a request.
     * @return Result of the ListBuckets operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListBuckets
     */
    default ListBucketsResponse listBuckets(Consumer<ListBucketsRequest.Builder> listBucketsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listBuckets(ListBucketsRequest.builder().applyMutation(listBucketsRequest).build());
    }

    /**
     * <p>
     * This action lists in-progress multipart uploads. An in-progress multipart upload is a multipart upload that has
     * been initiated using the Initiate Multipart Upload request, but has not yet been completed or aborted.
     * </p>
     * <p>
     * This action returns at most 1,000 multipart uploads in the response. 1,000 multipart uploads is the maximum
     * number of uploads a response can include, which is also the default value. You can further limit the number of
     * uploads in a response by specifying the <code>max-uploads</code> parameter in the response. If additional
     * multipart uploads satisfy the list criteria, the response will contain an <code>IsTruncated</code> element with
     * the value true. To list the additional multipart uploads, use the <code>key-marker</code> and
     * <code>upload-id-marker</code> request parameters.
     * </p>
     * <p>
     * In the response, the uploads are sorted by key. If your application has initiated more than one multipart upload
     * using the same object key, then uploads in the response are first sorted by key. Additionally, uploads are sorted
     * in ascending order within each key by the upload initiation time.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListMultipartUploads</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listMultipartUploadsRequest
     * @return Result of the ListMultipartUploads operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListMultipartUploads
     */
    default ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action lists in-progress multipart uploads. An in-progress multipart upload is a multipart upload that has
     * been initiated using the Initiate Multipart Upload request, but has not yet been completed or aborted.
     * </p>
     * <p>
     * This action returns at most 1,000 multipart uploads in the response. 1,000 multipart uploads is the maximum
     * number of uploads a response can include, which is also the default value. You can further limit the number of
     * uploads in a response by specifying the <code>max-uploads</code> parameter in the response. If additional
     * multipart uploads satisfy the list criteria, the response will contain an <code>IsTruncated</code> element with
     * the value true. To list the additional multipart uploads, use the <code>key-marker</code> and
     * <code>upload-id-marker</code> request parameters.
     * </p>
     * <p>
     * In the response, the uploads are sorted by key. If your application has initiated more than one multipart upload
     * using the same object key, then uploads in the response are first sorted by key. Additionally, uploads are sorted
     * in ascending order within each key by the upload initiation time.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListMultipartUploads</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListMultipartUploadsRequest.Builder} avoiding the
     * need to create one manually via {@link ListMultipartUploadsRequest#builder()}
     * </p>
     *
     * @param listMultipartUploadsRequest
     *        A {@link Consumer} that will call methods on {@link ListMultipartUploadsRequest.Builder} to create a
     *        request.
     * @return Result of the ListMultipartUploads operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListMultipartUploads
     */
    default ListMultipartUploadsResponse listMultipartUploads(
            Consumer<ListMultipartUploadsRequest.Builder> listMultipartUploadsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listMultipartUploads(ListMultipartUploadsRequest.builder().applyMutation(listMultipartUploadsRequest).build());
    }

    /**
     * <p>
     * This action lists in-progress multipart uploads. An in-progress multipart upload is a multipart upload that has
     * been initiated using the Initiate Multipart Upload request, but has not yet been completed or aborted.
     * </p>
     * <p>
     * This action returns at most 1,000 multipart uploads in the response. 1,000 multipart uploads is the maximum
     * number of uploads a response can include, which is also the default value. You can further limit the number of
     * uploads in a response by specifying the <code>max-uploads</code> parameter in the response. If additional
     * multipart uploads satisfy the list criteria, the response will contain an <code>IsTruncated</code> element with
     * the value true. To list the additional multipart uploads, use the <code>key-marker</code> and
     * <code>upload-id-marker</code> request parameters.
     * </p>
     * <p>
     * In the response, the uploads are sorted by key. If your application has initiated more than one multipart upload
     * using the same object key, then uploads in the response are first sorted by key. Additionally, uploads are sorted
     * in ascending order within each key by the upload initiation time.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListMultipartUploads</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of
     * {@link #listMultipartUploads(ListMultipartUploadsRequest)} operation.
     * The return type is a custom iterable that can be used to iterate through all the pages. SDK will internally
     * handle making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
     * </p>
     *
     * <p>
     * The following are few ways to iterate through the response pages:
     * </p>
     * 1) Using a Stream
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client.listMultipartUploadsPaginator(request);
     * responses.stream().forEach(....);
     * }
     * </pre>
     *
     * 2) Using For loop
     * 
     * <pre>
     * {
     *     &#064;code
     *     software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client
     *             .listMultipartUploadsPaginator(request);
     *     for (software.amazon.awssdk.services.s3.model.ListMultipartUploadsResponse response : responses) {
     *         // do something;
     *     }
     * }
     * </pre>
     *
     * 3) Use iterator directly
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client.listMultipartUploadsPaginator(request);
     * responses.iterator().forEachRemaining(....);
     * }
     * </pre>
     * <p>
     * <b>Please notice that the configuration of MaxUploads won't limit the number of results you get with the
     * paginator. It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listMultipartUploads(ListMultipartUploadsRequest)}
     * operation.</b>
     * </p>
     *
     * @param listMultipartUploadsRequest
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListMultipartUploads
     */
    default ListMultipartUploadsIterable listMultipartUploadsPaginator(ListMultipartUploadsRequest listMultipartUploadsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action lists in-progress multipart uploads. An in-progress multipart upload is a multipart upload that has
     * been initiated using the Initiate Multipart Upload request, but has not yet been completed or aborted.
     * </p>
     * <p>
     * This action returns at most 1,000 multipart uploads in the response. 1,000 multipart uploads is the maximum
     * number of uploads a response can include, which is also the default value. You can further limit the number of
     * uploads in a response by specifying the <code>max-uploads</code> parameter in the response. If additional
     * multipart uploads satisfy the list criteria, the response will contain an <code>IsTruncated</code> element with
     * the value true. To list the additional multipart uploads, use the <code>key-marker</code> and
     * <code>upload-id-marker</code> request parameters.
     * </p>
     * <p>
     * In the response, the uploads are sorted by key. If your application has initiated more than one multipart upload
     * using the same object key, then uploads in the response are first sorted by key. Additionally, uploads are sorted
     * in ascending order within each key by the upload initiation time.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListMultipartUploads</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of
     * {@link #listMultipartUploads(ListMultipartUploadsRequest)} operation.
     * The return type is a custom iterable that can be used to iterate through all the pages. SDK will internally
     * handle making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
     * </p>
     *
     * <p>
     * The following are few ways to iterate through the response pages:
     * </p>
     * 1) Using a Stream
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client.listMultipartUploadsPaginator(request);
     * responses.stream().forEach(....);
     * }
     * </pre>
     *
     * 2) Using For loop
     * 
     * <pre>
     * {
     *     &#064;code
     *     software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client
     *             .listMultipartUploadsPaginator(request);
     *     for (software.amazon.awssdk.services.s3.model.ListMultipartUploadsResponse response : responses) {
     *         // do something;
     *     }
     * }
     * </pre>
     *
     * 3) Use iterator directly
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListMultipartUploadsIterable responses = client.listMultipartUploadsPaginator(request);
     * responses.iterator().forEachRemaining(....);
     * }
     * </pre>
     * <p>
     * <b>Please notice that the configuration of MaxUploads won't limit the number of results you get with the
     * paginator. It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listMultipartUploads(ListMultipartUploadsRequest)}
     * operation.</b>
     * </p>
     * <p>
     * This is a convenience which creates an instance of the {@link ListMultipartUploadsRequest.Builder} avoiding the
     * need to create one manually via {@link ListMultipartUploadsRequest#builder()}
     * </p>
     *
     * @param listMultipartUploadsRequest
     *        A {@link Consumer} that will call methods on {@link ListMultipartUploadsRequest.Builder} to create a
     *        request.
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListMultipartUploads
     */
    default ListMultipartUploadsIterable listMultipartUploadsPaginator(
            Consumer<ListMultipartUploadsRequest.Builder> listMultipartUploadsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listMultipartUploadsPaginator(ListMultipartUploadsRequest.builder().applyMutation(listMultipartUploadsRequest)
                .build());
    }

    /**
     * <p>
     * Returns metadata about all versions of the objects in a bucket. You can also use request parameters as selection
     * criteria to return metadata about a subset of all the object versions.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucketVersions</code> action. Be
     * aware of the name difference.
     * </p>
     * </important> <note>
     * <p>
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the contents of
     * the response and handle it appropriately.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectVersions</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listObjectVersionsRequest
     * @return Result of the ListObjectVersions operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectVersions
     */
    default ListObjectVersionsResponse listObjectVersions(ListObjectVersionsRequest listObjectVersionsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns metadata about all versions of the objects in a bucket. You can also use request parameters as selection
     * criteria to return metadata about a subset of all the object versions.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucketVersions</code> action. Be
     * aware of the name difference.
     * </p>
     * </important> <note>
     * <p>
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the contents of
     * the response and handle it appropriately.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectVersions</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListObjectVersionsRequest.Builder} avoiding the
     * need to create one manually via {@link ListObjectVersionsRequest#builder()}
     * </p>
     *
     * @param listObjectVersionsRequest
     *        A {@link Consumer} that will call methods on {@link ListObjectVersionsRequest.Builder} to create a
     *        request.
     * @return Result of the ListObjectVersions operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectVersions
     */
    default ListObjectVersionsResponse listObjectVersions(Consumer<ListObjectVersionsRequest.Builder> listObjectVersionsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return listObjectVersions(ListObjectVersionsRequest.builder().applyMutation(listObjectVersionsRequest).build());
    }

    /**
     * <p>
     * Returns metadata about all versions of the objects in a bucket. You can also use request parameters as selection
     * criteria to return metadata about a subset of all the object versions.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucketVersions</code> action. Be
     * aware of the name difference.
     * </p>
     * </important> <note>
     * <p>
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the contents of
     * the response and handle it appropriately.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectVersions</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of
     * {@link #listObjectVersions(ListObjectVersionsRequest)} operation. The
     * return type is a custom iterable that can be used to iterate through all the pages. SDK will internally handle
     * making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
     * </p>
     *
     * <p>
     * The following are few ways to iterate through the response pages:
     * </p>
     * 1) Using a Stream
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client.listObjectVersionsPaginator(request);
     * responses.stream().forEach(....);
     * }
     * </pre>
     *
     * 2) Using For loop
     * 
     * <pre>
     * {
     *     &#064;code
     *     software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client
     *             .listObjectVersionsPaginator(request);
     *     for (software.amazon.awssdk.services.s3.model.ListObjectVersionsResponse response : responses) {
     *         // do something;
     *     }
     * }
     * </pre>
     *
     * 3) Use iterator directly
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client.listObjectVersionsPaginator(request);
     * responses.iterator().forEachRemaining(....);
     * }
     * </pre>
     * <p>
     * <b>Please notice that the configuration of MaxKeys won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listObjectVersions(ListObjectVersionsRequest)} operation.</b>
     * </p>
     *
     * @param listObjectVersionsRequest
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectVersions
     */
    default ListObjectVersionsIterable listObjectVersionsPaginator(ListObjectVersionsRequest listObjectVersionsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns metadata about all versions of the objects in a bucket. You can also use request parameters as selection
     * criteria to return metadata about a subset of all the object versions.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:ListBucketVersions</code> action. Be
     * aware of the name difference.
     * </p>
     * </important> <note>
     * <p>
     * A 200 OK response can contain valid or invalid XML. Make sure to design your application to parse the contents of
     * the response and handle it appropriately.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectVersions</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of
     * {@link #listObjectVersions(ListObjectVersionsRequest)} operation. The
     * return type is a custom iterable that can be used to iterate through all the pages. SDK will internally handle
     * making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
     * </p>
     *
     * <p>
     * The following are few ways to iterate through the response pages:
     * </p>
     * 1) Using a Stream
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client.listObjectVersionsPaginator(request);
     * responses.stream().forEach(....);
     * }
     * </pre>
     *
     * 2) Using For loop
     * 
     * <pre>
     * {
     *     &#064;code
     *     software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client
     *             .listObjectVersionsPaginator(request);
     *     for (software.amazon.awssdk.services.s3.model.ListObjectVersionsResponse response : responses) {
     *         // do something;
     *     }
     * }
     * </pre>
     *
     * 3) Use iterator directly
     * 
     * <pre>
     * {@code
     * software.amazon.awssdk.services.s3.paginators.ListObjectVersionsIterable responses = client.listObjectVersionsPaginator(request);
     * responses.iterator().forEachRemaining(....);
     * }
     * </pre>
     * <p>
     * <b>Please notice that the configuration of MaxKeys won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listObjectVersions(ListObjectVersionsRequest)} operation.</b>
     * </p>
     * <p>
     * This is a convenience which creates an instance of the {@link ListObjectVersionsRequest.Builder} avoiding the
     * need to create one manually via {@link ListObjectVersionsRequest#builder()}
     * </p>
     *
     * @param listObjectVersionsRequest
     *        A {@link Consumer} that will call methods on {@link ListObjectVersionsRequest.Builder} to create a
     *        request.
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectVersions
     */
    default ListObjectVersionsIterable listObjectVersionsPaginator(
            Consumer<ListObjectVersionsRequest.Builder> listObjectVersionsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listObjectVersionsPaginator(ListObjectVersionsRequest.builder().applyMutation(listObjectVersionsRequest).build());
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket. You can use the request parameters as selection
     * criteria to return a subset of the objects in a bucket. A 200 OK response can contain valid or invalid XML. Be
     * sure to design your application to parse the contents of the response and handle it appropriately.
     * </p>
     * <important>
     * <p>
     * This action has been revised. We recommend that you use the newer version, <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>, when developing
     * applications. For backward compatibility, Amazon S3 continues to support <code>ListObjects</code>.
     * </p>
     * </important>
     * <p>
     * The following operations are related to <code>ListObjects</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listObjectsRequest
     * @return Result of the ListObjects operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjects
     */
    default ListObjectsResponse listObjects(ListObjectsRequest listObjectsRequest) throws NoSuchBucketException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket. You can use the request parameters as selection
     * criteria to return a subset of the objects in a bucket. A 200 OK response can contain valid or invalid XML. Be
     * sure to design your application to parse the contents of the response and handle it appropriately.
     * </p>
     * <important>
     * <p>
     * This action has been revised. We recommend that you use the newer version, <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>, when developing
     * applications. For backward compatibility, Amazon S3 continues to support <code>ListObjects</code>.
     * </p>
     * </important>
     * <p>
     * The following operations are related to <code>ListObjects</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListObjectsRequest.Builder} avoiding the need to
     * create one manually via {@link ListObjectsRequest#builder()}
     * </p>
     *
     * @param listObjectsRequest
     *        A {@link Consumer} that will call methods on {@link ListObjectsRequest.Builder} to create a request.
     * @return Result of the ListObjects operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjects
     */
    default ListObjectsResponse listObjects(Consumer<ListObjectsRequest.Builder> listObjectsRequest)
            throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return listObjects(ListObjectsRequest.builder().applyMutation(listObjectsRequest).build());
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket with each request. You can use the request
     * parameters as selection criteria to return a subset of the objects in a bucket. A <code>200 OK</code> response
     * can contain valid or invalid XML. Make sure to design your application to parse the contents of the response and
     * handle it appropriately. Objects are returned sorted in an ascending order of the respective key names in the
     * list. For more information about listing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ListingKeysUsingAPIs.html">Listing object keys
     * programmatically</a>
     * </p>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * To use this action in an Identity and Access Management (IAM) policy, you must have permissions to perform the
     * <code>s3:ListBucket</code> action. The bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <important>
     * <p>
     * This section describes the latest revision of this action. We recommend that you use this revised API for
     * application development. For backward compatibility, Amazon S3 continues to support the prior version of this
     * API, <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>.
     * </p>
     * </important>
     * <p>
     * To get a list of your buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectsV2</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listObjectsV2Request
     * @return Result of the ListObjectsV2 operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectsV2
     */
    default ListObjectsV2Response listObjectsV2(ListObjectsV2Request listObjectsV2Request) throws NoSuchBucketException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket with each request. You can use the request
     * parameters as selection criteria to return a subset of the objects in a bucket. A <code>200 OK</code> response
     * can contain valid or invalid XML. Make sure to design your application to parse the contents of the response and
     * handle it appropriately. Objects are returned sorted in an ascending order of the respective key names in the
     * list. For more information about listing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ListingKeysUsingAPIs.html">Listing object keys
     * programmatically</a>
     * </p>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * To use this action in an Identity and Access Management (IAM) policy, you must have permissions to perform the
     * <code>s3:ListBucket</code> action. The bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <important>
     * <p>
     * This section describes the latest revision of this action. We recommend that you use this revised API for
     * application development. For backward compatibility, Amazon S3 continues to support the prior version of this
     * API, <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>.
     * </p>
     * </important>
     * <p>
     * To get a list of your buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectsV2</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListObjectsV2Request.Builder} avoiding the need to
     * create one manually via {@link ListObjectsV2Request#builder()}
     * </p>
     *
     * @param listObjectsV2Request
     *        A {@link Consumer} that will call methods on {@link ListObjectsV2Request.Builder} to create a request.
     * @return Result of the ListObjectsV2 operation returned by the service.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectsV2
     */
    default ListObjectsV2Response listObjectsV2(Consumer<ListObjectsV2Request.Builder> listObjectsV2Request)
            throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return listObjectsV2(ListObjectsV2Request.builder().applyMutation(listObjectsV2Request).build());
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket with each request. You can use the request
     * parameters as selection criteria to return a subset of the objects in a bucket. A <code>200 OK</code> response
     * can contain valid or invalid XML. Make sure to design your application to parse the contents of the response and
     * handle it appropriately. Objects are returned sorted in an ascending order of the respective key names in the
     * list. For more information about listing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ListingKeysUsingAPIs.html">Listing object keys
     * programmatically</a>
     * </p>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * To use this action in an Identity and Access Management (IAM) policy, you must have permissions to perform the
     * <code>s3:ListBucket</code> action. The bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <important>
     * <p>
     * This section describes the latest revision of this action. We recommend that you use this revised API for
     * application development. For backward compatibility, Amazon S3 continues to support the prior version of this
     * API, <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>.
     * </p>
     * </important>
     * <p>
     * To get a list of your buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectsV2</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of {@link #listObjectsV2(ListObjectsV2Request)}
     * operation. The return type is a custom iterable that can be used to iterate through all the pages. SDK will
     * internally handle making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
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
     * <b>Please notice that the configuration of MaxKeys won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listObjectsV2(ListObjectsV2Request)} operation.</b>
     * </p>
     *
     * @param listObjectsV2Request
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectsV2
     */
    default ListObjectsV2Iterable listObjectsV2Paginator(ListObjectsV2Request listObjectsV2Request) throws NoSuchBucketException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Returns some or all (up to 1,000) of the objects in a bucket with each request. You can use the request
     * parameters as selection criteria to return a subset of the objects in a bucket. A <code>200 OK</code> response
     * can contain valid or invalid XML. Make sure to design your application to parse the contents of the response and
     * handle it appropriately. Objects are returned sorted in an ascending order of the respective key names in the
     * list. For more information about listing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ListingKeysUsingAPIs.html">Listing object keys
     * programmatically</a>
     * </p>
     * <p>
     * To use this operation, you must have READ access to the bucket.
     * </p>
     * <p>
     * To use this action in an Identity and Access Management (IAM) policy, you must have permissions to perform the
     * <code>s3:ListBucket</code> action. The bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <important>
     * <p>
     * This section describes the latest revision of this action. We recommend that you use this revised API for
     * application development. For backward compatibility, Amazon S3 continues to support the prior version of this
     * API, <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjects.html">ListObjects</a>.
     * </p>
     * </important>
     * <p>
     * To get a list of your buckets, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBuckets.html">ListBuckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListObjectsV2</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of {@link #listObjectsV2(ListObjectsV2Request)}
     * operation. The return type is a custom iterable that can be used to iterate through all the pages. SDK will
     * internally handle making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
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
     * <b>Please notice that the configuration of MaxKeys won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listObjectsV2(ListObjectsV2Request)} operation.</b>
     * </p>
     * <p>
     * This is a convenience which creates an instance of the {@link ListObjectsV2Request.Builder} avoiding the need to
     * create one manually via {@link ListObjectsV2Request#builder()}
     * </p>
     *
     * @param listObjectsV2Request
     *        A {@link Consumer} that will call methods on {@link ListObjectsV2Request.Builder} to create a request.
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListObjectsV2
     */
    default ListObjectsV2Iterable listObjectsV2Paginator(Consumer<ListObjectsV2Request.Builder> listObjectsV2Request)
            throws NoSuchBucketException, AwsServiceException, SdkClientException, S3Exception {
        return listObjectsV2Paginator(ListObjectsV2Request.builder().applyMutation(listObjectsV2Request).build());
    }

    /**
     * <p>
     * Lists the parts that have been uploaded for a specific multipart upload. This operation must include the upload
     * ID, which you obtain by sending the initiate multipart upload request (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>).
     * This request returns a maximum of 1,000 uploaded parts. The default number of parts returned is 1,000 parts. You
     * can restrict the number of parts returned by specifying the <code>max-parts</code> request parameter. If your
     * multipart upload consists of more than 1,000 parts, the response returns an <code>IsTruncated</code> field with
     * the value of true, and a <code>NextPartNumberMarker</code> element. In subsequent <code>ListParts</code> requests
     * you can include the part-number-marker query string parameter and set its value to the
     * <code>NextPartNumberMarker</code> field value from the previous response.
     * </p>
     * <p>
     * If the upload was created using a checksum algorithm, you will need to have permission to the
     * <code>kms:Decrypt</code> action for the request to succeed.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListParts</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param listPartsRequest
     * @return Result of the ListParts operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListParts
     */
    default ListPartsResponse listParts(ListPartsRequest listPartsRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Lists the parts that have been uploaded for a specific multipart upload. This operation must include the upload
     * ID, which you obtain by sending the initiate multipart upload request (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>).
     * This request returns a maximum of 1,000 uploaded parts. The default number of parts returned is 1,000 parts. You
     * can restrict the number of parts returned by specifying the <code>max-parts</code> request parameter. If your
     * multipart upload consists of more than 1,000 parts, the response returns an <code>IsTruncated</code> field with
     * the value of true, and a <code>NextPartNumberMarker</code> element. In subsequent <code>ListParts</code> requests
     * you can include the part-number-marker query string parameter and set its value to the
     * <code>NextPartNumberMarker</code> field value from the previous response.
     * </p>
     * <p>
     * If the upload was created using a checksum algorithm, you will need to have permission to the
     * <code>kms:Decrypt</code> action for the request to succeed.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListParts</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link ListPartsRequest.Builder} avoiding the need to
     * create one manually via {@link ListPartsRequest#builder()}
     * </p>
     *
     * @param listPartsRequest
     *        A {@link Consumer} that will call methods on {@link ListPartsRequest.Builder} to create a request.
     * @return Result of the ListParts operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListParts
     */
    default ListPartsResponse listParts(Consumer<ListPartsRequest.Builder> listPartsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listParts(ListPartsRequest.builder().applyMutation(listPartsRequest).build());
    }

    /**
     * <p>
     * Lists the parts that have been uploaded for a specific multipart upload. This operation must include the upload
     * ID, which you obtain by sending the initiate multipart upload request (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>).
     * This request returns a maximum of 1,000 uploaded parts. The default number of parts returned is 1,000 parts. You
     * can restrict the number of parts returned by specifying the <code>max-parts</code> request parameter. If your
     * multipart upload consists of more than 1,000 parts, the response returns an <code>IsTruncated</code> field with
     * the value of true, and a <code>NextPartNumberMarker</code> element. In subsequent <code>ListParts</code> requests
     * you can include the part-number-marker query string parameter and set its value to the
     * <code>NextPartNumberMarker</code> field value from the previous response.
     * </p>
     * <p>
     * If the upload was created using a checksum algorithm, you will need to have permission to the
     * <code>kms:Decrypt</code> action for the request to succeed.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListParts</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of {@link #listParts(ListPartsRequest)} operation. The
     * return type is a custom iterable that can be used to iterate through all the pages. SDK will internally handle
     * making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
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
     * <b>Please notice that the configuration of MaxParts won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listParts(ListPartsRequest)} operation.</b>
     * </p>
     *
     * @param listPartsRequest
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListParts
     */
    default ListPartsIterable listPartsPaginator(ListPartsRequest listPartsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Lists the parts that have been uploaded for a specific multipart upload. This operation must include the upload
     * ID, which you obtain by sending the initiate multipart upload request (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>).
     * This request returns a maximum of 1,000 uploaded parts. The default number of parts returned is 1,000 parts. You
     * can restrict the number of parts returned by specifying the <code>max-parts</code> request parameter. If your
     * multipart upload consists of more than 1,000 parts, the response returns an <code>IsTruncated</code> field with
     * the value of true, and a <code>NextPartNumberMarker</code> element. In subsequent <code>ListParts</code> requests
     * you can include the part-number-marker query string parameter and set its value to the
     * <code>NextPartNumberMarker</code> field value from the previous response.
     * </p>
     * <p>
     * If the upload was created using a checksum algorithm, you will need to have permission to the
     * <code>kms:Decrypt</code> action for the request to succeed.
     * </p>
     * <p>
     * For more information on multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a>.
     * </p>
     * <p>
     * For information on permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a>.
     * </p>
     * <p>
     * The following operations are related to <code>ListParts</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAttributes.html">GetObjectAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a variant of {@link #listParts(ListPartsRequest)} operation. The
     * return type is a custom iterable that can be used to iterate through all the pages. SDK will internally handle
     * making service calls for you.
     * </p>
     * <p>
     * When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
     * guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
     * pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
     * request, you will see the failures only after you start iterating through the iterable.
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
     * <b>Please notice that the configuration of MaxParts won't limit the number of results you get with the paginator.
     * It only limits the number of results in each page.</b>
     * </p>
     * <p>
     * <b>Note: If you prefer to have control on service calls, use the
     * {@link #listParts(ListPartsRequest)} operation.</b>
     * </p>
     * <p>
     * This is a convenience which creates an instance of the {@link ListPartsRequest.Builder} avoiding the need to
     * create one manually via {@link ListPartsRequest#builder()}
     * </p>
     *
     * @param listPartsRequest
     *        A {@link Consumer} that will call methods on {@link ListPartsRequest.Builder} to create a request.
     * @return A custom iterable that can be used to iterate through all the response pages.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.ListParts
     */
    default ListPartsIterable listPartsPaginator(Consumer<ListPartsRequest.Builder> listPartsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return listPartsPaginator(ListPartsRequest.builder().applyMutation(listPartsRequest).build());
    }

    /**
     * <p>
     * Sets the accelerate configuration of an existing bucket. Amazon S3 Transfer Acceleration is a bucket-level
     * feature that enables you to perform faster data transfers to Amazon S3.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutAccelerateConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The Transfer Acceleration state of a bucket can be set to one of the following two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enabled – Enables accelerated data transfers to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended – Disables accelerated data transfers to the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAccelerateConfiguration.html">
     * GetBucketAccelerateConfiguration</a> action returns the transfer acceleration state of a bucket.
     * </p>
     * <p>
     * After setting the Transfer Acceleration state of a bucket to Enabled, it might take up to thirty minutes before
     * the data transfer rates to the bucket increase.
     * </p>
     * <p>
     * The name of the bucket used for Transfer Acceleration must be DNS-compliant and must not contain periods (".").
     * </p>
     * <p>
     * For more information about transfer acceleration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketAccelerateConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAccelerateConfiguration.html">
     * GetBucketAccelerateConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketAccelerateConfigurationRequest
     * @return Result of the PutBucketAccelerateConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAccelerateConfiguration
     */
    default PutBucketAccelerateConfigurationResponse putBucketAccelerateConfiguration(
            PutBucketAccelerateConfigurationRequest putBucketAccelerateConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the accelerate configuration of an existing bucket. Amazon S3 Transfer Acceleration is a bucket-level
     * feature that enables you to perform faster data transfers to Amazon S3.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutAccelerateConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The Transfer Acceleration state of a bucket can be set to one of the following two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enabled – Enables accelerated data transfers to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended – Disables accelerated data transfers to the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAccelerateConfiguration.html">
     * GetBucketAccelerateConfiguration</a> action returns the transfer acceleration state of a bucket.
     * </p>
     * <p>
     * After setting the Transfer Acceleration state of a bucket to Enabled, it might take up to thirty minutes before
     * the data transfer rates to the bucket increase.
     * </p>
     * <p>
     * The name of the bucket used for Transfer Acceleration must be DNS-compliant and must not contain periods (".").
     * </p>
     * <p>
     * For more information about transfer acceleration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html">Transfer Acceleration</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketAccelerateConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAccelerateConfiguration.html">
     * GetBucketAccelerateConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketAccelerateConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketAccelerateConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketAccelerateConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketAccelerateConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketAccelerateConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAccelerateConfiguration
     */
    default PutBucketAccelerateConfigurationResponse putBucketAccelerateConfiguration(
            Consumer<PutBucketAccelerateConfigurationRequest.Builder> putBucketAccelerateConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketAccelerateConfiguration(PutBucketAccelerateConfigurationRequest.builder()
                .applyMutation(putBucketAccelerateConfigurationRequest).build());
    }

    /**
     * <p>
     * Sets the permissions on an existing bucket using access control lists (ACL). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>. To set the ACL of a
     * bucket, you must have <code>WRITE_ACP</code> permission.
     * </p>
     * <p>
     * You can use one of the following two ways to set a bucket's permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the ACL in the request body
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify permissions using request headers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot specify access permission using both the body and the request headers.
     * </p>
     * </note>
     * <p>
     * Depending on your application needs, you may choose to set the ACL on a bucket using either the request body or
     * the headers. For example, if you have an existing application that updates a bucket ACL using the request body,
     * then you can continue to use that approach.
     * </p>
     * <important>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, ACLs are disabled and no longer
     * affect permissions. You must use policies to grant access to your bucket and the objects in it. Requests to set
     * ACLs or update ACLs fail and return the <code>AccessControlListNotSupported</code> error code. Requests to read
     * ACLs are still supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Access Permissions</b>
     * </p>
     * <p>
     * You can set access permissions using one of the following methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined ACLs,
     * known as <i>canned ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. Specify the canned
     * ACL name as the value of <code>x-amz-acl</code>. If you use this header, you cannot use other access
     * control-specific headers in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. When using these headers,
     * you specify explicit access permissions and grantees (Amazon Web Services accounts or Amazon S3 groups) who will
     * receive the permission. If you use these ACL-specific headers, you cannot use the <code>x-amz-acl</code> header
     * to set a canned ACL. These parameters map to the set of permissions that Amazon S3 supports in an ACL. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-write</code> header grants create, overwrite, and delete objects
     * permission to LogDelivery group predefined by Amazon S3 and two Amazon Web Services accounts identified by their
     * email addresses.
     * </p>
     * <p>
     * <code>x-amz-grant-write: uri="http://acs.amazonaws.com/groups/s3/LogDelivery", id="111122223333", id="555566667777" </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketAclRequest
     * @return Result of the PutBucketAcl operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAcl
     */
    default PutBucketAclResponse putBucketAcl(PutBucketAclRequest putBucketAclRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the permissions on an existing bucket using access control lists (ACL). For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Using ACLs</a>. To set the ACL of a
     * bucket, you must have <code>WRITE_ACP</code> permission.
     * </p>
     * <p>
     * You can use one of the following two ways to set a bucket's permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the ACL in the request body
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify permissions using request headers
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot specify access permission using both the body and the request headers.
     * </p>
     * </note>
     * <p>
     * Depending on your application needs, you may choose to set the ACL on a bucket using either the request body or
     * the headers. For example, if you have an existing application that updates a bucket ACL using the request body,
     * then you can continue to use that approach.
     * </p>
     * <important>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, ACLs are disabled and no longer
     * affect permissions. You must use policies to grant access to your bucket and the objects in it. Requests to set
     * ACLs or update ACLs fail and return the <code>AccessControlListNotSupported</code> error code. Requests to read
     * ACLs are still supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Access Permissions</b>
     * </p>
     * <p>
     * You can set access permissions using one of the following methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined ACLs,
     * known as <i>canned ACLs</i>. Each canned ACL has a predefined set of grantees and permissions. Specify the canned
     * ACL name as the value of <code>x-amz-acl</code>. If you use this header, you cannot use other access
     * control-specific headers in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. When using these headers,
     * you specify explicit access permissions and grantees (Amazon Web Services accounts or Amazon S3 groups) who will
     * receive the permission. If you use these ACL-specific headers, you cannot use the <code>x-amz-acl</code> header
     * to set a canned ACL. These parameters map to the set of permissions that Amazon S3 supports in an ACL. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-write</code> header grants create, overwrite, and delete objects
     * permission to LogDelivery group predefined by Amazon S3 and two Amazon Web Services accounts identified by their
     * email addresses.
     * </p>
     * <p>
     * <code>x-amz-grant-write: uri="http://acs.amazonaws.com/groups/s3/LogDelivery", id="111122223333", id="555566667777" </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectAcl.html">GetObjectAcl</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketAclRequest.Builder} avoiding the need to
     * create one manually via {@link PutBucketAclRequest#builder()}
     * </p>
     *
     * @param putBucketAclRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketAclRequest.Builder} to create a request.
     * @return Result of the PutBucketAcl operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAcl
     */
    default PutBucketAclResponse putBucketAcl(Consumer<PutBucketAclRequest.Builder> putBucketAclRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketAcl(PutBucketAclRequest.builder().applyMutation(putBucketAclRequest).build());
    }

    /**
     * <p>
     * Sets an analytics configuration for the bucket (specified by the analytics configuration ID). You can have up to
     * 1,000 analytics configurations per bucket.
     * </p>
     * <p>
     * You can choose to have storage class analysis export analysis reports sent to a comma-separated values (CSV) flat
     * file. See the <code>DataExport</code> request element. Reports are updated daily and are based on the object
     * filters that you configure. When selecting data export, you specify a destination bucket and an optional
     * destination prefix where the file is written. You can export the data to a destination bucket in a different
     * account. However, the destination bucket must be in the same Region as the bucket that you are making the PUT
     * analytics configuration to. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <important>
     * <p>
     * You must create a bucket policy on the destination bucket where the exported file is written to grant permissions
     * to Amazon S3 to write objects to the bucket. For an example policy, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
     * >Granting Permissions for Amazon S3 Inventory and Storage Class Analysis</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 400 Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: InvalidArgument</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: Invalid argument.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 400 Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: TooManyConfigurations</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 403 Forbidden</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: AccessDenied</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: You are not the owner of the specified bucket, or you do not have the s3:PutAnalyticsConfiguration
     * bucket permission to set the configuration on the bucket.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketAnalyticsConfigurationRequest
     * @return Result of the PutBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAnalyticsConfiguration
     */
    default PutBucketAnalyticsConfigurationResponse putBucketAnalyticsConfiguration(
            PutBucketAnalyticsConfigurationRequest putBucketAnalyticsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets an analytics configuration for the bucket (specified by the analytics configuration ID). You can have up to
     * 1,000 analytics configurations per bucket.
     * </p>
     * <p>
     * You can choose to have storage class analysis export analysis reports sent to a comma-separated values (CSV) flat
     * file. See the <code>DataExport</code> request element. Reports are updated daily and are based on the object
     * filters that you configure. When selecting data export, you specify a destination bucket and an optional
     * destination prefix where the file is written. You can export the data to a destination bucket in a different
     * account. However, the destination bucket must be in the same Region as the bucket that you are making the PUT
     * analytics configuration to. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html">Amazon S3 Analytics – Storage
     * Class Analysis</a>.
     * </p>
     * <important>
     * <p>
     * You must create a bucket policy on the destination bucket where the exported file is written to grant permissions
     * to Amazon S3 to write objects to the bucket. For an example policy, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
     * >Granting Permissions for Amazon S3 Inventory and Storage Class Analysis</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutAnalyticsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 400 Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: InvalidArgument</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: Invalid argument.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 400 Bad Request</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: TooManyConfigurations</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>HTTP Error: HTTP 403 Forbidden</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code: AccessDenied</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: You are not the owner of the specified bucket, or you do not have the s3:PutAnalyticsConfiguration
     * bucket permission to set the configuration on the bucket.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketAnalyticsConfiguration.html">
     * GetBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketAnalyticsConfiguration.html">
     * DeleteBucketAnalyticsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketAnalyticsConfigurations.html">
     * ListBucketAnalyticsConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketAnalyticsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketAnalyticsConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketAnalyticsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketAnalyticsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketAnalyticsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketAnalyticsConfiguration
     */
    default PutBucketAnalyticsConfigurationResponse putBucketAnalyticsConfiguration(
            Consumer<PutBucketAnalyticsConfigurationRequest.Builder> putBucketAnalyticsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketAnalyticsConfiguration(PutBucketAnalyticsConfigurationRequest.builder()
                .applyMutation(putBucketAnalyticsConfigurationRequest).build());
    }

    /**
     * <p>
     * Sets the <code>cors</code> configuration for your bucket. If the configuration exists, Amazon S3 replaces it.
     * </p>
     * <p>
     * To use this operation, you must be allowed to perform the <code>s3:PutBucketCORS</code> action. By default, the
     * bucket owner has this permission and can grant it to others.
     * </p>
     * <p>
     * You set this configuration on a bucket so that the bucket can service cross-origin requests. For example, you
     * might want to enable a request whose origin is <code>http://www.example.com</code> to access your Amazon S3
     * bucket at <code>my.example.bucket.com</code> by using the browser's <code>XMLHttpRequest</code> capability.
     * </p>
     * <p>
     * To enable cross-origin resource sharing (CORS) on a bucket, you add the <code>cors</code> subresource to the
     * bucket. The <code>cors</code> subresource is an XML document in which you configure rules that identify origins
     * and the HTTP methods that can be executed on your bucket. The document is limited to 64 KB in size.
     * </p>
     * <p>
     * When Amazon S3 receives a cross-origin request (or a pre-flight OPTIONS request) against a bucket, it evaluates
     * the <code>cors</code> configuration on the bucket and uses the first <code>CORSRule</code> rule that matches the
     * incoming browser request to enable a cross-origin request. For a rule to match, the following conditions must be
     * met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request's <code>Origin</code> header must match <code>AllowedOrigin</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The request method (for example, GET, PUT, HEAD, and so on) or the <code>Access-Control-Request-Method</code>
     * header in case of a pre-flight <code>OPTIONS</code> request must be one of the <code>AllowedMethod</code>
     * elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Every header specified in the <code>Access-Control-Request-Headers</code> request header of a pre-flight request
     * must match an <code>AllowedHeader</code> element.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CORS, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling Cross-Origin Resource Sharing</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketCors.html">GetBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketCors.html">DeleteBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTOPTIONSobject.html">RESTOPTIONSobject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketCorsRequest
     * @return Result of the PutBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketCors
     */
    default PutBucketCorsResponse putBucketCors(PutBucketCorsRequest putBucketCorsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the <code>cors</code> configuration for your bucket. If the configuration exists, Amazon S3 replaces it.
     * </p>
     * <p>
     * To use this operation, you must be allowed to perform the <code>s3:PutBucketCORS</code> action. By default, the
     * bucket owner has this permission and can grant it to others.
     * </p>
     * <p>
     * You set this configuration on a bucket so that the bucket can service cross-origin requests. For example, you
     * might want to enable a request whose origin is <code>http://www.example.com</code> to access your Amazon S3
     * bucket at <code>my.example.bucket.com</code> by using the browser's <code>XMLHttpRequest</code> capability.
     * </p>
     * <p>
     * To enable cross-origin resource sharing (CORS) on a bucket, you add the <code>cors</code> subresource to the
     * bucket. The <code>cors</code> subresource is an XML document in which you configure rules that identify origins
     * and the HTTP methods that can be executed on your bucket. The document is limited to 64 KB in size.
     * </p>
     * <p>
     * When Amazon S3 receives a cross-origin request (or a pre-flight OPTIONS request) against a bucket, it evaluates
     * the <code>cors</code> configuration on the bucket and uses the first <code>CORSRule</code> rule that matches the
     * incoming browser request to enable a cross-origin request. For a rule to match, the following conditions must be
     * met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request's <code>Origin</code> header must match <code>AllowedOrigin</code> elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * The request method (for example, GET, PUT, HEAD, and so on) or the <code>Access-Control-Request-Method</code>
     * header in case of a pre-flight <code>OPTIONS</code> request must be one of the <code>AllowedMethod</code>
     * elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * Every header specified in the <code>Access-Control-Request-Headers</code> request header of a pre-flight request
     * must match an <code>AllowedHeader</code> element.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CORS, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling Cross-Origin Resource Sharing</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketCors.html">GetBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketCors.html">DeleteBucketCors</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTOPTIONSobject.html">RESTOPTIONSobject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketCorsRequest.Builder} avoiding the need to
     * create one manually via {@link PutBucketCorsRequest#builder()}
     * </p>
     *
     * @param putBucketCorsRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketCorsRequest.Builder} to create a request.
     * @return Result of the PutBucketCors operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketCors
     */
    default PutBucketCorsResponse putBucketCors(Consumer<PutBucketCorsRequest.Builder> putBucketCorsRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketCors(PutBucketCorsRequest.builder().applyMutation(putBucketCorsRequest).build());
    }

    /**
     * <p>
     * This action uses the <code>encryption</code> subresource to configure default encryption and Amazon S3 Bucket Key
     * for an existing bucket.
     * </p>
     * <p>
     * Default encryption for a bucket can use server-side encryption with Amazon S3-managed keys (SSE-S3) or customer
     * managed keys (SSE-KMS). If you specify default encryption using SSE-KMS, you can also configure Amazon S3 Bucket
     * Key. When the default encryption is SSE-KMS, if you upload an object to the bucket and do not specify the KMS key
     * to use for encryption, Amazon S3 uses the default Amazon Web Services managed KMS key for your account. For
     * information about default encryption, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 default bucket
     * encryption</a> in the <i>Amazon S3 User Guide</i>. For more information about S3 Bucket Keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This action requires Amazon Web Services Signature Version 4. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"> Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutEncryptionConfiguration</code>
     * action. The bucket owner has this permission by default. The bucket owner can grant this permission to others.
     * For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketEncryption.html">GetBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketEncryption.html">DeleteBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketEncryptionRequest
     * @return Result of the PutBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketEncryption
     */
    default PutBucketEncryptionResponse putBucketEncryption(PutBucketEncryptionRequest putBucketEncryptionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This action uses the <code>encryption</code> subresource to configure default encryption and Amazon S3 Bucket Key
     * for an existing bucket.
     * </p>
     * <p>
     * Default encryption for a bucket can use server-side encryption with Amazon S3-managed keys (SSE-S3) or customer
     * managed keys (SSE-KMS). If you specify default encryption using SSE-KMS, you can also configure Amazon S3 Bucket
     * Key. When the default encryption is SSE-KMS, if you upload an object to the bucket and do not specify the KMS key
     * to use for encryption, Amazon S3 uses the default Amazon Web Services managed KMS key for your account. For
     * information about default encryption, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 default bucket
     * encryption</a> in the <i>Amazon S3 User Guide</i>. For more information about S3 Bucket Keys, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This action requires Amazon Web Services Signature Version 4. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"> Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutEncryptionConfiguration</code>
     * action. The bucket owner has this permission by default. The bucket owner can grant this permission to others.
     * For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketEncryption.html">GetBucketEncryption</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketEncryption.html">DeleteBucketEncryption</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketEncryptionRequest.Builder} avoiding the
     * need to create one manually via {@link PutBucketEncryptionRequest#builder()}
     * </p>
     *
     * @param putBucketEncryptionRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketEncryptionRequest.Builder} to create a
     *        request.
     * @return Result of the PutBucketEncryption operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketEncryption
     */
    default PutBucketEncryptionResponse putBucketEncryption(
            Consumer<PutBucketEncryptionRequest.Builder> putBucketEncryptionRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putBucketEncryption(PutBucketEncryptionRequest.builder().applyMutation(putBucketEncryptionRequest).build());
    }

    /**
     * <p>
     * Puts a S3 Intelligent-Tiering configuration to the specified bucket. You can have up to 1,000 S3
     * Intelligent-Tiering configurations per bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>PutBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You only need S3 Intelligent-Tiering enabled on a bucket if you want to automatically move objects stored in the
     * S3 Intelligent-Tiering storage class to the Archive Access or Deep Archive Access tier.
     * </p>
     * </note>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidArgument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> Invalid Argument
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TooManyConfigurations
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 403 Forbidden Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccessDenied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are not the owner of the specified bucket, or you do not have the
     * <code>s3:PutIntelligentTieringConfiguration</code> bucket permission to set the configuration on the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param putBucketIntelligentTieringConfigurationRequest
     * @return Result of the PutBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketIntelligentTieringConfiguration
     */
    default PutBucketIntelligentTieringConfigurationResponse putBucketIntelligentTieringConfiguration(
            PutBucketIntelligentTieringConfigurationRequest putBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Puts a S3 Intelligent-Tiering configuration to the specified bucket. You can have up to 1,000 S3
     * Intelligent-Tiering configurations per bucket.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically moving data to
     * the most cost-effective storage access tier, without performance impact or operational overhead. S3
     * Intelligent-Tiering delivers automatic cost savings in three low latency and high throughput access tiers. To get
     * the lowest storage cost on data that can be accessed in minutes to hours, you can choose to activate additional
     * archiving capabilities.
     * </p>
     * <p>
     * The S3 Intelligent-Tiering storage class is the ideal storage class for data with unknown, changing, or
     * unpredictable access patterns, independent of object size or retention period. If the size of an object is less
     * than 128 KB, it is not monitored and not eligible for auto-tiering. Smaller objects can be stored, but they are
     * always charged at the Frequent Access tier rates in the S3 Intelligent-Tiering storage class.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access">Storage
     * class for automatically optimizing frequently and infrequently accessed objects</a>.
     * </p>
     * <p>
     * Operations related to <code>PutBucketIntelligentTieringConfiguration</code> include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketIntelligentTieringConfiguration.html">
     * DeleteBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketIntelligentTieringConfiguration.html">
     * GetBucketIntelligentTieringConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketIntelligentTieringConfigurations.html">
     * ListBucketIntelligentTieringConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You only need S3 Intelligent-Tiering enabled on a bucket if you want to automatically move objects stored in the
     * S3 Intelligent-Tiering storage class to the Archive Access or Deep Archive Access tier.
     * </p>
     * </note>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidArgument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> Invalid Argument
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TooManyConfigurations
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 403 Forbidden Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccessDenied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are not the owner of the specified bucket, or you do not have the
     * <code>s3:PutIntelligentTieringConfiguration</code> bucket permission to set the configuration on the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the
     * {@link PutBucketIntelligentTieringConfigurationRequest.Builder} avoiding the need to create one manually via
     * {@link PutBucketIntelligentTieringConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketIntelligentTieringConfigurationRequest
     *        A {@link Consumer} that will call methods on
     *        {@link PutBucketIntelligentTieringConfigurationRequest.Builder} to create a request.
     * @return Result of the PutBucketIntelligentTieringConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketIntelligentTieringConfiguration
     */
    default PutBucketIntelligentTieringConfigurationResponse putBucketIntelligentTieringConfiguration(
            Consumer<PutBucketIntelligentTieringConfigurationRequest.Builder> putBucketIntelligentTieringConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketIntelligentTieringConfiguration(PutBucketIntelligentTieringConfigurationRequest.builder()
                .applyMutation(putBucketIntelligentTieringConfigurationRequest).build());
    }

    /**
     * <p>
     * This implementation of the <code>PUT</code> action adds an inventory configuration (identified by the inventory
     * ID) to the bucket. You can have up to 1,000 inventory configurations per bucket.
     * </p>
     * <p>
     * Amazon S3 inventory generates inventories of the objects in the bucket on a daily or weekly basis, and the
     * results are published to a flat file. The bucket that is inventoried is called the <i>source</i> bucket, and the
     * bucket where the inventory flat file is stored is called the <i>destination</i> bucket. The <i>destination</i>
     * bucket must be in the same Amazon Web Services Region as the <i>source</i> bucket.
     * </p>
     * <p>
     * When you configure an inventory for a <i>source</i> bucket, you specify the <i>destination</i> bucket where you
     * want the inventory to be stored, and whether to generate the inventory daily or weekly. You can also configure
     * what object metadata to include and whether to inventory all object versions or only current versions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3
     * Inventory</a> in the Amazon S3 User Guide.
     * </p>
     * <important>
     * <p>
     * You must create a bucket policy on the <i>destination</i> bucket to grant permissions to Amazon S3 to write
     * objects to the bucket in the defined location. For an example policy, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
     * > Granting Permissions for Amazon S3 Inventory and Storage Class Analysis</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutInventoryConfiguration</code> action.
     * The bucket owner has this permission by default and can grant this permission to others. For more information
     * about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidArgument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> Invalid Argument
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TooManyConfigurations
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 403 Forbidden Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccessDenied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are not the owner of the specified bucket, or you do not have the
     * <code>s3:PutInventoryConfiguration</code> bucket permission to set the configuration on the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketInventoryConfigurationRequest
     * @return Result of the PutBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketInventoryConfiguration
     */
    default PutBucketInventoryConfigurationResponse putBucketInventoryConfiguration(
            PutBucketInventoryConfigurationRequest putBucketInventoryConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * This implementation of the <code>PUT</code> action adds an inventory configuration (identified by the inventory
     * ID) to the bucket. You can have up to 1,000 inventory configurations per bucket.
     * </p>
     * <p>
     * Amazon S3 inventory generates inventories of the objects in the bucket on a daily or weekly basis, and the
     * results are published to a flat file. The bucket that is inventoried is called the <i>source</i> bucket, and the
     * bucket where the inventory flat file is stored is called the <i>destination</i> bucket. The <i>destination</i>
     * bucket must be in the same Amazon Web Services Region as the <i>source</i> bucket.
     * </p>
     * <p>
     * When you configure an inventory for a <i>source</i> bucket, you specify the <i>destination</i> bucket where you
     * want the inventory to be stored, and whether to generate the inventory daily or weekly. You can also configure
     * what object metadata to include and whether to inventory all object versions or only current versions. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html">Amazon S3
     * Inventory</a> in the Amazon S3 User Guide.
     * </p>
     * <important>
     * <p>
     * You must create a bucket policy on the <i>destination</i> bucket to grant permissions to Amazon S3 to write
     * objects to the bucket in the defined location. For an example policy, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
     * > Granting Permissions for Amazon S3 Inventory and Storage Class Analysis</a>.
     * </p>
     * </important>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutInventoryConfiguration</code> action.
     * The bucket owner has this permission by default and can grant this permission to others. For more information
     * about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the Amazon S3 User Guide.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidArgument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> Invalid Argument
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 400 Bad Request Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TooManyConfigurations
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p class="title">
     * <b>HTTP 403 Forbidden Error</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccessDenied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause:</i> You are not the owner of the specified bucket, or you do not have the
     * <code>s3:PutInventoryConfiguration</code> bucket permission to set the configuration on the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketInventoryConfiguration.html">
     * GetBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketInventoryConfiguration.html">
     * DeleteBucketInventoryConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketInventoryConfigurations.html">
     * ListBucketInventoryConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketInventoryConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketInventoryConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketInventoryConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketInventoryConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketInventoryConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketInventoryConfiguration
     */
    default PutBucketInventoryConfigurationResponse putBucketInventoryConfiguration(
            Consumer<PutBucketInventoryConfigurationRequest.Builder> putBucketInventoryConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketInventoryConfiguration(PutBucketInventoryConfigurationRequest.builder()
                .applyMutation(putBucketInventoryConfigurationRequest).build());
    }

    /**
     * <p>
     * Creates a new lifecycle configuration for the bucket or replaces an existing lifecycle configuration. Keep in
     * mind that this will overwrite an existing lifecycle configuration, so if you want to retain any configuration
     * details, they must be included in the new lifecycle configuration. For information about lifecycle configuration,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html">Managing your
     * storage lifecycle</a>.
     * </p>
     * <note>
     * <p>
     * Bucket lifecycle configuration now supports specifying a lifecycle rule using an object key name prefix, one or
     * more object tags, or a combination of both. Accordingly, this section describes the latest API. The previous
     * version of the API supported filtering based only on an object key name prefix, which is supported for backward
     * compatibility. For the related API description, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>.
     * </p>
     * </note>
     * <p>
     * <b>Rules</b>
     * </p>
     * <p>
     * You specify the lifecycle configuration in your request body. The lifecycle configuration is specified as XML
     * consisting of one or more rules. An Amazon S3 Lifecycle configuration can have up to 1,000 rules. This limit is
     * not adjustable. Each rule consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Filter identifying a subset of objects to which the rule applies. The filter can be based on a key name prefix,
     * object tags, or a combination of both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status whether the rule is in effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more lifecycle transition and expiration actions that you want Amazon S3 to perform on the objects
     * identified by the filter. If the state of your bucket is versioning-enabled or versioning-suspended, you can have
     * many versions of the same object (one current version and zero or more noncurrent versions). Amazon S3 provides
     * predefined actions that you can specify for current and noncurrent object versions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle Management</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html">Lifecycle Configuration
     * Elements</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * By default, all Amazon S3 resources are private, including buckets, objects, and related subresources (for
     * example, lifecycle configuration and website configuration). Only the resource owner (that is, the Amazon Web
     * Services account that created it) can access the resource. The resource owner can optionally grant access
     * permissions to others by writing an access policy. For this operation, a user must get the
     * <code>s3:PutLifecycleConfiguration</code> permission.
     * </p>
     * <p>
     * You can also explicitly deny permissions. Explicit deny also supersedes any other permissions. If you want to
     * block users or accounts from removing or deleting objects from your bucket, you must deny them permissions for
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutLifecycleConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-configuration-examples.html">Examples of
     * Lifecycle Configuration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketLifecycleConfigurationRequest
     * @return Result of the PutBucketLifecycleConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketLifecycleConfiguration
     */
    default PutBucketLifecycleConfigurationResponse putBucketLifecycleConfiguration(
            PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates a new lifecycle configuration for the bucket or replaces an existing lifecycle configuration. Keep in
     * mind that this will overwrite an existing lifecycle configuration, so if you want to retain any configuration
     * details, they must be included in the new lifecycle configuration. For information about lifecycle configuration,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html">Managing your
     * storage lifecycle</a>.
     * </p>
     * <note>
     * <p>
     * Bucket lifecycle configuration now supports specifying a lifecycle rule using an object key name prefix, one or
     * more object tags, or a combination of both. Accordingly, this section describes the latest API. The previous
     * version of the API supported filtering based only on an object key name prefix, which is supported for backward
     * compatibility. For the related API description, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycle.html">PutBucketLifecycle</a>.
     * </p>
     * </note>
     * <p>
     * <b>Rules</b>
     * </p>
     * <p>
     * You specify the lifecycle configuration in your request body. The lifecycle configuration is specified as XML
     * consisting of one or more rules. An Amazon S3 Lifecycle configuration can have up to 1,000 rules. This limit is
     * not adjustable. Each rule consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Filter identifying a subset of objects to which the rule applies. The filter can be based on a key name prefix,
     * object tags, or a combination of both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status whether the rule is in effect.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more lifecycle transition and expiration actions that you want Amazon S3 to perform on the objects
     * identified by the filter. If the state of your bucket is versioning-enabled or versioning-suspended, you can have
     * many versions of the same object (one current version and zero or more noncurrent versions). Amazon S3 provides
     * predefined actions that you can specify for current and noncurrent object versions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle Management</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html">Lifecycle Configuration
     * Elements</a>.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * By default, all Amazon S3 resources are private, including buckets, objects, and related subresources (for
     * example, lifecycle configuration and website configuration). Only the resource owner (that is, the Amazon Web
     * Services account that created it) can access the resource. The resource owner can optionally grant access
     * permissions to others by writing an access policy. For this operation, a user must get the
     * <code>s3:PutLifecycleConfiguration</code> permission.
     * </p>
     * <p>
     * You can also explicitly deny permissions. Explicit deny also supersedes any other permissions. If you want to
     * block users or accounts from removing or deleting objects from your bucket, you must deny them permissions for
     * the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3:DeleteObject</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:DeleteObjectVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3:PutLifecycleConfiguration</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * The following are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-configuration-examples.html">Examples of
     * Lifecycle Configuration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketLifecycleConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketLifecycleConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketLifecycleConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketLifecycleConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketLifecycleConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketLifecycleConfiguration
     */
    default PutBucketLifecycleConfigurationResponse putBucketLifecycleConfiguration(
            Consumer<PutBucketLifecycleConfigurationRequest.Builder> putBucketLifecycleConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketLifecycleConfiguration(PutBucketLifecycleConfigurationRequest.builder()
                .applyMutation(putBucketLifecycleConfigurationRequest).build());
    }

    /**
     * <p>
     * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging
     * parameters. All logs are saved to buckets in the same Amazon Web Services Region as the source bucket. To set the
     * logging status of a bucket, you must be the bucket owner.
     * </p>
     * <p>
     * The bucket owner is automatically granted FULL_CONTROL to all logs. You use the <code>Grantee</code> request
     * element to grant access to other people. The <code>Permissions</code> request element specifies the kind of
     * access the grantee has to the logs.
     * </p>
     * <important>
     * <p>
     * If the target bucket for log delivery uses the bucket owner enforced setting for S3 Object Ownership, you can't
     * use the <code>Grantee</code> request element to grant access to others. Permissions can only be granted using
     * policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/enable-server-access-logging.html#grant-log-delivery-permissions-general"
     * >Permissions for server access log delivery</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code> &lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;&lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging, you use LoggingEnabled and its children request elements. To disable logging, you use an empty
     * BucketLoggingStatus request element:
     * </p>
     * <p>
     * <code>&lt;BucketLoggingStatus xmlns="http://doc.s3.amazonaws.com/2006-03-01" /&gt;</code>
     * </p>
     * <p>
     * For more information about server access logging, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html">Server Access Logging</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For more information about creating a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>. For more
     * information about returning the logging status of a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLogging.html">GetBucketLogging</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketLogging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLogging.html">GetBucketLogging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketLoggingRequest
     * @return Result of the PutBucketLogging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketLogging
     */
    default PutBucketLoggingResponse putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging
     * parameters. All logs are saved to buckets in the same Amazon Web Services Region as the source bucket. To set the
     * logging status of a bucket, you must be the bucket owner.
     * </p>
     * <p>
     * The bucket owner is automatically granted FULL_CONTROL to all logs. You use the <code>Grantee</code> request
     * element to grant access to other people. The <code>Permissions</code> request element specifies the kind of
     * access the grantee has to the logs.
     * </p>
     * <important>
     * <p>
     * If the target bucket for log delivery uses the bucket owner enforced setting for S3 Object Ownership, you can't
     * use the <code>Grantee</code> request element to grant access to others. Permissions can only be granted using
     * policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/enable-server-access-logging.html#grant-log-delivery-permissions-general"
     * >Permissions for server access log delivery</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code> &lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;&lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging, you use LoggingEnabled and its children request elements. To disable logging, you use an empty
     * BucketLoggingStatus request element:
     * </p>
     * <p>
     * <code>&lt;BucketLoggingStatus xmlns="http://doc.s3.amazonaws.com/2006-03-01" /&gt;</code>
     * </p>
     * <p>
     * For more information about server access logging, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html">Server Access Logging</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For more information about creating a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>. For more
     * information about returning the logging status of a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLogging.html">GetBucketLogging</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketLogging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLogging.html">GetBucketLogging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketLoggingRequest.Builder} avoiding the need
     * to create one manually via {@link PutBucketLoggingRequest#builder()}
     * </p>
     *
     * @param putBucketLoggingRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketLoggingRequest.Builder} to create a request.
     * @return Result of the PutBucketLogging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketLogging
     */
    default PutBucketLoggingResponse putBucketLogging(Consumer<PutBucketLoggingRequest.Builder> putBucketLoggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketLogging(PutBucketLoggingRequest.builder().applyMutation(putBucketLoggingRequest).build());
    }

    /**
     * <p>
     * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket. You can have up to 1,000
     * metrics configurations per bucket. If you're updating an existing metrics configuration, note that this is a full
     * replacement of the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetBucketLifecycle</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>TooManyConfigurations</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: HTTP 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param putBucketMetricsConfigurationRequest
     * @return Result of the PutBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketMetricsConfiguration
     */
    default PutBucketMetricsConfigurationResponse putBucketMetricsConfiguration(
            PutBucketMetricsConfigurationRequest putBucketMetricsConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket. You can have up to 1,000
     * metrics configurations per bucket. If you're updating an existing metrics configuration, note that this is a full
     * replacement of the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutMetricsConfiguration</code> action.
     * The bucket owner has this permission by default. The bucket owner can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * For information about CloudWatch request metrics for Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html">Monitoring Metrics with Amazon
     * CloudWatch</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketMetricsConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketMetricsConfiguration.html">
     * DeleteBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketMetricsConfiguration.html">
     * GetBucketMetricsConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListBucketMetricsConfigurations.html">
     * ListBucketMetricsConfigurations</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetBucketLifecycle</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>TooManyConfigurations</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: You are attempting to create a new configuration but have already reached the 1,000-configuration
     * limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: HTTP 400 Bad Request
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketMetricsConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketMetricsConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketMetricsConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketMetricsConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketMetricsConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketMetricsConfiguration
     */
    default PutBucketMetricsConfigurationResponse putBucketMetricsConfiguration(
            Consumer<PutBucketMetricsConfigurationRequest.Builder> putBucketMetricsConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketMetricsConfiguration(PutBucketMetricsConfigurationRequest.builder()
                .applyMutation(putBucketMetricsConfigurationRequest).build());
    }

    /**
     * <p>
     * Enables notifications of specified events for a bucket. For more information about event notifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event
     * Notifications</a>.
     * </p>
     * <p>
     * Using this API, you can replace an existing notification configuration. The configuration is an XML file that
     * defines the event types that you want Amazon S3 to publish and the destination where you want Amazon S3 to
     * publish an event notification when it detects an event of the specified type.
     * </p>
     * <p>
     * By default, your bucket has no event notifications configured. That is, the notification configuration will be an
     * empty <code>NotificationConfiguration</code>.
     * </p>
     * <p>
     * <code>&lt;NotificationConfiguration&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/NotificationConfiguration&gt;</code>
     * </p>
     * <p>
     * This action replaces the existing notification configuration with the configuration you include in the request
     * body.
     * </p>
     * <p>
     * After Amazon S3 receives this request, it first verifies that any Amazon Simple Notification Service (Amazon SNS)
     * or Amazon Simple Queue Service (Amazon SQS) destination exists, and that the bucket owner has permission to
     * publish to it by sending a test notification. In the case of Lambda destinations, Amazon S3 verifies that the
     * Lambda function permissions grant Amazon S3 permission to invoke the function from the Amazon S3 bucket. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Notifications for Amazon S3 Events</a>.
     * </p>
     * <p>
     * You can disable notifications by adding the empty NotificationConfiguration element.
     * </p>
     * <p>
     * For more information about the number of event notification configurations that you can create per bucket, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/s3.html#limits_s3">Amazon S3 service quotas</a> in <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * By default, only the bucket owner can configure notifications on a bucket. However, bucket owners can use a
     * bucket policy to grant permission to other users to set this configuration with
     * <code>s3:PutBucketNotification</code> permission.
     * </p>
     * <note>
     * <p>
     * The PUT notification is an atomic operation. For example, suppose your notification configuration includes SNS
     * topic, SQS queue, and Lambda function configurations. When you send a PUT request with this configuration, Amazon
     * S3 sends test messages to your SNS topic. If the message fails, the entire PUT action will fail, and Amazon S3
     * will not add the configuration to your bucket.
     * </p>
     * </note>
     * <p>
     * <b>Responses</b>
     * </p>
     * <p>
     * If the configuration in the request body includes only one <code>TopicConfiguration</code> specifying only the
     * <code>s3:ReducedRedundancyLostObject</code> event type, the response will also include the
     * <code>x-amz-sns-test-message-id</code> header containing the message ID of the test notification sent to the
     * topic.
     * </p>
     * <p>
     * The following action is related to <code>PutBucketNotificationConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketNotificationConfiguration.html">
     * GetBucketNotificationConfiguration</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketNotificationConfigurationRequest
     * @return Result of the PutBucketNotificationConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketNotificationConfiguration
     */
    default PutBucketNotificationConfigurationResponse putBucketNotificationConfiguration(
            PutBucketNotificationConfigurationRequest putBucketNotificationConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Enables notifications of specified events for a bucket. For more information about event notifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event
     * Notifications</a>.
     * </p>
     * <p>
     * Using this API, you can replace an existing notification configuration. The configuration is an XML file that
     * defines the event types that you want Amazon S3 to publish and the destination where you want Amazon S3 to
     * publish an event notification when it detects an event of the specified type.
     * </p>
     * <p>
     * By default, your bucket has no event notifications configured. That is, the notification configuration will be an
     * empty <code>NotificationConfiguration</code>.
     * </p>
     * <p>
     * <code>&lt;NotificationConfiguration&gt;</code>
     * </p>
     * <p>
     * <code>&lt;/NotificationConfiguration&gt;</code>
     * </p>
     * <p>
     * This action replaces the existing notification configuration with the configuration you include in the request
     * body.
     * </p>
     * <p>
     * After Amazon S3 receives this request, it first verifies that any Amazon Simple Notification Service (Amazon SNS)
     * or Amazon Simple Queue Service (Amazon SQS) destination exists, and that the bucket owner has permission to
     * publish to it by sending a test notification. In the case of Lambda destinations, Amazon S3 verifies that the
     * Lambda function permissions grant Amazon S3 permission to invoke the function from the Amazon S3 bucket. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Notifications for Amazon S3 Events</a>.
     * </p>
     * <p>
     * You can disable notifications by adding the empty NotificationConfiguration element.
     * </p>
     * <p>
     * For more information about the number of event notification configurations that you can create per bucket, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/s3.html#limits_s3">Amazon S3 service quotas</a> in <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * By default, only the bucket owner can configure notifications on a bucket. However, bucket owners can use a
     * bucket policy to grant permission to other users to set this configuration with
     * <code>s3:PutBucketNotification</code> permission.
     * </p>
     * <note>
     * <p>
     * The PUT notification is an atomic operation. For example, suppose your notification configuration includes SNS
     * topic, SQS queue, and Lambda function configurations. When you send a PUT request with this configuration, Amazon
     * S3 sends test messages to your SNS topic. If the message fails, the entire PUT action will fail, and Amazon S3
     * will not add the configuration to your bucket.
     * </p>
     * </note>
     * <p>
     * <b>Responses</b>
     * </p>
     * <p>
     * If the configuration in the request body includes only one <code>TopicConfiguration</code> specifying only the
     * <code>s3:ReducedRedundancyLostObject</code> event type, the response will also include the
     * <code>x-amz-sns-test-message-id</code> header containing the message ID of the test notification sent to the
     * topic.
     * </p>
     * <p>
     * The following action is related to <code>PutBucketNotificationConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketNotificationConfiguration.html">
     * GetBucketNotificationConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketNotificationConfigurationRequest.Builder}
     * avoiding the need to create one manually via {@link PutBucketNotificationConfigurationRequest#builder()}
     * </p>
     *
     * @param putBucketNotificationConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketNotificationConfigurationRequest.Builder} to
     *        create a request.
     * @return Result of the PutBucketNotificationConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketNotificationConfiguration
     */
    default PutBucketNotificationConfigurationResponse putBucketNotificationConfiguration(
            Consumer<PutBucketNotificationConfigurationRequest.Builder> putBucketNotificationConfigurationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketNotificationConfiguration(PutBucketNotificationConfigurationRequest.builder()
                .applyMutation(putBucketNotificationConfigurationRequest).build());
    }

    /**
     * <p>
     * Creates or modifies <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have
     * the <code>s3:PutBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/user-guide/using-with-s3-actions.html">Specifying
     * permissions in a policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/user-guide/about-object-ownership.html">Using object
     * ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketOwnershipControlsRequest
     * @return Result of the PutBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketOwnershipControls
     */
    default PutBucketOwnershipControlsResponse putBucketOwnershipControls(
            PutBucketOwnershipControlsRequest putBucketOwnershipControlsRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates or modifies <code>OwnershipControls</code> for an Amazon S3 bucket. To use this operation, you must have
     * the <code>s3:PutBucketOwnershipControls</code> permission. For more information about Amazon S3 permissions, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/user-guide/using-with-s3-actions.html">Specifying
     * permissions in a policy</a>.
     * </p>
     * <p>
     * For information about Amazon S3 Object Ownership, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/user-guide/about-object-ownership.html">Using object
     * ownership</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketOwnershipControls</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetBucketOwnershipControls</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBucketOwnershipControls</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketOwnershipControlsRequest.Builder} avoiding
     * the need to create one manually via {@link PutBucketOwnershipControlsRequest#builder()}
     * </p>
     *
     * @param putBucketOwnershipControlsRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketOwnershipControlsRequest.Builder} to create a
     *        request.
     * @return Result of the PutBucketOwnershipControls operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketOwnershipControls
     */
    default PutBucketOwnershipControlsResponse putBucketOwnershipControls(
            Consumer<PutBucketOwnershipControlsRequest.Builder> putBucketOwnershipControlsRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putBucketOwnershipControls(PutBucketOwnershipControlsRequest.builder()
                .applyMutation(putBucketOwnershipControlsRequest).build());
    }

    /**
     * <p>
     * Applies an Amazon S3 bucket policy to an Amazon S3 bucket. If you are using an identity other than the root user
     * of the Amazon Web Services account that owns the bucket, the calling identity must have the
     * <code>PutBucketPolicy</code> permissions on the specified bucket and belong to the bucket owner's account in
     * order to use this operation.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html">Bucket policy
     * examples</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketPolicyRequest
     * @return Result of the PutBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketPolicy
     */
    default PutBucketPolicyResponse putBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Applies an Amazon S3 bucket policy to an Amazon S3 bucket. If you are using an identity other than the root user
     * of the Amazon Web Services account that owns the bucket, the calling identity must have the
     * <code>PutBucketPolicy</code> permissions on the specified bucket and belong to the bucket owner's account in
     * order to use this operation.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * operation, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html">Bucket policy
     * examples</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketPolicyRequest.Builder} avoiding the need
     * to create one manually via {@link PutBucketPolicyRequest#builder()}
     * </p>
     *
     * @param putBucketPolicyRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketPolicyRequest.Builder} to create a request.
     * @return Result of the PutBucketPolicy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketPolicy
     */
    default PutBucketPolicyResponse putBucketPolicy(Consumer<PutBucketPolicyRequest.Builder> putBucketPolicyRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketPolicy(PutBucketPolicyRequest.builder().applyMutation(putBucketPolicyRequest).build());
    }

    /**
     * <p>
     * Creates a replication configuration or replaces an existing one. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * Specify the replication configuration in the request body. In the replication configuration, you provide the name
     * of the destination bucket or buckets where you want Amazon S3 to replicate objects, the IAM role that Amazon S3
     * can assume to replicate objects on your behalf, and other relevant information.
     * </p>
     * <p>
     * A replication configuration must include at least one rule, and can contain a maximum of 1,000. Each rule
     * identifies a subset of objects to replicate by filtering the objects in the source bucket. To choose additional
     * subsets of objects to replicate, add a rule for each subset.
     * </p>
     * <p>
     * To specify a subset of the objects in the source bucket to apply a replication rule to, add the Filter element as
     * a child of the Rule element. You can filter objects based on an object key prefix, one or more object tags, or
     * both. When you add the Filter element in the configuration, you must also add the following elements:
     * <code>DeleteMarkerReplication</code>, <code>Status</code>, and <code>Priority</code>.
     * </p>
     * <note>
     * <p>
     * If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete
     * markers differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     * <p>
     * For information about enabling versioning on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html">Using Versioning</a>.
     * </p>
     * <p>
     * <b>Handling Replication of Encrypted Objects</b>
     * </p>
     * <p>
     * By default, Amazon S3 doesn't replicate objects that are stored at rest using server-side encryption with KMS
     * keys. To replicate Amazon Web Services KMS-encrypted objects, add the following:
     * <code>SourceSelectionCriteria</code>, <code>SseKmsEncryptedObjects</code>, <code>Status</code>,
     * <code>EncryptionConfiguration</code>, and <code>ReplicaKmsKeyID</code>. For information about replication
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-config-for-kms-objects.html">Replicating
     * Objects Created with SSE Using KMS keys</a>.
     * </p>
     * <p>
     * For information on <code>PutBucketReplication</code> errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ReplicationErrorCodeList">List of
     * replication-related error codes</a>
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * To create a <code>PutBucketReplication</code> request, you must have <code>s3:PutReplicationConfiguration</code>
     * permissions for the bucket.
     * </p>
     * <p>
     * By default, a resource owner, in this case the Amazon Web Services account that created the bucket, can perform
     * this operation. The resource owner can also grant others permissions to perform the operation. For more
     * information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing
     * Access Permissions to Your Amazon S3 Resources</a>.
     * </p>
     * <note>
     * <p>
     * To perform this operation, the user or role performing the action must have the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">iam:PassRole</a> permission.
     * </p>
     * </note>
     * <p>
     * The following operations are related to <code>PutBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html">DeleteBucketReplication
     * </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketReplicationRequest
     * @return Result of the PutBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketReplication
     */
    default PutBucketReplicationResponse putBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates a replication configuration or replaces an existing one. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html">Replication</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * <p>
     * Specify the replication configuration in the request body. In the replication configuration, you provide the name
     * of the destination bucket or buckets where you want Amazon S3 to replicate objects, the IAM role that Amazon S3
     * can assume to replicate objects on your behalf, and other relevant information.
     * </p>
     * <p>
     * A replication configuration must include at least one rule, and can contain a maximum of 1,000. Each rule
     * identifies a subset of objects to replicate by filtering the objects in the source bucket. To choose additional
     * subsets of objects to replicate, add a rule for each subset.
     * </p>
     * <p>
     * To specify a subset of the objects in the source bucket to apply a replication rule to, add the Filter element as
     * a child of the Rule element. You can filter objects based on an object key prefix, one or more object tags, or
     * both. When you add the Filter element in the configuration, you must also add the following elements:
     * <code>DeleteMarkerReplication</code>, <code>Status</code>, and <code>Priority</code>.
     * </p>
     * <note>
     * <p>
     * If you are using an earlier version of the replication configuration, Amazon S3 handles replication of delete
     * markers differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     * <p>
     * For information about enabling versioning on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html">Using Versioning</a>.
     * </p>
     * <p>
     * <b>Handling Replication of Encrypted Objects</b>
     * </p>
     * <p>
     * By default, Amazon S3 doesn't replicate objects that are stored at rest using server-side encryption with KMS
     * keys. To replicate Amazon Web Services KMS-encrypted objects, add the following:
     * <code>SourceSelectionCriteria</code>, <code>SseKmsEncryptedObjects</code>, <code>Status</code>,
     * <code>EncryptionConfiguration</code>, and <code>ReplicaKmsKeyID</code>. For information about replication
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-config-for-kms-objects.html">Replicating
     * Objects Created with SSE Using KMS keys</a>.
     * </p>
     * <p>
     * For information on <code>PutBucketReplication</code> errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ReplicationErrorCodeList">List of
     * replication-related error codes</a>
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * To create a <code>PutBucketReplication</code> request, you must have <code>s3:PutReplicationConfiguration</code>
     * permissions for the bucket.
     * </p>
     * <p>
     * By default, a resource owner, in this case the Amazon Web Services account that created the bucket, can perform
     * this operation. The resource owner can also grant others permissions to perform the operation. For more
     * information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing
     * Access Permissions to Your Amazon S3 Resources</a>.
     * </p>
     * <note>
     * <p>
     * To perform this operation, the user or role performing the action must have the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">iam:PassRole</a> permission.
     * </p>
     * </note>
     * <p>
     * The following operations are related to <code>PutBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html">DeleteBucketReplication
     * </a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketReplicationRequest.Builder} avoiding the
     * need to create one manually via {@link PutBucketReplicationRequest#builder()}
     * </p>
     *
     * @param putBucketReplicationRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketReplicationRequest.Builder} to create a
     *        request.
     * @return Result of the PutBucketReplication operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketReplication
     */
    default PutBucketReplicationResponse putBucketReplication(
            Consumer<PutBucketReplicationRequest.Builder> putBucketReplicationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putBucketReplication(PutBucketReplicationRequest.builder().applyMutation(putBucketReplicationRequest).build());
    }

    /**
     * <p>
     * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the
     * bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the
     * download will be charged for the download. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html">Requester Pays Buckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketRequestPayment</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketRequestPayment.html">GetBucketRequestPayment
     * </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketRequestPaymentRequest
     * @return Result of the PutBucketRequestPayment operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketRequestPayment
     */
    default PutBucketRequestPaymentResponse putBucketRequestPayment(PutBucketRequestPaymentRequest putBucketRequestPaymentRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the
     * bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the
     * download will be charged for the download. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html">Requester Pays Buckets</a>.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketRequestPayment</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketRequestPayment.html">GetBucketRequestPayment
     * </a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketRequestPaymentRequest.Builder} avoiding
     * the need to create one manually via {@link PutBucketRequestPaymentRequest#builder()}
     * </p>
     *
     * @param putBucketRequestPaymentRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketRequestPaymentRequest.Builder} to create a
     *        request.
     * @return Result of the PutBucketRequestPayment operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketRequestPayment
     */
    default PutBucketRequestPaymentResponse putBucketRequestPayment(
            Consumer<PutBucketRequestPaymentRequest.Builder> putBucketRequestPaymentRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putBucketRequestPayment(PutBucketRequestPaymentRequest.builder().applyMutation(putBucketRequestPaymentRequest)
                .build());
    }

    /**
     * <p>
     * Sets the tags for a bucket.
     * </p>
     * <p>
     * Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get
     * your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources,
     * organize your billing information according to resources with the same tag key values. For example, you can tag
     * several resources with a specific application name, and then organize your billing information to see the total
     * cost of that application across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost Allocation and
     * Tagging</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CostAllocTagging.html">Using Cost
     * Allocation in Amazon S3 Bucket Tags</a>.
     * </p>
     * <note>
     * <p>
     * When this operation sets the tags for a bucket, it will overwrite any current tags the bucket already has. You
     * cannot use this operation to add tags to an existing list of tags.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutBucketTagging</code> action. The
     * bucket owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html">Amazon Web
     * Services-Generated Cost Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Please try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketTaggingRequest
     * @return Result of the PutBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketTagging
     */
    default PutBucketTaggingResponse putBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the tags for a bucket.
     * </p>
     * <p>
     * Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get
     * your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources,
     * organize your billing information according to resources with the same tag key values. For example, you can tag
     * several resources with a specific application name, and then organize your billing information to see the total
     * cost of that application across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost Allocation and
     * Tagging</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/CostAllocTagging.html">Using Cost
     * Allocation in Amazon S3 Bucket Tags</a>.
     * </p>
     * <note>
     * <p>
     * When this operation sets the tags for a bucket, it will overwrite any current tags the bucket already has. You
     * cannot use this operation to add tags to an existing list of tags.
     * </p>
     * </note>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:PutBucketTagging</code> action. The
     * bucket owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html">Amazon Web
     * Services-Generated Cost Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Please try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following operations are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketTaggingRequest.Builder} avoiding the need
     * to create one manually via {@link PutBucketTaggingRequest#builder()}
     * </p>
     *
     * @param putBucketTaggingRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketTaggingRequest.Builder} to create a request.
     * @return Result of the PutBucketTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketTagging
     */
    default PutBucketTaggingResponse putBucketTagging(Consumer<PutBucketTaggingRequest.Builder> putBucketTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketTagging(PutBucketTaggingRequest.builder().applyMutation(putBucketTaggingRequest).build());
    }

    /**
     * <p>
     * Sets the versioning state of an existing bucket.
     * </p>
     * <p>
     * You can set the versioning state with one of the following values:
     * </p>
     * <p>
     * <b>Enabled</b>—Enables versioning for the objects in the bucket. All objects added to the bucket receive a unique
     * version ID.
     * </p>
     * <p>
     * <b>Suspended</b>—Disables versioning for the objects in the bucket. All objects added to the bucket receive the
     * version ID null.
     * </p>
     * <p>
     * If the versioning state has never been set on a bucket, it has no versioning state; a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>
     * request does not return a versioning state value.
     * </p>
     * <p>
     * In order to enable MFA Delete, you must be the bucket owner. If you are the bucket owner and want to enable MFA
     * Delete in the bucket versioning configuration, you must include the <code>x-amz-mfa request</code> header and the
     * <code>Status</code> and the <code>MfaDelete</code> request elements in a request to set the versioning state of
     * the bucket.
     * </p>
     * <important>
     * <p>
     * If you have an object expiration lifecycle policy in your non-versioned bucket and you want to maintain the same
     * permanent delete behavior when you enable versioning, you must add a noncurrent expiration policy. The noncurrent
     * expiration lifecycle policy will manage the deletes of the noncurrent object versions in the version-enabled
     * bucket. (A version-enabled bucket maintains one current and zero or more noncurrent object versions.) For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-and-other-bucket-config"
     * >Lifecycle and Versioning</a>.
     * </p>
     * </important>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putBucketVersioningRequest
     * @return Result of the PutBucketVersioning operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketVersioning
     */
    default PutBucketVersioningResponse putBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the versioning state of an existing bucket.
     * </p>
     * <p>
     * You can set the versioning state with one of the following values:
     * </p>
     * <p>
     * <b>Enabled</b>—Enables versioning for the objects in the bucket. All objects added to the bucket receive a unique
     * version ID.
     * </p>
     * <p>
     * <b>Suspended</b>—Disables versioning for the objects in the bucket. All objects added to the bucket receive the
     * version ID null.
     * </p>
     * <p>
     * If the versioning state has never been set on a bucket, it has no versioning state; a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>
     * request does not return a versioning state value.
     * </p>
     * <p>
     * In order to enable MFA Delete, you must be the bucket owner. If you are the bucket owner and want to enable MFA
     * Delete in the bucket versioning configuration, you must include the <code>x-amz-mfa request</code> header and the
     * <code>Status</code> and the <code>MfaDelete</code> request elements in a request to set the versioning state of
     * the bucket.
     * </p>
     * <important>
     * <p>
     * If you have an object expiration lifecycle policy in your non-versioned bucket and you want to maintain the same
     * permanent delete behavior when you enable versioning, you must add a noncurrent expiration policy. The noncurrent
     * expiration lifecycle policy will manage the deletes of the noncurrent object versions in the version-enabled
     * bucket. (A version-enabled bucket maintains one current and zero or more noncurrent object versions.) For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html#lifecycle-and-other-bucket-config"
     * >Lifecycle and Versioning</a>.
     * </p>
     * </important>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketVersioningRequest.Builder} avoiding the
     * need to create one manually via {@link PutBucketVersioningRequest#builder()}
     * </p>
     *
     * @param putBucketVersioningRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketVersioningRequest.Builder} to create a
     *        request.
     * @return Result of the PutBucketVersioning operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketVersioning
     */
    default PutBucketVersioningResponse putBucketVersioning(
            Consumer<PutBucketVersioningRequest.Builder> putBucketVersioningRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putBucketVersioning(PutBucketVersioningRequest.builder().applyMutation(putBucketVersioningRequest).build());
    }

    /**
     * <p>
     * Sets the configuration of the website that is specified in the <code>website</code> subresource. To configure a
     * bucket as a website, you can add this subresource on the bucket with website configuration information such as
     * the file name of the index document and any redirect rules. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * This PUT action requires the <code>S3:PutBucketWebsite</code> permission. By default, only the bucket owner can
     * configure the website attached to a bucket; however, bucket owners can allow other users to set the website
     * configuration by writing a bucket policy that grants them the <code>S3:PutBucketWebsite</code> permission.
     * </p>
     * <p>
     * To redirect all website requests sent to the bucket's website endpoint, you add a website configuration with the
     * following elements. Because all requests are sent to another website, you don't need to provide index document
     * name for the bucket.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WebsiteConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedirectAllRequestsTo</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Protocol</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want granular control over redirects, you can use the following elements to add routing rules that
     * describe conditions for redirecting requests and information about the redirect destination. In this case, the
     * website configuration must provide an index document for the bucket, because some requests might not be
     * redirected.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WebsiteConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexDocument</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suffix</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorDocument</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoutingRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoutingRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Condition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCodeReturnedEquals</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyPrefixEquals</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redirect</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Protocol</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceKeyPrefixWith</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceKeyWith</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpRedirectCode</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon S3 has a limitation of 50 routing rules per website configuration. If you require more than 50 routing
     * rules, you can use object redirect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html">Configuring an Object
     * Redirect</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param putBucketWebsiteRequest
     * @return Result of the PutBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketWebsite
     */
    default PutBucketWebsiteResponse putBucketWebsite(PutBucketWebsiteRequest putBucketWebsiteRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the configuration of the website that is specified in the <code>website</code> subresource. To configure a
     * bucket as a website, you can add this subresource on the bucket with website configuration information such as
     * the file name of the index document and any redirect rules. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3</a>.
     * </p>
     * <p>
     * This PUT action requires the <code>S3:PutBucketWebsite</code> permission. By default, only the bucket owner can
     * configure the website attached to a bucket; however, bucket owners can allow other users to set the website
     * configuration by writing a bucket policy that grants them the <code>S3:PutBucketWebsite</code> permission.
     * </p>
     * <p>
     * To redirect all website requests sent to the bucket's website endpoint, you add a website configuration with the
     * following elements. Because all requests are sent to another website, you don't need to provide index document
     * name for the bucket.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WebsiteConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedirectAllRequestsTo</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Protocol</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want granular control over redirects, you can use the following elements to add routing rules that
     * describe conditions for redirecting requests and information about the redirect destination. In this case, the
     * website configuration must provide an index document for the bucket, because some requests might not be
     * redirected.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WebsiteConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexDocument</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suffix</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorDocument</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoutingRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoutingRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Condition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpErrorCodeReturnedEquals</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyPrefixEquals</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Redirect</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Protocol</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HostName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceKeyPrefixWith</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplaceKeyWith</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HttpRedirectCode</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon S3 has a limitation of 50 routing rules per website configuration. If you require more than 50 routing
     * rules, you can use object redirect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html">Configuring an Object
     * Redirect</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutBucketWebsiteRequest.Builder} avoiding the need
     * to create one manually via {@link PutBucketWebsiteRequest#builder()}
     * </p>
     *
     * @param putBucketWebsiteRequest
     *        A {@link Consumer} that will call methods on {@link PutBucketWebsiteRequest.Builder} to create a request.
     * @return Result of the PutBucketWebsite operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutBucketWebsite
     */
    default PutBucketWebsiteResponse putBucketWebsite(Consumer<PutBucketWebsiteRequest.Builder> putBucketWebsiteRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putBucketWebsite(PutBucketWebsiteRequest.builder().applyMutation(putBucketWebsiteRequest).build());
    }

    /**
     * <p>
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     * </p>
     * <p>
     * Amazon S3 never adds partial objects; if you receive a success response, Amazon S3 added the entire object to the
     * bucket.
     * </p>
     * <p>
     * Amazon S3 is a distributed system. If it receives multiple write requests for the same object simultaneously, it
     * overwrites all but the last object written. Amazon S3 does not provide object locking; if you need this, make
     * sure to build it into your application layer or use versioning instead.
     * </p>
     * <p>
     * To ensure that data is not corrupted traversing the network, use the <code>Content-MD5</code> header. When you
     * use this header, Amazon S3 checks the object against the provided MD5 value and, if they do not match, returns an
     * error. Additionally, you can calculate the MD5 while putting an object to Amazon S3 and compare the returned ETag
     * to the calculated MD5 value.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To successfully complete the <code>PutObject</code> request, you must have the <code>s3:PutObject</code> in your
     * IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To successfully change the objects acl of your <code>PutObject</code> request, you must have the
     * <code>s3:PutObjectAcl</code> in your IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Content-MD5</code> header is required for any request to upload an object with a retention period
     * configured using Amazon S3 Object Lock. For more information about Amazon S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html">Amazon S3 Object Lock
     * Overview</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Server-side Encryption</b>
     * </p>
     * <p>
     * You can optionally request server-side encryption. With server-side encryption, Amazon S3 encrypts your data as
     * it writes it to disks in its data centers and decrypts the data when you access it. You have the option to
     * provide your own encryption key or use Amazon Web Services managed encryption keys (SSE-S3 or SSE-KMS). For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using
     * Server-Side Encryption</a>.
     * </p>
     * <p>
     * If you request server-side encryption using Amazon Web Services Key Management Service (SSE-KMS), you can enable
     * an S3 Bucket Key at the object-level. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * You can use headers to grant ACL- based permissions. By default, all objects are private. Only the owner has full
     * access control. When adding a new object, you can grant permissions to individual Amazon Web Services accounts or
     * to predefined groups defined by Amazon S3. These permissions are then added to the ACL on the object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing
     * ACLs Using the REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're uploading objects to uses the bucket owner enforced setting for S3 Object Ownership,
     * ACLs are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that
     * don't specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * PUT requests that contain other ACLs (for example, custom grants to certain Amazon Web Services accounts) fail
     * and return a <code>400</code> error with the error code <code>AccessControlListNotSupported</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being
     * stored. Amazon S3 returns this ID in the response. When you enable versioning for a bucket, if Amazon S3 receives
     * multiple write requests for the same object simultaneously, it stores all of the objects.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/AddingObjectstoVersioningEnabledBuckets.html">Adding
     * Objects to Versioning Enabled Buckets</a>. For information about returning the versioning state of a bucket, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putObjectRequest
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the PutObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObject
     */
    default PutObjectResponse putObject(PutObjectRequest putObjectRequest, RequestBody requestBody) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     * </p>
     * <p>
     * Amazon S3 never adds partial objects; if you receive a success response, Amazon S3 added the entire object to the
     * bucket.
     * </p>
     * <p>
     * Amazon S3 is a distributed system. If it receives multiple write requests for the same object simultaneously, it
     * overwrites all but the last object written. Amazon S3 does not provide object locking; if you need this, make
     * sure to build it into your application layer or use versioning instead.
     * </p>
     * <p>
     * To ensure that data is not corrupted traversing the network, use the <code>Content-MD5</code> header. When you
     * use this header, Amazon S3 checks the object against the provided MD5 value and, if they do not match, returns an
     * error. Additionally, you can calculate the MD5 while putting an object to Amazon S3 and compare the returned ETag
     * to the calculated MD5 value.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To successfully complete the <code>PutObject</code> request, you must have the <code>s3:PutObject</code> in your
     * IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To successfully change the objects acl of your <code>PutObject</code> request, you must have the
     * <code>s3:PutObjectAcl</code> in your IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Content-MD5</code> header is required for any request to upload an object with a retention period
     * configured using Amazon S3 Object Lock. For more information about Amazon S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html">Amazon S3 Object Lock
     * Overview</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Server-side Encryption</b>
     * </p>
     * <p>
     * You can optionally request server-side encryption. With server-side encryption, Amazon S3 encrypts your data as
     * it writes it to disks in its data centers and decrypts the data when you access it. You have the option to
     * provide your own encryption key or use Amazon Web Services managed encryption keys (SSE-S3 or SSE-KMS). For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using
     * Server-Side Encryption</a>.
     * </p>
     * <p>
     * If you request server-side encryption using Amazon Web Services Key Management Service (SSE-KMS), you can enable
     * an S3 Bucket Key at the object-level. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * You can use headers to grant ACL- based permissions. By default, all objects are private. Only the owner has full
     * access control. When adding a new object, you can grant permissions to individual Amazon Web Services accounts or
     * to predefined groups defined by Amazon S3. These permissions are then added to the ACL on the object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing
     * ACLs Using the REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're uploading objects to uses the bucket owner enforced setting for S3 Object Ownership,
     * ACLs are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that
     * don't specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * PUT requests that contain other ACLs (for example, custom grants to certain Amazon Web Services accounts) fail
     * and return a <code>400</code> error with the error code <code>AccessControlListNotSupported</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being
     * stored. Amazon S3 returns this ID in the response. When you enable versioning for a bucket, if Amazon S3 receives
     * multiple write requests for the same object simultaneously, it stores all of the objects.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/AddingObjectstoVersioningEnabledBuckets.html">Adding
     * Objects to Versioning Enabled Buckets</a>. For information about returning the versioning state of a bucket, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectRequest.Builder} avoiding the need to
     * create one manually via {@link PutObjectRequest#builder()}
     * </p>
     *
     * @param putObjectRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectRequest.Builder} to create a request.
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the PutObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObject
     */
    default PutObjectResponse putObject(Consumer<PutObjectRequest.Builder> putObjectRequest, RequestBody requestBody)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putObject(PutObjectRequest.builder().applyMutation(putObjectRequest).build(), requestBody);
    }

    /**
     * <p>
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     * </p>
     * <p>
     * Amazon S3 never adds partial objects; if you receive a success response, Amazon S3 added the entire object to the
     * bucket.
     * </p>
     * <p>
     * Amazon S3 is a distributed system. If it receives multiple write requests for the same object simultaneously, it
     * overwrites all but the last object written. Amazon S3 does not provide object locking; if you need this, make
     * sure to build it into your application layer or use versioning instead.
     * </p>
     * <p>
     * To ensure that data is not corrupted traversing the network, use the <code>Content-MD5</code> header. When you
     * use this header, Amazon S3 checks the object against the provided MD5 value and, if they do not match, returns an
     * error. Additionally, you can calculate the MD5 while putting an object to Amazon S3 and compare the returned ETag
     * to the calculated MD5 value.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To successfully complete the <code>PutObject</code> request, you must have the <code>s3:PutObject</code> in your
     * IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To successfully change the objects acl of your <code>PutObject</code> request, you must have the
     * <code>s3:PutObjectAcl</code> in your IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Content-MD5</code> header is required for any request to upload an object with a retention period
     * configured using Amazon S3 Object Lock. For more information about Amazon S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html">Amazon S3 Object Lock
     * Overview</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Server-side Encryption</b>
     * </p>
     * <p>
     * You can optionally request server-side encryption. With server-side encryption, Amazon S3 encrypts your data as
     * it writes it to disks in its data centers and decrypts the data when you access it. You have the option to
     * provide your own encryption key or use Amazon Web Services managed encryption keys (SSE-S3 or SSE-KMS). For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using
     * Server-Side Encryption</a>.
     * </p>
     * <p>
     * If you request server-side encryption using Amazon Web Services Key Management Service (SSE-KMS), you can enable
     * an S3 Bucket Key at the object-level. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * You can use headers to grant ACL- based permissions. By default, all objects are private. Only the owner has full
     * access control. When adding a new object, you can grant permissions to individual Amazon Web Services accounts or
     * to predefined groups defined by Amazon S3. These permissions are then added to the ACL on the object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing
     * ACLs Using the REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're uploading objects to uses the bucket owner enforced setting for S3 Object Ownership,
     * ACLs are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that
     * don't specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * PUT requests that contain other ACLs (for example, custom grants to certain Amazon Web Services accounts) fail
     * and return a <code>400</code> error with the error code <code>AccessControlListNotSupported</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being
     * stored. Amazon S3 returns this ID in the response. When you enable versioning for a bucket, if Amazon S3 receives
     * multiple write requests for the same object simultaneously, it stores all of the objects.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/AddingObjectstoVersioningEnabledBuckets.html">Adding
     * Objects to Versioning Enabled Buckets</a>. For information about returning the versioning state of a bucket, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putObjectRequest
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the PutObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObject
     * @see #putObject(PutObjectRequest, RequestBody)
     */
    default PutObjectResponse putObject(PutObjectRequest putObjectRequest, Path sourcePath) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putObject(putObjectRequest, RequestBody.fromFile(sourcePath));
    }

    /**
     * <p>
     * Adds an object to a bucket. You must have WRITE permissions on a bucket to add an object to it.
     * </p>
     * <p>
     * Amazon S3 never adds partial objects; if you receive a success response, Amazon S3 added the entire object to the
     * bucket.
     * </p>
     * <p>
     * Amazon S3 is a distributed system. If it receives multiple write requests for the same object simultaneously, it
     * overwrites all but the last object written. Amazon S3 does not provide object locking; if you need this, make
     * sure to build it into your application layer or use versioning instead.
     * </p>
     * <p>
     * To ensure that data is not corrupted traversing the network, use the <code>Content-MD5</code> header. When you
     * use this header, Amazon S3 checks the object against the provided MD5 value and, if they do not match, returns an
     * error. Additionally, you can calculate the MD5 while putting an object to Amazon S3 and compare the returned ETag
     * to the calculated MD5 value.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To successfully complete the <code>PutObject</code> request, you must have the <code>s3:PutObject</code> in your
     * IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To successfully change the objects acl of your <code>PutObject</code> request, you must have the
     * <code>s3:PutObjectAcl</code> in your IAM permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Content-MD5</code> header is required for any request to upload an object with a retention period
     * configured using Amazon S3 Object Lock. For more information about Amazon S3 Object Lock, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html">Amazon S3 Object Lock
     * Overview</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Server-side Encryption</b>
     * </p>
     * <p>
     * You can optionally request server-side encryption. With server-side encryption, Amazon S3 encrypts your data as
     * it writes it to disks in its data centers and decrypts the data when you access it. You have the option to
     * provide your own encryption key or use Amazon Web Services managed encryption keys (SSE-S3 or SSE-KMS). For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using
     * Server-Side Encryption</a>.
     * </p>
     * <p>
     * If you request server-side encryption using Amazon Web Services Key Management Service (SSE-KMS), you can enable
     * an S3 Bucket Key at the object-level. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html">Amazon S3 Bucket Keys</a> in the <i>Amazon
     * S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Access Control List (ACL)-Specific Request Headers</b>
     * </p>
     * <p>
     * You can use headers to grant ACL- based permissions. By default, all objects are private. Only the owner has full
     * access control. When adding a new object, you can grant permissions to individual Amazon Web Services accounts or
     * to predefined groups defined by Amazon S3. These permissions are then added to the ACL on the object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a> and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-using-rest-api.html">Managing
     * ACLs Using the REST API</a>.
     * </p>
     * <p>
     * If the bucket that you're uploading objects to uses the bucket owner enforced setting for S3 Object Ownership,
     * ACLs are disabled and no longer affect permissions. Buckets that use this setting only accept PUT requests that
     * don't specify an ACL or PUT requests that specify bucket owner full control ACLs, such as the
     * <code>bucket-owner-full-control</code> canned ACL or an equivalent form of this ACL expressed in the XML format.
     * PUT requests that contain other ACLs (for example, custom grants to certain Amazon Web Services accounts) fail
     * and return a <code>400</code> error with the error code <code>AccessControlListNotSupported</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html"> Controlling ownership
     * of objects and disabling ACLs</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If your bucket uses the bucket owner enforced setting for Object Ownership, all objects written to the bucket by
     * any account will be owned by the bucket owner.
     * </p>
     * </note>
     * <p>
     * <b>Storage Class Options</b>
     * </p>
     * <p>
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class
     * provides high durability and high availability. Depending on performance needs, you can specify a different
     * Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being
     * stored. Amazon S3 returns this ID in the response. When you enable versioning for a bucket, if Amazon S3 receives
     * multiple write requests for the same object simultaneously, it stores all of the objects.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/AddingObjectstoVersioningEnabledBuckets.html">Adding
     * Objects to Versioning Enabled Buckets</a>. For information about returning the versioning state of a bucket, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectRequest.Builder} avoiding the need to
     * create one manually via {@link PutObjectRequest#builder()}
     * </p>
     *
     * @param putObjectRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectRequest.Builder} to create a request.
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the PutObject operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObject
     * @see #putObject(PutObjectRequest, RequestBody)
     */
    default PutObjectResponse putObject(Consumer<PutObjectRequest.Builder> putObjectRequest, Path sourcePath)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putObject(PutObjectRequest.builder().applyMutation(putObjectRequest).build(), sourcePath);
    }

    /**
     * <p>
     * Uses the <code>acl</code> subresource to set the access control list (ACL) permissions for a new or existing
     * object in an S3 bucket. You must have <code>WRITE_ACP</code> permission to set the ACL of an object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#permissions">What
     * permissions can I grant?</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * Depending on your application needs, you can choose to set the ACL on an object using either the request body or
     * the headers. For example, if you have an existing application that updates a bucket ACL using the request body,
     * you can continue to use that approach. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, ACLs are disabled and no longer
     * affect permissions. You must use policies to grant access to your bucket and the objects in it. Requests to set
     * ACLs or update ACLs fail and return the <code>AccessControlListNotSupported</code> error code. Requests to read
     * ACLs are still supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Access Permissions</b>
     * </p>
     * <p>
     * You can set access permissions using one of the following methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined ACLs,
     * known as canned ACLs. Each canned ACL has a predefined set of grantees and permissions. Specify the canned ACL
     * name as the value of <code>x-amz-ac</code>l. If you use this header, you cannot use other access control-specific
     * headers in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. When using these headers,
     * you specify explicit access permissions and grantees (Amazon Web Services accounts or Amazon S3 groups) who will
     * receive the permission. If you use these ACL-specific headers, you cannot use <code>x-amz-acl</code> header to
     * set a canned ACL. These parameters map to the set of permissions that Amazon S3 supports in an ACL. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants list objects permission to the two Amazon
     * Web Services accounts identified by their email addresses.
     * </p>
     * <p>
     * <code>x-amz-grant-read: emailAddress="xyz@amazon.com", emailAddress="abc@amazon.com" </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * The ACL of an object is set at the object version level. By default, PUT sets the ACL of the current version of
     * an object. To set the ACL of a different version, use the <code>versionId</code> subresource.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putObjectAclRequest
     * @return Result of the PutObjectAcl operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectAcl
     */
    default PutObjectAclResponse putObjectAcl(PutObjectAclRequest putObjectAclRequest) throws NoSuchKeyException,
            AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Uses the <code>acl</code> subresource to set the access control list (ACL) permissions for a new or existing
     * object in an S3 bucket. You must have <code>WRITE_ACP</code> permission to set the ACL of an object. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#permissions">What
     * permissions can I grant?</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * Depending on your application needs, you can choose to set the ACL on an object using either the request body or
     * the headers. For example, if you have an existing application that updates a bucket ACL using the request body,
     * you can continue to use that approach. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List (ACL) Overview</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If your bucket uses the bucket owner enforced setting for S3 Object Ownership, ACLs are disabled and no longer
     * affect permissions. You must use policies to grant access to your bucket and the objects in it. Requests to set
     * ACLs or update ACLs fail and return the <code>AccessControlListNotSupported</code> error code. Requests to read
     * ACLs are still supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling object
     * ownership</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * <p>
     * <b>Access Permissions</b>
     * </p>
     * <p>
     * You can set access permissions using one of the following methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify a canned ACL with the <code>x-amz-acl</code> request header. Amazon S3 supports a set of predefined ACLs,
     * known as canned ACLs. Each canned ACL has a predefined set of grantees and permissions. Specify the canned ACL
     * name as the value of <code>x-amz-ac</code>l. If you use this header, you cannot use other access control-specific
     * headers in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned ACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify access permissions explicitly with the <code>x-amz-grant-read</code>, <code>x-amz-grant-read-acp</code>,
     * <code>x-amz-grant-write-acp</code>, and <code>x-amz-grant-full-control</code> headers. When using these headers,
     * you specify explicit access permissions and grantees (Amazon Web Services accounts or Amazon S3 groups) who will
     * receive the permission. If you use these ACL-specific headers, you cannot use <code>x-amz-acl</code> header to
     * set a canned ACL. These parameters map to the set of permissions that Amazon S3 supports in an ACL. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html">Access Control List
     * (ACL) Overview</a>.
     * </p>
     * <p>
     * You specify each grantee as a type=value pair, where the type is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>id</code> – if the value specified is the canonical user ID of an Amazon Web Services account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>uri</code> – if you are granting permissions to a predefined group
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>emailAddress</code> – if the value specified is the email address of an Amazon Web Services account
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For example, the following <code>x-amz-grant-read</code> header grants list objects permission to the two Amazon
     * Web Services accounts identified by their email addresses.
     * </p>
     * <p>
     * <code>x-amz-grant-read: emailAddress="xyz@amazon.com", emailAddress="abc@amazon.com" </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either a canned ACL or specify access permissions explicitly. You cannot do both.
     * </p>
     * <p>
     * <b>Grantee Values</b>
     * </p>
     * <p>
     * You can specify the person (grantee) to whom you're assigning access rights (using request elements) in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * By the person's ID:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="CanonicalUser"&gt;&lt;ID&gt;&lt;&gt;ID&lt;&gt;&lt;/ID&gt;&lt;DisplayName&gt;&lt;&gt;GranteesEmail&lt;&gt;&lt;/DisplayName&gt; &lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * DisplayName is optional and ignored in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * By URI:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="Group"&gt;&lt;URI&gt;&lt;&gt;http://acs.amazonaws.com/groups/global/AuthenticatedUsers&lt;&gt;&lt;/URI&gt;&lt;/Grantee&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * By Email address:
     * </p>
     * <p>
     * <code>&lt;Grantee xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="AmazonCustomerByEmail"&gt;&lt;EmailAddress&gt;&lt;&gt;Grantees@email.com&lt;&gt;&lt;/EmailAddress&gt;lt;/Grantee&gt;</code>
     * </p>
     * <p>
     * The grantee is resolved to the CanonicalUser and, in a response to a GET Object acl request, appears as the
     * CanonicalUser.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints</a> in the Amazon
     * Web Services General Reference.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * The ACL of an object is set at the object version level. By default, PUT sets the ACL of the current version of
     * an object. To set the ACL of a different version, use the <code>versionId</code> subresource.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectAclRequest.Builder} avoiding the need to
     * create one manually via {@link PutObjectAclRequest#builder()}
     * </p>
     *
     * @param putObjectAclRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectAclRequest.Builder} to create a request.
     * @return Result of the PutObjectAcl operation returned by the service.
     * @throws NoSuchKeyException
     *         The specified key does not exist.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectAcl
     */
    default PutObjectAclResponse putObjectAcl(Consumer<PutObjectAclRequest.Builder> putObjectAclRequest)
            throws NoSuchKeyException, AwsServiceException, SdkClientException, S3Exception {
        return putObjectAcl(PutObjectAclRequest.builder().applyMutation(putObjectAclRequest).build());
    }

    /**
     * <p>
     * Applies a legal hold configuration to the specified object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     *
     * @param putObjectLegalHoldRequest
     * @return Result of the PutObjectLegalHold operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectLegalHold
     */
    default PutObjectLegalHoldResponse putObjectLegalHold(PutObjectLegalHoldRequest putObjectLegalHoldRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Applies a legal hold configuration to the specified object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectLegalHoldRequest.Builder} avoiding the
     * need to create one manually via {@link PutObjectLegalHoldRequest#builder()}
     * </p>
     *
     * @param putObjectLegalHoldRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectLegalHoldRequest.Builder} to create a
     *        request.
     * @return Result of the PutObjectLegalHold operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectLegalHold
     */
    default PutObjectLegalHoldResponse putObjectLegalHold(Consumer<PutObjectLegalHoldRequest.Builder> putObjectLegalHoldRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putObjectLegalHold(PutObjectLegalHoldRequest.builder().applyMutation(putObjectLegalHoldRequest).build());
    }

    /**
     * <p>
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration
     * will be applied by default to every new object placed in the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The <code>DefaultRetention</code> settings require both a mode and a period.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DefaultRetention</code> period can be either <code>Days</code> or <code>Years</code> but you must
     * select one. You cannot specify <code>Days</code> and <code>Years</code> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only enable Object Lock for new buckets. If you want to turn on Object Lock for an existing bucket,
     * contact Amazon Web Services Support.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @param putObjectLockConfigurationRequest
     * @return Result of the PutObjectLockConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectLockConfiguration
     */
    default PutObjectLockConfigurationResponse putObjectLockConfiguration(
            PutObjectLockConfigurationRequest putObjectLockConfigurationRequest) throws AwsServiceException, SdkClientException,
            S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration
     * will be applied by default to every new object placed in the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The <code>DefaultRetention</code> settings require both a mode and a period.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DefaultRetention</code> period can be either <code>Days</code> or <code>Years</code> but you must
     * select one. You cannot specify <code>Days</code> and <code>Years</code> at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only enable Object Lock for new buckets. If you want to turn on Object Lock for an existing bucket,
     * contact Amazon Web Services Support.
     * </p>
     * </li>
     * </ul>
     * </note><br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectLockConfigurationRequest.Builder} avoiding
     * the need to create one manually via {@link PutObjectLockConfigurationRequest#builder()}
     * </p>
     *
     * @param putObjectLockConfigurationRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectLockConfigurationRequest.Builder} to create a
     *        request.
     * @return Result of the PutObjectLockConfiguration operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectLockConfiguration
     */
    default PutObjectLockConfigurationResponse putObjectLockConfiguration(
            Consumer<PutObjectLockConfigurationRequest.Builder> putObjectLockConfigurationRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putObjectLockConfiguration(PutObjectLockConfigurationRequest.builder()
                .applyMutation(putObjectLockConfigurationRequest).build());
    }

    /**
     * <p>
     * Places an Object Retention configuration on an object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>. Users or accounts
     * require the <code>s3:PutObjectRetention</code> permission in order to place an Object Retention configuration on
     * objects. Bypassing a Governance Retention configuration requires the <code>s3:BypassGovernanceRetention</code>
     * permission.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     *
     * @param putObjectRetentionRequest
     * @return Result of the PutObjectRetention operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectRetention
     */
    default PutObjectRetentionResponse putObjectRetention(PutObjectRetentionRequest putObjectRetentionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Places an Object Retention configuration on an object. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Locking Objects</a>. Users or accounts
     * require the <code>s3:PutObjectRetention</code> permission in order to place an Object Retention configuration on
     * objects. Bypassing a Governance Retention configuration requires the <code>s3:BypassGovernanceRetention</code>
     * permission.
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectRetentionRequest.Builder} avoiding the
     * need to create one manually via {@link PutObjectRetentionRequest#builder()}
     * </p>
     *
     * @param putObjectRetentionRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectRetentionRequest.Builder} to create a
     *        request.
     * @return Result of the PutObjectRetention operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectRetention
     */
    default PutObjectRetentionResponse putObjectRetention(Consumer<PutObjectRetentionRequest.Builder> putObjectRetentionRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putObjectRetention(PutObjectRetentionRequest.builder().applyMutation(putObjectRetentionRequest).build());
    }

    /**
     * <p>
     * Sets the supplied tag-set to an object that already exists in a bucket.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate tags with an object by sending a PUT request against the tagging
     * subresource that is associated with the object. You can retrieve tags by sending a GET request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>.
     * </p>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">Tag
     * Restrictions</a>. Note that Amazon S3 limits the maximum number of tags to 10 tags per object.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutObjectTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * To put tags of any other version, use the <code>versionId</code> query parameter. You also need permission for
     * the <code>s3:PutObjectVersionTagging</code> action.
     * </p>
     * <p>
     * For information about the Amazon S3 object tagging feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object Tagging</a>.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InvalidTagError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object
     * Tagging</a>.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: MalformedXMLError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The XML provided does not match the schema.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: OperationAbortedError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: A conflicting conditional action is currently in progress against this resource. Please try again.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InternalError</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The service was unable to apply the provided tag to the object.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html">DeleteObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putObjectTaggingRequest
     * @return Result of the PutObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectTagging
     */
    default PutObjectTaggingResponse putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Sets the supplied tag-set to an object that already exists in a bucket.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate tags with an object by sending a PUT request against the tagging
     * subresource that is associated with the object. You can retrieve tags by sending a GET request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>.
     * </p>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">Tag
     * Restrictions</a>. Note that Amazon S3 limits the maximum number of tags to 10 tags per object.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3:PutObjectTagging</code> action. By
     * default, the bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * To put tags of any other version, use the <code>versionId</code> query parameter. You also need permission for
     * the <code>s3:PutObjectVersionTagging</code> action.
     * </p>
     * <p>
     * For information about the Amazon S3 object tagging feature, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object Tagging</a>.
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InvalidTagError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-tagging.html">Object
     * Tagging</a>.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: MalformedXMLError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The XML provided does not match the schema.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: OperationAbortedError </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: A conflicting conditional action is currently in progress against this resource. Please try again.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InternalError</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The service was unable to apply the provided tag to the object.</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObjectTagging.html">GetObjectTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjectTagging.html">DeleteObjectTagging</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutObjectTaggingRequest.Builder} avoiding the need
     * to create one manually via {@link PutObjectTaggingRequest#builder()}
     * </p>
     *
     * @param putObjectTaggingRequest
     *        A {@link Consumer} that will call methods on {@link PutObjectTaggingRequest.Builder} to create a request.
     * @return Result of the PutObjectTagging operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutObjectTagging
     */
    default PutObjectTaggingResponse putObjectTagging(Consumer<PutObjectTaggingRequest.Builder> putObjectTaggingRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return putObjectTagging(PutObjectTaggingRequest.builder().applyMutation(putObjectTaggingRequest).build());
    }

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this
     * operation, you must have the <code>s3:PutBucketPublicAccessBlock</code> permission. For more information about
     * Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <important>
     * <p>
     * When Amazon S3 evaluates the <code>PublicAccessBlock</code> configuration for a bucket or an object, it checks
     * the <code>PublicAccessBlock</code> configuration for both the bucket (or the bucket that contains the object) and
     * the bucket owner's account. If the <code>PublicAccessBlock</code> configurations are different between the bucket
     * and the account, Amazon S3 uses the most restrictive combination of the bucket-level and account-level settings.
     * </p>
     * </important>
     * <p>
     * For more information about when Amazon S3 considers a bucket or an object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicyStatus.html">GetBucketPolicyStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param putPublicAccessBlockRequest
     * @return Result of the PutPublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutPublicAccessBlock
     */
    default PutPublicAccessBlockResponse putPublicAccessBlock(PutPublicAccessBlockRequest putPublicAccessBlockRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon S3 bucket. To use this
     * operation, you must have the <code>s3:PutBucketPublicAccessBlock</code> permission. For more information about
     * Amazon S3 permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html">Specifying Permissions in a
     * Policy</a>.
     * </p>
     * <important>
     * <p>
     * When Amazon S3 evaluates the <code>PublicAccessBlock</code> configuration for a bucket or an object, it checks
     * the <code>PublicAccessBlock</code> configuration for both the bucket (or the bucket that contains the object) and
     * the bucket owner's account. If the <code>PublicAccessBlock</code> configurations are different between the bucket
     * and the account, Amazon S3 uses the most restrictive combination of the bucket-level and account-level settings.
     * </p>
     * </important>
     * <p>
     * For more information about when Amazon S3 considers a bucket or an object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a>.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetPublicAccessBlock.html">GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeletePublicAccessBlock.html">DeletePublicAccessBlock
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicyStatus.html">GetBucketPolicyStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html">Using Amazon S3
     * Block Public Access</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link PutPublicAccessBlockRequest.Builder} avoiding the
     * need to create one manually via {@link PutPublicAccessBlockRequest#builder()}
     * </p>
     *
     * @param putPublicAccessBlockRequest
     *        A {@link Consumer} that will call methods on {@link PutPublicAccessBlockRequest.Builder} to create a
     *        request.
     * @return Result of the PutPublicAccessBlock operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.PutPublicAccessBlock
     */
    default PutPublicAccessBlockResponse putPublicAccessBlock(
            Consumer<PutPublicAccessBlockRequest.Builder> putPublicAccessBlockRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        return putPublicAccessBlock(PutPublicAccessBlockRequest.builder().applyMutation(putPublicAccessBlockRequest).build());
    }

    /**
     * <p>
     * Restores an archived copy of an object back into Amazon S3
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * This action performs the following types of requests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>select</code> - Perform a select query on an archived object
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore an archive</code> - Restore an archived object
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:RestoreObject</code> action. The bucket
     * owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Querying Archives with Select Requests</b>
     * </p>
     * <p>
     * You use a select type of request to perform SQL queries on archived objects. The archived objects that are being
     * queried by the select request must be formatted as uncompressed comma-separated values (CSV) files. You can run
     * queries and custom analytics on your archived data without having to restore your data to a hotter Amazon S3
     * tier. For an overview about select requests, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html">Querying Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When making a select request, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define an output location for the select query's output. This must be an Amazon S3 bucket in the same Amazon Web
     * Services Region as the bucket that contains the archive object that is being queried. The Amazon Web Services
     * account that initiates the job must have permissions to write to the S3 bucket. You can specify the storage class
     * and encryption for the output objects stored in the bucket. For more information about output, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html">Querying Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For more information about the <code>S3</code> structure in the request body, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Managing Access with ACLs</a> in
     * the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Define the SQL expression for the <code>SELECT</code> type of restoration for your query in the request body's
     * <code>SelectParameters</code> structure. You can use expressions like the following examples.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following expression returns all records from the specified object.
     * </p>
     * <p>
     * <code>SELECT * FROM Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Assuming that you are not using any headers for data stored in the object, you can specify columns with
     * positional headers.
     * </p>
     * <p>
     * <code>SELECT s._1, s._2 FROM Object s WHERE s._3 &gt; 100</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have headers and you set the <code>fileHeaderInfo</code> in the <code>CSV</code> structure in the request
     * body to <code>USE</code>, you can specify headers in the query. (If you set the <code>fileHeaderInfo</code> field
     * to <code>IGNORE</code>, the first row is skipped for the query.) You cannot mix ordinal positions with header
     * column names.
     * </p>
     * <p>
     * <code>SELECT s.Id, s.FirstName, s.SSN FROM S3Object s</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For more information about using SQL with S3 Glacier Select restore, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html">SQL Reference for
     * Amazon S3 Select and S3 Glacier Select</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When making a select request, you can also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expedite your queries, specify the <code>Expedited</code> tier. For more information about tiers, see
     * "Restoring Archives," later in this topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify details about the data serialization format of both the input object that is being queried and the
     * serialization of the CSV-encoded query results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are additional important facts about the select feature:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The output results are new Amazon S3 objects. Unlike archive retrievals, they are stored until explicitly
     * deleted-manually or through a lifecycle policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can issue more than one select request on the same Amazon S3 object. Amazon S3 doesn't deduplicate requests,
     * so avoid issuing duplicate requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 accepts a select request even if the object has already been restored. A select request doesn’t return
     * error response <code>409</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Restoring objects</b>
     * </p>
     * <p>
     * Objects that you archive to the S3 Glacier or S3 Glacier Deep Archive storage class, and S3 Intelligent-Tiering
     * Archive or S3 Intelligent-Tiering Deep Archive tiers are not accessible in real time. For objects in Archive
     * Access or Deep Archive Access tiers you must first initiate a restore request, and then wait until the object is
     * moved into the Frequent Access tier. For objects in S3 Glacier or S3 Glacier Deep Archive storage classes you
     * must first initiate a restore request, and then wait until a temporary copy of the object is available. To access
     * an archived object, you must restore the object for the duration (number of days) that you specify.
     * </p>
     * <p>
     * To restore a specific object version, you can provide a version ID. If you don't provide a version ID, Amazon S3
     * restores the current version.
     * </p>
     * <p>
     * When restoring an archived object (or using a select request), you can specify one of the following data access
     * tier options in the <code>Tier</code> element of the request body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Expedited</code> - Expedited retrievals allow you to quickly access your data stored in the S3 Glacier
     * storage class or S3 Intelligent-Tiering Archive tier when occasional urgent requests for a subset of archives are
     * required. For all but the largest archived objects (250 MB+), data accessed using Expedited retrievals is
     * typically made available within 1–5 minutes. Provisioned capacity ensures that retrieval capacity for Expedited
     * retrievals is available when you need it. Expedited retrievals and provisioned capacity are not available for
     * objects stored in the S3 Glacier Deep Archive storage class or S3 Intelligent-Tiering Deep Archive tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Standard</code> - Standard retrievals allow you to access any of your archived objects within several
     * hours. This is the default option for retrieval requests that do not specify the retrieval option. Standard
     * retrievals typically finish within 3–5 hours for objects stored in the S3 Glacier storage class or S3
     * Intelligent-Tiering Archive tier. They typically finish within 12 hours for objects stored in the S3 Glacier Deep
     * Archive storage class or S3 Intelligent-Tiering Deep Archive tier. Standard retrievals are free for objects
     * stored in S3 Intelligent-Tiering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Bulk</code> - Bulk retrievals are the lowest-cost retrieval option in S3 Glacier, enabling you to retrieve
     * large amounts, even petabytes, of data inexpensively. Bulk retrievals typically finish within 5–12 hours for
     * objects stored in the S3 Glacier storage class or S3 Intelligent-Tiering Archive tier. They typically finish
     * within 48 hours for objects stored in the S3 Glacier Deep Archive storage class or S3 Intelligent-Tiering Deep
     * Archive tier. Bulk retrievals are free for objects stored in S3 Intelligent-Tiering.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about archive retrieval options and provisioned capacity for <code>Expedited</code> data
     * access, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can use Amazon S3 restore speed upgrade to change the restore speed to a faster speed while it is in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html#restoring-objects-upgrade-tier.title.html"
     * > Upgrading the speed of an in-progress restore</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To get the status of object restoration, you can send a <code>HEAD</code> request. Operations return the
     * <code>x-amz-restore</code> header, which provides information about the restoration status, in the response. You
     * can use Amazon S3 event notifications to notify you when a restore is initiated or completed. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Amazon S3 Event Notifications</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * After restoring an archived object, you can update the restoration period by reissuing the request with a new
     * period. Amazon S3 updates the restoration period relative to the current time and charges only for the
     * request-there are no data transfer charges. You cannot update the restoration period when Amazon S3 is actively
     * processing your current restore request for the object.
     * </p>
     * <p>
     * If your bucket has a lifecycle configuration with a rule that includes an expiration action, the object
     * expiration overrides the life span that you specify in a restore request. For example, if you restore an object
     * copy for 10 days, but the object is scheduled to expire in 3 days, Amazon S3 deletes the object in 3 days. For
     * more information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle Management</a>
     * in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Responses</b>
     * </p>
     * <p>
     * A successful action returns either the <code>200 OK</code> or <code>202 Accepted</code> status code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the object is not previously restored, then Amazon S3 returns <code>202 Accepted</code> in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the object is previously restored, Amazon S3 returns <code>200 OK</code> in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: RestoreAlreadyInProgress</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: Object restore is already in progress. (This error does not apply to SELECT type requests.)</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 409 Conflict</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: GlacierExpeditedRetrievalNotAvailable</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: expedited retrievals are currently not available. Try again later. (Returned if there is insufficient
     * capacity to process the Expedited request. This error applies only to Expedited retrievals and not to S3 Standard
     * or Bulk retrievals.)</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 503</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: N/A</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketNotificationConfiguration.html">
     * GetBucketNotificationConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html">SQL Reference for
     * Amazon S3 Select and S3 Glacier Select </a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * </ul>
     *
     * @param restoreObjectRequest
     * @return Result of the RestoreObject operation returned by the service.
     * @throws ObjectAlreadyInActiveTierErrorException
     *         This action is not allowed against this storage tier.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.RestoreObject
     */
    default RestoreObjectResponse restoreObject(RestoreObjectRequest restoreObjectRequest)
            throws ObjectAlreadyInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Restores an archived copy of an object back into Amazon S3
     * </p>
     * <p>
     * This action is not supported by Amazon S3 on Outposts.
     * </p>
     * <p>
     * This action performs the following types of requests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>select</code> - Perform a select query on an archived object
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>restore an archive</code> - Restore an archived object
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use this operation, you must have permissions to perform the <code>s3:RestoreObject</code> action. The bucket
     * owner has this permission by default and can grant this permission to others. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Querying Archives with Select Requests</b>
     * </p>
     * <p>
     * You use a select type of request to perform SQL queries on archived objects. The archived objects that are being
     * queried by the select request must be formatted as uncompressed comma-separated values (CSV) files. You can run
     * queries and custom analytics on your archived data without having to restore your data to a hotter Amazon S3
     * tier. For an overview about select requests, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html">Querying Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When making a select request, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define an output location for the select query's output. This must be an Amazon S3 bucket in the same Amazon Web
     * Services Region as the bucket that contains the archive object that is being queried. The Amazon Web Services
     * account that initiates the job must have permissions to write to the S3 bucket. You can specify the storage class
     * and encryption for the output objects stored in the bucket. For more information about output, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/querying-glacier-archives.html">Querying Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For more information about the <code>S3</code> structure in the request body, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3_ACLs_UsingACLs.html">Managing Access with ACLs</a> in
     * the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Define the SQL expression for the <code>SELECT</code> type of restoration for your query in the request body's
     * <code>SelectParameters</code> structure. You can use expressions like the following examples.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The following expression returns all records from the specified object.
     * </p>
     * <p>
     * <code>SELECT * FROM Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Assuming that you are not using any headers for data stored in the object, you can specify columns with
     * positional headers.
     * </p>
     * <p>
     * <code>SELECT s._1, s._2 FROM Object s WHERE s._3 &gt; 100</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have headers and you set the <code>fileHeaderInfo</code> in the <code>CSV</code> structure in the request
     * body to <code>USE</code>, you can specify headers in the query. (If you set the <code>fileHeaderInfo</code> field
     * to <code>IGNORE</code>, the first row is skipped for the query.) You cannot mix ordinal positions with header
     * column names.
     * </p>
     * <p>
     * <code>SELECT s.Id, s.FirstName, s.SSN FROM S3Object s</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For more information about using SQL with S3 Glacier Select restore, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html">SQL Reference for
     * Amazon S3 Select and S3 Glacier Select</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * When making a select request, you can also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To expedite your queries, specify the <code>Expedited</code> tier. For more information about tiers, see
     * "Restoring Archives," later in this topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify details about the data serialization format of both the input object that is being queried and the
     * serialization of the CSV-encoded query results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are additional important facts about the select feature:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The output results are new Amazon S3 objects. Unlike archive retrievals, they are stored until explicitly
     * deleted-manually or through a lifecycle policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can issue more than one select request on the same Amazon S3 object. Amazon S3 doesn't deduplicate requests,
     * so avoid issuing duplicate requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 accepts a select request even if the object has already been restored. A select request doesn’t return
     * error response <code>409</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Restoring objects</b>
     * </p>
     * <p>
     * Objects that you archive to the S3 Glacier or S3 Glacier Deep Archive storage class, and S3 Intelligent-Tiering
     * Archive or S3 Intelligent-Tiering Deep Archive tiers are not accessible in real time. For objects in Archive
     * Access or Deep Archive Access tiers you must first initiate a restore request, and then wait until the object is
     * moved into the Frequent Access tier. For objects in S3 Glacier or S3 Glacier Deep Archive storage classes you
     * must first initiate a restore request, and then wait until a temporary copy of the object is available. To access
     * an archived object, you must restore the object for the duration (number of days) that you specify.
     * </p>
     * <p>
     * To restore a specific object version, you can provide a version ID. If you don't provide a version ID, Amazon S3
     * restores the current version.
     * </p>
     * <p>
     * When restoring an archived object (or using a select request), you can specify one of the following data access
     * tier options in the <code>Tier</code> element of the request body:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Expedited</code> - Expedited retrievals allow you to quickly access your data stored in the S3 Glacier
     * storage class or S3 Intelligent-Tiering Archive tier when occasional urgent requests for a subset of archives are
     * required. For all but the largest archived objects (250 MB+), data accessed using Expedited retrievals is
     * typically made available within 1–5 minutes. Provisioned capacity ensures that retrieval capacity for Expedited
     * retrievals is available when you need it. Expedited retrievals and provisioned capacity are not available for
     * objects stored in the S3 Glacier Deep Archive storage class or S3 Intelligent-Tiering Deep Archive tier.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Standard</code> - Standard retrievals allow you to access any of your archived objects within several
     * hours. This is the default option for retrieval requests that do not specify the retrieval option. Standard
     * retrievals typically finish within 3–5 hours for objects stored in the S3 Glacier storage class or S3
     * Intelligent-Tiering Archive tier. They typically finish within 12 hours for objects stored in the S3 Glacier Deep
     * Archive storage class or S3 Intelligent-Tiering Deep Archive tier. Standard retrievals are free for objects
     * stored in S3 Intelligent-Tiering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Bulk</code> - Bulk retrievals are the lowest-cost retrieval option in S3 Glacier, enabling you to retrieve
     * large amounts, even petabytes, of data inexpensively. Bulk retrievals typically finish within 5–12 hours for
     * objects stored in the S3 Glacier storage class or S3 Intelligent-Tiering Archive tier. They typically finish
     * within 48 hours for objects stored in the S3 Glacier Deep Archive storage class or S3 Intelligent-Tiering Deep
     * Archive tier. Bulk retrievals are free for objects stored in S3 Intelligent-Tiering.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about archive retrieval options and provisioned capacity for <code>Expedited</code> data
     * access, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html">Restoring Archived
     * Objects</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can use Amazon S3 restore speed upgrade to change the restore speed to a faster speed while it is in
     * progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/restoring-objects.html#restoring-objects-upgrade-tier.title.html"
     * > Upgrading the speed of an in-progress restore</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To get the status of object restoration, you can send a <code>HEAD</code> request. Operations return the
     * <code>x-amz-restore</code> header, which provides information about the restoration status, in the response. You
     * can use Amazon S3 event notifications to notify you when a restore is initiated or completed. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Amazon S3 Event Notifications</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * After restoring an archived object, you can update the restoration period by reissuing the request with a new
     * period. Amazon S3 updates the restoration period relative to the current time and charges only for the
     * request-there are no data transfer charges. You cannot update the restoration period when Amazon S3 is actively
     * processing your current restore request for the object.
     * </p>
     * <p>
     * If your bucket has a lifecycle configuration with a rule that includes an expiration action, the object
     * expiration overrides the life span that you specify in a restore request. For example, if you restore an object
     * copy for 10 days, but the object is scheduled to expire in 3 days, Amazon S3 deletes the object in 3 days. For
     * more information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle Management</a>
     * in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Responses</b>
     * </p>
     * <p>
     * A successful action returns either the <code>200 OK</code> or <code>202 Accepted</code> status code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the object is not previously restored, then Amazon S3 returns <code>202 Accepted</code> in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the object is previously restored, Amazon S3 returns <code>200 OK</code> in the response.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: RestoreAlreadyInProgress</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: Object restore is already in progress. (This error does not apply to SELECT type requests.)</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 409 Conflict</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: GlacierExpeditedRetrievalNotAvailable</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: expedited retrievals are currently not available. Try again later. (Returned if there is insufficient
     * capacity to process the Expedited request. This error applies only to Expedited retrievals and not to S3 Standard
     * or Bulk retrievals.)</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 503</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: N/A</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketNotificationConfiguration.html">
     * GetBucketNotificationConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-glacier-select-sql-reference.html">SQL Reference for
     * Amazon S3 Select and S3 Glacier Select </a> in the <i>Amazon S3 User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link RestoreObjectRequest.Builder} avoiding the need to
     * create one manually via {@link RestoreObjectRequest#builder()}
     * </p>
     *
     * @param restoreObjectRequest
     *        A {@link Consumer} that will call methods on {@link RestoreObjectRequest.Builder} to create a request.
     * @return Result of the RestoreObject operation returned by the service.
     * @throws ObjectAlreadyInActiveTierErrorException
     *         This action is not allowed against this storage tier.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.RestoreObject
     */
    default RestoreObjectResponse restoreObject(Consumer<RestoreObjectRequest.Builder> restoreObjectRequest)
            throws ObjectAlreadyInActiveTierErrorException, AwsServiceException, SdkClientException, S3Exception {
        return restoreObject(RestoreObjectRequest.builder().applyMutation(restoreObjectRequest).build());
    }

    /**
     * <p>
     * Uploads a part in a multipart upload.
     * </p>
     * <note>
     * <p>
     * In this operation, you provide part data in your request. However, you have an option to specify your existing
     * Amazon S3 object as a data source for the part you are uploading. To upload a part from an existing object, you
     * use the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a>
     * operation.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>)
     * before you can upload any part. In response to your initiate request, Amazon S3 returns an upload ID, a unique
     * identifier, that you must include in your upload part request.
     * </p>
     * <p>
     * Part numbers can be any number from 1 to 10,000, inclusive. A part number uniquely identifies a part and also
     * defines its position within the object being created. If you upload a new part using the same part number that
     * was used with a previous part, the previously uploaded part is overwritten.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To ensure that data is not corrupted when traversing the network, specify the <code>Content-MD5</code> header in
     * the upload part request. Amazon S3 checks the part data against the provided MD5 value. If they do not match,
     * Amazon S3 returns an error.
     * </p>
     * <p>
     * If the upload request is signed with Signature Version 4, then Amazon Web Services S3 uses the
     * <code>x-amz-content-sha256</code> header as a checksum instead of <code>Content-MD5</code>. For more information
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-auth-using-authorization-header.html">
     * Authenticating Requests: Using the Authorization Header (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <p>
     * <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort
     * multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either
     * complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts
     * storage.
     * </p>
     * <p>
     * For more information on multipart uploads, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a> in the
     * <i>Amazon S3 User Guide </i>.
     * </p>
     * <p>
     * For information on the permissions required to use the multipart upload API, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can optionally request server-side encryption where Amazon S3 encrypts your data as it writes it to disks in
     * its data centers and decrypts it for you when you access it. You have the option of providing your own encryption
     * key, or you can use the Amazon Web Services managed encryption keys. If you choose to provide your own encryption
     * key, the request headers you provide in the request must match the headers you used in the request to initiate
     * the upload by using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * For more information, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using Server-Side
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Server-side encryption is supported by the S3 Multipart Upload actions. Unless you are using a customer-provided
     * encryption key, you don't need to specify the encryption parameters in each UploadPart request. Instead, you only
     * need to specify the server-side encryption parameters in the initial Initiate Multipart request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * </p>
     * <p>
     * If you requested server-side encryption using a customer-provided encryption key in your initiate multipart
     * upload request, you must provide identical encryption information in each part upload using the following
     * headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> HTTP Status Code: 404 Not Found </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param uploadPartRequest
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the UploadPart operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPart
     */
    default UploadPartResponse uploadPart(UploadPartRequest uploadPartRequest, RequestBody requestBody)
            throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Uploads a part in a multipart upload.
     * </p>
     * <note>
     * <p>
     * In this operation, you provide part data in your request. However, you have an option to specify your existing
     * Amazon S3 object as a data source for the part you are uploading. To upload a part from an existing object, you
     * use the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a>
     * operation.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>)
     * before you can upload any part. In response to your initiate request, Amazon S3 returns an upload ID, a unique
     * identifier, that you must include in your upload part request.
     * </p>
     * <p>
     * Part numbers can be any number from 1 to 10,000, inclusive. A part number uniquely identifies a part and also
     * defines its position within the object being created. If you upload a new part using the same part number that
     * was used with a previous part, the previously uploaded part is overwritten.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To ensure that data is not corrupted when traversing the network, specify the <code>Content-MD5</code> header in
     * the upload part request. Amazon S3 checks the part data against the provided MD5 value. If they do not match,
     * Amazon S3 returns an error.
     * </p>
     * <p>
     * If the upload request is signed with Signature Version 4, then Amazon Web Services S3 uses the
     * <code>x-amz-content-sha256</code> header as a checksum instead of <code>Content-MD5</code>. For more information
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-auth-using-authorization-header.html">
     * Authenticating Requests: Using the Authorization Header (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <p>
     * <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort
     * multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either
     * complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts
     * storage.
     * </p>
     * <p>
     * For more information on multipart uploads, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a> in the
     * <i>Amazon S3 User Guide </i>.
     * </p>
     * <p>
     * For information on the permissions required to use the multipart upload API, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can optionally request server-side encryption where Amazon S3 encrypts your data as it writes it to disks in
     * its data centers and decrypts it for you when you access it. You have the option of providing your own encryption
     * key, or you can use the Amazon Web Services managed encryption keys. If you choose to provide your own encryption
     * key, the request headers you provide in the request must match the headers you used in the request to initiate
     * the upload by using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * For more information, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using Server-Side
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Server-side encryption is supported by the S3 Multipart Upload actions. Unless you are using a customer-provided
     * encryption key, you don't need to specify the encryption parameters in each UploadPart request. Instead, you only
     * need to specify the server-side encryption parameters in the initial Initiate Multipart request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * </p>
     * <p>
     * If you requested server-side encryption using a customer-provided encryption key in your initiate multipart
     * upload request, you must provide identical encryption information in each part upload using the following
     * headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> HTTP Status Code: 404 Not Found </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link UploadPartRequest.Builder} avoiding the need to
     * create one manually via {@link UploadPartRequest#builder()}
     * </p>
     *
     * @param uploadPartRequest
     *        A {@link Consumer} that will call methods on {@link UploadPartRequest.Builder} to create a request.
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the UploadPart operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPart
     */
    default UploadPartResponse uploadPart(Consumer<UploadPartRequest.Builder> uploadPartRequest, RequestBody requestBody)
            throws AwsServiceException, SdkClientException, S3Exception {
        return uploadPart(UploadPartRequest.builder().applyMutation(uploadPartRequest).build(), requestBody);
    }

    /**
     * <p>
     * Uploads a part in a multipart upload.
     * </p>
     * <note>
     * <p>
     * In this operation, you provide part data in your request. However, you have an option to specify your existing
     * Amazon S3 object as a data source for the part you are uploading. To upload a part from an existing object, you
     * use the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a>
     * operation.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>)
     * before you can upload any part. In response to your initiate request, Amazon S3 returns an upload ID, a unique
     * identifier, that you must include in your upload part request.
     * </p>
     * <p>
     * Part numbers can be any number from 1 to 10,000, inclusive. A part number uniquely identifies a part and also
     * defines its position within the object being created. If you upload a new part using the same part number that
     * was used with a previous part, the previously uploaded part is overwritten.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To ensure that data is not corrupted when traversing the network, specify the <code>Content-MD5</code> header in
     * the upload part request. Amazon S3 checks the part data against the provided MD5 value. If they do not match,
     * Amazon S3 returns an error.
     * </p>
     * <p>
     * If the upload request is signed with Signature Version 4, then Amazon Web Services S3 uses the
     * <code>x-amz-content-sha256</code> header as a checksum instead of <code>Content-MD5</code>. For more information
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-auth-using-authorization-header.html">
     * Authenticating Requests: Using the Authorization Header (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <p>
     * <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort
     * multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either
     * complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts
     * storage.
     * </p>
     * <p>
     * For more information on multipart uploads, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a> in the
     * <i>Amazon S3 User Guide </i>.
     * </p>
     * <p>
     * For information on the permissions required to use the multipart upload API, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can optionally request server-side encryption where Amazon S3 encrypts your data as it writes it to disks in
     * its data centers and decrypts it for you when you access it. You have the option of providing your own encryption
     * key, or you can use the Amazon Web Services managed encryption keys. If you choose to provide your own encryption
     * key, the request headers you provide in the request must match the headers you used in the request to initiate
     * the upload by using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * For more information, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using Server-Side
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Server-side encryption is supported by the S3 Multipart Upload actions. Unless you are using a customer-provided
     * encryption key, you don't need to specify the encryption parameters in each UploadPart request. Instead, you only
     * need to specify the server-side encryption parameters in the initial Initiate Multipart request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * </p>
     * <p>
     * If you requested server-side encryption using a customer-provided encryption key in your initiate multipart
     * upload request, you must provide identical encryption information in each part upload using the following
     * headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> HTTP Status Code: 404 Not Found </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param uploadPartRequest
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the UploadPart operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPart
     * @see #uploadPart(UploadPartRequest, RequestBody)
     */
    default UploadPartResponse uploadPart(UploadPartRequest uploadPartRequest, Path sourcePath) throws AwsServiceException,
            SdkClientException, S3Exception {
        return uploadPart(uploadPartRequest, RequestBody.fromFile(sourcePath));
    }

    /**
     * <p>
     * Uploads a part in a multipart upload.
     * </p>
     * <note>
     * <p>
     * In this operation, you provide part data in your request. However, you have an option to specify your existing
     * Amazon S3 object as a data source for the part you are uploading. To upload a part from an existing object, you
     * use the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPartCopy.html">UploadPartCopy</a>
     * operation.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload (see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>)
     * before you can upload any part. In response to your initiate request, Amazon S3 returns an upload ID, a unique
     * identifier, that you must include in your upload part request.
     * </p>
     * <p>
     * Part numbers can be any number from 1 to 10,000, inclusive. A part number uniquely identifies a part and also
     * defines its position within the object being created. If you upload a new part using the same part number that
     * was used with a previous part, the previously uploaded part is overwritten.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To ensure that data is not corrupted when traversing the network, specify the <code>Content-MD5</code> header in
     * the upload part request. Amazon S3 checks the part data against the provided MD5 value. If they do not match,
     * Amazon S3 returns an error.
     * </p>
     * <p>
     * If the upload request is signed with Signature Version 4, then Amazon Web Services S3 uses the
     * <code>x-amz-content-sha256</code> header as a checksum instead of <code>Content-MD5</code>. For more information
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-auth-using-authorization-header.html">
     * Authenticating Requests: Using the Authorization Header (Amazon Web Services Signature Version 4)</a>.
     * </p>
     * <p>
     * <b>Note:</b> After you initiate multipart upload and upload one or more parts, you must either complete or abort
     * multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either
     * complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts
     * storage.
     * </p>
     * <p>
     * For more information on multipart uploads, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html">Multipart Upload Overview</a> in the
     * <i>Amazon S3 User Guide </i>.
     * </p>
     * <p>
     * For information on the permissions required to use the multipart upload API, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * You can optionally request server-side encryption where Amazon S3 encrypts your data as it writes it to disks in
     * its data centers and decrypts it for you when you access it. You have the option of providing your own encryption
     * key, or you can use the Amazon Web Services managed encryption keys. If you choose to provide your own encryption
     * key, the request headers you provide in the request must match the headers you used in the request to initiate
     * the upload by using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * For more information, go to <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Using Server-Side
     * Encryption</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Server-side encryption is supported by the S3 Multipart Upload actions. Unless you are using a customer-provided
     * encryption key, you don't need to specify the encryption parameters in each UploadPart request. Instead, you only
     * need to specify the server-side encryption parameters in the initial Initiate Multipart request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>.
     * </p>
     * <p>
     * If you requested server-side encryption using a customer-provided encryption key in your initiate multipart
     * upload request, you must provide identical encryption information in each part upload using the following
     * headers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-algorithm
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key
     * </p>
     * </li>
     * <li>
     * <p>
     * x-amz-server-side-encryption-customer-key-MD5
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> HTTP Status Code: 404 Not Found </i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix: Client</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link UploadPartRequest.Builder} avoiding the need to
     * create one manually via {@link UploadPartRequest#builder()}
     * </p>
     *
     * @param uploadPartRequest
     *        A {@link Consumer} that will call methods on {@link UploadPartRequest.Builder} to create a request.
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        Object data.
     *        </p>
     *        '
     * @return Result of the UploadPart operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPart
     * @see #uploadPart(UploadPartRequest, RequestBody)
     */
    default UploadPartResponse uploadPart(Consumer<UploadPartRequest.Builder> uploadPartRequest, Path sourcePath)
            throws AwsServiceException, SdkClientException, S3Exception {
        return uploadPart(UploadPartRequest.builder().applyMutation(uploadPartRequest).build(), sourcePath);
    }

    /**
     * <p>
     * Uploads a part by copying data from an existing object as data source. You specify the data source by adding the
     * request header <code>x-amz-copy-source</code> in your request and a byte range by adding the request header
     * <code>x-amz-copy-source-range</code> in your request.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Instead of using an existing object as part data, you might use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> action and provide data
     * in your request.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload before you can upload any part. In response to your initiate request. Amazon
     * S3 returns a unique identifier, the upload ID, that you must include in your upload part request.
     * </p>
     * <p>
     * For more information about using the <code>UploadPartCopy</code> operation, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For conceptual information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about copying objects using a single atomic action vs. a multipart upload, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectOperations.html">Operations on Objects</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about using server-side encryption with customer-provided encryption keys with the
     * <code>UploadPartCopy</code> operation, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following additional considerations about the request headers <code>x-amz-copy-source-if-match</code>,
     * <code>x-amz-copy-source-if-none-match</code>, <code>x-amz-copy-source-if-unmodified-since</code>, and
     * <code>x-amz-copy-source-if-modified-since</code>:
     * </p>
     * <p>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Consideration 1</b> - If both of the <code>x-amz-copy-source-if-match</code> and
     * <code>x-amz-copy-source-if-unmodified-since</code> headers are present in the request as follows:
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-match</code> condition evaluates to <code>true</code>, and;
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to <code>false</code>;
     * </p>
     * <p>
     * Amazon S3 returns <code>200 OK</code> and copies the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Consideration 2</b> - If both of the <code>x-amz-copy-source-if-none-match</code> and
     * <code>x-amz-copy-source-if-modified-since</code> headers are present in the request as follows:
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code> condition evaluates to <code>false</code>, and;
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to <code>true</code>;
     * </p>
     * <p>
     * Amazon S3 returns <code>412 Precondition Failed</code> response code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If your bucket has versioning enabled, you could have multiple versions of the same object. By default,
     * <code>x-amz-copy-source</code> identifies the current version of the object to copy. If the current version is a
     * delete marker and you don't specify a versionId in the <code>x-amz-copy-source</code>, Amazon S3 returns a 404
     * error, because the object does not exist. If you specify versionId in the <code>x-amz-copy-source</code> and the
     * versionId is a delete marker, Amazon S3 returns an HTTP 400 error, because you are not allowed to specify a
     * delete marker as a version for the <code>x-amz-copy-source</code>.
     * </p>
     * <p>
     * You can optionally specify a specific version of the source object to copy by adding the <code>versionId</code>
     * subresource as shown in the following example:
     * </p>
     * <p>
     * <code>x-amz-copy-source: /bucket/object?versionId=version id</code>
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 404 Not Found</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InvalidRequest</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified copy source is not supported as a byte-range copy source.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 400 Bad Request</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param uploadPartCopyRequest
     * @return Result of the UploadPartCopy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPartCopy
     */
    default UploadPartCopyResponse uploadPartCopy(UploadPartCopyRequest uploadPartCopyRequest) throws AwsServiceException,
            SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Uploads a part by copying data from an existing object as data source. You specify the data source by adding the
     * request header <code>x-amz-copy-source</code> in your request and a byte range by adding the request header
     * <code>x-amz-copy-source-range</code> in your request.
     * </p>
     * <p>
     * For information about maximum and minimum part sizes and other multipart upload specifications, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/qfacts.html">Multipart upload limits</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Instead of using an existing object as part data, you might use the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a> action and provide data
     * in your request.
     * </p>
     * </note>
     * <p>
     * You must initiate a multipart upload before you can upload any part. In response to your initiate request. Amazon
     * S3 returns a unique identifier, the upload ID, that you must include in your upload part request.
     * </p>
     * <p>
     * For more information about using the <code>UploadPartCopy</code> operation, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For conceptual information about multipart uploads, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html">Uploading Objects Using Multipart
     * Upload</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about permissions required to use the multipart upload API, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuAndPermissions.html">Multipart Upload and
     * Permissions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about copying objects using a single atomic action vs. a multipart upload, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectOperations.html">Operations on Objects</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about using server-side encryption with customer-provided encryption keys with the
     * <code>UploadPartCopy</code> operation, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CopyObject.html">CopyObject</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following additional considerations about the request headers <code>x-amz-copy-source-if-match</code>,
     * <code>x-amz-copy-source-if-none-match</code>, <code>x-amz-copy-source-if-unmodified-since</code>, and
     * <code>x-amz-copy-source-if-modified-since</code>:
     * </p>
     * <p>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Consideration 1</b> - If both of the <code>x-amz-copy-source-if-match</code> and
     * <code>x-amz-copy-source-if-unmodified-since</code> headers are present in the request as follows:
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-match</code> condition evaluates to <code>true</code>, and;
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-unmodified-since</code> condition evaluates to <code>false</code>;
     * </p>
     * <p>
     * Amazon S3 returns <code>200 OK</code> and copies the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Consideration 2</b> - If both of the <code>x-amz-copy-source-if-none-match</code> and
     * <code>x-amz-copy-source-if-modified-since</code> headers are present in the request as follows:
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-none-match</code> condition evaluates to <code>false</code>, and;
     * </p>
     * <p>
     * <code>x-amz-copy-source-if-modified-since</code> condition evaluates to <code>true</code>;
     * </p>
     * <p>
     * Amazon S3 returns <code>412 Precondition Failed</code> response code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Versioning</b>
     * </p>
     * <p>
     * If your bucket has versioning enabled, you could have multiple versions of the same object. By default,
     * <code>x-amz-copy-source</code> identifies the current version of the object to copy. If the current version is a
     * delete marker and you don't specify a versionId in the <code>x-amz-copy-source</code>, Amazon S3 returns a 404
     * error, because the object does not exist. If you specify versionId in the <code>x-amz-copy-source</code> and the
     * versionId is a delete marker, Amazon S3 returns an HTTP 400 error, because you are not allowed to specify a
     * delete marker as a version for the <code>x-amz-copy-source</code>.
     * </p>
     * <p>
     * You can optionally specify a specific version of the source object to copy by adding the <code>versionId</code>
     * subresource as shown in the following example:
     * </p>
     * <p>
     * <code>x-amz-copy-source: /bucket/object?versionId=version id</code>
     * </p>
     * <p class="title">
     * <b>Special Errors</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: NoSuchUpload</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified multipart upload does not exist. The upload ID might be invalid, or the multipart upload
     * might have been aborted or completed.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 404 Not Found</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code: InvalidRequest</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Cause: The specified copy source is not supported as a byte-range copy source.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code: 400 Bad Request</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateMultipartUpload.html">CreateMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_UploadPart.html">UploadPart</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CompleteMultipartUpload.html">CompleteMultipartUpload
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_AbortMultipartUpload.html">AbortMultipartUpload</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListParts.html">ListParts</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListMultipartUploads.html">ListMultipartUploads</a>
     * </p>
     * </li>
     * </ul>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link UploadPartCopyRequest.Builder} avoiding the need to
     * create one manually via {@link UploadPartCopyRequest#builder()}
     * </p>
     *
     * @param uploadPartCopyRequest
     *        A {@link Consumer} that will call methods on {@link UploadPartCopyRequest.Builder} to create a request.
     * @return Result of the UploadPartCopy operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.UploadPartCopy
     */
    default UploadPartCopyResponse uploadPartCopy(Consumer<UploadPartCopyRequest.Builder> uploadPartCopyRequest)
            throws AwsServiceException, SdkClientException, S3Exception {
        return uploadPartCopy(UploadPartCopyRequest.builder().applyMutation(uploadPartCopyRequest).build());
    }

    /**
     * <p>
     * Passes transformed objects to a <code>GetObject</code> operation when using Object Lambda access points. For
     * information about Object Lambda access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This operation supports metadata that can be returned by <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>, in addition to
     * <code>RequestRoute</code>, <code>RequestToken</code>, <code>StatusCode</code>, <code>ErrorCode</code>, and
     * <code>ErrorMessage</code>. The <code>GetObject</code> response metadata is supported so that the
     * <code>WriteGetObjectResponse</code> caller, typically an Lambda function, can provide the same metadata when it
     * internally invokes <code>GetObject</code>. When <code>WriteGetObjectResponse</code> is called by a customer-owned
     * Lambda function, the metadata returned to the end user <code>GetObject</code> call might differ from what Amazon
     * S3 would normally return.
     * </p>
     * <p>
     * You can include any number of metadata headers. When including a metadata header, it should be prefaced with
     * <code>x-amz-meta</code>. For example, <code>x-amz-meta-my-custom-header: MyCustomValue</code>. The primary use
     * case for this is to forward <code>GetObject</code> metadata.
     * </p>
     * <p>
     * Amazon Web Services provides some prebuilt Lambda functions that you can use with S3 Object Lambda to detect and
     * redact personally identifiable information (PII) and decompress S3 objects. These Lambda functions are available
     * in the Amazon Web Services Serverless Application Repository, and can be selected through the Amazon Web Services
     * Management Console when you create your Object Lambda access point.
     * </p>
     * <p>
     * Example 1: PII Access Control - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically detects personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 2: PII Redaction - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically redacts personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 3: Decompression - The Lambda function S3ObjectLambdaDecompression, is equipped to decompress objects
     * stored in S3 in one of six compressed file formats including bzip2, gzip, snappy, zlib, zstandard and ZIP.
     * </p>
     * <p>
     * For information on how to view and use these functions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-examples.html">Using Amazon Web Services built
     * Lambda functions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param writeGetObjectResponseRequest
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        The object data.
     *        </p>
     *        '
     * @return Result of the WriteGetObjectResponse operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.WriteGetObjectResponse
     */
    default WriteGetObjectResponseResponse writeGetObjectResponse(WriteGetObjectResponseRequest writeGetObjectResponseRequest,
            RequestBody requestBody) throws AwsServiceException, SdkClientException, S3Exception {
        throw new UnsupportedOperationException();
    }

    /**
     * <p>
     * Passes transformed objects to a <code>GetObject</code> operation when using Object Lambda access points. For
     * information about Object Lambda access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This operation supports metadata that can be returned by <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>, in addition to
     * <code>RequestRoute</code>, <code>RequestToken</code>, <code>StatusCode</code>, <code>ErrorCode</code>, and
     * <code>ErrorMessage</code>. The <code>GetObject</code> response metadata is supported so that the
     * <code>WriteGetObjectResponse</code> caller, typically an Lambda function, can provide the same metadata when it
     * internally invokes <code>GetObject</code>. When <code>WriteGetObjectResponse</code> is called by a customer-owned
     * Lambda function, the metadata returned to the end user <code>GetObject</code> call might differ from what Amazon
     * S3 would normally return.
     * </p>
     * <p>
     * You can include any number of metadata headers. When including a metadata header, it should be prefaced with
     * <code>x-amz-meta</code>. For example, <code>x-amz-meta-my-custom-header: MyCustomValue</code>. The primary use
     * case for this is to forward <code>GetObject</code> metadata.
     * </p>
     * <p>
     * Amazon Web Services provides some prebuilt Lambda functions that you can use with S3 Object Lambda to detect and
     * redact personally identifiable information (PII) and decompress S3 objects. These Lambda functions are available
     * in the Amazon Web Services Serverless Application Repository, and can be selected through the Amazon Web Services
     * Management Console when you create your Object Lambda access point.
     * </p>
     * <p>
     * Example 1: PII Access Control - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically detects personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 2: PII Redaction - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically redacts personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 3: Decompression - The Lambda function S3ObjectLambdaDecompression, is equipped to decompress objects
     * stored in S3 in one of six compressed file formats including bzip2, gzip, snappy, zlib, zstandard and ZIP.
     * </p>
     * <p>
     * For information on how to view and use these functions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-examples.html">Using Amazon Web Services built
     * Lambda functions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link WriteGetObjectResponseRequest.Builder} avoiding the
     * need to create one manually via {@link WriteGetObjectResponseRequest#builder()}
     * </p>
     *
     * @param writeGetObjectResponseRequest
     *        A {@link Consumer} that will call methods on {@link WriteGetObjectResponseRequest.Builder} to create a
     *        request.
     * @param requestBody
     *        The content to send to the service. A {@link RequestBody} can be created using one of several factory
     *        methods for various sources of data. For example, to create a request body from a file you can do the
     *        following.
     * 
     *        <pre>
     * {@code RequestBody.fromFile(new File("myfile.txt"))}
     * </pre>
     * 
     *        See documentation in {@link RequestBody} for additional details and which sources of data are supported.
     *        The service documentation for the request content is as follows '
     *        <p>
     *        The object data.
     *        </p>
     *        '
     * @return Result of the WriteGetObjectResponse operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.WriteGetObjectResponse
     */
    default WriteGetObjectResponseResponse writeGetObjectResponse(
            Consumer<WriteGetObjectResponseRequest.Builder> writeGetObjectResponseRequest, RequestBody requestBody)
            throws AwsServiceException, SdkClientException, S3Exception {
        return writeGetObjectResponse(WriteGetObjectResponseRequest.builder().applyMutation(writeGetObjectResponseRequest)
                .build(), requestBody);
    }

    /**
     * <p>
     * Passes transformed objects to a <code>GetObject</code> operation when using Object Lambda access points. For
     * information about Object Lambda access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This operation supports metadata that can be returned by <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>, in addition to
     * <code>RequestRoute</code>, <code>RequestToken</code>, <code>StatusCode</code>, <code>ErrorCode</code>, and
     * <code>ErrorMessage</code>. The <code>GetObject</code> response metadata is supported so that the
     * <code>WriteGetObjectResponse</code> caller, typically an Lambda function, can provide the same metadata when it
     * internally invokes <code>GetObject</code>. When <code>WriteGetObjectResponse</code> is called by a customer-owned
     * Lambda function, the metadata returned to the end user <code>GetObject</code> call might differ from what Amazon
     * S3 would normally return.
     * </p>
     * <p>
     * You can include any number of metadata headers. When including a metadata header, it should be prefaced with
     * <code>x-amz-meta</code>. For example, <code>x-amz-meta-my-custom-header: MyCustomValue</code>. The primary use
     * case for this is to forward <code>GetObject</code> metadata.
     * </p>
     * <p>
     * Amazon Web Services provides some prebuilt Lambda functions that you can use with S3 Object Lambda to detect and
     * redact personally identifiable information (PII) and decompress S3 objects. These Lambda functions are available
     * in the Amazon Web Services Serverless Application Repository, and can be selected through the Amazon Web Services
     * Management Console when you create your Object Lambda access point.
     * </p>
     * <p>
     * Example 1: PII Access Control - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically detects personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 2: PII Redaction - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically redacts personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 3: Decompression - The Lambda function S3ObjectLambdaDecompression, is equipped to decompress objects
     * stored in S3 in one of six compressed file formats including bzip2, gzip, snappy, zlib, zstandard and ZIP.
     * </p>
     * <p>
     * For information on how to view and use these functions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-examples.html">Using Amazon Web Services built
     * Lambda functions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     *
     * @param writeGetObjectResponseRequest
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        The object data.
     *        </p>
     *        '
     * @return Result of the WriteGetObjectResponse operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.WriteGetObjectResponse
     * @see #writeGetObjectResponse(WriteGetObjectResponseRequest, RequestBody)
     */
    default WriteGetObjectResponseResponse writeGetObjectResponse(WriteGetObjectResponseRequest writeGetObjectResponseRequest,
            Path sourcePath) throws AwsServiceException, SdkClientException, S3Exception {
        return writeGetObjectResponse(writeGetObjectResponseRequest, RequestBody.fromFile(sourcePath));
    }

    /**
     * <p>
     * Passes transformed objects to a <code>GetObject</code> operation when using Object Lambda access points. For
     * information about Object Lambda access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This operation supports metadata that can be returned by <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>, in addition to
     * <code>RequestRoute</code>, <code>RequestToken</code>, <code>StatusCode</code>, <code>ErrorCode</code>, and
     * <code>ErrorMessage</code>. The <code>GetObject</code> response metadata is supported so that the
     * <code>WriteGetObjectResponse</code> caller, typically an Lambda function, can provide the same metadata when it
     * internally invokes <code>GetObject</code>. When <code>WriteGetObjectResponse</code> is called by a customer-owned
     * Lambda function, the metadata returned to the end user <code>GetObject</code> call might differ from what Amazon
     * S3 would normally return.
     * </p>
     * <p>
     * You can include any number of metadata headers. When including a metadata header, it should be prefaced with
     * <code>x-amz-meta</code>. For example, <code>x-amz-meta-my-custom-header: MyCustomValue</code>. The primary use
     * case for this is to forward <code>GetObject</code> metadata.
     * </p>
     * <p>
     * Amazon Web Services provides some prebuilt Lambda functions that you can use with S3 Object Lambda to detect and
     * redact personally identifiable information (PII) and decompress S3 objects. These Lambda functions are available
     * in the Amazon Web Services Serverless Application Repository, and can be selected through the Amazon Web Services
     * Management Console when you create your Object Lambda access point.
     * </p>
     * <p>
     * Example 1: PII Access Control - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically detects personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 2: PII Redaction - This Lambda function uses Amazon Comprehend, a natural language processing (NLP)
     * service using machine learning to find insights and relationships in text. It automatically redacts personally
     * identifiable information (PII) such as names, addresses, dates, credit card numbers, and social security numbers
     * from documents in your Amazon S3 bucket.
     * </p>
     * <p>
     * Example 3: Decompression - The Lambda function S3ObjectLambdaDecompression, is equipped to decompress objects
     * stored in S3 in one of six compressed file formats including bzip2, gzip, snappy, zlib, zstandard and ZIP.
     * </p>
     * <p>
     * For information on how to view and use these functions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-examples.html">Using Amazon Web Services built
     * Lambda functions</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <br/>
     * <p>
     * This is a convenience which creates an instance of the {@link WriteGetObjectResponseRequest.Builder} avoiding the
     * need to create one manually via {@link WriteGetObjectResponseRequest#builder()}
     * </p>
     *
     * @param writeGetObjectResponseRequest
     *        A {@link Consumer} that will call methods on {@link WriteGetObjectResponseRequest.Builder} to create a
     *        request.
     * @param sourcePath
     *        {@link Path} to file containing data to send to the service. File will be read entirely and may be read
     *        multiple times in the event of a retry. If the file does not exist or the current user does not have
     *        access to read it then an exception will be thrown. The service documentation for the request content is
     *        as follows '
     *        <p>
     *        The object data.
     *        </p>
     *        '
     * @return Result of the WriteGetObjectResponse operation returned by the service.
     * @throws SdkException
     *         Base class for all exceptions that can be thrown by the SDK (both service and client). Can be used for
     *         catch all scenarios.
     * @throws SdkClientException
     *         If any client side error occurs such as an IO related failure, failure to get credentials, etc.
     * @throws S3Exception
     *         Base class for all service exceptions. Unknown exceptions will be thrown as an instance of this type.
     * @sample S3Client.WriteGetObjectResponse
     * @see #writeGetObjectResponse(WriteGetObjectResponseRequest, RequestBody)
     */
    default WriteGetObjectResponseResponse writeGetObjectResponse(
            Consumer<WriteGetObjectResponseRequest.Builder> writeGetObjectResponseRequest, Path sourcePath)
            throws AwsServiceException, SdkClientException, S3Exception {
        return writeGetObjectResponse(WriteGetObjectResponseRequest.builder().applyMutation(writeGetObjectResponseRequest)
                .build(), sourcePath);
    }

    static ServiceMetadata serviceMetadata() {
        return ServiceMetadata.of(SERVICE_METADATA_ID);
    }

    /**
     * Creates an instance of {@link S3Utilities} object with the configuration set on this client.
     */
    default S3Utilities utilities() {
        throw new UnsupportedOperationException();
    }

    /**
     * Create an instance of {@link S3Waiter} using this client.
     * <p>
     * Waiters created via this method are managed by the SDK and resources will be released when the service client is
     * closed.
     *
     * @return an instance of {@link S3Waiter}
     */
    default S3Waiter waiter() {
        throw new UnsupportedOperationException();
    }
}
