package Chapter4Lab;

import java.util.Scanner;

public class BBTest
{
	public static void main(String[] args)
	{
		int counter = 1;
		int moreCandy1, moreCandy2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the names of the sellers: ");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();

		BandBooster seller1 = new BandBooster(name1);
		BandBooster seller2 = new BandBooster(name2);

		while (counter <= 3)
		{
			System.out
					.println("Enter the number of boxes sold by " + seller1.getName() + " for week " + counter + ": ");
			moreCandy1 = scan.nextInt();
		seller1.updateScales(moreCandy1);

			System.out
					.println("Enter the number of boxes sold by " + seller2.getName() + " this week " + counter + ": ");
			moreCandy2 = scan.nextInt();
		seller2.updateScales(moreCandy2);

			System.out.println(seller1);
			System.out.println(seller2 + "\n");

			counter++;
		}
	}
}
//Made by Tanuj Gaikwad