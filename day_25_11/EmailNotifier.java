package day_25_11;

public class EmailNotifier implements Notifier 
{

	
	private void sendEmail(UserNotify user)
	{
		System.out.println("Sending email to " + user.getName() + " at " + user.getEmail());
	}

	@Override
	public void notifyUser(UserNotify... users) {
		for(UserNotify value:users)
		{
			if (value != null) {
                sendEmail(value);
            }
			
		}
		
	}
	

}
