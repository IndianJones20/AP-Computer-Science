package Chapter8Projects;

import java.util.Scanner;

public class Number3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner("src/Chapter8Projects/Histogram.txt");

		int counter = 9, max10 = 0, max20 = 0, max30 = 0, max40 = 0, max50 = 0, max60 = 0, max70 = 0, max80 = 0,
				max90 = 0, max100 = 0;

		int[] maximums = new int[10];

		for (int index = 0; index < 10; index++)
		{
			maximums[index] = 0;
		}

		while (scan.hasNextInt())
		{
			for (int index = 0; index < 18; index++)
			{
				maximums[index] = scan.nextInt();
			}

			if (maximums[0] > 1 && maximums[0] <= 10)
			{
				max10 = maximums[0];
				max10++;
				maximums[0] = max10;
			}

			if (maximums[1] > 10 && maximums[1] <= 20)
			{
				max20 = maximums[1];
				max20++;
				maximums[1] = max20;
			}

			if (maximums[2] > 20 && maximums[2] <= 30)
			{
				max30 = maximums[2];
				max30++;
				maximums[2] = max30;
			}

			if (maximums[3] > 30 && maximums[3] <= 40)
			{
				max40 = maximums[3];
				max40++;
				maximums[3] = max40;
			}

			if (maximums[4] > 40 && maximums[4] <= 50)
			{
				max50 = maximums[4];
				max50++;
				maximums[4] = max50;
			}

			if (maximums[5] > 50 && maximums[5] <= 60)
			{
				max60 = maximums[5];
				max60++;
				maximums[5] = max60;
			}

			if (maximums[6] > 60 && maximums[6] <= 70)
			{
				max70 = maximums[6];
				max70++;
				maximums[6] = max70;
			}

			if (maximums[7] > 70 && maximums[7] <= 80)
			{
				max80 = maximums[7];
				max80++;
				maximums[7] = max80;
			}

			if (maximums[8] > 80 && maximums[8] <= 90)
			{
				max90 = maximums[8];
				max90++;
				maximums[8] = max90;
			}

			if (maximums[9] > 90 && maximums[9] <= 100)
			{
				max100 = maximums[9];
				max100++;
				maximums[9] = max100;
			}
		}

		while (counter > -1)
		{
			System.out.println(maximums[counter]);
			counter--;
		}
	}
}
