package Chapter9Projects;

public class Number2Nurse extends Number2MD
{
	public String toString()
	{
		return "I am a Nurse\nReady to help @ a moment's notice";
	}

	public void surgery()
	{
		System.out.println("PINGING THE SURGEON.....");
		System.out.println("He's Going In!!");
		super.surgery();
	}

	public void checkUp()
	{
		System.out.println("PINGING THE NURSE.....");
		System.out.println("I'm Going In!!");
		super.checkUp();
	}
}
