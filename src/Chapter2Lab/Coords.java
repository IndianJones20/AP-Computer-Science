package Chapter2Lab;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//*************************************************************
//Coords.java
//
//Draw rectangles to illustrate the Java coordinate system
//
//*************************************************************

public class Coords extends JApplet
{
	public void init()
	{
		setSize(800, 520);
	}


	public void paint(Graphics page)
	{

		int x, y;
		int width, height;

		setBackground(Color.GREEN);


		page.setColor(Color.black);
		x = 300;
		y = 200;
		width = 150;
		height = 100;
		page.fillRect(x, y, width, height);

		page.setColor(Color.red);
		x = 450;
		y = 300;
		width = 300;
		height = 200;
		page.fillRect(x, y, width, height);

		page.setColor(Color.orange);
		x = 0;
		y = 0;
		width = 300;
		height = 200;
		page.fillRect(x, y, width, height);

		page.setColor(Color.magenta);
		x = 0;
		y = 300;
		width = 300;
		height = 200;
		page.fillRect(x, y, width, height);

		page.setColor(Color.darkGray);
		x = 450;
		y = 0;
		width = 300;
		height = 200;
		page.fillRect(x, y, width, height);

	}
}
//Made by Tanuj Gaikwad