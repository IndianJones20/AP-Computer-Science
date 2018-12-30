package Chapter8Projects;

import javax.swing.JFrame;

public class Number23
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Mouse Speed Gun");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number23Panel());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
