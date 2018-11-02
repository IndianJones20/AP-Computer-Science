package Chapter4Lab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMIPanel extends JPanel
{
	private int WIDTH = 600;
	private int HEIGHT = 600;
	private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
	private JTextField height, weight;
	private JButton calculate;

	// -----------------------------------------------------------------
	// Sets up the GUI.
	// -----------------------------------------------------------------
	public BMIPanel()
	{
		// create labels for the height and weight textfields
		heightLabel = new JLabel("Your height in inches: ");
		heightLabel.setFont(new Font("Ariel", Font.BOLD, 30));
		weightLabel = new JLabel("Your weight in pounds: ");
		weightLabel.setFont(new Font("Ariel", Font.BOLD, 30));

		// create a "this is your BMI" label
		BMILabel = new JLabel("This is your BMI: ");
		BMILabel.setFont(new Font("Ariel", Font.BOLD, 40));


		// create a JTextField to hold the person's height in inches
		height = new JTextField(5);
		height.setFont(new Font("Ariel", Font.BOLD, 40));
		
		// create a JTextField to hold the person's weight in pounds
		weight = new JTextField(5);
		weight.setFont(new Font("Ariel", Font.BOLD, 40));
		
		// create a button to press to calculate BMI
		calculate = new JButton("Calculate");
		calculate.setFont(new Font("Ariel", Font.BOLD, 15));
		calculate.setPreferredSize(new Dimension(200, 60));
		calculate.addActionListener(new BMIListener());

		resultLabel = new JLabel();
		resultLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		// add the height label and height textfield to the panel
		// add the weight label and weight textfield to the panel
		// add the button to the panel
		// add the BMI label to the panel
		// add the label that holds the result to the panel
		add(heightLabel);
		add(height);
		add(weightLabel);
		add(weight);
		add(calculate);
		add(BMILabel);
		add(resultLabel);

		

		// set the size of the panel to the WIDTH and HEIGHT constants
		// set the color of the panel to whatever you choose
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.orange);
	}

	public String toString()
	{
		return resultLabel.getText();
	}

	// **************************************************************
	// Represents an action listener for the calculate button.
	// **************************************************************
	private class BMIListener implements ActionListener
	{
		// ---------------------------------------------
		// Compute the BMI when the button is pressed
		// ---------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			String heightText, weightText;
			int heightVal, weightVal;
			double bmi;
			// get the text from the height and weight textfields
			String text = height.getText();
			String text2 = weight.getText();
			// Use Integer.parseInt to convert the text to integer values
			heightVal = Integer.parseInt(text);
			weightVal = Integer.parseInt(text2);
			// Calculate the bmi = 703 * weight in pounds / (height in inches)^2
			bmi = ((703 * weightVal) / (Math.pow(heightVal, 2)));
			// Put result in result label. Use Double.toString to convert double to string.
			resultLabel.setText("" + bmi);
		}
	}


}
//Made by Tanuj Gaikwad