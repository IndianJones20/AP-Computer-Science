package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number13Panel extends JPanel
{
	public Number13Panel()
	{
		setPreferredSize(new Dimension(1000, 1000));
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, 1200, 1200);

		Star s1 = new Star();

		Random rand = new Random();

		for (int i = 100; i < 900; i += rand.nextInt(100) + 50)
		{
			for (int j = 100; j < 900; j += rand.nextInt(100) + 100)
			{
				// s1.paintStar(g, rand.nextInt(950) + 1, rand.nextInt(950) + 1, rand.nextInt(8)
				// + 1);
				s1.paintStar(g, j, i + rand.nextInt(75) + 1, rand.nextInt(8) + 1);
			}
		}

	}
}
//Made by Tanuj Gaikwad