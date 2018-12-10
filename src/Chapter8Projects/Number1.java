package Chapter8Projects;

import java.util.Scanner;

public class Number1
{
	public static void main(String[] args)
	{
		int userInput, count;
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		int[] yeet = new int[51];

		for (int index = 0; index < 50; index++)
		{
			yeet[index] = 0;
		}

		while (keepGoing.equalsIgnoreCase("y"))
		{
			System.out.println("Enter an integer betwee 0 and 50 inclusive: ");
			System.out.println("Enter an integer outside the given range to exit program");
			userInput = scan.nextInt();

			if (userInput >= 0 && userInput <= 50)
			{
				count = yeet[userInput];
				count++;
				yeet[userInput] = count;
			}

			else
				keepGoing = "n";
		}

		for (int index = 0; index < 51; index++)
		{
			System.out.println("Number of " + index + "s: " + yeet[index]);
		}

	}
}
