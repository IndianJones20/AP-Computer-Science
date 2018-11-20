package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number22Panel extends JPanel
{
	public Number22Panel()
	{
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Random rand = new Random();

		int x, y, width, height, hold = 0, tempX = 0, tempY = 0, tempWidth = 0, tempHeight = 0;

		for (int i = 0; i < 10; i++)
		{
			x = rand.nextInt(951);
			y = rand.nextInt(951);
			width = rand.nextInt(200);
			height = width;
			
			if (hold < width)
			{
				tempX = x;
				tempY = y;
				tempWidth = width;
				tempHeight = tempWidth;
				hold = width;
			}

			g.drawOval(x, y, width, height);
		}

		g.setColor(Color.red);
		g.fillOval(tempX, tempY, tempWidth, tempHeight);

	}
}
