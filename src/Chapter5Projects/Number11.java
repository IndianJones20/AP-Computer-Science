package Chapter5Projects;

public class Number11
{
	private final int MAX = 6;

	private int faceValue1, faceValue2;

	public Number11()
	{
		faceValue1 = 4;
		faceValue2 = 4;
	}


	public void roll()
	{
		faceValue1 = (int) (Math.random() * MAX) + 1;
		faceValue2 = (int) (Math.random() * MAX) + 1;
	}

	public int getFaceValue1()
	{
		return faceValue1;
	}

	public int getFaceValue2()
	{
		return faceValue2;
	}
	public String toString()
	{
		String result = "------------------------------------\nDie 1: " + faceValue1 + ", Die 2: " + faceValue2
				+ "\n------------------------------------";
		return result;
	}

	public void setFaceValue1(int i)
	{
		faceValue1 = i;
	}

	public void setFaceValue2(int i)
	{
		faceValue2 = i;
	}
}
