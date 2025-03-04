package day_18_11;

public class HospitalStaff 
{
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	public void work()
	{
		System.out.println("role is "+role+" name is "+name);
	}
	
	

}
