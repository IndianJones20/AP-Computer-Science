package Chapter8Projects;

import javax.swing.JFrame;

public class Number24
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Left or Right");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number24Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
