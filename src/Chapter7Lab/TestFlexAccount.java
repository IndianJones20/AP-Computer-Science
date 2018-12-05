package Chapter7Lab;

import java.util.Scanner;

public class TestFlexAccount
{
	public static void main(String[] args)
	{
		String name;
		double balance;
		long acctNum;
		FlexAccount acct;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Account holder's first name");
		name = scan.next();

		acct = new FlexAccount(name);
		System.out.println("Account for " + name + ":");
		System.out.println(acct);

		System.out.println("\nEnter initial balance");
		balance = scan.nextDouble();
		acct = new FlexAccount(balance, name);
		System.out.println("Account for " + name + ":");
		System.out.println(acct);

		System.out.println("\nEnter Account number");
		acctNum = scan.nextLong();
		acct = new FlexAccount(balance, name, acctNum);
		System.out.println("Account for " + name + ":");
		System.out.println(acct);

		System.out.print("\nDepositing 100 into account, balance is now ");
		acct.deposit(100);
		System.out.println(acct.getBalance());
		System.out.print("\nWithdrawing $25, balance is now ");
		acct.withdraw(25);
		System.out.println(acct.getBalance());
		System.out.print("\nWithdrawing $25 with $2 fee, balance is now ");
		acct.withdraw(25, 2);
		System.out.println(acct.getBalance());

		System.out.println("\nBye!");
	}

}
