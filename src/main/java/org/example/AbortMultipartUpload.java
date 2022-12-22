package org.example;

import com.xiaobing.oss.model.AbortMultipartUploadRequest;

public class AbortMultipartUpload {
    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.exe";
            String uploadId = "2XhmjbvaNw4EEQcBXvBomwxCoEq2o19cq66y42aBHUjYm96Qb1t9EGdNjevgDpKNH9FanbW31yNXcM4QfxHUMZFfcr81prAMnUjNc4zRPXpsSG6aj7SQBpcFFRZhwcebcBwNcDL71Z5bz2Y3D3gigExJ2w9a7bGsay8Y7tvUEWtSdvJrF5b9b3U6yEUp";
            AbortMultipartUploadRequest request = AbortMultipartUploadRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .uploadId(uploadId)
                    .build();
            Client.createClient().abortMultipartUpload(request);
            System.out.println("中止成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
