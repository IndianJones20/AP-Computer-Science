package Chapter4Projects;

public class Number7Test
{

	public static void main(String[] args)
	{
		Number7 book = new Number7("The Art of War", "Sun Tzu", "Sun Tzu", 500);

		book.setTitle("Harry Potter and the Sorcerer's Stone");
		book.setAuthor("J.K. Rowling");
		book.setPub("Bloomsbury");
		book.setCopyright(1999);

		System.out.println(book);
	}

}
//Made by Tanuj Gaikwad