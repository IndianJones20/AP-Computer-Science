package Chapter7Lab;

public class QuadrupleAccount
{
	private double balance;
	private String name;
	private long acctNum;

	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------
	public QuadrupleAccount(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
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
		return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance + "\n";
	}

	public void transfer(QuadrupleAccount acct, double amount)
	{
		this.withdraw(amount);
		acct.deposit(amount);
	}

	public long getAcctNumber()
	{
		return acctNum;
	}

	public static void transfer(QuadrupleAccount acct1, QuadrupleAccount acct2, double amount)
	{
		acct1.withdraw(amount);
		acct2.deposit(amount);
	}
}
