package Chapter9Projects;

import javax.swing.JFrame;

public class Number10
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Number10Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
