package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Number12Panel extends JPanel
{

	private Crayon cray1, cray2, cray3, cray4, cray5, cray6, cray7, cray8;

	public Number12Panel()
	{
		cray1 = new Crayon(150, Color.red, 100);
		cray2 = new Crayon(150, Color.blue, cray1.getX() + 50);
		cray3 = new Crayon(150, Color.pink, cray2.getX() + 50);
		cray4 = new Crayon(150, Color.green, cray3.getX() + 50);
		cray5 = new Crayon(150, Color.magenta, cray4.getX() + 50);
		cray6 = new Crayon(150, Color.cyan, cray5.getX() + 50);
		cray7 = new Crayon(150, Color.black, cray6.getX() + 50);
		cray8 = new Crayon(150, Color.gray, cray7.getX() + 50);

		setPreferredSize(new Dimension(600, 400));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(237, 232, 31));
		g.fillRect(100, 50, 400, 250);

		cray1.drawCrayon(g);
		cray2.drawCrayon(g);
		cray3.drawCrayon(g);
		cray4.drawCrayon(g);
		cray5.drawCrayon(g);
		cray6.drawCrayon(g);
		cray7.drawCrayon(g);
		cray8.drawCrayon(g);

		g.setColor(Color.blue);
		g.setFont(new Font("Ariel", Font.BOLD, 40));
		g.drawString("CRAYON BOX", 160, 100);
	}
}
//Made by Tanuj Gaikwad