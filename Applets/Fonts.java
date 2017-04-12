import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Font;

public class Fonts extends JApplet {
	public void paint(Graphics app_1) {
		Font text_1 = new Font("Monospaced", Font.BOLD, 36);
		app_1.setFont(text_1);
		app_1.drawString("Kamil Cecherz wielki programista", 30, 100);
	}
}
