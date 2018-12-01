package Chapter7Projects;

public class TaskDriver 
{
	public static void main(String[] args)
	{
		Task groceries, laundry, school, dishes, homework;

		groceries = new Task("groceries");
		laundry = new Task("laundry");
		school = new Task("school");
		dishes = new Task("dishes");
		homework = new Task("homework");
		
		homework.setComplexity(5);
		school.setComplexity(4);
		dishes.setComplexity(3);
		laundry.setComplexity(2);
		groceries.setComplexity(1);
	}
}
