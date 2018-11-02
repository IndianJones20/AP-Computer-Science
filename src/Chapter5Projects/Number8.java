package Chapter5Projects;

import java.util.Random;

public class Number8
{
	static int num1, num2, num3;

	Random rand = new Random();

	public Number8()
	{
		pullLever();
	}

	public void pullLever()
	{
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		num3 = rand.nextInt(10);
	}

	public String printNum1()
	{
		return "" + num1;
	}

	public String printNum2()
	{
		return "" + num2;
	}

	public String printNum3()
	{
		return "" + num3;
	}
	public String printNumbers()
	{
		return num1 + " " + num2 + " " + num3;
	}

}
