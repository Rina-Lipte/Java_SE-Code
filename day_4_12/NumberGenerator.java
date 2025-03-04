package day_4_12;

import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator 
{
	public static int generateRandomNumber(int min,int max,Supplier<Integer> sup)
	{
		
		return sup.get();
		
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter minimum number: ");
		int min=sc.nextInt();
		System.out.print("Enter maximum number: ");
		int max=sc.nextInt();
		
		Supplier<Integer> grn=()->
		{
			
			int rvalue=0;
			while(true)
			{
				int num=(int)(Math.random()*max);
				if(num>=min && num<=max)
				{
					rvalue=num;
					break;
				}
				
			}
			return rvalue;
			
		};
		System.out.println("Random number generated: "+generateRandomNumber(min, max, grn));

	}

}
