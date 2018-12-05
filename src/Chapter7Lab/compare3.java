package Chapter7Lab;

public class compare3
{
	public static Comparable largest(Comparable yeet1, Comparable yeet2, Comparable yeet3)
	{
		if (yeet1.compareTo(yeet2) > 0 && yeet1.compareTo(yeet3) > 0)
		{
			return yeet1;
		}

		else if (yeet2.compareTo(yeet3) > 0 && yeet2.compareTo(yeet1) > 0)
		{
			return yeet2;
		}

		else
		{
			return yeet3;
		}
	}
}
