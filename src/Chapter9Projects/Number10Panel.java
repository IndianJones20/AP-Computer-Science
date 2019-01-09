package Chapter9Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Number10Panel extends JPanel
{
	private final int WIDTH = 1300, HEIGHT = 900, DELAY = 20;
	private ImageIcon image, background;
	private int x, y, moveX, moveY;
	private Timer timer;

	public Number10Panel()
	{
		timer = new Timer(DELAY, new ReboundListener());
		image = new ImageIcon("src/Chapter9Projects/Car.png");
		background = new ImageIcon("src/Chapter9Projects/background.png");
		x = 0;
		y = 550;
		moveX = moveY = 3;
		timer.start();

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.cyan);
		background.paintIcon(this, g, 0, -200);
		image.paintIcon(this, g, x, y);
	}

	private class ReboundListener implements ActionListener
	{
		// --------------------------------------------------------------
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			x += moveX;
			if (x >= WIDTH - 230)
			{
				x = 0;
			}
			repaint();
		}
	}
}
