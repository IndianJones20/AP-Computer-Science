package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Number24Panel extends JPanel
{
	public Number24Panel()
	{
		ColorLocationDetector listener = new ColorLocationDetector();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		setBackground(Color.red);
		setPreferredSize(new Dimension(500, 500));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		repaint();
	}

	private class ColorLocationDetector implements MouseListener, MouseMotionListener
	{
		@Override
		public void mousePressed(MouseEvent event)
		{

		}

		@Override
		public void mouseClicked(MouseEvent event)
		{

		}

		@Override
		public void mouseReleased(MouseEvent event)
		{

		}

		@Override
		public void mouseEntered(MouseEvent event)
		{
			System.out.println(event.getX());
		}

		@Override
		public void mouseExited(MouseEvent event)
		{

		}

		@Override
		public void mouseDragged(MouseEvent event)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent event)
		{
			if (event.getX() > 250)
			{
				setBackground(Color.green);
				repaint();
			}

			else
			{
				setBackground(Color.red);
				repaint();
			}
		}
	}
}
