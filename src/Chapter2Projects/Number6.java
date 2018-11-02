package Chapter2Projects;

import java.util.Scanner;

public class Number6
{
	public static void main(String[] args)
	{
		float miles;
		double kilometers;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an amount of miles: ");
		miles = scan.nextFloat();
		
		kilometers = (1.60935) * miles;
		
		System.out.println("Your amount of miles in kilometers is: " + kilometers);
	}

}
//Made by Tanuj Gaikwad