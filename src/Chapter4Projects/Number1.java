package Chapter4Projects;

import javax.swing.JFrame;

public class Number1
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Problem #1");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number1Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
//Made by Tanuj Gaikwad