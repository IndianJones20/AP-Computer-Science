package Chapter4Projects;

import java.awt.Color;
import java.awt.Graphics;

public class TrafficLight
{
	public void drawLightRed(Graphics g)
	{
		// Light Background
		g.setColor(Color.lightGray);
		g.fillRect(100, 100, 200, 500);

		// Lighter Red
		g.setColor(new Color(255, 45, 55));
		g.fillOval(143, 150, 120, 120);

		// Darker Yellow
		g.setColor(new Color(217, 217, 0));
		g.fillOval(143, 300, 120, 120);

		// Darker Green
		g.setColor(new Color(14, 171, 34));
		g.fillOval(143, 450, 120, 120);
	}

	public void drawLightYellow(Graphics g)
	{
		// Light Background
		g.setColor(Color.lightGray);
		g.fillRect(100, 100, 200, 500);

		// Darker Red
		g.setColor(new Color(181, 0, 10));
		g.fillOval(143, 150, 120, 120);

		// Lighter Yellow
		g.setColor(new Color(255, 225, 0));
		g.fillOval(143, 300, 120, 120);

		// Darker Green
		g.setColor(new Color(14, 171, 34));
		g.fillOval(143, 450, 120, 120);
	}

	public void drawLightGreen(Graphics g)
	{
		// Light Background
		g.setColor(Color.lightGray);
		g.fillRect(100, 100, 200, 500);

		// Darker Circle
		g.setColor(new Color(181, 0, 10));
		g.fillOval(143, 150, 120, 120);

		// Darker Yellow
		g.setColor(new Color(217, 217, 0));
		g.fillOval(143, 300, 120, 120);

		// Lighter Green
		g.setColor(new Color(61, 239, 83));
		g.fillOval(143, 450, 120, 120);
	}
}
//Made by Tanuj Gaikwad