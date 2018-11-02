package Chapter3Lab;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Deli
{
	// ---------------------------------------------------
	// main reads in the price per pound of a deli item
	// and number of ounces of a deli item then computes
	// the total price and prints a "label" for the item
	// ---------------------------------------------------
	public static void main(String[] args)
	{
		final double OUNCES_PER_POUND = 16.0;
		double pricePerPound;
		double weightOunces;
		double weight;
		double totalPrice;

		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat fmt = new DecimalFormat("0.##");

		// prompt the user and read in each input
		System.out.println("Welcome to the CS Deli! ! \n ");
		System.out.print("Enter the price per pound of your item: ");

		pricePerPound = scan.nextDouble();

		System.out.print("Enter the weight (ounces): ");

		weightOunces = scan.nextDouble();

		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;

		System.out.println("\nUnit Price: " + money.format(pricePerPound) + " per pound");
		System.out.println("Weight of your item: " + fmt.format(weight) + " pounds");
		System.out.println("Total cost: " + money.format(totalPrice));
	}
}
//Made by Tanuj Gaikwad