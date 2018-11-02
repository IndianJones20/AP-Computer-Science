package Chapter5Projects;

import java.text.NumberFormat;

public class Number10
{
	private final double RATE = 0.035;

	private long acctNumber;
	private double balance;
	private String name;

	public Number10(String owner, long account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public double deposit(double amount)
	{
		if (amount < 0)
			System.out.println(
					"You cannot deposit a negative amount, if you want to input a negative, then use a withdrawal");
		else
		{
			balance += amount;
		}
		return balance;
	}

	public double withdraw(double amount, double fee)
	{
		if (amount < balance)
		{
			balance = balance - amount - fee;
		}
		else
		{
			System.out.println("You're Withdrawing an amount bigger than your balance");
		}

		return balance;
	}

	public double addInterest()
	{
		balance += (balance * RATE);
		return balance;
	}

	public double getBalance()
	{
		return balance;
	}

	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}
