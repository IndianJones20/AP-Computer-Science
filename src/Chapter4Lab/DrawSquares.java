package Chapter4Lab;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawSquares extends JPanel
{
	Square s1, s2, s3, s4, s5;

	public DrawSquares()
	{
		s1 = new Square();
		s2 = new Square();
		s3 = new Square();
		s4 = new Square();
		s5 = new Square();

		setPreferredSize(new Dimension(800, 800));
	}
	
	public void paintComponent(Graphics g)
	{
		s1.draw(g);
		s2.draw(g);
		s3.draw(g);
		s4.draw(g);
		s5.draw(g);
	}

}
//Made by Tanuj Gaikwad