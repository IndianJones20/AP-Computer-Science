package Chapter5Projects;

public class Number9Test
{

	public static void main(String[] args)
	{
		Number9 die1, die2;
		int sum;

		die1 = new Number9();
		die2 = new Number9();

		die1.roll();
		die2.roll();
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		die1.roll();
		// If Die2 is greater than 6 or less than 1, Die2 will default to 1
		die2.setFaceValue(0);
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		sum = die1.getFaceValue() + die2.getFaceValue();
		System.out.println("Sum: " + sum);

		sum = die1.roll() + die2.roll();
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);
		System.out.println("New Sum: " + sum);
	}

}
