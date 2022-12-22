package org.example;

import com.xiaobing.oss.model.CreateMultipartUploadRequest;
import com.xiaobing.oss.model.CreateMultipartUploadResponse;

public class CreateMultipartUpload {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.exe";
            CreateMultipartUploadRequest request = CreateMultipartUploadRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            CreateMultipartUploadResponse createMultipartUploadResponse = Client.createClient().createMultipartUpload(request);
            System.out.println("uploadId:" + createMultipartUploadResponse.uploadId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
