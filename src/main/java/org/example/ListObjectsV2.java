package org.example;

import com.xiaobing.oss.model.CommonPrefix;
import com.xiaobing.oss.model.ListObjectsV2Request;
import com.xiaobing.oss.model.ListObjectsV2Response;
import com.xiaobing.oss.model.S3Object;

public class ListObjectsV2 {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String prefix = "a";
            ListObjectsV2Request request = ListObjectsV2Request.builder()
                    .bucket(bucket)
                    .prefix(prefix)
                    .build();
            ListObjectsV2Response listObjectsV2Response = Client.createClient().listObjectsV2(request);
            for(CommonPrefix commonPrefix : listObjectsV2Response.commonPrefixes()) {
                System.out.println("CommonPrefix:" + commonPrefix.prefix());
            }
            for(S3Object s3Object : listObjectsV2Response.contents()) {
                System.out.println("S3Object:" + s3Object.key());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
