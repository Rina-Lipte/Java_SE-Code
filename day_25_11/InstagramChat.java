package day_25_11;

public class InstagramChat implements Messanger{

	@Override
	public void sendMessage(User user) {
		if (user instanceof InstagramUser) {
            System.out.println("Sending message to Instagram user: " + user.getname());
            user.displayMessage("This is an Instagram chat message.");
        } else {
            System.err.println("Error: User is not an Instagram user.");
        }
		
	}

	

}
