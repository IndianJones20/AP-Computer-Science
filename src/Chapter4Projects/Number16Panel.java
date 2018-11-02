package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number16Panel extends JPanel
{
	private JButton Increment, Decrement;
	private JLabel label;
	private int num;

	public Number16Panel()
	{
		num = 50;
		Increment = new JButton("Increment 1");
		Increment.setFont(new Font("Ariel", Font.BOLD, 35));
		Increment.setPreferredSize(new Dimension(240, 130));
		Increment.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				num++;
				label.setText("Current Number: " + num);
			}
		});
		
		Decrement = new JButton("Decrement 1");
		Decrement.setFont(new Font("Ariel", Font.BOLD, 30));
		Decrement.setPreferredSize(new Dimension(240, 130));
		Decrement.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				num--;
				label.setText("Current Number: " + num);
			}
		});
		
		label = new JLabel("Current Number: " + num);
		label.setFont(new Font("Ariel", Font.BOLD, 40));

		add(Increment);
		add(Decrement);
		add(label);

		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.ORANGE);

	}
}
//Made by Tanuj Gaikwad