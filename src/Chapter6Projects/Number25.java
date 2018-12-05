package Chapter6Projects;

import java.util.ArrayList;
import java.util.Random;

public class Number25
{

	public static void main(String[] args)
	{
		ArrayList<Integer> cardNum = new ArrayList<Integer>();
		ArrayList<String> suits = new ArrayList<String>();

		for (int i = 1; i < 14; i++)
		{
			cardNum.add(i - 1, i);
		}

		suits.add(0, "hearts");
		suits.add(1, "clubs");
		suits.add(2, "spades");
		suits.add(3, "diamonds");

		Random rand = new Random();
		int checkSuit, checkNum;
		String suit = "";

		for (int i = 0; i < 5; i++)
		{
			checkNum = rand.nextInt(13) + 1;
			checkSuit = rand.nextInt(4) + 1;

			switch (checkSuit)
			{
			case 1:
				suit = suits.get(checkSuit - 1);
				break;

			case 2:
				suit = suits.get(checkSuit - 1);
				break;

			case 3:
				suit = suits.get(checkSuit - 1);
				break;

			case 4:
				suit = suits.get(checkSuit - 1);
				break;

			}

			if (checkNum == 1)
			{
				System.out.println("Ace of " + suit);
			}

			else if (checkNum == 11)
			{
				System.out.println("Jack of " + suit);
			}

			else if (checkNum == 12)
			{
				System.out.println("Queen of " + suit);
			}

			else if (checkNum == 13)
			{
				System.out.println("King of " + suit);
			}

			else
			{
				System.out.println(checkNum + " of " + suit);
			}
		}
	}

}
