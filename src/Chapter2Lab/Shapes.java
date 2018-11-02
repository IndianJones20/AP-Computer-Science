package Chapter2Lab;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//************************************************************
//Shapes.java
//
//The program will draw two filled rectangles and a
//filled oval.
//************************************************************

public class Shapes extends JApplet
{
	public void paint(Graphics page)
	{
		// Declare size constants
		final int MAX_SIZE = 300;
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400;

		int x, y;
		int width, height;

		setBackground(Color.yellow);

		page.setColor(Color.blue);

		x = 400; // Changed from 200 to 0 Both changes led to rectangle spawning in top left
				// corner.
		y = 40; // Changed from 150 to 0
		width = 50;
		height = 200;

		page.fillRect(x, y, width, height);

		page.setColor(Color.black);
		x = 75;
		y = 100;
		width = 100;
		height = 150;
		page.fillRect(x, y, width, height);
		
		page.setColor(Color.white);
		x = 100;
		y = 125;
		width = 50;
		height = 75;
		page.fillRect(x, y, width, height);

		page.setColor(Color.red);
		x = 50;
		y = 70;
		width = 90;
		height = 130;
		page.fillOval(x, y, width, height);
		
		page.setColor(Color.green);
		x=20;
		y=20;
		width = 65;
		height = 45;
		page.fillOval(x, y, width, height);

	}
}
//Made by Tanuj Gaikwad
