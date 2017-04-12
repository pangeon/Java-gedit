import java.util.Vector;
import java.awt.Graphics;


class PainterDatabase extends Vector <Painter> {

	public void drawAll(Graphics figure) {
		for (int i = 0; i < this.size(); i++) {
			this.elementAt(i).drawRect(figure);
		}
	};
}
