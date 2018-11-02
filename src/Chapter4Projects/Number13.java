package Chapter4Projects;

import javax.swing.JFrame;

public class Number13
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Stars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number13Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);

	}

}
//Made by Tanuj Gaikwad