package Chapter9Projects;

public class Number5
{

	public static void main(String[] args)
	{
		Number5America murica1 = new Number5America();

		System.out.println(murica1);

		System.out.println(murica1.getAvgAge());
		System.out.println(murica1.getAvgIncome());
		System.out.println(murica1.getPop());

		Number5Germany german1 = new Number5Germany();

		System.out.println(german1);

		System.out.println(german1.getAvgAge());
		System.out.println(german1.getPop());
		System.out.println(german1.getNationality());

	}

}
