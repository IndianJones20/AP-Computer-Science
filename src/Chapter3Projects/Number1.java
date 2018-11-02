package Chapter3Projects;

import java.util.Random;
import java.util.Scanner;

public class Number1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		String firstName;
		String lastName;
		String userName;
		int randNum;

		System.out.println("Please enter your first name: ");
		firstName = scan.nextLine();

		System.out.println("Please enter your last name: ");
		lastName = scan.nextLine();

		firstName = firstName.substring(0, 1);
		lastName = lastName.substring(0, 5);
		randNum = rand.nextInt(90) + 10;
		userName = firstName + lastName + randNum;

		System.out.println("Your new username is: " + userName);
	}
}
//Made by Tanuj Gaikwad