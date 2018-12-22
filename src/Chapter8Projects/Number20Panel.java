package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Number20Panel extends JPanel
{
	private Integer counter = 0;

	public Number20Panel()
	{
		ClickListener listener = new ClickListener();
		addMouseListener(listener);
		setBackground(Color.orange);
		setPreferredSize(new Dimension(400, 400));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Helvetica", Font.BOLD, 50));
		g.drawString(counter.toString(), 180, 180);
	}

	private class ClickListener implements MouseListener
	{
		public void mousePressed(MouseEvent event)
		{

		}

		public void mouseClicked(MouseEvent event)
		{
			counter++;
			repaint();
		}

		public void mouseReleased(MouseEvent event)
		{

		}

		public void mouseEntered(MouseEvent event)
		{
		}

		public void mouseExited(MouseEvent event)
		{
		}
	}
}
