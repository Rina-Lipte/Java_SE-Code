package day_19_11;

public class Quiz extends CourseContent
{
	private int numberOfQuestions;

	public Quiz(String title, int numberOfQuestions) {
		super(title);
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	
	

}
