package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class Number17Panel extends JPanel
{
	Random rand = new Random();

	Point[][] coords = new Point[8][8];
	int[][] coordsCheck = new int[8][8];

	int STARTLOCATIONX = 100, STARTLOCATIONY = 100;

	int holdx = 0, holdy = 0;

	public Number17Panel()
	{
		setBackground(Color.orange);
		setPreferredSize(new Dimension(500, 500));

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				coords[i][j] = pointP(STARTLOCATIONX, STARTLOCATIONY);
				STARTLOCATIONX += 40;
				coordsCheck[i][j] = 0;
			}
			STARTLOCATIONY += 40;
			STARTLOCATIONX -= 320;
		}

	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int redCounter = 0, blackCounter = 0, hold = 0;

		final int width = 40, height = 40;

		STARTLOCATIONX = 100;
		STARTLOCATIONY = 100;

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if (g.getColor() == Color.white)
				{
					g.setColor(Color.black);
				} else
					g.setColor(Color.white);

				g.fillRect((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);

//				hold = rand.nextInt(4);
//
//				if (hold == 0 && redCounter < 5 && g.getColor() == Color.black)
//				{
//					g.setColor(Color.red);
//					g.fillOval((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);
//					System.out.println(coords[i][j]);
//					redCounter++;
//				}
//
//				else if (hold == 1 && blackCounter < 8 && g.getColor() == Color.black)
//				{
//					g.setColor(Color.gray);
//					g.fillOval((int) coords[i][j].getX(), (int) coords[i][j].getY(), width, height);
//					blackCounter++;
//				}

				STARTLOCATIONX += 40;

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

		rand.setSeed(55);

		redCounter = 0;
		while (redCounter < 5)
		{
			holdx = rand.nextInt(7);
			holdy = rand.nextInt(7);

			if (((holdx % 2 == 1 && holdy % 2 == 0) || (holdx % 2 == 0 && holdy % 2 == 1))
					&& coordsCheck[holdx][holdy] == 0)
			{
				g.setColor(Color.red);
				g.fillOval((int) coords[holdx][holdy].getX(), (int) coords[holdx][holdy].getY(), width, height);
				coordsCheck[holdx][holdy] = 1;
				// System.out.println(coords[holdx][holdy]);
				redCounter++;
			}
			System.out.println(coords[holdx][holdy]);
		}

		blackCounter = 0;
		while (blackCounter < 8)
		{
			holdx = rand.nextInt(7);
			holdy = rand.nextInt(7);
			if (coordsCheck[holdx][holdy] == 1)
			{
				System.out.println("duplicate coordinates" + coords[holdx][holdy]);
			}
			if (((holdx % 2 == 1 && holdy % 2 == 0) || (holdx % 2 == 0 && holdy % 2 == 1))
					&& coordsCheck[holdx][holdy] == 0)
			{
				g.setColor(Color.gray);
				g.fillOval((int) coords[holdx][holdy].getX(), (int) coords[holdx][holdy].getY(), width, height);
				coordsCheck[holdx][holdy] = 1;
				System.out.println(coords[holdx][holdy]);
				blackCounter++;
			}
			// System.out.println(coords[holdx][holdy]);
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
