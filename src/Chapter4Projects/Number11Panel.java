package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number11Panel extends JPanel
{
//	public void draw(Graphics g)
//	{
//		g.setColor(Color.black);
//		g.fillRect(200, 200, 700, 450);
//	}

	private Diner diner1, diner2, diner3, diner4, diner5, diner6, diner7, diner8;

	public Number11Panel()
	{
		diner1 = new Diner("Tanuj", 'm', 1);
		diner2 = new Diner("Harry", 'm', 3);
		diner3 = new Diner("Sarah", 'f', 2);
		diner4 = new Diner("Alex", 'f', 4);
		diner5 = new Diner("Josh", 'm', 7);
		diner6 = new Diner("Sonia", 'f', 6);
		diner7 = new Diner("Aaji", 'f', 5);
		diner8 = new Diner("Chantu", 'm', 8);

		setPreferredSize(new Dimension(2000, 1300));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(32, 183, 15));
		g.fillRect(300, 300, 1200, 600);

		diner1.drawDiner(g);
		diner2.drawDiner(g);
		diner3.drawDiner(g);
		diner4.drawDiner(g);
		diner5.drawDiner(g);
		diner6.drawDiner(g);
		diner7.drawDiner(g);
		diner8.drawDiner(g);
	}



}
//Made by Tanuj Gaikwad