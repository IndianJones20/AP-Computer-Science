package Chapter7Lab;

import java.util.Scanner;

public class TestAccount1
{
	public static void main(String[] args)
	{
		SecondAccount acct1, acct2, acct3;
		String name1, name2, name3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Account Name 1: ");
		name1 = scan.nextLine();

		System.out.println("Enter Account Name 2: ");
		name2 = scan.nextLine();

		System.out.println("Enter Account Name 3: ");
		name3 = scan.nextLine();

		System.out.println();

		acct1 = new SecondAccount(100, name1);
		acct2 = new SecondAccount(100, name2);
		acct3 = new SecondAccount(100, name3);

		acct1.close();
		System.out.println(acct1);

		acct2.consolidate(acct2, acct3);

		System.out.println(acct2);
	}
}