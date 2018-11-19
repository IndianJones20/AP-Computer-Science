package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Number17Panel extends JPanel
{
	public Number17Panel()
	{
		setPreferredSize(new Dimension(800, 800));
		setBackground(Color.gray);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int boxX, boxY, boxWidth, boxHeight;

		Number17Extra style1 = new Number17Extra();
		Number17Extra style2 = new Number17Extra();

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
					style1.Xs(g, boxX + 5, boxY + 5, boxX + 40, boxY + 40);
					style1.Xs(g, boxX + 40, boxY + 5, boxX + 5, boxY + 40);
				}

				else
				{
					style1.circlesOnly(g, boxX + 10, boxY + 10, 30, 30);
				}
				boxX += 50;
			}
			boxX = 50;
			boxY += 50;
		}

		boxX = 50;
		boxY = 400;
		boxWidth = 50;
		boxHeight = 50;

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				style2.changeColor(g, Color.black);
				g.drawRect(boxX, boxY, boxWidth, boxHeight);

				if (j % 2 == 0)
				{
					style2.changeColor(g, Color.black);
					style2.Xs(g, boxX + 5, boxY + 5, boxX + 40, boxY + 40);
					style2.Xs(g, boxX + 40, boxY + 5, boxX + 5, boxY + 40);
				}

				else
				{
					style2.changeColor(g, Color.white);
					style2.circlesOnlyFilled(g, boxX + 10, boxY + 10, 30, 30);
				}
				boxX += 50;
			}
			boxX = 50;
			boxY += 50;
		}
	}
}
