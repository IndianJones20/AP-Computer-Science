package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number18Panel extends JPanel
{
	Random rand = new Random();

	public Number18Panel()
	{
		setBackground(Color.orange);
		setPreferredSize(new Dimension(500, 500));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int STARTLOCATIONX = 100, STARTLOCATIONY = 100, redCounter = 0, blackCounter = 0, hold = 0;

		final int width = 40, height = 40;

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if (g.getColor() == Color.white || g.getColor() == Color.red)
				{
					g.setColor(Color.black);
				} else
					g.setColor(Color.white);

				g.fillRect(STARTLOCATIONX, STARTLOCATIONY, width, height);
				hold = rand.nextInt(3);

				if (hold == 0 && redCounter < 5 && g.getColor() == Color.white)
				{
					g.setColor(Color.red);
					g.fillOval(STARTLOCATIONX, STARTLOCATIONY, width, height);
					redCounter++;
				}

				else if (hold == 1 && blackCounter < 8 && g.getColor() == Color.black)
				{
					g.setColor(Color.gray);
					g.fillOval(STARTLOCATIONX, STARTLOCATIONY, width, height);
					blackCounter++;
				}

				STARTLOCATIONX += 40;
			}

			if (g.getColor() == Color.black || g.getColor() == Color.gray)
			{
				g.setColor(Color.white);
			} else
			{
				g.setColor(Color.black);
			}
			STARTLOCATIONX -= 320;
			STARTLOCATIONY += 40;

		}
	}

	public void paintWhiteSquare(Graphics g, int xLocation, int yLocation)
	{
		g.setColor(Color.white);
		g.fillRect(xLocation, yLocation, 40, 40);
	}

	public void paintBlackSquare(Graphics g, int xLocation, int yLocation)
	{
		g.setColor(Color.black);
		g.fillRect(xLocation, yLocation, 40, 40);
	}

	public void paintChecker(Graphics g, int xLocation, int yLocation)
	{
		g.fillOval(xLocation, yLocation, 40, 40);
	}
}
