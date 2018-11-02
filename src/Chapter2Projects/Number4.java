package Chapter2Projects;

import java.util.Scanner;

public class Number4
{
	public static void main(String[] args)
	{
		String name;
		int age;
		String college;
		String petname;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Please enter your school or college name: ");
		college = scan.nextLine();
		
		System.out.print("Please enter your pet's name: ");
		petname = scan.nextLine();
		
		System.out.print("Please enter your age: ");
		age = scan.nextInt();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + college + ", though I miss my pet " + petname + " very much!");
	}

}
//Made by Tanuj Gaikwad