package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number21Panel extends JPanel
{
	public Number21Panel()
	{
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.white);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Random rand = new Random();
		
		int x1, y1, x2, y2;
		
		for (int i = 0; i < 200000; i++)
		{
			x1 = rand.nextInt(999);
			y1 = rand.nextInt(999);
			x2 = x1 + 1;
			y2 = y1 + 1;

			if (x1 <= 500)
			{
				g.setColor(Color.red);
			}

			else if (x1 > 500)
			{
				g.setColor(Color.green);
			}
			g.drawLine(x1, y1, x2, y2);
		}
	}
}
