package Chapter8Projects;

import java.text.DecimalFormat;
import java.util.Scanner;

import Chapter7Projects.Complexity;

public class Number10Methods implements Complexity
{
	private String question, answer, userAnswer;
	private int complexityLevel, complexRangeA, complexRangeB;
	private double index = 0, score = 0, indexCounter = 0;
	private Scanner scan = new Scanner(System.in);

	private String[] quizQs = new String[25];
	private String[] quizAs = new String[25];
	private int[] qComplexities = new int[25];

	DecimalFormat fmt = new DecimalFormat("0.##");

	public Number10Methods()
	{

	}

	public void addQuestion(String askQuestion, String Answer, int complexLevel)
	{
		question = askQuestion;
		answer = Answer;
		complexityLevel = complexLevel;
		quizQs[(int) index] = question;
		quizAs[(int) index] = answer;
		qComplexities[(int) index] = complexityLevel;
		index++;
	}

	public void setComplexity(int level)
	{
		complexityLevel = level;
	}

	public int getComplexity()
	{
		return complexityLevel;
	}

	public String getQuestion()
	{
		return question;
	}

	public String getAnswer()
	{
		return quizAs[(int) index];
	}

	public boolean answerCorrect(String candidateAnswer)
	{
		return quizAs[(int) index].equalsIgnoreCase(candidateAnswer);
	}

	public String toString()
	{
		return question + "\n" + answer;
	}

	private void complexityRange()
	{
		System.out.println("What would you like your complexity range to be (please enter a valid range): ");
		System.out.print("Low End: ");
		complexRangeA = scan.nextInt();

		System.out.print("High End: ");
		complexRangeB = scan.nextInt();

		if (complexRangeA > complexRangeB)
			complexityRange();
	}

	public String giveQuiz()
	{
		double finalScore;
		index = 0;

		complexityRange();

		/*
		 * while the index is less that the questions array as well as the index is
		 * something other that null, print out the question, get the user answer, check
		 * if the user answer is correct and add the score accordingly. At the end, it
		 * calculates the final score and prints it out as a double percent.
		 * 
		 * UPDATE: Now it asks for the complexity range beforehand and
		 */

		Scanner scan2 = new Scanner(System.in);

		while ((int) index < quizQs.length - 1 && quizQs[(int) index] != null)
		{
			if (qComplexities[(int) index] >= complexRangeA && qComplexities[(int) index] <= complexRangeB)
			{
				System.out.println(quizQs[(int) index] + "\tComplexity Level: " + qComplexities[(int) index]);
				userAnswer = scan2.nextLine();
				if (answerCorrect(userAnswer))
				{
					score++;
					indexCounter++;
					System.out.println("Correct");
				}

				else
				{
					indexCounter++;
					System.out.println("Incorrect, Correct Answer is: " + getAnswer());
				}
				System.out.println();
			}
			index++;
		}

		finalScore = (score / (indexCounter)) * 100;

		return "Quiz Finished, Grade: " + fmt.format(finalScore) + "% Correct";
	}
}
