package org.example;


import com.xiaobing.oss.model.Delete;
import com.xiaobing.oss.model.DeleteObjectsRequest;
import com.xiaobing.oss.model.ObjectIdentifier;

import java.util.ArrayList;

public class DeleteObjects {

    public static void main(String[] args) {
        String bucket = "buc2";
        String key1 = "a.txt";
        String key2 = "a/a.txt";
        ArrayList<ObjectIdentifier> toDelete = new ArrayList<>();
        toDelete.add(ObjectIdentifier.builder()
                .key(key1)
                .build());
        toDelete.add(ObjectIdentifier.builder()
                .key(key2)
                .build());
        DeleteObjectsRequest request = DeleteObjectsRequest.builder()
                .bucket(bucket)
                .delete(Delete.builder()
                        .objects(toDelete).build())
                .build();
        try {
            Client.createClient().deleteObjects(request);
            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
