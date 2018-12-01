package Chapter7Projects;

public class Number1
{

	public static void main(String[] args)
	{
		Number1Methods acct1 = new Number1Methods();
		Number1Methods acct2 = new Number1Methods();
		Number1Methods acct3 = new Number1Methods();

		acct1.createAccount("Ted Murphy");
		acct1.printAcctNum();
		acct2.createAccount("Jane Smith");
		acct2.printAcctNum();

	while(true)
	{
	
		acct1.login(“Ted Murphy”, acct1.printAcctNum())
//		acct1.deposit(25.85);
//		acct2.deposit(235.63);
		
//		double smithBalance = acct2.deposit(500.00);
//		System.out.println("Smith balance after deposit: " + smithBalance);

//		System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
//		acct1.addInterest();
//		acct2.addInterest();
//		acct3.addInterest();

//		System.out.println();
//		System.out.println(acct1);
//		System.out.println(acct2);
//		System.out.println(acct3);

	}

}
