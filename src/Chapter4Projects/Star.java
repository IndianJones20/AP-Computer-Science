package Chapter4Projects;

import java.awt.Color;
import java.awt.Graphics;

public class Star
{
	private int width;
	private int xTopPoint;
	private int yTopPoint;

	public Star(int Width, int X, int Y)
	{
		width = Width;
		xTopPoint = X;
		yTopPoint = Y;
	}

	public Star()
	{
		// TODO Auto-generated constructor stub
	}

	public void paintStar(Graphics g, int x, int y, int width)
	{
		width = (width / 3);

		int[] xx =
		{ x, x + (10 * width), x + (30 * width), x + (10 * width), x + (20 * width), x, x - (20 * width),
				x - (10 * width), x - (30 * width), x - (10 * width) };
		int[] yy =
		{ y, y + (20 * width), y + (20 * width), y + (30 * width), y + (60 * width), y + (40 * width), y + (60 * width),
				y + (30 * width), y + (20 * width), y + (20 * width) };
		g.setColor(Color.white);
		g.fillPolygon(xx, yy, 10);


	}

}
//Made by Tanuj Gaikwad