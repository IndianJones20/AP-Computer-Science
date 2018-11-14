package Chapter6Projects;

import java.util.Scanner;

public class Number9
{

	public static void main(String[] args)
	{
		String userString;
		int consonants, vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0, indexCounter = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		userString = scan.nextLine();
		
		for(int i = indexCounter; i < userString.length();i++)
		{
			switch (userString.charAt(i))
			{
			case 'a':
				vowelA++;
				break;
			case 'e':
				vowelE++;
				break;
			case 'i':
				vowelI++;
				break;
			case 'o':
				vowelO++;
				break;
			case 'u':
				vowelU++;
				break;
			}
		}

		consonants = 26 - vowelA - vowelE - vowelI - vowelO - vowelU;
		System.out.println("There are " + vowelA + " \'A\'s in this string");
		System.out.println("There are " + vowelE + " \'E\'s in this string");
		System.out.println("There are " + vowelI + " \'I\'s in this string");
		System.out.println("There are " + vowelO + " \'O\'s in this string");
		System.out.println("There are " + vowelU + " \'U\'s in this string");
		System.out.println("There are " + consonants + " consonants in this string");

	}

}
