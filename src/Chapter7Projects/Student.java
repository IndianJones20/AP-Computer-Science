package Chapter7Projects;

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int testScore1,  testScore2,  testScore3, average;

	public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
	}

	public void setTestScore(int testNum, int testGrade)
	{
		switch(testNum)
		{
		case 1:
			testScore1 = testGrade;
			break;
		case 2:

			testScore2 = testGrade;
			break;

		case 3:  
			testScore3 = testGrade;        
			break;
		}
	}

	public int getTestScore(int testNum)
	{
		if(testNum == 1)
			return testScore1;
		
		else if (testNum == 2)
			return testScore2;
		
		else
			return testScore3;
	}

	public int computeAverage()
	{
		average = ((testScore1 + testScore2 + testScore3)/3);

		return average;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}

	public String toString()
	{
		String result;

		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";

		result += "Test Score 1: " + testScore1 + "\n";
		result += "Test Score 2: " + testScore2 + "\n";
		result += "Test Score 3: " + testScore3 + "\n\n";

		result += "Average Grade: " + average;

		return result;
	}
}