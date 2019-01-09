package Chapter9Projects;

public class Number4Basketball extends Number4Sport
{
	public String toString()
	{
		return super.toString() + "\nI am the sport of basketball\n";
	}

	public String getNumPlayers()
	{
		return "On the field, there are 10 players, 5 from each team\n";
	}

	public String teamRank()
	{
		return "this team's rank is 23rd in the country\n";
	}

	public String getWins()
	{
		return "this team won 3 championships in the past 8 years\n";
	}
}
