package Chapter2Lab;

import java.util.Scanner;

//************************************************************
//Circle.java
//
//Print the area of a circle with two different radii
//************************************************************
public class Circle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		final double PI = 3.14159;

		int radius;
		System.out.print("Please enter a radius value: ");
		radius = scan.nextInt();

		double area1 = PI * radius * radius;
		int circum1 = (int) (2 * radius * PI);

		System.out.println("\nThe area of a circle with radius " + radius + " is " + area1);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circum1);

		radius = radius * 2;
		double area2 = PI * radius * radius;
		int circum2 = (int) (2 * PI * radius);

		System.out.println("\n\nThe area of a circle with radius " + radius + " is " + area2);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circum2);


		System.out.println("\n\nWhen the radius doubles, the area gets multiplied by " + (area2 / area1));
		System.out.println("When the radius doubles, the circumference gets multiplied by " + (circum2 / circum1));
	}
}
//Made by Tanuj Gaikwad