package Chapter3Projects;

import java.util.Scanner;

public class Number4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		double userValue;
		int lessNum;
		int GreaterNum;

		System.out.println("What is your double value: ");
		userValue = scan.nextDouble();

		lessNum = (int) Math.floor(userValue);
		System.out.println("The closest whole number less than your value is: " + lessNum);

		GreaterNum = (int) Math.ceil(userValue);
		System.out.println("The closest whole number greater than your value is: " + GreaterNum);

	}

}
//Made by Tanuj Gaikwad