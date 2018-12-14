package Chapter8Projects;

import java.util.ArrayList;

public class Number8
{
	public static void main(String[] args)
	{
		Number8Methods[] zip = new Number8Methods[25];
		Number8Methods personAndZip = null;

		ArrayList<String> Addresses = new ArrayList<String>();
		ArrayList<String> Cities = new ArrayList<String>();
		ArrayList<String> States = new ArrayList<String>();
		ArrayList<Long> numbers = new ArrayList<Long>();

		int addressCounter = 0, citiesCounter = 0, statesCounter = 0, phoneNumCounter = 0;

		for (int index = 0; index < 25; index++)
		{
			personAndZip = new Number8Methods();
			zip[index] = personAndZip;
		}

		for (int index2 = 0; index2 < zip.length; index2++)
			System.out.println(zip[index2]);

		Addresses.add(addressCounter, "552 Smithbridge Rd");
		addressCounter++;

		Cities.add(citiesCounter, "Glen Mills");
		citiesCounter++;

		States.add(statesCounter, "PA");
		statesCounter++;

		numbers.add(phoneNumCounter, (long) 7728583);
		phoneNumCounter++;

		System.out.println(Addresses.get(0) + ", " + Cities.get(0) + " " + States.get(0));
		System.out.println("Phone Number: " + numbers.get(0));

	}
}
