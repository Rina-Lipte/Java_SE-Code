package day_24_10_prog2;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	public ScienceStudent(String name, int rollnu, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollnu);
		if(physicsMarks<=0 || chemistryMarks<=0 || mathMarks<=0)
		{
			System.err.println("Error Invalid Input");
			return;
		}
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}

	@Override
	public double calculatePercentage() {
		if(physicsMarks>0 && chemistryMarks>0 && mathMarks>0)
		{
		double per = (physicsMarks+chemistryMarks+mathMarks)/3.0;
		System.out.println("Percentage: "+per);
		return super.calculatePercentage();
		}
		return 0.0;
	}

	@Override
	public void displayDetails() {
		if(physicsMarks>0 && chemistryMarks>0 && mathMarks>0)
		{
		super.displayDetails();
		System.out.println("Physics Marks: "+physicsMarks);
		System.out.println("Chemistry Marks: "+chemistryMarks);
		System.out.println("Math Marks: "+mathMarks);
		}
	}
	
	
	

}
