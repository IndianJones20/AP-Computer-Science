package Chapter2Projects;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Number14 extends JApplet
{
	public void paint(Graphics page)
	{
		final int MID = 170;
		final int TOP = 50;

		setBackground(Color.green);

		// Ground
		page.setColor(Color.blue);
		page.fillRect(0, 175, 300, 50);

		// Name in Corner
		page.drawString("Tanuj G.", 10, 10);

		// Sun
		page.setColor(Color.yellow);
		page.fillOval(220, -40, 80, 80);

		// Body
		page.setColor(Color.white);
		page.fillOval(MID - 20, TOP, 40, 40); // Head
		page.fillOval(MID - 35, TOP + 35, 70, 50); // Upper Torso
		page.fillOval(MID - 50, TOP + 80, 100, 60); // Lower Torso

		// Red Buttons on Upper Torso
		page.setColor(Color.red);
		page.fillOval(MID - 5, TOP + 50, 5, 5);
		page.fillOval(MID - 5, TOP + 60, 5, 5);

		page.setColor(Color.black);
		page.fillOval(MID - 10, TOP + 10, 5, 5); // Left Eye
		page.fillOval(MID + 5, TOP + 10, 5, 5); // Right Eye

		page.drawArc(MID - 10, TOP + 25, 17, 15, 0, 180); // Frown

		page.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40); // Left Arm
		page.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60); // Right Arm

		page.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5); // Brim of Hat
		page.fillRect(MID - 15, TOP - 20, 30, 25);
	}

}
//Made by Tanuj Gaikwad