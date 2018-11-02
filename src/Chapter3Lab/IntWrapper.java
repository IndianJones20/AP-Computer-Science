package Chapter3Lab;

import java.util.Scanner;

public class IntWrapper
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// 1
		Integer userValue1;

		System.out.print("Enter a value: ");
		userValue1 = scan.nextInt();

		System.out.println(Integer.toBinaryString(userValue1));
		System.out.println(Integer.toOctalString(userValue1));
		System.out.println(Integer.toHexString(userValue1));
		
		// 2
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// 3
		String deciInt1;
		String deciInt2;

		System.out.println("Enter two integers: ");
		deciInt1 = scan.next();
		deciInt2 = scan.next();

		Integer deciInt1Int = new Integer(deciInt1);
		Integer deciInt2Int = new Integer(deciInt2);

		System.out.println(deciInt1Int + deciInt2Int);
	}

}
//Made by Tanuj Gaikwad