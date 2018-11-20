package Chapter6Projects;

import javax.swing.JFrame;

public class Number19
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Painting");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number19Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
