package Chapter4Projects;

import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Email extends JPanel
{
	private TextField To, CC, Bcc, Subject, body;

	public TextField getBody()
	{
		return body;
	}

	public TextField getTo()
	{
		return To;
	}

	public TextField getCC()
	{
		return CC;
	}

	public TextField getBcc()
	{
		return Bcc;
	}

	public TextField getSubject()
	{
		return Subject;
	}

	public JButton getSend()
	{
		return send;
	}

	private JButton send;
	
	private class Listener implements MouseListener
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
			System.out.println("Subject: " + To.toString());
			System.out.println("CC: " + CC.toString());
			System.out.println("Bcc: " + Bcc.toString());
			System.out.println("Subject: " + Subject.toString());
			System.out.println("Message: " + body.toString());
		}

		@Override
		public void mouseReleased(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

	}

}
//Made by Tanuj Gaikwad