package org.example;

import com.xiaobing.oss.model.PutObjectTaggingRequest;
import com.xiaobing.oss.model.Tag;
import com.xiaobing.oss.model.Tagging;

import java.util.ArrayList;
import java.util.List;

public class PutObjectTagging {

    public static void main(String[] args) {
        try {
            String bucket = "buc1";
            String key = "a.txt";
            Tag tag3 = Tag.builder()
                    .key("Tag 3")
                    .value("This is tag 3")
                    .build();

            Tag tag4 = Tag.builder()
                    .key("Tag 4")
                    .value("This is tag 4")
                    .build();
            List<Tag> tags = new ArrayList<>();
            tags.add(tag3);
            tags.add(tag4);

            Tagging tagging = Tagging.builder()
                    .tagSet(tags)
                    .build();
            PutObjectTaggingRequest request = PutObjectTaggingRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .tagging(tagging)
                    .build();
            Client.createClient().putObjectTagging(request);
            System.out.println("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
