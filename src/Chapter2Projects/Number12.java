package Chapter2Projects;

import java.util.Scanner;

public class Number12
{
	public static void main(String[] args)
	{
		int side;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a side length for a square: ");

		side = scan.nextInt();

		int area = side * side;
		int perimeter = 4 * side;

		System.out.println("Square area: " + area);
		System.out.println("Square Perimeter: " + perimeter);
	}

}
//Made by Tanuj Gaikwad