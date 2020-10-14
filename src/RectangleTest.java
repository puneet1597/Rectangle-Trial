import java.util.Scanner;

public class RectangleTest {
	
	public static void main(String args[]) {
		Rectangle area = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle = ");
		area.l = sc.nextDouble();
		System.out.println("Enter breadth of the rectangle = ");
		area.b = sc.nextDouble();
		double a = area.Area(area.l , area.b);
		System.out.println("Area of the rectangle = " + a  );
		
		sc.close();	
	
	}
}
