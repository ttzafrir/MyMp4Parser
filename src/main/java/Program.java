import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Program {
    public static void main(String[] args) throws IOException, ImageProcessingException {
        InputStream file = new FileInputStream("C:\\Users\\ttzafrir\\Desktop\\benign samples\\Pixbay_samples\\537a45187a5dd04fd5978454b68c32bc1b23a069cfac6b9748f79283765c821d");
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
