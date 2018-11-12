package Chapter6Projects;

public class Number6Methods
{
	private final int HEADS = 0, TAILS = 1;

	private int face;

	public Number6Methods()
	{
		flip();
	}

	public void flip()
	{
		face = (int) (Math.random() * 2);
	}

	public boolean isHeads()
	{
		return (face == HEADS);
	}

	public String toString()
	{
		String faceName;
		if(face == HEADS)
		{
			faceName = "Heads";
		}
		else
			faceName = "Tails";

		return faceName;
	}
}
