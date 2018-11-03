package Chapter5Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number13
{
	public static void main(String[] args) throws FileNotFoundException
	{
//		Scanner fileScan1, fileScan2;
		String input1, input2;

		Scanner fileScan1 = new Scanner(new File("src/Chapter5Projects/File1.txt"));
		Scanner fileScan2 = new Scanner(new File("src/Chapter5Projects/File2.txt"));

		while (fileScan1.hasNextLine() && fileScan2.hasNextLine())
		{
			input1 = fileScan1.nextLine();
			input2 = fileScan2.nextLine();

			if (input1.compareTo(input2) != 0)
			{
				System.out.println("These lines are NOT identical");
				System.out.println(input1 + "\t" + input2);
			}
			else
				System.out.println("These lines are identical");

		}
	}
}
