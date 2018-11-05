package Chapter5Lab;

import java.util.Scanner;

//****************************************************************
//LoveCS.java
//
//Use a while loop to print many messages declaring your
//passion for computer science
//****************************************************************
public class LoveCS
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("How many time do you want to print out \"I Love Computer Science!!\" ?");

		int LIMIT = scan.nextInt();

		int count = 1, lineNumber = 1, sum = 0, sumCounter = 0;
		
		
		while (count <= LIMIT)
		{
			System.out.println(lineNumber + " I love Computer Science!!");
			count++;
			lineNumber++;
		}

		while (sumCounter <= LIMIT)
		{
			sum += sumCounter;
			sumCounter++;
		}

		System.out.println("Printed this message " + (lineNumber - 1) + " times; The sum of the numbers from 1 to "
				+ LIMIT + " is " + sum);
	}
}