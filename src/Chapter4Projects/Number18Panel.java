package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Number18Panel extends JPanel
{
	private JTextField To, CC, Bcc, Subject;
	private JTextArea body;
	private JLabel ToLabel, CCLabel, BccLabel, SubjectLabel, BodyLabel;
	private JButton send;

	public Number18Panel()
	{

		send = new JButton("Send");
		send.setFont(new Font("Ariel", Font.BOLD, 15));
		send.setPreferredSize(new Dimension(200, 60));
		send.addMouseListener(new Listener());


		ToLabel = new JLabel("To: ");
		ToLabel.setBounds(50, 50, 40, 40);
		ToLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ToLabel.setPreferredSize(new Dimension(100, 50));
		ToLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		To = new JTextField(25);
		To.setFont(new Font("Ariel", Font.BOLD, 40));


		CCLabel = new JLabel("CC: ");
		CCLabel.setBounds(50, 50, 50, 50);
		CCLabel.setHorizontalAlignment(SwingConstants.LEFT);
		// CCLabel.setPreferredSize(new Dimension(100, 50));
		CCLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		CC = new JTextField(25);
		CC.setFont(new Font("Ariel", Font.BOLD, 40));


		BccLabel = new JLabel("Bcc: ");
		BccLabel.setBounds(50, 50, 50, 50);
		BccLabel.setHorizontalAlignment(SwingConstants.LEFT);
		BccLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		Bcc = new JTextField(25);
		Bcc.setFont(new Font("Ariel", Font.BOLD, 40));


		SubjectLabel = new JLabel("Subject: ");
		SubjectLabel.setBounds(50, 50, 50, 50);
		SubjectLabel.setHorizontalAlignment(SwingConstants.LEFT);
		SubjectLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		Subject = new JTextField(23);
		Subject.setFont(new Font("Ariel", Font.BOLD, 40));


		BodyLabel = new JLabel("Body: ");
		BodyLabel.setFont(new Font("Ariel", Font.BOLD, 40));

		body = new JTextArea(10, 25);
		body.setAlignmentX(LEFT_ALIGNMENT);
		body.setAlignmentY(TOP_ALIGNMENT);
		body.setFont(new Font("Ariel", Font.BOLD, 40));

		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.orange);

		add(ToLabel);
		add(To);

		add(CCLabel);
		add(CC);

		add(BccLabel);
		add(Bcc);

		add(SubjectLabel);
		add(Subject);

		add(BodyLabel);
		add(body);

		add(send);

	}

	public class Listener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0)
		{
			System.out.println("To: " + To.getText());
			System.out.println("CC: " + CC.getText());
			System.out.println("Bcc: " + Bcc.getText());
			System.out.println("Subject: " + Subject.getText());
			System.out.println("Body: " + body.getText());
		}

		@Override
		public void mouseReleased(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

	}
}
//Made by Tanuj Gaikwad