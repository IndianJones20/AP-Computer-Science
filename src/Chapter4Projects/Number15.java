package Chapter4Projects;

import javax.swing.JFrame;

public class Number15
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Random Number Generator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number15Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad