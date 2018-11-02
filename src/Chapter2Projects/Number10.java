package Chapter2Projects;

import java.util.Scanner;

public class Number10
{
	public static void main(String[] args)
	{
		double quarters;
		double dimes;
		double nickels;
		double pennies;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your quarters: ");
		
		quarters = scan.nextInt();
		
		System.out.print("Please enter your dimes: ");
		
		dimes = scan.nextInt();
		
		System.out.print("Please enter your nickels: ");
		
		nickels = scan.nextInt();
		
		System.out.print("Please enter your pennies: ");
		
		pennies = scan.nextInt();
		
		double dollars_and_cents = ((quarters/4) + (dimes/10) + (nickels/20) + (pennies/100));
		
		System.out.println("Your coin jar currently contains: $" + dollars_and_cents);
	}

}
//Made by Tanuj Gaikwad