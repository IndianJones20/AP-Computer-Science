package Chapter9Projects;

public class Number1Methods extends Chapter6Projects.Number6Methods
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	int value = 0;

	private int coinFace;

	public Number1Methods()
	{
		super.flip();
	}

	public void setValue(int coinValue)
	{
		value = coinValue;
	}

	public int getValue()
	{
		return value;
	}

}
