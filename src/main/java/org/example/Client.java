package org.example;

import com.xiaobing.oss.S3Client;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.transfer.s3.S3TransferManager;

import java.net.URI;
import java.net.URISyntaxException;

public class Client {
    static String accessKeyId = "jvv4i43jx5jjszcjwxn4xvlf72kq";
    static String secretAccessKey = "j27ksdw63rbqmalfge23ss4aqg5tbfmkz7qeanrbguvyysp7xokh2";
    static String endpoint = "https://gateway.99265.net";

    static Region region = Region.US_EAST_1;

    public static AwsCredentialsProvider createCredentialsProvider() {
        return StaticCredentialsProvider.create(AwsBasicCredentials.create(
                accessKeyId,
                secretAccessKey));
    }

    public static S3Client createClient() {
        S3Client s3Client;
        try {
            s3Client = S3Client.builder()
                    .region(region)
                    .credentialsProvider(createCredentialsProvider())
                    .endpointOverride(new URI(endpoint))
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            s3Client = S3Client.builder()
                    .credentialsProvider(createCredentialsProvider())
                    .build();
        }
        return s3Client;
    }

    public static S3TransferManager createTransferManager() {
        return S3TransferManager.builder()
                .s3ClientConfiguration(cfg -> {
                    try {
                        cfg.region(region).endpointOverride(new URI(endpoint))
                                .credentialsProvider(Client.createCredentialsProvider())
                                .targetThroughputInGbps(20.0)
                                .minimumPartSizeInBytes(10 * 1024L);
                    } catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }
                })
                .build();
    }

}
