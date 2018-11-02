package Chapter4Projects;

public class Number6
{
	int boxHeight;
	int boxWidth;
	int boxLength;
	boolean full = false;

	public Number6(int height, int width, int length)
	{
		boxHeight = height;
		boxWidth = width;
		boxLength = length;
	}

	public int getHeight()
	{
		return boxHeight;
	}

	public void setHeight(int boxHeight)
	{
		this.boxHeight = boxHeight;
	}

	public int getWidth()
	{
		return boxWidth;
	}

	public void setWidth(int boxWidth)
	{
		this.boxWidth = boxWidth;
	}

	public int getLength()
	{
		return boxLength;
	}

	public void setLength(int boxLength)
	{
		this.boxLength = boxLength;
	}

	public void setFull(boolean full)
	{
		this.full = full;
	}

	public boolean getFull()
	{
		return full;
	}

	public String toString()
	{
		return "Box Specs: " + boxLength + " x " + boxWidth + " x " + boxHeight;
	}
}
//Made by Tanuj Gaikwad