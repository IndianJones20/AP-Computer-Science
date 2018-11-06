package Chapter5Lab;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a non-negative integer: ");
		int userValue = scan.nextInt();
		int counter = userValue;
		int sysoutNum = userValue;

		System.out.println();
		while (userValue < 0)
		{
			System.out.println("Please enter an integer greater than zero please");
			userValue = scan.nextInt();
		}

		counter = userValue;
		sysoutNum = userValue;

		while (counter > 1)
		{
			counter--;
			userValue = userValue * counter;
		}

		System.out.println("The factorial of " + sysoutNum + " is " + userValue);


	}
}
