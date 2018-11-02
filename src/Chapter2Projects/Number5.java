package Chapter2Projects;

import java.util.Scanner;

public class Number5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		final int BASE = 32;
		final double CONVERSION_FACTOR = 5.0/9.0;
		
		System.out.print("Enter a Fahrenheit temperature to convert into Celcius: ");
		
		double fahrenheitTemp = scan.nextDouble(); //value to convert
		double celciusTemp; 
		
		celciusTemp = CONVERSION_FACTOR * (fahrenheitTemp - BASE);
		
		System.out.println("Celcius Temperature: " + celciusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
	}

}
//Made by Tanuj Gaikwad