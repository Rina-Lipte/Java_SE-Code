package day_24_10_prog2;

public class Student {
	protected String name;
	protected int rollnu;
	//private int physicsMarks;
	//private int chemistryMarks;
	//private int mathMarks;
	
	public Student(String name, int rollnu) {
		super();
		if(rollnu<=0)
		{
			System.err.println("Error Invalid Input");
			return;
		}
		this.name = name;
		this.rollnu = rollnu;
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("RollNu :"+rollnu);
	}
	
	public double calculatePercentage()
	{
		return 0.0;
	}

	
}
