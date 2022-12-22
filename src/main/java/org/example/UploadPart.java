package org.example;

import com.xiaobing.oss.model.UploadPartResponse;
import software.amazon.awssdk.core.sync.RequestBody;
import com.xiaobing.oss.model.UploadPartRequest;

import java.io.File;

public class UploadPart {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.exe";
            String partFilePath = "D:\\xaa";
            String uploadId = "2XhmjbvaNw4EEQcBXvBomwxCoEq2o19cq66y42aBHUjYm96Qb1t9EGdNjevgDpKNH9EmRiRf9q7wa3K8zudB9J1cqmJC2TxvBFafpVRj13YBFQHn4PAK2qBKS8a8WUB8qJYS7L5ajRzRK7gJZo7GwiuY3guCfRk1ry4s6apz7gn4govs7iFWfvEtKcMg";
            UploadPartRequest request = UploadPartRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .partNumber(2)
                    .uploadId(uploadId)
                    .build();
            UploadPartResponse uploadPartResponse = Client.createClient().uploadPart(request, RequestBody.fromFile(new File(partFilePath)));
            System.out.println("etag:" + uploadPartResponse.eTag());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
