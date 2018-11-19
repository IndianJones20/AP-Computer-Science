package Chapter6Projects;

import javax.swing.JFrame;

public class Number16
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Brick Wall");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number16Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
