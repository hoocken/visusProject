import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamException;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Webcam webcam = null;
        System.out.println();
        try {
            webcam = Webcam.getDefault();
        } catch (WebcamException e) {
            throw new RuntimeException(e);
        }
        webcam.open();
        ImageIO.write(webcam.getImage(), "JPG", new File("hello-world.jpg"));
    }
}