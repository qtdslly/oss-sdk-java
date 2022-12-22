package org.example;

import com.xiaobing.oss.model.CommonPrefix;
import com.xiaobing.oss.model.ListObjectsRequest;
import com.xiaobing.oss.model.ListObjectsResponse;
import com.xiaobing.oss.model.S3Object;

public class ListObjects {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String prefix = "a";
            ListObjectsRequest request = ListObjectsRequest.builder()
                    .bucket(bucket)
                    .prefix(prefix)
                    .build();
            ListObjectsResponse listObjectsResponse = Client.createClient().listObjects(request);
            for(CommonPrefix commonPrefix : listObjectsResponse.commonPrefixes()) {
                System.out.println("CommonPrefix:" + commonPrefix.prefix());
            }
            for(S3Object s3Object : listObjectsResponse.contents()) {
                System.out.println("S3Object:" + s3Object.key());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
