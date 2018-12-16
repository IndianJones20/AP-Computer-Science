package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import Chapter4Projects.Star;

public class Number12Panel extends JPanel
{
	public Number12Panel()
	{
		setBackground(Color.black);
		setPreferredSize(new Dimension(700, 700));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Star s1 = new Star();

		Random rand = new Random();

		for (int i = 100; i < 600; i += rand.nextInt(180) + 50)
		{
			for (int j = 100; j < 600; j += rand.nextInt(100) + 100)
			{
				s1.paintStar(g, j, i + rand.nextInt(75) + 1, rand.nextInt(8) + 1);
			}
		}
	}
}
