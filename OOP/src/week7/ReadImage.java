package week7;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class ReadImage {
	public static void main(String args[]) throws IOException {
        BufferedImage img = null;
        File f = null;
    try {
        f = new File("D:\\picture.jpg");
        img = ImageIO.read(f);
    } catch (IOException e) {
        System.out.println(e);
    }
    ImageIO.write(img, "png", new File("D://image.jpg"));
    }}
