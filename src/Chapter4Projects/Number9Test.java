package Chapter4Projects;

public class Number9Test
{

	public static void main(String[] args)
	{
		Number9 die1 = new Number9();
		Number9 die2 = new Number9();
		int sum;

		die1.roll();
		die2.roll();

		sum = die1.getFaceValue() + die2.getFaceValue();
		System.out.println("Die 1 Value: " + die1.getFaceValue());
		System.out.println("Die 2 Value: " + die2.getFaceValue());
		System.out.println(sum);
	}

}
//Made by Tanuj Gaikwad