package day_25_11;

public class NotifierTest 
{
	public static void main(String[] args)
	{
		UserNotify user1=new UserNotify("alice", "alice@example.com");
		UserNotify user2=new UserNotify("Bob","bob@example.com");
		
		EmailNotifier en=new EmailNotifier();
		en.notifyUser(user1,user2);
	
	}

}
