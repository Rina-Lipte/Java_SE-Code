package day_2_1_25;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Directory d=new Directory();
		Employee emp1=new Employee("Alice", "Manager", 224325);
		Employee emp2=new Employee("Bob","Developer",50000);
		d.addEmployee(emp1);
		d.addEmployee(emp2);
		d.deleteEmployee(1);
		d.updateEmployee(0,"Senior Developer" );
		d.displayAllEmployees();

	}

}
