package org.example;

import software.amazon.awssdk.core.sync.RequestBody;
import com.xiaobing.oss.model.PutObjectRequest;

import java.io.File;

public class PutObject {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "c/a.txt";
            String filePath = "D:\\a.txt";
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            Client.createClient().putObject(request, RequestBody.fromFile(new File(filePath)));
            System.out.println("上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
