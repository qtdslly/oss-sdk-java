package org.example;

import com.xiaobing.oss.model.ListMultipartUploadsRequest;
import com.xiaobing.oss.model.ListMultipartUploadsResponse;
import com.xiaobing.oss.model.MultipartUpload;

public class ListMultipartUploads {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            ListMultipartUploadsRequest request = ListMultipartUploadsRequest.builder()
                    .bucket(bucket)
                    .build();
            ListMultipartUploadsResponse listMultipartUploadsResponse = Client.createClient().listMultipartUploads(request);
            for(MultipartUpload multipartUpload : listMultipartUploadsResponse.uploads()) {
                System.out.println("key:" + multipartUpload.key() + ", " + "uploadId:" + multipartUpload.uploadId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
