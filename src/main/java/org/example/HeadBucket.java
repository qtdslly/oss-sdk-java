package org.example;

import com.xiaobing.oss.model.HeadBucketRequest;

public class HeadBucket {

    public static void main(String[] args) {
        try {
            String bucket = "buc41";
            HeadBucketRequest request = HeadBucketRequest.builder()
                    .bucket(bucket)
                    .build();
            Client.createClient().headBucket(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
