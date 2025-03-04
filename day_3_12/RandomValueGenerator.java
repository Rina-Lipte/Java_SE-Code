package day_3_12;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGenerator {

	public static void main(String[] args) 
	{
		Supplier<String> stringSupplier=()->
		{
			return "NIT"+(int)(Math.random()*10000);
		};
		
		Supplier<Integer> is = ()->
		{				
				int min=1;
				
				int max=400;
				int rvalue=0;
				while(true)
				{
					int n = (int)(Math.random()*max);
					if(n>=min && n<=max)
					{
						rvalue = n;break;
					}
				}
				return rvalue;
			
		};
		
		System.out.println(stringSupplier.get());
		System.out.println(is.get());
		System.out.println(stringSupplier.get());
		
		

	}

}
