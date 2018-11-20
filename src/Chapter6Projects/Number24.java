package Chapter6Projects;

import javax.swing.JFrame;

public class Number24
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Palindrome Tester");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number24Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
