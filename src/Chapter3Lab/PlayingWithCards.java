package Chapter3Lab;

public class PlayingWithCards
{
	enum Rank
	{
		ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
	};

	public static void main(String[] args)
	{
		Rank highCard, faceCard, card1, card2;

		highCard = Rank.ace;
		faceCard = Rank.king;
		card1 = Rank.eight;
		card2 = Rank.five;

		int card1Val = card1.ordinal() + 1;
		int card2Val = card2.ordinal() + 1;

		System.out.println("A BlackJack hand: " + highCard + " and " + faceCard);
		System.out.println("A two card hand: " + card1Val + ", " + card2Val);
		System.out.println("The value of the two card hand: " + (card1Val + card2Val));

	}

}
//Made by Tanuj Gaikwad