//snippet-sourcedescription:[UploadObject.java demonstrates how to upload an object to an Amazon Simple Storage Service (Amazon S3) bucket.]
//snippet-keyword:[AWS SDK for Java v2]
//snippet-service:[Amazon S3]

/*
   Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
   SPDX-License-Identifier: Apache-2.0
*/
package org.example.transfermanager;

import org.example.Client;
import software.amazon.awssdk.transfer.s3.FileUpload;
import software.amazon.awssdk.transfer.s3.S3TransferManager;

import java.nio.file.Paths;

public class UploadObject {

    public static void main(String[] args) {

        String bucketName = "buc1";
        String key = "bup.exe";
        String filePath = "D:\\uplink.exe";

        S3TransferManager transferManager = Client.createTransferManager();
        uploadObjectTM(transferManager, bucketName, key, filePath);
        System.out.println("Object was successfully uploaded using the Transfer Manager.");
        transferManager.close();
    }

    public static void uploadObjectTM( S3TransferManager transferManager, String bucketName, String objectKey, String objectPath) {

        FileUpload upload =
                transferManager.uploadFile(u -> u.source(Paths.get(objectPath))
                        .putObjectRequest(p -> p.bucket(bucketName).key(objectKey)));
        upload.completionFuture().join();
    }
}
