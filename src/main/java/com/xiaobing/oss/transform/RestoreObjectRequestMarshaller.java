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

package com.xiaobing.oss.transform;

import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.runtime.transform.Marshaller;
import software.amazon.awssdk.http.SdkHttpFullRequest;
import software.amazon.awssdk.http.SdkHttpMethod;
import software.amazon.awssdk.protocols.core.OperationInfo;
import software.amazon.awssdk.protocols.core.ProtocolMarshaller;
import software.amazon.awssdk.protocols.xml.AwsXmlProtocolFactory;
import com.xiaobing.oss.model.RestoreObjectRequest;
import software.amazon.awssdk.utils.Validate;

/**
 * {@link RestoreObjectRequest} Marshaller
 */
@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
public class RestoreObjectRequestMarshaller implements Marshaller<RestoreObjectRequest> {
    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().requestUri("/{Bucket}/{Key+}?restore")
            .httpMethod(SdkHttpMethod.POST).hasExplicitPayloadMember(true).hasPayloadMembers(true)
            .putAdditionalMetadata(AwsXmlProtocolFactory.ROOT_MARSHALL_LOCATION_ATTRIBUTE, null)
            .putAdditionalMetadata(AwsXmlProtocolFactory.XML_NAMESPACE_ATTRIBUTE, "http://s3.amazonaws.com/doc/2006-03-01/")
            .build();

    private final AwsXmlProtocolFactory protocolFactory;

    public RestoreObjectRequestMarshaller(AwsXmlProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    @Override
    public SdkHttpFullRequest marshall(RestoreObjectRequest restoreObjectRequest) {
        Validate.paramNotNull(restoreObjectRequest, "restoreObjectRequest");
        try {
            ProtocolMarshaller<SdkHttpFullRequest> protocolMarshaller = protocolFactory
                    .createProtocolMarshaller(SDK_OPERATION_BINDING);
            return protocolMarshaller.marshall(restoreObjectRequest);
        } catch (Exception e) {
            throw SdkClientException.builder().message("Unable to marshall request to JSON: " + e.getMessage()).cause(e).build();
        }
    }
}
