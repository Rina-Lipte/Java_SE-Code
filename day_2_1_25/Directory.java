package day_2_1_25;

import java.util.ArrayList;

public class Directory 
{
	
	
	ArrayList<Employee> list=new ArrayList<>();
	
	
	public  void addEmployee(Employee e)
	{
		list.add(e);
	}
	public void displayAllEmployees()
	{
		for(Employee e1:list)
		{
			System.out.println(e1);
		}
	}
	public void updateEmployee(int index,String position)
	{
	   Employee employee = list.get(index);
	   //employee.setSalary(salary);
	   employee.setPosition(position);
	}
	public void deleteEmployee(int index)
	{
		list.remove(index);
		
		
	}
	

}
