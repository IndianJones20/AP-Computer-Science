package Chapter5Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Number12
{

	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Scanner file = new Scanner(new File("src/Chapter5Projects/Scores.txt"));

		ArrayList<Integer> players = new ArrayList<Integer>();

		players.add(0);
		players.add(0);
		players.add(0);
		players.add(0);
		players.add(0);

		while (file.hasNextInt())
		{
			scores.add(file.nextInt());
		}

		System.out.println(scores);


		int temp = 0;
		int count = 0;
		while(count < scores.size())
		{
			temp = players.get(count % 5) + scores.get(count);
			players.set(count % 5, temp);
			count++;
		}

		System.out.println(players);

		int par = players.get(0);
		players.remove(0);

		players.sort(null);
		System.out.println("Lowest Score: " + players.get(0));
		// System.out.println("Winner: " + players.get(0));

		//Account for having a tie score at the end
		//print an actual score card for each hole
		//print the player name
	}

}
