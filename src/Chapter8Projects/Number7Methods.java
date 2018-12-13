package Chapter8Projects;

import java.util.Random;

public class Number7Methods
{
	int[] cardNum =
	{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	String[] suits =
	{ "hearts", "clubs", "diamonds", "spades" };

	Random rand = new Random();
	int index, counter = rand.nextInt(4);

	public Number7Methods(int num)
	{
		// Activate the comment below to shuffle deck everytime new deck is made
		shuffle();
		if (num == 1)
		{
			index = num;
			assignCardValue();
		}

		else if (num > 1 && num < 11)
		{
			index = num;
			assignCardValue();
		}

		else if (num > 10 && num < 14)
		{
			index = num;
			assignCardValue();
		}

		else
		{
			index = num % 10;
		}
		suit();
	}

	public void assignCardValue()
	{
		if (index == 1)
		{
			System.out.println("Ace of " + suits[counter]);
		}

		else if (index > 10 && index < 14)
		{
			switch (index)
			{
			case 11:
				System.out.println("Jack of " + suits[counter]);
				break;

			case 12:
				System.out.println("Queen of " + suits[counter]);
				break;

			case 13:
				System.out.println("King of " + suits[counter]);
				break;

			}
		}

		else
			System.out.println(index + " of " + suits[counter]);

	}

	public void suit()
	{
		switch (counter)
		{
		case 0:
		{
			suits[0] = "clubs";
			suits[1] = "diamonds";
			suits[2] = "spades";
			suits[3] = "hearts";
			break;
		}
		case 1:
		{
			suits[0] = "hearts";
			suits[1] = "clubs";
			suits[2] = "diamonds";
			suits[3] = "spades";
			break;
		}

		case 2:
		{
			suits[0] = "spades";
			suits[1] = "hearts";
			suits[2] = "clubs";
			suits[3] = "diamonds";
			break;
		}

		case 3:
		{
			suits[0] = "diamonds";
			suits[1] = "spades";
			suits[2] = "hearts";
			suits[3] = "clubs";
			break;
		}

		}
	}

	public void shuffle()
	{
		counter = rand.nextInt(4);
	}

	public Number7Methods dealACard()
	{
		index = rand.nextInt(13);
		Number7Methods randCard = new Number7Methods(index);

		return randCard;
	}

}
