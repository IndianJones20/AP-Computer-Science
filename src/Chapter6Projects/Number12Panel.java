package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number12Panel extends JPanel
{
	public Number12Panel()
	{
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int STARTLOCATIONX = 100, STARTLOCATIONY = 100;

		final int width = 20, height = 20;

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if (g.getColor() == Color.white)
				{
					g.setColor(Color.black);
				}
				else
					g.setColor(Color.white);

				g.fillRect(STARTLOCATIONX, STARTLOCATIONY, width, height);

				STARTLOCATIONX += 20;
			}

			if (g.getColor() == Color.black)
			{
				g.setColor(Color.white);
			} else
			{
				g.setColor(Color.black);
			}
			STARTLOCATIONX -= 160;
			STARTLOCATIONY += 20;
		}
	}

	public void paintWhiteSquare(Graphics g, int xLocation, int yLocation)
	{
		g.setColor(Color.white);
		g.fillRect(xLocation, yLocation, 20, 20);
	}

	public void paintBlackSquare(Graphics g, int xLocation, int yLocation)
	{
		g.setColor(Color.black);
		g.fillRect(xLocation, yLocation, 20, 20);
	}
}
