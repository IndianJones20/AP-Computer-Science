package Chapter9Projects;

public class Number1
{
	public static void main(String[] args)
	{
		int totalValue = 0;

		Number1Methods penny = new Number1Methods();
		Number1Methods quarter = new Number1Methods();
		Number1Methods halfDollar = new Number1Methods();
		Number1Methods dime = new Number1Methods();
		Number1Methods nickel = new Number1Methods();

		penny.setValue(1);
		quarter.setValue(25);
		halfDollar.setValue(50);
		dime.setValue(10);
		nickel.setValue(5);

		penny.flip();
		dime.flip();
		halfDollar.flip();

		System.out.println(penny.getValue());
		totalValue += penny.getValue();
		totalValue += quarter.getValue();
		totalValue += halfDollar.getValue();
		totalValue += nickel.getValue();
		totalValue += dime.getValue();

		System.out.println(totalValue);

	}
}
