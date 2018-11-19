package Chapter6Projects;

import javax.swing.JFrame;

public class Number14
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Circles");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number14Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
