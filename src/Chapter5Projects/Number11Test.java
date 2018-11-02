package Chapter5Projects;

import java.util.Scanner;

public class Number11Test
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Number11 person1 = new Number11();
		Number11 computer = new Number11();
		final int MAX_SCORE = 100;
		int personScore = 0, compScore = 0, compTempScore = 0, compChecker = 0;
		String giveUpDice = "n";

		person1.roll();

		while (personScore < MAX_SCORE || compScore < MAX_SCORE)
		{
			while (giveUpDice.equalsIgnoreCase("n"))
			{
				// Checks if the person wants to give up the dice and give them to the computer.
				if (personScore < 100 || person1.getFaceValue1() != 1
						|| person1.getFaceValue2() != 1 && giveUpDice == "n")
				{
					if (personScore >= 100)
					{
						System.out.println("Good Job, your a pig and you know it");
						return;
					}

					// Rolls the dice
					person1.roll();

					// Prints out the results of the dice roll.
					System.out.println(person1.toString() + "\n");

					// checks if both of the dice are of a certain value
					// resets the score for double ones
					if (person1.getFaceValue1() == 1 && person1.getFaceValue2() == 1)
					{
						personScore = 0;
						System.out.println("Player Score: " + personScore);
						System.out.println("\nYou rolled double ones, Time to give up the dice. (type \"y\")");
						giveUpDice = scan.next();
						while (giveUpDice.equalsIgnoreCase("n"))
						{
							System.out.println("You cannot roll again, please give up the dice. (type \"y\")");
							giveUpDice = scan.next();
						}
					}

					// Doesn't do anything scorewise
					else if (person1.getFaceValue1() == 1 || person1.getFaceValue2() == 1)
					{
						System.out.println("Player Score: " + personScore);
						System.out.println("\nYou rolled a one, Time to give up the dice. (type \"y\")");
						giveUpDice = scan.next();
						while (giveUpDice.equalsIgnoreCase("n"))
						{
							System.out.println("You cannot roll again, please give up the dice. (type \"y\")");
							giveUpDice = scan.next();
						}
					}

					else
					{
						personScore = personScore + person1.getFaceValue1() + person1.getFaceValue2();
						System.out.println("Player Score: " + personScore);
						if (personScore >= 100)
						{
							System.out.println("Good Job, you're a pig and you know it :D :D");
							return;
						}
						System.out.println("\nWould you like to give up the dice? (y/n)");
						giveUpDice = scan.next();
						System.out.println();
					}
				}
			}
			computer.setFaceValue1(4);
			computer.setFaceValue2(4);

			while (giveUpDice.equalsIgnoreCase("y"))
			{
				computer.setFaceValue1(4);
				computer.setFaceValue2(4);

				if (compTempScore < 20
						|| computer.getFaceValue1() != 1 && computer.getFaceValue2() != 1 && giveUpDice == "y")
				{
					// Computer Rolls the dice
					computer.roll();

					// Computer prints out the results
					System.out.println(computer.toString() + "\n");
					compTempScore = computer.getFaceValue1() + computer.getFaceValue2();
					compChecker = compChecker + computer.getFaceValue1() + computer.getFaceValue2();

					// Checks if computer got double 1s
					if (computer.getFaceValue1() == 1 && computer.getFaceValue2() == 1)
					{
						compTempScore = 0;
						compScore = 0;
						compChecker = 0;
						System.out.println("Computer Score: " + compTempScore);
						System.out.println();
						System.out.println("END OF COMPUTER'S TURN");
						giveUpDice = "n";
					}

					// Checks if computer got a single 1
					// Doesn't do anything scorewise
					else if (computer.getFaceValue1() == 1 || computer.getFaceValue2() == 1)
					{
						System.out.println("Computer Score: " + compScore);
						System.out.println();
						System.out.println("END OF COMPUTER'S TURN");
						compChecker = 0;
						giveUpDice = "n";
					}

					// Calculates Computer's score after the roll and adds it onto the total
					// computer score
					else
					{
						compTempScore = computer.getFaceValue1() + computer.getFaceValue2();
						compScore = compScore + compTempScore;
						System.out.println("Computer Score: " + compScore);
						System.out.println();
					}

					if (compChecker >= 20)
					{
						giveUpDice = "n";
						compTempScore = 0;
						System.out.println("END OF COMPUTER TURN");
					}
					if (compScore >= 100)
					{
						System.out.println("Lol, you got beat by a greedy computer, sucker");
						return;
					}

					computer.setFaceValue1(4);
					computer.setFaceValue2(4);

				}
			}
		}

		if(compScore >= 100)
		{
			System.out.println("Lol, you got beat by a greedy computer, sucker");
		}
	}
}
