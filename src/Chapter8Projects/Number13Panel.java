package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number13Panel extends JPanel
{
	public Number13Panel()
	{
		setBackground(Color.blue);
		setPreferredSize(new Dimension(400, 300));
	}

	public void drawFrame(Graphics g)
	{
		// Car Frame
		g.setColor(new Color(34, 177, 76));
		int[] xPointsCarFrame =
		{ 67, 275, 275, 360, 360, 67, 67 };
		int[] yPointsCarFrame =
		{ 108, 108, 161, 161, 223, 223, 108 };

		g.fillPolygon(xPointsCarFrame, yPointsCarFrame, 7);
	}

	public void drawWindshield(Graphics g)
	{

		// Windshield
		g.setColor(new Color(153, 217, 234));
		int[] xPointsCarWindshield =
		{ 326, 361, 361, 326, 326 };
		int[] yPointsCarWindshield =
		{ 166, 166, 201, 201, 166 };

		g.fillPolygon(xPointsCarWindshield, yPointsCarWindshield, 5);
	}

	public void drawWheels(Graphics g)
	{
		// Wheels
		g.setColor(Color.black);
		g.fillOval(101, 203, 51, 51);
		g.fillOval(303, 203, 51, 51);
	}

	public void drawAesthetic(Graphics g)
	{
		// Lightning Bolt
		g.setColor(Color.yellow);
		int[] xPointsLightning =
		{ 99, 176, 179, 218, 218, 213, 251, 251, 242, 298, 298, 191, 191, 199, 146, 146, 159, 99, 99 };
		int[] yPointsLightning =
		{ 139, 122, 122, 147, 150, 153, 169, 172, 176, 207, 210, 184, 181, 179, 164, 161, 158, 142, 139 };

		g.fillPolygon(xPointsLightning, yPointsLightning, 19);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		drawFrame(g);
		drawWindshield(g);
		drawWheels(g);
		drawAesthetic(g);
	}
}
