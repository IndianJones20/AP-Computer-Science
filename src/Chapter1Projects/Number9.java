package Chapter1Projects;

public class Number9 
{
	public static String padRight(String s, int n) {
	     return String.format("%05$-" + n + "s", s);  
	}

	public static void main(String[] args)
	{
		int cntStar = 1;
		int cntSpace = 4;
		
		for(int j=0; j<5; j++)
		{
			for(int i=0; i<=cntSpace; i++)
			{
				System.out.print(" ");
			}
			
			for(int i=1; i<=cntStar; i++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
			cntSpace--;
			cntStar+=2;
		}
		
		cntSpace = 1;
		cntStar = 7;
		
		for(int j=0; j<4; j++)
		{
			for(int i=0; i<=cntSpace; i++)
			{
				System.out.print(" ");
			}
			
			for(int i=1; i<=cntStar; i++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
			cntSpace++;
			cntStar-=2;
		}
		
	}

}

//Made by Tanuj Gaikwad