package day_23_10Inheritance;

public class Student 
{
	int studentId;
	String name;
	double examFee;
	
	
	
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public String displayDetails()
	{
		return "Student[ name=" + name + ", studentId=" + studentId + ", examFee="
				+ examFee + "]";
	}
	
	public double payfee(double examFee)
	{
		
		
		return examFee;
		
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	
	
	
	

}
