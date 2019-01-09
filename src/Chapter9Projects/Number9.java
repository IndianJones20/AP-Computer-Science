package Chapter9Projects;

import javax.swing.JFrame;

public class Number9
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number9Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
