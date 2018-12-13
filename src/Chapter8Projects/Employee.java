package Chapter8Projects;

import java.util.ArrayList;
import java.util.Random;

public class Employee
{
	String name;
	long acctNum;
	double initial;

	Random rand = new Random();

	public Employee(double balance)
	{
		name = randName();
		acctNum = randAcctNum();
		initial = balance;
	}

	public String randName()
	{
		String name = "";
		ArrayList<String> randNames = new ArrayList<String>();

		randNames.add(0, "Luigi");
		randNames.add(1, "Quentin");
		randNames.add(2, "Max");
		randNames.add(3, "Susie");
		randNames.add(4, "Anastasia");

		int index = rand.nextInt(4);
		name = randNames.get(index);
		return name;
	}

	public long randAcctNum()
	{
		acctNum = rand.nextInt(899) + 100;

		return acctNum;
	}

	public void withdraw(double amount)
	{
		if (initial >= amount)
		{
			initial -= amount;
		} else
		{
			System.out.println("Insufficient Funds");
		}
	}

	public void deposit(double amount)
	{
		initial += amount;
	}

	public double getBalance()
	{
		return initial;
	}

	public void chargeFee()
	{
		initial -= 10;
	}

	public void changeName(String newName)
	{
		name = newName;
	}

	public String toString()
	{
		return "Account User: " + name + "\nAccount Num: " + acctNum + "\nBalance: " + initial + "\n";
	}
}
