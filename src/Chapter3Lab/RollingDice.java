package Chapter3Lab;

import java.util.Random;

public class RollingDice
{
	public static void main(String[] args)
	{
		int die1;
		int die2;

		Random rand = new Random();

		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;

		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);

		int sum = die1 + die2;
		System.out.println("Sum of Die Numbers: " + sum);
	}

}
//Made by Tanuj Gaikwad