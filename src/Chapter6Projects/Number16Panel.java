package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number16Panel extends JPanel
{
	public Number16Panel()
	{
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int x, y, width, height, lineX, lineY, lineWidth, lineHeight;

		x = 0;
		y = 0;
		width = 50;
		height = 30;

		lineX = x + 50;
		lineY = y;
		lineWidth = 10;
		lineHeight = 30;

		for (int i = 0; i < 20; i++)
		{
			// FINAL FOR LOOP
			for (int j = 0; j < 10; j++)
			{
				g.setColor(new Color(80, 25, 33));
				g.fillRect(x, y, width, height);

				g.setColor(Color.white);
				g.fillRect(lineX, y, lineWidth, lineHeight);

				x += 60;
				lineX += 60;
			}

			g.fillRect(0, y, 400, 5);

			// Resets to deafult
			x = 0;
			lineX = x + 50;

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

			y += 30;
			lineY += 30;
		}
	}
}
