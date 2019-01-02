package Chapter8Projects;

import javax.swing.JFrame;

public class Number27
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Direction");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number27Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
