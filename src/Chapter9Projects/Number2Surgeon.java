package Chapter9Projects;

public class Number2Surgeon extends Number2MD
{
	public String toString()
	{
		return "I am a Surgeon\nReady to cater to your surgery needs";
	}

	public void surgery()
	{
		System.out.println("PINGING THE SURGEON.....");
		System.out.println("I'm Going In!!");
		super.surgery();
	}

	public void checkUp()
	{
		System.out.println("PINGING THE SURGEON.....");
		System.out.println("I'm Going In!!");
		super.checkUp();
	}
}
