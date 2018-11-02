package Chapter4Projects;

public class Number5Test
{

	public static void main(String[] args)
	{
		Number5 car = new Number5("BMW", "328i", 2002);

		car.setMake("Tesla");
		car.setModel("Model S");
		car.setYear(2018);

		System.out.println(car);
		System.out.println("The car is an antique: " + car.isAntique());
	}

}
//Made by Tanuj Gaikwad