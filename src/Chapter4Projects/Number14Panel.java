package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Number14Panel extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton Calculate;

	public Number14Panel()
	{

		inputLabel = new JLabel("Enter Fahrenheit Temperature");
		inputLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		outputLabel = new JLabel("Temperature in Celsius: ");
		outputLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		resultLabel = new JLabel("---");
		resultLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		fahrenheit = new JTextField(5);
		fahrenheit.setFont(new Font("Ariel", Font.BOLD, 40));
		fahrenheit.addActionListener(new TempListener());
		fahrenheit.addMouseListener(new TempListener2());


		add(inputLabel);
		add(fahrenheit);

		Calculate = new JButton("Calculate");
		Calculate.setFont(new Font("Ariel", Font.BOLD, 15));
		Calculate.setPreferredSize(new Dimension(200, 60));
		Calculate.addMouseListener(new TempListener2());
		add(Calculate);

		add(outputLabel);
		add(resultLabel);

		setPreferredSize(new Dimension(800, 200));
		setBackground(Color.yellow);
	}

	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int fahrenheitTemp, celsiusTemp;
			String text = fahrenheit.getText();
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
			resultLabel.setText(Integer.toString(celsiusTemp));
			

		}
	}

	// MouseListner is weird and it takes some random ammount of time to make the
	// button click register
	private class TempListener2 implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{

		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			int fahrenheitTemp, celsiusTemp;
			String text = fahrenheit.getText();
			if (text.isEmpty() == false)
			{
			fahrenheitTemp = (int) Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
			resultLabel.setText(Integer.toString(celsiusTemp));
			}

		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}
	}
}
//Made by Tanuj Gaikwad