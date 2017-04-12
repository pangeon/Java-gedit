import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.event.*;

public class ActionApplet extends JApplet implements MouseListener {
	private int x, y;
	public void init() {
		addMouseListener(this);
	}
	public void paint(Graphics app1) {
		app1.clearRect(0, 0, getSize().width, getSize().height);
		app1.drawString("Współrzędne kliknięcia: x = " + x + " y = " + y, 10, 10);
		if (y > 100) {
			app1.drawString("y poniżej 100", 10, 50);
		}
	}
	public void mouseClicked(MouseEvent evt) {
		x = evt.getX();
		y = evt.getY();
		repaint(); 
	};
	public void mousePressed(MouseEvent evt) {};
	public void mouseExited(MouseEvent evt) {};
	public void mouseEntered(MouseEvent evt) {};
	public void mouseReleased(MouseEvent evt) {};
	
}
