package Chapter7Lab;

public class compare3
{
	public static Comparable largest(Comparable yeet, Comparable yeet2, Comparable yeet3)
	{
		if (yeet.compareTo(yeet2) > 0)
		{
			return yeet;
		}

		else if (yeet2.compareTo(yeet3) > 0)
		{
			return yeet2;
		}

		else
			return yeet3;

	}
}
