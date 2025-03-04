package day_2_10;
import java.util.*;
public class EvenOrOdd {
	public static boolean isEven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("The given number is Even the result is True otherwise False.");
		if(num%2==0)
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}

}
