package Chapter5Projects;

import java.util.Scanner;

public class Number1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int userYear;

		System.out.print("Please enter a year: ");
		userYear = scan.nextInt();

		System.out.println("Your input year: " + userYear);

		if (userYear % 4 == 0 && userYear % 100 == 0)
		{
			System.out.println("Your year is not a leap year");
		}

		else if (userYear % 4 == 0 && userYear % 100 != 0)
		{
			System.out.println("Your year is a leap year");
		}

		else
		{
			System.out.println("Your input is not a leap year");
		}
	}
}
