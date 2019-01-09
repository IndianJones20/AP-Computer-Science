package Chapter9Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Number9Panel extends JPanel
{
	private final int WIDTH = 800, HEIGHT = 800;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	private boolean bool_move = true;

	public Number9Panel()
	{
		ReboundListener listener = new ReboundListener();
		addMouseListener(listener);

		timer = new Timer(DELAY, new ReboundListener());
		image = new ImageIcon("src/Chapter9Projects/Splatoon.png");
		x = 0;
		y = 40;
		moveX = moveY = 3;

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.orange);
		timer.start();
//		System.out.println(IMAGE_SIZE);
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}

	private class ReboundListener implements ActionListener, MouseListener
	{
		// --------------------------------------------------------------
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			x += moveX;
			y += moveY;
			if (x <= 0 || x >= WIDTH - 230)
			{
				moveX = moveX * -1;
			}

			if (y <= 0 || y >= HEIGHT - 230)
			{
				moveY = moveY * -1;
			}
			repaint();
		}

		@Override
		public void mouseClicked(MouseEvent e)
		{
			bool_move = !bool_move;
			if (!bool_move)
			{
				timer.stop();
				repaint();

			} else
			{
				timer.start();
				repaint();
			}
		}

		@Override
		public void mousePressed(MouseEvent e)
		{

		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}
	}
}
