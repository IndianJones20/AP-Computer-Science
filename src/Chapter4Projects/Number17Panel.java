package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Number17Panel extends JPanel
{
	private JButton next;
	private int counter = -1;
	private JPanel panel = new JPanel();
	private TrafficLight light1;

	public Number17Panel()
	{
		light1 = new TrafficLight();

		next = new JButton("Change Light");
		next.setFont(new Font("Ariel", Font.BOLD, 30));
		next.setPreferredSize(new Dimension(250, 65));

		next.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				counter++;
				repaint();
			}
		});


		add(next);

		setPreferredSize(new Dimension(600, 700));
		setBackground(Color.cyan);

	}

	public void paintComponent(Graphics g)
	{
		if (counter % 3 == 0)
		{
			light1.drawLightRed(g);
		} else if (counter % 3 == 1)
		{
			light1.drawLightGreen(g);
		} else if (counter % 3 == 2)
		{
			light1.drawLightYellow(g);
		}
	}
}
//Made by Tanuj Gaikwad