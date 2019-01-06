package Chapter9Projects;

public class Number2Doctor extends Number2MD
{
	public String toString()
	{
		super.toString();
		return "I'm a Doctor, ready to help";
	}

	public void surgery()
	{
		System.out.println("PINGING THE DOCTOR.....");
		System.out.println("I'm Going In!!");
		super.surgery();
	}

	public void checkUp()
	{
		System.out.println("PINGING THE DOCTOR.....");
		System.out.println("I'm Going In!!");
		super.checkUp();
	}
}
