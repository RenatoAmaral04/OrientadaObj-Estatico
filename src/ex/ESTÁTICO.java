package ex;

import java.util.Scanner;

public class ESTÁTICO {

	public static void main(String[] args) {
		
Scanner ff = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		Calculator calc = new Calculator();
		
		// no outro código eu tirei o STATIC, por isso tenho que instanciar esse objeto
		
		double radius = ff.nextDouble();
		double c = calc.circumference(radius);
		// siginifica que está referenciado ao radius
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		ff.close();
	}

	}


