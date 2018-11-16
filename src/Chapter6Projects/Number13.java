package Chapter6Projects;

import javax.swing.JFrame;

public abstract class Number13
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Stairs");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number13Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
