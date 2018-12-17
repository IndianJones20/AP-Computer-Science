package Chapter8Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Number15Panel extends JPanel
{
	private JLabel quote;
	private JRadioButton comedy, philosophy, carpentry, weird, factual, random;
	private String comedyQuote = "Take my wife, please";
	private String[] quotes =
	{ "I think, therefore I am.", "Measure twice. Cut once.", "Lick Me", "Knives are Sharp", "REEEEEEEEEE" };

	// -----------------------------------------------------------------
	// Sets up a panel with a label and a set of radio buttons
	// that control its text.
	// -----------------------------------------------------------------
	public Number15Panel()
	{
		quote = new JLabel(comedyQuote);
		quote.setFont(new Font("Helvetica", Font.BOLD, 20));

		comedy = new JRadioButton("Comedy", true);
		comedy.setBackground(Color.green);

		philosophy = new JRadioButton("Philosophy");
		philosophy.setBackground(Color.green);

		carpentry = new JRadioButton("Carpentry");
		carpentry.setBackground(Color.green);

		weird = new JRadioButton("Weird");
		weird.setBackground(Color.green);

		factual = new JRadioButton("Fact");
		factual.setBackground(Color.green);

		random = new JRadioButton("Random");
		random.setBackground(Color.green);

		ButtonGroup group = new ButtonGroup();

		group.add(comedy);
		group.add(philosophy);
		group.add(carpentry);
		group.add(factual);
		group.add(random);
		group.add(weird);

		QuoteListener listener = new QuoteListener();

		comedy.addActionListener(listener);
		philosophy.addActionListener(listener);
		carpentry.addActionListener(listener);
		weird.addActionListener(listener);
		factual.addActionListener(listener);
		random.addActionListener(listener);

		add(quote);
		add(comedy);
		add(philosophy);
		add(carpentry);
		add(factual);
		add(random);
		add(weird);

		setBackground(Color.green);
		setPreferredSize(new Dimension(300, 100));
	}

	private class QuoteListener implements ActionListener
	{
		// --------------------------------------------------------------
		// Sets the text of the label depending on which radio
		// button was pressed.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();

			if (source == comedy)
				quote.setText(comedyQuote);

			else if (source == philosophy)
				quote.setText(quotes[0]);

			else if (source == carpentry)
				quote.setText(quotes[1]);

			else if (source == weird)
				quote.setText(quotes[2]);

			else if (source == factual)
				quote.setText(quotes[3]);

			else
				quote.setText(quotes[4]);
		}
	}
}
