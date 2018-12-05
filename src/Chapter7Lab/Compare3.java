package SecondVersionChapter7Labs;

public class Compare3
{
	public static Comparable largest(Comparable yeet, Comparable yeet2, Comparable yeet3)
	{
		if (yeet.compareTo(yeet2) > 0 && yeet.compareTo(yeet3) > 0)
		{
			return yeet;
		}

		else if (yeet2.compareTo(yeet3) > 0 && yeet2.compareTo(yeet) > 0)
		{
			return yeet2;
		}

		else
		{
			return yeet3;
		}
	}
}
