package day_3_12;

import java.util.function.Predicate;

public class NumberTester {

	public static void main(String[] args) {
		Predicate<Integer> isEven=(num)-> 
		{
			if(num%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}	
		};
		
		Predicate<Integer> isPrime=(num1)->
		{
			int count=0;
			for(int i=1;i<=num1;i++)
			{
				if(num1%i==0)
				count++;
			}
			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		System.out.println("The number is prime? "+isPrime.test(13));
		System.out.println("The number is Even ? "+isEven.test(13));

	}

}
