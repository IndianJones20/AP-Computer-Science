package Chapter8Projects;

public class Number10
{
	public static void main(String[] args)
	{
		Number10Methods quiz1 = new Number10Methods();

		quiz1.addQuestion("What is the capital of jamaica?", "Kingston");
		quiz1.addQuestion("What's 9+10", "19");
		quiz1.addQuestion("What's my first name?", "Tanuj");
		quiz1.addQuestion("What is the worlds fastest dog?", "Greyhound");
		quiz1.addQuestion("What day is the Super Bowl always played on?", "Sunday");
		quiz1.addQuestion("What is the study of space called?", "Astronomy");
		quiz1.addQuestion("From what language did English borrow the word \"bangle\"?", "Hindi");
		quiz1.addQuestion("What is the study of insects called?", "Entomology");
		quiz1.addQuestion("What's the main ingredient in glass?", "Silica");
		quiz1.addQuestion("What US president was nicknamed \"Honest Abe\"?", "Abraham Lincoln");
		quiz1.addQuestion("What is the correct term for a group of whales?", "Pod");
		quiz1.addQuestion("What number is indicated by the Roman numeral \"D\"?", "500");
		quiz1.addQuestion("What element's chemical symbol are the letters \"Na\"?", "Sodium");
		quiz1.addQuestion("How many players are there in a standard soccer team?", "11");

		System.out.println(quiz1.giveQuiz());
	}
}
