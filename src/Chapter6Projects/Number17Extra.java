package Chapter6Projects;

import java.awt.Color;
import java.awt.Graphics;

public class Number17Extra
{
	public void Xs(Graphics g, int x, int y, int width, int height)
	{
		g.drawLine(x, y, width, height);
	}

	public void circlesOnly(Graphics g, int x, int y, int width, int height)
	{
		g.drawOval(x, y, width, height);
	}

	public void changeColor(Graphics g, Color yeet)
	{
		g.setColor(yeet);
	}

	public void circlesOnlyFilled(Graphics g, int x, int y, int width, int height)
	{
		g.fillOval(x, y, width, height);
	}

}