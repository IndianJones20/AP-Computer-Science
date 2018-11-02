package Chapter5Projects;

public class Number6Test extends Number6
{
	public static void main(String[] args)
	{
		Number6 coin1 = new Number6();
		Number6 coin2 = new Number6();
		int counter = 0, counter2 = 0;

		while (counter <= 2 && counter2 <= 2)
		{
			coin1.flip();
			coin2.flip();

			System.out.print("Coin 1: " + coin1.toString() + "; Coin 2: ");
			System.out.println(coin2.toString());
			System.out.println();
			if (coin1.isHeads())
				counter++;
			else
				counter = 0;

			if (coin2.isHeads())
				counter2++;
			else
				counter2 = 0;
		}

		if (counter == 3 && counter2 == 3)
		{
			System.out.println("It is a Tie");
		} else if (counter == 3)
		{
			System.out.println("Coin 1 is the Winner!");
		}
		else if (counter2 == 3)
		{
			System.out.println("Coin 2 is the Winner!");
		}

	}

}
