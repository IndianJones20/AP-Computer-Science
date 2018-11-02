package Chapter5Projects;

//********************************************************************
//PalindromeTester.java		Author: Lewis/Loftus
//
//Demonstrates the use of nested while loops.
//********************************************************************
import java.util.Scanner;
public class Number5
{
	//-----------------------------------------------------------------
	//Tests strings to see if they are palindromes.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		String str, another = "y";
		int left, right;
		Scanner scan = new Scanner(System.in);
		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine().toLowerCase().trim();

			str = str.replace(" ", "");
			str = str.replace("'", "");
			str = str.replace(",", "");
			str = str.replace(";", "");
			left = 0;
			right = str.length() - 1;

			System.out.println(str);

			while (str.charAt(left) == str.charAt(right) && left < right)
			{
				left++;
				right--;
			}
			System.out.println();
			if (left < right)
				System.out.println("That string is NOT a palindrome.");

			else

				System.out.println("That string IS a palindrome.");
			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();
		}
	}
}
