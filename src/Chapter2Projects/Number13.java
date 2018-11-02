package Chapter2Projects;

import java.util.Scanner;

public class Number13
{
	public static void main(String[] args)
	{
		int numer;
		int denom;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a numerator value: ");

		numer = scan.nextInt();

		System.out.print("Please enter a denominator value: ");

		denom = scan.nextInt();

		float deci_equivalent = (float) numer / denom;

		System.out.println("Decimal equivalent of " + numer + "/" + denom + " is: " + deci_equivalent);
	}

}
//Made by Tanuj Gaikwad