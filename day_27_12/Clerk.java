package day_27_12;

public class Clerk extends Employee
{
	private int speed;
	private int accuracy;
	
	

	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
		setSalary();
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
		setSalary();
	}



	public int getAccuracy() {
		return accuracy;
	}



	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		setSalary();
	}



	


	int count;
	public void setSalary() 
	{
		if(speed>70 && accuracy>80)
		{
			
			count++;
			if(count==1)
			{
				System.out.println("Got Bonus");
				super.setSalary(super.getSalary()+1000); 
			}
			else
			{
				System.out.println("You got already bouns.");
				return;
			}
		}
		else
		{
			super.setSalary(super.getSalary());
		}
		
	}
	
	

}
