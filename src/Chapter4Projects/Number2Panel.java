package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number2Panel extends JPanel
{
	private JButton On;
	private JButton Off;
	private JLabel label;

	public Number2Panel()
	{
		On = new JButton("ON");
		On.setPreferredSize(new Dimension(200, 100));
		On.setFont(new Font("Ariel", Font.BOLD, 35));
		On.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				label.setText("Your light bulb is on");
			}
		});


		Off = new JButton("OFF");
		Off.setPreferredSize(new Dimension(200, 100));
		Off.setPreferredSize(new Dimension(200, 100));
		Off.setFont(new Font("Ariel", Font.BOLD, 35));
		Off.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				label.setText("Your light bulb is off");
			}
		});

		label = new JLabel("Your light bulb is off");
		label.setFont(new Font("Ariel", Font.BOLD, 40));
		label.setPreferredSize(new Dimension(500, 150));

		add(On);
		add(Off);
		add(label);

		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.cyan);

	}
}
//Made by Tanuj Gaikwad