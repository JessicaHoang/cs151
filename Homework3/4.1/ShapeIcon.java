import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JLabel;

public class ShapeIcon implements Icon{
	
	private int width;
	private int height;
	private CarIcon car;
	
	public ShapeIcon(CarIcon car, int width, int height) {
		this.car = car;
		this.width = width;
		this.height = height;
	}
	
	public int getIconWidth() {
		return width;
	}
	public int getIconHeight() {
		return height;
	}
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		car.draw(g2);
	}

}
