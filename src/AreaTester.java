import java.util.Scanner;
public class AreaTester {

	public static void main(String[] args) {
		Area rec = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
		rec.l = sc.nextDouble();
		System.out.println("Enter breadth of the rectangle");
		rec.b = sc.nextDouble();
		System.out.println("Area of rectangle is " + rec.area() );

	}

}
