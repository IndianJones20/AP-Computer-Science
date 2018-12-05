package Chapter7Lab;

public class BiasedCoin
{
	private final int HEADS = 0;
	private final int TAILS = 1;
	private double bias;

	private double coinFace;

	public BiasedCoin()
	{
		bias = 0.5;
		flip();
	}

	public BiasedCoin(double Yeetbias)
	{
		bias = Yeetbias;
		flip();
	}

	public void flip()
	{
		coinFace = (Math.random());
		if (coinFace < bias)
		{
			coinFace = 0;
		}

		else
			coinFace = 1;
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
