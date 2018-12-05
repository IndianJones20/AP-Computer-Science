package SecondVersionChapter7Labs;

import java.util.Scanner;

import Chapter7Projects.Complexity;

public class Question implements Complexity
{
	private String question, answer, userAnswer;
	private int complexityLevel;
	Scanner scan = new Scanner(System.in);

	// --------------------------------------------------------------
	// Sets up the question with a default complexity.
	// --------------------------------------------------------------
	public Question()
	{
		complexityLevel = 1;
	}

	public void askQuestion(String askQuestion, String Answer)
	{
		question = askQuestion;
		answer = Answer;

		System.out.println(question);
		System.out.println();
		System.out.println(" (Level: " + this.getComplexity() + ")");
		System.out.println();
		System.out.print("Your Response: ");
		userAnswer = scan.nextLine();

		if (userAnswer.equalsIgnoreCase(Answer))
		{
			System.out.println("Correct");
		}

		else
		{
			System.out.println("No, The answer is " + answer);
		}

	}

	// --------------------------------------------------------------
	// Sets the complexity level for this question.
	// --------------------------------------------------------------
	public void setComplexity(int level)
	{
		complexityLevel = level;
	}

	// --------------------------------------------------------------
	// Returns the complexity level for this question.
	// --------------------------------------------------------------
	public int getComplexity()
	{
		return complexityLevel;
	}

	// --------------------------------------------------------------
	// Returns the question.
	// --------------------------------------------------------------
	public String getQuestion()
	{
		return question;
	}

	// --------------------------------------------------------------
	// Returns the answer to this question.
	// --------------------------------------------------------------
	public String getAnswer()
	{
		return answer;
	}

	// --------------------------------------------------------------
	// Returns true if the candidate answer matches the answer.
	// --------------------------------------------------------------
	public boolean answerCorrect(String candidateAnswer)
	{
		return answer.equals(candidateAnswer);
	}

	// --------------------------------------------------------------
	// Returns this question (and its answer) as a string.
	// --------------------------------------------------------------
	public String toString()
	{
		return question + "\n" + answer;
	}
}