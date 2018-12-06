package Chapter7Projects;

public class CourseDriver
{
	public static void main(String[] args)
	{
		Course APCompSci = new Course("AP Computer Science");

		Address tanujHome = new Address("60-59 Pelican Crest Drive", "Newport Beach", "CA", 92657);
		Address tanujSchool = new Address("Hollywood", "Los Angeles", "CA", 90068);
		Student tanuj = new Student("Tanuj", "Gaikwad", tanujHome, tanujSchool);
		APCompSci.addStudent(tanuj);

		tanuj.setTestScore(1, 90);
		tanuj.setTestScore(2, 90);
		tanuj.setTestScore(3, 90);

		Address joshHome = new Address("Somewhere", "Someplace", "PA", 19342);
		Address joshSchool = new Address("552 Smithbridge rd", "Glen Mills", "PA", 19342);
		Student josh = new Student("Josh", "Kenna", joshHome, joshSchool);
		APCompSci.addStudent(josh);

		josh.setTestScore(1, 90);
		josh.setTestScore(2, 90);
		josh.setTestScore(3, 90);

		System.out.println(APCompSci.roll());

		System.out.println(APCompSci.average());
	}
}
