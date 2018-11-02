package Chapter4Projects;

public class Number7
{
	String bookTitle;
	String bookAuthor;
	String bookPub;
	int bookCopyright;

	public Number7(String title, String author, String pub, int copyrightYear)
	{
		bookTitle = title;
		bookAuthor = author;
		bookPub = pub;
		bookCopyright = copyrightYear;
	}
	public void setTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}

	public String getTitle()
	{
		return bookTitle;
	}

	public void setAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}

	public String getAuthor()
	{
		return bookAuthor;
	}

	public void setPub(String bookPub)
	{
		this.bookPub = bookPub;
	}

	public String getPub()
	{
		return bookPub;
	}

	public void setCopyright(int bookCopyright)
	{
		this.bookCopyright = bookCopyright;
	}

	public int getCopyright()
	{
		return bookCopyright;
	}

	public String toString()
	{
		return "Book: " + bookTitle + " by " + bookAuthor + "\nPublished by " + bookPub + " and copyrighted in "
				+ bookCopyright;
	}
}
//Made by Tanuj Gaikwad