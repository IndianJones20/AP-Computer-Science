package Chapter2Lab;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class PieChart extends JApplet
{
	/*
	 * Rent and Utilities - 35% (126 degrees) Transportation - 15% (54 degrees) Food
	 * - 15% (54 degrees) Educational - 25% (90 degrees) Miscellaneous - 10% (36
	 * degrees)
	 */

	public void init()
	{
		setSize(1000, 1000);
	}
	public void paint(Graphics page)
	{
		int startAngle, degrees, Rent = 35, Trans = 15, Food = 15, Edu = 25, Misc = 10, Total;

		// Rent and Utilities
		page.setColor(Color.blue);
		startAngle = 0;
		degrees = (int) (Rent * 360 / 100);
		page.fillArc(300, 200, 400, 400, startAngle, degrees);

		// Transportation
		page.setColor(Color.red);
		startAngle = degrees;
		degrees = (int) (Trans * 360 / 100);
		page.fillArc(300, 200, 400, 400, startAngle, degrees);

		// Food
		page.setColor(Color.green);
		startAngle = startAngle + degrees;
		degrees = (int) (Food * 360 / 100);
		page.fillArc(300, 200, 400, 400, startAngle, degrees);

		// Educational
		page.setColor(Color.orange);
		startAngle = startAngle + degrees;
		degrees = (int) (Edu * 360 / 100);
		page.fillArc(300, 200, 400, 400, startAngle, degrees);

		// Miscellaneous
		page.setColor(Color.pink);
		startAngle = startAngle + degrees;
		degrees = (int) (Misc * 360 / 100);
		page.fillArc(300, 200, 400, 400, startAngle, degrees);

		page.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		page.setColor(Color.black);
		page.drawString("Rent and Utilities - 35%", 600, 190);
		page.drawString("Transportation - 15%", 30, 310);
		page.drawString("Food - 15%", 150, 500);
		page.drawString("Educational - 25%", 450, 650);
		page.drawString("Miscellaneous - 10%", 700, 470);
		
	}
}
//Made by Tanuj Gaikwad