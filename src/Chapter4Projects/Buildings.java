package Chapter4Projects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Buildings
{
	private int width, height, x, windows;
	Random rand = new Random();

	public Buildings(int widthInPixels, int heightIntPixels, int X, int Windows)
	{
		width = widthInPixels;
		height = heightIntPixels;
		x = X;
		windows = Windows;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(x, (1000 - height), width, height);
	}

	public void drawWindows(Graphics g)
	{
		int numWindows = rand.nextInt(15) + 4;
		for (int i = 0; i < numWindows; i++)
		{
			g.setColor(Color.yellow);
			g.fillRect(x + (rand.nextInt(this.getWidth()) - 40), 950 - (rand.nextInt(this.getHeight() - 40)), 35, 35);
		}
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int widthInPixels)
	{
		this.width = widthInPixels;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int heightInPixels)
	{
		this.height = heightInPixels;
	}

	public void setX(int X)
	{
		this.x = X;
	}

	public int getX()
	{
		return x;
	}

	public void setWindows(int Windows)
	{
		this.windows = Windows;
	}
}
//Made by Tanuj Gaikwad