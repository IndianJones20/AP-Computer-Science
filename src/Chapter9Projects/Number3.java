package Chapter9Projects;

public class Number3
{

	public static void main(String[] args)
	{
		Number3Books book1 = new Number3Books();

		System.out.println(book1);

		Number3Textbook tbook1 = new Number3Textbook();

		System.out.println(tbook1);

		System.out.println(book1.getPages());

		System.out.println(tbook1.getPages());
	}

}
