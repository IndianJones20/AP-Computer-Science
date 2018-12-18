package Chapter8Projects;

import javax.swing.JFrame;

public class Number18
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Checkerboard v2.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number18Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
