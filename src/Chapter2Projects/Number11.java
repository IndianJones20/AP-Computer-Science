package Chapter2Projects;

import java.util.Scanner;

public class Number11
{
	public static void main(String[] args)
	{
		double money_value;
		int dollars;
		int cents;
				
		Scanner scan = new Scanner(System.in);
		
		 System.out.print("Please enter a value of money (ex. 47.62): ");
		 
		 money_value = scan.nextDouble();
		 
		 dollars = (int) Math.floor(money_value);
		 cents = (int) Math.round((money_value - dollars)*100);
		 
		 
		 //$ conversion
		 System.out.println(dollars/10 + " ten dollar bills");
		 dollars = dollars%10;
		 
		 System.out.println(dollars/5 + " five dollar bills");
		 dollars = dollars%5;
		 
		 System.out.println(dollars/1 + " one dollar bills");

		 
		 // Cents conversion
		 System.out.println(cents/25 + " Quarters");
		 cents = cents%25;
		 System.out.println(cents/10 + " Dimes");
		 cents = cents%10;
		 System.out.println(cents/5 + " Nickels");
		 cents = cents%5;
		 System.out.println(cents/1 + " Pennies");
		 
	}

}
//Made by Tanuj Gaikwad