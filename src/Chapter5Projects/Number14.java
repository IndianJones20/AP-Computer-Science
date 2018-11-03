package Chapter5Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Number14
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fileScan = new Scanner(new File("src/Chapter5Projects/Number14.txt"));
		int inputInt;

		System.out.println("Integers in the text file: ");

		while (fileScan.hasNext())
		{
			try
			{
				inputInt = fileScan.nextInt();
				System.out.println(inputInt);
			}

			catch (InputMismatchException e)
			{
				fileScan.next();
			}
		}
	}

}
