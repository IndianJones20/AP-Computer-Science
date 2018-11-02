package Chapter3Projects;

import java.util.Random;

public class Number8
{

	public static void main(String[] args)
	{
		Random rand = new Random();

		int randInt = rand.nextInt(19) + 20;

		System.out.println("Random Number Generated: " + randInt);
		System.out.println("Sine of random number: " + Math.sin(randInt));
		System.out.println("Cosine of random number: " + Math.cos(randInt));
		System.out.println("Tangent of random number: " + Math.tan(randInt));

	}

}
//Made by Tanuj Gaikwad