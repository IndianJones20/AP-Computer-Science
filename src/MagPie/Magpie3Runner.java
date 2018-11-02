package MagPie;

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3Runner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie3 maggie = new Magpie3();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

//	  findKeyword("She's my sister", "sister", 0); 
//	  Iteration: 1, PSN: 9, before:" ", after: ""

//	  findKeyword("Brother Tom is helpful", "brother", 0);
//	  Iteration: 1, PSN: 0, before: "", after: " "

//	  findKeyword("I can't catch wild cats.", "cat", 0);
//	  Iteration: 1, PSN: 8, before: " ", after: "c"
//	  Iteration: 2, PSN: 19, before: " ", after: "s"

//	  findKeyword("I know nothing about snow plows.", "no", 0);
//	  Iteration: 1, PSN: 3, before: "k", after: "w"
//	  Iteration: 2, PSN: 7, before: " ", after: "t"
//	  Iteration: 3, PSN: 22, before: "s", after: "w"	
}
//Made by Tanuj Gaikwad