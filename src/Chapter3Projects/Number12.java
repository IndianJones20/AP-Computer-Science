package Chapter3Projects;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Number12
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Label Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("src/Chapter3Projects/BMWLogo.png");

		JLabel label1, label2, label3, label4;

		label1 = new JLabel("BMW Left", icon, SwingConstants.CENTER);

		label2 = new JLabel("BMW Right", icon, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);

		label3 = new JLabel("BMW Above", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);

		label4 = new JLabel("BMW LOL", icon, SwingConstants.CENTER);
		label4.setHorizontalTextPosition(SwingConstants.CENTER);
		label4.setVerticalTextPosition(SwingConstants.TOP);

		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(500, 1000));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
//Made by Tanuj Gaikwad