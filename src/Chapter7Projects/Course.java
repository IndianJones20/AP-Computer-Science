package Chapter7Projects;

import java.util.*;

public class Course
{
	ArrayList<Student> studentsTakingCourse = new ArrayList<Student>();
	private String course;
	public Course(String courseName)
	{
		course = courseName;
	}


	public void addStudent(Student student)
	{
		studentsTakingCourse.add(student);
	}

	public int average()
	{
		int average = 0;
		for(int i = 0; i<studentsTakingCourse.size(); i++)
		{
			average += studentsTakingCourse.get(i).computeAverage();	
		}
		
		return average;
	}

	public String roll()
	{
		String names = "";

		for(int i = 0; i<studentsTakingCourse.size(); i++)
		{
			names += studentsTakingCourse.get(i).getName();
			names += "\n" ;
		}
		
		return names;
	}

}