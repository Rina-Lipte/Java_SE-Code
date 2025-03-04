package day_4_10;
import java.util.*;
public class EmployeeOOP 
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee id: ");
		employeeId=sc.nextInt();
		System.out.print("Enter Employee Name: ");
		employeeName=sc.next();
		System.out.print("Enter the salary of Employee: ");
		employeeSalary=sc.nextDouble();
	}
	
	public void getEmployeeData()
	{
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Salary: "+employeeSalary);
	}

}
