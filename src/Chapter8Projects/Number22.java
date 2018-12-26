package Chapter8Projects;

import javax.swing.JFrame;

public class Number22
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rubber Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number22Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
