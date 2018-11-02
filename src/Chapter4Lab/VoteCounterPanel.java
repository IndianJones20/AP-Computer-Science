package Chapter4Lab;

//************************************************************
//VoteCounterPanel.java
//
//Demonstrates a graphical user interface and event listeners to
//tally votes for two candidates, Joe and Sam.
//************************************************************
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VoteCounterPanel extends JPanel
{
	private int votesForJoe, votesForSam;
	private JButton joe, sam;
	private JLabel labelJoe, labelSam;

	// ------------------------------------------------
	// Constructor: Sets up the GUI.
	// ------------------------------------------------
	public VoteCounterPanel()
	{
		votesForJoe = 0;
		joe = new JButton("Vote for Joe");
		joe.setFont(new Font("Ariel", Font.BOLD, 30));
		joe.addActionListener(new JoeButtonListener());

		labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
		labelJoe.setFont(new Font("Ariel", Font.BOLD, 35));

		votesForSam = 0;
		sam = new JButton("Vote for Sam");
		sam.setFont(new Font("Ariel", Font.BOLD, 30));
		sam.addActionListener(new SamButtonListener());

		labelSam = new JLabel("Votes for Sam: " + votesForSam);
		labelSam.setFont(new Font("Ariel", Font.BOLD, 33));

		add(joe);
		add(labelJoe);
		add(sam);
		add(labelSam);

		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.cyan);
	}

	// **************************************************
	// Represents a listener for button push (action) events
	// **************************************************
	private class JoeButtonListener implements ActionListener
	{
		// ---------------------------------------------
		// Updates the counter and label when Vote for Joe
		// button is pushed
		// ---------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			votesForJoe++;
			labelJoe.setText("Votes for Joe: " + votesForJoe);
		}
	}

	private class SamButtonListener implements ActionListener
	{
		// ---------------------------------------------
		// Updates the counter and label when Vote for Joe
		// button is pushed
		// ---------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			votesForSam++;
			labelSam.setText("Votes for Sam: " + votesForSam);
		}
	}
}
//Made by Tanuj Gaikwad