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
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Container for all error elements.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class S3Error implements SdkPojo, Serializable, ToCopyableBuilder<S3Error.Builder, S3Error> {
    private static final SdkField<String> KEY_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Key")
            .getter(getter(S3Error::key))
            .setter(setter(Builder::key))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Key").unmarshallLocationName("Key")
                    .build()).build();

    private static final SdkField<String> VERSION_ID_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("VersionId")
            .getter(getter(S3Error::versionId))
            .setter(setter(Builder::versionId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("VersionId")
                    .unmarshallLocationName("VersionId").build()).build();

    private static final SdkField<String> CODE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Code")
            .getter(getter(S3Error::code))
            .setter(setter(Builder::code))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Code")
                    .unmarshallLocationName("Code").build()).build();

    private static final SdkField<String> MESSAGE_FIELD = SdkField
            .<String> builder(MarshallingType.STRING)
            .memberName("Message")
            .getter(getter(S3Error::message))
            .setter(setter(Builder::message))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Message")
                    .unmarshallLocationName("Message").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(KEY_FIELD, VERSION_ID_FIELD,
            CODE_FIELD, MESSAGE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String key;

    private final String versionId;

    private final String code;

    private final String message;

    private S3Error(BuilderImpl builder) {
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.code = builder.code;
        this.message = builder.message;
    }

    /**
     * <p>
     * The error key.
     * </p>
     * 
     * @return The error key.
     */
    public final String key() {
        return key;
    }

    /**
     * <p>
     * The version ID of the error.
     * </p>
     * 
     * @return The version ID of the error.
     */
    public final String versionId() {
        return versionId;
    }

    /**
     * <p>
     * The error code is a string that uniquely identifies an error condition. It is meant to be read and understood by
     * programs that detect and handle errors by type.
     * </p>
     * <p class="title">
     * <b>Amazon S3 error codes</b>
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccessDenied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Access Denied
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AccountProblem
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> There is a problem with your Amazon Web Services account that prevents the action from
     * completing successfully. Contact Amazon Web Services Support for further assistance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AllAccessDisabled
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> All access to this Amazon S3 resource has been disabled. Contact Amazon Web Services Support
     * for further assistance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AmbiguousGrantByEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The email address you provided is associated with more than one account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> AuthorizationHeaderMalformed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The authorization header you provided is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> BadDigest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The Content-MD5 you specified did not match what we received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> BucketAlreadyExists
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The requested bucket name is not available. The bucket namespace is shared by all users of
     * the system. Please select a different name and try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 409 Conflict
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> BucketAlreadyOwnedByYou
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The bucket you tried to create already exists, and you own it. Amazon S3 returns this error
     * in all Amazon Web Services Regions except in the North Virginia Region. For legacy compatibility, if you
     * re-create an existing bucket that you already own in the North Virginia Region, Amazon S3 returns 200 OK and
     * resets the bucket access control lists (ACLs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> 409 Conflict (in all Regions except the North Virginia Region)
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> BucketNotEmpty
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The bucket you tried to delete is not empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 409 Conflict
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> CredentialsNotSupported
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> This request does not support credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> CrossLocationLoggingProhibited
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Cross-location logging not allowed. Buckets in one geographic location cannot log information
     * to a bucket in another location.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> EntityTooSmall
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your proposed upload is smaller than the minimum allowed object size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> EntityTooLarge
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your proposed upload exceeds the maximum allowed object size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> ExpiredToken
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The provided token has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> IllegalVersioningConfigurationException
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Indicates that the versioning configuration specified in the request is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> IncompleteBody
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> You did not provide the number of bytes specified by the Content-Length HTTP header
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> IncorrectNumberOfFilesInPostRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> POST requires exactly one file upload per request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InlineDataTooLarge
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Inline data exceeds the maximum allowed size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InternalError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> We encountered an internal error. Please try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 500 Internal Server Error
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Server
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidAccessKeyId
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The Amazon Web Services access key ID you provided does not exist in our records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidAddressingHeader
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> You must specify the Anonymous role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> N/A
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidArgument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Invalid Argument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidBucketName
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified bucket is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidBucketState
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The request is not valid with the current state of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 409 Conflict
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidDigest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The Content-MD5 you specified is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidEncryptionAlgorithmError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The encryption request you specified is not valid. The valid value is AES256.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidLocationConstraint
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified location constraint is not valid. For more information about Regions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">How to Select a
     * Region for Your Buckets</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidObjectState
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The action is not valid for the current state of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidPart
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> One or more of the specified parts could not be found. The part might not have been uploaded,
     * or the specified entity tag might not have matched the part's entity tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidPartOrder
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The list of parts was not in ascending order. Parts list must be specified in order by part
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidPayer
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> All access to this object has been disabled. Please contact Amazon Web Services Support for
     * further assistance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidPolicyDocument
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The content of the form does not meet the conditions specified in the policy document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRange
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The requested range cannot be satisfied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 416 Requested Range Not Satisfiable
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Please use <code>AWS4-HMAC-SHA256</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> SOAP requests must be made over an HTTPS connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS compliant names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with periods (.) in their names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Accelerate endpoint only supports virtual style requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Accelerate is not configured on this bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Accelerate is disabled on this bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported on this bucket. Contact Amazon Web Services
     * Support for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Amazon S3 Transfer Acceleration cannot be enabled on this bucket. Contact Amazon Web Services
     * Support for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Code:</i> N/A
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidSecurity
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The provided security credentials are not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidSOAPRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The SOAP request body is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidStorageClass
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The storage class you specified is not valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidTargetBucketForLogging
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The target bucket for logging does not exist, is not owned by you, or does not have the
     * appropriate grants for the log-delivery group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidToken
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The provided token is malformed or otherwise invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> InvalidURI
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Couldn't parse the specified URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> KeyTooLongError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your key is too long.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MalformedACLError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The XML you provided was not well-formed or did not validate against our published schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MalformedPOSTRequest
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The body of your POST request is not well-formed multipart/form-data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MalformedXML
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> This happens when the user sends malformed XML (XML that doesn't conform to the published
     * XSD) for the configuration. The error message is,
     * "The XML you provided was not well-formed or did not validate against our published schema."
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MaxMessageLengthExceeded
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your request was too big.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MaxPostPreDataLengthExceededError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your POST request fields preceding the upload file were too large.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MetadataTooLarge
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your metadata headers exceed the maximum allowed metadata size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MethodNotAllowed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified method is not allowed against this resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 405 Method Not Allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MissingAttachment
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> A SOAP attachment was expected, but none were found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> N/A
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MissingContentLength
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> You must provide the Content-Length HTTP header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 411 Length Required
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MissingRequestBodyError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> This happens when the user sends an empty XML document as a request. The error message is,
     * "Request body is empty."
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MissingSecurityElement
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The SOAP 1.1 request is missing a security element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> MissingSecurityHeader
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your request is missing a required header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoLoggingStatusForKey
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> There is no such thing as a logging status subresource for a key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchBucket
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified bucket does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchBucketPolicy
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified bucket does not have a bucket policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchKey
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified key does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchLifecycleConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchUpload
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The specified multipart upload does not exist. The upload ID might be invalid, or the
     * multipart upload might have been aborted or completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NoSuchVersion
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Indicates that the version ID specified in the request does not match an existing version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NotImplemented
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> A header you provided implies functionality that is not implemented.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 501 Not Implemented
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Server
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> NotSignedUp
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your account is not signed up for the Amazon S3 service. You must sign up before you can use
     * Amazon S3. You can sign up at the following URL: <a href="http://aws.amazon.com/s3">Amazon S3</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> OperationAborted
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> A conflicting conditional action is currently in progress against this resource. Try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 409 Conflict
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> PermanentRedirect
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The bucket you are attempting to access must be addressed using the specified endpoint. Send
     * all future requests to this endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 301 Moved Permanently
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> PreconditionFailed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> At least one of the preconditions you specified did not hold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 412 Precondition Failed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> Redirect
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Temporary redirect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 307 Moved Temporarily
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> RestoreAlreadyInProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Object restore is already in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 409 Conflict
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> RequestIsNotMultiPartContent
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Bucket POST must be of the enclosure-type multipart/form-data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> RequestTimeout
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Your socket connection to the server was not read from or written to within the timeout
     * period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> RequestTimeTooSkewed
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The difference between the request time and the server's time is too large.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> RequestTorrentOfBucketError
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Requesting the torrent file of a bucket is not permitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> SignatureDoesNotMatch
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The request signature we calculated does not match the signature you provided. Check your
     * Amazon Web Services secret access key and signing method. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/SOAPAuthentication.html">SOAP Authentication</a> for
     * details.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 403 Forbidden
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> ServiceUnavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Reduce your request rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 503 Service Unavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Server
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> SlowDown
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> Reduce your request rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 503 Slow Down
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Server
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TemporaryRedirect
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> You are being redirected to the bucket while DNS updates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 307 Moved Temporarily
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TokenRefreshRequired
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The provided token must be refreshed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> TooManyBuckets
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> You have attempted to create more buckets than allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> UnexpectedContent
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> This request does not support content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> UnresolvableGrantByEmailAddress
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The email address you provided does not match any account on record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <i>Code:</i> UserKeyMustBeSpecified
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Description:</i> The bucket POST must contain the specified field name. If it is specified, check the order of
     * the fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>HTTP Status Code:</i> 400 Bad Request
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SOAP Fault Code Prefix:</i> Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p/>
     * 
     * @return The error code is a string that uniquely identifies an error condition. It is meant to be read and
     *         understood by programs that detect and handle errors by type.
     *         </p>
     *         <p class="title">
     *         <b>Amazon S3 error codes</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> AccessDenied
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Access Denied
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> AccountProblem
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> There is a problem with your Amazon Web Services account that prevents the action
     *         from completing successfully. Contact Amazon Web Services Support for further assistance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> AllAccessDisabled
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> All access to this Amazon S3 resource has been disabled. Contact Amazon Web Services
     *         Support for further assistance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> AmbiguousGrantByEmailAddress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The email address you provided is associated with more than one account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> AuthorizationHeaderMalformed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The authorization header you provided is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> BadDigest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The Content-MD5 you specified did not match what we received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> BucketAlreadyExists
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The requested bucket name is not available. The bucket namespace is shared by all
     *         users of the system. Please select a different name and try again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 409 Conflict
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> BucketAlreadyOwnedByYou
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The bucket you tried to create already exists, and you own it. Amazon S3 returns this
     *         error in all Amazon Web Services Regions except in the North Virginia Region. For legacy compatibility,
     *         if you re-create an existing bucket that you already own in the North Virginia Region, Amazon S3 returns
     *         200 OK and resets the bucket access control lists (ACLs).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> 409 Conflict (in all Regions except the North Virginia Region)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> BucketNotEmpty
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The bucket you tried to delete is not empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 409 Conflict
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> CredentialsNotSupported
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> This request does not support credentials.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> CrossLocationLoggingProhibited
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Cross-location logging not allowed. Buckets in one geographic location cannot log
     *         information to a bucket in another location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> EntityTooSmall
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your proposed upload is smaller than the minimum allowed object size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> EntityTooLarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your proposed upload exceeds the maximum allowed object size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> ExpiredToken
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The provided token has expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> IllegalVersioningConfigurationException
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Indicates that the versioning configuration specified in the request is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> IncompleteBody
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> You did not provide the number of bytes specified by the Content-Length HTTP header
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> IncorrectNumberOfFilesInPostRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> POST requires exactly one file upload per request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InlineDataTooLarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Inline data exceeds the maximum allowed size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InternalError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> We encountered an internal error. Please try again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 500 Internal Server Error
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Server
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidAccessKeyId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The Amazon Web Services access key ID you provided does not exist in our records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidAddressingHeader
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> You must specify the Anonymous role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> N/A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidArgument
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Invalid Argument
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidBucketName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified bucket is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidBucketState
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The request is not valid with the current state of the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 409 Conflict
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidDigest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The Content-MD5 you specified is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidEncryptionAlgorithmError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The encryption request you specified is not valid. The valid value is AES256.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidLocationConstraint
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified location constraint is not valid. For more information about Regions,
     *         see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">How to
     *         Select a Region for Your Buckets</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidObjectState
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The action is not valid for the current state of the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidPart
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> One or more of the specified parts could not be found. The part might not have been
     *         uploaded, or the specified entity tag might not have matched the part's entity tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidPartOrder
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The list of parts was not in ascending order. Parts list must be specified in order
     *         by part number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidPayer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> All access to this object has been disabled. Please contact Amazon Web Services
     *         Support for further assistance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidPolicyDocument
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The content of the form does not meet the conditions specified in the policy
     *         document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRange
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The requested range cannot be satisfied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 416 Requested Range Not Satisfiable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Please use <code>AWS4-HMAC-SHA256</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> SOAP requests must be made over an HTTPS connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS compliant
     *         names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with periods (.) in
     *         their names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Accelerate endpoint only supports virtual style requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Accelerate is not configured on this bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Accelerate is disabled on this bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Acceleration is not supported on this bucket. Contact Amazon Web
     *         Services Support for more information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Amazon S3 Transfer Acceleration cannot be enabled on this bucket. Contact Amazon Web
     *         Services Support for more information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Code:</i> N/A
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidSecurity
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The provided security credentials are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidSOAPRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The SOAP request body is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidStorageClass
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The storage class you specified is not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidTargetBucketForLogging
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The target bucket for logging does not exist, is not owned by you, or does not have
     *         the appropriate grants for the log-delivery group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidToken
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The provided token is malformed or otherwise invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> InvalidURI
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Couldn't parse the specified URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> KeyTooLongError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your key is too long.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MalformedACLError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The XML you provided was not well-formed or did not validate against our published
     *         schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MalformedPOSTRequest
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The body of your POST request is not well-formed multipart/form-data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MalformedXML
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> This happens when the user sends malformed XML (XML that doesn't conform to the
     *         published XSD) for the configuration. The error message is,
     *         "The XML you provided was not well-formed or did not validate against our published schema."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MaxMessageLengthExceeded
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your request was too big.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MaxPostPreDataLengthExceededError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your POST request fields preceding the upload file were too large.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MetadataTooLarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your metadata headers exceed the maximum allowed metadata size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MethodNotAllowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified method is not allowed against this resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 405 Method Not Allowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MissingAttachment
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> A SOAP attachment was expected, but none were found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> N/A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MissingContentLength
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> You must provide the Content-Length HTTP header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 411 Length Required
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MissingRequestBodyError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> This happens when the user sends an empty XML document as a request. The error
     *         message is, "Request body is empty."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MissingSecurityElement
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The SOAP 1.1 request is missing a security element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> MissingSecurityHeader
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your request is missing a required header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoLoggingStatusForKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> There is no such thing as a logging status subresource for a key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchBucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified bucket does not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchBucketPolicy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified bucket does not have a bucket policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified key does not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchLifecycleConfiguration
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The lifecycle configuration does not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchUpload
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The specified multipart upload does not exist. The upload ID might be invalid, or the
     *         multipart upload might have been aborted or completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NoSuchVersion
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Indicates that the version ID specified in the request does not match an existing
     *         version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 404 Not Found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NotImplemented
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> A header you provided implies functionality that is not implemented.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 501 Not Implemented
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Server
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> NotSignedUp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your account is not signed up for the Amazon S3 service. You must sign up before you
     *         can use Amazon S3. You can sign up at the following URL: <a href="http://aws.amazon.com/s3">Amazon S3</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> OperationAborted
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> A conflicting conditional action is currently in progress against this resource. Try
     *         again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 409 Conflict
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> PermanentRedirect
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The bucket you are attempting to access must be addressed using the specified
     *         endpoint. Send all future requests to this endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 301 Moved Permanently
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> PreconditionFailed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> At least one of the preconditions you specified did not hold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 412 Precondition Failed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> Redirect
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Temporary redirect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 307 Moved Temporarily
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> RestoreAlreadyInProgress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Object restore is already in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 409 Conflict
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> RequestIsNotMultiPartContent
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Bucket POST must be of the enclosure-type multipart/form-data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> RequestTimeout
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Your socket connection to the server was not read from or written to within the
     *         timeout period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> RequestTimeTooSkewed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The difference between the request time and the server's time is too large.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> RequestTorrentOfBucketError
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Requesting the torrent file of a bucket is not permitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> SignatureDoesNotMatch
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The request signature we calculated does not match the signature you provided. Check
     *         your Amazon Web Services secret access key and signing method. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a>
     *         and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/SOAPAuthentication.html">SOAP
     *         Authentication</a> for details.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 403 Forbidden
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> ServiceUnavailable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Reduce your request rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 503 Service Unavailable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Server
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> SlowDown
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> Reduce your request rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 503 Slow Down
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Server
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> TemporaryRedirect
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> You are being redirected to the bucket while DNS updates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 307 Moved Temporarily
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> TokenRefreshRequired
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The provided token must be refreshed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> TooManyBuckets
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> You have attempted to create more buckets than allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> UnexpectedContent
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> This request does not support content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> UnresolvableGrantByEmailAddress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The email address you provided does not match any account on record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Code:</i> UserKeyMustBeSpecified
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Description:</i> The bucket POST must contain the specified field name. If it is specified, check the
     *         order of the fields.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>HTTP Status Code:</i> 400 Bad Request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SOAP Fault Code Prefix:</i> Client
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public final String code() {
        return code;
    }

    /**
     * <p>
     * The error message contains a generic description of the error condition in English. It is intended for a human
     * audience. Simple programs display the message directly to the end user if they encounter an error condition they
     * don't know how or don't care to handle. Sophisticated programs with more exhaustive error handling and proper
     * internationalization are more likely to ignore the error message.
     * </p>
     * 
     * @return The error message contains a generic description of the error condition in English. It is intended for a
     *         human audience. Simple programs display the message directly to the end user if they encounter an error
     *         condition they don't know how or don't care to handle. Sophisticated programs with more exhaustive error
     *         handling and proper internationalization are more likely to ignore the error message.
     */
    public final String message() {
        return message;
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
        hashCode = 31 * hashCode + Objects.hashCode(key());
        hashCode = 31 * hashCode + Objects.hashCode(versionId());
        hashCode = 31 * hashCode + Objects.hashCode(code());
        hashCode = 31 * hashCode + Objects.hashCode(message());
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
        if (!(obj instanceof S3Error)) {
            return false;
        }
        S3Error other = (S3Error) obj;
        return Objects.equals(key(), other.key()) && Objects.equals(versionId(), other.versionId())
                && Objects.equals(code(), other.code()) && Objects.equals(message(), other.message());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("S3Error").add("Key", key()).add("VersionId", versionId()).add("Code", code())
                .add("Message", message()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Key":
            return Optional.ofNullable(clazz.cast(key()));
        case "VersionId":
            return Optional.ofNullable(clazz.cast(versionId()));
        case "Code":
            return Optional.ofNullable(clazz.cast(code()));
        case "Message":
            return Optional.ofNullable(clazz.cast(message()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<S3Error, T> g) {
        return obj -> g.apply((S3Error) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, S3Error> {
        /**
         * <p>
         * The error key.
         * </p>
         * 
         * @param key
         *        The error key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder key(String key);

        /**
         * <p>
         * The version ID of the error.
         * </p>
         * 
         * @param versionId
         *        The version ID of the error.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder versionId(String versionId);

        /**
         * <p>
         * The error code is a string that uniquely identifies an error condition. It is meant to be read and understood
         * by programs that detect and handle errors by type.
         * </p>
         * <p class="title">
         * <b>Amazon S3 error codes</b>
         * </p>
         * <ul>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> AccessDenied
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Access Denied
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> AccountProblem
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> There is a problem with your Amazon Web Services account that prevents the action from
         * completing successfully. Contact Amazon Web Services Support for further assistance.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> AllAccessDisabled
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> All access to this Amazon S3 resource has been disabled. Contact Amazon Web Services
         * Support for further assistance.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> AmbiguousGrantByEmailAddress
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The email address you provided is associated with more than one account.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> AuthorizationHeaderMalformed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The authorization header you provided is invalid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> BadDigest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The Content-MD5 you specified did not match what we received.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> BucketAlreadyExists
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The requested bucket name is not available. The bucket namespace is shared by all users
         * of the system. Please select a different name and try again.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 409 Conflict
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> BucketAlreadyOwnedByYou
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The bucket you tried to create already exists, and you own it. Amazon S3 returns this
         * error in all Amazon Web Services Regions except in the North Virginia Region. For legacy compatibility, if
         * you re-create an existing bucket that you already own in the North Virginia Region, Amazon S3 returns 200 OK
         * and resets the bucket access control lists (ACLs).
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> 409 Conflict (in all Regions except the North Virginia Region)
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> BucketNotEmpty
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The bucket you tried to delete is not empty.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 409 Conflict
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> CredentialsNotSupported
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> This request does not support credentials.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> CrossLocationLoggingProhibited
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Cross-location logging not allowed. Buckets in one geographic location cannot log
         * information to a bucket in another location.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> EntityTooSmall
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your proposed upload is smaller than the minimum allowed object size.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> EntityTooLarge
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your proposed upload exceeds the maximum allowed object size.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> ExpiredToken
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The provided token has expired.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> IllegalVersioningConfigurationException
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Indicates that the versioning configuration specified in the request is invalid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> IncompleteBody
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> You did not provide the number of bytes specified by the Content-Length HTTP header
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> IncorrectNumberOfFilesInPostRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> POST requires exactly one file upload per request.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InlineDataTooLarge
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Inline data exceeds the maximum allowed size.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InternalError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> We encountered an internal error. Please try again.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 500 Internal Server Error
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Server
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidAccessKeyId
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The Amazon Web Services access key ID you provided does not exist in our records.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidAddressingHeader
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> You must specify the Anonymous role.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> N/A
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidArgument
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Invalid Argument
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidBucketName
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified bucket is not valid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidBucketState
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The request is not valid with the current state of the bucket.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 409 Conflict
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidDigest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The Content-MD5 you specified is not valid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidEncryptionAlgorithmError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The encryption request you specified is not valid. The valid value is AES256.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidLocationConstraint
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified location constraint is not valid. For more information about Regions, see
         * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">How to Select
         * a Region for Your Buckets</a>.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidObjectState
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The action is not valid for the current state of the object.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidPart
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> One or more of the specified parts could not be found. The part might not have been
         * uploaded, or the specified entity tag might not have matched the part's entity tag.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidPartOrder
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The list of parts was not in ascending order. Parts list must be specified in order by
         * part number.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidPayer
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> All access to this object has been disabled. Please contact Amazon Web Services Support
         * for further assistance.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidPolicyDocument
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The content of the form does not meet the conditions specified in the policy document.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRange
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The requested range cannot be satisfied.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 416 Requested Range Not Satisfiable
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Please use <code>AWS4-HMAC-SHA256</code>.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> SOAP requests must be made over an HTTPS connection.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS compliant
         * names.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with periods (.) in their
         * names.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Accelerate endpoint only supports virtual style requests.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Accelerate is not configured on this bucket.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Accelerate is disabled on this bucket.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Acceleration is not supported on this bucket. Contact Amazon Web
         * Services Support for more information.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Amazon S3 Transfer Acceleration cannot be enabled on this bucket. Contact Amazon Web
         * Services Support for more information.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Code:</i> N/A
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidSecurity
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The provided security credentials are not valid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidSOAPRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The SOAP request body is invalid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidStorageClass
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The storage class you specified is not valid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidTargetBucketForLogging
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The target bucket for logging does not exist, is not owned by you, or does not have the
         * appropriate grants for the log-delivery group.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidToken
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The provided token is malformed or otherwise invalid.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> InvalidURI
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Couldn't parse the specified URI.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> KeyTooLongError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your key is too long.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MalformedACLError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The XML you provided was not well-formed or did not validate against our published
         * schema.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MalformedPOSTRequest
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The body of your POST request is not well-formed multipart/form-data.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MalformedXML
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> This happens when the user sends malformed XML (XML that doesn't conform to the published
         * XSD) for the configuration. The error message is,
         * "The XML you provided was not well-formed or did not validate against our published schema."
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MaxMessageLengthExceeded
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your request was too big.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MaxPostPreDataLengthExceededError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your POST request fields preceding the upload file were too large.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MetadataTooLarge
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your metadata headers exceed the maximum allowed metadata size.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MethodNotAllowed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified method is not allowed against this resource.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 405 Method Not Allowed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MissingAttachment
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> A SOAP attachment was expected, but none were found.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> N/A
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MissingContentLength
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> You must provide the Content-Length HTTP header.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 411 Length Required
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MissingRequestBodyError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> This happens when the user sends an empty XML document as a request. The error message
         * is, "Request body is empty."
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MissingSecurityElement
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The SOAP 1.1 request is missing a security element.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> MissingSecurityHeader
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your request is missing a required header.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoLoggingStatusForKey
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> There is no such thing as a logging status subresource for a key.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchBucket
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified bucket does not exist.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchBucketPolicy
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified bucket does not have a bucket policy.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchKey
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified key does not exist.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchLifecycleConfiguration
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The lifecycle configuration does not exist.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchUpload
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The specified multipart upload does not exist. The upload ID might be invalid, or the
         * multipart upload might have been aborted or completed.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NoSuchVersion
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Indicates that the version ID specified in the request does not match an existing
         * version.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 404 Not Found
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NotImplemented
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> A header you provided implies functionality that is not implemented.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 501 Not Implemented
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Server
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> NotSignedUp
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your account is not signed up for the Amazon S3 service. You must sign up before you can
         * use Amazon S3. You can sign up at the following URL: <a href="http://aws.amazon.com/s3">Amazon S3</a>
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> OperationAborted
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> A conflicting conditional action is currently in progress against this resource. Try
         * again.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 409 Conflict
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> PermanentRedirect
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The bucket you are attempting to access must be addressed using the specified endpoint.
         * Send all future requests to this endpoint.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 301 Moved Permanently
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> PreconditionFailed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> At least one of the preconditions you specified did not hold.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 412 Precondition Failed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> Redirect
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Temporary redirect.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 307 Moved Temporarily
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> RestoreAlreadyInProgress
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Object restore is already in progress.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 409 Conflict
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> RequestIsNotMultiPartContent
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Bucket POST must be of the enclosure-type multipart/form-data.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> RequestTimeout
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Your socket connection to the server was not read from or written to within the timeout
         * period.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> RequestTimeTooSkewed
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The difference between the request time and the server's time is too large.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> RequestTorrentOfBucketError
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Requesting the torrent file of a bucket is not permitted.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> SignatureDoesNotMatch
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The request signature we calculated does not match the signature you provided. Check your
         * Amazon Web Services secret access key and signing method. For more information, see <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a> and <a
         * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/SOAPAuthentication.html">SOAP Authentication</a> for
         * details.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 403 Forbidden
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> ServiceUnavailable
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Reduce your request rate.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 503 Service Unavailable
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Server
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> SlowDown
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> Reduce your request rate.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 503 Slow Down
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Server
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> TemporaryRedirect
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> You are being redirected to the bucket while DNS updates.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 307 Moved Temporarily
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> TokenRefreshRequired
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The provided token must be refreshed.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> TooManyBuckets
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> You have attempted to create more buckets than allowed.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> UnexpectedContent
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> This request does not support content.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> UnresolvableGrantByEmailAddress
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The email address you provided does not match any account on record.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * <li>
         * <ul>
         * <li>
         * <p>
         * <i>Code:</i> UserKeyMustBeSpecified
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>Description:</i> The bucket POST must contain the specified field name. If it is specified, check the
         * order of the fields.
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>HTTP Status Code:</i> 400 Bad Request
         * </p>
         * </li>
         * <li>
         * <p>
         * <i>SOAP Fault Code Prefix:</i> Client
         * </p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p/>
         * 
         * @param code
         *        The error code is a string that uniquely identifies an error condition. It is meant to be read and
         *        understood by programs that detect and handle errors by type.
         *        </p>
         *        <p class="title">
         *        <b>Amazon S3 error codes</b>
         *        </p>
         *        <ul>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> AccessDenied
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Access Denied
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> AccountProblem
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> There is a problem with your Amazon Web Services account that prevents the action
         *        from completing successfully. Contact Amazon Web Services Support for further assistance.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> AllAccessDisabled
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> All access to this Amazon S3 resource has been disabled. Contact Amazon Web
         *        Services Support for further assistance.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> AmbiguousGrantByEmailAddress
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The email address you provided is associated with more than one account.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> AuthorizationHeaderMalformed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The authorization header you provided is invalid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> BadDigest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The Content-MD5 you specified did not match what we received.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> BucketAlreadyExists
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The requested bucket name is not available. The bucket namespace is shared by all
         *        users of the system. Please select a different name and try again.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 409 Conflict
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> BucketAlreadyOwnedByYou
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The bucket you tried to create already exists, and you own it. Amazon S3 returns
         *        this error in all Amazon Web Services Regions except in the North Virginia Region. For legacy
         *        compatibility, if you re-create an existing bucket that you already own in the North Virginia Region,
         *        Amazon S3 returns 200 OK and resets the bucket access control lists (ACLs).
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> 409 Conflict (in all Regions except the North Virginia Region)
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> BucketNotEmpty
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The bucket you tried to delete is not empty.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 409 Conflict
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> CredentialsNotSupported
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> This request does not support credentials.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> CrossLocationLoggingProhibited
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Cross-location logging not allowed. Buckets in one geographic location cannot log
         *        information to a bucket in another location.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> EntityTooSmall
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your proposed upload is smaller than the minimum allowed object size.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> EntityTooLarge
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your proposed upload exceeds the maximum allowed object size.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> ExpiredToken
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The provided token has expired.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> IllegalVersioningConfigurationException
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Indicates that the versioning configuration specified in the request is invalid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> IncompleteBody
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> You did not provide the number of bytes specified by the Content-Length HTTP
         *        header
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> IncorrectNumberOfFilesInPostRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> POST requires exactly one file upload per request.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InlineDataTooLarge
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Inline data exceeds the maximum allowed size.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InternalError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> We encountered an internal error. Please try again.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 500 Internal Server Error
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Server
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidAccessKeyId
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The Amazon Web Services access key ID you provided does not exist in our records.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidAddressingHeader
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> You must specify the Anonymous role.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> N/A
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidArgument
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Invalid Argument
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidBucketName
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified bucket is not valid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidBucketState
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The request is not valid with the current state of the bucket.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 409 Conflict
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidDigest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The Content-MD5 you specified is not valid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidEncryptionAlgorithmError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The encryption request you specified is not valid. The valid value is AES256.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidLocationConstraint
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified location constraint is not valid. For more information about
         *        Regions, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingBucket.html#access-bucket-intro">How to
         *        Select a Region for Your Buckets</a>.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidObjectState
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The action is not valid for the current state of the object.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidPart
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> One or more of the specified parts could not be found. The part might not have
         *        been uploaded, or the specified entity tag might not have matched the part's entity tag.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidPartOrder
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The list of parts was not in ascending order. Parts list must be specified in
         *        order by part number.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidPayer
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> All access to this object has been disabled. Please contact Amazon Web Services
         *        Support for further assistance.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidPolicyDocument
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The content of the form does not meet the conditions specified in the policy
         *        document.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRange
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The requested range cannot be satisfied.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 416 Requested Range Not Satisfiable
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Please use <code>AWS4-HMAC-SHA256</code>.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> SOAP requests must be made over an HTTPS connection.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with non-DNS
         *        compliant names.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Acceleration is not supported for buckets with periods (.) in
         *        their names.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Accelerate endpoint only supports virtual style requests.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Accelerate is not configured on this bucket.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Accelerate is disabled on this bucket.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Acceleration is not supported on this bucket. Contact Amazon
         *        Web Services Support for more information.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Amazon S3 Transfer Acceleration cannot be enabled on this bucket. Contact Amazon
         *        Web Services Support for more information.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Code:</i> N/A
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidSecurity
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The provided security credentials are not valid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidSOAPRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The SOAP request body is invalid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidStorageClass
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The storage class you specified is not valid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidTargetBucketForLogging
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The target bucket for logging does not exist, is not owned by you, or does not
         *        have the appropriate grants for the log-delivery group.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidToken
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The provided token is malformed or otherwise invalid.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> InvalidURI
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Couldn't parse the specified URI.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> KeyTooLongError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your key is too long.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MalformedACLError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The XML you provided was not well-formed or did not validate against our published
         *        schema.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MalformedPOSTRequest
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The body of your POST request is not well-formed multipart/form-data.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MalformedXML
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> This happens when the user sends malformed XML (XML that doesn't conform to the
         *        published XSD) for the configuration. The error message is,
         *        "The XML you provided was not well-formed or did not validate against our published schema."
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MaxMessageLengthExceeded
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your request was too big.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MaxPostPreDataLengthExceededError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your POST request fields preceding the upload file were too large.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MetadataTooLarge
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your metadata headers exceed the maximum allowed metadata size.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MethodNotAllowed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified method is not allowed against this resource.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 405 Method Not Allowed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MissingAttachment
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> A SOAP attachment was expected, but none were found.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> N/A
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MissingContentLength
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> You must provide the Content-Length HTTP header.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 411 Length Required
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MissingRequestBodyError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> This happens when the user sends an empty XML document as a request. The error
         *        message is, "Request body is empty."
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MissingSecurityElement
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The SOAP 1.1 request is missing a security element.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> MissingSecurityHeader
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your request is missing a required header.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoLoggingStatusForKey
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> There is no such thing as a logging status subresource for a key.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchBucket
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified bucket does not exist.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchBucketPolicy
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified bucket does not have a bucket policy.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchKey
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified key does not exist.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchLifecycleConfiguration
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The lifecycle configuration does not exist.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchUpload
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The specified multipart upload does not exist. The upload ID might be invalid, or
         *        the multipart upload might have been aborted or completed.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NoSuchVersion
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Indicates that the version ID specified in the request does not match an existing
         *        version.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 404 Not Found
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NotImplemented
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> A header you provided implies functionality that is not implemented.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 501 Not Implemented
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Server
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> NotSignedUp
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your account is not signed up for the Amazon S3 service. You must sign up before
         *        you can use Amazon S3. You can sign up at the following URL: <a href="http://aws.amazon.com/s3">Amazon
         *        S3</a>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> OperationAborted
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> A conflicting conditional action is currently in progress against this resource.
         *        Try again.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 409 Conflict
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> PermanentRedirect
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The bucket you are attempting to access must be addressed using the specified
         *        endpoint. Send all future requests to this endpoint.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 301 Moved Permanently
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> PreconditionFailed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> At least one of the preconditions you specified did not hold.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 412 Precondition Failed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> Redirect
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Temporary redirect.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 307 Moved Temporarily
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> RestoreAlreadyInProgress
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Object restore is already in progress.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 409 Conflict
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> RequestIsNotMultiPartContent
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Bucket POST must be of the enclosure-type multipart/form-data.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> RequestTimeout
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Your socket connection to the server was not read from or written to within the
         *        timeout period.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> RequestTimeTooSkewed
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The difference between the request time and the server's time is too large.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> RequestTorrentOfBucketError
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Requesting the torrent file of a bucket is not permitted.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> SignatureDoesNotMatch
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The request signature we calculated does not match the signature you provided.
         *        Check your Amazon Web Services secret access key and signing method. For more information, see <a
         *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST Authentication</a>
         *        and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/SOAPAuthentication.html">SOAP
         *        Authentication</a> for details.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 403 Forbidden
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> ServiceUnavailable
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Reduce your request rate.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 503 Service Unavailable
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Server
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> SlowDown
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> Reduce your request rate.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 503 Slow Down
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Server
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> TemporaryRedirect
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> You are being redirected to the bucket while DNS updates.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 307 Moved Temporarily
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> TokenRefreshRequired
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The provided token must be refreshed.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> TooManyBuckets
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> You have attempted to create more buckets than allowed.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> UnexpectedContent
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> This request does not support content.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> UnresolvableGrantByEmailAddress
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The email address you provided does not match any account on record.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        <li>
         *        <ul>
         *        <li>
         *        <p>
         *        <i>Code:</i> UserKeyMustBeSpecified
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>Description:</i> The bucket POST must contain the specified field name. If it is specified, check
         *        the order of the fields.
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>HTTP Status Code:</i> 400 Bad Request
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        <i>SOAP Fault Code Prefix:</i> Client
         *        </p>
         *        </li>
         *        </ul>
         *        </li>
         *        </ul>
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder code(String code);

        /**
         * <p>
         * The error message contains a generic description of the error condition in English. It is intended for a
         * human audience. Simple programs display the message directly to the end user if they encounter an error
         * condition they don't know how or don't care to handle. Sophisticated programs with more exhaustive error
         * handling and proper internationalization are more likely to ignore the error message.
         * </p>
         * 
         * @param message
         *        The error message contains a generic description of the error condition in English. It is intended for
         *        a human audience. Simple programs display the message directly to the end user if they encounter an
         *        error condition they don't know how or don't care to handle. Sophisticated programs with more
         *        exhaustive error handling and proper internationalization are more likely to ignore the error message.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder message(String message);
    }

    static final class BuilderImpl implements Builder {
        private String key;

        private String versionId;

        private String code;

        private String message;

        private BuilderImpl() {
        }

        private BuilderImpl(S3Error model) {
            key(model.key);
            versionId(model.versionId);
            code(model.code);
            message(model.message);
        }

        public final String getKey() {
            return key;
        }

        public final void setKey(String key) {
            this.key = key;
        }

        @Override
        public final Builder key(String key) {
            this.key = key;
            return this;
        }

        public final String getVersionId() {
            return versionId;
        }

        public final void setVersionId(String versionId) {
            this.versionId = versionId;
        }

        @Override
        public final Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public final String getCode() {
            return code;
        }

        public final void setCode(String code) {
            this.code = code;
        }

        @Override
        public final Builder code(String code) {
            this.code = code;
            return this;
        }

        public final String getMessage() {
            return message;
        }

        public final void setMessage(String message) {
            this.message = message;
        }

        @Override
        public final Builder message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public S3Error build() {
            return new S3Error(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
