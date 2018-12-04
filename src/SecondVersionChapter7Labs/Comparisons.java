package SecondVersionChapter7Labs;

import java.util.Scanner;

public class Comparisons
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String u1, u2, u3;

		Compare3 largeBoi = new Compare3();

		System.out.println("Enter 3 strings");
		System.out.print("String 1: ");
		u1 = scan.nextLine();

		System.out.print("String 2: ");
		u2 = scan.nextLine();

		System.out.print("String 3: ");
		u3 = scan.nextLine();

		System.out.println();

		System.out.println(largeBoi.largest(u1, u2, u3));
	}

}
