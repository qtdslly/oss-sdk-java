package org.example;

import com.xiaobing.oss.model.DeleteBucketRequest;

public class DeleteBucket {

    public static void main(String[] args) {
        try {
            String bucket = "buc3";
            DeleteBucketRequest request = DeleteBucketRequest.builder()
                    .bucket(bucket)
                    .build();
            Client.createClient().deleteBucket(request);
            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
