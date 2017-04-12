import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.*;

public class CanvasPerfect extends JApplet implements MouseListener {
	private int tabX[], tabY[];
	private int count;
	
        @Override
	public void init() {
		count = 0;
		tabX = new int[100];
		tabY = new int[100];
		addMouseListener(this);
	};
        @Override
	public void paint(Graphics app) {
		for(int i = 0; i < count; i++) {
			app.fillOval(tabX[i] - 10, tabY[i] - 10, 20, 20);
		}	
	};
        @Override
	public void mousePressed(MouseEvent evt) {
		if (count < tabX.length) {
			tabX[count] = evt.getX();
			tabY[count] = evt.getY();
			count++;
		}
		repaint();
	};

        @Override
	public void mouseExited(MouseEvent evt) {};
        @Override
	public void mouseEntered(MouseEvent evt) {};
        @Override
	public void mouseReleased(MouseEvent evt) {};
        @Override
	public void mouseClicked(MouseEvent evt) {};
}	
