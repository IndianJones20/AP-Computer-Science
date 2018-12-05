package Chapter7Projects;

public class modCoin extends LockableMethods
{

	public static void main(String[] args) throws InterruptedException
	{
		modCoinMethods coin1 = new modCoinMethods();
		modCoinMethods coin2 = new modCoinMethods();
		modCoinMethods padLock = new modCoinMethods();

		int counter = 0, counter2 = 0;

		while (true)
		{
			padLock.setKey(73795);
			padLock.lock(73795);

			while (padLock.locked())
			{
				System.out.println("Enter the key in the source code");
				padLock.unlock(73795);
				padLock.locked();
			}

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
			}

			else if (counter == 3)
			{
				System.out.println("Coin 1 is the Winner!");
			}

			else if (counter2 == 3)
			{
				System.out.println("Coin 2 is the Winner!");
			}
		}



	}

}
