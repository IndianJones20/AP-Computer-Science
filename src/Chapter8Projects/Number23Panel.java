package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number23Panel extends JPanel
{
	int x1 = 0, x2 = 0, y1 = 0, y2 = 0, mouseSpeed = 0;
	JLabel mouseSpeedLabel;

	public Number23Panel()
	{
		mouseSpeed = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		mouseSpeedLabel = new JLabel("Current Mouse Speed: " + mouseSpeed);
		mouseSpeedLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		mouseSpeedListener listener = new mouseSpeedListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		add(mouseSpeedLabel);
		setBackground(Color.black);
		setPreferredSize(new Dimension(600, 600));
	}

	private class mouseSpeedListener implements MouseListener, MouseMotionListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{
			// TODO Auto-generated method stub

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
			x1 = e.getX();
			y1 = e.getY();
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
			x2 = e.getX();
			y2 = e.getY();
		}

	}
}
