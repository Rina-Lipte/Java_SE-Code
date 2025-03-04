package day_27_12;

public class Manager extends Employee
{
	private ManagerType type;
	

	


	public Manager(String name, int employeeId, double salary, ManagerType type) {
		super(name, employeeId, salary);
		this.type = type;
		setSalary(salary);
	}


	public ManagerType getType() {
		return type;
	}


	public void setType(ManagerType type) {
		this.type = type;
		setSalary(getSalary());
	}


	@Override
	public void setSalary(double salary) 
	{
		if(this.type==ManagerType.HR)
		{
			salary+=10000;
		}
		else if(this.type==ManagerType.Sales)
		{
			salary+=5000;
		}
		
			super.setSalary(salary);
		
		
	}
	
	

}
