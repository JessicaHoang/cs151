import java.awt.Rectangle;
import java.util.Arrays;

public class lab3 {
	
	private static Object[] list = new Object[7];
	
	public static String dumpArray(Object[] list) {
		return Arrays.toString(list);
	}
	
	public static void main(String[] args) {
		list[0] = "Test";
		list[1] = 8;
		list[2] = new Rectangle(50,80);
		list[3] = "C";
		list[4] = "S";
		list[5] = 151;
		list[6] = true;

		System.out.println("Printed values of array: ");
		System.out.println(dumpArray(list));

	}
}

