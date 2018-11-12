package Chapter6Projects;

public class Number5
{
	public static void main(String[] args)
	{
		int boxCarNum = 0;
		Number5Methods die1 = new Number5Methods();
		Number5Methods die2 = new Number5Methods();

		for (int i = 0; i < 200; i++)
		{
			die1.roll();
			die2.roll();

			if (die1.getFaceValue() == 6 && die2.getFaceValue() == 6)
			{
				boxCarNum++;
			}
		}

		System.out.println(boxCarNum + " box cars happened in these 1000 rolls");
	}

}
