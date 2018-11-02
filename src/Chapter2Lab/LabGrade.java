package Chapter2Lab;

import java.util.Scanner;
// ***************************************************************
// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab
// assignment, the lab itself, and the post-lab assignment.
// ***************************************************************

public class LabGrade
{
	public static void main(String[] args)
	{
		// Declare constants
		final double inWeight;

		double preLabPts;
		double preLabMax;
		double labPts;
		double labMax;
		double postLabPts;
		double postLabMax;
		double outClassAvg;
		double inClassAvg;
		double labGrade;

		Scanner scan = new Scanner(System.in);

		System.out.println("\nWelcome to the Lab Grade Calculator\n");

		System.out.println("Please enter the weight of the In-Class grades (ex. 0.4 for 40%): ");
		inWeight = scan.nextDouble();

		System.out.print("Enter the number of points you earned on the pre-lab: ");
		preLabPts = scan.nextInt();

		System.out.print("What was the maximum number of points you could have earned? ");
		preLabMax = scan.nextInt();

		System.out.print("Enter the number of points you earned on the lab: ");
		labPts = scan.nextInt();

		System.out.print("What was the maximum number of points for the lab? ");
		labMax = scan.nextInt();

		System.out.print("Enter the number of points you earned on the post-lab: ");
		postLabPts = scan.nextInt();

		System.out.print("What was the maximum number of points for the post-lab? ");
		postLabMax = scan.nextInt();

		System.out.println();

		outClassAvg = 100 * ((preLabPts + postLabPts) / (preLabMax + postLabMax));

		inClassAvg = (labPts / labMax) * 100;

		labGrade = ((1 - inWeight) * outClassAvg) + (inWeight * inClassAvg);

		System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
		System.out.println("Your average on in-class work is " + inClassAvg + "%");
		System.out.println("Your lab grade is " + labGrade + "%");
		System.out.println();
	}
}
//Made by Tanuj Gaikwad