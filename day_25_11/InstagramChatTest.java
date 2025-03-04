package day_25_11;

public class InstagramChatTest {

	public static void main(String[] args) {
		InstagramUser iuser=new InstagramUser("alice");
		User genericUser=new User("Bob");
		InstagramChat ichat=new InstagramChat();
		
		ichat.sendMessage(iuser);
		
		ichat.sendMessage(genericUser);
		
		iuser.sendDirectMessage("Hello, this is Alice!");

	}

}
