package Chapter4Lab;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square
{
	int x, y, size, colorR, colorG, colorB;

	private static Random rand = new Random();

	public Square()
	{
		x = rand.nextInt(601);
		y = rand.nextInt(401);
		size = rand.nextInt(100) + 100;
		colorR = rand.nextInt(256);
		colorG = rand.nextInt(256);
		colorB = rand.nextInt(256);
	}

	public void draw(Graphics g)
	{
		g.setColor(new Color(colorR, colorG, colorB));
		g.fillRect(x, y, size, size);
	}
}
//Made by Tanuj Gaikwad