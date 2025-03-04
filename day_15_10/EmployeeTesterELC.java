package day_15_10;

public class EmployeeTesterELC {

	public static void main(String[] args) {
		Employee e1=new Employee("xyz",23,"Testing",30000.0,"Average");
		e1.updateSalary();
		System.out.println(e1);
		
		Employee e2=new Employee("abc",45,"Developer",40000.0,"Good");
		e2.updateSalary();
		System.out.println(e2);
		
	  e2=new Employee("jhg",-45,"Developer",40000.0,"Good");
		e2.updateSalary();
		System.out.println(e2);
		
		

	}

}
