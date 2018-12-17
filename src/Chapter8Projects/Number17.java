package Chapter8Projects;

import javax.swing.JFrame;

public class Number17
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Checkerboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number17Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
