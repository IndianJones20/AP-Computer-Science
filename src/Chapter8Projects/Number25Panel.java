package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Number25Panel extends JPanel
{
	private ImageIcon ship, laser, currentImage;

	private final int JUMP = 10, IMAGE_SIZE = 31;

	private int x, y;

	public Number25Panel()
	{
		x = WIDTH / 2;
		y = HEIGHT / 2;

		ship = new ImageIcon("src/Chapter8Projects/Spaceship.png");
		laser = new ImageIcon("src/Chapter8Projects/Laser.png");

		currentImage = ship;

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(750, 750));
		setFocusable(true);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		currentImage.paintIcon(this, g, x, y);
	}

	private class mouseFollower implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{

		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			// TODO Auto-generated method stub

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
