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
  
  public void setTestSCores(int testNum, int testGrade)
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
    switch(testNum)
    {
      case 1:
        return testScore1;
        break;
        
      case 2:
        return testScore2;
        break;
        
      case 3:
        return testScore3;
        break;
    }
  }
  
  public int computeAverage()
  {
    average = ((testScore1 + testScore2 + testScore3)/3);
    
    return average;
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
  }
}
