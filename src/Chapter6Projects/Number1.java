package Chapter6Projects;

import java.util.Scanner;

public class Number1
{
	public static void main(String[] args)
	{
		int counter = 2, userValue;
		final int userValueCONSTANT;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		userValue = scan.nextInt();

		while (userValue < 2)
		{
			System.out.print("Enter an integer greater than 2: ");
			userValue = scan.nextInt();
		}

		userValueCONSTANT = userValue;
		while (counter < userValueCONSTANT)
		{
			userValue += counter;
			counter = counter + 2;
		}

		System.out.print("User Value: " + userValue);
	}

}
