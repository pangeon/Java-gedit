import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Shapes extends JApplet {
		public void paint(Graphics app_1) {
		for (int i=0; i<150; i += 5) {
			app_1.drawLine(5 + i, 5 + i, 40 + i, 5 + i);
			app_1.drawLine(40 + i, 5 + i, 40 + i, 40 + i);
			app_1.drawLine(40 + i, 40 + i, 5 + i, 40 + i);
			app_1.drawLine(5 + i, 40 + i, 5 + i, 5 + i);
			}
		int tabX[] = {200, 240, 320, 360, 320, 240};
		int tabY[] = {100, 20, 20, 100, 180, 180};
		app_1.drawOval(150, 20, 60, 60);
		app_1.drawRect(150, 20, 60, 60);
		app_1.fillPolygon(tabX, tabY, 6);
		Color color;
		for (int i=0; i<255; i += 1) {
			color = new Color(123, 56, i);
			app_1.setColor(color);
			app_1.drawLine(400 + i, 0, 400 + i, 200);
		}
	}
}
