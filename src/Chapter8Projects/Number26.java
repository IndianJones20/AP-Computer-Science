package Chapter8Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number26
{
	public static void main(String[] args) throws FileNotFoundException
	{
		@SuppressWarnings("resource")
		Scanner fileScan = new Scanner(new File("src/Chapter8Projects/HospitalAnalysis.txt"));
		int PPW, PPD, PPH, totalPatients = 0;

		// PPW = Patients per Week
		// PPD = Patients per Day
		// PPH = Patients per Hour

		int[][][] patientChart = new int[4][7][24];

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				for (int k = 0; k < 24; k++)
				{
					patientChart[i][j][k] = fileScan.nextInt();
					totalPatients += fileScan.nextInt();
				}
			}
		}

		PPW = totalPatients / 4;
		PPD = totalPatients / 24;
		PPH = totalPatients / 672;

		System.out.println("Patients per Week: " + PPW);
		System.out.println("Patients per Day: " + PPD);
		System.out.println("Patients per Hour: " + PPH);

	}
}
