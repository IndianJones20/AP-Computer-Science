package Chapter4Projects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Diner
{
	private String name;
	private char gender;
	private int location;
	private Color color;

	private int x, y;

	public Diner(String personName, char personGender, int locationAtTable)
	{
		name = personName;
		gender = personGender;
		location = locationAtTable;

	}

	public void drawDiner(Graphics g)
	{
		if (this.gender == 'm')
		{
			g.setColor(Color.blue);
			color = Color.white;
		} else
		{
			g.setColor(Color.pink);
			color = Color.black;
		}

		if (this.location > 4)
		{
			g.fillOval(50 + ((location - 4) * 300), 900, 250, 250);

			g.setColor(color);
			g.setFont(new Font("Ariel", Font.BOLD, 40));
			g.drawString(name, 110 + ((location - 4) * 300), 1030);
		} else
		{
			g.fillOval(50 + (location * 300), 50, 250, 250);

			g.setColor(color);
			g.setFont(new Font("Ariel", Font.BOLD, 40));
			g.drawString(name, 100 + (location * 300), 175);
		}
	}
}
//Made by Tanuj Gaikwad