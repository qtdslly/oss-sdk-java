package org.example;

import com.xiaobing.oss.model.GetObjectTaggingRequest;
import com.xiaobing.oss.model.GetObjectTaggingResponse;
import com.xiaobing.oss.model.Tag;

import java.util.List;

public class GetObjectTagging {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.txt";
            GetObjectTaggingRequest request = GetObjectTaggingRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .build();
            GetObjectTaggingResponse getTaggingRes = Client.createClient().getObjectTagging(request);
            List<Tag> obTags = getTaggingRes.tagSet();
            for (Tag sinTag: obTags) {
                System.out.println("The tag key is: "+sinTag.key());
                System.out.println("The tag value is: "+sinTag.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
