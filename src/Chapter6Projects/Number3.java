package Chapter6Projects;

public class Number3
{
	public static void main(String[] args)
	{
		int multValue;

		System.out.println("------------------------------------------------");
		System.out.println("Welcome to Multiplication Station!");

		for (int j = 1; j <= 12; j++)
		{
			for (int i = 1; i <= 12; i++)
			{
				multValue = i * j;
				System.out.print(multValue + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
	}

}
