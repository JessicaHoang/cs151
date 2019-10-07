import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.JComponent;

public class CarIcon implements UpdateSize{
	
	private int width;
	private int x;
	private int y;
	
	public CarIcon(int aWidth) {
		this.x = x;
		this.y = y;
		width = aWidth;
	}
	
	public void draw(Graphics2D g2) {
		
		Rectangle2D.Double body = new Rectangle2D.Double(x,y+width/6, width-1, width/6);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x+width/6, y+width/3, width/6, width/6);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,width / 6, width / 6);
		
		/*Botton of front windshield*/
		Point2D.Double r1 = new Point2D.Double(x + width / 6, y + width / 6);
		
		/*The front of the roof*/
		Point2D.Double r2 = new Point2D.Double(x + width / 3, y);
		
		/*The rear of the roof*/
		Point2D.Double r3 = new Point2D.Double(x + width * 2 / 3, y);
		
		/*Bottom of the rear windshield*/
		Point2D.Double r4 = new Point2D.Double(x + width * 5 / 6, y + width / 6);
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);

	}
	
	public void zoomIn() {
		this.width++;
	}
	public void zoomOut() {
		this.width--;
	}

	public void UpdateSize(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
		
	}
	
	
	
}
