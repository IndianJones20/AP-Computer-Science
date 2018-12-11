package Chapter8Projects;

public class Number5
{
	public static void main(String[] args)
	{
		Number5Methods yo = new Number5Methods(91, 61, 4, 60, 91, 11, 37, 1, 75, 66, 3, 77, 38, 5, 83, 57, 90, 66, 27,
				95, 9, 48);

		System.out.println(yo.calcMean());
		System.out.println(yo.calcSD());
	}
}
