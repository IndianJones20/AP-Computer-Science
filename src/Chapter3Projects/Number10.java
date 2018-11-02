package Chapter3Projects;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number10
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Problem #10");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel firstName = new JPanel();
		firstName.setBackground(Color.cyan);
		firstName.setPreferredSize(new Dimension(500, 500));
		JLabel Name_First = new JLabel("Tanuj ");
		firstName.add(Name_First);

		JPanel lastName = new JPanel();
		lastName.setBackground(Color.magenta);
		lastName.setPreferredSize(new Dimension(500, 500));
		JLabel Name_Last = new JLabel("Gaikwad");
		lastName.add(Name_Last);

		JPanel background = new JPanel();
		background.setBackground(Color.black);
		background.add(firstName);
		background.add(lastName);

		frame.getContentPane().add(background);
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad