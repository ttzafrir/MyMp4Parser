import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import lib.FeatureExtractorFixedFeaturesKnowledgeBasedMp4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Program {
    public static void main(String[] args) throws IOException, ImageProcessingException {
        InputStream file = new FileInputStream("C:\\Users\\ttzaf\\Desktop\\Best Samples\\152babd1fc9076a5f8beb7e9a853845445da7e435a9104d62d570acbf5facfcc");
        Metadata metadata = ImageMetadataReader.readMetadata(file);

        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                System.out.format("[%s] - %s = %s",
                        directory.getName(), tag.getTagName(), tag.getDescription());
                System.out.println();
            }
            if (directory.hasErrors()) {
                for (String error : directory.getErrors()) {
                    System.err.format("ERROR: %s", error);
                }
            }
        }
    }
}
