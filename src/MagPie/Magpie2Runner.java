package MagPie;

import java.util.Scanner;

public class Magpie2Runner
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
//Made by Tanuj Gaikwad