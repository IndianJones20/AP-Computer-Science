package Chapter3Projects;

import java.util.Scanner;

public class Number2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		double num1;
		double num2;

		System.out.println("Enter a value: ");
		num1 = scan.nextInt();

		System.out.println("Enter another value: ");
		num2 = scan.nextInt();

		num1 = Math.pow(num1, 3);
		num2 = Math.pow(num2, 3);

		System.out.println("The sum of the cubes of these values is: " + (num1 + num2));

	}

}
//Made by Tanuj Gaikwad