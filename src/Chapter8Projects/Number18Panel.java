package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class Number18Panel extends JPanel
{
	Random rand = new Random();

	Point[][] coords = new Point[8][8];
	int STARTLOCATIONX = 100, STARTLOCATIONY = 100;

	public Number18Panel()
	{
		// Sets Background
		setBackground(Color.orange);

		// Sets Size
		setPreferredSize(new Dimension(500, 500));

		// Initializes the "coords" array as a 2-d array and adds all the coordinates
		// (top left start point)
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				coords[i][j] = pointP(STARTLOCATIONX, STARTLOCATIONY);
				STARTLOCATIONX += 40;
			}
			STARTLOCATIONY += 40;
			STARTLOCATIONX -= 320;
		}

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Initializes integers for limiting the number of chechers on the board
		int redCounter = 0, blackCounter = 0, hold = 0;

		// initializes the baords square widths and heights
		final int width = 40, height = 40;

		// resets the start locations x and y to start all the way at the beginning
		STARTLOCATIONX = 100;
		STARTLOCATIONY = 100;

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				// Sets the appropriate color
				if (g.getColor() == Color.white)
				{
					g.setColor(Color.black);
				} else
					g.setColor(Color.white);

				// fills the square in
				g.fillRect((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);

				hold = rand.nextInt(3);

				if (hold == 0 && redCounter < 5 && g.getColor() == Color.black)
				{
					g.setColor(Color.red);
					g.fillOval((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);
					redCounter++;
				}

				else if (hold == 1 && blackCounter < 8 && g.getColor() == Color.black)
				{
					g.setColor(Color.gray);
					g.fillOval((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);
					blackCounter++;
				}

				STARTLOCATIONX += 40;

				g.setFont(new Font("Helvetica", Font.BOLD, 25));
				g.drawString(coords[i][j].toString(), 25, 25);
			}

			if (g.getColor() == Color.black || g.getColor() == Color.gray || g.getColor() == Color.red)
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

	public int getXPosition()
	{
		return STARTLOCATIONX;
	}

	public int getYPosition()
	{
		return STARTLOCATIONY;
	}

	public Point pointP(int x, int y)
	{
		STARTLOCATIONX = x;
		STARTLOCATIONY = y;

		return new Point(STARTLOCATIONX, STARTLOCATIONY);
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
