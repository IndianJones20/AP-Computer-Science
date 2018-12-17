package Chapter8Projects;

import javax.swing.JFrame;

public class Number16
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number16Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
