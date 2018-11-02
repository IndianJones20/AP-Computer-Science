package Chapter4Projects;

public class Number4
{
	String dogName;
	int dogAge;
	int dogToPerson;

	Number4(String name, int age)
	{
		dogName = name;
		dogAge = age;
	}

	public void setName(String dogName)
	{
		this.dogName = dogName;
	}

	public String getName()
	{
		return dogName;
	}

	public void setAge(int dogAge)
	{
		this.dogAge = dogAge;
	}

	public int getAge()
	{
		return dogAge;
	}

	public void setPersonyears()
	{
		this.dogToPerson = ((dogAge * 7));
	}

	public int getPersonyears()
	{
		return dogToPerson;
	}
}
//Made by Tanuj Gaikwad