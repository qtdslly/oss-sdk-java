package org.example;

import com.xiaobing.oss.model.Bucket;
import com.xiaobing.oss.model.ListBucketsRequest;
import com.xiaobing.oss.model.ListBucketsResponse;

public class ListBuckets {

    public static void main(String[] args) {
        try {
            ListBucketsRequest request = ListBucketsRequest.builder()
                    .build();
            ListBucketsResponse listBucketsResponse = Client.createClient().listBuckets(request);
            for(Bucket b : listBucketsResponse.buckets()) {
                System.out.println(b.name());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
