package Chapter8Projects;

public class Number7
{
	public static void main(String[] args)
	{
		Number7Methods[][] card = new Number7Methods[4][13];

		Number7Methods someCard = null;

		for (int row = 0; row < 4; row++)
		{
			for (int col = 0; col < card[row].length; col++)
			{
				for (int counter = 0; counter < 52; counter++)
				{
					someCard = new Number7Methods(counter + 1);
					card[row][col] = someCard;
				}
			}
		}
	}
}
