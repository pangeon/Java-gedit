import javax.swing.JApplet;
import java.awt.*;
import java.awt.image.*;

public class ImageApplet extends JApplet {
	Image img;
	public void init() {
		img = getImage(getDocumentBase(), "java1.jpg");
	}
	public void paint(Graphics app1) {
		app1.drawImage(img, 0, 0, this);
	}
	public boolean imageUpdate(Image img, int flags, int x, int y, int width, int height) {
		if ((flags & ImageObserver.ALLBITS) == 0) {
			showStatus("Czekaj...");
			return true;
		} else {
			showStatus("Operacja zakończona");
			repaint();
			return false;
		}
	}
}
