package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Number16Panel extends JPanel
{
	public Number16Panel()
	{
		setBackground(Color.black);
		setPreferredSize(new Dimension(600, 600));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Random rand = new Random();

		int randX1 = 0, randY1 = 0, randRadius1 = 0, randX2 = 0, randY2 = 0, centerX1 = 0, centerY1 = 0, sumRadii1 = 0,
				randRadius2 = 0, centerX2 = 0, centerY2 = 0, sumRadii2 = 0;

		int[] circle1 =
		{ randX1, randY1, randRadius1 };
		int[] circle2 =
		{ randX2, randY2, randRadius2 };

		int[] calc1 =
		{ centerX1, centerY1, sumRadii1 };

		int[] calc2 =
		{ centerX2, centerY2, sumRadii2 };

		for (int circleCount = 0; circleCount < 20; circleCount++)
		{
			circle1[2] = rand.nextInt(80) + 20;
			circle1[0] = rand.nextInt(500);
			circle1[1] = rand.nextInt(500);

			circle2[2] = rand.nextInt(80) + 20;
			circle2[0] = rand.nextInt(500);
			circle2[1] = rand.nextInt(500);

			calc1[0] = circle1[0] + (circle1[2] / 2);
			calc1[1] = circle1[1] + (circle1[2] / 2);
			calc1[2] = circle2[2] + circle1[2];

			calc2[0] = circle2[0] + (circle2[2] / 2);
			calc2[1] = circle2[1] + (circle2[2] / 2);
			calc2[2] = circle1[2] + circle2[2];

			if (calc1[0] < calc2[2])
			{
				g.setColor(Color.cyan);
				g.fillOval(circle1[0], circle1[1], circle1[2], circle1[2]);
			}

			else
			{
				g.setColor(Color.white);
				g.fillOval(circle1[0], circle1[1], circle1[2], circle1[2]);
			}

			circle2[0] = circle1[0];
			circle2[1] = circle1[1];
			circle2[2] = circle1[2];
		}
	}
}
