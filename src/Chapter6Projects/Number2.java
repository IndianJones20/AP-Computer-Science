package Chapter6Projects;

import java.util.Scanner;

public class Number2
{
	public static void main(String[] args)
	{
		String userString;
		int charatInt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");

		userString = scan.nextLine();
		
		while(charatInt < userString.length())
		{
			System.out.println(userString.charAt(charatInt));
			charatInt++;
		}
	}

}
