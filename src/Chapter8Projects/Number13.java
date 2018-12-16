package Chapter8Projects;

import javax.swing.JFrame;

public class Number13
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number13Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
