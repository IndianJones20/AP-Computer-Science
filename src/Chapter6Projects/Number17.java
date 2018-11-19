package Chapter6Projects;

import javax.swing.JFrame;

public class Number17
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Quilt");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number17Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
