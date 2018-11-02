package Chapter3Projects;

import java.util.Random;

public class Number9
{
	public static void main(String[] args)
	{
		Random rand = new Random();

		int randRadius = rand.nextInt(19) + 1;
		int randHeight = rand.nextInt(19) + 1;

		System.out.println("Random Radius Generated: " + randRadius);
		System.out.println("Random Height Generated: " + randHeight + "\n");

		double volume = (Math.PI * Math.pow(randRadius, 2) * randHeight);
		double surfaceArea = (2 * Math.PI * randRadius * randHeight);

		System.out.println("Volume from both values: " + volume);
		System.out.println("Surface Area from both values: " + surfaceArea);

	}

}
//Made by Tanuj Gaikwad