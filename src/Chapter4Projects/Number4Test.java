package Chapter4Projects;

public class Number4Test
{

	public static void main(String[] args)
	{
		Number4 dog1, dog2, dog3, dog4;

		dog1 = new Number4("Hodge", 32);
		dog1.setName("Sally");
		dog1.setAge(37);
		dog1.setPersonyears();
		System.out.println("Dog Name: " + dog1.getName() + "\nDog Age: " + dog1.getAge() + "\nDog Age in Human Years: "
				+ dog1.getPersonyears() + "\n");

		dog2 = new Number4("Ryan", 24);
		dog2.setName("Princess");
		dog2.setAge(37);
		dog2.setPersonyears();
		System.out.println("Dog Name: " + dog2.getName() + "\nDog Age: " + dog2.getAge() + "\nDog Age in Human Years: "
				+ dog2.getPersonyears() + "\n");

		dog3 = new Number4("Bucko", 13);
		dog3.setName("Ripjaw");
		dog3.setAge(37);
		dog3.setPersonyears();
		System.out.println("Dog Name: " + dog3.getName() + "\nDog Age: " + dog3.getAge() + "\nDog Age in Human Years: "
				+ dog3.getPersonyears() + "\n");

		dog4 = new Number4("Buddy", 24);
		dog4.setName("Slasher");
		dog4.setAge(37);
		dog4.setPersonyears();
		System.out.println("Dog Name: " + dog4.getName() + "\nDog Age: " + dog4.getAge() + "\nDog Age in Human Years: "
				+ dog4.getPersonyears() + "\n");

	}

}
//Made by Tanuj Gaikwad