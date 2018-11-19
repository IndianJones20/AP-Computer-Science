package Chapter6Projects;

import java.util.ArrayList;

public class Number10
{
	public static void main(String[] args)
	{
		int christDay = 1, counter = 0;
		ArrayList<String> days = new ArrayList<String>();
		String drummers = "Twelve Drummers drumming";
		String pipers = "Eleven Pipers piping";
		String lords = "Ten Lords a-leaping";
		String ladies = "Nine Ladies Dancing";
		String maids = "Eight Maids a-milking";
		String swans = "Seven Swans a-swimming";
		String geese = "Six Geese a-laying";
		String rings = "Five golden rings";
		String birds = "Four calling birds";
		String hens = "Three french hens";
		String doves = "Two turtle doves, and";
		String partridge = "A partridge in a pear tree.";

		days.add(0, partridge);
		days.add(1, doves);
		days.add(2, hens);
		days.add(3, birds);
		days.add(4, rings);
		days.add(5, geese);
		days.add(6, swans);
		days.add(7, maids);
		days.add(8, ladies);
		days.add(9, lords);
		days.add(10, pipers);
		days.add(11, drummers);

		while (christDay <= 12)
		{
			switch (christDay)
			{
			case 1:
				System.out.println("On the 1st day of christmas, my true love gave to me");
				break;
			case 2:
				System.out.println("On the 2nd day of christmas, my true love gave to me");
				break;
			case 3:
				System.out.println("On the 3rd day of christmas, my true love gave to me");
				break;
			case 4:
				System.out.println("On the 4th day of christmas, my true love gave to me");
				break;
			case 5:
				System.out.println("On the 5th day of christmas, my true love gave to me");
				break;
			case 6:
				System.out.println("On the 6th day of christmas, my true love gave to me");
				break;
			case 7:
				System.out.println("On the 7th day of christmas, my true love gave to me");
				break;
			case 8:
				System.out.println("On the 8th day of christmas, my true love gave to me");
				break;
			case 9:
				System.out.println("On the 9th day of christmas, my true love gave to me");
				break;
			case 10:
				System.out.println("On the 10th day of christmas, my true love gave to me");
				break;
			case 11:
				System.out.println("On the 11th day of christmas, my true love gave to me");
				break;
			case 12:
				System.out.println("On the 12th day of christmas, my true love gave to me");
				break;
			}

			counter = christDay;
			while (counter > 0)
			{
				System.out.println(days.get(counter - 1));
				counter--;
			}
			System.out.println();

			christDay++;
		}
	}
}
