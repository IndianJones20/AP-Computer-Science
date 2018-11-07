package Chapter5Lab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//****************************************************************
//BaseballStats.java
//
//Reads baseball data in from a comma delimited file. Each line
//of the file contains a name followed by a list of symbols
//indicating the result of each at bat: h for hit, o for out,
//w for walk, s for sacrifice. Statistics are computed and
//printed for each player.
//****************************************************************
import java.util.Scanner;
public class BaseballStats
{
	// -------------------------------------------------
	// Reads baseball stats from a file and counts
	// total hits, outs, walks, and sacrifice flies
	// for each player.
	// -------------------------------------------------
	public static void main(String[] args) throws IOException
	{
		Scanner fileScan, lineScan;
		String fileName, name;
		ArrayList<String> hits, outs, walks, sacrifices;
		
		hits = new ArrayList<String>();
		outs = new ArrayList<String>();
		walks = new ArrayList<String>();
		sacrifices = new ArrayList<String>();

		int hitCounter = 0, outCounter = 0, walkCounter = 0, sacrificeCounter = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the name of the input file: ");
		fileName = scan.nextLine();
		fileScan = new Scanner(new File("src/Chapter5Lab/" + fileName + ".txt"));

		while (fileScan.hasNext())
		{
			name = fileScan.next();
			System.out.print("Name: " + name);

			lineScan = new Scanner(fileScan.next());
			lineScan.useDelimiter(",");


			while (lineScan.hasNext())
			{
				System.out.println("  " + lineScan.next());

//------------------------------------------
//ASK SLATA FOR HELP
//------------------------------------------
//				if (lineScan.next().equalsIgnoreCase("h"))
//				{
//					hits.add(hitCounter, lineScan.next());
//					hitCounter++;
//				}
//
//				else if (lineScan.next().equalsIgnoreCase("o"))
//				{
//					outs.add(outCounter, lineScan.next());
//					outCounter++;
//				}
//
//				else if (lineScan.next().equalsIgnoreCase("w"))
//				{
//					walks.add(walkCounter, lineScan.next());
//					walkCounter++;
//				}
//
//				else if (lineScan.next().equalsIgnoreCase("s"))
//				{
//					sacrifices.add(sacrificeCounter, lineScan.next());
//					sacrificeCounter++;
//				}
			}

			System.out.println();
		}


		fileScan.close();
		// Read and process each line of the file
	}
}