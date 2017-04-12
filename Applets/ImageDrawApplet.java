import javax.swing.JApplet;
import java.awt.*;
import java.awt.image.*;

public class ImageDrawApplet extends JApplet {
	Image img;
	public void init() {
		prepareImage();
	}
	public void paint(Graphics app1) {
		app1.drawImage(img, 0, 0, this);
	}
	public void prepareImage() {
		int width = 255, height = 255;
		int pix[] = new int[255 * 255];
		int index = 0;
		for(int i = 0; i < 255; i++) {
			for(int j = 0; j < 255; j++) {
				pix[index++] = (255 << 24) | j << 16 | i; 
			}
		}
		img = createImage(
			new MemoryImageSource(width, height, pix, 0, width)
		);
	}
}
