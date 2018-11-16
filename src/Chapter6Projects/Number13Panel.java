package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number13Panel extends JPanel
{
	public Number13Panel()
	{
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		final int width = 40, height = 40;

		int counterStatic = 0, counterMoving = 0, startLocationX = 100, startLocationY = 300;

		g.setColor(Color.white);

		for (int i = 0; i < 5; i++)
		{
			g.fillRect(startLocationX, startLocationY, width, height);
			while (counterMoving > 0)
			{
				g.fillRect(startLocationX, (startLocationY + 40), width, height);
				startLocationY += 40;
				counterMoving--;
				if (counterMoving == 0)
				{
					startLocationY = startLocationY - (40 * counterStatic);
				}
			}
			counterStatic++;
			counterMoving = counterStatic;
			startLocationX += 40;
			startLocationY -= 40;
		}
	}
}
