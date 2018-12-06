package Chapter7Lab;

import java.util.Scanner;

public class Comparisons
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String u1, u2, u3;

		compare3 largeBoi = new compare3();

		System.out.println("Enter 3 strings");
		System.out.print("String 1: ");
		u1 = scan.nextLine();

		System.out.print("String 2: ");
		u2 = scan.nextLine();

		System.out.print("String 3: ");
		u3 = scan.nextLine();

		System.out.println();

		System.out.println(largeBoi.largest(u1, u2, u3));

		int u4, u5, u6;

		System.out.println("Enter 3 Integers");
		System.out.print("Int 1: ");
		u4 = scan.nextInt();

		System.out.print("Int 2: ");
		u5 = scan.nextInt();

		System.out.print("Int 3: ");
		u6 = scan.nextInt();

		System.out.println(largeBoi.largest(u4, u5, u6));

	}

}
