package MagPie;

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */

public class Magpie2
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().indexOf("no") >= 0)
		{
			response = "Why u gotta be so rude?";
		}

		// Family
		else if (statement.trim().indexOf("mother") >= 0 || statement.trim().indexOf("father") >= 0
				|| statement.trim().indexOf("sister") >= 0)
		{
			response = "Tell me more about your family.";
		}

		// Brothers
		else if (statement.trim().indexOf("brother") >= 0)
		{
			response = "Broda, do u know de wae?";
		}
		// cats
		else if (statement.trim().indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		// Dogs
		else if (statement.trim().indexOf("dog") >= 0)
		{
			response = "*Gasps* Doggo!";
		}

		// Male Teachers
		else if (statement.trim().indexOf("Mr.") >= 0 || statement.trim().indexOf("mr.") >= 0)
		{
			response = "He sounds like a nice teacher.";
		}

		// Female teachers
		else if (statement.trim().indexOf("Mrs.") >= 0 || statement.trim().indexOf("Ms.") >= 0
				|| statement.trim().indexOf("Miss") >= 0 || statement.trim().indexOf("mrs.") >= 0
				|| statement.trim().indexOf("ms.") >= 0 || statement.trim().indexOf("miss") >= 0)
		{
			response = "She sounds like a good teacher";
		}

		// Blank Input
		else if (statement.trim().equals(""))
		{
			response = "Say something please";
		}

		// Random Response
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1)
		{
			response = "Hmmm.";
		} else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		} else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "If only";
		} else if (whichResponse == 5)
		{
			response = "I don't know, maybe?";
		}
		return response;
	}
}
//Made by Tanuj Gaikwad