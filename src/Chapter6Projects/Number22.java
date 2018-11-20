package Chapter6Projects;

import javax.swing.JFrame;

public class Number22
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Big Circle");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number22Panel());
		frame.pack();
		frame.setVisible(true);
	}

}
