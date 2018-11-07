package Chapter5Lab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
//********************************************************************
//StyleOptionsPanel.java		Author: Lewis/Loftus
//
//Demonstrates the use of check boxes.
//********************************************************************
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StyleOptionsPanel extends JPanel
{
	private JLabel saying;
	private JCheckBox bold, italic;
	private JRadioButton small, medium, large;

	// -----------------------------------------------------------------
	// Sets up a panel with a label and some check boxes that
	// control the style of the label's font.
	// -----------------------------------------------------------------
	public StyleOptionsPanel()
	{
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		bold.setFont(new Font("Helvetica", Font.PLAIN, 30));

		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		italic.setFont(new Font("Helvetica", Font.PLAIN, 30));

		small = new JRadioButton("Small");
		small.setBackground(Color.cyan);
		small.setFont(new Font("Helvetica", Font.PLAIN, 30));

		medium = new JRadioButton("Medium");
		medium.setBackground(Color.cyan);
		medium.setFont(new Font("Helvetica", Font.PLAIN, 30));

		large = new JRadioButton("Large");
		large.setBackground(Color.cyan);
		large.setFont(new Font("Helvetica", Font.PLAIN, 30));

		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);

		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		small.addItemListener(listener);
		medium.addItemListener(listener);
		large.addItemListener(listener);

		add(saying);
		add(bold);
		add(italic);
		add(small);
		add(medium);
		add(large);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(500, 500));
	}

	// *****************************************************************
	// Represents the listener for both check boxes.
	// *****************************************************************
	private class StyleListener implements ItemListener
	{
		// --------------------------------------------------------------
		// Updates the style of the label font style.
		// --------------------------------------------------------------
		public void itemStateChanged(ItemEvent event)
		{
			int style = Font.PLAIN;
			int size = 20;
			if (bold.isSelected())
				style = Font.BOLD;
			if (italic.isSelected())
				style += Font.ITALIC;
			if (small.isSelected())
				size = 30;
			if (medium.isSelected())
				size = 40;
			if (large.isSelected())
				size = 50;
			saying.setFont(new Font("Helvetica", style, size));
		}
	}
}