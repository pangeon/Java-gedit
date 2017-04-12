import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CanvasColorDynamic extends JApplet implements MouseListener {
	private int tabX[], tabY[];
	private int count;
	private Color colors[];
	private Random rand;
	
	public void init() {
		count = 0;
		tabX = new int[2];
		tabY = new int[2];
		colors = new Color[2];
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
		tabX[count] = evt.getX(); // x
		tabY[count] = evt.getY(); // y
		colors[count++] = new Color(rand.nextInt()); //generuje kolor z dowolnego argumentu typu int
		System.out.println("rand = " + rand.nextInt());

		if (count >= tabX.length) {
			int tempTabX[],tempTabY[];
			Color tempTabColors[];
		
			tempTabX = new int[tabX.length * 2];
			tempTabY = new int[tabY.length * 2];
			tempTabColors = new Color[colors.length * 2];
			
			for(int i = 0; i < tabX.length; i++) {			
				tempTabX[i] = tabX[i];
				tempTabY[i] = tabY[i];
				tempTabColors[i] = colors[i];
			}
			tabX = tempTabX;
			tabY = tempTabY; 
			colors = tempTabColors;
			
			System.out.println("count = " + count);
			System.out.println("tabX = " + tabX.length);
			System.out.println("tabY = " + tabY.length);
			System.out.println("colors = " + colors.length);
		}
		
		repaint();
	};
	public void mouseExited(MouseEvent evt) {};
	public void mouseEntered(MouseEvent evt) {};
	public void mouseReleased(MouseEvent evt) {};
	public void mouseClicked(MouseEvent evt) {};
}














	
