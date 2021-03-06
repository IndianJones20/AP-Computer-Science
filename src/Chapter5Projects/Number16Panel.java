package Chapter5Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Number16Panel extends JPanel
{
	private JLabel saying;
	private JCheckBox bold, italic;
	private JTextField fontSizeSetter;

	public Number16Panel()
	{
		saying=new JLabel("Say it with Style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);

		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);

		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);

		fontSizeSetter = new JTextField(5);
//		fontSizeSetter.addActionListener(actionlistener);
		add(saying);
		add(bold);
		add(italic);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 100));
	}

	private void setFontSize(int fontsize)
	{

	}

	private class actionlistener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{

		}

	}
	private class StyleListener implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent arg0)
		{
			int style = Font.PLAIN;

			if (bold.isSelected())
			{
				style = Font.BOLD;
			}
			if (italic.isSelected())
			{
				style += Font.ITALIC;
			}

			saying.setFont(new Font("Helvetica", style, 36));
		}
	}
}
