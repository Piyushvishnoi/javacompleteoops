package newpackage;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class totakescreenshots {
public static final long serialversionuid=1L;
	public static void main(String[] args) {
		try {
			Thread.sleep(120);
			Robot r=new Robot();
			String path="/Users/piyushvishnoi/Desktop/screenshot/";  //to give path where screen shot must be stored
			Rectangle capture=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());  //in which shape screenshot must be storted
			BufferedImage Image=r.createScreenCapture(capture);
			ImageIO.write(Image,"jpg",new File(path));
			System.out.println("Screenshot saved");
		}
		catch(AWTException | IOException | InterruptedException ex)
		{
			System.out.println(ex);
		}

	}

}
