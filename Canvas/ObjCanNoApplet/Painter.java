import java.awt.Color;
import java.awt.Graphics;


class Painter {
	private int x;
	private int y;
	private Color color;
	
	public Painter(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public void drawOval(Graphics oval) {
		oval.setColor(color);
		oval.fillOval(x - 10, y - 10, 20, 20);	
	};
	public void drawRect(Graphics rect) {
		rect.setColor(color);
		rect.fillRect(x - 10, y - 10, 20, 20);	
	};
}
