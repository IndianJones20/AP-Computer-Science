package Chapter3Projects;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Number11
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Problem #11");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon1 = new ImageIcon("src/Chapter3Projects/BMWLogo.png");
		ImageIcon icon2 = new ImageIcon("src/Chapter3Projects/Flower.png");
		ImageIcon icon3 = new ImageIcon("src/Chapter3Projects/Trippy.png");
		ImageIcon icon4 = new ImageIcon("src/Chapter3Projects/HandShake.png");

		JLabel label1, label2, label3, label4;

		label1 = new JLabel("BMW Logo", icon1, SwingConstants.LEFT);
		label1.setHorizontalTextPosition(SwingConstants.LEFT);
		label1.setVerticalTextPosition(SwingConstants.TOP);

		label2 = new JLabel("Random Flower", icon2, SwingConstants.LEFT);
		label2.setHorizontalTextPosition(SwingConstants.CENTER);
		label2.setVerticalTextPosition(SwingConstants.TOP);

		label3 = new JLabel("Trippy Thing", icon3, SwingConstants.LEFT);
		label3.setHorizontalTextPosition(SwingConstants.RIGHT);
		label3.setVerticalTextPosition(SwingConstants.TOP);

		label4 = new JLabel("Random Meme Handshake", icon4, SwingConstants.RIGHT);
		label4.setHorizontalTextPosition(SwingConstants.RIGHT);
		label4.setVerticalTextPosition(SwingConstants.TOP);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.cyan);
		panel1.setPreferredSize(new Dimension(500, 500));
		panel1.add(label1);
		panel1.add(label2);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.magenta);
		panel2.setPreferredSize(new Dimension(500, 500));
		panel2.add(label3);
		panel2.add(label4);

		JPanel background = new JPanel();
		background.setBackground(Color.black);
		background.add(panel1);
		background.add(panel2);

		frame.getContentPane().add(background);
		frame.pack();
		frame.setVisible(true);
	}

}
//Made by Tanuj Gaikwad