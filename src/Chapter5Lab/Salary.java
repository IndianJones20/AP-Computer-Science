package Chapter5Lab;

import java.text.NumberFormat;
//************************************************************
//Salary.java
//
//Computes the amount of a raise and the new
//salary for an employee. The current salary
//and a performance rating (a String: "Excellent",
//"Good" or "Poor") are input.
//************************************************************
import java.util.Scanner;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary, raise = 0, newSalary;
		String rating;

		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();

		System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.next();

		// Compute the raise using if ...
		if (rating.equalsIgnoreCase("Excellent"))
		{
			raise = 0.06 * currentSalary;
		}

		else if (rating.equalsIgnoreCase("Good"))
		{
			raise = 0.04 * currentSalary;
		}

		else if (rating.equalsIgnoreCase("Poor"))
		{
			raise = 0.015 * currentSalary;
		}

		newSalary = currentSalary + raise;

		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary: " + money.format(newSalary));
		System.out.println();
	}
}
