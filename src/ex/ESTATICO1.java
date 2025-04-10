package ex;
import java.util.Scanner;

public class ESTATICO1 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = ff.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		ff.close();
	}

	public static double circumference(double radius) {
	 return 2.0 * PI* radius;
	 }

	public static double volume(double radius) {
	 return 4.0 * PI* radius* radius* radius/ 3.0;
	 }
	 
//não pode chamar métodos não estáticos quando tem o static no caso o static void
	// o double c e v estão referenciados ao raidus
	
}
