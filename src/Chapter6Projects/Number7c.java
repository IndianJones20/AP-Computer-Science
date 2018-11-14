package Chapter6Projects;

public class Number7c
{
	public static void main(String[] args)
	{
		int numStars = 10, numSpaces = 0;
		for (int i = 0; i < 10; i++)
		{

			for (int k = 0; k < numSpaces; k++)
			{
				System.out.print(" ");
			}

			for (int j = 0; j < numStars; j++)
			{
				System.out.print("*");
			}

			System.out.println();
			numStars--;
			numSpaces++;

		}
	}
}
