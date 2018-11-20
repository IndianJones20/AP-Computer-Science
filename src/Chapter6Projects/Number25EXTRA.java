package Chapter6Projects;

import javax.swing.JFrame;

public class Number25EXTRA
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Cards");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Number25PanelEXTRA());
		frame.pack();
		frame.setVisible(true);
	}

}
