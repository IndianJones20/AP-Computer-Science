package Chapter6Projects;

public class Number7b
{
	public static void main(String[] args)
	{
		int numSpaces = 9, numStars = 1, counter = 0;

		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < numSpaces; j++)
			{
				System.out.print(" ");
			}

			counter = 0;

			while (counter < numStars)
			{
				System.out.print("*");
				counter++;
			}
			System.out.println();
			numSpaces--;
			numStars++;
		}
	}
}
