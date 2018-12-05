package SecondVersionChapter7Labs;

public class BiasedCoinTest
{
	public static void main(String[] args)
	{
		BiasedCoin bCoin1 = new BiasedCoin();
		BiasedCoin bCoin2 = new BiasedCoin(0.8);
		BiasedCoin bCoin3 = new BiasedCoin(0.8);
		int headCounter = 0, tailCounter = 0;

		for (int i = 0; i < 100; i++)
		{
			System.out.println(bCoin1);
			System.out.println(bCoin2);
			System.out.println(bCoin3);

			if (bCoin1.isHeads())
			{
				headCounter++;
			}

			else
			{
				tailCounter++;
			}

			if (bCoin2.isHeads())
			{
				headCounter++;
			}

			else
			{
				tailCounter++;
			}

			if (bCoin3.isHeads())
			{
				headCounter++;
			}

			else
			{
				tailCounter++;
			}

			bCoin1.flip();
			bCoin2.flip();
			bCoin3.flip();
		}

		System.out.println("Number of Heads: " + headCounter);
		System.out.println("Number of Tails: " + tailCounter);
	}
}
