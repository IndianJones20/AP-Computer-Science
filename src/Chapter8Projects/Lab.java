package Chapter8Projects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("Maze Game");
		try
		{
			f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/Chapter8Projects/Maze.png")))));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		f.pack();
		f.setVisible(true);
	}
}
