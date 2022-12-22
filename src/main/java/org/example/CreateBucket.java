package org.example;

import com.xiaobing.oss.model.CreateBucketRequest;

public class CreateBucket {

    public static void main(String[] args) {
        try {
            String bucket = "buc3";
            CreateBucketRequest request = CreateBucketRequest.builder()
                    .bucket(bucket)
                    .build();
            Client.createClient().createBucket(request);
            System.out.println("创建成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
