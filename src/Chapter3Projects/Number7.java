package Chapter3Projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number7
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");

		double side1;
		double side2;
		double side3;

		System.out.println("Enter three side lengths of a triangle: ");
		System.out.print("Side 1: ");
		side1 = scan.nextDouble();
		System.out.print("Side 2: ");
		side2 = scan.nextDouble();
		System.out.print("Side 3: ");
		side3 = scan.nextDouble();

		double halfPeri = ((side1 + side2 + side3) / 2);
		double Area = Math.sqrt(halfPeri * (halfPeri - side1) * (halfPeri - side2) * (halfPeri - side3));

		System.out.println("Area of your given triangle is: " + fmt.format(Area));

	}

}
//Made by Tanuj Gaikwad