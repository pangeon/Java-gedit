import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CanvasColor extends JApplet implements MouseListener {
	private int tabX[], tabY[];
	private int count;
	private Color colors[];
	private Random rand;
	
	public void init() {
		count = 0;
		tabX = new int[100];
		tabY = new int[100];
		colors = new Color[100];
		rand = new Random();
		addMouseListener(this);
	};
	public void paint(Graphics app) {
		for(int i = 0; i < count; i++) {
			app.setColor(colors[i]);
			app.fillOval(tabX[i] - 10, tabY[i] - 10, 20, 20);
		}	
	};
	public void mousePressed(MouseEvent evt) {
		/* kostrukcja alternatywna
		
			int x = evt.getX();
			int y = evt.getY();
		*/
		if (count < tabX.length) {
			tabX[count] = evt.getX(); // x
			tabY[count] = evt.getY(); // y
			colors[count] = new Color(rand.nextInt());
			count++;
		}
		repaint();
	};

	public void mouseExited(MouseEvent evt) {};
	public void mouseEntered(MouseEvent evt) {};
	public void mouseReleased(MouseEvent evt) {};
	public void mouseClicked(MouseEvent evt) {};
}	
