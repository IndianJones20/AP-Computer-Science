package Chapter3Lab;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NestedPanels
{
	// --------------------------------------------------------
	// Presents two colored panels nested within a third.
	// --------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up first subpanel
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("One");
		subPanel1.add(label1);

		// Set up second subpanel
		JPanel subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(150, 100));
		subPanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("Two");
		subPanel2.add(label2);

		// Set up third subpanel
		JPanel subPanel3 = new JPanel();
		subPanel3.setPreferredSize(new Dimension(300, 100));
		subPanel3.setBackground(Color.magenta);
		JLabel label3 = new JLabel("Wassup Slata");
		subPanel3.add(label3);

		// Set up fourth subpanel
		JPanel subPanel4 = new JPanel();
		subPanel4.setPreferredSize(new Dimension(320, 20));
		subPanel4.setBackground(Color.cyan);
		JLabel label4 = new JLabel("My Panels");
		subPanel4.add(label4);

		// Set up primary panel
		JPanel primary = new JPanel();
		primary.setPreferredSize(new Dimension(320, 260));
		primary.setBackground(Color.blue);
		primary.add(subPanel4);
		primary.add(subPanel1);
		primary.add(subPanel2);
		primary.add(subPanel3);
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);

		Scanner scan = new Scanner(System.in);

		String firstname;

		System.out.println("Enter 1st name: ");
		firstname = scan.nextLine();

		char finitial1 = firstname.charAt(0);
		Character finitial = new Character(finitial1);

		finitial.toUpperCase(finitial1);
		System.out.println(finitial);
	}
}// Made by Tanuj Gaikwad
