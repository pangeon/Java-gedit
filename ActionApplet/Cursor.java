import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;

public class Cursor extends JApplet implements MouseMotionListener {
	String str;
	Font font;
	public void init() {
		font = new Font("Monotype", Font.BOLD, 36);
		str = "";
		addMouseMotionListener(this);
	}
	public void paint(Graphics app1) {
		app1.setFont(font);
		app1.clearRect(0, 0, getSize().width, getSize().height);
		app1.drawString(str, 90, 100);
	}
	public void mouseDragged(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		str = "Dragged: x = " + x + " y = " + y;
		repaint();
	}
	public void mouseMoved(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		str = "Moved: x = " + x + " y = " + y;
		repaint();
	}

	
}
