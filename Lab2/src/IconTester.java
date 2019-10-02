import javax.swing.*;

public class IconTester
{
   public static void main(String[] args)
   {
	  JOptionPane.showMessageDialog(null, "Hello, World!");
      JOptionPane.showMessageDialog(
            null, 
            "Hello, Mars!",
            "Message",
            JOptionPane.INFORMATION_MESSAGE);
      CircleIcon c = new CircleIcon(50);
      c.setVisible(true);
      System.exit(0);
   }
}