package Chapter5Lab;

import java.util.Random;
//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
public class Guess
{
	public static void main(String[] args)
	{
		int numToGuess;
		int guess;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		numToGuess = generator.nextInt(10) + 1;
		System.out.print("Please enter a guess: ");
		guess = scan.nextInt();

		while (guess != numToGuess) // keep going as long as the guess is wrong
		{
			System.out.println("Your guess is wrong, please try again");
			System.out.print("Guess: ");
			guess = scan.nextInt();
		}

		System.out.println("Congrats, your guess was right. GG");
	}
}