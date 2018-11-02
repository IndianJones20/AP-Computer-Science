package Chapter4Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Number1Panel extends JPanel
{
	private int numberofPeopleInRoom;
	private JButton Add;
	private JButton Subtract;
	private JButton Reset;
	private JLabel label;

	public Number1Panel() 
	{
		numberofPeopleInRoom = 0;
		
		Add = new JButton("Add 1");
		Add.setFont(new Font("Ariel", Font.BOLD, 35));
		Add.setPreferredSize(new Dimension(200, 100));
		Add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				numberofPeopleInRoom++;
				label.setText("People in the room: " + numberofPeopleInRoom);
			}
		});
		
		Subtract = new JButton("Subtract 1");
		Subtract.setFont(new Font("Ariel", Font.BOLD, 30));
		Subtract.setPreferredSize(new Dimension(200, 100));
		Subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				numberofPeopleInRoom--;
				label.setText("People in the room: " + numberofPeopleInRoom);
			}
		});
		
//		Reset = new JButton("Reset");
//		Reset.setFont(new Font("Ariel", Font.BOLD, 35));
//		Reset.setPreferredSize(new Dimension(200, 100));
//		Reset.addActionListener(new ActionListener()
//		{
//			
//			@Override
//			public void actionPerformed(ActionEvent event)
//			{
//				numberofPeopleInRoom = 0;
//				label.setText("People in the room: " + numberofPeopleInRoom);
//			}
//		});
		

		label = new JLabel("People in the room: " + numberofPeopleInRoom);
		label.setFont(new Font("Ariel", Font.BOLD, 40));


		add(Add);
		add(Subtract);
//		add(Reset);
		add(label);
		
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.cyan);
	}
}
//Made by Tanuj Gaikwad
