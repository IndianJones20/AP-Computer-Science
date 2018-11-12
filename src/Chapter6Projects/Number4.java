package Chapter6Projects;

public class Number4
{
	public static void main(String[] args)
	{
		for (int i = 100; i >= 1; i--)
		{
			System.out.println(i + " bottles of beers on the wall");
			System.out.println(i + " bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			i--;
			System.out.println(i + " bottles of beer on the wall");
			i++;
			System.out.println();
		}
	}

}
