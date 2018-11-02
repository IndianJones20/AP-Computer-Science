package Chapter4Projects;

import javax.swing.JFrame;

public class Number18
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Gmail");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


		frame.getContentPane().add(new Number18Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
//Made by Tanuj Gaikwad