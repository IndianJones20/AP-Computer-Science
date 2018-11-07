package Chapter5Lab;

public class Item
{
	private String itemName;
	private double itemPrice, priceCounter = 0.0;
	private int itemQuantity, nameCounter = 0, quantityCounter = 0;

	public void setPrice(double price)
	{
		itemPrice = price;
		priceCounter += price;
	}

	public void setItemName(String name)
	{
		itemName = name;
		nameCounter++;
	}

	public void setQuantity(int quantity)
	{
		itemQuantity = quantity;
		quantityCounter += quantity;
	}

	public String getItemName()
	{
		return itemName;
	}

	public double getItemPrice()
	{
		return itemPrice;
	}

	public int getItemQuantity()
	{
		return itemQuantity;
	}

	public double getTotalPrice()
	{
		return priceCounter;
	}

	public int getTotalNumOfBrands()
	{
		return nameCounter;
	}

	public int getTotalQuantity()
	{
		return quantityCounter;
	}

}
