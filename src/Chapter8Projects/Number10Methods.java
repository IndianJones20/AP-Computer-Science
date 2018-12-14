package Chapter8Projects;

import java.util.Scanner;

import Chapter7Projects.Complexity;

public class Number10Methods implements Complexity
{
	private String question, answer, userAnswer;
	private int complexityLevel;
	private double index = 0, score = 0;
	private Scanner scan = new Scanner(System.in);

	private String[] quizQs = new String[25];
	private String[] quizAs = new String[25];

	public Number10Methods()
	{

	}

	public void addQuestion(String askQuestion, String Answer)
	{
		question = askQuestion;
		answer = Answer;
		quizQs[(int) index] = question;
		quizAs[(int) index] = answer;
		index++;
	}

	public void setComplexity(int level)
	{
		complexityLevel = level;
	}

	// -----------------------------------------------------------------
	// Returns the complexity level for this question.
	// -----------------------------------------------------------------
	public int getComplexity()
	{
		return complexityLevel;
	}

	// -----------------------------------------------------------------
	// Returns the question.
	// -----------------------------------------------------------------
	public String getQuestion()
	{
		return question;
	}

	// -----------------------------------------------------------------
	// Returns the answer to this question.
	// -----------------------------------------------------------------
	public String getAnswer()
	{
		return quizAs[(int) index];
	}

	// -----------------------------------------------------------------
	// Returns true if the candidate answer matches the answer.
	// -----------------------------------------------------------------
	public boolean answerCorrect(String candidateAnswer)
	{
		return quizAs[(int) index].equalsIgnoreCase(candidateAnswer);
	}

	// -----------------------------------------------------------------
	// Returns this question (and its answer) as a string.
	// -----------------------------------------------------------------
	public String toString()
	{
		return question + "\n" + answer;
	}

	public String giveQuiz()
	{
		double finalScore;
		index = 0;
		while ((int) index < quizQs.length - 1 && quizQs[(int) index] != null)
		{
			System.out.println(quizQs[(int) index]);
			userAnswer = scan.nextLine();
			if (answerCorrect(userAnswer))
			{
				score++;
				System.out.println("Correct");
			}

			else
			{
				System.out.println("Incorrect, Correct Answer is: " + getAnswer());
			}

			System.out.println();
			index++;
		}

		finalScore = (score / (index)) * 100;

		return "Quiz Finished, Grade: " + finalScore + "% Correct";
	}
}
