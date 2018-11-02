package Chapter3Lab;

import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		double x1, x2, y1, y2;
		double distance;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a coordinate pair: ");
		System.out.print("X1: ");
		x1 = scan.nextDouble();
		System.out.print("Y1: ");
		y1 = scan.nextDouble();

		System.out.println("Please enter another coordinate pair: ");
		System.out.print("X2: ");
		x2 = scan.nextDouble();
		System.out.print("Y2: ");
		y2 = scan.nextDouble();

		distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		System.out.println("The distance between these two points is: " + distance);
	}

}
//Made by Tanuj Gaikwad