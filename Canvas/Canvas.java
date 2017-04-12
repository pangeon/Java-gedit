import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;

public class Canvas extends JApplet implements MouseListener {

	public void init() {
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent evt) {
	};
	public void mousePressed(MouseEvent evt) {
		getGraphics().drawLine(evt.getX() - 20, evt.getY(), evt.getX(), evt.getY());
	};
	public void mouseExited(MouseEvent evt) {
	};
	public void mouseEntered(MouseEvent evt) {
	};
	public void mouseReleased(MouseEvent evt) {
	};
}	

