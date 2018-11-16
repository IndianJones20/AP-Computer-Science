package Chapter6Projects;

import java.util.Random;

public class Number11
{
	public static void main(String[] args)
	{
		Random rand = new Random();

		int counter = rand.nextInt(20) + 1;

		for (int i = 0; i < 20; i++)
		{
			counter = rand.nextInt(20) + 1;

			while (counter > 0)
			{
				System.out.print("-");
				counter--;
			}
			System.out.println();
		}
	}
}
