package org.example;

import com.xiaobing.oss.model.HeadObjectRequest;
import com.xiaobing.oss.model.HeadObjectResponse;

public class HeadObject {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.txt";
            HeadObjectRequest request = HeadObjectRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            HeadObjectResponse headObjectResponse = Client.createClient().headObject(request);
            System.out.println("etag:" + headObjectResponse.eTag());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
