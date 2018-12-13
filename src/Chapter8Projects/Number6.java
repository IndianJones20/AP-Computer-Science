package Chapter8Projects;

public class Number6
{
	public static void main(String[] args)
	{
		Employee[][] LLemployees = new Employee[5][6];

		Employee employ = null;

		for (int row = 0; row < LLemployees.length; row++)
		{
			for (int col = 0; col < LLemployees[row].length; col++)
			{
				employ = new Employee(100);
				LLemployees[row][col] = employ;
			}
		}

		for (int row = 0; row < LLemployees.length; row++)
		{
			for (int col = 0; col < LLemployees[row].length; col++)
			{
				System.out.println(LLemployees[row][col]);
			}
		}
	}
}
