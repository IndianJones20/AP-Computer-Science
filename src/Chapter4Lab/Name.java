package Chapter4Lab;

public class Name
{
	String first;
	String middle;
	String last;

	public Name(String firstName, String middleName, String lastName)
	{
		first = firstName;
		middle = middleName;
		last = lastName;
	}

	public String getFirst()
	{
		return first;
	}

	public void setFirst(String firstName)
	{
		this.first = firstName;
	}

	public String getMiddle()
	{
		return middle;
	}

	public void setMiddle(String middleName)
	{
		this.middle = middleName;
	}

	public String getLast()
	{
		return last;
	}

	public void setLast(String lastName)
	{
		this.last = lastName;
	}

	public String firstMiddleLast()
	{
		return first + " " + middle + " " + last;
	}

	public String lastMiddleFirst()
	{
		return last + " " + middle + " " + first;
	}

	public boolean equals(String otherName)
	{
		String name = firstMiddleLast().toLowerCase();
		return name.equals(otherName.toLowerCase());
	}

	public String initials()
	{
		return "" + first.charAt(0) + middle.charAt(0) + last.charAt(0);
	}

	public int length()
	{
		return first.length() + middle.length() + last.length();
	}

}
//Made by Tanuj Gaikwad