package Chapter6Projects;

public class Number8
{

	public static void main(String[] args)
	{
		int unicodeValue = 32;
		char unicodeChar;
		
		for (int i = unicodeValue; i < 51; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				unicodeChar = (char) unicodeValue;
				System.out.print(unicodeValue + ": " + unicodeChar + "\t");
				unicodeValue++;
			}
			System.out.println();
		}
	}

}
