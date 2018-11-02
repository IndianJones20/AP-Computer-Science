package Chapter2Projects;

import java.util.Scanner;

public class Number2
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your 1st Number: ");
		
		num1 = scan.nextInt();
		
		System.out.print("Enter your 2nd Number: ");
		
		num2 = scan.nextInt();
		
		System.out.print("Enter your 3rd Number: ");
		
		num3 = scan.nextInt();
		
		System.out.print("The average of your 3 numbers is: " + ((num1+num2+num3))/3);
	}

}
//Made by Tanuj Gaikwad