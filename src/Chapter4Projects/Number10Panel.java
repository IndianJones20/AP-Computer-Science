package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number10Panel extends JPanel
{
	private Buildings building1, building2, building3, building4, building5, building6, building7;
	Random rand = new Random();
	
	public Number10Panel()
	{
		building1 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350, 0, rand.nextInt(8) + 7);

		building2 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350,
				(building1.getX() + building1.getWidth()), rand.nextInt(8) + 7);

		building3 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350,
				(building2.getX() + building2.getWidth()), rand.nextInt(8) + 7);

		building4 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(500) + 100,
				(building3.getX() + building3.getWidth()), rand.nextInt(8) + 7);

		building5 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350,
				(building4.getX() + building4.getWidth()), rand.nextInt(8) + 7);

		building6 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350,
				(building5.getX() + building5.getWidth()), rand.nextInt(8) + 7);

		building7 = new Buildings(rand.nextInt(201) + 100, rand.nextInt(766) + 350,
				(building6.getX() + building6.getWidth()), rand.nextInt(8) + 7);

		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{
		building1.draw(g);
		building2.draw(g);
		building3.draw(g);
		building4.draw(g);
		building5.draw(g);
		building6.draw(g);
		building7.draw(g);

		building1.drawWindows(g);
		building2.drawWindows(g);
		building3.drawWindows(g);
		building4.drawWindows(g);
		building5.drawWindows(g);
		building6.drawWindows(g);
		building7.drawWindows(g);
	}
}
//Made by Tanuj Gaikwad