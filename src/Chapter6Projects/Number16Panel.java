package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number16Panel extends JPanel
{
	public Number16Panel()
	{
		// sets up frame
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// brick x, y, widht, & height
		int x, y, width, height;

		// White line x, y, width, height
		int lineX, lineY, lineWidth, lineHeight;

		// sets values of starting brick
		x = 0;
		y = 0;
		width = 50;
		height = 30;

		// sets values of starting line
		lineX = x + 50;
		lineY = y;
		lineWidth = 10;
		lineHeight = 30;

		// prints out bricks and lines for all rows
		for (int i = 0; i < 20; i++)
		{
			// Prints out bricks and lines for one row
			for (int j = 0; j < 10; j++)
			{
				g.setColor(new Color(80, 25, 33));
				g.fillRect(x, y, width, height);

				g.setColor(Color.white);
				g.fillRect(lineX, y, lineWidth, lineHeight);

				x += 60;
				lineX += 60;
			}

			// Add horizontal line for separator
			g.fillRect(0, y, 400, 5);

			// Resets to deafult
			x = 0;
			lineX = x + 50;

			// offsets next line by a little for authenticity
			if (i % 2 == 0)
			{
				x -= 110;
				lineX = x + 50;
			}

			else
			{
				x -= 70;
				lineX = x + 50;
			}

			// increases y to draw next line
			y += 30;
			lineY += 30;
		}
	}
}
