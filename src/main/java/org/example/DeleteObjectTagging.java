package org.example;

import com.xiaobing.oss.model.DeleteObjectTaggingRequest;

public class DeleteObjectTagging {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.txt";
            DeleteObjectTaggingRequest request = DeleteObjectTaggingRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            Client.createClient().deleteObjectTagging(request);
            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
