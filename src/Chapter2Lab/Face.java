package Chapter2Lab;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Face extends JApplet
{
	public void init()
	{
		setSize(800, 520);
	}

	public void paint(Graphics page)
	{
		Color face = new Color(182, 162, 143);
		Color iris = new Color(210, 105, 30);
		Color eyeWhite = new Color(255, 255, 255);
		Color nose = new Color(98, 75, 60);
		Color ears = new Color(98, 75, 60);
		Color pupils = new Color(0, 0, 0);
		Color mouth = new Color(250, 153, 164);

		page.setColor(face);
		page.fillOval(50, 50, 350, 290);

		page.setColor(eyeWhite);
		page.fillOval(155, 135, 35, 75);
		page.fillOval(250, 135, 35, 75);

		page.setColor(iris);
		page.fillOval(160, 160, 25, 25);
		page.fillOval(255, 160, 25, 25);

		page.setColor(pupils);
		page.fillOval(167, 167, 10, 10);
		page.fillOval(262, 167, 10, 10);

		page.setColor(nose);
		page.drawArc(190, 210, 50, 50, 75, 270);

		page.drawArc(340, 140, 50, 75, -40, 240);
		page.drawArc(350, 160, 25, 42, -40, 240);
		page.drawArc(170, 250, 120, 50, 25, -180);

	}

}
//Made by Tanuj Gaikwad
