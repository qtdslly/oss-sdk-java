# 适用于 Java 的云存储开发工具包

`oss-sdk-java` 是适用于 Java 编程语言的开发工具包。

SDK 需要 `java 1.8` 的最低版本。

入门
---------------
假设您安装了受支持的 Java 版本
## 使用 SDK

The recommended way to use the AWS SDK for Java in your project is to consume it from Maven Central.

#### 导入 BOM ####

To automatically manage module versions (currently all modules have the same version, but this may not always be the case) we recommend you use the [Bill of Materials][bom] import as follows:

```xml
<dependency>
    <groupId>software.xiaobing.sdk</groupId>
    <artifactId>oss</artifactId>
    <version>2.18.3</version>
</dependency>
```

###### 代码示例

```
package org.example;

import com.xiaobing.oss.S3Client;
import com.xiaobing.oss.model.CreateBucketRequest;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;

import java.net.URI;
import java.net.URISyntaxException;

public class CreateBucket {

    public static void main(String[] args) {
        try {
            String bucket = "buc3";
            CreateBucketRequest request = CreateBucketRequest.builder()
                    .bucket(bucket)
                    .build();
            createClient().createBucket(request);
            System.out.println("创建成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static S3Client createClient() {
        String accessKeyId = "jwwjjchabuv6w6wbalwkgfiktmwa";
        String secretAccessKey = "j3vhklonydrvtqk6ylre2hgyxmcpt3c4r2kvuk65vs3ginv7ztyji";
        String endpoint = "https://gateway.99265.net";

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create(
                accessKeyId,
                secretAccessKey);
        Region region = Region.US_EAST_1;
        S3Client s3Client;
        try {
            s3Client = S3Client.builder()
                    .region(region)
                    .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                    .endpointOverride(new URI(endpoint))
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            s3Client = S3Client.builder()
                    .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                    .build();
        }
        return s3Client;
    }

}

```
