package Chapter4Projects;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Number15Panel extends JPanel
{
	JButton generate;
	Random rand = new Random();
	JLabel label;
	public Number15Panel()
	{


		generate = new JButton("Generate");
		generate.setFont(new Font("Ariel", Font.BOLD, 30));
		generate.setPreferredSize(new Dimension(200, 60));
		generate.addMouseListener(new Listener());

		label = new JLabel("Random Number: ");
		label.setFont(new Font("Ariel", Font.BOLD, 40));


		setPreferredSize(new Dimension(400, 400));
		add(generate);
		add(label);
	}

	private class Listener extends JPanel implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{

		}

		@Override
		public void mouseEntered(MouseEvent e)
		{

		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			label.setText("Random Number: " + (rand.nextInt(100) + 1));
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{


		}
	}
}
//Made by Tanuj Gaikwad