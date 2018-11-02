package Chapter2Lab;

import java.util.Scanner;

//***********************************************
//BaseConvert.java
//
//Converts base 10 numbers to another base
//(at most 4 digits in the other base). The
//base 10 number and the base are input.
//***********************************************

public class BaseConvert
{
	public static void main(String[] args)
	{
		int base;
		int base10Num;
		int maxNumber;
		int place0;
		int place1;
		int place2;
		int place3;
		String baseBNum = new String("");
		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println();
		System.out.print("Please enter a base (2-9): ");
		base = scan.nextInt();

		System.out.print("Please enter a base 10 number to convert: ");
		base10Num = scan.nextInt();

	}
}
//Made by Tanuj Gaikwad