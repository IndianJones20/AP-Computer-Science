package Chapter5Projects;

public class Number10Test
{

	public static void main(String[] args)
	{
		Number10 acct1 = new Number10("Ted Murphy", 72354, 102.56);
		Number10 acct2 = new Number10("Jane Smith", 69713, 40.00);
		Number10 acct3 = new Number10("Edward Demsey", 93757, 759.32);

		acct1.deposit(25.82);

		double smithBalance = acct2.deposit(500.00);
		System.out.println("Smith balance after deposit: " + smithBalance);

		System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));

		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();

		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
	}

}
