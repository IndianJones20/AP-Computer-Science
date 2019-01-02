package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Number27Panel extends JPanel
{
	private final int WIDTH = 750, HEIGHT = 750;
	private final int JUMP = 10; // increment for image movement

	private final int IMAGE_SIZE = 31;

	private ImageIcon up, down, right, left, currentImage;
	private int x, y;

	public Number27Panel()
	{
		addKeyListener(new DirectionListener());

		x = WIDTH / 2;
		y = HEIGHT / 2;

		up = new ImageIcon("src/Chapter8Projects/upArrow.jpg");
		down = new ImageIcon("src/Chapter8Projects/downArrow.jpg");
		left = new ImageIcon("src/Chapter8Projects/leftArrow.png");
		right = new ImageIcon("src/Chapter8Projects/rightArrow.png");

		currentImage = right;

		setBackground(Color.white);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		currentImage.paintIcon(this, page, x, y);
	}

	private class DirectionListener implements KeyListener
	{
		// --------------------------------------------------------------
		// Responds to the user pressing arrow keys by adjusting the
		// image and image location accordingly.
		// --------------------------------------------------------------
		public void keyPressed(KeyEvent event)
		{
			switch (event.getKeyCode())
			{
			case KeyEvent.VK_UP:
				if (y >= 0)
				{
					currentImage = up;
					y -= JUMP;
				}
				break;

			case KeyEvent.VK_DOWN:
				if (y <= 460)
				{
					currentImage = down;
					y += JUMP;
				}
				break;

			case KeyEvent.VK_LEFT:
				if (x >= 0)
				{
					currentImage = left;
					x -= JUMP;
				}
				break;

			case KeyEvent.VK_RIGHT:
				if (x <= 520)
				{
					currentImage = right;
					x += JUMP;
				}
				break;
			}
			repaint();
		}

		public void keyTyped(KeyEvent event)
		{
		}

		public void keyReleased(KeyEvent event)
		{
		}

	}
}