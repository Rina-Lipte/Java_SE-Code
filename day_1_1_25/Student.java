package day_1_1_25;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public static Student getStudentObject()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id:");
		int id=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter the Fees:");
		Double fees=sc.nextDouble();
		Date d = new Date();
		return new Student(id,name,fees,d);		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
	
	

}
