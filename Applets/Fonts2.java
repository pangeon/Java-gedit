import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Font;

public class Fonts2 extends JApplet {
	Font text_1, text_2, text_3, text_4, text_5;
	public void init() {
		text_1 = new Font("SansSerif", Font.BOLD, 36);
		text_2 = new Font("Monospaced", Font.ITALIC, 36);
		text_3 = new Font("Input", Font.PLAIN, 36);
		text_4 = new Font("DialogInput", Font.BOLD, 36);
		text_5 = new Font("Serif", Font.ITALIC, 36);
	}
	public void paint(Graphics app_1) {
		app_1.setFont(text_1);
		app_1.drawString("Kamil Cecherz", 50, 30);
		app_1.setFont(text_2);
		app_1.drawString("Kamil Cecherz", 50, 70);
		app_1.setFont(text_3);
		app_1.drawString("Kamil Cecherz", 50, 110);
		app_1.setFont(text_4);
		app_1.drawString("Kamil Cecherz", 50, 150);
		app_1.setFont(text_5);
		app_1.drawString("Kamil Cecherz", 50, 190);
	}
}
