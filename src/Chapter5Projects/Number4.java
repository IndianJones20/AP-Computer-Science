package Chapter5Projects;

import java.util.Random;
import java.util.Scanner;

public class Number4
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int score = 1, guess;
		String oneMore = "y";


		while (oneMore.equalsIgnoreCase("y"))
		{
			System.out.println("I'm thinking of a number between 1 and 100. My number is ... ");
			int answer = r.nextInt(100) + 1;
			System.out.println(answer);

			guess = scan.nextInt();

			if (guess == answer)
			{
				System.out.println("You guessed correctly! Score: " + score + " tries");
				score = 0;
			}

			while (guess != answer)
			{
				if (guess > answer)
				{
					System.out.println("Too High");
				}

				else
				{
					System.out.println("Too Low");
				}

				System.out.println("Wrong! Try Again (type \"-1\" to quit)");

				guess = scan.nextInt();

				if (guess == -1)
				{
					System.out.println("Sorry to see you leave so soon, Score: " + score);
				}

				score++;
			}
			System.out.println();
			System.out.println("Would you like to play again (y/n)?");
			oneMore = scan.next();
		}

	}
}
