package Chapter4Lab;

import java.util.Scanner;

public class NameTest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name (press enter after each): ");
		String first1 = scan.nextLine();
		String middle1 = scan.nextLine();
		String last1 = scan.nextLine();

		Name person1 = new Name(first1, middle1, last1);

		System.out.println(person1.firstMiddleLast());
		System.out.println(person1.lastMiddleFirst());
		System.out.println(person1.initials());
		System.out.println(person1.length());
		
		
		System.out.println("Enter someone elses name (press enter after each): ");
		String first2 = scan.nextLine();
		String middle2 = scan.nextLine();
		String last2 = scan.nextLine();

		Name person2 = new Name(first2, middle2, last2);

		System.out.println(person2.firstMiddleLast());
		System.out.println(person2.lastMiddleFirst());
		System.out.println(person2.initials());
		System.out.println(person2.length());
		
		System.out.println("The names are equal: " + person1.equals(person2.firstMiddleLast()));
	}

}
//Made by Tanuj Gaikwad