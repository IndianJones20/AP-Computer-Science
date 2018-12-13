package Chapter8Projects;

public class Number7Methods
{
	int[] cardNum =
	{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	String[] suits =
	{ "hearts", "clubs", "diamonds", "spades" };

	int index;

	public Number7Methods(int num)
	{
		if (num < 11)
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
	}

	public void assignCardValue()
	{
		if (index > 10 && index < 14)
		{
			switch (index)
			{
			case 11:
				System.out.println("Jack of " + suits[index % 4]);
				break;

			case 12:
				System.out.println("Queen of " + suits[index % 4]);
				break;

			case 13:
				System.out.println("King of " + suits[index % 4]);
				break;

			}
		} else

			System.out.println(index + " of " + suits[index % 4]);
	}

}
