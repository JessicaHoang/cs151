import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class ButtonTester{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		UpdateSize car = new CarIcon(10,10,125);
		ShapeIcon icon = new ShapeIcon(car, 250, 100);
		final JLabel label = new JLabel(icon);
		JButton zoomIn = new JButton("Zoom in");
		
		zoomIn.addActionListener(event->
				{
					car.zoomIn();
					label.repaint();

				});
		JButton zoomOut = new JButton("Zoom out");
		zoomOut.addActionListener(event->
		{
			car.zoomOut();
			label.repaint();

		});
		
		//allows buttons to be next to each other.
		frame.setLayout(new FlowLayout()); 
		
		//adds buttons to frame
		frame.add(zoomIn);
		frame.add(zoomOut);
		frame.add(label);
		
		//allows program to close when user closes window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window is smallest size necessary
		frame.pack();
		frame.setVisible(true);
	}

}
