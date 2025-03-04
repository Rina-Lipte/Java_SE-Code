package day_3_12;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		Function<String,Integer> getStringLength=(str1)-> str1.length();
		
		
		System.out.println("String length of "+str+": "+getStringLength.apply(str));
			
		Function<Integer,Double> divideAndFormat=(num1)-> (num1/2.0);
		System.out.println("Result after dividing "+num+" by 2: "+divideAndFormat.apply(num));
		

	}

}
