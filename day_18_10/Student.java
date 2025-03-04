package day_18_10;

public class Student {
	
	private String name;
	private int Id;
	private String course;
	private double fee;
	private char grade;
	private double average;
	
	public Student(String name, int id, String course, double fee) {
		super();
		this.name = name;
		Id = id;
		this.course = course;
		this.fee = fee;
		//this.grade = grade;
		//this.average = average;
	}
	public Student()
	{
		System.out.println("Non Parameterize constructor");
	}
	public Student(Student OtherStu)
	{
		this();
		this.name=OtherStu.name;
		this.course=OtherStu.course;
		this.fee=OtherStu.fee;
		
		
	}
	
	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", course=" + course + ", fee=" + fee + 
				 ", average=" + average + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public String getCourse() {
		return course;
	}

	public double getFee() {
		return fee;
	}

	

	public char calculateGrade()
	{
		if(average>=90)
		{
			grade='A';
		}
		else if(average>=80)
		{
			grade='B';
		}
		else if(average>=70)
		{
			grade='C';
		}
		else if(average>=60)
		{
			grade='D';
			
		}
		else
		{
			grade='F';
		}
		return grade;
	}
	

}
