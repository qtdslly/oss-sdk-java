package org.example;

import com.xiaobing.oss.model.DeleteObjectRequest;

public class DeleteObject {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.txt";
            DeleteObjectRequest request = DeleteObjectRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            Client.createClient().deleteObject(request);
            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
