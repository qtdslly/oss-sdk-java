package org.example;

import com.xiaobing.oss.model.CopyObjectRequest;

public class CopyObject {

    public static void main(String[] args) {
        try {
            String sourceBucket = "buc1";
            String sourceKey = "a.txt";
            String destinationBucket = "buc2";
            String destinationKey = "b/a.txt";
            CopyObjectRequest request = CopyObjectRequest.builder()
                    .sourceBucket(sourceBucket)
                    .sourceKey(sourceKey)
                    .destinationBucket(destinationBucket)
                    .destinationKey(destinationKey)
                    .build();
            Client.createClient().copyObject(request);
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
