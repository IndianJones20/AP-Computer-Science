package Chapter8Projects;

public class Number10
{
	public static void main(String[] args)
	{
		Number10Methods quiz1 = new Number10Methods();
		quiz1.addQuestion("What is the capital of jamaica?", "Kingston", 2);
		quiz1.addQuestion("What's 9+10", "19", 10);
		quiz1.addQuestion("What's the name of this course? (Full name)", "AP Computer Science", 4);
		quiz1.addQuestion("What is the worlds fastest dog?", "Greyhound", 1);
		quiz1.addQuestion("What day is the Super Bowl always played on?", "Sunday", 1);
		quiz1.addQuestion("What is the study of space called?", "Astronomy", 1);
		quiz1.addQuestion("From what language did English borrow the word \"bangle\"?", "Hindi", 5);
		quiz1.addQuestion("What is the study of insects called?", "Entomology", 3);
		quiz1.addQuestion("What's the main ingredient in glass?", "Silica", 7);
		quiz1.addQuestion("What US president was nicknamed \"Honest Abe\"?", "Abraham Lincoln", 1);
		quiz1.addQuestion("What is the correct term for a group of whales?", "Pod", 7);
		quiz1.addQuestion("What number is indicated by the Roman numeral \"D\"?", "500", 3);
		quiz1.addQuestion("What element's chemical symbol are the letters \"Na\"?", "Sodium", 10);
		quiz1.addQuestion("How many players are there in a standard soccer team?", "11", 10);

		System.out.println(quiz1.giveQuiz());
	}
}
