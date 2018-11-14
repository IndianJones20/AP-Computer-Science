package Chapter6Projects;

public class Number7d
{
	public static void main(String[] args)
	{
		int howManySpaces = 4, starCount = 1;
		for (int i = 0; i < 4; i++)
		{
			for (int j = howManySpaces; j > 0; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < starCount; k++)
			{
				System.out.print("*");
			}
			starCount += 2;
			howManySpaces--;
			System.out.println();
		}

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < howManySpaces; j++)
			{
				System.out.print(" ");
			}

			for (int k = starCount; k > 0; k--)
			{
				System.out.print("*");
			}
			starCount -= 2;
			howManySpaces++;
			System.out.println();
		}
	}
}
