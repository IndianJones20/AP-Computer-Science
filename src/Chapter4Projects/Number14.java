package Chapter4Projects;

import javax.swing.JFrame;

public class Number14
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Number14Panel panel = new Number14Panel();

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
//Made by Tanuj Gaikwad