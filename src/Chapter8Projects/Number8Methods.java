package Chapter8Projects;

import java.util.ArrayList;
import java.util.Random;

public class Number8Methods
{
	String firstName, lastName;
	int index, postalCode;
	Random rand = new Random();

	public Number8Methods()
	{
		firstName = randFirstName();
		lastName = randLastName();
		postalCode = randZip();
	}

	public String randFirstName()
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

	public String randLastName()
	{
		String name = "";
		ArrayList<String> randNames = new ArrayList<String>();

		randNames.add(0, "Rich");
		randNames.add(1, "Chou");
		randNames.add(2, "Maxson");
		randNames.add(3, "Usdan");
		randNames.add(4, "Thomas");

		int index = rand.nextInt(4);
		name = randNames.get(index);
		return name;
	}

	public int randZip()
	{
		int zipCode;
		zipCode = rand.nextInt(89999) + 10000;
		return zipCode;
	}

	public String toString()
	{
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nZip Code: " + postalCode + "\n";
	}
}
