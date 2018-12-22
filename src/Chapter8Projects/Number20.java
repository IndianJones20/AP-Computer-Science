package Chapter8Projects;

import javax.swing.JFrame;

public class Number20
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Cookie Clicker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number20Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
