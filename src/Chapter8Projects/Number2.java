package Chapter8Projects;

import java.util.Scanner;

public class Number2
{
	public static void main(String[] args)
	{
		int userInput, count;
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		int[] yeet = new int[51];

		for (int index = 0; index < 51; index++)
		{
			yeet[index] = 0;
		}

		while (keepGoing.equalsIgnoreCase("y"))
		{
			System.out.println("Enter an integer betwee -25 and 25 inclusive: ");
			System.out.println("Enter an integer outside the given range to exit program");
			userInput = scan.nextInt();

			if (userInput >= -25 && userInput <= 25)
			{
				count = yeet[userInput + 25];
				count++;
				yeet[userInput + 25] = count;
			}

			else
				keepGoing = "n";
		}

		for (int index = -25; index < 26; index++)
		{
			System.out.println("Number of " + index + "s: " + yeet[index + 25]);
		}

	}
}
