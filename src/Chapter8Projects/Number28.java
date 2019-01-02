package Chapter8Projects;

import javax.swing.JFrame;

public class Number28
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Direction v2.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number28Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
