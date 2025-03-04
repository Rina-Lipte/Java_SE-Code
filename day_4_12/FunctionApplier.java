package day_4_12;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{
	public static int applyFunction(int value, Function<Integer,Integer> fun)
	{
		return fun.apply(value);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int value=sc.nextInt();
		
		Function<Integer,Integer> add=(num)->(num+5);
		System.out.println("After adding 5: "+applyFunction(value, add));
		
		Function<Integer, Integer> multiply=(num)->(num*2);
		System.out.println("After multiplying by 2: "+applyFunction(value, multiply));

		Function<Integer,Integer> subtract=(num)->(num-3);
		System.out.println("After subtracting 3: "+applyFunction(value, subtract));
	}

}
