package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Number25Panel extends JPanel
{
	private ImageIcon ship, laser, currentImage;

	private final int JUMP = 10, IMAGE_SIZE = 31;

	boolean shootLaser = false;

	private int x, y;

	public Number25Panel()
	{
		x = WIDTH / 2;
		y = HEIGHT / 2;

		ship = new ImageIcon("src/Chapter8Projects/Spaceship.png");
		laser = new ImageIcon("src/Chapter8Projects/Laser.png");

		currentImage = ship;

		mouseFollower listener = new mouseFollower();

		addMouseListener(listener);
		addMouseMotionListener(listener);
		setBackground(Color.black);
		setPreferredSize(new Dimension(750, 750));
		setFocusable(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if (shootLaser)
		{
			laser.paintIcon(this, g, x + 205, y - 500);
		}
		currentImage.paintIcon(this, g, x, y);

	}

	private class mouseFollower implements MouseListener, MouseMotionListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{

		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			shootLaser = true;
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			shootLaser = false;
			repaint();
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

		@Override
		public void mouseDragged(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			x = e.getX() - 256;
			y = e.getY() - 256;
			repaint();
		}

	}
}
