package Chapter8Projects;

import javax.swing.JFrame;

public class Number25
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Interactive Spaceship");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number25Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
