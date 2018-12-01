package Chapter7Projects;

import java.text.NumberFormat;
import java.util.Random;

public class Number1Methods
{
	Random rand = new Random();
	public final double RATE = 0.035;

	private long acctNumber;
	private double balance;
	private String name;

	public Number1Methods()
	{

	}

	public boolean login(String acctUName, long acctNum)
	{
		if (acctUName.equals(name) && acctNum == acctNumber)
		{
			this.toString();
			return true;
		} else
		{
			return false;
		}

	}
	public void createAccount(String Name)
	{
		name = Name;
		acctNumber = rand.nextInt(99999) + 10000;
	}

	public double deposit(double amount)
	{
		balance += amount;
		return balance;
	}

	public double withdraw(double amount, double fee)
	{
		balance = balance - amount - fee;
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
