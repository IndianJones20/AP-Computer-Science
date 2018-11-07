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
		double itemPrice, totalPrice = 0.0;
		int quantity, cartSize = 0, totalBrands = 0, totalQuantity = 0;
		boolean first = false;
		ArrayList<Item> cart = new ArrayList<Item>();

		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
		do
		{
			item = new Item();
			System.out.print("Enter the name of the item: ");
			itemName = scan.nextLine();
			if (first)
			{
				itemName = scan.nextLine();
			}
			System.out.print("Enter the unit price: ");
			itemPrice = scan.nextDouble();
			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();

			cart.add(item);

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
			first = true;
			System.out.println();
		} while (keepShopping.equals("y"));

		while (cartSize < cart.size())
		{
			totalBrands += cart.get(cartSize).getTotalNumOfBrands();
			totalQuantity += cart.get(cartSize).getTotalQuantity();
			totalPrice += cart.get(cartSize).getTotalPrice();
			cartSize++;
		}

		System.out.println("Total # of Brands in cart: " + totalBrands);
		System.out.println("Total quantity of items in cart: " + totalQuantity);
		System.out.println("Total price of items: " + totalPrice);
	}

}