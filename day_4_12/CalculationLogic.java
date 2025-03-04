package day_4_12;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic 
{
	public static boolean testPredicate(int num,Predicate<Integer> pre)
	{
		return pre.test(num);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		
		Predicate<Integer> isEven=(num1)->num%2==0;
		System.out.println(" "+num+" is Even :"+testPredicate(num, isEven));
		
		Predicate<Integer> isGreaterThanTen=(num1)->(num1>10);
		System.out.println(" "+num+" is greater than 10 : "+testPredicate(num, isGreaterThanTen));
		
		Predicate<Integer> isPrime=(num1)->
		{
			int count=0;
			for(int i=1;i<=num1;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2) 
				return true;
			else
				return false;
			
		};
		System.out.println(" "+num+" is prime: "+testPredicate(num, isPrime));
		
		

	}

}
