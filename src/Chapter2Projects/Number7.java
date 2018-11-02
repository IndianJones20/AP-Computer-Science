package Chapter2Projects;

import java.util.Scanner;

public class Number7
{
	public static void main(String[] args)
	{
		int speed;
		int distance;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your speed (in miles per hour): ");
		speed = scan.nextInt();
		
		System.out.print("Please enter your distance traveled (miles): ");
		distance = scan.nextInt();
		
		int time = distance/speed;
		
		System.out.println("The time required for your trip is: " + time);
	}

}
//Made by Tanuj Gaikwad