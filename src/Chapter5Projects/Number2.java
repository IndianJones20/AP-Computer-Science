package Chapter5Projects;

import java.util.Scanner;

public class Number2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int exitKey;

		System.out.println("Enter a year value (enter 0 to end program): ");
		exitKey = scan.nextInt();

		while (exitKey != 0)
		{
			if (exitKey % 4 == 0 && exitKey % 100 == 0)
			{
				System.out.println("Your year is not a leap year");
			}

			else if (exitKey % 4 == 0 && exitKey % 100 != 0)
			{
				System.out.println("Your year is a leap year");
			}

			else if (exitKey < 1582)
			{
				System.out.println("Invalid Input");
			}

			else
			{
				System.out.println("Your year is not a leap year");
			}

			System.out.println("Enter a year value (enter 0 to end program): ");
			exitKey = scan.nextInt();

		}
	}

}
