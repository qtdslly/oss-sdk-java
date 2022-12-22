package org.example;

import com.xiaobing.oss.S3Client;
import com.xiaobing.oss.model.*;
import software.amazon.awssdk.core.sync.RequestBody;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class MultipartUpload {
    public static void main(String[] args) throws IOException {
        String bucketName = "buc1";
        String key = "a.exe";
        String filePath = "D:\\a.exe";

        S3Client s3 = Client.createClient();
        CreateMultipartUploadRequest createMultipartUploadRequest = CreateMultipartUploadRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();

        CreateMultipartUploadResponse response = s3.createMultipartUpload(createMultipartUploadRequest);
        String uploadId = response.uploadId();
        System.out.println(uploadId);

        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel fileChannel = fileInputStream.getChannel();
        long contentLength = file.length();
        long partSize = 5 * 1024 * 1024;
        long filePosition = 0;
        List<CompletedPart> completedParts = new ArrayList<>();
        for (int i = 1; filePosition < contentLength; i++) {
            partSize = Math.min(partSize, (contentLength - filePosition));
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) partSize);
            fileChannel.read(byteBuffer, filePosition);
            UploadPartRequest uploadPartRequest = UploadPartRequest.builder().bucket(bucketName).key(key)
                    .uploadId(uploadId)
                    .partNumber(i).build();
            String etag = s3.uploadPart(uploadPartRequest, RequestBody.fromByteBuffer(byteBuffer)).eTag();
            completedParts.add(CompletedPart.builder().partNumber(i).eTag(etag).build());
            byteBuffer.clear();
            filePosition += partSize;
        }
        fileChannel.close();
        CompletedMultipartUpload completedMultipartUpload = CompletedMultipartUpload.builder()
                .parts(completedParts)
                .build();
        CompleteMultipartUploadRequest completeMultipartUploadRequest =
                CompleteMultipartUploadRequest.builder()
                        .bucket(bucketName)
                        .key(key)
                        .uploadId(uploadId)
                        .multipartUpload(completedMultipartUpload)
                        .build();
        s3.completeMultipartUpload(completeMultipartUploadRequest);
    }
}
