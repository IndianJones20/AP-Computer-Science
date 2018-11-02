package Chapter2Lab;

//************************************************************
//PlusTest.java
//
//Demonstrate the different behaviors of the + operator
//************************************************************
public class PlusTest
{
	// -------------------------------------------------
	// main prints some expressions using the + operator
	// -------------------------------------------------
	public static void main(String[] args)
	{
		System.out.println("This is a long string that is the " + "concatenation of two shorter strings.");
		System.out.println("The first computer was invented aboutv" + 55 + " years ago."); // This sentence is too
																							// scrunched up. The way to
																							// fix this is to add a
																							// space.
		System.out.println("8 plus 5 is " + 8 + 5); // Output: 8 plus 5 is 85. The computer printed this out because the
													// addition of the 8 and 5 became a concatenation as there were no
													// parentheses. Hence the output was 85
		System.out.println("8 plus 5 is " + (8 + 5)); // Output: 8 plus 5 is 13. The computer printed this out because
														// the addition of the 8 and 5 was actually addition because
														// there are parentheses to indicate so.
		System.out.println(8 + 5 + " equals 8 plus 5."); // Output: 13 equals 8 plus 5. The computer printed this out
															// because the addition of 8 and 5 came first so the system
															// was able to do that calculation first and then print the
															// statement afterward.

		// My own + program
		System.out.println("Ten robins plus " + 13 + " canaries is " + 23 + " birds.");

	}
}
//Made by Tanuj Gaikwad