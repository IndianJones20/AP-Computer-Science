package Chapter2Lab;

import java.util.Scanner;

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; // paint covers 350 sq ft/gal

		// declare integers length, width, height, double totalSqFt and double
		// paintNeeded;
		int length;
		int width;
		int height;
		int doors;
		int windows;
		double totalSqFt;
		double paintNeeded;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a value for the length of the room: ");
		length = scan.nextInt();

		System.out.print("Enter a value for the width of the room: ");
		width = scan.nextInt();

		System.out.print("Enter a value for the height of the room: ");
		height = scan.nextInt();

		System.out.print("Enter the number of doors in the room: ");
		doors = scan.nextInt();

		System.out.print("Enter the number of windows in the room: ");
		windows = scan.nextInt();

		// Compute the total square feet to be painted--think about the dimensions of
		// each wall
		totalSqFt = (2 * (length * width)) + (2 * (length * height)) + (2 * (width * height)) - (20 * doors)
				- (15 * windows);

		// Compute the amount of paint needed

		System.out.println("The amount of paint needed is: " + totalSqFt + " square feet of paint");
		// Print the length, width, and height of the room and the number of gallons of
		// paint needed.
	}
}
//Made by Tanuj Gaikwad