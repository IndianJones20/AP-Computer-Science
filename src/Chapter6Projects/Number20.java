package Chapter6Projects;

import javax.swing.JFrame;

public class Number20
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rainbow");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number20Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
