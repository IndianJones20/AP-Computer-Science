package Chapter5Projects;

public class Number9
{
	private final int MAX = 6;

	private int faceValue;

	public Number9()
	{
		faceValue = 1;
	}

	public int roll()
	{
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}

	public void setFaceValue(int value)
	{
		if (value <= MAX && value >= 1)
		faceValue = value;
		else
			faceValue = 1;
	}

	public int getFaceValue()
	{
		return faceValue;
	}

	public String toString()
	{
		String result = Integer.toString(faceValue);
		return result;
	}
}
