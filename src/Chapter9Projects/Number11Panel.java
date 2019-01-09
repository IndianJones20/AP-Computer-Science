package Chapter9Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Number11Panel extends JPanel
{
	private final int WIDTH = 500, HEIGHT = 500;
	private final int DELAY = 20;
	private Timer timer;
	private int x, y, x2, y2, p, q, p2, q2, moveX, moveY;

	public Number11Panel()
	{
		timer = new Timer(DELAY, new ReboundListener());
		x = 0;
		y = 250;
		x2 = 100;
		y2 = 250;
		p = 250;
		q = 250;
		p2 = 250;
		q2 = 250;
		moveX = moveY = 3;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		timer.start();
//		System.out.println(IMAGE_SIZE);
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.white);
		page.drawLine(x, y, x2, y2);
		page.setColor(Color.red);
		page.drawLine(p, q, p2, q2);

		page.setColor(Color.green);
		page.drawLine(250, 0, 250, 500);
		page.drawLine(251, 0, 251, 500);
		page.drawLine(252, 0, 252, 500);

	}

	private class ReboundListener implements ActionListener
	{
		// --------------------------------------------------------------
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{

			if (x2 >= 250)
			{
				x2 = 250;
				p2 += moveX;
			} else
			{
				x2 += moveX;
			}
			if (x < 250)
			{
				x += moveX;
			} else
			{
				x = 250;
				p += moveX;
			}

			if (p > 500)
			{
				x = 0;
				y = 250;
				x2 = 100;
				y2 = 250;
				p = 250;
				q = 250;
				p2 = 250;
				q2 = 250;

			}
			repaint();
		}

	}
}
