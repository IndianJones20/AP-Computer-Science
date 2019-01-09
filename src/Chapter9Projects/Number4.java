package Chapter9Projects;

public class Number4
{

	public static void main(String[] args)
	{
		Number4Soccer soccer1 = new Number4Soccer();

		System.out.println(soccer1);

		System.out.println(soccer1.getNumPlayers());

		System.out.println(soccer1.teamRank());

		Number4Basketball basket1 = new Number4Basketball();

		System.out.println(basket1);

		System.out.println(basket1.getNumPlayers());

		System.out.println(basket1.teamRank());

		System.out.println(basket1.getWins());
	}

}
