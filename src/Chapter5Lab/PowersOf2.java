package Chapter5Lab;

//************************************************************
//PowersOf2.java
//
//Print out as many powers of 2 as the user requests
//
//************************************************************
import java.util.Scanner;

public class PowersOf2
{
	public static void main(String[] args)
	{
		int numPowersOf2;
		int nextPowerOf2 = 1;
		int exponent;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many powers of 2 would you like printed?");
		numPowersOf2 = scan.nextInt();
		System.out.println(numPowersOf2 + " will be printed");

		System.out.println();
		System.out.println("Here are the first " + numPowersOf2 + " powers of 2");
		exponent = 0;
		while (exponent < numPowersOf2)
		{
			System.out.println("2^" + exponent + " = " + (int) Math.pow(2, exponent));
			exponent++;
		}

	}
}