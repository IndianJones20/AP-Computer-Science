package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number19Panel extends JPanel
{
	public Number19Panel()
	{
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Chimney of House
		g.setColor(new Color(80, 25, 33));
		g.fillRect(350, 120, 100, 200);

		// Roof of House
		g.setColor(Color.gray);
		int[] xPoints =
		{ 170, 470, 770, 170 };
		int[] yPoints =
		{ 420, 220, 420, 420 };
		g.fillPolygon(xPoints, yPoints, 4);

		// Body of House
		g.setColor(Color.red);
		g.fillRect(170, 420, 600, 500);

		// Windows (2)
		g.setColor(Color.green);
		g.fillRect(275, 495, 120, 120);
		g.fillRect(525, 495, 120, 120);

		// Window Lines
		g.setColor(Color.gray);
		g.fillRect(330, 495, 10, 120);
		g.fillRect(275, 550, 120, 10);

		g.fillRect(580, 495, 10, 120);
		g.fillRect(525, 550, 120, 10);

		// Door
		g.setColor(new Color(210, 105, 30));
		g.fillRect(420, 720, 100, 200);

		// Fence bars
		g.setColor(Color.white);
		g.fillRect(0, 750, 1000, 50);
		g.fillRect(0, 850, 1000, 50);

		int increaseX = 125, startX = 0;
		for (int i = 0; i < 9; i++)
		{
			g.fillRect(startX, 700, 80, 300);
			startX += increaseX;
		}

		startX = -125;
		int startY = 750;
		// Fence Triangular tops
		for (int i = 0; i < 9; i++)
		{
			int[] xPoints2 =
			{ startX, startX + 40, startX + 80, startX };
			int[] yPoints2 =
			{ startY, startY - 20, startY, startY };
			g.fillPolygon(xPoints2, yPoints2, 4);

			startX += increaseX;
			startY = 700;
		}
	}
}
