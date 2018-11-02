package Chapter2Projects;

import java.util.Scanner;

public class Number8 {

	public static void main(String[] args)
	{
		int hour;
		int minute;
		int second;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your hours: ");
		hour = scan.nextInt();
		
		System.out.print("Please enter your minutes: ");
		minute = scan.nextInt();
		
		System.out.print("Please enter your seconds: ");
		second = scan.nextInt();
		
		int secondsTotal = ((hour*3600) + (minute*60) + second);
				
		System.out.println("The total amount of seconds in your given time is: " + secondsTotal);
	}

}
//Made by Tanuj Gaikwad