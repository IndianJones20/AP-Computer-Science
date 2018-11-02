package Chapter3Projects;

import java.util.Scanner;

public class Number5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int xCoord1;
		int yCoord1;
		int xCoord2;
		int yCoord2;
		double CoordDistance;

		System.out.println("Enter a coordinate pair: ");
		System.out.print("X: ");
		xCoord1 = scan.nextInt();
		System.out.print("Y: ");
		yCoord1 = scan.nextInt();

		System.out.println("Enter your second coordinate pair: ");
		System.out.print("X: ");
		xCoord2 = scan.nextInt();
		System.out.print("Y: ");
		yCoord2 = scan.nextInt();

		CoordDistance = (double) (Math.sqrt((Math.pow(xCoord2 - xCoord1, 2) + ((Math.pow(yCoord2 - yCoord1, 2))))));
		System.out.println("Distance between both coordinate points: " + CoordDistance);

	}

}
//Made by Tanuj Gaikwad