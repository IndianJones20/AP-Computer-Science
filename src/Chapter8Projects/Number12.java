package Chapter8Projects;

import javax.swing.JFrame;

public class Number12
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Stars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number12Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
