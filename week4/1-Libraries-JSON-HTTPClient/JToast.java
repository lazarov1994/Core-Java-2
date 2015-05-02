import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;


public class JToast {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println();
		Toaster toasterManager = new Toaster();
		toasterManager.setDisplayTime(2000);
		toasterManager.setToasterWidth(440);
		toasterManager.setToasterHeight(400);
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("C:\\Users\\Lazarov94\\Desktop\\б.jpg"));
		} catch (IOException e) {
		}
		toasterManager.setBackgroundImage(img);
		
		toasterManager.showToaster( "Take a break son" );
		
	}

}
