package Chapter5Projects;

import java.io.IOException;
import java.util.Scanner;

public class Number3
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);

		String length;
		int odd = 0;
		int even = 0;
		int zero = 0;

		System.out.println("Enter an integer: ");
		length = scan.nextLine();

		int index_MAX = length.length();

		int startIndex = 0;

		while (startIndex < index_MAX)
		{
			if (length.charAt(startIndex) % 2 != 0)
			{
				odd++;
			}

			if (length.charAt(startIndex) % 2 == 0 && length.charAt(startIndex) != 48)
			{
				even++;
			}

			if (length.charAt(startIndex) == 48)
			{
				zero++;
			}

			startIndex++;
		}

		System.out.println("Odd: " + odd);
		System.out.println("Even: " + even);
		System.out.println("Zero: " + zero);
	}
}
