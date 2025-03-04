package day_27_12;

public class EmployeeTester 
{
	public static void main(String[] args) 
	{
		Manager m=new Manager("XYZ", 101, 20000,ManagerType.HR);
		m.setSalary(20000);
		System.out.println("Manager:"+m.getName()+", Salary: "+m.getSalary());
		
		Clerk c=new Clerk("XYZ", 101, 20000, 85, 90);
		System.out.println("Clerk: "+c.getName()+", salary: "+c.getSalary());
		c.setSpeed(85);
		c.setAccuracy(90);
		System.out.println("Clerk: "+c.getName()+", Salary(After updating):"+c.getSalary());
		
	
		
		

	}
}
