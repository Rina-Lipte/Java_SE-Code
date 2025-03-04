package day_25_10;

public class Animal 
{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void displayDetails()
	{
		System.out.println("Name Of Aniaml: "+name);
	}
	
	
	

}
