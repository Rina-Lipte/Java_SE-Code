package day_21_9;

public class Palindrome {

	public static void main(String[] args) {
		int n=101;
		int m=n;
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(m==rev) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The give number is not a palindrome");
		}
		

	}

}
