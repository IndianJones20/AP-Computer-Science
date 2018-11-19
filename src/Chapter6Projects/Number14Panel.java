package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number14Panel extends JPanel
{
	public Number14Panel()
	{
		setPreferredSize(new Dimension(600, 600));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		Random rand = new Random();

		int xCoord, yCoord, diameter, red, green, blue;
		
		for (int i = 0; i < 100; i++)
		{
			red = rand.nextInt(256);
			green = rand.nextInt(256);
			blue = rand.nextInt(256);
			xCoord = rand.nextInt(490) + 10;
			yCoord = rand.nextInt(490) + 5;
			diameter = rand.nextInt(100) + 1;
			
			g.setColor(new Color(red, green, blue));

			g.fillOval(xCoord, yCoord, diameter, diameter);
		}
	}
}
