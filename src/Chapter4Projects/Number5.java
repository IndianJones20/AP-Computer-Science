package Chapter4Projects;

public class Number5
{

	String carMake;
	String carModel;
	int carYear;

	public Number5(String make, String model, int year)
	{
		carMake = make;
		carModel = model;
		carYear = year;
	}

	public void setMake(String make)
	{
		this.carMake = make;
	}

	public String getMake()
	{
		return carMake;
	}

	public void setModel(String model)
	{
		this.carModel = model;
	}

	public String getModel()
	{
		return carModel;
	}

	public void setYear(int year)
	{
		this.carYear = year;
	}

	public int getYear()
	{
		return carYear;
	}

	public String toString()
	{
		return "Car: " + carYear + " " + carMake + " " + carModel;

	}

	public boolean isAntique()
	{
		if ((2018 - carYear) > 45)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
//Made by Tanuj Gaikwad