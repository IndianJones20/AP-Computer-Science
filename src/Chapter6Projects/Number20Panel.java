package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number20Panel extends JPanel
{
	public Number20Panel()
	{
		setPreferredSize(new Dimension(1000, 600));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int startX, startY, width, height;

		startX = 50;
		startY = 50;
		width = 900;
		height = 900;


		for (int i = 1; i <= 8; i++)
		{
			switch (i)
			{
			case 1:
				g.setColor(Color.red);
				break;

			case 2:
				g.setColor(Color.orange);
				break;

			case 3:
				g.setColor(Color.yellow);
				break;

			case 4:
				g.setColor(Color.green);
				break;

			case 5:
				g.setColor(Color.blue);
				break;

			case 6:
				g.setColor(new Color(0, 0, 131));
				break;

			case 7:
				g.setColor(new Color(48, 0, 155));
				break;

			case 8:
				g.setColor(Color.cyan);
				break;
			}

			g.fillArc(startX, startY, width, height, 0, 180);

			startX += 20;
			startY += 20;
			height -= 40;
			width -= 40;
		}
	}
}
