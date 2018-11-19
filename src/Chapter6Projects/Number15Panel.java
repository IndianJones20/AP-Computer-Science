package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number15Panel extends JPanel
{
	public Number15Panel()
	{
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.orange);
	}

	public void paintComponent(Graphics g)
	{
		int x, y, width, height;
		Random rand = new Random();
		super.paintComponent(g);

		x = 200;
		y = 200;
		width = 30;
		height = 30;

		for (int i = 0; i < 10; i++)
		{
			g.drawOval(x, y, width, height);
			width += 20;
			height += 20;
			x -= 10;
			y -= 10;
		}

	}

}
