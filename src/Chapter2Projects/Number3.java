package Chapter2Projects;

import java.util.Scanner;

public class Number3 
{
	public static void main(String[] args)
	{
		float num1;
		float num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your 1st number: ");
		
		num1 = scan.nextFloat();
		
		System.out.print("What is your 2nd number: ");
		
		num2 = scan.nextFloat();
		
		System.out.println("The sum of your two numbers is: " + (num1+num2));
		System.out.println("The difference of your two numbers is: " + (num1-num2));
		System.out.println("The product of your two numbers is: " + (num1*num2));
		
	}

}
//Made by Tanuj Gaikwad