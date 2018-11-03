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
		ArrayList<Integer> playerSort = new ArrayList<Integer>();

		players.add(0);
		players.add(0);
		players.add(0);
		players.add(0);
		players.add(0);
		players.add(0);

		playerSort.add(0);
		playerSort.add(0);
		playerSort.add(0);
		playerSort.add(0);
		playerSort.add(0);

		while (file.hasNextInt())
		{
			scores.add(file.nextInt());
		}

		System.out.println(scores);


		int temp = 0;
		int count = 6;
		int holeNumber = 1;

		while(count < scores.size())
		{
			temp = players.get(count % 6) + scores.get(count);
			players.set(count % 6, temp);
			count++;
		}


		System.out.println(players);

		int par = players.get(0);
		players.remove(0);

		// Apply player nuumber to corressponding value

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (players.get(i) != players.get(j) && players.get(i) > players.get(j))
				{
					playerSort.set(i, playerSort.get(i) + 1);
				}

			}
		}

		ArrayList<Integer> winners = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			if (playerSort.get(i) == 0)
			{
				winners.add(i);
			}
		}

		System.out.println(winners);
		System.out.println(playerSort);
		System.out.println(players);
		System.out.println("Lowest Score: " + players.get(0));

		int winnerCounter = 0;
		System.out.print("Winner(s): \n");
		while(winnerCounter < winners.size())
		{	
			System.out.print("Player " + winners.get(winnerCounter) + "\n");
			winnerCounter++;
		}

		//Account for having a tie score at the end
		//print an actual score card for each hole
		//print the player name
	}

}
