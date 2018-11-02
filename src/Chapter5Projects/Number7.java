package Chapter5Projects;

import java.util.Random;

public class Number7
{
	private int compSign, humanSign;
	private String computerSign = "";
	Random rand = new Random();

	public void compRandSign()
	{
		compSign = rand.nextInt(3);
		if(compSign == 0)
		{
			computerSign = "Rock";
		}
		if (compSign == 1)
		{
			computerSign = "Paper";
		}
		if (compSign == 2)
		{
			computerSign = "Scissors";
		}
			
	}

	public String personSignToString()
	{
		String personSign = "";
		if (humanSign == 0)
		{
			personSign = "Rock";
		}
		
		if(humanSign == 1)
		{
			personSign = "Paper";
		}
		
		if(humanSign == 2)
		{
			personSign = "Scissors";
		}
		return personSign;
	}

	public String computerSignToString()
	{
		String computSign = "";

		if (compSign == 0)
		{
			computSign = "Rock";
		}

		if (compSign == 1)
		{
			computSign = "Paper";
		}

		if (compSign == 2)
		{
			computSign = "Scissors";
		}

		return computSign;
	}
}
