package org.example;

import com.xiaobing.oss.model.CompleteMultipartUploadRequest;
import com.xiaobing.oss.model.CompletedMultipartUpload;
import com.xiaobing.oss.model.CompletedPart;

public class CompleteMultipartUpload {
    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.exe";
            String uploadId = "2XhmjbvaNw4EEQcBXvBomwxCoEq2o19cq66y42aBHUjYm96Qb1t9EGdNjevgDpKNH9EmRiRf9q7wa3K8zudB9J1cqmJC2TxvBFafpVRj13YBFQHn4PAK2qBKS8a8WUB8qJYS7L5ajRzRK7gJZo7GwiuY3guCfRk1ry4s6apz7gn4govs7iFWfvEtKcMg";
            int partNumber1 = 1;
            String etag1 = "a84196d8618498781f7e6d464b928cb0";
            int partNumber2 = 2;
            String etag2 = "a84196d8618498781f7e6d464b928cb0";
            CompletedPart part1 = CompletedPart.builder().partNumber(partNumber1).eTag(etag1).build();
            CompletedPart part2 = CompletedPart.builder().partNumber(partNumber2).eTag(etag2).build();
            CompletedMultipartUpload completedMultipartUpload = CompletedMultipartUpload.builder()
                    .parts(part1, part2)
                    .build();
            CompleteMultipartUploadRequest request = CompleteMultipartUploadRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .uploadId(uploadId)
                    .multipartUpload(completedMultipartUpload)
                    .build();
            Client.createClient().completeMultipartUpload(request);
            System.out.println("完成上传");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
