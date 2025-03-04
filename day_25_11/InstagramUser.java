package day_25_11;

public class InstagramUser extends User
{

	public InstagramUser(String name) {
		super(name);
		
	}
	
	public void sendDirectMessage(String message)
	{
		System.out.println("Direct Message sent from Instagram user :"+getname());
		System.out.println("Message: "+message);
	}

}
