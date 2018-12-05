package Chapter6Projects;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Number24Panel extends JPanel
{
	public Number24Panel()
	{
		int again, left, right;
		String userPalindrome, pal;

		do
		{
			pal = JOptionPane.showInputDialog("Enter a palindrome: ");
			
			pal = pal.toLowerCase().trim();
			pal = pal.replace(" ", "");
			pal = pal.replace("'", "");
			pal = pal.replace(",", "");
			pal = pal.replace(";", "");

			left = 0;
			right = pal.length() - 1;



			while (pal.charAt(left) == pal.charAt(right) && left < right)
			{
				left++;
				right--;
			}

			if (left < right)
				userPalindrome = "That string is NOT a palindrome.";

			else

				userPalindrome = "That string IS a palindrome.";

			JOptionPane.showMessageDialog(null, userPalindrome);

			again = JOptionPane.showConfirmDialog(null, "Do Another?");
		}

		while (again == JOptionPane.YES_OPTION);
	}
}
