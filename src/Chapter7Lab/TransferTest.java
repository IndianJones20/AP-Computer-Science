package Chapter7Lab;

import java.util.Scanner;

public class TransferTest
{
	public static void main(String[] args)
	{
		String keepGoing = "y", action;
		long acctNumber;
		double amount;

		Scanner scan = new Scanner(System.in);

		QuadrupleAccount acct1 = new QuadrupleAccount(200, "Josh", 123);
		QuadrupleAccount acct2 = new QuadrupleAccount(200, "Tanuj", 456);
		QuadrupleAccount acct3 = new QuadrupleAccount(200, "Hayden", 789);

		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		System.out.println(acct3.toString());

		while (keepGoing.equals("Y") || keepGoing.equals("y"))
		{
			System.out.println("Account Transferring From? (Enter Account Number)");
			acctNumber = scan.nextLong();

			// Transfer FROM acct1
			if (acctNumber == 123)
			{
				System.out.println("Account Transferring to? (Accout Number)");
				acctNumber = scan.nextLong();

				// Transfer TO acct2
				if (acctNumber == 456)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct1, acct2, amount);
				}

				// Transfer TO acct3
				else if (acctNumber == 789)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct1, acct3, amount);
				}
			}

			// Transfer FROM acct2
			else if (acctNumber == 456)
			{
				System.out.println("Account Transferring to? (Accout Number)");
				acctNumber = scan.nextLong();

				// Transfer TO acct1
				if (acctNumber == 123)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct2, acct1, amount);
				}

				// Transfer TO acct3
				else if (acctNumber == 789)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct2, acct3, amount);
				}
			}

			// Tansfer FROM acct3
			else if (acctNumber == 789)
			{
				System.out.println("Account Transferring to? (Accout Number)");
				acctNumber = scan.nextLong();

				// Transfer TO acct1
				if (acctNumber == 123)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct3, acct1, amount);
				}

				// Transfer TO acct2
				else if (acctNumber == 456)
				{
					System.out.println("How much do you want to transfer?\nCurrent Balance = " + acct1.getBalance());
					amount = scan.nextDouble();

					QuadrupleAccount.transfer(acct3, acct2, amount);
				}
			}

			System.out.print("\nMore transactions? (y/n)");
			keepGoing = scan.next();
		}

		System.out.println("\nFINAL---------------\n");
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		System.out.println(acct3.toString());
		System.out.println("--------------------");
	}
}
