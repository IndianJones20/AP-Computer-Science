package Chapter5Lab;

public class Item
{
	private String itemName;
	private double itemPrice;
	private int itemQuantity;

	public void setPrice(double price)
	{
		itemPrice = price;
	}

	public void setItemName(String name)
	{
		itemName = name;
	}

	public void setQuantity(int quantity)
	{
		itemQuantity = quantity;
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

}
