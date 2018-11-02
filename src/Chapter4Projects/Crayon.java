package Chapter4Projects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Crayon
{
	private Color color;
	private int height;
	private int xPosition;

	public Crayon(int crayonHeight, Color crayonColor, int X)
	{
		color = crayonColor;
		height = crayonHeight;
		xPosition = X;
	}

	public void setColor(String crayonColor)
	{
		this.setColor(crayonColor);
	}

	public Color getColor()
	{
		return color;
	}

	public void setX(int X)
	{
		this.setX(X);
	}

	public int getX()
	{
		return this.xPosition;
	}


	public void setHeight(int crayonHeight)
	{
		this.setHeight(crayonHeight);
	}

	public int getHeight()
	{
		return this.height;
	}


	public void drawCrayon(Graphics g)
	{
		g.setColor(color);
		g.fillRect(getX(), 300 - getHeight(), 50, getHeight());
		int x[] =
		{ getX(), getX() + 50, getX() + 25 };
		int y[] =
		{ 300 - getHeight(), 300 - getHeight(), 300 - getHeight() - 25 };
		int n = 3;

		Polygon p = new Polygon(x, y, n);
		g.fillPolygon(p);
	}
}
//Made by Tanuj Gaikwad