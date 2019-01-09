package Chapter9Projects;

public class Number4Soccer extends Number4Sport
{
	public String toString()
	{
		return super.toString() + "\nI am the sport of soccer, more commonly known as football\n";
	}

	public String getNumPlayers()
	{
		return "On the field, there are 10 players, one out for a red card\n";
	}

	public String teamRank()
	{
		return "this team's rank is 2nd in the country, 5th in the world\n";
	}
}
