package Chapter4Projects;

import javax.swing.JFrame;

public class Number12
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Crayon");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number12Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad