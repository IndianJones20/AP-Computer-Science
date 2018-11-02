package Chapter4Projects;

import javax.swing.JFrame;

public class Number2
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Problem #2");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number2Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad