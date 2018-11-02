package Chapter4Lab;

import java.util.Scanner;

public class Student
{
	String name;
	private int grade1, grade2;

	public Student(String studentName)
	{
		name = studentName;
	}

	public void inputGrades()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first test grade: ");
		grade1 = scan.nextInt();

		System.out.println("Enter your second test grade: ");
		grade2 = scan.nextInt();
	}

	public double getAverage()
	{
		return ((double) (grade1 + grade2) / 2);
	}

	public void getName()
	{
		System.out.println(name);
	}

	public String toString()
	{
		return "Name: " + name + "\t" + "Test grade 1: " + grade1 + "\tTest grade 2: " + grade2;
	}
}
//Made by Tanuj Gaikwad