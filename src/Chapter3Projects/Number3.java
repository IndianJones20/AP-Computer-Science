package Chapter3Projects;

import java.util.Random;

public class Number3
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int num1;
		int num2;
		int num3;
		int numCombo2;
		int numCombo3;

		num1 = (rand.nextInt(6) + 1);
		num2 = (rand.nextInt(6) + 1);
		num3 = (rand.nextInt(6) + 1);
		numCombo2 = (rand.nextInt(555) + 100);
		numCombo3 = (rand.nextInt(9000) + 1000);

		System.out.println("Random Phone Number: " + num1 + num2 + num3 + "-" + numCombo2 + "-" + numCombo3);

	}

}
//Made by Tanuj Gaikwad