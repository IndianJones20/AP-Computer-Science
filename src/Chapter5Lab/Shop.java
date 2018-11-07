package Chapter5Lab;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
	public static void main(String[] args)
	{
		// NO ITEM CLASS, EVEN IN PREVIOUS LABS
		Item item;
		String itemName;
		double itemPrice;
		int quantity;

		ArrayList<String> cart = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
		do
		{
			System.out.print("Enter the name of the item: ");
			itemName = scan.next();
			itemName = scan.next();
			System.out.print("Enter the unit price: ");
			itemPrice = scan.nextDouble();
			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();
			item = new Item();

			item.setItemName(itemName);
			item.setPrice(itemPrice);
			item.setQuantity(quantity);
			// *** create a new item and add it to the cart
			System.out.println("Item Name: " + item.getItemName());
			System.out.println("Item Price: " + item.getItemPrice());
			System.out.println("Item Quantity: " + item.getItemQuantity());
			// *** print the contents of the cart object using println
			System.out.print("Continue shopping (y/n)? ");
			keepShopping = scan.next();
		} while (keepShopping.equals("y"));
	}
}