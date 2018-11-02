package Chapter4Projects;

import javax.swing.JFrame;

public class Number11
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Diner");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number11Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad