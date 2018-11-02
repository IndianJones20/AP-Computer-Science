package Chapter5Projects;

import java.util.Scanner;

public class Number7Test
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Number7 person1 = new Number7();
		Number7 computer1 = new Number7();
		String exitKey = "y", humanSign = "";
		int personSign, personScore = 0, computerScore = 0;
	
		while (exitKey.equalsIgnoreCase("y"))
		{
			//------------------------------
			//	Legend:
			//	0 = Rock
			//	1 = Paper
			// 	2 = Scissors
			//------------------------------

			computer1.compRandSign();

			// Get user input for what object they want to use
			System.out.println("//------------------------------\r\n" + "//	Legend:\r\n" + "//	0 = Rock\r\n"
					+ "//	1 = Paper\r\n" + "// 	2 = Scissors\r\n"
					+ "//------------------------------");
			System.out.println();
			System.out.print("Enter a corresponding number: ");
			personSign = scan.nextInt();

			// Calculate what object is correlated to which number
			if (personSign == 0)
			{
				humanSign = "Rock";
			}
			if (personSign == 1)
			{
				humanSign = "Paper";
			}
			if (personSign == 2)
			{
				humanSign = "Scissors";
			}

			// Print out results
			System.out.print("Human: " + humanSign + ", ");
			System.out.println("Computer: " + computer1.computerSignToString());

			// Print out who won

			// ALL EQUAL COMBINATIONS (ROCK-ROCK, PAPER-PAPER, SCISSORS-SCISSORS)
			if (humanSign == computer1.computerSignToString())
			{
				System.out.println("It's a Tie!");
			}

			// HUMAN ROCK PERMUTATIONS
			if (humanSign == "Rock" && computer1.computerSignToString() == "Paper")
			{
				System.out.println("The Computer Wins!");
				computerScore++;
			}

			if (humanSign == "Rock" && computer1.computerSignToString() == "Scissors")
			{
				System.out.println("You Win!");
				personScore++;
			}

			// HUMAN PAPER PERMUTATIONS
			if (humanSign == "Paper" && computer1.computerSignToString() == "Scissors")
			{
				System.out.println("The Computer Wins!");
				computerScore++;
			}

			if (humanSign == "Paper" && computer1.computerSignToString() == "Rock")
			{
				System.out.println("You Win!");
				personScore++;
			}

			// HUMAN SCISSORS PERMUTATIONS
			if (humanSign == "Scissors" && computer1.computerSignToString() == "Rock")
			{
				System.out.println("The Computer Wins!");
				computerScore++;
			}

			if (humanSign == "Scissors" && computer1.computerSignToString() == "Paper")
			{
				System.out.println("You Win!");
				personScore++;
			}

			// Check to see if user wants to play again
			System.out.println();
			System.out.println("Would you like to play again? (y/n)");
			exitKey = scan.next();
			System.out.println();
		}

		if (computerScore > personScore)
		{
			System.out.println("Uh-Oh Spaghettio, Looks like the computer beat you!");
		}

		if (computerScore == personScore)
		{
			System.out.println("Dang, close call but you are as good as the computer");
		}

		if (computerScore < personScore)
		{
			System.out.println("WHAT!!!! You beat my computer!\nMan, you must be a prediction master!");
		}
		System.out.println();

		System.out.println("You " + personScore + " - " + computerScore + " Computer");
	}
}
