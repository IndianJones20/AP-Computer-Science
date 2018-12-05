package Chapter7Lab;

import java.util.Random;

public class SecondAccount
{

	private double balance;
	private String name;
	private long acctNum;
	private static int numAccounts = 0;
	Random rand = new Random();

	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------
	public SecondAccount(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}

	public SecondAccount(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
		if (acctNum < 0)
		{
			acctNum = acctNum / -1;
		}
		numAccounts++;
	}

	public SecondAccount(String owner)
	{
		name = owner;
		balance = 0;
		acctNum = rand.nextLong();
		if (acctNum < 0)
		{
			acctNum = acctNum / -1;
		}
		numAccounts++;
	}

	// -------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// -------------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	public void withdraw(double amount, double fee)
	{
		if (balance >= (amount + fee))
			balance -= (amount + fee);
		else
			System.out.println("Insufficient funds");
	}

	// -------------------------------------------------
	// Adds deposit amount to balance.
	// -------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}

	// -------------------------------------------------
	// Returns balance.
	// -------------------------------------------------
	public double getBalance()
	{
		return balance;
	}

	// -------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// -------------------------------------------------
	public String toString()
	{
		return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;

	}

	public static int getNumAccounts()
	{
		return numAccounts;
	}

	public void close()
	{
		name = "CLOSED";
		balance = 0;
		numAccounts--;
	}

	public String getName()
	{
		return name;
	}

	public long getAcctNum()
	{
		return acctNum;
	}

	public static SecondAccount consolidate(SecondAccount acct1, SecondAccount acct2)
	{
		if (acct1.getAcctNum() == acct2.getAcctNum())
		{
			System.out.println("Nice Try Hacker");
			return new SecondAccount("Nice Try Hacker");
		}

		else if (acct1.getName().equals(acct2.getName()))
		{
			System.out.println();
			return new SecondAccount((acct1.getBalance() + acct1.getBalance()), acct1.getName());
		}

		else
		{
			System.out.println();
			return new SecondAccount((acct1.getBalance() + acct1.getBalance()), "Defaulty Boi");
		}
	}
}
