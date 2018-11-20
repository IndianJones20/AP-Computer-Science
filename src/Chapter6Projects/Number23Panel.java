package Chapter6Projects;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Number23Panel extends JPanel
{
	public Number23Panel()
	{
		int userValue1, userValue2, sum, product, again;
		String numStr1, numStr2, sumResult, productResult;

		do
		{
			numStr1 = JOptionPane.showInputDialog("Enter an Integer: ");
			userValue1 = Integer.parseInt(numStr1);

			numStr2 = JOptionPane.showInputDialog("Enter an Integer: ");
			userValue2 = Integer.parseInt(numStr2);

			sum = userValue1 + userValue2;
			product = userValue1 * userValue2;

			sumResult = "The sum of these numbers is: " + sum;
			productResult = "The product of these numbers is: " + product;

			JOptionPane.showMessageDialog(null, sumResult);
			JOptionPane.showMessageDialog(null, productResult);

			again = JOptionPane.showConfirmDialog(null, "Do Another?");
		}

		while (again == JOptionPane.YES_OPTION);
	}
}
