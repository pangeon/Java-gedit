import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Canvas extends JFrame implements MouseListener {
	private PainterDatabase database;
	private Random rand;
	
	public Canvas() {
		super("Pi-Painter 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		
		database = new PainterDatabase();
		rand = new Random();
				
		setSize(600, 400);
		setVisible(true);
	}
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














	
