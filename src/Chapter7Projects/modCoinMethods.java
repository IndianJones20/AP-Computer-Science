package Chapter7Projects;

public class modCoinMethods extends LockableMethods
{

	private final int HEADS = 0, TAILS = 1;

	private int face;

	public modCoinMethods()
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
		if (face == HEADS)
		{
			faceName = "Heads";
		} else
			faceName = "Tails";

		return faceName;
	}
}
