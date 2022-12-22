//snippet-sourcedescription:[GetObject.java demonstrates how to download an object from an Amazon Simple Storage Service (Amazon S3) bucket.]
//snippet-keyword:[AWS SDK for Java v2]
//snippet-service:[Amazon S3]

/*
   Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
   SPDX-License-Identifier: Apache-2.0
*/
package org.example.transfermanager;

import org.example.Client;
import software.amazon.awssdk.transfer.s3.FileDownload;
import software.amazon.awssdk.transfer.s3.S3TransferManager;

import java.nio.file.Paths;

public class GetObject {

    public static void main(String[] args) {

        String bucketName = "buc1";
        String key = "bup.exe";
        String filePath = "D:\\ab.exe";

        S3TransferManager transferManager = Client.createTransferManager();
        downloadObjectTM(transferManager, bucketName, key, filePath);
        System.out.println("Object was successfully downloaded using the Transfer Manager.");
        transferManager.close();
    }

    public static void downloadObjectTM(S3TransferManager transferManager, String bucketName, String objectKey, String objectPath) {
        FileDownload download =
                transferManager.downloadFile(d -> d.getObjectRequest(g -> g.bucket(bucketName).key(objectKey))
                        .destination(Paths.get(objectPath)));
        download.completionFuture().join();
    }
}
