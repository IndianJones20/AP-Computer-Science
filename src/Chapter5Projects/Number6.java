package Chapter5Projects;

public class Number6
{
	private final int HEADS = 0;
	private final int TAILS = 1;

	private int coinFace;

	public Number6()
	{
		flip();
	}

	public void flip()
	{
		coinFace = (int) (Math.random() * 2);
	}

	public boolean isHeads()
	{
		return (coinFace == HEADS);
	}

	public String toString()
	{
		String faceName;
		if (coinFace == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";

		return faceName;
	}

}
