package Chapter4Lab;

public class Grades
{

	public static void main(String[] args)
	{
		Student student1 = new Student("Mary");
		Student student2 = new Student("Mike");

		student1.inputGrades();
		System.out.println("Student 1: " + student1);

		student2.inputGrades();
		System.out.println("Student 2: " + student2);
	}

}
//Made by Tanuj Gaikwad