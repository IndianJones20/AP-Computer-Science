package Chapter9Projects;

public class Number3Books extends Number3Reads
{
	public String toString()
	{
		return super.toString() + "\nBut more specifically, I am a book\n";
	}

	public String getPages()
	{
		return "\nThis book has 225 pages";
	}

	public String getProtagonist()
	{
		return "\nThe protagonist of this story is Slata";
	}
}
