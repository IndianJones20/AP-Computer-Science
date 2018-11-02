package Chapter4Lab;

import javax.swing.JFrame;

public class SquareTest
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Squares");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new DrawSquares());
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad