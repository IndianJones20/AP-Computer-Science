package Chapter4Projects;

public class Number6Test
{

	public static void main(String[] args)
	{
		Number6 box = new Number6(20,15,30);
		box.setLength(60);
		box.setWidth(20);
		box.setHeight(50);
		box.setFull(false);

		// You can set it to full here if u want
		box.setFull(true);

		System.out.println(box);
		System.out.println("The box is full: " + box.getFull());
	}

}
//Made by Tanuj Gaikwad