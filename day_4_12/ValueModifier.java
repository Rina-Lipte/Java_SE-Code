package day_4_12;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{
	public static void modifyValue(int value,Consumer<Integer> cons)
	{
		cons.accept(value);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int value=sc.nextInt();
		
		Consumer<Integer> doubleValue=(value1)-> System.out.println("After doubling the value: "+value1*2);
		modifyValue(value, doubleValue);
		
		Consumer<Integer> incrementBy=(value1)-> 
		{
			int iResult=(value1+3);
			System.out.println("After incrementing the value by 3: "+iResult);
		};
		modifyValue(value, incrementBy);
		
		Consumer<Integer> squareValue=(iResult)-> System.out.println("After squaring the value: "+(iResult*iResult));
		int incr=value+3;
		modifyValue(incr, squareValue);
	}

}
