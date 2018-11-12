package Chapter6Projects;

public class Number6
{
	public static void main(String[] args)
	{
		int numHeads = 0, numTails = 0;
		Number6Methods coin1 = new Number6Methods();

		for (int i = 0; i < 100; i++)
		{
			// FLIP COIN HERE
			coin1.flip();

			if (coin1.isHeads())
			{
				numHeads++;
			} else
				numTails++;
		}

		System.out.println("Number of Heads in these 100 flips: " + numHeads);
		System.out.println("Number of Tails in these 100 flips: " + numTails);
	}

}
