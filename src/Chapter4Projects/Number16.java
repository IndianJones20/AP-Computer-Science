package Chapter4Projects;

import javax.swing.JFrame;

public class Number16
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Increment & Decrement");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number16Panel());
		frame.pack();
		frame.setVisible(true);
	}
}
//Made by Tanuj Gaikwad