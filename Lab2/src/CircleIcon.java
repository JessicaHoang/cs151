import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class CircleIcon extends JFrame{
	
	private int size;

	public CircleIcon(int aSize) {
		size = aSize;
	}
	
	public int getIconWidth() {
		return size;
	}
	
	public int getIconHeight() {
		return size;
	}
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
		g2.setColor(Color.RED);
		g2.fill(circle);
	}
	
}
