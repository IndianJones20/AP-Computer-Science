package Chapter8Projects;

import java.util.Random;

public class HunderedNumGenerator
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		for (int i = 0; i < 100; i++)
		{
			System.out.println(rand.nextInt(100) + 1);
		}
	}
}
