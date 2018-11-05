package Chapter5Lab;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a non-negative integer: ");
		int userValue = scan.nextInt();
		int counter = userValue;
		
		System.out.println();
		
		while (counter > 0)
		{
			userValue = userValue * counter;
			counter--;
		}
		
		System.out.println("The factorial of " + counter + " is " + );
		
	}
}
