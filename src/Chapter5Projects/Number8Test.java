package Chapter5Projects;

import java.util.Scanner;

public class Number8Test
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Number8 slots1 = new Number8();
		String exitKey = "y";
		
		while (exitKey.equalsIgnoreCase("y"))
		{
			slots1.pullLever();

			System.out.println(slots1.printNumbers());

			if (slots1.printNum1().equals(slots1.printNum2()) && slots1.printNum1().equals(slots1.printNum3())
					&& slots1.printNum2().equals(slots1.printNum3()))
			{
				System.out.println("JACKPOT!!!!! Lucky Person!");
			}

			else if (slots1.printNum1().equals(slots1.printNum2()) || slots1.printNum2().equals(slots1.printNum3())
					|| slots1.printNum1().equals(slots1.printNum3()))
			{
				System.out.println("You got two numbers correct! Good Job");
			}



			System.out.println();
			System.out.println("Would you like to play again? (y/n)");
			exitKey = scan.next();
			System.out.println();
		}
	}

}
