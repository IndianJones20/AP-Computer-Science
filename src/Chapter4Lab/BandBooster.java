package Chapter4Lab;

public class BandBooster
{
	private String name;
	private int boxesSold = 0;

	public BandBooster(String sellerName)
	{
		name = sellerName;
	}

	public String getName()
	{
		return name;
	}

	public void updateScales(int moreCandy)
	{
		boxesSold += moreCandy;
	}

	public String toString()
	{
		return name + ":\t" + boxesSold + " boxes";
	}
}
//Made by Tanuj Gaikwad