package day_2_10;
import java.util.*;
public class CalculateBLC {
	public static void checkSpyNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0,mul=1;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			mul=mul*digit;
			num=num/10;
			
		}
		if(sum==mul)
		{
			System.out.println("The given number is Spy number");
		}
		else
		{
			System.out.println("The given number is not a Spy number");
		}
				
				
	}

}
