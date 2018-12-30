package Chapter8Projects;

import javax.swing.JFrame;

public class Number21
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Polyline Thing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number21Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
