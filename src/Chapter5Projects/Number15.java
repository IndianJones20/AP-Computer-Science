package Chapter5Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Number15
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fileScan = new Scanner(new File("src/Chapter5Projects/Number15.txt"));
		// commas, periods, exclamations, questions, semicolons, colons, apostrophes
		ArrayList<Integer> punctCounter = new ArrayList<Integer>();
		ArrayList<Character> charChecker = new ArrayList<Character>();
		String punctString;

		System.out.println("------------------------------------------------------------------------------");
		System.out.println("[ \",\" , \".\", \"!\", \"?\", \";\", \":\", \"\'\"]");
		charChecker.add(',');
		charChecker.add('.');
		charChecker.add('!');
		charChecker.add('?');
		charChecker.add(';');
		charChecker.add(':');
		charChecker.add('\'');
		
		punctCounter.add(0);
		punctCounter.add(0);
		punctCounter.add(0);
		punctCounter.add(0);
		punctCounter.add(0);
		punctCounter.add(0);
		punctCounter.add(0);

		while(fileScan.hasNext())
		{
			punctString = fileScan.next();
			for(int i = 0; i<punctString.length(); i++)
			{
				for(int j = 0; j<7; j++)
				{
					if (punctString.charAt(i) == charChecker.get(j))
					{
						punctCounter.set(j, punctCounter.get(j) + 1);
					}
				}
			}
			
		}
		
		System.out.println(punctCounter);

		System.out.println("------------------------------------------------------------------------------");
	}

}
