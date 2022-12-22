package org.example;

import software.amazon.awssdk.core.ResponseBytes;
import com.xiaobing.oss.model.GetObjectRequest;
import com.xiaobing.oss.model.GetObjectResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class GetObject {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "c/a.txt";
            String filePath = "D:\\b.txt";
            GetObjectRequest request = GetObjectRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            ResponseBytes<GetObjectResponse> objectBytes = Client.createClient().getObjectAsBytes(request);
            byte[] data = objectBytes.asByteArray();
            File myFile = new File(filePath);
            OutputStream os = new FileOutputStream(myFile);
            os.write(data);
            System.out.println("下载成功");
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
