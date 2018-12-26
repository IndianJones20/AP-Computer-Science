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

public class Number22Panel extends JPanel
{
	private Point point1 = null, point2 = null;

	private int counter = 0, radius;

	ArrayList<Point> lineStart = new ArrayList<Point>();
	ArrayList<Point> lineEnd = new ArrayList<Point>();
	ArrayList<Integer> radiusArr = new ArrayList<Integer>();

	public Number22Panel()
	{
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		setBackground(Color.black);
		setPreferredSize(new Dimension(800, 800));
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.blue);

		if (point1 != null)
		{
			radius = (int) Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
			page.drawOval(point1.x - (radius / 2), point1.y - (radius / 2), radius, radius);
			// System.out.println(point1.x + "\t" + point1.y);
		}

		counter = 0;
		for (Point counter1 : lineStart)
		{
			page.drawOval(lineStart.get(counter).x, lineStart.get(counter).y, radiusArr.get(counter),
					radiusArr.get(counter));
			counter++;
		}
	}

	private class LineListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent event)
		{
			point1 = event.getPoint();
			System.out.println("Mouse Pressed");
			System.out.println(point1.x + "\t" + point1.y);
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
			radius = (int) Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));

			point1.x = point1.x - (radius / 2);
			point1.y = point1.y - (radius / 2);

			lineStart.add(point1);
			lineEnd.add(point2);
			radiusArr.add(radius);
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
