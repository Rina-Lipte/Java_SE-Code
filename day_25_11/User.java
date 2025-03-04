package day_25_11;

public class User  {

	private String name;
	
	
	public User(String name) {
		super();
		this.name = name;
	}

public void displayMessage(String message)
{
	System.out.println(name+ " :"+message);
}
	public String getname()
	{
		return name;
	}
}
