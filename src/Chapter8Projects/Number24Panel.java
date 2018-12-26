package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Number24Panel extends JPanel
{
	public Number24Panel()
	{
		ColorLocationDetector listener = new ColorLocationDetector();
		addMouseListener(listener);
		setBackground(Color.red);
		setPreferredSize(new Dimension(500, 500));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}

	private class ColorLocationDetector implements MouseListener
	{
		public void mousePressed(MouseEvent event)
		{

		}

		public void mouseClicked(MouseEvent event)
		{

		}

		public void mouseReleased(MouseEvent event)
		{

		}

		public void mouseEntered(MouseEvent event)
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

		public void mouseExited(MouseEvent event)
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
