package SecondVersionChapter7Labs;

public class MiniQuiz
{
	// --------------------------------------------------------------
	// Presents a short quiz.
	// --------------------------------------------------------------
	public static void main(String[] args)
	{
		Question q1, q2;

		q1 = new Question();
		q2 = new Question();

		q1.setComplexity(4);
		q2.setComplexity(10);

		q1.askQuestion("What is the capital of Jamaica", "Kingston");
		q2.askQuestion("What is worse, Ignorance or Apathy", "I don't know and I don't care");
	}
}