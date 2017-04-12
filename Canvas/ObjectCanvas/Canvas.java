import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Canvas extends JApplet implements MouseListener {
	private PainterDatabase database;
	private Random rand;
	
	public void init() {
		database = new PainterDatabase();
		rand = new Random();
		addMouseListener(this);
	};
	public void paint(Graphics app) {
		database.drawAll(app);
	};
	public void mousePressed(MouseEvent evt) {	
		Color color = new Color(rand.nextInt());
		database.addElement (new Painter(evt.getX(), evt.getY(), color));
		repaint();
	};
	public void mouseExited(MouseEvent evt) {};
	public void mouseEntered(MouseEvent evt) {};
	public void mouseReleased(MouseEvent evt) {};
	public void mouseClicked(MouseEvent evt) {};
}














	
