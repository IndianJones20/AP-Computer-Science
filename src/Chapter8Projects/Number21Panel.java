package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Number21Panel extends JPanel
{
	private Point point1 = null, point2 = null;

	private int counter = 0;

	ArrayList<Point> lineStart = new ArrayList<Point>();
	ArrayList<Point> lineEnd = new ArrayList<Point>();

	public Number21Panel()
	{
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.blue);
		counter = 0;

		if (point1 != null && point2 != null)
		{
			page.drawLine(lineStart.get(counter).x, lineStart.get(counter).y, point2.x, point2.y);
		}

		for (Point counter1 : lineStart)
		{
			page.drawLine(lineStart.get(counter).x, lineStart.get(counter).y, lineEnd.get(counter).x,
					lineEnd.get(counter).y);
			counter++;
		}
	}

	private class LineListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent event)
		{
			point1 = event.getPoint();
		}

		public void mouseDragged(MouseEvent event)
		{
			point2 = event.getPoint();
			repaint();
		}

		public void mouseClicked(MouseEvent event)
		{

		}

		public void mouseReleased(MouseEvent event)
		{
//			System.out.println("the Mouse Was Released");
			lineStart.add(point1);
			lineEnd.add(point2);
		}

		public void mouseEntered(MouseEvent event)
		{
		}

		public void mouseExited(MouseEvent event)
		{
		}

		public void mouseMoved(MouseEvent event)
		{
		}
	}
}
