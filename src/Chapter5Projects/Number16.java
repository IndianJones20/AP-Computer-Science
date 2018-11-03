package Chapter5Projects;

import javax.swing.JFrame;


public class Number16
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Number16Panel panel = new Number16Panel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
