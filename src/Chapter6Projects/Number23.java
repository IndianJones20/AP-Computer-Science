package Chapter6Projects;

import javax.swing.JFrame;

public class Number23
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Dialog Boxes");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number23Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
