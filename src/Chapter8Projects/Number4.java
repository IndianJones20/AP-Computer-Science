package Chapter8Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number4
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("src/Chapter8Projects/Histogram.txt"));

		int max10 = 0, max20 = 0, max30 = 0, max40 = 0, max50 = 0, max60 = 0, max70 = 0, max80 = 0, max90 = 0,
				max100 = 0, hold, index = 0;

		int[] maximums = new int[10];

		for (int hello = 0; hello < 10; hello++)
		{
			maximums[hello] = 0;
		}

		while (scan.hasNextInt())
		{
			hold = scan.nextInt();

			if (hold > 1 && hold <= 10)
			{
				max10 = maximums[0];
				max10++;
				maximums[0] = max10;
			}

			if (hold > 10 && hold <= 20)
			{
				max20 = maximums[1];
				max20++;
				maximums[1] = max20;
			}

			if (hold > 20 && hold <= 30)
			{
				max30 = maximums[2];
				max30++;
				maximums[2] = max30;
			}

			if (hold > 30 && hold <= 40)
			{
				max40 = maximums[3];
				max40++;
				maximums[3] = max40;
			}

			if (hold > 40 && hold <= 50)
			{
				max50 = maximums[4];
				max50++;
				maximums[4] = max50;
			}

			if (hold > 50 && hold <= 60)
			{
				max60 = maximums[5];
				max60++;
				maximums[5] = max60;
			}

			if (hold > 60 && hold <= 70)
			{
				max70 = maximums[6];
				max70++;
				maximums[6] = max70;
			}

			if (hold > 70 && hold <= 80)
			{
				max80 = maximums[7];
				max80++;
				maximums[7] = max80;
			}

			if (hold > 80 && hold <= 90)
			{
				max90 = maximums[8];
				max90++;
				maximums[8] = max90;
			}

			if (hold > 90 && hold <= 100)
			{
				max100 = maximums[9];
				max100++;
				maximums[9] = max100;
			}
		}

		for (int yo = 0; yo < 10; yo++)
		{
			maximums[yo] = maximums[yo] / 5;
		}

		while (index < 11)
		{
			switch (index)
			{
			case 1:
				System.out.print("01 - 10s: ");
				hold = 0;
				while (hold < maximums[0])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max10 + ")");
				System.out.println();
				break;

			case 2:
				System.out.print("11 - 20s: ");
				hold = 0;
				while (hold < maximums[1])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max20 + ")");
				System.out.println();
				break;

			case 3:
				System.out.print("21 - 30s: ");
				hold = 0;
				while (hold < maximums[2])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max30 + ")");
				System.out.println();
				break;

			case 4:
				System.out.print("31 - 40s: ");
				hold = 0;
				while (hold < maximums[3])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max40 + ")");
				System.out.println();
				break;

			case 5:
				System.out.print("41 - 50s: ");
				hold = 0;
				while (hold < maximums[4])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max50 + ")");
				System.out.println();
				break;

			case 6:
				System.out.print("51 - 60s: ");
				hold = 0;
				while (hold < maximums[5])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max60 + ")");
				System.out.println();
				break;

			case 7:
				System.out.print("61 - 70s: ");
				hold = 0;
				while (hold < maximums[6])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max70 + ")");
				System.out.println();
				break;

			case 8:
				System.out.print("71 - 80s: ");
				hold = 0;
				while (hold < maximums[7])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max80 + ")");
				System.out.println();
				break;

			case 9:
				System.out.print("81 - 90s: ");
				hold = 0;
				while (hold < maximums[8])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max90 + ")");
				System.out.println();
				break;

			case 10:
				System.out.print("91 - 100s: ");
				hold = 0;
				while (hold < maximums[9])
				{
					System.out.print("*");
					hold++;
				}
				System.out.print("\t(" + max100 + ")");
				System.out.println();
				break;
			}

			index++;
		}
		scan.close();
	}
}
