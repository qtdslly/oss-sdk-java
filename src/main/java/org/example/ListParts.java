package org.example;

import com.xiaobing.oss.model.ListPartsRequest;
import com.xiaobing.oss.model.ListPartsResponse;
import com.xiaobing.oss.model.Part;

public class ListParts {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.exe";
            String uploadId = "2XhmjbvaNw4EEQcBXvBomwxCoEq2o19cq66y42aBHUjYm96Qb1t9EGdNjevgDpKNH9EmRiRf9q7wa3K8zudB9J1cqmJC2TxvBFafpVRj13YBFQHn4PAK2qBKS8a8WUB8qJYS7L5ajRzRK7gJZo7GwiuY3guCfRk1ry4s6apz7gn4govs7iFWfvEtKcMg";
            ListPartsRequest request = ListPartsRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .uploadId(uploadId)
                    .build();
            ListPartsResponse listPartsResponse = Client.createClient().listParts(request);
            for(Part part : listPartsResponse.parts()) {
                System.out.println("partNumber:" + part.partNumber() + ", " + "etag:" + part.eTag());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
