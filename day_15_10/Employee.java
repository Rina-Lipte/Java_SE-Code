package day_15_10;

public class Employee {
	String name;
	int age;
	String department;
	double salary;
	String performance;
	public Employee(String name,int age,String department,double salary,String performance)
	{
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary=salary;
		this.performance=performance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	public double updateSalary()
	{
		if(performance=="Good")
		{
			return salary=salary+10000;
		}
		else if(performance=="Average")
		{
			return salary=salary+5000;
		}
		else
		{
			return salary;
		}
	}
	@Override
	public String toString() 
	{
		if(age<=0)
		{
			return "Invalid age";
		}
		else
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
				+ ", performance=" + performance + "]";
	}

	
}
