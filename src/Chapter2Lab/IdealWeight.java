package Chapter2Lab;

import java.util.Scanner;

public class IdealWeight
{
	public static void main(String[] args)
	{
		int feet;
		int inches_fromFeet;
		int inches_Total;
		int idealWeightFemale;
		int idealWeightMale;
		int inches_remaining;

		Scanner scan = new Scanner(System.in);

		System.out.print("How many feet tall are you: ");
		feet = scan.nextInt();

		System.out.print("What are your additional inches: ");
		inches_fromFeet = scan.nextInt();

		inches_Total = ((feet * 12) + inches_fromFeet);

		inches_remaining = (inches_Total % 60);

		idealWeightFemale = ((100 * (feet / 5)) + (5 * inches_remaining));
		System.out.println("Ideal weight for a female at this height: " + idealWeightFemale);

		idealWeightMale = ((106 * (feet / 5)) + (6 * inches_remaining));
		System.out.println("Ideal weight for a male at this height: " + idealWeightMale);

		System.out.println("The ideal weight for the male is between " + (0.85 * idealWeightMale) + " and "
				+ (1.15 * idealWeightMale));
		System.out.println("The ideal weight for the female is between " + (0.85 * idealWeightFemale) + " and "
				+ (1.15 * idealWeightFemale));

	}

}
//Made by Tanuj Gaikwad