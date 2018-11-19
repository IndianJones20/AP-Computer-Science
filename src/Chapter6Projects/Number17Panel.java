package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Number17Panel extends JPanel
{
	public Number17Panel()
	{
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.gray);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int boxX, boxY, boxWidth, boxHeight;

		boxX = 50;
		boxY = 50;
		boxWidth = 50;
		boxHeight = 50;

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				g.drawRect(boxX, boxY, boxWidth, boxHeight);

				if (j % 2 == 0)
				{
					g.drawLine(boxX + 5, boxY + 5, boxX + 40, boxY + 40);
					g.drawLine(boxX + 40, boxY + 5, boxX + 5, boxY + 40);
				}

				else
				{
					g.drawOval(boxX + 10, boxY + 10, 30, 30);
				}
				boxX += 50;
			}
			boxX = 50;
			boxY += 50;
		}
	}
}
