package Chapter7Projects;

public class Number2
{
  public static void main(String[] args)
  {
    Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
    Address jhome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
    
    Student john = new Student("John", "Smith", jhome, school);
    
    Address mhome = new Address("123 Main Street", "Euclid", "OH", 44132);
    
    Student marsha = new Student("Marsha", "Jones", mhome, school);
    
    john.setTestScore(1, 95);
    john.setTestScore(2, 82);
    john.setTestScore(3, 94);
    
    
    marsha.setTestScore(1, 78);
    marsha.setTestScore(2, 87);
    marsha.setTestScore(3, 91);
    
    john.computeAverage();
    marsha.computeAverage();
    
    Ssytem.out.println(john);
    System.out.println();
    System.out.println(marsha);
  }
}
