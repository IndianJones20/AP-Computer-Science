package Chapter2Projects;

import java.util.Scanner;

public class Number9 
{
	public static void main(String[] args)
	{
		int secondTotal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an amount of seconds: ");
		
		secondTotal = scan.nextInt();
		
		//Takes initial secondTotal value and converts it into minutes
		int seconds_to_minutes = secondTotal/60; //9999 sec = 166.65 mins
				
		//Takes seconds_to_minutes value (now in minutes) and converts it into hours.
		int minutes_to_hours = seconds_to_minutes/60; //166.65 mins = 2.7775 hours 
		
		//Takes the minutes value and subtracts the number of hours lapsed to give final number of minutes
		int minutes_minus_hours = seconds_to_minutes-(60*minutes_to_hours);//166.65-(60*2) = 46.65 mins
		
		//Takes the secondsTotal value and subtracts the minutes as a seconds value and the hours as a seconds value to get the leftover seconds.
		int seconds_minus_minutes_and_hours = secondTotal - (60*minutes_minus_hours) - (3600*minutes_to_hours);
	
		//converts the hours into a var that is easier to type and use in final sysout
		int hours = minutes_to_hours; //2.7775 hours = 2 hours 
		
		//converts the minutes into a var that is easier to type and use in the final sysout
		int minutes = minutes_minus_hours; //46.64 mins = 46 mins

		//converts the seconds into a var that is easier to type and use in the final sysout
		int seconds = seconds_minus_minutes_and_hours;
		
		
		System.out.println("Your given amount of seconds amounts to: " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
	}

}
//Made by Tanuj Gaikwad