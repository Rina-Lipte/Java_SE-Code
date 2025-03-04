package day_24_10_prog2;

public class ArtsStudent extends Student
{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	public ArtsStudent(String name, int rollnu, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollnu);
		if(historyMarks<=0 || geographyMarks<=0 || englishMarks<=0)
		{
			System.err.println("Error Invalid Input");
			return;
		}
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}

	@Override
	public void displayDetails() {
		if(historyMarks>0 && geographyMarks>0 && englishMarks>0)
		{
		super.displayDetails();
		System.out.println("History Marks: "+historyMarks);
		System.out.println("Geography Marks: "+geographyMarks);
		System.out.println("English Marks: "+englishMarks);
		}
	}

	@Override
	public double calculatePercentage() {
		if(historyMarks>0 && geographyMarks>0 && englishMarks>0)
		{
			double per=(historyMarks+geographyMarks+englishMarks)/3.0;
			System.out.println("Percentage: "+per);
			return super.calculatePercentage();
		}
		return 0.0;
	}
	
	
	

}
