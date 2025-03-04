package day_4_10;
import java.util.*;
public class StudentBLcOOP 
{
	int sid;
	String sName;
	double sFees;
	
	public void setStudentData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name");
		sName=sc.next();
		System.out.println("Enter student id: ");
		sid=sc.nextInt();
		System.out.println("Enter Student Fees: ");
		sFees=sc.nextDouble();
	}
 
}
