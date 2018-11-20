package Chapter6Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Number25PanelEXTRA extends JPanel
{
	public Number25PanelEXTRA()
	{
		ArrayList<Integer> cardNum = new ArrayList<Integer>();
		ArrayList<String> suit = new ArrayList<String>();

		for (int i = 1; i < 14; i++)
		{
			cardNum.add(i - 1, i);
		}

		suit.add(0, "hearts");
		suit.add(1, "clubs");
		suit.add(2, "spades");
		suit.add(3, "diamonds");

		System.out.println(cardNum);
		System.out.println(suit);

		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.cyan);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Random rand = new Random();

		g.setColor(Color.gray);
		g.fillRect(225, 150, 500, 700);

		int checkNum = rand.nextInt(13) + 1;
		int checkSuit = rand.nextInt(4) + 1;

		switch (checkSuit)
		{

		}
		switch (checkNum)
		{
		case 1:
//			g.setColor(Color.orange);
//			g.fillRect(280, 200, 20, 70);
//			g.fillRect(255, 270, 70, 20);
//			int[] xPoints =
//			{ 255, 280, 290, 265, 255 };
//			int[] yPoints =
//			{ 230, 200, 210, 240, 230 };
//			g.fillPolygon(xPoints, yPoints, 5);


//			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			g.setColor(Color.orange);
			g.fillRect(280, 200, 20, 70);
			g.fillRect(255, 270, 70, 20);
			int[] xPoints =
			{ 255, 280, 290, 265, 255 };
			int[] yPoints =
			{ 230, 200, 210, 240, 230 };
			g.fillPolygon(xPoints, yPoints, 5);

			g.fillRect(625, 710, 70, 20);
			g.fillRect(650, 730, 20, 70);

			int[] xPoints2 =
			{};
			int[] yPoints2 =
			{};
		}

	}
}
