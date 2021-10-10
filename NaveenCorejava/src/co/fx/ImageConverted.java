package co.fx;
/**
  @author md
  @apiNote Convert the images defferent formate*/
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageConverted {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://images.unsplash.com/photo-1587019158091-1a103c5dd17f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZmxpZ2h0fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80");
			try {
				BufferedImage read = ImageIO.read(url);
				ImageIO.write(read,"jpg",new File("./images/sky.jpg"));
				ImageIO.write(read, "gif",new File("./images/sky.gif"));
				ImageIO.write(read,"png",new File("./images/sky.png"));
				ImageIO.write(read,"bmp",new File("./images/sky.bmp"));
				System.out.println("done---");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
